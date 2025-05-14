public class Main {
   public static void main(String[] args) {
        animalChecker("dog");
        animalChecker("shark");
   /*public static void main(String[] args) {
       int result = power(5, 2);
       System.out.println(result);
   }
*/

    /*public  static int power(int a, int b){
            int result = 1;
            for (int i = 1; i <= b; i++){
               result *= a;
            }
            return result;
        }

    }*/



    public static  void  animalChecker(String animal){
        switch (animal){
            case "dog":
                System.out.println("I am the dog");
                break;
            case "cat":
                System.out.println("I am the cat");
                break;
            case "lion":
                System.out.println("I am the lion");
                break;
            case "pig":
                System.out.println("I am the pig");
                break;
            default:
                System.out.println("I am the Animal");
        }
      }
    }

