package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address extends Contact implements Printable, ReadAdress

    private Block block;
    private Street street;
    private Unit unit;
    private PostalCode postalCode;
    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses can be in any format";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";

    public final String value;

    public Address(Block block, Street street, Unit unit, PostalCode postalCode){
        this.block = block;
        this.street = street;
        this.unit = unit;
        this.postalCode = postalCode;
        this.value = block.toString() + street.toString() + unit.toString() + postalCode.toString();
    }

    @Override
    public Block getBlock(){
        return block;
    }

    @Override
    public Street getStreet(){
        return street;
    }

    @Override
    public Unit getUnit(){
        return unit;
    }

    @Override
    public PostalCode getPostalCode(){
        return postalCode;
    }

    public Address(String address, boolean isPrivate) throws IllegalValueException {
        super(address,isPrivate);
        String trimmedAddress = address.trim();
        if (!isValidAddress(trimmedAddress)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        this.value = trimmedAddress;
    }

    /**
     * Returns true if a given string is a valid person address.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public void getPrintableString() {
        System.out.println("Address: "+this.value);
    }
}
