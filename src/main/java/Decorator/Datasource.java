package Decorator;
// Step 1 - Create a product interface
public interface Datasource {
    String read();

    void write(String value);
}