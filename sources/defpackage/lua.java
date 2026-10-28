package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lua extends lxt implements lyq {
    public static final lua DEFAULT_INSTANCE;
    public static final int ESTIMATED_OPTIMIZABLE_BYTES_FIELD_NUMBER = 3;
    public static final int GET_VM_LATENCY_MS_FIELD_NUMBER = 7;
    public static final int NO_PREVIOUS_OPTIMIZE_INFO_FIELD_NUMBER = 5;
    public static final int NUM_ACTIVE_RESULT_STATES_FIELD_NUMBER = 6;
    public static final int OPTIMIZABLE_DOCS_FIELD_NUMBER = 2;
    private static volatile lyu PARSER = null;
    public static final int RESPONSE_BYTES_FIELD_NUMBER = 9;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int TIME_SINCE_LAST_OPTIMIZE_MS_FIELD_NUMBER = 4;
    public static final int VM_BINDER_TRANSACTION_LATENCY_START_TIME_MS_FIELD_NUMBER = 8;
    public int bitField0_;
    public long estimatedOptimizableBytes_;
    private int getVmLatencyMs_;
    private boolean noPreviousOptimizeInfo_;
    private int numActiveResultStates_;
    public long optimizableDocs_;
    public int responseBytes_;
    public lwf status_;
    private long timeSinceLastOptimizeMs_;
    private long vmBinderTransactionLatencyStartTimeMs_;

    static {
        lua luaVar = new lua();
        DEFAULT_INSTANCE = luaVar;
        lxt.E(lua.class, luaVar);
    }

    private lua() {
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
            return new lyy(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဇ\u0004\u0006င\u0005\u0007င\u0006\bဂ\u0007\tင\b", new Object[]{"bitField0_", "status_", "optimizableDocs_", "estimatedOptimizableBytes_", "timeSinceLastOptimizeMs_", "noPreviousOptimizeInfo_", "numActiveResultStates_", "getVmLatencyMs_", "vmBinderTransactionLatencyStartTimeMs_", "responseBytes_"});
        }
        if (i2 == 3) {
            return new lua();
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
