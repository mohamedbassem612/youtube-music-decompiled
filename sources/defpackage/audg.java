package defpackage;

import internal.org.jni_zero.CommonApis;
import org.chromium.base.Callback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class audg implements aiht {
    private final /* synthetic */ int $cid;
    public static final aiht u = new audg(20);
    public static final aiht t = new audg(19);
    public static final aiht s = new audg(18);
    public static final aiht r = new audg(17);
    public static final aiht q = new audg(16);
    public static final aiht p = new audg(15);
    public static final aiht o = new audg(14);
    public static final aiht n = new audg(13);
    public static final aiht m = new audg(12);
    public static final aiht l = new audg(11);
    public static final aiht k = new audg(10);
    public static final aiht j = new audg(9);
    public static final aiht i = new audg(8);
    public static final aiht h = new audg(7);
    public static final aiht g = new audg(6);
    public static final aiht f = new audg(5);
    public static final aiht e = new audg(4);
    static final aiht d = new audg(3);
    static final aiht c = new audg(2);
    static final aiht b = new audg(1);
    static final aiht a = new audg(0);

    private audg(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        switch (this.$cid) {
            case 0:
                if (audh.a(i2) != null) {
                    return true;
                }
                break;
            case 1:
                if (audf.a(i2) != null) {
                    return true;
                }
                break;
            case 2:
                if (audi.a(i2) != null) {
                    return true;
                }
                break;
            case 3:
                if (audj.a(i2) != null) {
                    return true;
                }
                break;
            case 4:
                if (augq.a(i2) != null) {
                    return true;
                }
                break;
            case 5:
                if (a.aV(i2) != 0) {
                    return true;
                }
                break;
            case 6:
                if (atqo.A(i2) != 0) {
                    return true;
                }
                break;
            case 7:
                if (a.bc(i2) != 0) {
                    return true;
                }
                break;
            case 8:
                if (CommonApis.b(i2) != 0) {
                    return true;
                }
                break;
            case 9:
                if (a.bi(i2) != 0) {
                    return true;
                }
                break;
            case 10:
                if (Callback.Helper.g(i2) != 0) {
                    return true;
                }
                break;
            case 11:
                if (a.aX(i2) != 0) {
                    return true;
                }
                break;
            case 12:
                if (a.aX(i2) != 0) {
                    return true;
                }
                break;
            case 13:
                if (a.aS(i2) != 0) {
                    return true;
                }
                break;
            case 14:
                if (a.bg(i2) != 0) {
                    return true;
                }
                break;
            case 15:
                if (Callback.Helper.f(i2) != 0) {
                    return true;
                }
                break;
            case 16:
                if (a.aS(i2) != 0) {
                    return true;
                }
                break;
            case 17:
                if (a.bf(i2) != 0) {
                    return true;
                }
                break;
            case 18:
                if (a.be(i2) != 0) {
                    return true;
                }
                break;
            case 19:
                if (a.aV(i2) != 0) {
                    return true;
                }
                break;
            default:
                if (a.aS(i2) != 0) {
                    return true;
                }
                break;
        }
        return false;
    }
}
