package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jj extends iq implements SubMenu {
    public final iq k;
    public final is l;

    public jj(Context context, iq iqVar, is isVar) {
        super(context);
        this.k = iqVar;
        this.l = isVar;
    }

    @Override // defpackage.iq
    public final iq a() {
        return this.k.a();
    }

    @Override // defpackage.iq
    public final String d() {
        int i = this.l.a;
        if (i == 0) {
            return null;
        }
        return a.bR(i, "android:menu:actionviewstates:");
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.l;
    }

    @Override // defpackage.iq
    public final void p(io ioVar) {
        this.k.p(ioVar);
    }

    @Override // defpackage.iq, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.k.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        super.q(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        super.q(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        super.q(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.l.setIcon(i);
        return this;
    }

    @Override // defpackage.iq, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.k.setQwertyMode(z);
    }

    @Override // defpackage.iq
    public final boolean t(is isVar) {
        return this.k.t(isVar);
    }

    @Override // defpackage.iq
    public final boolean u(iq iqVar, MenuItem menuItem) {
        return super.u(iqVar, menuItem) || this.k.u(iqVar, menuItem);
    }

    @Override // defpackage.iq
    public final boolean v(is isVar) {
        return this.k.v(isVar);
    }

    @Override // defpackage.iq
    public final boolean w() {
        return this.k.w();
    }

    @Override // defpackage.iq
    public final boolean x() {
        return this.k.x();
    }

    @Override // defpackage.iq
    public final boolean y() {
        return this.k.y();
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.l.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.q(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.q(0, charSequence, 0, null, null);
        return this;
    }
}
