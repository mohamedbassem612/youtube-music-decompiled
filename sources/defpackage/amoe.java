package defpackage;

import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class amoe implements aiht {
    private final /* synthetic */ int $cid;
    static final aiht u = new amoe(20);
    static final aiht t = new amoe(19);
    static final aiht s = new amoe(18);
    static final aiht r = new amoe(17);
    static final aiht q = new amoe(16);
    static final aiht p = new amoe(15);
    static final aiht o = new amoe(14);
    static final aiht n = new amoe(13);
    static final aiht m = new amoe(12);
    static final aiht l = new amoe(11);
    static final aiht k = new amoe(10);
    static final aiht j = new amoe(9);
    static final aiht i = new amoe(8);
    static final aiht h = new amoe(7);
    static final aiht g = new amoe(6);
    static final aiht f = new amoe(5);
    static final aiht e = new amoe(4);
    static final aiht d = new amoe(3);
    static final aiht c = new amoe(2);
    static final aiht b = new amoe(1);
    static final aiht a = new amoe(0);

    private amoe(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        switch (this.$cid) {
            case 0:
                return a.aS(i2) != 0;
            case 1:
                return a.be(i2) != 0;
            case 2:
                return a.aS(i2) != 0;
            case 3:
                return agvp.Y(i2) != 0;
            case 4:
                return a.aS(i2) != 0;
            case 5:
                return a.aV(i2) != 0;
            case 6:
                return a.aU(i2) != 0;
            case 7:
                return a.aV(i2) != 0;
            case 8:
                return amse.a(i2) != null;
            case 9:
                return a.aV(i2) != 0;
            case 10:
                return a.bc(i2) != 0;
            case 11:
                return amtn.a(i2) != null;
            case 12:
                switch (i2) {
                    case 0:
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
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                        return true;
                    default:
                        return false;
                }
            case 13:
                return CommonApis.h(i2) != 0;
            case 14:
                return amwi.a(i2) != null;
            case 15:
                return amwn.a(i2) != null;
            case 16:
                return amyn.a(i2) != null;
            case 17:
                return a.aS(i2) != 0;
            case 18:
                return a.aX(i2) != 0;
            case 19:
                return a.aS(i2) != 0;
            default:
                return a.aX(i2) != 0;
        }
    }
}
