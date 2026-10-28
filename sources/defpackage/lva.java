package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lva extends lxt implements lyq {
    public static final lva DEFAULT_INSTANCE;
    private static volatile lyu PARSER = null;
    public static final int PATH_FIELD_NUMBER = 1;
    public static final int WEIGHT_FIELD_NUMBER = 2;
    public int bitField0_;
    public String path_ = "";
    public double weight_;

    static {
        lva lvaVar = new lva();
        DEFAULT_INSTANCE = lvaVar;
        lxt.E(lva.class, lvaVar);
    }

    private lva() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002က\u0001", new Object[]{"bitField0_", "path_", "weight_"});
        }
        if (i2 == 3) {
            return new lva();
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
