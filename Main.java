  import java.util.Date;


public class Main {
  // class is a contanier for one or many classes the name of the class is also Main 
  // the uperletter is becuase classes name based on Pascal Naming Convention means upper letter for the classes 
  // when a fucntion blongs to  a class we call it a method of the class
  // class access modifier is if this class can be accesable for other fucntions and classes --> public is a modifier 
public static void main(String[] args) {
  // void : it's not goning to return a value
  // every program in Java at least needs to have one fucntion calls main but it should always blong to a class 
    // for method we use camel Naming Convention mean lower letter 
    // the parameters of the fucntion 
  // print a string 
  System.out.println("Hello Java !");
  // type of the data (variable and constansts arrays list ,...)
  int age = 30, myAge = 20 ; 
  System.out.println(age);
  // primitive : for storing simple values: byte [-128,127] , short [-32K, 32K] int 4 byte [-2B, 2B], long 8 byte for integer 

  // for float : 4 byte  
  //double : 8 byte
  // char:  2 bytes
  //boolean: 1 bytes 
  byte yourAge = 30;
  long viewsCount = 123_456_789L;
  float price = 10.99F;
  char letter = 'A';
  boolean isEligibile = false;
  // we can use underscore for seprating the values
  
  // reference : for storing complex object  data and mail massages

  // declaring refrence we need to allocate memory
  Date now = new Date(); //object
  // access to the intity with dot operator 
  now.getTime();
  System.out.println(now);
  // memory manegment for primiry variable and reference variable is diffrent.
  String message = "  Hellow java" + "!!";
  System.out.println(message);
  System.out.println(message.endsWith("!!"));
  System.out.println(message.length());
  System.out.println(message.indexOf("a")); 
 // a does not exist
  System.out.println(message.replace("!", "*"));
    System.out.println(message);
  // in java string are imutable means we can not change them
  System.out.println(message.trim()); // get rid of white spaces  

}
}