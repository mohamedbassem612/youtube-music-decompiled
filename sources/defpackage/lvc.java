package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lvc extends lxt implements lyq {
    public static final lvc DEFAULT_INSTANCE;
    public static final int NUM_METADATA_TOKENS_INDEXED_FIELD_NUMBER = 3;
    public static final int NUM_TOKENS_INDEXED_FIELD_NUMBER = 1;
    private static volatile lyu PARSER;
    private int bitField0_;
    private int numMetadataTokensIndexed_;
    public int numTokensIndexed_;

    static {
        lvc lvcVar = new lvc();
        DEFAULT_INSTANCE = lvcVar;
        lxt.E(lvc.class, lvcVar);
    }

    private lvc() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001င\u0000\u0003င\u0001", new Object[]{"bitField0_", "numTokensIndexed_", "numMetadataTokensIndexed_"});
        }
        if (i2 == 3) {
            return new lvc();
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
