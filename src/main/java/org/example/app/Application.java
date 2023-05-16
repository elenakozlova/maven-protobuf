package org.example.app;

import org.example.protobuf.AddressBookProtos;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        int id = new Random().nextInt();
        String name = "Test";
        String email = "test@example.org";
        String number = "01234567890";

        AddressBookProtos.Person person = AddressBookProtos.Person.newBuilder()
                .setId(id)
                .setName(name)
                .setEmail(email)
                .addNumbers(number)
                .build();

        AddressBookProtos.AddressBook addressBook = AddressBookProtos.AddressBook.newBuilder()
                .addPeople(person)
                .build();

        System.out.println(addressBook);
    }
}
