public abstract class NumberGenerator{
    private String name;

    public NumberGenerator(String name){ //constructor of NumberGenerators//
        this.name = name;
    }

    public String getName(){           //method to get name beacasue name is pravite //
        return name;                   //retuen the name//
    }
    public abstract int generate(int a, int b);             //the abstract method for the sub class to override// 
}
