package Placement_Training;

public class TaxCalculator {
    // Method to calculate tax
    public void calcTax(Person person){
        if(person.getAge() > 65 || person.getGender().equalsIgnoreCase("Female")) {
            person.setTax(0);
            System.out.println("Tax not applicable");
        } else {
            if (person.getIncome() < 160000) {
                person.setTax(0);
                System.out.println("Tax not applicable for this income slab");
            } else if (person.getIncome() > 160000 && person.getIncome() < 500000) {
                int taxableIncome = person.getIncome() - 160000;
                person.setTax((taxableIncome * 10)/100);
                System.out.println("The person has paid 10% tax");
            } else if (person.getIncome() > 500000 && person.getIncome() < 800000) {
                int taxableIncome = person.getIncome() - 160000;
                person.setTax((taxableIncome * 20)/100);
                System.out.println("The person has paid 20% tax");
            } else {
                int taxableIncome = person.getIncome() - 160000;
                person.setTax((taxableIncome * 30)/100);
                System.out.println("The person has paid 30% tax");
            }

        }
    }
}
