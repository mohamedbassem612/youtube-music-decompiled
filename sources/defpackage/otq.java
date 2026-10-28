package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class otq extends dta {
    final /* synthetic */ Runnable b;

    public otq(Runnable runnable) {
        this.b = runnable;
    }

    @Override // defpackage.dta
    public final void b(Drawable drawable) {
        boolean zG = qpj.g();
        Runnable runnable = this.b;
        if (zG) {
            runnable.run();
        } else {
            qpj.e(runnable);
        }
    }
}
