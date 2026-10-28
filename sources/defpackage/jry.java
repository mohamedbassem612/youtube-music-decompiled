package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jry extends lxt implements lyq {
    public static final jry DEFAULT_INSTANCE;
    private static volatile lyu PARSER = null;
    public static final int PERMISSIONS_FIELD_NUMBER = 1;
    private int permissionsMemoizedSerializedSize = -1;
    public lya permissions_ = lxu.a;

    static {
        jry jryVar = new jry();
        DEFAULT_INSTANCE = jryVar;
        lxt.E(jry.class, jryVar);
    }

    private jry() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001+", new Object[]{"permissions_"});
        }
        if (i2 == 3) {
            return new jry();
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
