package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ltn extends lxt implements lyq {
    public static final ltn DEFAULT_INSTANCE;
    public static final int DELETED_DOCUMENTS_FIELD_NUMBER = 4;
    public static final int DELETE_BY_QUERY_STATS_FIELD_NUMBER = 3;
    public static final int GET_VM_LATENCY_MS_FIELD_NUMBER = 5;
    private static volatile lyu PARSER = null;
    public static final int PERSIST_TO_DISK_RESULT_PROTO_FIELD_NUMBER = 9;
    public static final int REQUEST_BYTES_FIELD_NUMBER = 7;
    public static final int RESPONSE_BYTES_FIELD_NUMBER = 8;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int VM_BINDER_TRANSACTION_LATENCY_START_TIME_MS_FIELD_NUMBER = 6;
    public int bitField0_;
    private lto deleteByQueryStats_;
    public lye deletedDocuments_ = lyx.a;
    private int getVmLatencyMs_;
    private lut persistToDiskResultProto_;
    public int requestBytes_;
    public int responseBytes_;
    public lwf status_;
    private long vmBinderTransactionLatencyStartTimeMs_;

    static {
        ltn ltnVar = new ltn();
        DEFAULT_INSTANCE = ltnVar;
        lxt.E(ltn.class, ltnVar);
    }

    private ltn() {
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
            return new lyy(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0000\u0001ဉ\u0000\u0003ဉ\u0001\u0004\u001b\u0005င\u0002\u0006ဂ\u0003\u0007င\u0004\bင\u0005\tဉ\u0006", new Object[]{"bitField0_", "status_", "deleteByQueryStats_", "deletedDocuments_", ltm.class, "getVmLatencyMs_", "vmBinderTransactionLatencyStartTimeMs_", "requestBytes_", "responseBytes_", "persistToDiskResultProto_"});
        }
        if (i2 == 3) {
            return new ltn();
        }
        if (i2 == 4) {
            return new lxq(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }

    public final lto b() {
        lto ltoVar = this.deleteByQueryStats_;
        return ltoVar == null ? lto.DEFAULT_INSTANCE : ltoVar;
    }

    public final lwf c() {
        lwf lwfVar = this.status_;
        return lwfVar == null ? lwf.DEFAULT_INSTANCE : lwfVar;
    }
}
