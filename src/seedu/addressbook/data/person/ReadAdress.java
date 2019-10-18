package seedu.addressbook.data.person;

public interface ReadAdress {
    Block getBlock();
    Street getStreet();
    Unit getUnit();
    PostalCode getPostalCode();

}
