package com.honglei.data.operate;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;

public class StringOperate {
	
	public static void main(String[] args) {
		String operateStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		//返回指定索引处的字符值
		System.out.println(operateStr.charAt(1));//B
		
		//返回字符串的长度
		System.out.println(operateStr.length());//26
		
		//返回子字符串从startIndex 到 endindex-1的内容
		System.out.println(operateStr.substring(1, 3));//BC
		
		//返回子字符串从beginIndex 到 字符串结尾
		System.out.println(operateStr.substring(25));//Z
		
		//返回"AB"在operateStr的第一次出现的索引位置  严格区分大小写
		System.out.println(operateStr.indexOf("AB"));
		
		//将十进制数转换成字符型，返回该字符型在operateStr的第一次出现的索引位置 如果没有返回-1
		System.out.println(operateStr.indexOf(65));//0
		
		//将字符串转换成IntStream
		System.out.println(operateStr.chars());//java.util.stream.IntPipeline$Head@6ce253f1
		
		//返回字符串指定索引处的char值  （十进制）
		System.out.println(operateStr.codePointAt(4)); 
		
		//返回字符串指定索引处的前一个的char值 （十进制）  如果超出范围报异常"String index out of range"
		//范围   1  到   length
		System.out.println(operateStr.codePointBefore(1));//65
		
		//返回beginIndex 到 endIndex-1之间的字符数
		System.out.println(operateStr.codePointCount(0, 5));//5
		
		//返回字符串的原始Int流
		System.out.println(operateStr.codePoints());
		
		//从前到后进行unicode比较 直到出现结果不为零停止
		//字符串索引位与参数索引位比较
		//小于返回负数差    等于返回0    大于返回正数差
		//如果字串返回剩余没有对比的char字符数  多余返回正差异数    少于返回负差异数
		System.out.println(operateStr.compareTo("ABCD"));//22
		
		//与compareTo方法类似  对比忽略大小写
		System.out.println(operateStr.compareToIgnoreCase("abcdefghijklmnopqrstuvwxyz"));//0
		
		//在字符串之后追加参数字符串
		System.out.println(operateStr.concat("AAA"));//ABCDEFGHIJKLMNOPQRSTUVWXYZAAA
		
		//判断字符串是否包含参数字符串   区分大小写
		System.out.println(operateStr.contains("c"));//false
		
		//String.equals 参数必须也是String且内容一致才返回true
		System.out.println(operateStr.equals("ABC"));//false
		
		//String.contentEquals接收CharSequence类型参数，当内容一致时返回true
		CharSequence cstr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(operateStr.contentEquals(cstr));//true
		
		//String.contentEquals接收StringBuilder类型参数，当内容一致时返回true
		StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		System.out.println(operateStr.contentEquals(sb));//true
		
		//判断字符串是否以指定字符结尾 区分大小写
		System.out.println(operateStr.endsWith("xyz"));//false
		
		//判断字符串是否相等，忽略大小写
		System.out.println(operateStr.equalsIgnoreCase("abcDEFGHIJKLMNOPQRSTUVWXYZ"));//true
		
		//将字符串转换成字节数组
		System.out.println(operateStr.getBytes());//[B@65ab7765
		
		//声明Charset字符集对象 将字符串按Charset字符集类型转换字节数组
		Charset charset = Charset.forName("utf8");
		operateStr.getBytes(charset);
		
		//将字符串根据指定字符集名称转换字节数组
		//UTF-8、ISO-8859-1
		try {
			System.out.println(operateStr.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		//将字符串转换成字符数组
		System.out.println(operateStr.toCharArray());//ABCDEFGHIJKLMNOPQRSTUVWXYZ
		
		//判断字符串是否以指定字符开始 区分大小写
		System.out.println(operateStr.startsWith("AB"));
		
		//将字符串从0开始到5-1的字符复制到dst字符数组中，复制内容的起始位置为dst数组的0索引位置
		char[] dst = new char[26];
		operateStr.getChars(0, 5, dst, 0);
		
		//返回字符串的哈希码
		System.out.println(operateStr.hashCode());
		
		//intern 方法会从字符串常量池中查询当前字符串是否存在，若不存在就会将当前字符串放入常量池中
		System.out.println(operateStr.intern());
		
		//返回指定字符最后一次出现的字符串中的索引  参数为字符的Unicode十进制
		System.out.println(operateStr.lastIndexOf(65));//0
		
		//返回指定字符最后一次出现的字符串中的索引
		System.out.println(operateStr.lastIndexOf("AB"));
		
		//返回字符串从指定索引2开始从右向左字符（Unicode 十进制）最后一次出现的索引位置
		System.out.println(operateStr.lastIndexOf(69, 2));
		
		//返回字符串从指定索引2开始从右向左字符最后一次出现的索引位置
		System.out.println(operateStr.lastIndexOf("E", 2));
		
		//字符串长度为0 返回true，字符串不能为null
		System.out.println(operateStr.isEmpty());
		
		//返回字符串是否匹配正则表达式规则
		System.out.println(operateStr.matches("^[A-Z]+$"));//true
		
		/*operateStr.notify();
		
		operateStr.notifyAll();
		
		try {
			operateStr.wait();
			operateStr.wait(300);
			operateStr.wait(300, 1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		//返回此 String 中从给定的 index 处偏移 codePointOffset 个代码点的索引
		System.out.println(operateStr.offsetByCodePoints(3, 5));//8
		
		//检测两个字符串在一个区域内是否相等
		String Str1 = new String("www.java.com");
        String Str2 = new String("java");
		System.out.println(Str1.regionMatches(4, Str2, 0, 4));//true
		
		//检测两个字符串在一个区域内是否相等   是否忽略大小写
		System.out.println(Str1.regionMatches(true, 4, Str2, 0, 4));
		
		//将字符串中"w"字符全部替换为"N"
		System.out.println(Str1.replace("w", "N"));
		
		CharSequence cs1 = "ww";
		CharSequence cs2 = "NN";
		System.out.println(Str1.replace(cs1, cs2));
		
		//使用给定的参数 replacement 替换字符串所有匹配给定的正则表达式的子字符串
		System.out.println(Str1.replaceAll("(.*)java(.*)", "ABC"));//ABC
		
		//使用给定的参数 replacement 替换字符串第一个匹配给定的正则表达式的子字符串
		System.out.println(Str1.replaceFirst("(.*)java(.*)", "ABC"));//ABC
		System.out.println(Str1.replaceFirst("java", "ABC"));//www.ABC.com
		
		//根据匹配给定的正则表达式来拆分字符串
		//. 、 | 和 * 等转义字符，必须得加 \\
		//多个分隔符，可以用 | 作为连字符
		//regex -- 正则表达式分隔符。
		//limit -- 分割的份数。
		System.out.println(Str1.split("."));
		System.out.println(Str1.split(".",2));
		
		//将字符串转换为小写
		System.out.println(operateStr.toLowerCase());
		
		//使用给定 Locale 的规则将此 String 中的所有字符都转换为小写
		System.out.println(operateStr.toLowerCase(Locale.getDefault()));
		
		//将字符串转换为大写
		System.out.println(operateStr.toUpperCase());
		
		//使用给定 Locale 的规则将此 String 中的所有字符都转换为大写
		System.out.println(operateStr.toUpperCase(Locale.getDefault()));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
