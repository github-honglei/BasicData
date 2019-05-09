package com.honglei.collection.operate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class ListOperate {

	// ArrayList
	// ArrayList�Ƕ�̬���飬��MSDN�е�˵��������Array�ĸ��Ӱ汾��
	// ���ṩ�˶�̬�����Ӻͼ���Ԫ�أ�ʵ����ICollection��IList�ӿڣ�������������Ĵ�С�Ⱥô�.
	// ArrayListʵ����һ�����ȿɱ�����飬���ڴ�ռ��п���һ�������Ŀռ�
	
	public static void main(String[] args) {
		listFunction();
	}
	
	private static void listFunction() {
		List<String> aList = new ArrayList<String>();
		List<String> bList = new ArrayList<String>();
		//���ʵ���˳�򷵻ش��б���Ԫ�صĵ�����
		aList.add("a");
		aList.add("b");
		Iterator it = aList.iterator();
		while (it.hasNext()) {
			String a = (String) it.next();
			System.out.println(a);
		}
		
		// ArrayList��Ԫ�ظ���
		// ���Ϊnull ��NullPointerException�쳣
		bList.size(); //0
		
		// ����������ȡԪ��
		// ���Ϊnull ��NullPointerException�쳣
		System.out.println(aList.get(1));//b
		
		// ���б��������Ԫ��
		aList.add("1");
		
		// ArrayList�Ƿ�Ϊ�� 
		// ���Ϊnull ��NullPointerException�쳣
		aList.isEmpty();
		
		// ��Ԫ����ӵ��б���ָ��λ��
		// ����б�Ϊnull ��NullPointerException�쳣
		// ������������б����� ��IndexOutOfBoundsException�쳣
		aList.add(0,"123");
		
		// �Ƴ�������ָ��Ԫ��
		aList.remove("123");
		
		// ��ָ�������е�����Ԫ��׷�ӵ����б��ĩβ
		// ���bListΪnull ��NullPointerException�쳣
		aList.addAll(bList);
		
		// ��ָ�������е�����Ԫ����ӵ��б���ָ��λ��
		// ����б�Ϊnull ��NullPointerException�쳣
		// ������������б����� ��IndexOutOfBoundsException�쳣
		aList.addAll(1, bList);
		
		// �жϼ������Ƿ����ָ��Ԫ��
		aList.contains("123");
		
		// �Ӵ��б���ɾ������Ԫ�أ���ѡ���������˵��÷��غ��б�Ϊ�ա�
		aList.clear();
		
		// ������б����ָ�����ϵ�����Ԫ�أ��򷵻�true
		aList.containsAll(aList);
		
		// ��ָ����������б���бȽ��Ի������ԡ� 
		// ���ҽ���ָ���Ķ���Ҳ���б�ʱ������true�������б������ͬ�Ĵ�С�����������б��е�������ӦԪ�ض���ȡ�
		// �б�Ԫ��˳��Ҳ����һ��
		aList.equals(bList);
		
		// lambda���ʽ  foreach�÷�
		aList.forEach(x -> System.out.println(x));
		aList.forEach(x -> {
			System.out.println(x);
		});
		
		// ��ȡ��ǰ���ϵĹ�ϣֵ
		aList.hashCode();
		
		//��ȡ��ǰԪ�ص������±�  �����ڷ���-1
		System.out.println(aList.indexOf("1111"));
		
		// ���ش��б���ָ��Ԫ�ص����һ�γ��ֵ�����
		System.out.println(aList.lastIndexOf("1"));
		
		// ���ش��б���Ԫ�ص��б������
		// iterator()������set��list�ӿ��ж��ж��壬����ListIterator������������list�ӿ��У���ʵ�����У�
		// ListIterator��add()������������List����Ӷ��󣬶�Iterator����
		// ListIterator��Iterator����hasNext()��next()����������ʵ��˳��������������ListIterator��hasPrevious()��previous()����������ʵ������˳����ǰ��������Iterator�Ͳ����ԡ�
		// ListIterator���Զ�λ��ǰ������λ�ã�nextIndex()��previousIndex()����ʵ�֡�Iteratorû�д˹��ܡ�
		// ����ʵ��ɾ�����󣬵���ListIterator����ʵ�ֶ�����޸ģ�set()��������ʵ�֡�Iierator���ܱ����������޸ġ�
		ListIterator<String> it2 = aList.listIterator();
		while (it2.hasNext()) {
			String a = (String) it2.next();
			System.out.println(a);
		}
		
		// ���ش��б���Ԫ�ص��б������  ���б��е�ָ��λ�ÿ�ʼ
		ListIterator<String> it3 = aList.listIterator(0);
		while (it3.hasNext()) {
			String a = (String) it3.next();
			System.out.println(a);
		}
		
		//aList.notify();
		//aList.notifyAll();
		
		//aList.parallelStream();
		
		// ɾ�����б���ָ��λ�õ�Ԫ��
		aList.add("123");
		aList.remove(0);
		
		// �Ӹ��б���ɾ����һ�γ��ֵ�ָ��Ԫ�أ�������ڣ�����ѡ��������
		aList.remove("123");
		
		// �Ӵ��б���ɾ��ָ�������а���������Ԫ�أ���ѡ��������
		aList.removeAll(bList);
		
		// ɾ���б�������������Ԫ��
		aList.removeIf(test->test.startsWith("1"));
		
		//�ú����ӿڵķ��ؽ�����ԭlist�е�ֵ
		aList.replaceAll(t -> t + 1);
		aList.replaceAll(t -> {
			return t + "-";
		});
		
		// ֻ����aList��bList����ͬ��Ԫ��
		aList.retainAll(bList);
		aList.forEach(x -> System.out.println(x));
		
		//ʹ��ָ����Ԫ���滻���б���ָ��λ�õ�Ԫ�أ���ѡ��������
		aList.add("123");
		aList.set(0, "6");
		
		//List���� ��һ��
		List<People> sort1 = People.getPeopleList();
		Collections.sort(sort1,new PeopleCompareter());
		sort1.forEach(e -> {
			System.out.println(e.getAge());
		});
		
		//List���� �ڶ��� �ڲ���
		List<People> sort2 = People.getPeopleList();
		class PeopleCompareter2 implements Comparator<People>{
			@Override
			public int compare(People o1, People o2) {
				return o1.getAge() - o2.getAge();
			}
		}
		Collections.sort(sort2, new PeopleCompareter2());
		System.out.println(sort2);
		
		//List���� ������ ������
		List<People> sort3 = People.getPeopleList();
		Collections.sort(sort3, new Comparator<People>() {
			@Override
			public int compare(People o1, People o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		
		//List���� ������ lambda���ʽ
		List<People> sort4 = People.getPeopleList();
		Collections.sort(sort4, (People o1,People o2) -> o1.getAge() - o2.getAge());
		System.out.println(sort4);
		
		//List���� ������ ����Comparator��lamdba���ʽ����������
		List<People> sort5 = People.getPeopleList();
		Collections.sort(sort5, Comparator.comparing(People::getAge).thenComparing(People::getName));
		System.out.println(sort5);
		
		/** ��������Ĭ�϶����������� */
		/** ���������ǽ������� */
		
		//List���� ������ ԭ��ͬ��
		List<People> sort6 = People.getPeopleList();
		sort6.sort(Comparator.comparing(People::getAge).reversed().thenComparing(People::getName));
		sort6.forEach(e -> {
			System.out.println(e.getAge()+ "-" +e.getName());
		});
		
		List<People> sort7 = People.getPeopleList();
		List<People> desc_sort_2 = sort7.stream().sorted((Comparator.comparing(People::getAge).reversed())).collect(Collectors.toList());
		desc_sort_2.forEach(e -> {
			System.out.println(e.getAge() + "-" + e.getName());
		});
		
		//���ؼ��ϴ�fromindex��toindex-1֮��ļ�������
		List<People> l1 =  sort7.subList(1, 2);
		l1.forEach(e -> {
			System.out.println(e.getName());
		});
		
		//����ǰ������������ʽ����
		aList.toArray();
		
		aList.add("1");
		aList.add("2");
		System.out.println(aList.toString());//[1,2]
	}
}
