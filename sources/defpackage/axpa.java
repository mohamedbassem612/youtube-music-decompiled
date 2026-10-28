package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axpa extends axqf implements axqw {
    public static final axpa DEFAULT_INSTANCE;
    public static final int HOST_FIELD_NUMBER = 2;
    private static volatile axra PARSER = null;
    public static final int PORT_FIELD_NUMBER = 3;
    public static final int SCHEME_FIELD_NUMBER = 1;
    public int bitField0_;
    public String host_ = "";
    public int port_;
    public int scheme_;

    static {
        axpa axpaVar = new axpa();
        DEFAULT_INSTANCE = axpaVar;
        axqf.p(axpa.class, axpaVar);
    }

    private axpa() {
    }

    @Override // defpackage.axqf
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new axrd(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"bitField0_", "scheme_", axpc.a, "host_", "port_"});
        }
        if (i2 == 3) {
            return new axpa();
        }
        if (i2 == 4) {
            return new axqd(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }
}
