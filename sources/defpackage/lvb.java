package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lvb extends lxt implements lyq {
    public static final lvb DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 1;
    private static volatile lyu PARSER = null;
    public static final int PERSIST_TYPE_FIELD_NUMBER = 2;
    public int bitField0_;
    public lye documents_ = lyx.a;
    public int persistType_;

    static {
        lvb lvbVar = new lvb();
        DEFAULT_INSTANCE = lvbVar;
        lxt.E(lvb.class, lvbVar);
    }

    private lvb() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002᠌\u0000", new Object[]{"bitField0_", "documents_", ltt.class, "persistType_", ltw.m});
        }
        if (i2 == 3) {
            return new lvb();
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
