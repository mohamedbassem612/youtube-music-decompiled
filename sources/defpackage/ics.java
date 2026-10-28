package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ics implements tbj {
    public final Set a = new HashSet();
    final /* synthetic */ ict b;

    public ics(ict ictVar) {
        this.b = ictVar;
    }

    @Override // defpackage.tbj
    public final void d(int i, int i2) {
        taq.d();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((tbj) it.next()).d(i, i2);
        }
    }

    @Override // defpackage.tbj
    public final void jT(int i, int i2) {
        taq.d();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((tbj) it.next()).jT(i, i2);
        }
    }

    @Override // defpackage.tbj
    public final void jU(int i, int i2) {
        taq.d();
        for (tbj tbjVar : this.a) {
            ict ictVar = this.b;
            if (ictVar.e.l(66, 45726326L, false)) {
                ictVar.b.post(new jie(tbjVar, i, i2, 1));
            } else {
                tbjVar.jU(i, i2);
            }
        }
    }

    @Override // defpackage.tbj
    public final void k(int i, int i2) {
        taq.d();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((tbj) it.next()).k(i, i2);
        }
    }
}
