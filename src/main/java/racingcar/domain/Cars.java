package racingcar.domain;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cars {

	private static final String ERROR_MESSAGE_EMPTY_NAME = "[ERROR] 자동차 이름을 하나 이상 입력해주세요.";
	private static final String ERROR_MESSAGE_DUPLICATE = "[ERROR] 자동차 이름이 중복됩니다.";
	private static final int ZERO = 0;

	private final List<Car> cars;

	public Cars(String carNames) {
		cars = validateAndCreateCars(carNames);
	}

	private List<Car> validateAndCreateCars(String carNames) {
		if (isEmpty(carNames.split(",").length)) {
			throw new IllegalArgumentException(ERROR_MESSAGE_EMPTY_NAME);
		}
		List<Car> carList = Stream.of(carNames.split(","))
			.map(Car::fromCarName)
			.collect(Collectors.toList());
		if (isDuplicateCarName(carList)) {
			throw new IllegalArgumentException(ERROR_MESSAGE_DUPLICATE);
		}
		return carList;
	}

	private static boolean isEmpty(int count) {
		return count == ZERO;
	}

	private boolean isDuplicateCarName(List<Car> carList) {
		return carList.size() != new HashSet<>(carList).size();
	}
}