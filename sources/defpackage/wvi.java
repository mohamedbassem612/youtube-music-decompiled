package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wvi extends wnn {
    public static final byte[] c = new byte[0];
    public final zwb d;
    public final wnh e;
    public final wnh f;
    public final wnh g;
    public final zwy h;
    public final vxz i;
    public final vxz j;
    private final Context k;
    private final wnh l;
    private final syn m;

    public wvi(wlp wlpVar, abxv abxvVar, zwb zwbVar, vxz vxzVar, zwy zwyVar, tgg tggVar, vxz vxzVar2, Context context, syn synVar) {
        super(abxvVar, tggVar);
        this.d = zwbVar;
        this.j = vxzVar2;
        this.i = vxzVar;
        this.h = zwyVar;
        this.k = context;
        this.m = synVar;
        this.e = f(amaz.a, wlpVar, new wut(7), new wvb(3));
        this.l = f(amax.a, wlpVar, new wut(8), new wvb(4));
        this.f = f(amav.a, wlpVar, new wut(9), new wvb(5));
        this.g = f(amaq.a, wlpVar, new wut(10), new wvb(6));
        f(amal.a, wlpVar, new wut(11), new wvb(2));
    }

    public final wvf a() {
        return new wvf(this.b, this.d.e());
    }

    public final wvg b() {
        return new wvg(this.b, this.d.e());
    }

    public final ListenableFuture c(zwa zwaVar, ajgq ajgqVar, Executor executor) {
        return ahcs.e(((wvd) aguu.aw(this.k, wvd.class, this.m.m(zwaVar))).b().v(ajgqVar, agpn.b), afwl.a(new vxq(16)), executor);
    }

    public final ListenableFuture d(wvf wvfVar, Executor executor) {
        vxz vxzVar = this.i;
        ListenableFuture listenableFutureB = this.l.b(wvfVar, executor, null);
        if (vxzVar.l(3, 45370961L, false)) {
            yno.ef(this.h, listenableFutureB, executor, 160);
        }
        return listenableFutureB;
    }
}
