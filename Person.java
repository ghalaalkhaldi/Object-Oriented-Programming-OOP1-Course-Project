package superbrush;

abstract class Person {
    private String name;
    private int number;
 

    public Person(){}
    
    public Person(String name, int number) { // constructor
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " ,Number: " + this.number;
    }

    abstract public int rating() ;
}

 
    

