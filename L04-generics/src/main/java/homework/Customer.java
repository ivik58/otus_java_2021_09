package homework;

public class Customer {
    private final long id;
    private String name;
    private long scores;

    //todo: 1. в этом классе надо исправить ошибки

    public Customer(long id, String name, long scores) {
        this.id = id;
        this.name = name;
        this.scores = scores;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getScores() {
        return scores;
    }

    public void setScores(long scores) {
        this.scores = scores;
    }

    public Customer clone(){
        return new Customer(id, name, scores);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", scores=" + scores +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        return id == customer.id;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        //result = 31 * result + (name != null ? name.hashCode() : 0);
        //result = 31 * result + (int) (scores ^ (scores >>> 32));
        return result;
    }

    public static void main(String[] args) {
        Customer customer = new Customer(1L, "Ivan", 233);
        Customer customer2 = new Customer(1L, "IvanChangedName", 243);
        System.out.println(customer.hashCode() == customer2.hashCode());
    }
}