package defpackage;

import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atxs implements aiht {
    private final /* synthetic */ int $cid;
    public static final aiht u = new atxs(20);
    public static final aiht t = new atxs(19);
    public static final aiht s = new atxs(18);
    public static final aiht r = new atxs(17);
    public static final aiht q = new atxs(16);
    public static final aiht p = new atxs(15);
    public static final aiht o = new atxs(14);
    public static final aiht n = new atxs(13);
    public static final aiht m = new atxs(12);
    public static final aiht l = new atxs(11);
    public static final aiht k = new atxs(10);
    public static final aiht j = new atxs(9);
    public static final aiht i = new atxs(8);
    public static final aiht h = new atxs(7);
    public static final aiht g = new atxs(6);
    public static final aiht f = new atxs(5);
    public static final aiht e = new atxs(4);
    public static final aiht d = new atxs(3);
    public static final aiht c = new atxs(2);
    public static final aiht b = new atxs(1);
    public static final aiht a = new atxs(0);

    private atxs(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        Enum r0 = null;
        switch (this.$cid) {
            case 0:
                return CommonApis.c(i2) != 0;
            case 1:
                if (i2 == 0) {
                    r0 = atru.TEXT_DECORATION_TYPE_UNSPECIFIED;
                } else if (i2 == 1) {
                    r0 = atru.TEXT_DECORATION_TYPE_NO_DECORATION;
                } else if (i2 == 2) {
                    r0 = atru.TEXT_DECORATION_TYPE_UNDERLINE;
                } else if (i2 == 3) {
                    r0 = atru.TEXT_DECORATION_TYPE_OVERLINE;
                } else if (i2 == 4) {
                    r0 = atru.TEXT_DECORATION_TYPE_LINE_THROUGH;
                }
                return r0 != null;
            case 2:
                return a.aV(i2) != 0;
            case 3:
                switch (i2) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return true;
                    default:
                        return false;
                }
            case 4:
                return a.aX(i2) != 0;
            case 5:
                return a.aS(i2) != 0;
            case 6:
                return atzx.a(i2) != null;
            case 7:
                if (i2 == 0) {
                    r0 = auag.DAY_OF_WEEK_STYLE_UNSPECIFIED;
                } else if (i2 == 1) {
                    r0 = auag.DAY_OF_WEEK_NORMAL;
                } else if (i2 == 2) {
                    r0 = auag.DAY_OF_WEEK_LIGHT;
                }
                return r0 != null;
            case 8:
                return a.bt(i2) != 0;
            case 9:
                return a.bg(i2) != 0;
            case 10:
                if (i2 == 0) {
                    r0 = auar.LOCATION_STYLE_UNSPECIFIED;
                } else if (i2 == 1) {
                    r0 = auar.LOCATION_NORMAL;
                } else if (i2 == 2) {
                    r0 = auar.LOCATION_LIGHT;
                }
                return r0 != null;
            case 11:
                return aucv.a(i2) != null;
            case 12:
                return aucw.a(i2) != null;
            case 13:
                return aucx.a(i2) != null;
            case 14:
                return aucy.a(i2) != null;
            case 15:
                return aucz.a(i2) != null;
            case 16:
                return auda.a(i2) != null;
            case 17:
                return audb.a(i2) != null;
            case 18:
                return audc.a(i2) != null;
            case 19:
                return audd.a(i2) != null;
            default:
                return aude.a(i2) != null;
        }
    }
}
