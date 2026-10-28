package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jrv extends lxt implements lyq {
    public static final jrv DEFAULT_INSTANCE;
    private static volatile lyu PARSER = null;
    public static final int VISIBILITY_CONFIG_FIELD_NUMBER = 1;
    public static final int VISIBLE_TO_CONFIGS_FIELD_NUMBER = 2;
    public static final int WRITER_UID_FIELD_NUMBER = 3;
    public int bitField0_;
    public jrx visibilityConfig_;
    public lye visibleToConfigs_ = lyx.a;
    private int writerUid_;

    static {
        jrv jrvVar = new jrv();
        DEFAULT_INSTANCE = jrvVar;
        lxt.E(jrv.class, jrvVar);
    }

    private jrv() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003င\u0001", new Object[]{"bitField0_", "visibilityConfig_", "visibleToConfigs_", jrx.class, "writerUid_"});
        }
        if (i2 == 3) {
            return new jrv();
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
