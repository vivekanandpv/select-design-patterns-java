package com.vivekanandpv.abstractfactory;

public class Program {
    public static void main(String[] args) {
        AbstractCloudFactory acf = new ConcreteCloudFactory(new AwsCloudServiceFactory());

        VirtualMachine virtualMachine = acf.getVirtualMachine();
        acf.setFactory(new AzureCloudServiceFactory());

        VirtualMachine virtualMachine1 = acf.getVirtualMachine();
    }
}


