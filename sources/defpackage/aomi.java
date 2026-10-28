package defpackage;

import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aomi implements aiht {
    private final /* synthetic */ int $cid;
    static final aiht u = new aomi(20);
    static final aiht t = new aomi(19);
    static final aiht s = new aomi(18);
    static final aiht r = new aomi(17);
    static final aiht q = new aomi(16);
    static final aiht p = new aomi(15);
    static final aiht o = new aomi(14);
    static final aiht n = new aomi(13);
    static final aiht m = new aomi(12);
    public static final aiht l = new aomi(11);
    static final aiht k = new aomi(10);
    static final aiht j = new aomi(9);
    static final aiht i = new aomi(8);
    static final aiht h = new aomi(7);
    static final aiht g = new aomi(6);
    static final aiht f = new aomi(5);
    static final aiht e = new aomi(4);
    static final aiht d = new aomi(3);
    static final aiht c = new aomi(2);
    static final aiht b = new aomi(1);
    static final aiht a = new aomi(0);

    private aomi(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        switch (this.$cid) {
            case 0:
                return a.bt(i2) != 0;
            case 1:
                return a.aU(i2) != 0;
            case 2:
                return a.aS(i2) != 0;
            case 3:
                if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 5) {
                    return true;
                }
                switch (i2) {
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        return true;
                    default:
                        return false;
                }
            case 4:
                return aomq.a(i2) != null;
            case 5:
                return aonc.a(i2) != null;
            case 6:
                return a.aS(i2) != 0;
            case 7:
                return a.aS(i2) != 0;
            case 8:
                return a.bi(i2) != 0;
            case 9:
                return agvp.D(i2) != 0;
            case 10:
                return aony.a(i2) != null;
            case 11:
                return aooc.a(i2) != null;
            case 12:
                return acfz.bw(i2) != 0;
            case 13:
                return a.aS(i2) != 0;
            case 14:
                return a.bc(i2) != 0;
            case 15:
                return aopw.a(i2) != null;
            case 16:
                return CommonApis.g(i2) != 0;
            case 17:
                return a.bf(i2) != 0;
            case 18:
                return acfz.bv(i2) != 0;
            case 19:
                return aosq.a(i2) != null;
            default:
                return aost.a(i2) != null;
        }
    }
}
