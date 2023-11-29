package com.vivekanandpv.abstractfactory;

public class ConcreteCloudFactory implements AbstractCloudFactory {
    private CloudService cloudFactory;

    ConcreteCloudFactory(CloudService cloudFactory) {
        this.cloudFactory = cloudFactory;
    }

    @Override
    public VirtualMachine getVirtualMachine() {
        return cloudFactory.getVirtualMachine();
    }

    @Override
    public Storage getStorage() {
        return cloudFactory.getStorage();
    }

    @Override
    public void setFactory(CloudService factory) {
        this.cloudFactory = factory;
    }
}
