package defpackage;

import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahvo implements aheh {
    final /* synthetic */ ListenableFuture a;
    final /* synthetic */ ahwf b;
    final /* synthetic */ ahvq c;

    public ahvo(ahvq ahvqVar, ListenableFuture listenableFuture, ahwf ahwfVar) {
        this.a = listenableFuture;
        this.b = ahwfVar;
        this.c = ahvqVar;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        Log.e("ClientLoggingBackend", "Error while logging.", th);
    }

    @Override // defpackage.aheh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ListenableFuture listenableFuture = this.a;
            ahvn ahvnVar = new ahvn(this, this.b);
            long j = afwl.a;
            listenableFuture.addListener(new ahei(listenableFuture, new afwj(afty.c(false), ahvnVar, 0)), this.c.a);
        }
    }
}
