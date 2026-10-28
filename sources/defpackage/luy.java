package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class luy extends lxt implements lyq {
    public static final luy DEFAULT_INSTANCE;
    public static final int MODEL_SIGNATURE_FIELD_NUMBER = 2;
    private static volatile lyu PARSER = null;
    public static final int QUANTIZED_VALUES_FIELD_NUMBER = 3;
    public static final int VALUES_FIELD_NUMBER = 1;
    public int bitField0_;
    private int valuesMemoizedSerializedSize = -1;
    public lxz values_ = lxp.a;
    public String modelSignature_ = "";
    public lxa quantizedValues_ = lxa.d;

    static {
        luy luyVar = new luy();
        DEFAULT_INSTANCE = luyVar;
        lxt.E(luy.class, luyVar);
    }

    private luy() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001$\u0002ဈ\u0000\u0003ည\u0001", new Object[]{"bitField0_", "values_", "modelSignature_", "quantizedValues_"});
        }
        if (i2 == 3) {
            return new luy();
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
        return this.values_.size();
    }
}
