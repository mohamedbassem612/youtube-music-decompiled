package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lug extends lxt implements lyq {
    public static final lug DEFAULT_INSTANCE;
    public static final int INDEX_SIZE_FIELD_NUMBER = 1;
    public static final int LITE_INDEX_HIT_BUFFER_SIZE_FIELD_NUMBER = 3;
    public static final int LITE_INDEX_LEXICON_SIZE_FIELD_NUMBER = 2;
    public static final int MAIN_INDEX_BLOCK_SIZE_FIELD_NUMBER = 6;
    public static final int MAIN_INDEX_LEXICON_SIZE_FIELD_NUMBER = 4;
    public static final int MAIN_INDEX_STORAGE_SIZE_FIELD_NUMBER = 5;
    public static final int MIN_FREE_FRACTION_FIELD_NUMBER = 8;
    public static final int NUM_BLOCKS_FIELD_NUMBER = 7;
    private static volatile lyu PARSER;
    private int bitField0_;
    private long indexSize_;
    private long liteIndexHitBufferSize_;
    private long liteIndexLexiconSize_;
    private long mainIndexBlockSize_;
    private long mainIndexLexiconSize_;
    private long mainIndexStorageSize_;
    private float minFreeFraction_;
    private int numBlocks_;

    static {
        lug lugVar = new lug();
        DEFAULT_INSTANCE = lugVar;
        lxt.E(lug.class, lugVar);
    }

    private lug() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007င\u0006\bခ\u0007", new Object[]{"bitField0_", "indexSize_", "liteIndexLexiconSize_", "liteIndexHitBufferSize_", "mainIndexLexiconSize_", "mainIndexStorageSize_", "mainIndexBlockSize_", "numBlocks_", "minFreeFraction_"});
        }
        if (i2 == 3) {
            return new lug();
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
