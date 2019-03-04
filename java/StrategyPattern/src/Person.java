public class Person {
    private Travel travel;
    public Person(Travel travel){
        this.travel = travel;
    }

    public void takeHoliday(){
        System.out.println("we take a holiday.");
        travel.travel();
    }
}
