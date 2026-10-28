package defpackage;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cp implements ayr {
    final /* synthetic */ dd a;

    public cp(dd ddVar) {
        this.a = ddVar;
    }

    @Override // defpackage.ayr
    public final void a(Menu menu, MenuInflater menuInflater) {
        this.a.X(menu, menuInflater);
    }

    @Override // defpackage.ayr
    public final void b(Menu menu) {
        this.a.z(menu);
    }

    @Override // defpackage.ayr
    public final void c(Menu menu) {
        this.a.Z(menu);
    }

    @Override // defpackage.ayr
    public final boolean d(MenuItem menuItem) {
        return this.a.Y(menuItem);
    }
}
