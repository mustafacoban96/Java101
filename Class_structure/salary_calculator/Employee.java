public class Employee {
    private String name;
    private int salary;
    private int workHour;
    private int hireYear;

    public Employee(String name, int salary, int workHour, int hireYear){
        this.setName(name);
        this.setSalary(salary);
        this.setWorkHour(workHour);
        this.setHireYear(hireYear);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHour() {
        return workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
    public double tax(){
        double vergi;
        if (getSalary()>1000){
            vergi = getSalary()*0.03;
            return vergi;
        }else{
            System.out.println("Verginiz yok.");
            return 0;
        }
    }
    public int fbonus(){
        int workHour1 = 40;
        int bonus=1;
        if(getWorkHour()>workHour1){
            bonus = (getWorkHour()-workHour1)*30;
            return bonus;
        }else{
            System.out.println("Bonus yok");
            return 0;
        }

    }
    public double raiseSalary(){
        int nowYear = 2021;
        double raise=1.0;
        if(nowYear-getHireYear()<10){
            raise = getSalary()*0.05;
            return raise;
        }
        else if(9<nowYear-getHireYear() && nowYear-getHireYear()<20){
            raise = getSalary()*0.1;
            return raise;
        } else if (nowYear-getHireYear()>19 ) {
            raise = getSalary()*0.15;
            return raise;
        }else {
            System.out.println("Maaş artışı yapılmadı.");
            return 0;
        }

    }
}
