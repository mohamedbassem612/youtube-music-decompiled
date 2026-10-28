package defpackage;

import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lwe implements lxy {
    private final /* synthetic */ int $cid;
    static final lxy d = new lwe(3);
    static final lxy c = new lwe(2);
    static final lxy b = new lwe(1);
    static final lxy a = new lwe(0);

    private lwe(int i) {
        this.$cid = i;
    }

    @Override // defpackage.lxy
    public final boolean a(int i) {
        int i2 = this.$cid;
        if (i2 != 0) {
            if (i2 == 1 || i2 != 2) {
                return ixt.R(i);
            }
            if (a.bc(i) == 0) {
                return false;
            }
        } else if (CommonApis.b(i) == 0) {
            return false;
        }
        return true;
    }
}
