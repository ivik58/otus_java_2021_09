package homework;


import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CustomerService {

    //todo: 3. надо реализовать методы этого класса
    //важно подобрать подходящую Map-у, посмотрите на редко используемые методы, они тут полезны
    private TreeMap<Customer, String> map = new TreeMap(Comparator.comparing(Customer::getScores));

    public Map.Entry<Customer, String> getSmallest() {
        Map.Entry<Customer, String> entry = map.firstEntry();
        return entry != null ? Map.entry(entry.getKey().clone(), entry.getValue()) : null;
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        Map.Entry<Customer, String> entry = map.higherEntry(customer);
        return entry != null ? Map.entry(entry.getKey().clone(), entry.getValue()) : null;
    }

    public void add(Customer customer, String data) {
        map.put(customer, data);
    }
}