package basic;

/**
 * 在网络编程中，如果URL参数中含有特殊字符，如空格、‘#’等，可能导致服务器端无法获得正确的参数值。我们需要将这些特殊的字符号转换成服务器可以识别的字符。转换的规则是在‘%’后面跟上ASCII码的两位十六进制的表示。比如空格的ASCII码是32，即十六进制的0x20，因此空格被替换成“%20”。再比如’#‘的ASCII码为35，即16进制的0x23，它在URL中被替换为“%23”。
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
