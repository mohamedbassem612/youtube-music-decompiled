package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vhd {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/videoeffects/fragment/RecentStickerTracker");
    public final qrx b;

    public vhd(qrx qrxVar) {
        this.b = qrxVar;
    }

    public final ListenableFuture a(bog bogVar) {
        return taf.a(bogVar, this.b.c(), new sdp(10));
    }

    public final void b(apji apjiVar, bog bogVar) {
        apjiVar.getClass();
        int i = 16;
        taf.k(bogVar, a(bogVar), new jco(i), new svm(this, apjiVar, i, null));
    }
}
