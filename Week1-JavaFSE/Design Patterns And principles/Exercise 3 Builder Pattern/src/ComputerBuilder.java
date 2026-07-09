public class ComputerBuilder {

    private String processor;
    private int ram;
    private int storage;

    public ComputerBuilder setProcessor(String processor) {

        this.processor = processor;
        return this;

    }

    public ComputerBuilder setRAM(int ram) {

        this.ram = ram;
        return this;

    }

    public ComputerBuilder setStorage(int storage) {

        this.storage = storage;
        return this;

    }

    public Computer build() {

        return new Computer(processor, ram, storage);

    }

}