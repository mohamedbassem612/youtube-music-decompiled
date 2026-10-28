package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adln extends BaseAdapter implements admc, adky {
    private final admh a;
    private final HashSet d;
    private final Map b = new WeakHashMap();
    private final adkr c = new adkr();
    private adkz e = adle.a;

    public adln(ci ciVar, admh admhVar) {
        this.a = admhVar;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        hashSet.add(new adml(ciVar, 1));
    }

    @Override // defpackage.tbj
    public final void d(int i, int i2) {
        notifyDataSetChanged();
    }

    @Override // defpackage.admc
    public final void g(admb admbVar) {
        throw null;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.e.a();
    }

    @Override // android.widget.Adapter, defpackage.admc
    public final Object getItem(int i) {
        return this.e.d(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return this.e.c(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        int iA = this.a.a(getItem(i));
        if (iA != -1) {
            return iA + 1;
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View viewA;
        adma admaVarD;
        Object item = getItem(i);
        if (j(i)) {
            view = (View) this.b.get(item);
        }
        if (view == null) {
            admh admhVar = this.a;
            int iA = admhVar.a(item);
            admaVarD = iA != -1 ? admhVar.c(iA, viewGroup) : new adlf(viewGroup.getContext());
            View viewA2 = admaVarD.a();
            adul.j(viewA2, admaVarD, iA);
            ViewGroup.LayoutParams layoutParams = viewA2.getLayoutParams();
            if (layoutParams != null && !(layoutParams instanceof AbsListView.LayoutParams)) {
                viewA2.setLayoutParams(new AbsListView.LayoutParams(layoutParams.width, layoutParams.height));
            }
            viewA = admaVarD.a();
        } else {
            viewA = view;
            admaVarD = adul.d(view);
        }
        View viewA3 = admaVarD.a();
        adly adlyVarC = viewA3 != null ? adul.c(viewA3) : null;
        if (adlyVarC == null) {
            adlyVarC = new adly();
            adul.i(viewA3, adlyVarC);
        }
        adlyVarC.h();
        adlyVarC.f("position", Integer.valueOf(i));
        this.c.a(adlyVarC, this.e, i);
        this.e.f(adlyVarC, i);
        admaVarD.hU(adlyVarC, item);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((admb) it.next()).a(admaVarD, item);
        }
        if (j(i)) {
            this.b.put(item, viewA);
        }
        return viewA;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return this.a.b() + 1;
    }

    public final void h(adkz adkzVar) {
        adkzVar.getClass();
        this.e.n(this);
        this.e = adkzVar;
        adkzVar.h(this);
        notifyDataSetChanged();
    }

    @Override // defpackage.admc
    public final void i(admb admbVar) {
        throw null;
    }

    protected final boolean j(int i) {
        return getItemViewType(i) == -1;
    }

    @Override // defpackage.admc
    public final void jR(adlz adlzVar) {
        this.c.b(adlzVar);
    }

    @Override // defpackage.adky
    public final void jS() {
        notifyDataSetChanged();
    }

    @Override // defpackage.tbj
    public final void jT(int i, int i2) {
        notifyDataSetChanged();
    }

    @Override // defpackage.tbj
    public final void jU(int i, int i2) {
        notifyDataSetChanged();
    }

    @Override // defpackage.tbj
    public final void k(int i, int i2) {
        notifyDataSetChanged();
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        this.b.clear();
    }

    @Override // defpackage.admc
    public final void f() {
    }
}
