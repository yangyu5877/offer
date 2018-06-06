public class Solution2 {

	/**
	type : 字符串
	name: 删除空格
	desc：
	**/

	public static String replaceSpace(String s, String target) {
		StringBuffer sb = new StringBuffer();
		char[] chars = s.toCharArray();
		int length = chars.length;
		for(int i = 0; i < length; i++) {
			//==与equals的区别，  ==比对的是对象的地址值，  equals是object的方法， 类继承以后一般都重写的该方法，
			//在String中，equals相当于比对的对象的实际值而非地址值
			//在下面的比对中，如果使用==，就会比对失败， 因为比对的是对象地址值
			if(" ".equals(String.valueOf(chars[i]))) {
				sb.append(target);
			}else {
				sb.append(chars[i]);
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String s = "sf sdfd sfd";
		String target = "%20";
		System.out.println(replaceSpace(s, target));
	}
}
