
@FunctionalInterface
interface temp{
    public void display();
}

//class temp1 implements temp{
//    public void display(){
//        System.out.println("hello");
//    }
//}


public class practise1 {
    public static void main(String args[]){

//        temp1 t1 = new temp1();

        temp t1 = new temp(){
            public void display(){
                System.out.println("hello");
            }
        };

        t1.display();

    }
}
