package defpackage;

import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class albk implements aiht {
    private final /* synthetic */ int $cid;
    static final aiht u = new albk(20);
    static final aiht t = new albk(19);
    static final aiht s = new albk(18);
    static final aiht r = new albk(17);
    static final aiht q = new albk(16);
    static final aiht p = new albk(15);
    static final aiht o = new albk(14);
    static final aiht n = new albk(13);
    static final aiht m = new albk(12);
    static final aiht l = new albk(11);
    static final aiht k = new albk(10);
    static final aiht j = new albk(9);
    static final aiht i = new albk(8);
    static final aiht h = new albk(7);
    public static final aiht g = new albk(6);
    static final aiht f = new albk(5);
    static final aiht e = new albk(4);
    static final aiht d = new albk(3);
    static final aiht c = new albk(2);
    static final aiht b = new albk(1);
    static final aiht a = new albk(0);

    private albk(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        switch (this.$cid) {
            case 0:
                return a.aU(i2) != 0;
            case 1:
                return a.aV(i2) != 0;
            case 2:
                return a.aV(i2) != 0;
            case 3:
                if (i2 == 0 || i2 == 1 || i2 == 4 || i2 == 12) {
                    return true;
                }
                switch (i2) {
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        return true;
                    default:
                        return false;
                }
            case 4:
                return a.bt(i2) != 0;
            case 5:
                return a.bt(i2) != 0;
            case 6:
                return CommonApis.g(i2) != 0;
            case 7:
                return a.bg(i2) != 0;
            case 8:
                return a.aS(i2) != 0;
            case 9:
                return a.aU(i2) != 0;
            case 10:
                return aldh.a(i2) != null;
            case 11:
                return aldi.a(i2) != null;
            case 12:
                return a.bt(i2) != 0;
            case 13:
                return a.bc(i2) != 0;
            case 14:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        return true;
                    case 6:
                    case 7:
                    case 8:
                    default:
                        return false;
                }
            case 15:
                return i2 == 0 || i2 == 1 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7;
            case 16:
                return a.bt(i2) != 0;
            case 17:
                return a.aU(i2) != 0;
            case 18:
                return a.bc(i2) != 0;
            case 19:
                return a.aV(i2) != 0;
            default:
                return a.aV(i2) != 0;
        }
    }
}
