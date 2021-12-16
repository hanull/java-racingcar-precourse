package racingcar.domain;

public class RacingGame {

	private Cars cars;
	private Round round;

	public RacingGame(Cars cars, Round round) {
		this.cars = cars;
		this.round = round;
	}

	public boolean hasMoreRound() {
		return round.isMoreRound();
	}

	public void status() {
		cars.status();
	}

	public void decreaseRound() {
		round.decrease();
	}

	public void play() {
		cars.goForward();
	}
}
