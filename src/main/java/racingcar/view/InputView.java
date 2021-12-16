package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Cars;
import racingcar.domain.Round;

public class InputView {
	public static Cars inputRacingCarName() {
		return new Cars(input());
	}

	private static String input() {
		return Console.readLine();
	}

	public static Round inputRound() {
		return new Round(input());
	}
}
