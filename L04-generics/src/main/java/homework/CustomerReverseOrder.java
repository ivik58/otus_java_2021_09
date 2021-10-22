package homework;


import java.util.ArrayDeque;

public class CustomerReverseOrder {

    //todo: 2. надо реализовать методы этого класса
    //надо подобрать подходящую структуру данных, тогда решение будет в "две строчки"

    private ArrayDeque<Customer> arrayDeque = new ArrayDeque<>();

    public void add(Customer customer) {
        arrayDeque.add(customer);
    }

    public Customer take() {
        return arrayDeque.removeLast(); // это "заглушка, чтобы скомилировать"
    }
}