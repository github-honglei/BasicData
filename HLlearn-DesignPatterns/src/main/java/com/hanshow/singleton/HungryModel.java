package com.hanshow.singleton;

/**
 * 
 *
 */
public class HungryModel 
{
    private static HungryModel hungryModel = new HungryModel();
    
    // 构造方法私有访问 外部无法产生新的对象
    private HungryModel() {
    	
    }
    
    public static HungryModel getInstance() {
    	return hungryModel;
    }
    
    public void print() {
    	System.out.println("Hello Singleton");
    }
}
