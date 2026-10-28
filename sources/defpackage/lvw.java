package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lvw extends lxt implements lyq {
    public static final int DEBUG_INFO_FIELD_NUMBER = 3;
    public static final lvw DEFAULT_INSTANCE;
    public static final int GET_VM_LATENCY_MS_FIELD_NUMBER = 7;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 4;
    public static final int PAGE_TOKEN_NOT_FOUND_FIELD_NUMBER = 6;
    private static volatile lyu PARSER = null;
    public static final int QUERY_STATS_FIELD_NUMBER = 5;
    public static final int REQUEST_BYTES_FIELD_NUMBER = 9;
    public static final int RESPONSE_BYTES_FIELD_NUMBER = 10;
    public static final int RESULTS_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int VM_BINDER_TRANSACTION_LATENCY_START_TIME_MS_FIELD_NUMBER = 8;
    public int bitField0_;
    private lvu debugInfo_;
    public int getVmLatencyMs_;
    public long nextPageToken_;
    public boolean pageTokenNotFound_;
    private lvg queryStats_;
    public int requestBytes_;
    public int responseBytes_;
    public lye results_ = lyx.a;
    public lwf status_;
    private long vmBinderTransactionLatencyStartTimeMs_;

    static {
        lvw lvwVar = new lvw();
        DEFAULT_INSTANCE = lvwVar;
        lxt.E(lvw.class, lvwVar);
    }

    private lvw() {
    }

    public static lxq f() {
        return DEFAULT_INSTANCE.s();
    }

    public static lxq g(lvw lvwVar) {
        return DEFAULT_INSTANCE.t(lvwVar);
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဃ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007င\u0005\bဂ\u0006\tင\u0007\nင\b", new Object[]{"bitField0_", "status_", "results_", lvv.class, "debugInfo_", "nextPageToken_", "queryStats_", "pageTokenNotFound_", "getVmLatencyMs_", "vmBinderTransactionLatencyStartTimeMs_", "requestBytes_", "responseBytes_"});
        }
        if (i2 == 3) {
            return new lvw();
        }
        if (i2 == 4) {
            return new lxq(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }

    public final int b() {
        return this.results_.size();
    }

    public final lvg c() {
        lvg lvgVar = this.queryStats_;
        return lvgVar == null ? lvg.DEFAULT_INSTANCE : lvgVar;
    }

    public final lwf d() {
        lwf lwfVar = this.status_;
        return lwfVar == null ? lwf.DEFAULT_INSTANCE : lwfVar;
    }

    public final void e(lvg lvgVar) {
        lvgVar.getClass();
        this.queryStats_ = lvgVar;
        this.bitField0_ |= 8;
    }
}
