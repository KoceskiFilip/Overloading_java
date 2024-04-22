
class A {
    public void do_it() {
        System.out.println("A");
    }

    public void do_it(String str) {
        System.out.println(str);
    }
}

class B {
    public static void main(String[] args) {
        A object = new A(); // "new" keyword was not properly capitalized
        object.do_it("B!"); // Corrected method call syntax
    }
}





//class Adder{  
//static int add(int a,int b){return a+b;}  
//static int add(int a,int b,int c){return a+b+c;}  
//}  
//class TestOverloading1{  
//public static void main(String[] args){  
//System.out.println(Adder.add(11,11));  
//System.out.println(Adder.add(11,11,11));  
//}}  
