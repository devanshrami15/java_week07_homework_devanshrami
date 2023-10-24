package homework_w7;

/**
 * Person
 * Write a class with the name Person. The class needs three fields (instance variables) with the names
 * firstName, lastName of type String and age of type int.
 * Write the following methods (instance methods):
 * <p>
 * Method named getFirstName without any parameters, it needs to return the value of the firstName
 * field.
 */

public class Programme14_Person {
    String FirstName;
    String LastName;
    int age;

    //    //Write the following methods (instance methods):
    ////*Method named getFirstName without any parameters, it needs to return the value of the firstName

    public String getFirstName() {
        this.FirstName = FirstName;
        System.out.println("FirstName:");
        System.out.println(" ");
        return FirstName;
    }

    //    *Method named getLastName without any parameters, it needs to return the value of the lastName


    public String getLastName() {
        this.LastName = LastName;
        System.out.println("LastName: ");
        System.out.println(" ");
        return LastName;
    }
        // *Method named getAge without any parameters, it needs to return the value of the age field.
        public int getAge() {
            int age = 18;
            this.age = age;
            return age;
        }
            //*Method named setFirstName with one parameter of type String, it needs to set the value of the
            //firstname field.
            public String setFirstName() {
                String firstName = this.FirstName;
                System.out.println("john");
                return FirstName;
//*Method named setLastName with one parameter of type String, it needs to set the value of the
//lastName field.
            }
                public String setLastName() {
                    String firstName = this.LastName;
                    System.out.println("smith");
                    return LastName;
                }

                    //*Method named setAge with one parameter of type int, it needs to set the value of the age field. If
//the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
                    public int setAge () {
                        int age = 18;
                        if (age < 0) {
                            ;
                        } else if (age > 100) {
                        } else {
                            age = 0;
                        }
                        this.age = age;
                        return age;
                    }

                    //*Method named isTeen without any parameters, it needs to return true if the value of the age field is
                    //greater than 12 and less than 20, otherwise, return false.
                    public boolean isTeen() {
                        if (age > 12) {
                            System.out.println("false");

                        } else if (age > 20) {
                            System.out.println("true");

                        }
                        return false;
                    }
                    public String getFullName()
                    {
                        System.out.println("john smith");
                        return FirstName + LastName;
                        //   return FirstName +""+ LastName;
                    }
                    public static void main(String[] args) {

                        Programme14_Person p = new Programme14_Person();
                        p.getFirstName();
                        p.getLastName();
                        p.getAge();
                        p.setFirstName();
                        p.setLastName();
                        p.setAge();
                        System.out.println("fullName= " + p.getFullName());

                    }
                }





