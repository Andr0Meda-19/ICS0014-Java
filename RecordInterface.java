public interface RecordInterface {

    String sayHello();

    String composeRecordName(int price);

    String composeRecordName(int price, boolean hasDiscount);

    String composeRecordName(int price, boolean hasDiscount, boolean isNew);
}
