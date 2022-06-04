// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Keys{
    int keyNumber;
    String keyName;
    static int count;
    Keys(){
        count++;
        System.out.println(count+" key Created");
    }
    Keys(int keyNumber, String keyName){
        this();
        /*to Remove ambiguity in variables because we want to take same name without any confusion*/
        this.keyNumber=keyNumber;
        this.keyName=keyName;
    }
}
class Main {
    public static void main(String[] args) {
        Keys key1=new Keys();
        key1.keyNumber=101;
        key1.keyName="EnterKey";

        System.out.println(key1.keyNumber +" "+ key1.keyName); 
        Keys key2=new Keys(102,"ShiftKey");
        System.out.println(key2.keyNumber +" "+ key2.keyName); 

        

    }
}