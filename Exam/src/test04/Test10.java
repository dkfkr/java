package test04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test10 {

	public static void main(String[] args) {
		
		List<Apple> list1 = new ArrayList<>();
		list1.add(new Apple("파주", 3000));
		list1.add(new Apple("파주", 3000));
		list1.add(new Apple("파주", 3000));
		
		List<Apple> list2 = new ArrayList<>();
		list1.add(new Apple("파주", 3000));
		list1.add(new Apple("파주", 3000));
		list1.add(new Apple("파주", 3000));
		
		List<Apple> list3 = new ArrayList<>();
		list1.add(new Apple("파주", 3000));
		list1.add(new Apple("파주", 3000));
		list1.add(new Apple("파주", 3000));
		
		Map<String, List<Apple>> map = new HashMap<>();
		map.put("gyeonggi", list1);
		map.put("chingbuk", list1);
		map.put("gyungnam", list1);
		
		List<Apple> list = map.get("gyeonggi");
		Apple apple = list.get(2);
		apple.show();
		
		map.get("chingbuk").get(1).show();
		
		map.get("gyungnam").get(0).show();
		
	}

}
