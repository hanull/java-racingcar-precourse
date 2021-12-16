package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingGameController {

	public void run() {
		Cars racingCars = getRacingCars();
	}

	private Cars getRacingCars() {
		try {
			OutputView.printInputRacingCarName();
			return InputView.inputRacingCarName();
		} catch (IllegalArgumentException exception) {
			OutputView.printException(exception);
			return getRacingCars();
		}
	}
}
