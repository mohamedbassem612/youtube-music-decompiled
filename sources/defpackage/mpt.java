package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mpt implements ntp, nti {
    public final boolean a;
    public WeakReference b;
    public WeakReference c;
    private final String d;
    private final nuc e;
    private final nsl f;
    private final AtomicReference g;
    private final List h;
    private final List i = new ArrayList();
    private final int j;
    private final boolean k;

    public mpt(AtomicReference atomicReference, List list, String str, nuc nucVar, nsl nslVar, int i, boolean z, boolean z2) {
        this.g = atomicReference;
        this.h = list;
        this.d = str;
        this.e = nucVar;
        this.f = nslVar;
        this.j = i;
        this.k = z;
        this.a = z2;
    }

    private final View c(View view) {
        View viewFindViewWithTag;
        return (view == null || (viewFindViewWithTag = view.findViewWithTag(this.d)) == null) ? view : viewFindViewWithTag;
    }

    @Override // defpackage.nti
    public final void a(View view) {
        if (this.a) {
            WeakReference weakReference = this.b;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            view = view2 == null ? c(view) : view2;
            WeakReference weakReference2 = this.c;
            ket.K(view, weakReference2 != null ? (View) weakReference2.get() : null);
        }
        int i = this.j;
        for (String str : ket.I(view, i)) {
            nwj nwjVar = (nwj) this.g.get();
            boolean z = this.k;
            if (z) {
                b();
            }
            if (nwjVar != null && str != null) {
                nwjVar.e(str);
            }
            if (!z) {
                b();
            }
        }
        view.setTag(i, null);
    }

    public final void b() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((mnl) it.next()).e.set(null);
        }
        Iterator it2 = this.i.iterator();
        while (it2.hasNext()) {
            try {
                ((nwi) it2.next()).a();
            } catch (RuntimeException e) {
                this.e.f(aslh.LOG_TYPE_INTERNAL_ERROR, this.f, e, "Error in cancelling intersection subscription.", new Object[0]);
            }
        }
        this.i.clear();
        if (this.a) {
            this.c = null;
            this.b = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // defpackage.ntp
    public final /* synthetic */ void d(View view, View view2) {
        ?? r1;
        ?? r7 = view;
        if (this.a) {
            ?? C = c(view);
            this.b = new WeakReference(C);
            if (C == 0) {
                r1 = 0;
                break;
            }
            Object parent = C.getParent();
            r1 = C;
            while (true) {
                if (!(parent instanceof View)) {
                    r1 = 0;
                    break;
                }
                View view3 = (View) parent;
                if (view3 instanceof RecyclerView) {
                    break;
                }
                r1 = view3;
                parent = view3.getParent();
            }
            if (r1 != 0 && !C.equals(r1)) {
                Set setJ = ket.J(r1);
                if (setJ == null) {
                    setJ = Collections.newSetFromMap(new WeakHashMap());
                    r1.setTag(525003905, setJ);
                }
                setJ.add(C);
            }
            this.c = r1 != 0 ? new WeakReference(r1) : null;
            r7 = C;
        }
        nwj nwjVar = (nwj) this.g.get();
        if (nwjVar == null) {
            this.e.c(aslh.LOG_TYPE_INTERNAL_ERROR, this.f, "[IntersectionListener.onVisible] scrollStrategyListenerHolder is unavailable.", new Object[0]);
            return;
        }
        String str = this.d;
        ket.I(r7, this.j).add(str);
        avnq avnqVar = this.f.i;
        if (avnqVar != null) {
            avnqVar.c(new mps(this));
        }
        for (mnl mnlVar : this.h) {
            this.i.add(nwjVar.a(str, mnlVar));
            mnlVar.e.set(r7);
        }
    }
}
