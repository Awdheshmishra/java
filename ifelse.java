public class ifelse {
    public static void main(String[] args) {
        boolean ismale=true;
        String name="ram";
        System.out.println("before if");
        if(ismale){
            System.out.println("mr"+name);

        }else{
            System.out.println("ms"+name);

        }
        System.out.println("after if");


        boolean isseniorcitizen=true;
        boolean isanadult=false;
        if(isseniorcitizen){
            System.out.println("hello senior ");
        }else{
            if(isanadult){
                System.out.println("hello adult ");
        }else{
            System.out.println("hello child");
        }
    }
    }
}
