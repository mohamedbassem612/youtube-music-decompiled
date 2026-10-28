package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lud extends lxt implements lyq {
    public static final lud DEFAULT_INSTANCE;
    public static final int GET_VM_LATENCY_MS_FIELD_NUMBER = 3;
    private static volatile lyu PARSER = null;
    public static final int RESPONSE_BYTES_FIELD_NUMBER = 4;
    public static final int SCHEMA_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 1;
    public int bitField0_;
    private int getVmLatencyMs_;
    public int responseBytes_;
    private lvm schema_;
    public lwf status_;

    static {
        lud ludVar = new lud();
        DEFAULT_INSTANCE = ludVar;
        lxt.E(lud.class, ludVar);
    }

    private lud() {
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
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"bitField0_", "status_", "schema_", "getVmLatencyMs_", "responseBytes_"});
        }
        if (i2 == 3) {
            return new lud();
        }
        if (i2 == 4) {
            return new lxq(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }

    public final lvm b() {
        lvm lvmVar = this.schema_;
        return lvmVar == null ? lvm.DEFAULT_INSTANCE : lvmVar;
    }

    public final lwf c() {
        lwf lwfVar = this.status_;
        return lwfVar == null ? lwf.DEFAULT_INSTANCE : lwfVar;
    }
}
