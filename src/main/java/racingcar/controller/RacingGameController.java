package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.domain.RacingGame;
import racingcar.domain.Round;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingGameController {

	public void run() {
		Cars racingCars = getRacingCars();
		Round round = getRound();
		playGame(racingCars, round);
	}

	private void playGame(Cars racingCars, Round round) {
		RacingGame racingGame = getRacingGame(racingCars, round);
		OutputView.printPlayGame();
		while (racingGame.hasMoreRound()) {
			racingGame.status();
			racingGame.decreaseRound();
		}
	}

	private RacingGame getRacingGame(Cars racingCars, Round round) {
		return new RacingGame(racingCars, round);
	}

	private Round getRound() {
		try {
			OutputView.printInputRound();
			return InputView.inputRound();
		} catch (IllegalArgumentException exception) {
			OutputView.printException(exception);
			return getRound();
		}
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
