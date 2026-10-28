package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class luo extends lxt implements lyq {
    public static final int BLOB_FILE_NAMES_FIELD_NUMBER = 4;
    public static final int BLOB_SIZE_FIELD_NUMBER = 2;
    public static final luo DEFAULT_INSTANCE;
    public static final int NAMESPACE_FIELD_NUMBER = 1;
    public static final int NUM_BLOBS_FIELD_NUMBER = 3;
    private static volatile lyu PARSER;
    private int bitField0_;
    private long blobSize_;
    private int numBlobs_;
    public String namespace_ = "";
    public lye blobFileNames_ = lyx.a;

    static {
        luo luoVar = new luo();
        DEFAULT_INSTANCE = luoVar;
        lxt.E(luo.class, luoVar);
    }

    private luo() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003င\u0002\u0004\u001a", new Object[]{"bitField0_", "namespace_", "blobSize_", "numBlobs_", "blobFileNames_"});
        }
        if (i2 == 3) {
            return new luo();
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
