package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhd extends bis implements bjj {
    public static final bhd DEFAULT_INSTANCE;
    private static volatile bjn PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    public biw strings_ = bjq.a;

    static {
        bhd bhdVar = new bhd();
        DEFAULT_INSTANCE = bhdVar;
        bis.p(bhd.class, bhdVar);
    }

    private bhd() {
    }

    @Override // defpackage.bis
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new bjr(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
        }
        if (i2 == 3) {
            return new bhd();
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
