package com.honglei.data.operate;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;

public class StringOperate {
	
	public static void main(String[] args) {
		String operateStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		//����ָ�����������ַ�ֵ
		System.out.println(operateStr.charAt(1));//B
		
		//�����ַ����ĳ���
		System.out.println(operateStr.length());//26
		
		//�������ַ�����startIndex �� endindex-1������
		System.out.println(operateStr.substring(1, 3));//BC
		
		//�������ַ�����beginIndex �� �ַ�����β
		System.out.println(operateStr.substring(25));//Z
		
		//����"AB"��operateStr�ĵ�һ�γ��ֵ�����λ��  �ϸ����ִ�Сд
		System.out.println(operateStr.indexOf("AB"));
		
		//��ʮ������ת�����ַ��ͣ����ظ��ַ�����operateStr�ĵ�һ�γ��ֵ�����λ�� ���û�з���-1
		System.out.println(operateStr.indexOf(65));//0
		
		//���ַ���ת����IntStream
		System.out.println(operateStr.chars());//java.util.stream.IntPipeline$Head@6ce253f1
		
		//�����ַ���ָ����������charֵ  ��ʮ���ƣ�
		System.out.println(operateStr.codePointAt(4)); 
		
		//�����ַ���ָ����������ǰһ����charֵ ��ʮ���ƣ�  ���������Χ���쳣"String index out of range"
		//��Χ   1  ��   length
		System.out.println(operateStr.codePointBefore(1));//65
		
		//����beginIndex �� endIndex-1֮����ַ���
		System.out.println(operateStr.codePointCount(0, 5));//5
		
		//�����ַ�����ԭʼInt��
		System.out.println(operateStr.codePoints());
		
		//��ǰ�������unicode�Ƚ� ֱ�����ֽ����Ϊ��ֹͣ
		//�ַ�������λ���������λ�Ƚ�
		//С�ڷ��ظ�����    ���ڷ���0    ���ڷ���������
		//����ִ�����ʣ��û�жԱȵ�char�ַ���  ���෵����������    ���ڷ��ظ�������
		System.out.println(operateStr.compareTo("ABCD"));//22
		
		//��compareTo��������  �ԱȺ��Դ�Сд
		System.out.println(operateStr.compareToIgnoreCase("abcdefghijklmnopqrstuvwxyz"));//0
		
		//���ַ���֮��׷�Ӳ����ַ���
		System.out.println(operateStr.concat("AAA"));//ABCDEFGHIJKLMNOPQRSTUVWXYZAAA
		
		//�ж��ַ����Ƿ���������ַ���   ���ִ�Сд
		System.out.println(operateStr.contains("c"));//false
		
		//String.equals ��������Ҳ��String������һ�²ŷ���true
		System.out.println(operateStr.equals("ABC"));//false
		
		//String.contentEquals����CharSequence���Ͳ�����������һ��ʱ����true
		CharSequence cstr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(operateStr.contentEquals(cstr));//true
		
		//String.contentEquals����StringBuilder���Ͳ�����������һ��ʱ����true
		StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		System.out.println(operateStr.contentEquals(sb));//true
		
		//�ж��ַ����Ƿ���ָ���ַ���β ���ִ�Сд
		System.out.println(operateStr.endsWith("xyz"));//false
		
		//�ж��ַ����Ƿ���ȣ����Դ�Сд
		System.out.println(operateStr.equalsIgnoreCase("abcDEFGHIJKLMNOPQRSTUVWXYZ"));//true
		
		//���ַ���ת�����ֽ�����
		System.out.println(operateStr.getBytes());//[B@65ab7765
		
		//����Charset�ַ������� ���ַ�����Charset�ַ�������ת���ֽ�����
		Charset charset = Charset.forName("utf8");
		operateStr.getBytes(charset);
		
		//���ַ�������ָ���ַ�������ת���ֽ�����
		//UTF-8��ISO-8859-1
		try {
			System.out.println(operateStr.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		//���ַ���ת�����ַ�����
		System.out.println(operateStr.toCharArray());//ABCDEFGHIJKLMNOPQRSTUVWXYZ
		
		//�ж��ַ����Ƿ���ָ���ַ���ʼ ���ִ�Сд
		System.out.println(operateStr.startsWith("AB"));
		
		//���ַ�����0��ʼ��5-1���ַ����Ƶ�dst�ַ������У��������ݵ���ʼλ��Ϊdst�����0����λ��
		char[] dst = new char[26];
		operateStr.getChars(0, 5, dst, 0);
		
		//�����ַ����Ĺ�ϣ��
		System.out.println(operateStr.hashCode());
		
		//intern ��������ַ����������в�ѯ��ǰ�ַ����Ƿ���ڣ��������ھͻὫ��ǰ�ַ������볣������
		System.out.println(operateStr.intern());
		
		//����ָ���ַ����һ�γ��ֵ��ַ����е�����  ����Ϊ�ַ���Unicodeʮ����
		System.out.println(operateStr.lastIndexOf(65));//0
		
		//����ָ���ַ����һ�γ��ֵ��ַ����е�����
		System.out.println(operateStr.lastIndexOf("AB"));
		
		//�����ַ�����ָ������2��ʼ���������ַ���Unicode ʮ���ƣ����һ�γ��ֵ�����λ��
		System.out.println(operateStr.lastIndexOf(69, 2));
		
		//�����ַ�����ָ������2��ʼ���������ַ����һ�γ��ֵ�����λ��
		System.out.println(operateStr.lastIndexOf("E", 2));
		
		//�ַ�������Ϊ0 ����true���ַ�������Ϊnull
		System.out.println(operateStr.isEmpty());
		
		//�����ַ����Ƿ�ƥ��������ʽ����
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
		
		//���ش� String �дӸ����� index ��ƫ�� codePointOffset ������������
		System.out.println(operateStr.offsetByCodePoints(3, 5));//8
		
		//��������ַ�����һ���������Ƿ����
		String Str1 = new String("www.java.com");
        String Str2 = new String("java");
		System.out.println(Str1.regionMatches(4, Str2, 0, 4));//true
		
		//��������ַ�����һ���������Ƿ����   �Ƿ���Դ�Сд
		System.out.println(Str1.regionMatches(true, 4, Str2, 0, 4));
		
		//���ַ�����"w"�ַ�ȫ���滻Ϊ"N"
		System.out.println(Str1.replace("w", "N"));
		
		CharSequence cs1 = "ww";
		CharSequence cs2 = "NN";
		System.out.println(Str1.replace(cs1, cs2));
		
		//ʹ�ø����Ĳ��� replacement �滻�ַ�������ƥ�������������ʽ�����ַ���
		System.out.println(Str1.replaceAll("(.*)java(.*)", "ABC"));//ABC
		
		//ʹ�ø����Ĳ��� replacement �滻�ַ�����һ��ƥ�������������ʽ�����ַ���
		System.out.println(Str1.replaceFirst("(.*)java(.*)", "ABC"));//ABC
		System.out.println(Str1.replaceFirst("java", "ABC"));//www.ABC.com
		
		//����ƥ�������������ʽ������ַ���
		//. �� | �� * ��ת���ַ�������ü� \\
		//����ָ����������� | ��Ϊ���ַ�
		//regex -- ������ʽ�ָ�����
		//limit -- �ָ�ķ�����
		System.out.println(Str1.split("."));
		System.out.println(Str1.split(".",2));
		
		//���ַ���ת��ΪСд
		System.out.println(operateStr.toLowerCase());
		
		//ʹ�ø��� Locale �Ĺ��򽫴� String �е������ַ���ת��ΪСд
		System.out.println(operateStr.toLowerCase(Locale.getDefault()));
		
		//���ַ���ת��Ϊ��д
		System.out.println(operateStr.toUpperCase());
		
		//ʹ�ø��� Locale �Ĺ��򽫴� String �е������ַ���ת��Ϊ��д
		System.out.println(operateStr.toUpperCase(Locale.getDefault()));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
