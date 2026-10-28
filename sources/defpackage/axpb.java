package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axpb extends axqf implements axqw {
    public static final axpb DEFAULT_INSTANCE;
    private static volatile axra PARSER = null;
    public static final int PROXIES_FIELD_NUMBER = 1;
    public axqi proxies_ = axrc.a;

    static {
        axpb axpbVar = new axpb();
        DEFAULT_INSTANCE = axpbVar;
        axqf.p(axpb.class, axpbVar);
    }

    private axpb() {
    }

    @Override // defpackage.axqf
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new axrd(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"proxies_", axpa.class});
        }
        if (i2 == 3) {
            return new axpb();
        }
        if (i2 == 4) {
            return new axqd(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }
}
