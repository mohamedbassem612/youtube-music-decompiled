package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lwb extends lxt implements lyq {
    public static final lwb DEFAULT_INSTANCE;
    public static final int EXACT_MATCH_BYTE_LENGTH_FIELD_NUMBER = 3;
    public static final int EXACT_MATCH_BYTE_POSITION_FIELD_NUMBER = 2;
    public static final int EXACT_MATCH_UTF16_LENGTH_FIELD_NUMBER = 7;
    public static final int EXACT_MATCH_UTF16_POSITION_FIELD_NUMBER = 6;
    private static volatile lyu PARSER = null;
    public static final int SUBMATCH_BYTE_LENGTH_FIELD_NUMBER = 10;
    public static final int SUBMATCH_UTF16_LENGTH_FIELD_NUMBER = 11;
    public static final int WINDOW_BYTE_LENGTH_FIELD_NUMBER = 5;
    public static final int WINDOW_BYTE_POSITION_FIELD_NUMBER = 4;
    public static final int WINDOW_UTF16_LENGTH_FIELD_NUMBER = 9;
    public static final int WINDOW_UTF16_POSITION_FIELD_NUMBER = 8;
    private int bitField0_;
    private int exactMatchByteLength_;
    private int exactMatchBytePosition_;
    public int exactMatchUtf16Length_;
    public int exactMatchUtf16Position_;
    private int submatchByteLength_;
    public int submatchUtf16Length_;
    private int windowByteLength_;
    private int windowBytePosition_;
    public int windowUtf16Length_;
    public int windowUtf16Position_;

    static {
        lwb lwbVar = new lwb();
        DEFAULT_INSTANCE = lwbVar;
        lxt.E(lwb.class, lwbVar);
    }

    private lwb() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0002\u000b\n\u0000\u0000\u0000\u0002င\u0000\u0003င\u0001\u0004င\u0006\u0005င\u0007\u0006င\u0003\u0007င\u0004\bင\b\tင\t\nင\u0002\u000bင\u0005", new Object[]{"bitField0_", "exactMatchBytePosition_", "exactMatchByteLength_", "windowBytePosition_", "windowByteLength_", "exactMatchUtf16Position_", "exactMatchUtf16Length_", "windowUtf16Position_", "windowUtf16Length_", "submatchByteLength_", "submatchUtf16Length_"});
        }
        if (i2 == 3) {
            return new lwb();
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
