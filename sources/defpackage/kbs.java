package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class kbs extends hna {
    final /* synthetic */ kbu a;

    public kbs(kbu kbuVar) {
        this.a = kbuVar;
    }

    @Override // defpackage.hna
    public final void M(int i) {
        Iterator it = new HashSet(this.a.a).iterator();
        while (it.hasNext()) {
            ((hna) it.next()).M(i);
        }
    }

    @Override // defpackage.hna
    public final void N(int i) {
        kbu kbuVar = this.a;
        kbuVar.d(i);
        kbuVar.p(i);
        Iterator it = new HashSet(kbuVar.a).iterator();
        while (it.hasNext()) {
            ((hna) it.next()).N(i);
        }
    }

    @Override // defpackage.hna
    public final void O(jzt jztVar) {
        Iterator it = new HashSet(this.a.a).iterator();
        while (it.hasNext()) {
            ((hna) it.next()).O(jztVar);
        }
    }

    @Override // defpackage.hna
    public final void P() {
        Iterator it = new HashSet(this.a.a).iterator();
        while (it.hasNext()) {
            ((hna) it.next()).P();
        }
    }

    @Override // defpackage.hna
    public final void Q(int i) {
        Iterator it = new HashSet(this.a.a).iterator();
        while (it.hasNext()) {
            ((hna) it.next()).Q(i);
        }
    }

    @Override // defpackage.hna
    public final void R() {
        Iterator it = new HashSet(this.a.a).iterator();
        while (it.hasNext()) {
            ((hna) it.next()).R();
        }
    }
}
