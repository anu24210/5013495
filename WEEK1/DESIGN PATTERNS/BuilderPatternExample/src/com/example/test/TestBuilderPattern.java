package com.example.test;
import com.example.builder.*;
public class TestBuilderPattern {

	public static void main(String[] args) {
  
        Computer basicComputer = new Computer.Builder()
            .setCPU("Intel i3")
            .setRAM("8GB")
            .setStorage("256GB SSD")
            .build();

        System.out.println("Basic Computer Configuration:");
        System.out.println("CPU: " + basicComputer.getCPU());
        System.out.println("RAM: " + basicComputer.getRAM());
        System.out.println("Storage: " + basicComputer.getStorage());

        Computer advancedComputer = new Computer.Builder()
            .setCPU("Intel i9")
            .setRAM("32GB")
            .setStorage("1TB SSD")
            .setGPU("NVIDIA RTX 3080")
            .setMotherboard("ASUS ROG")
            .setPowerSupply("750W")
            .setCoolingSystem("Liquid Cooling")
            .build();

        System.out.println("\nAdvanced Computer Configuration:");
        System.out.println("CPU: " + advancedComputer.getCPU());
        System.out.println("RAM: " + advancedComputer.getRAM());
        System.out.println("Storage: " + advancedComputer.getStorage());
        System.out.println("GPU: " + advancedComputer.getGPU());
        System.out.println("Motherboard: " + advancedComputer.getMotherboard());
        System.out.println("Power Supply: " + advancedComputer.getPowerSupply());
        System.out.println("Cooling System: " + advancedComputer.getCoolingSystem());
    }
	

}
