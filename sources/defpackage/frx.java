package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class frx implements fuw {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public frx(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.fuw
    public final void a(int i, int i2, int i3, int i4, int i5) {
        foe foeVar;
        int i6 = this.$cid;
        Object obj = this.a;
        if (i6 != 0) {
            synchronized (obj) {
                foeVar = ((foq) obj).i;
            }
            if (foeVar != null) {
                ((foq) obj).g(foeVar, i, i2, i3, i4, i5);
                return;
            }
            return;
        }
        fsy fsyVar = (fsy) obj;
        fsyVar.D = i;
        fsyVar.E = i2;
        fsyVar.N.b = false;
        fsyVar.D();
        int i7 = fsyVar.I;
        if (i7 != -1) {
            int iMax = Math.max(i7, i2 - i);
            int i8 = (int) (iMax * fsyVar.i);
            List list = fsyVar.b;
            int iMin = Math.min(iMax + i + i8, list.size() - 1);
            for (int iMax2 = Math.max(0, i - i8); iMax2 <= iMin; iMax2++) {
                ((fqh) list.get(iMax2)).u(iMax2, i, i2);
            }
        }
    }
}
