package defpackage;

import android.app.Activity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sxs extends syh {
    private final Activity c;

    public sxs(Activity activity, sxu sxuVar) {
        super(sxuVar);
        activity.getClass();
        this.c = activity;
    }

    @Override // defpackage.syh
    protected final void c(Runnable runnable) {
        this.c.runOnUiThread(runnable);
    }
}
