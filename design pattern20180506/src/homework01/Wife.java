package homework01;

import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * @author Sunset
 * 固定数量的妻子类
 */
public class Wife {
	//定义最多能产生的实例数量
	private static int maxNumOfWife=4;
	//每个妻子有名字，使用ArrayList来容纳，每个对象的私有属性
	private static ArrayList<String> nameList=new ArrayList<String>();
	//定义一个列表，容纳所以的妻子实例
	private static ArrayList<Wife> wifeList=new ArrayList<Wife>();
	//当前妻子的序列号
	private static int countNumOfWife=0;
	//产生所有的对象
	static{
		for(int i=0;i<maxNumOfWife;i++){
			wifeList.add(new Wife("妻子"+(i+1)));
		}
	}
	//传入妻子名称，建立一个妻子对象
	private Wife(String name){
		nameList.add(name);
	}
	//随机获得一个妻子对象
	public static Wife getInstance(){
		Random random=new Random();
		//随机拉出一个妻子
		countNumOfWife=random.nextInt(maxNumOfWife);
		return wifeList.get(countNumOfWife);
	}
	//妻子接待客人
	public static void receive(){
		System.out.println(nameList.get(countNumOfWife));
	}
}
