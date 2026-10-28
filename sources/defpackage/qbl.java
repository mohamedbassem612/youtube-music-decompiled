package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class qbl implements aheh {
    final /* synthetic */ long a;
    final /* synthetic */ plx b;
    final /* synthetic */ int c;
    final /* synthetic */ qbm d;

    public qbl(qbm qbmVar, long j, plx plxVar, int i) {
        this.a = j;
        this.b = plxVar;
        this.c = i;
        this.d = qbmVar;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        agsj agsjVar = (agsj) ((agsj) qbm.a.c()).k("com/google/android/libraries/notifications/scheduled/impl/workmanager/ChimeTaskSchedulerApiImpl$1", "onFailure", 190, "ChimeTaskSchedulerApiImpl.java");
        qbm qbmVar = this.d;
        String packageName = qbmVar.b.getApplicationContext().getPackageName();
        plx plxVar = this.b;
        Long lValueOf = plxVar == null ? null : Long.valueOf(plxVar.a);
        int i = this.c;
        agsjVar.E("Failed to schedule a job for package [%s] with ID: %s, type: %s", packageName, qbmVar.d(lValueOf, i), Integer.valueOf(i));
    }

    @Override // defpackage.aheh
    public final void b(Object obj) {
        qbm qbmVar = this.d;
        long jB = qbmVar.e.b() - this.a;
        Context context = qbmVar.b;
        qbmVar.d.o(jB, context.getPackageName(), qbmVar.c.a, Build.VERSION.SDK_INT, "ENQUEUE_WORKMANAGER");
        context.getApplicationContext().getPackageName();
        plx plxVar = this.b;
        qbmVar.d(plxVar == null ? null : Long.valueOf(plxVar.a), this.c);
    }
}
