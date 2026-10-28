package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class admo extends nh implements admc, adky {
    public final HashSet a;
    public vyo e;
    public adkz f;
    private final admh g;
    private final adkr h;
    private final boolean i;
    private final ViewGroup.LayoutParams j;
    private adly k;
    private final boolean l;

    private admo(admh admhVar, ViewGroup.LayoutParams layoutParams, boolean z, boolean z2) {
        admhVar.getClass();
        this.g = admhVar;
        this.j = new ViewGroup.LayoutParams(layoutParams);
        this.h = new adkr();
        this.f = adle.a;
        this.a = new HashSet();
        this.l = z;
        this.i = z2;
    }

    @Override // defpackage.nh
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final admf e(ViewGroup viewGroup, int i) {
        adma adlfVar = i == -1 ? new adlf(viewGroup.getContext()) : this.g.c(i, viewGroup);
        View viewA = adlfVar.a();
        adul.j(viewA, adlfVar, i);
        if (viewA.getLayoutParams() == null) {
            viewA.setLayoutParams(new ViewGroup.LayoutParams(this.j));
        }
        return new admf(adlfVar);
    }

    @Override // defpackage.nh
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final void o(admf admfVar, int i) {
        adma admaVar = admfVar.s;
        adly adlyVarZ = z(admaVar, i);
        boolean z = admaVar instanceof admr;
        Object item = getItem(i);
        if (z) {
            admr admrVar = (admr) admaVar;
            admrVar.r = this.e;
            admrVar.hU(adlyVarZ, item);
        } else {
            admaVar.hU(adlyVarZ, item);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((admb) it.next()).a(admaVar, item);
        }
    }

    @Override // defpackage.nh
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final void s(admf admfVar) {
        adul.g(admfVar.a, this.g);
    }

    public final void D(adkz adkzVar, adly adlyVar) {
        this.k = adlyVar;
        adkz adkzVar2 = this.f;
        if (adkzVar != adkzVar2) {
            adkzVar.getClass();
            adkzVar2.n(this);
            this.f = adkzVar;
            adkzVar.h(this);
            jW();
        }
    }

    @Override // defpackage.nh
    public final int a() {
        return this.f.a();
    }

    @Override // defpackage.nh
    public final int b(int i) {
        int iA = this.g.a(getItem(i));
        if (iA == -1) {
            return -1;
        }
        return iA;
    }

    @Override // defpackage.nh
    public final long c(int i) {
        return this.f.c(i);
    }

    @Override // defpackage.tbj
    public final void d(int i, int i2) {
        if (this.i) {
            jW();
        } else {
            l(i, i2);
        }
    }

    @Override // defpackage.admc
    public final void f() {
        this.h.a.clear();
        this.a.clear();
        this.f.n(this);
    }

    @Override // defpackage.admc
    public final void g(admb admbVar) {
        this.a.add(admbVar);
    }

    @Override // defpackage.admc
    public final Object getItem(int i) {
        return this.f.d(i);
    }

    @Override // defpackage.admc
    public final void i(admb admbVar) {
        this.a.remove(admbVar);
    }

    @Override // defpackage.admc
    public final void jR(adlz adlzVar) {
        this.h.b(adlzVar);
    }

    @Override // defpackage.adky
    public final void jS() {
        jW();
    }

    @Override // defpackage.tbj
    public final void jT(int i, int i2) {
        j(i, i2);
    }

    @Override // defpackage.tbj
    public final void jU(int i, int i2) {
        m(i, i2);
    }

    @Override // defpackage.tbj
    public final void k(int i, int i2) {
        jY(i, i2);
    }

    @Override // defpackage.nh
    public final void w() {
        if (this.l) {
            f();
        }
    }

    public final adly z(adma admaVar, int i) {
        View viewA = admaVar.a();
        adly adlyVarC = viewA != null ? adul.c(viewA) : null;
        if (adlyVarC == null) {
            adlyVarC = new adly();
            viewA.getClass();
            viewA.setTag(R.id.presenter_adapter_context_tag, adlyVarC);
        }
        adly adlyVar = this.k;
        if (adlyVar != null) {
            adlyVarC.i(adlyVar);
        } else {
            adlyVarC.h();
        }
        adlyVarC.f("position", Integer.valueOf(i));
        this.h.a(adlyVarC, this.f, i);
        this.f.f(adlyVarC, i);
        return adlyVarC;
    }

    @Deprecated
    public admo(admh admhVar, boolean z) {
        this(admhVar, new ViewGroup.LayoutParams(-1, -2), z, false);
    }

    public admo(final ci ciVar, admh admhVar, ViewGroup.LayoutParams layoutParams, boolean z) {
        this(admhVar, layoutParams, z, false);
        g(new admb() { // from class: admm
            @Override // defpackage.admb
            public final void a(adma admaVar, Object obj) {
                ciVar.af(obj, admaVar.a());
            }
        });
    }

    public admo(ci ciVar, admh admhVar, boolean z, boolean z2) {
        this(admhVar, new ViewGroup.LayoutParams(-1, -2), z, z2);
        g(new adml(ciVar, 0));
    }
}
