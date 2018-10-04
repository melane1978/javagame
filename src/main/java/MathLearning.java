package main.java;

class MathLearning {

static double a = 10;
static double b = 15;
static double c = 22;

static int counter = 0;

    public static void main(String[] args) {
    
        double result;
        double resultTwo;
        double resultThree;
        double resultFour;
        double resultFive;

        result = a + b;
        resultTwo = a - b;
        resultThree = a * c;
        resultFour = c / b;
        resultFive = c % b;

        blaBlabla(result);
        blaBlabla(resultTwo);
        blaBlabla(resultThree);
        blaBlabla(resultFour);
        blaBlabla(resultFive);
    }
        public static void blaBlabla(dubble output) {
           
            counter++;
           
            System.out.println("Result " + counter + " is " +  output);
        }

    }   
