package racingcar.view;

public class OutputView {

	private static final String INPUT_RACING_CAR_NAME = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";

	public static void printInputRacingCarName() {
		System.out.println(INPUT_RACING_CAR_NAME);
	}

	public static void printException(Exception exception) {
		System.out.println(exception.getMessage());
	}
}