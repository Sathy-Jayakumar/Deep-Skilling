public class Computer {

    private String processor;
    private int ram;
    private int storage;

    public Computer(String processor, int ram, int storage) {

        this.processor = processor;
        this.ram = ram;
        this.storage = storage;

    }

    public void display() {

        System.out.println("Processor : " + processor);
        System.out.println("RAM       : " + ram + " GB");
        System.out.println("Storage   : " + storage + " GB");

    }

}