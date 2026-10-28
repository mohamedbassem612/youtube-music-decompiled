package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aeyv implements OnBackAnimationCallback {
    final /* synthetic */ aeyt a;
    final /* synthetic */ aeyw b;

    public aeyv(aeyw aeywVar, aeyt aeytVar) {
        this.a = aeytVar;
        this.b = aeywVar;
    }

    public final void onBackCancelled() {
        if (this.b.d()) {
            this.a.z();
        }
    }

    public final void onBackInvoked() {
        this.a.B();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.b.d()) {
            this.a.M(new pw(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.b.d()) {
            this.a.K(new pw(backEvent));
        }
    }
}
