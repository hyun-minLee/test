import javax.lang.model.SourceVersion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Stack {

    List<Integer> list = new ArrayList<Integer>();

    public int pop() {
        if(list.isEmpty()) {
            return -1;
        } else {
            int temp =(int)list.get(list.size()-1);
            System.out.println(temp);
            list.remove(list.size()-1);
            return temp;
        }
    }
    public void push(int x) {
        list.add(x);
        System.out.println("stack = " + list);
    }
    public int size() {
        System.out.println(list.size());
        return list.size();

    }
    public int empty() {
        int temp=0;
        if(list.isEmpty()) {
            temp=1;
            System.out.println(temp);
            return 1;
        } else {
            System.out.println(temp);
            return temp;
        }
    }

    public int top() {

        if(list.isEmpty()) {
            System.out.println(-1);
            return -1;
        } else {
            System.out.println(list.get(list.size()-1));
            return list.get(list.size()-1);
        }
    }


    public static void main(String[] args) {

        int temp=0;
        Stack stack =new Stack();
        System.out.println("stack.arr = " + stack.list);

        System.out.println("count 입력하세요.");
        Scanner scan = new Scanner(System.in);
        int count= scan.nextInt();
        while(temp<=count) {
            String a = scan.nextLine();
            String[] arr = a.split(" ");
            if (arr[0].equals("push")) {
                stack.push(Integer.parseInt(arr[1]));
            } else {
                if (arr[0].equals("top")) {
                    stack.top();

                }
                if (arr[0].equals("size")) {
                    stack.size();
                }
                if (arr[0].equals("pop")) {
                    stack.pop();
                }
                if (arr[0].equals("empty")) {
                    stack.empty();

                }
            }
            temp++;
        }
        System.out.println("stack = " + stack.list);

    }
}