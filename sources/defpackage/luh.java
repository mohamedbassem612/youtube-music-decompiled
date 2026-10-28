package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class luh extends lxt implements lyq {
    public static final luh DEFAULT_INSTANCE;
    public static final int GET_VM_LATENCY_MS_FIELD_NUMBER = 3;
    public static final int HAS_RESET_FIELD_NUMBER = 7;
    public static final int INITIALIZE_STATS_FIELD_NUMBER = 2;
    public static final int NEEDS_PERSIST_TYPE_FIELD_NUMBER = 4;
    private static volatile lyu PARSER = null;
    public static final int RESPONSE_BYTES_FIELD_NUMBER = 6;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int VM_BINDER_TRANSACTION_LATENCY_START_TIME_MS_FIELD_NUMBER = 5;
    public int bitField0_;
    public int getVmLatencyMs_;
    private boolean hasReset_;
    private luj initializeStats_;
    private int needsPersistType_;
    public int responseBytes_;
    public lwf status_;
    private long vmBinderTransactionLatencyStartTimeMs_;

    static {
        luh luhVar = new luh();
        DEFAULT_INSTANCE = luhVar;
        lxt.E(luh.class, luhVar);
    }

    private luh() {
    }

    public static lxq d() {
        return DEFAULT_INSTANCE.s();
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004᠌\u0003\u0005ဂ\u0004\u0006င\u0005\u0007ဇ\u0006", new Object[]{"bitField0_", "status_", "initializeStats_", "getVmLatencyMs_", "needsPersistType_", ltw.m, "vmBinderTransactionLatencyStartTimeMs_", "responseBytes_", "hasReset_"});
        }
        if (i2 == 3) {
            return new luh();
        }
        if (i2 == 4) {
            return new lxq(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }

    public final luj b() {
        luj lujVar = this.initializeStats_;
        return lujVar == null ? luj.DEFAULT_INSTANCE : lujVar;
    }

    public final lwf c() {
        lwf lwfVar = this.status_;
        return lwfVar == null ? lwf.DEFAULT_INSTANCE : lwfVar;
    }
}
