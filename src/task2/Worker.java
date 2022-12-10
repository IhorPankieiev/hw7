package task2;


import java.util.*;

public class Worker implements Comparable<Worker>{
    public String name;
    private String title;
    private int yearOfEmployment;

    @Override
    public String toString() {
        return "\nName: " + name  +
                "\nTitle: " + title +
                "\nYear of Employment: " + yearOfEmployment;
    }

    public String getName() {
        return name;
    }


    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    @Override
    public int compareTo(Worker o) {
        return this.name.compareTo(o.getName());
    }


    public Worker(String name, String title, int yearOfEmployment) {
        this.name = name;
        this.title = title;
        this.yearOfEmployment = yearOfEmployment;
    }
}

class Main{

    public static void main(String[] args) {


                try {
                    ArrayList<Worker> workersList = new ArrayList<>();
                    for (int i = 0; i < 5; i++) {
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Enter name of the worker:");
                        String name = sc.nextLine();
                        System.out.println("Enter job title:");
                        String title = sc.nextLine();
                        System.out.println("Enter year of employment:");
                        int yearOfEmployment = sc.nextInt();

                        workersList.add(new Worker(name, title, yearOfEmployment));

                    }//for

                    Collections.sort(workersList);
                    System.out.println("List of workers sorted in alphabetical order:" + "\n" + workersList.toString());

                    int year = 2022;
                    Scanner sc = new Scanner(System.in);

                    System.out.println("Enter years of experience:");
                    int yearsOfExperience = sc.nextInt();
                    for (Worker temp : workersList) {
                        if((year - temp.getYearOfEmployment()) > yearsOfExperience){
                            System.out.println("Name of the workers with experience over then required: " + temp.getName());
                        }
                    }
                }//try

                catch (InputMismatchException e) {
                    System.out.println(e + "\nEnter year in correct format:yyyy");
                }//catch

    }//main
}//class
