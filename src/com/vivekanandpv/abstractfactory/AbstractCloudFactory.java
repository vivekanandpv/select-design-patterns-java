package com.vivekanandpv.abstractfactory;

public interface AbstractCloudFactory {
    VirtualMachine getVirtualMachine();

    Storage getStorage();

    void setFactory(CloudService factory);
}
