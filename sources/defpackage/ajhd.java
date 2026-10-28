package defpackage;

import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajhd implements aiht {
    private final /* synthetic */ int $cid;
    static final aiht u = new ajhd(20);
    static final aiht t = new ajhd(19);
    static final aiht s = new ajhd(18);
    static final aiht r = new ajhd(17);
    static final aiht q = new ajhd(16);
    static final aiht p = new ajhd(15);
    static final aiht o = new ajhd(14);
    static final aiht n = new ajhd(13);
    static final aiht m = new ajhd(12);
    static final aiht l = new ajhd(11);
    static final aiht k = new ajhd(10);
    static final aiht j = new ajhd(9);
    static final aiht i = new ajhd(8);
    static final aiht h = new ajhd(7);
    static final aiht g = new ajhd(6);
    static final aiht f = new ajhd(5);
    static final aiht e = new ajhd(4);
    static final aiht d = new ajhd(3);
    public static final aiht c = new ajhd(2);
    static final aiht b = new ajhd(1);
    static final aiht a = new ajhd(0);

    private ajhd(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        switch (this.$cid) {
            case 0:
                return a.aS(i2) != 0;
            case 1:
                return a.aX(i2) != 0;
            case 2:
                return afxw.aA(i2) != 0;
            case 3:
                return ajhs.a(i2) != null;
            case 4:
                return i2 == 0 || i2 == 4 || i2 == 5;
            case 5:
                return ajik.a(i2) != null;
            case 6:
                return a.aX(i2) != 0;
            case 7:
                return CommonApis.b(i2) != 0;
            case 8:
                return aext.s(i2) != 0;
            case 9:
                return a.bi(i2) != 0;
            case 10:
                return CommonApis.b(i2) != 0;
            case 11:
                return a.aU(i2) != 0;
            case 12:
                return a.bt(i2) != 0;
            case 13:
                return a.aV(i2) != 0;
            case 14:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 14:
                    case 15:
                    case 16:
                        return true;
                    case 8:
                    case 13:
                    default:
                        return false;
                }
            case 15:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5;
            case 16:
                return ajok.a(i2) != null;
            case 17:
                return ajpb.a(i2) != null;
            case 18:
                return a.aS(i2) != 0;
            case 19:
                return a.aV(i2) != 0;
            default:
                return a.aW(i2) != 0;
        }
    }
}
