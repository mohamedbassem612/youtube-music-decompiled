package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lut extends lxt implements lyq {
    public static final lut DEFAULT_INSTANCE;
    public static final int GET_VM_LATENCY_MS_FIELD_NUMBER = 3;
    private static volatile lyu PARSER = null;
    public static final int PERSIST_STATS_FIELD_NUMBER = 2;
    public static final int RESPONSE_BYTES_FIELD_NUMBER = 5;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int VM_BINDER_TRANSACTION_LATENCY_START_TIME_MS_FIELD_NUMBER = 4;
    public int bitField0_;
    private int getVmLatencyMs_;
    public luu persistStats_;
    public int responseBytes_;
    public lwf status_;
    private long vmBinderTransactionLatencyStartTimeMs_;

    static {
        lut lutVar = new lut();
        DEFAULT_INSTANCE = lutVar;
        lxt.E(lut.class, lutVar);
    }

    private lut() {
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
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဂ\u0003\u0005င\u0004", new Object[]{"bitField0_", "status_", "persistStats_", "getVmLatencyMs_", "vmBinderTransactionLatencyStartTimeMs_", "responseBytes_"});
        }
        if (i2 == 3) {
            return new lut();
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
