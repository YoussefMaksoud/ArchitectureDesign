package MTQuestionEight;

public class CompositionDemo {

    public static void main(String args[]){

        Individual father1 = new Individual("John", "Snow");
        Individual mother1 = new Individual("Carrie", "Snow");

        Individual childOf1A = new Individual(father1, mother1, "Lincoln");
        Individual childOf1B = new Individual(father1, mother1, "Jeff");
        Individual childOf1C = new Individual(father1, mother1, "Robert");
        Individual childOf1D = new Individual(father1, mother1, "Sally");

        Individual father2 = new Individual("Ash", "IngleWood");
        Individual mother2 = new Individual("Lesley", "IngleWood");

        Individual childOf2A = new Individual(father2, mother2, "Luke");
        Individual childOf2B = new Individual(father2, mother2, "Heather");
        Individual childOf2C = new Individual(father2, mother2, "Skye");
        Individual childOf2D = new Individual(father2, mother2, "Rebecca");

        System.out.println(childOf2B.toString()); // print this child who has no children

        Individual childOfChildA = new Individual(childOf1B, childOf2B, "Ayman");

        System.out.println("\n\n\n\n" + childOfChildA.toString()); // print the new child

        System.out.println("\n\n\n\n" + childOf2B.toString());//reprint the first child who now has children
    }
}
