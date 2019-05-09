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
	// ArrayList是动态数组，用MSDN中的说法，就是Array的复杂版本，
	// 它提供了动态的增加和减少元素，实现了ICollection和IList接口，灵活的设置数组的大小等好处.
	// ArrayList实现了一个长度可变的数组，在内存空间中开辟一串连续的空间
	
	public static void main(String[] args) {
		listFunction();
	}
	
	private static void listFunction() {
		List<String> aList = new ArrayList<String>();
		List<String> bList = new ArrayList<String>();
		//以适当的顺序返回此列表中元素的迭代器
		aList.add("a");
		aList.add("b");
		Iterator it = aList.iterator();
		while (it.hasNext()) {
			String a = (String) it.next();
			System.out.println(a);
		}
		
		// ArrayList的元素个数
		// 如果为null 报NullPointerException异常
		bList.size(); //0
		
		// 根据索引获取元素
		// 如果为null 报NullPointerException异常
		System.out.println(aList.get(1));//b
		
		// 在列表的最后添加元素
		aList.add("1");
		
		// ArrayList是否为空 
		// 如果为null 报NullPointerException异常
		aList.isEmpty();
		
		// 将元素添加到列表中指定位置
		// 如果列表为null 报NullPointerException异常
		// 如果索引超出列表索引 报IndexOutOfBoundsException异常
		aList.add(0,"123");
		
		// 移除集合中指定元素
		aList.remove("123");
		
		// 将指定集合中的所有元素追加到此列表的末尾
		// 如果bList为null 报NullPointerException异常
		aList.addAll(bList);
		
		// 将指定集合中的所有元素添加到列表中指定位置
		// 如果列表为null 报NullPointerException异常
		// 如果索引超出列表索引 报IndexOutOfBoundsException异常
		aList.addAll(1, bList);
		
		// 判断集合中是否包含指定元素
		aList.contains("123");
		
		// 从此列表中删除所有元素（可选操作）。此调用返回后列表将为空。
		aList.clear();
		
		// 如果此列表包含指定集合的所有元素，则返回true
		aList.containsAll(aList);
		
		// 将指定对象与此列表进行比较以获得相等性。 
		// 当且仅当指定的对象也是列表时，返回true，两个列表具有相同的大小，并且两个列表中的所有相应元素对相等。
		// 列表元素顺序也必须一致
		aList.equals(bList);
		
		// lambda表达式  foreach用法
		aList.forEach(x -> System.out.println(x));
		aList.forEach(x -> {
			System.out.println(x);
		});
		
		// 获取当前集合的哈希值
		aList.hashCode();
		
		//获取当前元素的索引下标  不存在返回-1
		System.out.println(aList.indexOf("1111"));
		
		// 返回此列表中指定元素的最后一次出现的索引
		System.out.println(aList.lastIndexOf("1"));
		
		// 返回此列表中元素的列表迭代器
		// iterator()方法在set和list接口中都有定义，但是ListIterator（）仅存在于list接口中（或实现类中）
		// ListIterator有add()方法，可以向List中添加对象，而Iterator不能
		// ListIterator和Iterator都有hasNext()和next()方法，可以实现顺序向后遍历，但是ListIterator有hasPrevious()和previous()方法，可以实现逆向（顺序向前）遍历。Iterator就不可以。
		// ListIterator可以定位当前的索引位置，nextIndex()和previousIndex()可以实现。Iterator没有此功能。
		// 都可实现删除对象，但是ListIterator可以实现对象的修改，set()方法可以实现。Iierator仅能遍历，不能修改。
		ListIterator<String> it2 = aList.listIterator();
		while (it2.hasNext()) {
			String a = (String) it2.next();
			System.out.println(a);
		}
		
		// 返回此列表中元素的列表迭代器  从列表中的指定位置开始
		ListIterator<String> it3 = aList.listIterator(0);
		while (it3.hasNext()) {
			String a = (String) it3.next();
			System.out.println(a);
		}
		
		//aList.notify();
		//aList.notifyAll();
		
		//aList.parallelStream();
		
		// 删除此列表中指定位置的元素
		aList.add("123");
		aList.remove(0);
		
		// 从该列表中删除第一次出现的指定元素（如果存在）（可选操作）。
		aList.remove("123");
		
		// 从此列表中删除指定集合中包含的所有元素（可选操作）。
		aList.removeAll(bList);
		
		// 删除列表中满足条件的元素
		aList.removeIf(test->test.startsWith("1"));
		
		//用函数接口的返回结果替代原list中的值
		aList.replaceAll(t -> t + 1);
		aList.replaceAll(t -> {
			return t + "-";
		});
		
		// 只保留aList与bList中相同的元素
		aList.retainAll(bList);
		aList.forEach(x -> System.out.println(x));
		
		//使用指定的元素替换此列表中指定位置的元素（可选操作）。
		aList.add("123");
		aList.set(0, "6");
		
		//List排序 第一种
		List<People> sort1 = People.getPeopleList();
		Collections.sort(sort1,new PeopleCompareter());
		sort1.forEach(e -> {
			System.out.println(e.getAge());
		});
		
		//List排序 第二种 内部类
		List<People> sort2 = People.getPeopleList();
		class PeopleCompareter2 implements Comparator<People>{
			@Override
			public int compare(People o1, People o2) {
				return o1.getAge() - o2.getAge();
			}
		}
		Collections.sort(sort2, new PeopleCompareter2());
		System.out.println(sort2);
		
		//List排序 第三种 匿名类
		List<People> sort3 = People.getPeopleList();
		Collections.sort(sort3, new Comparator<People>() {
			@Override
			public int compare(People o1, People o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		
		//List排序 第四种 lambda表达式
		List<People> sort4 = People.getPeopleList();
		Collections.sort(sort4, (People o1,People o2) -> o1.getAge() - o2.getAge());
		System.out.println(sort4);
		
		//List排序 第五种 借助Comparator和lamdba表达式多条件排序
		List<People> sort5 = People.getPeopleList();
		Collections.sort(sort5, Comparator.comparing(People::getAge).thenComparing(People::getName));
		System.out.println(sort5);
		
		/** 以上排序默认都是升序排列 */
		/** 以下排序都是降序排列 */
		
		//List排序 第六种 原理同上
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
		
		//返回集合从fromindex到toindex-1之间的集合内容
		List<People> l1 =  sort7.subList(1, 2);
		l1.forEach(e -> {
			System.out.println(e.getName());
		});
		
		//将当前集合以数组形式返回
		aList.toArray();
		
		aList.add("1");
		aList.add("2");
		System.out.println(aList.toString());//[1,2]
	}
}
