package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Cars;

public class InputView {
	public static Cars inputRacingCarName() {
		return new Cars(input());
	}

	private static String input() {
		return Console.readLine();
	}
}
