package racingcar.domain;

import java.util.Objects;

public class Car {

	private static final String ERROR_MESSAGE_EMPTY_NAME = "[ERROR] 빈 자동차 이름이 있습니다. 다시 이름을 입력해주세요.";
	private static final String ERROR_MESSAGE_OVER_LENGTH = "[ERROR] 자동차 이름의 길이는 5자 이하로 작성해주세요.";
	private static final int MAX_LENGTH = 5;

	private final String name;
	private int position = 0;

	public Car(String name) {
		this.name = name;
	}

	public static Car fromCarName(String carName) {
		validateInputCarName(carName.trim());
		return new Car(carName.trim());
	}

	private static void validateInputCarName(String carName) {
		if (isEmptyName(carName)) {
			throw new IllegalArgumentException(ERROR_MESSAGE_EMPTY_NAME);
		}
		if (isOverLength(carName.length())) {
			throw new IllegalArgumentException(ERROR_MESSAGE_OVER_LENGTH);
		}
	}

	private static boolean isOverLength(int length) {
		return length > MAX_LENGTH;
	}

	private static boolean isEmptyName(String carName) {
		return carName.isEmpty();
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Car car = (Car)o;
		return name.equals(car.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
