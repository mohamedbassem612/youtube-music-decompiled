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
public final class hw extends hv implements io {
    public final iq a;
    private final Context b;
    private final ActionBarContextView c;
    private final hu f;
    private WeakReference g;
    private boolean h;

    public hw(Context context, ActionBarContextView actionBarContextView, hu huVar) {
        this.b = context;
        this.c = actionBarContextView;
        this.f = huVar;
        iq iqVar = new iq(actionBarContextView.getContext());
        iqVar.C();
        this.a = iqVar;
        iqVar.b = this;
    }

    @Override // defpackage.io
    public final void O(iq iqVar) {
        g();
        this.c.o();
    }

    @Override // defpackage.io
    public final boolean S(iq iqVar, MenuItem menuItem) {
        return this.f.b(this, menuItem);
    }

    @Override // defpackage.hv
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.hv
    public final MenuInflater b() {
        return new ib(this.c.getContext());
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
        return this.c.h;
    }

    @Override // defpackage.hv
    public final CharSequence e() {
        return this.c.g;
    }

    @Override // defpackage.hv
    public final void f() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.a(this);
    }

    @Override // defpackage.hv
    public final void g() {
        this.f.d(this, this.a);
    }

    @Override // defpackage.hv
    public final void h(View view) {
        this.c.j(view);
        this.g = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.hv
    public final void i(int i) {
        j(this.b.getString(i));
    }

    @Override // defpackage.hv
    public final void j(CharSequence charSequence) {
        this.c.k(charSequence);
    }

    @Override // defpackage.hv
    public final void k(int i) {
        l(this.b.getString(i));
    }

    @Override // defpackage.hv
    public final void l(CharSequence charSequence) {
        this.c.l(charSequence);
    }

    @Override // defpackage.hv
    public final void m(boolean z) {
        this.e = z;
        this.c.m(z);
    }

    @Override // defpackage.hv
    public final boolean n() {
        return this.c.j;
    }
}
