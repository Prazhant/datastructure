package practice.datastructure.linkedList;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntersectionOfMyLinkedListTest {


    @Test
    public void findIntersection_whenTwoValidLists_returnsIntersection(){


        MyLinkedList<String> list1 = new MyLinkedList<>();
        MyLinkedList<String> list2 = new MyLinkedList<>();

        String real_madrid = new String("Real Madrid");
        String juventus = new String ("Juventus");
        String roma = new String("Roma");
        String barcelona = new String("Barcelona");
        String liverpool = new String("Liverpool");
        String manUnited = new String("Manchester United");
        String everton = new String("Everton");
        String manCity = new String("Manchester City");

        list1.add(manUnited);
        list1.add(liverpool);
        list1.add(real_madrid);
        list1.add(barcelona);
        list1.add(juventus);
        list1.add(roma);


        list2.add(manUnited);
        list2.add(liverpool);
        list2.add(everton);
        list2.add(manCity);

        System.out.println("list1: "+list1.printList());
        System.out.println("list2: "+list2.printList());

        IntersectionDetector intersection = new IntersectionDetector();

        assertEquals(liverpool,intersection.detect(list1,list2));
    }
}