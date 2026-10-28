package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vaq implements uzk {
    public final vab a;
    public final avmm b;
    public final List c;
    public uyb d;
    private final awku e;

    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public vaq(cc ccVar, avmb avmbVar, vao vaoVar, uxj uxjVar, vam vamVar, vbf vbfVar, vab vabVar) {
        boolean zQ;
        awku awkuVar = new awku();
        this.e = awkuVar;
        avmm avmmVar = new avmm();
        this.b = avmmVar;
        this.c = new ArrayList();
        this.a = vabVar;
        vbd vbdVarA = vbfVar.a();
        int iOrdinal = vbdVarA.ordinal();
        if (iOrdinal == 0) {
            zQ = vaoVar.a.Q();
            if (!zQ) {
            }
            awkuVar.kk(vamVar.a());
            if (!vaoVar.d(vbdVarA)) {
                avmmVar.c(uxjVar.c.K(new hpn(vaoVar, vbdVarA, 7)).r().O(avmbVar).af(new usn(this, 19)));
            }
            ccVar.getLifecycle().b(new adp(this, 4));
        }
        if (iOrdinal == 1) {
            zQ = vaoVar.a.M();
            if (!zQ) {
            }
            awkuVar.kk(vamVar.a());
            if (!vaoVar.d(vbdVarA)) {
                avmmVar.c(uxjVar.c.K(new hpn(vaoVar, vbdVarA, 7)).r().O(avmbVar).af(new usn(this, 19)));
            }
            ccVar.getLifecycle().b(new adp(this, 4));
        }
        if (iOrdinal == 2) {
            zQ = vaoVar.a.Q();
            if (!zQ) {
            }
        }
        awkuVar.kk(vamVar.a());
        if (!vaoVar.d(vbdVarA)) {
            avmmVar.c(uxjVar.c.K(new hpn(vaoVar, vbdVarA, 7)).r().O(avmbVar).af(new usn(this, 19)));
        }
        ccVar.getLifecycle().b(new adp(this, 4));
        if (!vaoVar.d(vbdVarA)) {
            b();
            return;
        }
        awkuVar.kk(vamVar.a());
        if (!vaoVar.d(vbdVarA)) {
            avmmVar.c(uxjVar.c.K(new hpn(vaoVar, vbdVarA, 7)).r().O(avmbVar).af(new usn(this, 19)));
        }
        ccVar.getLifecycle().b(new adp(this, 4));
    }

    @Override // defpackage.uzk
    public final avlh a() {
        return avlh.C(this.e).W(avoi.a).p();
    }

    public final void b() {
        vab vabVar = this.a;
        this.e.kk(vabVar.a());
        this.c.add(vabVar.l(new usf(this, 11)));
    }
}
