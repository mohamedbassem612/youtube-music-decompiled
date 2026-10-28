package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fxd implements aiht {
    private final /* synthetic */ int $cid;
    public static final aiht u = new fxd(20);
    public static final aiht t = new fxd(19);
    public static final aiht s = new fxd(18);
    public static final aiht r = new fxd(17);
    public static final aiht q = new fxd(16);
    public static final aiht p = new fxd(15);
    public static final aiht o = new fxd(14);
    public static final aiht n = new fxd(13);
    public static final aiht m = new fxd(12);
    public static final aiht l = new fxd(11);
    public static final aiht k = new fxd(10);
    public static final aiht j = new fxd(9);
    public static final aiht i = new fxd(8);
    public static final aiht h = new fxd(7);
    public static final aiht g = new fxd(6);
    public static final aiht f = new fxd(5);
    public static final aiht e = new fxd(4);
    public static final aiht d = new fxd(3);
    static final aiht c = new fxd(2);
    static final aiht b = new fxd(1);
    static final aiht a = new fxd(0);

    private fxd(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        jrp jrpVar;
        switch (this.$cid) {
            case 0:
                if (a.aX(i2) == 0) {
                    return false;
                }
                break;
            case 1:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 2:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 3:
                if (gcw.a(i2) == null) {
                    return false;
                }
                break;
            case 4:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 5:
                if (jqz.a(i2) == null) {
                    return false;
                }
                break;
            case 6:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 7:
                if (i2 == 0) {
                    jrpVar = jrp.ONESIE_REQUEST_TARGET_UNKNOWN;
                } else if (i2 == 1) {
                    jrpVar = jrp.ONESIE_REQUEST_TARGET_ENCRYPTED_PLAYER_SERVICE;
                } else if (i2 == 2) {
                    jrpVar = jrp.ONESIE_REQUEST_TARGET_ENCRYPTED_WATCH_SERVICE_DEPRECATED;
                } else if (i2 != 3) {
                    jrpVar = i2 != 4 ? null : jrp.ONESIE_REQUEST_TARGET_INNERTUBE_ENCRYPTED_SERVICE;
                } else {
                    jrpVar = jrp.ONESIE_REQUEST_TARGET_ENCRYPTED_WATCH_SERVICE;
                }
                if (jrpVar == null) {
                    return false;
                }
                break;
            case 8:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 9:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 10:
                if (a.bt(i2) == 0) {
                    return false;
                }
                break;
            case 11:
                if (a.bc(i2) == 0) {
                    return false;
                }
                break;
            case 12:
                if (a.aX(i2) == 0) {
                    return false;
                }
                break;
            case 13:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 14:
                if (a.bc(i2) == 0) {
                    return false;
                }
                break;
            case 15:
                if (a.bc(i2) == 0) {
                    return false;
                }
                break;
            case 16:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 17:
                if (liv.a(i2) == null) {
                    return false;
                }
                break;
            case 18:
                if (a.bt(i2) == 0) {
                    return false;
                }
                break;
            case 19:
                if (a.bc(i2) == 0) {
                    return false;
                }
                break;
            default:
                if (a.bc(i2) == 0) {
                    return false;
                }
                break;
        }
        return true;
    }
}
