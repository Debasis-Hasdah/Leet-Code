
import java.util.LinkedList;

public class PractOne {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);

        int ele=7;
        
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            if(ele==list.get(i)){
                System.out.print(i);
            }
        }
    }
}
