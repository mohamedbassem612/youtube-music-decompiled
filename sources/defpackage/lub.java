package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lub extends lxt implements lyq {
    public static final lub DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 2;
    public static final int GET_VM_LATENCY_MS_FIELD_NUMBER = 4;
    private static volatile lyu PARSER = null;
    public static final int REQUEST_BYTES_FIELD_NUMBER = 6;
    public static final int RESPONSE_BYTES_FIELD_NUMBER = 7;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int URI_FIELD_NUMBER = 3;
    public static final int VM_BINDER_TRANSACTION_LATENCY_START_TIME_MS_FIELD_NUMBER = 5;
    public int bitField0_;
    private ltt document_;
    private int getVmLatencyMs_;
    public int requestBytes_;
    public int responseBytes_;
    public lwf status_;
    private String uri_ = "";
    private long vmBinderTransactionLatencyStartTimeMs_;

    static {
        lub lubVar = new lub();
        DEFAULT_INSTANCE = lubVar;
        lxt.E(lub.class, lubVar);
    }

    private lub() {
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
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0002\u0003ဈ\u0001\u0004င\u0003\u0005ဂ\u0004\u0006င\u0005\u0007င\u0006", new Object[]{"bitField0_", "status_", "document_", "uri_", "getVmLatencyMs_", "vmBinderTransactionLatencyStartTimeMs_", "requestBytes_", "responseBytes_"});
        }
        if (i2 == 3) {
            return new lub();
        }
        if (i2 == 4) {
            return new lxq(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }

    public final ltt b() {
        ltt lttVar = this.document_;
        return lttVar == null ? ltt.DEFAULT_INSTANCE : lttVar;
    }

    public final lwf c() {
        lwf lwfVar = this.status_;
        return lwfVar == null ? lwf.DEFAULT_INSTANCE : lwfVar;
    }
}
