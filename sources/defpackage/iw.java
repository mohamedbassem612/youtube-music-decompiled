package defpackage;

import android.view.MenuItem;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class iw implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ ix a;
    private final MenuItem.OnMenuItemClickListener b;

    public iw(ix ixVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.a = ixVar;
        this.b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.b.onMenuItemClick(this.a.a(menuItem));
    }
}
