package twelve;

class BaseballException extends Exception {
};

class Foul extends BaseballException {
};

class Strike extends BaseballException {
};

abstract class Inning {
	public Inning() throws BaseballException {
	};

	public void event() throws BaseballException {
	};

	public abstract void atBat() throws Strike, Foul;

	public void walk() {
	}
}

class StormException extends Exception {
}

class RainedOut extends Exception {
}

class PopFoul extends Foul {
}

interface Storm {
	public void event() throws RainedOut;

	public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {
	public StormyInning(String s) throws Foul, BaseballException {
	}

	public StormyInning() throws RainedOut, BaseballException {
	}

	@Override
	public void atBat() throws PopFoul {

	}

	@Override
	public void event() {
	}

	@Override
	public void rainHard() throws RainedOut {
	}

	public static void main(String[] args) {
		try {
			StormyInning si = new StormyInning();
			si.atBat();
		} catch (PopFoul e) {
			System.out.println("PopFoul");
		} catch (RainedOut e) {
			System.out.println("RainedOut");
		} catch (BaseballException e) {
			System.out.println("Generik Baseball Exception");
		}

		try {
			Inning i = new StormyInning();
			i.atBat();
		} catch (Strike e) {
			System.out.println("Strike");
		} catch (Foul e) {
			System.out.println("Foul");
		} catch (RainedOut e) {
			System.out.println("RainedOut");
		} catch (BaseballException e) {
			System.out.println("����� ����������");
		}
	}
}
