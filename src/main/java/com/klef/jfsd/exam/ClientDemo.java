package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClientDemo {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        // Create and insert a Device
        Device device = new Device();
        device.setBrand("Generic");
        device.setModel("G-1000");
        device.setPrice(199.99);
        session.save(device);

        // Create and insert a Smartphone
        Smartphone smartphone = new Smartphone();
        smartphone.setBrand("Apple");
        smartphone.setModel("iPhone 14");
        smartphone.setPrice(999.99);
        smartphone.setOperatingSystem("iOS");
        smartphone.setCameraResolution("12 MP");
        session.save(smartphone);

        // Create and insert a Tablet
        Tablet tablet = new Tablet();
        tablet.setBrand("Samsung");
        tablet.setModel("Galaxy Tab S8");
        tablet.setPrice(799.99);
        tablet.setScreenSize("11 inches");
        tablet.setBatteryLife("12 hours");
        session.save(tablet);

        transaction.commit();
        session.close();
        System.out.println("Records inserted successfully.");
    }
}
