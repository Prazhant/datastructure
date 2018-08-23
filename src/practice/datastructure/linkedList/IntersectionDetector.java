package practice.datastructure.linkedList;

public class IntersectionDetector {
    public String detect(MyLinkedList<String> list1, MyLinkedList<String> list2) {
        int list1Size = list1.getSize();
        int list2Size = list2.getSize();


        Node currentForList1 = list1.getHead();
        Node currentForList2 = list2.getHead();


        int sizeDiff = Math.abs(list1Size-list2Size);
        if(sizeDiff>0){
                if(list1Size>list2Size){
                    currentForList1= moveCurrentAheadToEqualOtherList(list1,currentForList1,sizeDiff);
                }  else{
                    currentForList2=moveCurrentAheadToEqualOtherList(list2,currentForList2,sizeDiff);
                }
        }

        while(currentForList1.getNext()!=null){
            if(currentForList1.getElement().equals(currentForList2.getElement())){
                return (String) currentForList1.getElement();
            }
            currentForList1=currentForList1.getNext();
            currentForList2=currentForList2.getNext();
        }
        return null;
    }

    private Node moveCurrentAheadToEqualOtherList(MyLinkedList<String> list, Node currentForList1, int sizeDiff) {
        for (int i =0;i<sizeDiff;i++){
            currentForList1 = currentForList1.getNext();
        }
        return currentForList1;
    }

}
