interface  Back{

        void m1();
        void m2();
        void m3();
    }
       class Front implements Back{
        @override                           // Front is not abstrct and does not override abstract method m3() in back
        public void m1(){
            System.out.println("hello");
        }
                public void m2(){
            System.out.println("hello");
        }
        
            public static void main(String args[]){
                Back c =new Front();
                             c.m1();
            }
        
       }

