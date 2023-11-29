package com.vivekanandpv.multiton;

public class Program {
    public static void main(String[] args) {
        CloudServer gcpInstance = CloudServer.getInstance(ServerType.GCP);
        CloudServer gcpInstance1 = CloudServer.getInstance(ServerType.GCP);

        System.out.println(gcpInstance == gcpInstance1);
    }
}
