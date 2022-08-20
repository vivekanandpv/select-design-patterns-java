package com.vivekanandpv.state;

public class TcpConnection {
    private TcpState state;

    public TcpConnection(TcpState state) {
        this.state = state;
    }

    public void setState(TcpState state) {
        this.state = state;
    }

    public void open() {
        state.open();
    }

    public void close() {
        state.close();
    }

    public void acknowledge() {
        state.acknowledge();
    }
}
