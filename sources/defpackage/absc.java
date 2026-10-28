package defpackage;

import android.app.Activity;
import android.app.AlertDialog;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class absc implements absj, absi {
    public final Activity a;
    protected String b = "";
    protected String c = "";
    protected aoqv d;
    public AlertDialog e;
    public final absa f;

    public absc(Activity activity, absa absaVar) {
        this.a = activity;
        this.f = absaVar;
    }

    @Override // defpackage.absi
    public final Activity a() {
        return this.a;
    }

    @Override // defpackage.absi
    public final void b() {
        AlertDialog alertDialog;
        Activity activity = this.a;
        if (!activity.isFinishing() && !activity.isDestroyed() && (alertDialog = this.e) != null && alertDialog.isShowing()) {
            this.e.cancel();
        }
        this.e = null;
    }
}
