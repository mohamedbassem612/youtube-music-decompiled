package defpackage;

import android.os.SystemClock;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class adec implements ntm {
    final /* synthetic */ aedc a;
    final /* synthetic */ aded b;

    public adec(aded adedVar, aedc aedcVar) {
        this.a = aedcVar;
        this.b = adedVar;
    }

    @Override // defpackage.ntm
    public final void a(View view) {
        if (view != null) {
            this.a.onTouch(view, this.b.b(SystemClock.uptimeMillis(), 3, new nxg(0.0f, 0.0f)));
        }
    }
}
