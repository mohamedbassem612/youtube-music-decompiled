package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class fsf implements fhq {
    private final /* synthetic */ int $cid;
    final /* synthetic */ fqh a;
    final /* synthetic */ fsy b;

    public fsf(fsy fsyVar, fqh fqhVar, int i) {
        this.$cid = i;
        this.a = fqhVar;
        this.b = fsyVar;
    }

    @Override // defpackage.fhq
    public final void a(int i, int i2, boolean z) {
        int iIndexOf;
        if (this.$cid != 0) {
            fsy fsyVar = this.b;
            if (fsyVar.r() == -1 || !z) {
                return;
            }
            synchronized (fsyVar) {
                iIndexOf = fsyVar.b.indexOf(this.a);
            }
            if (iIndexOf == 0) {
                fsy fsyVar2 = this.b;
                fkw fkwVarS = fsy.s(fsyVar2.g, this.a);
                if (fkwVarS.b != fsyVar2.J.b) {
                    fsy.S(fsyVar2, fkwVarS);
                    return;
                }
                return;
            }
            return;
        }
        fqh fqhVar = this.a;
        if (fqhVar.a() != i2) {
            fqhVar.m(i2);
            fsy fsyVar3 = this.b;
            int iR = fsyVar3.r();
            if (fsyVar3.z) {
                Map map = fsyVar3.r;
                boolean z2 = false;
                if (map.containsKey(fqhVar) && ((Integer) map.get(fqhVar)).intValue() != i2) {
                    z2 = true;
                }
                if (iR != -1 && fqhVar.a() <= iR && !z2) {
                    map.put(fqhVar, Integer.valueOf(i2));
                    return;
                }
            } else if (iR != -1 && fqhVar.a() == iR) {
                return;
            }
            synchronized (fsyVar3) {
                fsyVar3.O(i);
                fsyVar3.N();
            }
        }
    }
}
