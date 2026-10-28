package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lup extends lxt implements lyq {
    public static final lup DEFAULT_INSTANCE;
    public static final int DOCUMENT_URIS_FIELD_NUMBER = 2;
    public static final int NAMESPACE__FIELD_NUMBER = 1;
    private static volatile lyu PARSER;
    public int bitField0_;
    public String namespace_ = "";
    public lye documentUris_ = lyx.a;

    static {
        lup lupVar = new lup();
        DEFAULT_INSTANCE = lupVar;
        lxt.E(lup.class, lupVar);
    }

    private lup() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"bitField0_", "namespace_", "documentUris_"});
        }
        if (i2 == 3) {
            return new lup();
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
