package defpackage;

import android.view.MenuItem;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class iv implements MenuItem.OnActionExpandListener {
    final /* synthetic */ ix a;
    private final MenuItem.OnActionExpandListener b;

    public iv(ix ixVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.a = ixVar;
        this.b = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.b.onMenuItemActionCollapse(this.a.a(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.b.onMenuItemActionExpand(this.a.a(menuItem));
    }
}
