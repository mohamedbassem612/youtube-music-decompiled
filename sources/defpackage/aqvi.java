package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqvi implements aiht {
    private final /* synthetic */ int $cid;
    public static final aiht o = new aqvi(14);
    public static final aiht n = new aqvi(13);
    public static final aiht m = new aqvi(12);
    public static final aiht l = new aqvi(11);
    public static final aiht k = new aqvi(10);
    public static final aiht j = new aqvi(9);
    public static final aiht i = new aqvi(8);
    public static final aiht h = new aqvi(7);
    public static final aiht g = new aqvi(6);
    public static final aiht f = new aqvi(5);
    public static final aiht e = new aqvi(4);
    static final aiht d = new aqvi(3);
    public static final aiht c = new aqvi(2);
    static final aiht b = new aqvi(1);
    static final aiht a = new aqvi(0);

    private aqvi(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        aqvj aqvjVar;
        switch (this.$cid) {
            case 0:
                if (i2 == 0) {
                    aqvjVar = aqvj.VIDEO_STREAM_TYPE_UNSPECIFIED;
                } else if (i2 == 1) {
                    aqvjVar = aqvj.VIDEO_STREAM_TYPE_LIVE;
                } else if (i2 != 2) {
                    aqvjVar = i2 != 3 ? null : aqvj.VIDEO_STREAM_TYPE_VOD;
                } else {
                    aqvjVar = aqvj.VIDEO_STREAM_TYPE_DVR;
                }
                if (aqvjVar == null) {
                    return false;
                }
                break;
            case 1:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 2:
                if (arfb.a(i2) == null) {
                    return false;
                }
                break;
            case 3:
                if (arqz.a(i2) == null) {
                    return false;
                }
                break;
            case 4:
                if (a.bc(i2) == 0) {
                    return false;
                }
                break;
            case 5:
                if (aslh.a(i2) == null) {
                    return false;
                }
                break;
            case 6:
                if (a.bc(i2) == 0) {
                    return false;
                }
                break;
            case 7:
                if (a.aU(i2) == 0) {
                    return false;
                }
                break;
            case 8:
                if (a.aU(i2) == 0) {
                    return false;
                }
                break;
            case 9:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 10:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 11:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 12:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 13:
                if (atpr.a(i2) == null) {
                    return false;
                }
                break;
            default:
                if (a.bt(i2) == 0) {
                    return false;
                }
                break;
        }
        return true;
    }
}
