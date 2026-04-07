class CPU {

    int price;

    public CPU(int p) {
        this.price = p;
    }

    void display() {
        System.out.println("Price of CPU: " + this.price);
    }

    // Non-static inner class
    class Processor {
        int cores;
        String manufacturer;

        Processor(int core, String manf) {
            this.cores = core;
            this.manufacturer = manf;
        }

        void display() {
            System.out.println("No of cores: " + this.cores);
            System.out.println("Processor manufacturer: " + this.manufacturer);
        }
    }

    // Static nested class
    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("Memory size: " + this.memory + " GB");
            System.out.println("Memory manufacturer: " + this.manufacturer);
        }
    }

    public static void main(String[] args) {

        CPU intel = new CPU(23000);

        CPU.Processor p = intel.new Processor(8, "Intel");

        CPU.RAM ram = new CPU.RAM(64, "Asus");

        intel.display();
        p.display();
        ram.display();
    }
}

