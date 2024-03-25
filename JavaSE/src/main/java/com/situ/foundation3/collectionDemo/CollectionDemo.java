package com.situ.foundation3.collectionDemo;

import org.junit.Test;

import java.util.*;

public class CollectionDemo {

    @Test
    public void test() {
        //数组的问题：下标确定，不够灵活
        Student[] students = new Student[3];
        //ArrayList解决这个问题
        ArrayList<Student> list = new ArrayList<>();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        for (Student student : list) {
            System.out.println(student);
        }
    }

    @Test
    public void test1() {
        //有序
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("B");
        System.out.println(list);//  [A, B, C, B]

        //有序
        LinkedList<String> list1 = new LinkedList<>();
        list1.addFirst("A");
        list1.addFirst("B");
        list1.addLast("D");
        list1.add("C");
        list1.add("C");

        System.out.println(list1);//  [B, A, D, C, C]

    }

    @Test
    public void test2() {
        //无序
        HashMap<String, String> map = new HashMap<>();
        map.put("CN", "中国");
        map.put("US", "美国");
        map.put("UK", "英国");
        System.out.println(map);//{UK=英国, CN=中国, US=美国}
        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> entry : set) {
            System.out.println(entry);
        }
        System.out.println("-----------");
        String country = map.get("CN");
        System.out.println(country);

        System.out.println("-----------");
        Set<String> keyset = map.keySet();

        for (String key : keyset) {
            System.out.println(key + " : " + map.get(key));
        }

        //        UK=英国
        //        CN=中国
        //        US=美国
        //        -----------
        //        中国
        //        -----------
        //        UK : 英国
        //        CN : 中国
        //        US : 美国

    }

    @Test
    public void test3() {
        //Iterator迭代器
        HashMap<String, String> map = new HashMap<>();
        map.put("CN", "中国");
        map.put("US", "美国");
        map.put("UK", "英国");
        Set<String> keyset = map.keySet();
        Iterator<String> iterator = keyset.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " : " + map.get(key));
        }
    }
}
