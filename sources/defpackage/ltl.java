package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ltl extends lxt implements lyq {
    public static final ltl DEFAULT_INSTANCE;
    public static final int GET_VM_LATENCY_MS_FIELD_NUMBER = 4;
    private static volatile lyu PARSER = null;
    public static final int PERSIST_TO_DISK_RESULT_PROTO_FIELD_NUMBER = 2;
    public static final int PUT_RESULT_PROTOS_FIELD_NUMBER = 1;
    public static final int REQUEST_BYTES_FIELD_NUMBER = 6;
    public static final int RESPONSE_BYTES_FIELD_NUMBER = 7;
    public static final int STATUS_FIELD_NUMBER = 3;
    public static final int VM_BINDER_TRANSACTION_LATENCY_START_TIME_MS_FIELD_NUMBER = 5;
    public int bitField0_;
    private int getVmLatencyMs_;
    public lut persistToDiskResultProto_;
    public lye putResultProtos_ = lyx.a;
    public int requestBytes_;
    public int responseBytes_;
    public lwf status_;
    private long vmBinderTransactionLatencyStartTimeMs_;

    static {
        ltl ltlVar = new ltl();
        DEFAULT_INSTANCE = ltlVar;
        lxt.E(ltl.class, ltlVar);
    }

    private ltl() {
    }

    public static lxq b() {
        return DEFAULT_INSTANCE.s();
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0001\u0003ဉ\u0000\u0004င\u0002\u0005ဂ\u0003\u0006င\u0004\u0007င\u0005", new Object[]{"bitField0_", "putResultProtos_", lve.class, "persistToDiskResultProto_", "status_", "getVmLatencyMs_", "vmBinderTransactionLatencyStartTimeMs_", "requestBytes_", "responseBytes_"});
        }
        if (i2 == 3) {
            return new ltl();
        }
        if (i2 == 4) {
            return new lxq(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }
}
