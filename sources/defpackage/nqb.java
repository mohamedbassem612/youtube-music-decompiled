package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nqb implements nte {
    private final Set b = Collections.newSetFromMap(new ConcurrentHashMap());
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final int f;
    private final boolean g;

    public nqb(boolean z, boolean z2, boolean z3, int i, boolean z4) {
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = true != z3 ? -1 : i;
        this.g = z4;
    }

    @Override // defpackage.nte
    public final void a() {
        Set set = this.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((fdx) it.next()).c();
        }
        set.clear();
    }

    @Override // defpackage.nte
    public final void b(Context context, nci nciVar, nci nciVar2, nci nciVar3, omj omjVar, int i, int i2, mro mroVar, nuc nucVar) {
        nqn nqnVarBO;
        if (qnl.bG(context)) {
            nqnVarBO = null;
        } else {
            boolean z = this.g;
            nqnVarBO = qnl.bO(erj.d(context), context, nciVar, nciVar2, nciVar3, omjVar, i, i2, this.c, false, z);
        }
        if (nqnVarBO != null) {
            int iO = nciVar.o();
            boolean z2 = this.d;
            npz npzVar = new npz(nciVar, mroVar, i, i2, qnl.bI(iO, z2, this.e, this.f), nucVar, z2);
            nqnVarBO.a.q(npzVar);
            fdx fdxVar = npzVar.c;
            if (fdxVar == null) {
                nucVar.c(aslh.LOG_TYPE_MISSING_FIELD, nsl.a, "Unexpected null requester", new Object[0]);
            } else {
                this.b.add(fdxVar);
            }
        }
    }
}
