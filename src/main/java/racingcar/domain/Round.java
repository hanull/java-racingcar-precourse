package racingcar.domain;

public class Round {

	private static final String ERROR_MESSAGE_NOT_DIGIT = "[ERROR] 시도할 회수는 숫자로만 입력해주세요.";
	private static final int ZERO = 0;

	private int round;

	public Round(String inputRound) {
		validateInputRound(inputRound);
		this.round = Integer.parseInt(inputRound);
	}

	private void validateInputRound(String inputRound) {
		if (!isDigit(inputRound)) {
			throw new IllegalArgumentException(ERROR_MESSAGE_NOT_DIGIT);
		}
	}

	private boolean isDigit(String inputRound) {
		for (char number : inputRound.toCharArray()) {
			if (!Character.isDigit(number)) {
				return false;
			}
		}
		return true;
	}

	public boolean isMoreRound() {
		return round > ZERO;
	}

	public void decrease() {
		--round;
	}
}
