package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lwc extends lxt implements lyq {
    public static final lwc DEFAULT_INSTANCE;
    public static final int EMBEDDING_MATCHES_FIELD_NUMBER = 3;
    private static volatile lyu PARSER = null;
    public static final int PROPERTY_NAME_FIELD_NUMBER = 1;
    public static final int SNIPPET_MATCHES_FIELD_NUMBER = 2;
    private int bitField0_;
    public lye embeddingMatches_;
    public String propertyName_ = "";
    public lye snippetMatches_;

    static {
        lwc lwcVar = new lwc();
        DEFAULT_INSTANCE = lwcVar;
        lxt.E(lwc.class, lwcVar);
    }

    private lwc() {
        lyx lyxVar = lyx.a;
        this.snippetMatches_ = lyxVar;
        this.embeddingMatches_ = lyxVar;
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b", new Object[]{"bitField0_", "propertyName_", "snippetMatches_", lwb.class, "embeddingMatches_", lty.class});
        }
        if (i2 == 3) {
            return new lwc();
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
