package defpackage;

import android.view.MotionEvent;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aded implements nvq {
    public long a;

    @Override // defpackage.nvq
    public final aigw a() {
        return apmj.b;
    }

    public final MotionEvent b(long j, int i, nxg nxgVar) {
        return MotionEvent.obtain(this.a, j, i, nxgVar.a, nxgVar.b, 0);
    }

    @Override // defpackage.nvs
    public final /* bridge */ /* synthetic */ void c(fhd fhdVar, nsl nslVar, Object obj, ntq ntqVar) {
        if (((apmj) obj).c) {
            Interpolator interpolator = aedd.a;
            aedc aedcVar = new aedc();
            ntqVar.q(new adea(this, aedcVar));
            ntqVar.r(new adeb(this, aedcVar));
            ntqVar.p(new adec(this, aedcVar));
        }
    }

    @Override // defpackage.nvs
    public final /* synthetic */ void d(ntq ntqVar) {
        throw null;
    }

    @Override // defpackage.nvs
    public final /* synthetic */ void e(fhd fhdVar, nsl nslVar, String str, Object obj, ntq ntqVar, nru nruVar) {
        throw null;
    }
}
