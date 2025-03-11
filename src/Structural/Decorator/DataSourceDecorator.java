package Structural.Decorator;

public abstract class DataSourceDecorator implements DataSource {

    DataSource wrapped;

    public DataSourceDecorator(DataSource dataSource) {
        this.wrapped = dataSource;
    }

    @Override
    public void writeData(String data) {
        wrapped.writeData(data);
    }

    @Override
    public String readData() {
        return wrapped.readData();
    }
}
