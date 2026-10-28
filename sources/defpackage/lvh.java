package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lvh extends lxt implements lyq {
    public static final lvh DEFAULT_INSTANCE;
    public static final int GET_VM_LATENCY_MS_FIELD_NUMBER = 2;
    private static volatile lyu PARSER = null;
    public static final int RESPONSE_BYTES_FIELD_NUMBER = 4;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int VM_BINDER_TRANSACTION_LATENCY_START_TIME_MS_FIELD_NUMBER = 3;
    public int bitField0_;
    private int getVmLatencyMs_;
    public int responseBytes_;
    public lwf status_;
    private long vmBinderTransactionLatencyStartTimeMs_;

    static {
        lvh lvhVar = new lvh();
        DEFAULT_INSTANCE = lvhVar;
        lxt.E(lvh.class, lvhVar);
    }

    private lvh() {
    }

    public static lxq c() {
        return DEFAULT_INSTANCE.s();
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"bitField0_", "status_", "getVmLatencyMs_", "vmBinderTransactionLatencyStartTimeMs_", "responseBytes_"});
        }
        if (i2 == 3) {
            return new lvh();
        }
        if (i2 == 4) {
            return new lxq(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }

    public final lwf b() {
        lwf lwfVar = this.status_;
        return lwfVar == null ? lwf.DEFAULT_INSTANCE : lwfVar;
    }
}
