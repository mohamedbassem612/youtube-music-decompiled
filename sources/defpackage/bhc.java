package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhc extends bis implements bjj {
    public static final bhc DEFAULT_INSTANCE;
    private static volatile bjn PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    public bjf preferences_ = bjf.a;

    static {
        bhc bhcVar = new bhc();
        DEFAULT_INSTANCE = bhcVar;
        bis.p(bhc.class, bhcVar);
    }

    private bhc() {
    }

    @Override // defpackage.bis
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new bjr(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", bhb.a});
        }
        if (i2 == 3) {
            return new bhc();
        }
        if (i2 == 4) {
            return new biq(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }
}
