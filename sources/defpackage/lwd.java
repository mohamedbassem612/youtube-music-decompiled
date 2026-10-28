package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lwd extends lxt implements lyq {
    public static final lwd DEFAULT_INSTANCE;
    public static final int ENTRIES_FIELD_NUMBER = 1;
    private static volatile lyu PARSER;
    public lye entries_ = lyx.a;

    static {
        lwd lwdVar = new lwd();
        DEFAULT_INSTANCE = lwdVar;
        lxt.E(lwd.class, lwdVar);
    }

    private lwd() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"entries_", lwc.class});
        }
        if (i2 == 3) {
            return new lwd();
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
