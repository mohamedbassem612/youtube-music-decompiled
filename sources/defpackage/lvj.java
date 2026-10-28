package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lvj extends lxt implements lyq {
    public static final lvj DEFAULT_INSTANCE;
    public static final int ENTRY_GROUPINGS_FIELD_NUMBER = 1;
    public static final int MAX_RESULTS_FIELD_NUMBER = 2;
    private static volatile lyu PARSER;
    public int bitField0_;
    public lye entryGroupings_ = lyx.a;
    public int maxResults_;

    static {
        lvj lvjVar = new lvj();
        DEFAULT_INSTANCE = lvjVar;
        lxt.E(lvj.class, lvjVar);
    }

    private lvj() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"bitField0_", "entryGroupings_", lvi.class, "maxResults_"});
        }
        if (i2 == 3) {
            return new lvj();
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
