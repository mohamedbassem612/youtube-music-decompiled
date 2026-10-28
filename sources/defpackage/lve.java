package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lve extends lxt implements lyq {
    public static final lve DEFAULT_INSTANCE;
    public static final int DOCUMENT_EXPIRATION_TIMESTAMP_MS_FIELD_NUMBER = 7;
    public static final int GET_VM_LATENCY_MS_FIELD_NUMBER = 5;
    private static volatile lyu PARSER = null;
    public static final int PUT_DOCUMENT_STATS_FIELD_NUMBER = 2;
    public static final int REQUEST_BYTES_FIELD_NUMBER = 8;
    public static final int RESPONSE_BYTES_FIELD_NUMBER = 9;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int URI_FIELD_NUMBER = 4;
    public static final int VM_BINDER_TRANSACTION_LATENCY_START_TIME_MS_FIELD_NUMBER = 6;
    public static final int WAS_REPLACEMENT_FIELD_NUMBER = 3;
    public int bitField0_;
    public long documentExpirationTimestampMs_;
    public int getVmLatencyMs_;
    public lvd putDocumentStats_;
    public int requestBytes_;
    public int responseBytes_;
    public lwf status_;
    public String uri_ = "";
    private long vmBinderTransactionLatencyStartTimeMs_;
    public boolean wasReplacement_;

    static {
        lve lveVar = new lve();
        DEFAULT_INSTANCE = lveVar;
        lxt.E(lve.class, lveVar);
    }

    private lve() {
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
            return new lyy(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0002\u0003ဇ\u0003\u0004ဈ\u0001\u0005င\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bင\u0007\tင\b", new Object[]{"bitField0_", "status_", "putDocumentStats_", "wasReplacement_", "uri_", "getVmLatencyMs_", "vmBinderTransactionLatencyStartTimeMs_", "documentExpirationTimestampMs_", "requestBytes_", "responseBytes_"});
        }
        if (i2 == 3) {
            return new lve();
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
