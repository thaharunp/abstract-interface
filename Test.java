interface Demo{
    int p=100;

}
 class Test implements Demo{
    public static void main(String args[]){
        int p=93;
        Demo t = new Test();
        System.out.println(p);
        System.out.println(Demo.p);

    }
 }