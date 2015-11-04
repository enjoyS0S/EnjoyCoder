package basic;

/**
 * 
 * @author S0S
 *
 */
public class ReplaceBlank {

	public static void main(String[] args) {
		String str = "We are happy.";
		ReplaceBlank rb = new ReplaceBlank();
		System.out.println(rb.replaceBlank_0(str.toCharArray(),
				str.toCharArray().length));
		System.out.println(rb.replaceBlank_1(str.toCharArray(), 127));
	}

	public String replaceBlank_0(char[] cs, int len) {
		if (cs == null || len <= 0)
			return "";
		return new String(cs).replaceAll(" ", "%20");
	}

	public String replaceBlank_1(char[] cs, int len) {
		if (cs == null || len <= 0)
			return "";
		// 字符数组的真实长度
		int originalLength = 0;
		// 字符数组中空格长度
		int numberBlank = 0;
		int index = 0;
		System.out.println("长度：" + cs.length);
		while (index < cs.length && cs[index] != 0) {
			originalLength++;
			if (cs[index] == ' ')
				numberBlank++;
			index++;
		}
		int newLength = originalLength + 2 * numberBlank;
		if (newLength > len)
			return "";
		int indexOfOriginal = originalLength;
		int indexOfNew = newLength;
		while (indexOfOriginal >= 0 && indexOfNew > indexOfOriginal) {
			if (cs[indexOfOriginal] == ' ') {
				cs[indexOfOriginal--] = '0';
				cs[indexOfOriginal--] = '2';
				cs[indexOfOriginal--] = '%';
			} else {
				cs[indexOfNew] = cs[indexOfOriginal];
			}
			indexOfOriginal--;
		}
		return new String(cs);
	}
}
