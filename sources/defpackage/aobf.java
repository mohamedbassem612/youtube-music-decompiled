package defpackage;

import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aobf implements aiht {
    private final /* synthetic */ int $cid;
    static final aiht h = new aobf(7);
    static final aiht g = new aobf(6);
    static final aiht f = new aobf(5);
    static final aiht e = new aobf(4);
    static final aiht d = new aobf(3);
    static final aiht c = new aobf(2);
    static final aiht b = new aobf(1);
    public static final aiht a = new aobf(0);

    private aobf(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i) {
        switch (this.$cid) {
            case 0:
                if (a.aS(i) != 0) {
                    return true;
                }
                break;
            case 1:
                if (a.aU(i) != 0) {
                    return true;
                }
                break;
            case 2:
                if (CommonApis.f(i) != 0) {
                    return true;
                }
                break;
            case 3:
                if (aoci.a(i) != null) {
                    return true;
                }
                break;
            case 4:
                if (a.aU(i) != 0) {
                    return true;
                }
                break;
            case 5:
                if (agvp.H(i) != 0) {
                    return true;
                }
                break;
            case 6:
                if (aocj.a(i) != null) {
                    return true;
                }
                break;
            default:
                if (aock.a(i) != null) {
                    return true;
                }
                break;
        }
        return false;
    }
}
