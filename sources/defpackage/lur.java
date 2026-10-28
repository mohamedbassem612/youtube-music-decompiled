package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lur extends lxt implements lyq {
    public static final int BLOB_FILE_NAMES_TO_REMOVE_FIELD_NUMBER = 3;
    public static final lur DEFAULT_INSTANCE;
    public static final int GET_VM_LATENCY_MS_FIELD_NUMBER = 4;
    public static final int OPTIMIZE_STATS_FIELD_NUMBER = 2;
    private static volatile lyu PARSER = null;
    public static final int RESPONSE_BYTES_FIELD_NUMBER = 6;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int VM_BINDER_TRANSACTION_LATENCY_START_TIME_MS_FIELD_NUMBER = 5;
    public int bitField0_;
    public lye blobFileNamesToRemove_ = lyx.a;
    public int getVmLatencyMs_;
    public lus optimizeStats_;
    public int responseBytes_;
    public lwf status_;
    private long vmBinderTransactionLatencyStartTimeMs_;

    static {
        lur lurVar = new lur();
        DEFAULT_INSTANCE = lurVar;
        lxt.E(lur.class, lurVar);
    }

    private lur() {
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
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001a\u0004င\u0002\u0005ဂ\u0003\u0006င\u0004", new Object[]{"bitField0_", "status_", "optimizeStats_", "blobFileNamesToRemove_", "getVmLatencyMs_", "vmBinderTransactionLatencyStartTimeMs_", "responseBytes_"});
        }
        if (i2 == 3) {
            return new lur();
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
