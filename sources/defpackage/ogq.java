package defpackage;

import android.animation.Animator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ogq extends ogu {
    final /* synthetic */ ogr a;

    public ogq(ogr ogrVar) {
        this.a = ogrVar;
    }

    @Override // defpackage.ogu
    public final void a(long j) {
        ogr ogrVar = this.a;
        ogrVar.d++;
        Animator animator = ogrVar.a;
        if (ogrVar.a(animator) || animator.isStarted()) {
            return;
        }
        if (ogrVar.c == -1 || ogrVar.d < 0) {
            Runnable runnable = ogrVar.b;
            if (runnable != null) {
                runnable.run();
            }
            animator.start();
        }
    }
}
