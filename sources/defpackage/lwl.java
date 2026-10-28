package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lwl extends lxt implements lyq {
    public static final lwl DEFAULT_INSTANCE;
    private static volatile lyu PARSER = null;
    public static final int PROPERTY_WEIGHTS_FIELD_NUMBER = 2;
    public static final int SCHEMA_TYPE_FIELD_NUMBER = 1;
    public int bitField0_;
    public String schemaType_ = "";
    public lye propertyWeights_ = lyx.a;

    static {
        lwl lwlVar = new lwl();
        DEFAULT_INSTANCE = lwlVar;
        lxt.E(lwl.class, lwlVar);
    }

    private lwl() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"bitField0_", "schemaType_", "propertyWeights_", lva.class});
        }
        if (i2 == 3) {
            return new lwl();
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
