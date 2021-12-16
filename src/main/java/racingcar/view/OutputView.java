package racingcar.view;

public class OutputView {

	private static final String INPUT_RACING_CAR_NAME = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private static final String INPUT_ROUND = "시도할 회수는 몇회인가요?";
	private static final String INPUT_PLAY_GAME = "실행 결과";

	public static void printInputRacingCarName() {
		System.out.println(INPUT_RACING_CAR_NAME);
	}

	public static void printException(Exception exception) {
		System.out.println(exception.getMessage());
	}

	public static void printInputRound() {
		System.out.println(INPUT_ROUND);
	}

	public static void printPlayGame() {
		printNewLine();
		System.out.println(INPUT_PLAY_GAME);
	}

	private static void printNewLine() {
		System.out.println();
	}

	public static void printCarStatus(StringBuilder currentStatus) {
		System.out.println(currentStatus);
	}
}
