package VotingProjectPackage;

public class Person {
    /*We instantiate the name,age and the gender of any individual */
        private String name;
        private int age;
        private char gender;

    /*The Constuctor that assigns the varibles*/
        Person(String name, int age, char gender){
            this.name= name;
            this.age=age;
            this.gender= gender;

        }
     /*Getter method: this returns the value for name, age and gender*/
        public  String getName(){
            return name;
        }
        public  int getAge(){
            return age;
        }

        public char getGender(){
            return gender;
        }
      /*tostring: return the name, age and gender of the person */
        public String toString(){
            return "Name:"+getName()+"\nAge: " + getAge()+"\nGender: "+getGender();
        }

}

