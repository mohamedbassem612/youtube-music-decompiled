package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(b = aixo.SLOT_TYPE_BELOW_PLAYER)
public final class saw implements sba {
    private final smr a;
    private final rsk b;
    private final sbb c;
    private final oml d;

    public saw(rsk rskVar, sbb sbbVar, smr smrVar, oml omlVar) {
        this.b = rskVar;
        this.c = sbbVar;
        this.a = smrVar;
        this.d = omlVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.sba
    public final void a(shh shhVar) {
        smr smrVar = this.a;
        aixo aixoVarC = smrVar.c();
        Iterator it = this.d.b.values().iterator();
        while (it.hasNext()) {
            if (((List) it.next()).contains(aixoVarC)) {
                this.b.v(smrVar, new sau("Not allowed to enter a slot that is being ablated.", 135), 7);
                return;
            }
        }
        rtd rtdVar = this.c.a;
        if (rtdVar == null) {
            this.b.v(smrVar, new sau("No belowPlayerSpaceAcquirerApi available", 22), 7);
            return;
        }
        joz jozVar = (joz) rtdVar;
        if (jozVar.af != null) {
            xsc xscVar = (xsc) jozVar.ab.io();
            rsf rsfVar = jozVar.af;
            int i = 0;
            while (true) {
                afx afxVar = (afx) xscVar.b;
                if (i >= afxVar.c) {
                    break;
                }
                rsfVar.a.add((sqr) afxVar.b(i));
                i++;
            }
            int i2 = 0;
            while (true) {
                afx afxVar2 = (afx) xscVar.a;
                if (i2 >= afxVar2.c) {
                    break;
                }
                rsfVar.b.add((sqr) afxVar2.b(i2));
                i2++;
            }
        }
        if (jozVar.o != null) {
            ((sqr) ((xsc) jozVar.ab.io()).c).a(jozVar.o.a, jozVar.F);
            jozVar.B.setVisibility(0);
        }
        this.b.j(smrVar);
    }

    @Override // defpackage.sba
    public final void b() {
        rtd rtdVar = this.c.a;
        if (rtdVar == null) {
            rmp.n(this.a, "No belowPlayerSpaceAcquirerApi when trying to exit slot");
        } else {
            joz jozVar = (joz) rtdVar;
            jozVar.B.setVisibility(8);
            sqq sqqVar = jozVar.o;
            if (sqqVar != null) {
                sqqVar.b((admh) jozVar.al.io());
            }
        }
        this.b.l(this.a);
    }
}
