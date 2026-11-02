package uk.ac.westminster.product_api_week1;

import static org.apache.tomcat.util.net.openssl.OpenSSLStatus.getName;

public class PhysicalProduct extends Product {

    private double weightKG;
    private String dimensions;

    @Override
    public String getSummary() {
        return "Physical Product: " + getName()
                + ", Weight: " + weightKG + "kg"
                + ", Dimensions: " + dimensions;
    }
}

