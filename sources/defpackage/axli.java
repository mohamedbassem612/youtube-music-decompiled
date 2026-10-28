package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axli extends axqf implements axqw {
    public static final axli DEFAULT_INSTANCE;
    public static final int FEATURE_STATES_FIELD_NUMBER = 1;
    private static volatile axra PARSER;
    public axqs featureStates_ = axqs.a;

    static {
        axli axliVar = new axli();
        DEFAULT_INSTANCE = axliVar;
        axqf.p(axli.class, axliVar);
    }

    private axli() {
    }

    @Override // defpackage.axqf
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new axrd(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"featureStates_", axlh.a});
        }
        if (i2 == 3) {
            return new axli();
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
