package defpackage;

import android.view.MenuItem;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gv implements pd {
    final /* synthetic */ gx a;

    public gv(gx gxVar) {
        this.a = gxVar;
    }

    @Override // defpackage.pd
    public final boolean a(MenuItem menuItem) {
        return this.a.a.onMenuItemSelected(0, menuItem);
    }
}
