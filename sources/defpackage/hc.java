package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hc extends hv implements io {
    public final iq a;
    public hu b;
    final /* synthetic */ hd c;
    private final Context f;
    private WeakReference g;

    public hc(hd hdVar, Context context, hu huVar) {
        this.c = hdVar;
        this.f = context;
        this.b = huVar;
        iq iqVar = new iq(context);
        iqVar.C();
        this.a = iqVar;
        iqVar.b = this;
    }

    @Override // defpackage.io
    public final void O(iq iqVar) {
        if (this.b != null) {
            g();
            this.c.d.o();
        }
    }

    @Override // defpackage.io
    public final boolean S(iq iqVar, MenuItem menuItem) {
        hu huVar = this.b;
        if (huVar != null) {
            return huVar.b(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.hv
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.hv
    public final MenuInflater b() {
        return new ib(this.f);
    }

    @Override // defpackage.hv
    public final View c() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.hv
    public final CharSequence d() {
        return this.c.d.h;
    }

    @Override // defpackage.hv
    public final CharSequence e() {
        return this.c.d.g;
    }

    @Override // defpackage.hv
    public final void f() {
        hd hdVar = this.c;
        if (hdVar.f == this) {
            if (hd.D(hdVar.k, false)) {
                this.b.a(this);
            } else {
                hdVar.g = this;
                hdVar.h = this.b;
            }
            this.b = null;
            hdVar.A(false);
            ActionBarContextView actionBarContextView = hdVar.d;
            if (actionBarContextView.i == null) {
                actionBarContextView.i();
            }
            hdVar.b.k(hdVar.m);
            hdVar.f = null;
        }
    }

    @Override // defpackage.hv
    public final void g() {
        if (this.c.f == this) {
            iq iqVar = this.a;
            iqVar.s();
            try {
                this.b.d(this, iqVar);
            } finally {
                this.a.r();
            }
        }
    }

    @Override // defpackage.hv
    public final void h(View view) {
        this.c.d.j(view);
        this.g = new WeakReference(view);
    }

    @Override // defpackage.hv
    public final void i(int i) {
        j(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.hv
    public final void j(CharSequence charSequence) {
        this.c.d.k(charSequence);
    }

    @Override // defpackage.hv
    public final void k(int i) {
        l(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.hv
    public final void l(CharSequence charSequence) {
        this.c.d.l(charSequence);
    }

    @Override // defpackage.hv
    public final void m(boolean z) {
        this.e = z;
        this.c.d.m(z);
    }

    @Override // defpackage.hv
    public final boolean n() {
        return this.c.d.j;
    }
}
