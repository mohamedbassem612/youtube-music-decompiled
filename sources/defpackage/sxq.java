package defpackage;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sxq implements ComponentCallbacks {
    final /* synthetic */ avls a;

    public sxq(avls avlsVar) {
        this.a = avlsVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        avls avlsVar = this.a;
        if (avlsVar.f()) {
            return;
        }
        avlsVar.c(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
