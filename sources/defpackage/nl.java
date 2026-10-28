package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class nl {
    public hhb j = null;
    private final ArrayList a = new ArrayList();
    public long h = 120;
    public long i = 120;

    public static void o(oh ohVar) {
        int i = ohVar.j;
        if (ohVar.t() || (i & 4) != 0) {
            return;
        }
        int i2 = ohVar.d;
        ohVar.a();
    }

    public abstract void b(oh ohVar);

    public abstract void c();

    public abstract void d();

    public boolean i(oh ohVar, List list) {
        return n(ohVar);
    }

    public abstract boolean j();

    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    public final void k(oh ohVar) {
        m(ohVar);
        hhb hhbVar = this.j;
        if (hhbVar != null) {
            boolean z = true;
            ohVar.n(true);
            if (ohVar.h != null && ohVar.i == null) {
                ohVar.h = null;
            }
            ohVar.i = null;
            if ((ohVar.j & 16) == 0) {
                View view = ohVar.a;
                RecyclerView recyclerView = (RecyclerView) hhbVar.a;
                recyclerView.ak();
                lm lmVar = recyclerView.h;
                int i = lmVar.c;
                if (i != 1) {
                    if (i == 2) {
                        throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                    }
                    try {
                        lmVar.c = 2;
                        hhb hhbVar2 = lmVar.e;
                        int iB = hhbVar2.B(view);
                        if (iB == -1) {
                            lmVar.l(view);
                            lmVar.c = 0;
                        } else {
                            ll llVar = lmVar.a;
                            if (llVar.f(iB)) {
                                llVar.g(iB);
                                lmVar.l(view);
                                hhbVar2.E(iB);
                                lmVar.c = 0;
                            } else {
                                lmVar.c = 0;
                            }
                        }
                        if (z) {
                            oh ohVar2 = ((nq) view.getLayoutParams()).c;
                            nv nvVar = recyclerView.e;
                            nvVar.l(ohVar2);
                            nvVar.j(ohVar2);
                        }
                        recyclerView.al(!z);
                        if (z && ohVar.x()) {
                            ((RecyclerView) hhbVar.a).removeDetachedView(ohVar.a, false);
                            return;
                        }
                    } catch (Throwable th) {
                        lmVar.c = 0;
                        throw th;
                    }
                }
                if (lmVar.d != view) {
                    throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
                }
                z = false;
                if (z) {
                    oh ohVar3 = ((nq) view.getLayoutParams()).c;
                    nv nvVar2 = recyclerView.e;
                    nvVar2.l(ohVar3);
                    nvVar2.j(ohVar3);
                }
                recyclerView.al(!z);
                if (z) {
                }
            }
        }
    }

    public final void l() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((avgj) arrayList.get(i)).g();
        }
        arrayList.clear();
    }

    public boolean n(oh ohVar) {
        throw null;
    }

    public abstract boolean p(oh ohVar, cwp cwpVar, cwp cwpVar2);

    public abstract boolean q(oh ohVar, oh ohVar2, cwp cwpVar, cwp cwpVar2);

    public abstract boolean r(oh ohVar, cwp cwpVar, cwp cwpVar2);

    public abstract boolean s(oh ohVar, cwp cwpVar, cwp cwpVar2);

    public final boolean t(avgj avgjVar) {
        boolean zJ = j();
        if (avgjVar != null) {
            if (zJ) {
                this.a.add(avgjVar);
            } else {
                avgjVar.g();
            }
        }
        return zJ;
    }

    public void m(oh ohVar) {
    }
}
