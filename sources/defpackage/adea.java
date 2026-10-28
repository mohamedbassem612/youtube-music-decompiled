package defpackage;

import android.os.SystemClock;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class adea implements ntn {
    final /* synthetic */ aedc a;
    final /* synthetic */ aded b;

    public adea(aded adedVar, aedc aedcVar) {
        this.a = aedcVar;
        this.b = adedVar;
    }

    @Override // defpackage.ntn
    public final void a(View view, nxg nxgVar) {
        aded adedVar = this.b;
        long jUptimeMillis = SystemClock.uptimeMillis();
        adedVar.a = jUptimeMillis;
        if (view != null) {
            this.a.onTouch(view, adedVar.b(jUptimeMillis, 0, nxgVar));
        }
    }
}
