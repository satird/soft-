package task1;

public class Task1 {
    public static void main(String[] args) {
        Employee tester = new Employee(7,"Developer");
        System.out.println(tester.getId());
        System.out.println(tester.getVacancy());
    }
}

class Employee {
    private long id;
    private Vacancy vacancy;
    private String job;

    public Employee(long id, String job) {
        this.id = id;
        this.job = job;
    }

    String getVacancy() {
        vacancy = new Vacancy(job);
        return vacancy.getVacancy();
    }

    long getId() {
        return id;
    }
}

class Vacancy {
    String job;

    public Vacancy() {
    }

    public Vacancy(String job) {
        this.job = job;
    }

    String getVacancy() {
        if (job == null)
            return "engineer";
        else return job;
    }
}