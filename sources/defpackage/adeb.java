package defpackage;

import android.os.SystemClock;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class adeb implements nto {
    final /* synthetic */ aedc a;
    final /* synthetic */ aded b;

    public adeb(aded adedVar, aedc aedcVar) {
        this.a = aedcVar;
        this.b = adedVar;
    }

    @Override // defpackage.nto
    public final void a(View view, nxg nxgVar) {
        if (view != null) {
            this.a.onTouch(view, this.b.b(SystemClock.uptimeMillis(), 1, nxgVar));
        }
    }
}
