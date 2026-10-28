package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lvv extends lxt implements lyq {
    public static final int ADDITIONAL_SCORES_FIELD_NUMBER = 5;
    public static final lvv DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int JOINED_RESULTS_FIELD_NUMBER = 4;
    private static volatile lyu PARSER = null;
    public static final int SCORE_FIELD_NUMBER = 3;
    public static final int SNIPPET_FIELD_NUMBER = 2;
    public int bitField0_;
    public ltt document_;
    public double score_;
    private lwd snippet_;
    private int additionalScoresMemoizedSerializedSize = -1;
    public lye joinedResults_ = lyx.a;
    public lxw additionalScores_ = lxi.a;

    static {
        lvv lvvVar = new lvv();
        DEFAULT_INSTANCE = lvvVar;
        lxt.E(lvv.class, lvvVar);
    }

    private lvv() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003က\u0002\u0004\u001b\u0005#", new Object[]{"bitField0_", "document_", "snippet_", "score_", "joinedResults_", lvv.class, "additionalScores_"});
        }
        if (i2 == 3) {
            return new lvv();
        }
        if (i2 == 4) {
            return new lxq(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }

    public final int b() {
        return this.joinedResults_.size();
    }

    public final lwd c() {
        lwd lwdVar = this.snippet_;
        return lwdVar == null ? lwd.DEFAULT_INSTANCE : lwdVar;
    }
}
