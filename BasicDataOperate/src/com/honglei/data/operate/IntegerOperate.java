package com.honglei.data.operate;


public class IntegerOperate {

	private transient String abc;
	
	public static void main(String[] args) {
		
		
		
		
		
		Integer num = 2147483640;
		
		//��int��ʽ���ش�Integer��ֵ
		System.out.println(num.intValue());
		
		//��String��ʽ���ش�Integer��ֵ
		System.out.println(num.toString());
		
		//num���ڲ���ֵ����0   ���ڲ���ֵ����1  С�ڲ���ֵ����-1
		System.out.println(num.compareTo(2147483642));
		
		//��double��ʽ���ش�Integer��ֵ
		System.out.println(num.doubleValue());
		
		//����һ��������һ�� ����true ���򷵻�false
		System.out.println(num.equals((int)2147483640));
		
		//��float��ʽ���ش�Integer��ֵ
		System.out.println(num.floatValue());
		
		//���ش�Integerֵ�Ĺ�ϣֵ
		System.out.println(num.hashCode());
		
		//��Long��ʽ���ش�Integer��ֵ
		System.out.println(num.longValue());
		
		//��16������ʽ���ش�Integer��ֵ
		System.out.println(Integer.toHexString(283746272));
		
		//��2������ʽ���ش�Integer��ֵ
		System.out.println(Integer.toBinaryString(num));
		
		//��8������ʽ���ش�Integer��ֵ
		System.out.println(Integer.toOctalString(283746272));
		
		//���޷����ַ�����ʽ���ش�Integer��ֵ
		System.out.println(Integer.toUnsignedString(283746272));
		
		//���޷����ַ�����ʽ���ش�Integer��ֵ ��ָ������
		//1 ʮ���� | 2 ������  | 3 �˽���  | 4 16����
		System.out.println(Integer.toUnsignedString(283746272, 2));
		
		//ͬ��
		System.out.println(Integer.toString(283746272, 2));
		
		//���ַ���������ֵת��Int���� ����������ֵ������ת���쳣
		System.out.println(Integer.parseInt("11"));
		
		//��byte���ͷ��ظ� Integer��ֵ
		System.out.println(num.byteValue());
		
		//���ظ�Integerת��Ϊshort���ͺ����ֵ
		System.out.println(num.shortValue());
		
		//����Integer���Ϳɱ�ʾ�����ֵ
		System.out.println(Integer.MAX_VALUE);
		
		//����Integer���Ϳɱ�ʾ����Сֵ
		System.out.println(Integer.MIN_VALUE);
		
		//����Integer��������ռ�õĶ������ֽ�λ��
		System.out.println(Integer.SIZE);
		
		//ͳ��numת��2���ƺ��ж��ٸ�1
		System.out.println(Integer.bitCount(num));
		
		//�Ƚ����������Ƿ����  0 ��� | 1 ǰ�ߴ��ں��� | -1 ǰ��С�ں���
		System.out.println(Integer.compare(2147483641,num));
		
		//�Ƚ������޷��������Ƿ����  0 ��� | 1 ǰ�ߴ��ں��� | -1 ǰ��С�ں���
		System.out.println(Integer.compareUnsigned(2147483641, num));
		
		//���ؽ���һ���������Եڶ����������޷����̣�����ÿ�������ͽ��������Ϊ�޷���ֵ
		System.out.println(Integer.divideUnsigned(100, 6));
		
		//���ش�Integerֵ�Ĺ�ϣֵ
		System.out.println(Integer.hashCode(num));
		
		//����һ��intֵ����ֵ���ֻ��һλ��λ��ָ��intֵ�����λ��������ࡱ��һλ��λ�á� ���ָ����ֵ��������Ʋ����ʾ��û���κ�λ��������������㣬�򷵻���
		System.out.println(Integer.highestOneBit(num));
		
		//����һ��intֵ����ֵ���ֻ��һ��1λ��λ��ָ��intֵ�����λ�������Ҳࡱ����һλ�� ���ָ����ֵ��������Ʋ����ʾ��û���κ�λ��������������㣬�򷵻��㡣
		System.out.println(Integer.lowestOneBit(num));
		
		//���������������ֵ
		System.out.println(Integer.max(1, 1));
		
		//��������������Сֵ
		System.out.println(Integer.min(1, 1));
		
		//������
		System.out.println(Integer.numberOfLeadingZeros(num));
		System.out.println(Integer.numberOfTrailingZeros(num));
		
		//��ѡ����ʾҪ���������ֵĻ�������ֵ���� 2 ~ 36 ֮�䡣
		//���ʡ�Ըò�������ֵΪ 0�������ֽ��� 10 Ϊ������������������� ��0x�� �� ��0X�� ��ͷ������ 16 Ϊ������
		//����ò���С�� 2 ���ߴ��� 36���� parseInt() ������ NaN��
		System.out.println(Integer.parseInt("111", 2));
		System.out.println(Integer.parseInt("777", 8));
		System.out.println(Integer.parseInt("777", 16));
		
		//���ش��ַ��Ͳ������޷�������
		System.out.println(Integer.parseUnsignedInt("123"));
		
		System.out.println(Integer.parseUnsignedInt("111", 2));
		System.out.println(Integer.parseUnsignedInt("777", 8));
		System.out.println(Integer.parseUnsignedInt("777", 16));
		
		//���ؽ���һ���������Եڶ����������޷�������������ÿ�������ͽ��������Ϊ�޷���ֵ
		System.out.println(Integer.remainderUnsigned(100, 6));
		
		//����ͨ����תָ��intֵ�Ķ����Ʋ�������Ʊ�ʾ�е�λ˳���õ�ֵ
		System.out.println(Integer.reverse(num));
		
		//����ͨ����תָ��intֵ�Ķ����Ʋ����ʾ�е��ֽ�˳���õ�ֵ��
		System.out.println(Integer.reverseBytes(num));
		
		//�˷�������ͨ����ת��λ��ָ��������ָ����intֵ�Ķ����Ʋ����ʾ���õ���ֵ
		System.out.println(Integer.rotateLeft(num, 5));
		
		//�˷�������ͨ����ת��λ��ָ��������ָ����intֵ�Ķ����Ʋ����ʾ���õ���ֵ
		System.out.println(Integer.rotateRight(num, 5));
		
		//����ָ�� int ֵ�ķ���
		System.out.println(Integer.signum(num));
		
		//�������������
		System.out.println(Integer.sum(3, -5));
		
		//���޷���long��ʽ���ش�Integer��ֵ
		System.out.println(Integer.toUnsignedLong(num));
		
		//��String����Ϊ����
		System.out.println(Integer.decode("123"));
		
		//�������Ե�Integerֵ
		System.out.println(Integer.getInteger(""));
		System.out.println(Integer.getInteger("123",5));
		
		System.out.println(Integer.valueOf(123));
		System.out.println(Integer.valueOf("123"));
		System.out.println(Integer.valueOf("123",8));
		
		System.gc();
		
		String _abc="";
		String $abc="";
		String ￥abc="";
	}
}
