package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axlg extends axqf implements axqw {
    public static final axlg DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile axra PARSER;
    public int bitField0_;
    public boolean enabled_;
    public axqs params_ = axqs.a;

    static {
        axlg axlgVar = new axlg();
        DEFAULT_INSTANCE = axlgVar;
        axqf.p(axlg.class, axlgVar);
    }

    private axlg() {
    }

    @Override // defpackage.axqf
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new axrd(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဇ\u0000\u00022", new Object[]{"bitField0_", "enabled_", "params_", axlf.a});
        }
        if (i2 == 3) {
            return new axlg();
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
