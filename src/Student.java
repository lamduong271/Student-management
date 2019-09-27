public class Student {
    private int id;
    private String name;
    private  int grade;
    private int feePaid;
    private int feeTotal;

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feePaid = 0;
        this.feeTotal = 30000;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void payFees(int fees) {
        feePaid += fees;
        School.updateTotalMoneyEarned(feePaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeePaid() {
        return feePaid;
    }

    public int getFeeTotal() {
        return feeTotal;
    }

    public int getRemainingFees() {
        return feeTotal - feePaid;
    }
}
