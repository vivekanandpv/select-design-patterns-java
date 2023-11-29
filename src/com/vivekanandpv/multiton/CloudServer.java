package com.vivekanandpv.multiton;

import java.util.HashMap;
import java.util.Map;

public class CloudServer {
    private static Map<ServerType, CloudServer> objectPool = new HashMap<>();

    private CloudServer() {
    }

    public static CloudServer getInstance(ServerType type) {
        if (objectPool.containsKey(type)) {
            return objectPool.get(type);
        }

        var instance = new CloudServer();
        objectPool.put(type, instance);

        return instance;
    }
}

