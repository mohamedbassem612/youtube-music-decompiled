package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.lang.Iterable$EL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hpx implements aahd {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/offline/compat/entityprovider/MusicOfflinePlaylistSyncPolicyEntityProvider");
    private final Executor b;
    private final awmd c;

    public hpx(Executor executor, awmd awmdVar) {
        this.b = executor;
        this.c = awmdVar;
    }

    @Override // defpackage.aahd
    public final ListenableFuture a(zwa zwaVar, List list) {
        wcn wcnVarB = ((wco) this.c.io()).b(zwaVar);
        ArrayList arrayList = new ArrayList();
        Iterable$EL.forEach(list, new hfo(arrayList, wcnVarB, 11));
        return ahno.ar(tzk.b(avlh.B(arrayList).j(new hpr(4)).H(new hpr(5)).ai().o(new hmd(8))), new hqt(1), this.b);
    }

    @Override // defpackage.aahd
    public final ListenableFuture b(zwa zwaVar, String str) {
        return ahno.ar(tzk.e(((wco) this.c.io()).b(zwaVar).g(wfs.g(452, str)).g(ansx.class).j(new hmd(7))), new hoh(20), this.b);
    }

    @Override // defpackage.aahd
    public final avlr c(zwa zwaVar) {
        return ((wco) this.c.io()).b(zwaVar).i(ansx.class).K(new hbz(5)).at(avoi.d, new hpw(0), avoi.c);
    }
}
