package com.klef.jfsd.exam;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final DeviceRepository deviceRepository;

    public DataLoader(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    @Override
    public void run(String... args) {
        // Insert a Device
        Device device = new Device();
        device.setBrand("Generic");
        device.setModel("D-1000");
        device.setPrice(299.99);
        deviceRepository.save(device);

        // Insert a Smartphone
        Smartphone smartphone = new Smartphone();
        smartphone.setBrand("Samsung");
        smartphone.setModel("Galaxy S21");
        smartphone.setPrice(899.99);
        smartphone.setOperatingSystem("Android");
        smartphone.setCameraResolution("108 MP");
        deviceRepository.save(smartphone);

        // Insert a Tablet
        Tablet tablet = new Tablet();
        tablet.setBrand("Apple");
        tablet.setModel("iPad Air");
        tablet.setPrice(799.99);
        tablet.setScreenSize("10.9 inches");
        tablet.setBatteryLife("10 hours");
        deviceRepository.save(tablet);

        System.out.println("Data inserted successfully.");
    }
}
