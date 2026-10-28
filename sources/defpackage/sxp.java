package defpackage;

import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class sxp extends fx {
    @Override // android.app.Activity
    public final Intent getIntent() {
        return ((sxl) aguu.av(this, sxl.class)).V().c(getClass(), super.getIntent(), 1);
    }

    protected void k(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onActivityReenter(int i, Intent intent) {
        super.onActivityReenter(i, sxn.a(this).c(getClass(), intent, 4));
    }

    @Override // defpackage.cf, defpackage.qe, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        k(i, i2, sxn.a(this).c(getClass(), intent, 2));
    }

    @Override // defpackage.qe, android.app.Activity
    public final void onNewIntent(Intent intent) {
        p(sxn.a(this).c(getClass(), intent, 3));
    }

    protected void p(Intent intent) {
        super.onNewIntent(intent);
    }
}
