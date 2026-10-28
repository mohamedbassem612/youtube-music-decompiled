package defpackage;

import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ltw implements lxy {
    private final /* synthetic */ int $cid;
    static final lxy u = new ltw(20);
    static final lxy t = new ltw(19);
    static final lxy s = new ltw(18);
    static final lxy r = new ltw(17);
    static final lxy q = new ltw(16);
    static final lxy p = new ltw(15);
    static final lxy o = new ltw(14);
    static final lxy n = new ltw(13);
    static final lxy m = new ltw(12);
    static final lxy l = new ltw(11);
    static final lxy k = new ltw(10);
    static final lxy j = new ltw(9);
    static final lxy i = new ltw(8);
    static final lxy h = new ltw(7);
    static final lxy g = new ltw(6);
    static final lxy f = new ltw(5);
    static final lxy e = new ltw(4);
    static final lxy d = new ltw(3);
    static final lxy c = new ltw(2);
    static final lxy b = new ltw(1);
    static final lxy a = new ltw(0);

    private ltw(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.lxy
    public final boolean a(int i2) {
        switch (this.$cid) {
            case 0:
                if (a.aS(i2) != 0) {
                    return true;
                }
                break;
            case 1:
                if (a.bc(i2) != 0) {
                    return true;
                }
                break;
            case 2:
            case 7:
            case 9:
            case 10:
            case 11:
            case 19:
                return ixt.S(i2);
            case 3:
                if (lue.a(i2) != null) {
                    return true;
                }
                break;
            case 4:
                if (a.aS(i2) != 0) {
                    return true;
                }
                break;
            case 5:
                if (ixt.Q(i2) != 0) {
                    return true;
                }
                break;
            case 6:
                if (CommonApis.b(i2) != 0) {
                    return true;
                }
                break;
            case 8:
                if (a.bt(i2) != 0) {
                    return true;
                }
                break;
            case 12:
                if (luv.a(i2) != null) {
                    return true;
                }
                break;
            case 13:
            case 16:
            case 17:
                return ixt.R(i2);
            case 14:
                if (a.bh(i2) != 0) {
                    return true;
                }
                break;
            case 15:
                if (a.aS(i2) != 0) {
                    return true;
                }
                break;
            case 18:
                if (lvs.a(i2) != null) {
                    return true;
                }
                break;
            default:
                if (a.be(i2) != 0) {
                    return true;
                }
                break;
        }
        return false;
    }
}
