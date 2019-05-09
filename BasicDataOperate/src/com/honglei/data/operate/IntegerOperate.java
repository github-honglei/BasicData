package com.honglei.data.operate;

public class IntegerOperate {

	public static void main(String[] args) {
		
		Integer num = 2147483640;
		
		//以int形式返回此Integer的值
		System.out.println(num.intValue());
		
		//以String形式返回此Integer的值
		System.out.println(num.toString());
		
		//num等于参数值返回0   大于参数值返回1  小于参数值返回-1
		System.out.println(num.compareTo(2147483642));
		
		//以double形式返回此Integer的值
		System.out.println(num.doubleValue());
		
		//类型一致且内容一致 返回true 否则返回false
		System.out.println(num.equals((int)2147483640));
		
		//以float形式返回此Integer的值
		System.out.println(num.floatValue());
		
		//返回此Integer值的哈希值
		System.out.println(num.hashCode());
		
		//以Long形式返回此Integer的值
		System.out.println(num.longValue());
		
		//以16进制形式返回此Integer的值
		System.out.println(Integer.toHexString(283746272));
		
		//以2进制形式返回此Integer的值
		System.out.println(Integer.toBinaryString(num));
		
		//以8进制形式返回此Integer的值
		System.out.println(Integer.toOctalString(283746272));
		
		//以无符号字符串形式返回此Integer的值
		System.out.println(Integer.toUnsignedString(283746272));
		
		//以无符号字符串形式返回此Integer的值 可指定进制
		//1 十进制 | 2 二进制  | 3 八进制  | 4 16进制
		System.out.println(Integer.toUnsignedString(283746272, 2));
		
		//同上
		System.out.println(Integer.toString(283746272, 2));
		
		//将字符串类型数值转换Int类型 ，非整形数值报类型转换异常
		System.out.println(Integer.parseInt("11"));
		
		//以byte类型返回该 Integer的值
		System.out.println(num.byteValue());
		
		//返回该Integer转换为short类型后的数值
		System.out.println(num.shortValue());
		
		//返回Integer类型可表示的最大值
		System.out.println(Integer.MAX_VALUE);
		
		//返回Integer类型可表示的最小值
		System.out.println(Integer.MIN_VALUE);
		
		//返回Integer数据类型占用的二进制字节位数
		System.out.println(Integer.SIZE);
		
		//统计num转成2进制后有多少个1
		System.out.println(Integer.bitCount(num));
		
		//比较两个整数是否相等  0 相等 | 1 前者大于后者 | -1 前者小于后者
		System.out.println(Integer.compare(2147483641,num));
		
		//比较两个无符号整数是否相等  0 相等 | 1 前者大于后者 | -1 前者小于后者
		System.out.println(Integer.compareUnsigned(2147483641, num));
		
		//返回将第一个参数除以第二个参数的无符号商，其中每个参数和结果被解释为无符号值
		System.out.println(Integer.divideUnsigned(100, 6));
		
		//返回此Integer值的哈希值
		System.out.println(Integer.hashCode(num));
		
		//返回一个int值，该值最多只有一位，位于指定int值中最高位（“最左侧”）一位的位置。 如果指定的值在其二进制补码表示中没有任何位，即如果它等于零，则返回零
		System.out.println(Integer.highestOneBit(num));
		
		//返回一个int值，该值最多只有一个1位，位于指定int值中最低位（“最右侧”）的一位。 如果指定的值在其二进制补码表示中没有任何位，即如果它等于零，则返回零。
		System.out.println(Integer.lowestOneBit(num));
		
		//返回两整数的最大值
		System.out.println(Integer.max(1, 1));
		
		//返回两整数的最小值
		System.out.println(Integer.min(1, 1));
		
		//不常用
		System.out.println(Integer.numberOfLeadingZeros(num));
		System.out.println(Integer.numberOfTrailingZeros(num));
		
		//可选。表示要解析的数字的基数。该值介于 2 ~ 36 之间。
		//如果省略该参数或其值为 0，则数字将以 10 为基础来解析。如果它以 “0x” 或 “0X” 开头，将以 16 为基数。
		//如果该参数小于 2 或者大于 36，则 parseInt() 将返回 NaN。
		System.out.println(Integer.parseInt("111", 2));
		System.out.println(Integer.parseInt("777", 8));
		System.out.println(Integer.parseInt("777", 16));
		
		//返回此字符型参数的无符号整形
		System.out.println(Integer.parseUnsignedInt("123"));
		
		System.out.println(Integer.parseUnsignedInt("111", 2));
		System.out.println(Integer.parseUnsignedInt("777", 8));
		System.out.println(Integer.parseUnsignedInt("777", 16));
		
		//返回将第一个参数除以第二个参数的无符号余数，其中每个参数和结果被解释为无符号值
		System.out.println(Integer.remainderUnsigned(100, 6));
		
		//返回通过反转指定int值的二进制补码二进制表示中的位顺序获得的值
		System.out.println(Integer.reverse(num));
		
		//返回通过反转指定int值的二进制补码表示中的字节顺序获得的值。
		System.out.println(Integer.reverseBytes(num));
		
		//此方法返回通过旋转由位的指定数左移指定的int值的二进制补码表示法得到的值
		System.out.println(Integer.rotateLeft(num, 5));
		
		//此方法返回通过旋转由位的指定数右移指定的int值的二进制补码表示法得到的值
		System.out.println(Integer.rotateRight(num, 5));
		
		//返回指定 int 值的符号
		System.out.println(Integer.signum(num));
		
		//返回两整数相加
		System.out.println(Integer.sum(3, -5));
		
		//以无符号long形式返回此Integer的值
		System.out.println(Integer.toUnsignedLong(num));
		
		//将String解码为整数
		System.out.println(Integer.decode("123"));
		
		//返回属性的Integer值
		System.out.println(Integer.getInteger(""));
		System.out.println(Integer.getInteger("123",5));
		
		System.out.println(Integer.valueOf(123));
		System.out.println(Integer.valueOf("123"));
		System.out.println(Integer.valueOf("123",8));
	}
}
