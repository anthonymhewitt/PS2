package pkgMain;

public class MyInteger {
	int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;

	}

	public int getiValue() {
		return iValue;
	}

	public static boolean isEven(int value) {
		if (value % 2 == 0)
			return true;
		else
			return false;
	}

	public static boolean isOdd(int value) {
		if (value % 2 == 1)
			return true;
		else
			return false;

	}

	public static boolean isPrime(int value) {
		boolean isPrime = true;
		
		for (int i = 2; i < value; i++) {
			if (value % i == 0)
				isPrime = false;
		}
		return isPrime;
	}

	public boolean isEven() {
		return MyInteger.isEven(iValue);
	}

	public boolean isOdd() {
		return MyInteger.isOdd(iValue);

	}

	public boolean isPrime() {
		return MyInteger.isPrime(iValue);
	}

	public static boolean isEven(MyInteger value) {
		return value.isEven();
	}
	public static boolean isOdd(MyInteger value) {
		return value.isOdd();
	}
	public static boolean isPrime(MyInteger value) {
		return value.isPrime();
	}

	public boolean equals(int value) {
		if (value == iValue)
			return true;
		return false;
	}

	public boolean equals(MyInteger value) {
		return value.equals(iValue);
	}
}