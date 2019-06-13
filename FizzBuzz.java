public class FizzBuzz {
    public String fizzBuzz(int number){
    String val = "";
        if (number % 3 == 0){
        val += "Fizz";
    }
    if (number % 5 == 0){
        val += "Buzz";
    }
    return val;
    }
}