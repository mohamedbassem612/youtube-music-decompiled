package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axlm extends axqf implements axqw {
    public static final int CONSTRAINED_VALUES_FIELD_NUMBER = 8;
    public static final axlm DEFAULT_INSTANCE;
    private static volatile axra PARSER;
    public axqi constrainedValues_ = axrc.a;

    static {
        axlm axlmVar = new axlm();
        DEFAULT_INSTANCE = axlmVar;
        axqf.p(axlm.class, axlmVar);
    }

    private axlm() {
    }

    @Override // defpackage.axqf
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new axrd(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"constrainedValues_", axll.class});
        }
        if (i2 == 3) {
            return new axlm();
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
