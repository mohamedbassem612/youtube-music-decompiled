package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import java.net.SocketException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gpo implements wnf {
    public static final agkz a = (agkz) Collection.EL.stream(ish.p.keySet()).map(new bwa(9)).collect(aghu.b);
    public final xir b;
    public final awkx c = new awkx();
    public final awkx d = new awkx();
    public wlu e;
    private final itq f;
    private final hur g;
    private final gmt h;
    private final tbt i;
    private final Executor j;
    private final abxv k;

    /* JADX WARN: Type inference failed for: r3v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [awmd, java.lang.Object] */
    public gpo(itq itqVar, hur hurVar, abxv abxvVar, kyr kyrVar, xit xitVar, tbt tbtVar, Executor executor, String str) {
        this.f = itqVar;
        this.g = hurVar;
        this.k = abxvVar;
        gqh gqhVar = (gqh) kyrVar.a.io();
        gqhVar.getClass();
        xsc xscVar = (xsc) kyrVar.b.io();
        xscVar.getClass();
        this.h = new gmt(gqhVar, xscVar, str);
        this.i = tbtVar;
        this.j = executor;
        this.b = xitVar.p(12);
    }

    public static boolean e(gpm gpmVar) {
        return gpmVar == gpm.c || gpmVar == gpm.d;
    }

    @Override // defpackage.wnf
    public final wlu a(acjx acjxVar) {
        wnf wnfVar;
        String strC = acjxVar.c();
        if (strC.equals("no_connection_error_continuation")) {
            return new gpn(this.k);
        }
        if (a.contains(strC)) {
            wnfVar = this.f;
        } else {
            wnfVar = hle.b(strC) ? this.g : this.h;
        }
        return wnfVar.a(acjxVar);
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture b(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }

    @Override // defpackage.wnf
    public final void c(wlu wluVar, wne wneVar, zza zzaVar) {
        wnf wnfVar;
        gpm gpmVar;
        if (wluVar instanceof gpn) {
            zzaVar.jj(new toe(new SocketException()));
            return;
        }
        this.e = wluVar;
        String str = ((almb) ((aihh) wluVar.a()).instance).e;
        if (hdu.e.contains(str)) {
            wnfVar = this.f;
            gpmVar = gpm.d;
        } else if (hdu.c.contains(str)) {
            wnfVar = this.g;
            gpmVar = gpm.c;
        } else {
            wnfVar = this.h;
            gpmVar = gpm.b;
        }
        gpm gpmVar2 = gpmVar;
        if (e(gpmVar2)) {
            tbt tbtVar = this.i;
            tbtVar.c(new haj());
            tbtVar.c(new hai(String.valueOf(str).concat("_continuation")));
            this.b.f(tau.BROWSE_REQUEST_SENT);
        }
        this.c.kk(gpmVar2);
        taf.i(wnfVar.b(wluVar, wneVar, MoreExecutors.directExecutor()), this.j, new gtq(zzaVar, 1), new gst(this, wluVar, zzaVar, gpmVar2, 1), null);
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture d(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }
}
