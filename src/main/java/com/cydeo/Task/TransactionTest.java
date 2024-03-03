package com.cydeo.Task;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class TransactionTest {
    public static void main(String[] args) {
        System.out.println("==================Find all transactions in 2011 and sort by value======================");
        TransactionData.getAll().stream().filter(i-> i.getYear() ==2011).sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out::println);


        System.out.println("==========================What are all the unique cities where the traders work?===================");
        TransactionData.getAll().stream().map(transaction -> transaction.getTrader().getCity()).distinct().forEach(System.out::println);


        System.out.println("========================== Find all traders from Cambridge and sort them by name===================");
        TransactionData.getAll().stream().map(Transaction::getTrader).filter(i->i.getCity().equals("Cambridge")).distinct().sorted(Comparator.comparing(Trader::getName)).forEach(System.out::println);
        // distinct make them natural order


        System.out.println("==========================Return a string of all trader's names sorted alphabetically===================");
        TransactionData.getAll().stream().map(i->i.getTrader().getName()).distinct().sorted().forEach(System.out::println);


        System.out.println("==========================Are any traders based in Milan?===================");
         Boolean result1= TransactionData.getAll().stream().anyMatch(city->city.getTrader().getCity().equals("Milan"));
        System.out.println(result1);


        System.out.println("==========================Print the values of all transactions from the traders living in Cambridge===================");
         TransactionData.getAll().stream().filter(transaction -> transaction.getTrader().getCity().equals("Cambridge")).map(Transaction::getValue).forEach(System.out::println);


        System.out.println("==========================What is the highest value of all the transactions===================");
        Optional<Transaction> maxValue = TransactionData.getAll().stream().max(Comparator.comparing(Transaction::getValue));
        System.out.println(maxValue.get().getValue());
//        Optional<Integer> high = TransactionData.getAll().stream()
//                .map(Transaction::getValue)
//                .reduce(Integer::max);
//        System.out.println(high.get());

        System.out.println("==========================Find the transaction with the smallest value===================");
        Optional<Transaction> min = TransactionData.getAll().stream().min(Comparator.comparing(Transaction::getValue));
        System.out.println(min);














    }
}
