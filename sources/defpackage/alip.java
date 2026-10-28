package defpackage;

import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class alip implements aiht {
    private final /* synthetic */ int $cid;
    static final aiht u = new alip(20);
    static final aiht t = new alip(19);
    static final aiht s = new alip(18);
    static final aiht r = new alip(17);
    static final aiht q = new alip(16);
    static final aiht p = new alip(15);
    static final aiht o = new alip(14);
    static final aiht n = new alip(13);
    static final aiht m = new alip(12);
    static final aiht l = new alip(11);
    static final aiht k = new alip(10);
    static final aiht j = new alip(9);
    static final aiht i = new alip(8);
    static final aiht h = new alip(7);
    static final aiht g = new alip(6);
    static final aiht f = new alip(5);
    static final aiht e = new alip(4);
    static final aiht d = new alip(3);
    static final aiht c = new alip(2);
    static final aiht b = new alip(1);
    static final aiht a = new alip(0);

    private alip(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        switch (this.$cid) {
            case 0:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                        return true;
                    case 7:
                    default:
                        return false;
                }
            case 1:
                return a.bh(i2) != 0;
            case 2:
                return a.bh(i2) != 0;
            case 3:
                return a.bc(i2) != 0;
            case 4:
                return a.aV(i2) != 0;
            case 5:
                return a.bt(i2) != 0;
            case 6:
                return a.aV(i2) != 0;
            case 7:
                return CommonApis.e(i2) != 0;
            case 8:
                return a.aU(i2) != 0;
            case 9:
                return a.aS(i2) != 0;
            case 10:
                return a.bc(i2) != 0;
            case 11:
                return a.aV(i2) != 0;
            case 12:
                return a.aS(i2) != 0;
            case 13:
                return CommonApis.b(i2) != 0;
            case 14:
                return a.be(i2) != 0;
            case 15:
                return afyd.D(i2) != 0;
            case 16:
                return CommonApis.c(i2) != 0;
            case 17:
                return a.bi(i2) != 0;
            case 18:
                return a.aS(i2) != 0;
            case 19:
                return a.bt(i2) != 0;
            default:
                return a.aV(i2) != 0;
        }
    }
}
