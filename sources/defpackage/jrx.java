package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jrx extends lxt implements lyq {
    public static final jrx DEFAULT_INSTANCE;
    public static final int NOT_PLATFORM_SURFACEABLE_FIELD_NUMBER = 1;
    private static volatile lyu PARSER = null;
    public static final int PUBLICLY_VISIBLE_TARGET_PACKAGE_FIELD_NUMBER = 4;
    public static final int VISIBLE_TO_PACKAGES_FIELD_NUMBER = 2;
    public static final int VISIBLE_TO_PERMISSIONS_FIELD_NUMBER = 3;
    public int bitField0_;
    private boolean notPlatformSurfaceable_;
    public jrw publiclyVisibleTargetPackage_;
    public lye visibleToPackages_;
    public lye visibleToPermissions_;

    static {
        jrx jrxVar = new jrx();
        DEFAULT_INSTANCE = jrxVar;
        lxt.E(jrx.class, jrxVar);
    }

    private jrx() {
        lyx lyxVar = lyx.a;
        this.visibleToPackages_ = lyxVar;
        this.visibleToPermissions_ = lyxVar;
    }

    public static lxq b() {
        return DEFAULT_INSTANCE.s();
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဇ\u0000\u0002\u001b\u0003\u001b\u0004ဉ\u0001", new Object[]{"bitField0_", "notPlatformSurfaceable_", "visibleToPackages_", jrw.class, "visibleToPermissions_", jry.class, "publiclyVisibleTargetPackage_"});
        }
        if (i2 == 3) {
            return new jrx();
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
