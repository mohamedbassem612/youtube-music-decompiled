package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wrv extends wnn {
    public final wlp c;
    public final awmd d;
    public final Executor e;
    public final Context f;
    public final wnl g;
    private final zwb h;
    private final boolean i;
    private final awmd j;
    private final syn k;
    private final zs l;

    public wrv(abxv abxvVar, awmd awmdVar, awmd awmdVar2, zwb zwbVar, vxu vxuVar, wlp wlpVar, vxz vxzVar, Executor executor, zs zsVar, awmd awmdVar3, Context context, syn synVar) {
        super(abxvVar, vxzVar.l(106, 45791019L, false) ? (tgg) awmdVar2.io() : (tgg) awmdVar.io());
        this.h = zwbVar;
        this.i = vys.a(vxuVar);
        this.c = wlpVar;
        this.d = awmdVar2;
        this.e = executor;
        this.l = zsVar;
        this.j = awmdVar3;
        this.f = context;
        this.k = synVar;
        this.g = new wrs(wlpVar, e(), aoll.a, new wqy(14), new wrj(9));
    }

    public final wrw a() {
        return new wrw("get_panel", this.b, this.h.e(), this.i, 3);
    }

    public final wrw b() {
        return new wrw("streaming_panel", this.b, this.h.e(), this.i, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ListenableFuture c(wrw wrwVar, Executor executor) {
        if (((aolj) wrwVar.a().instance).h) {
            return this.l.t(wrwVar);
        }
        ajgq ajgqVar = wrwVar.b;
        if (ajgqVar == null || ajgqVar == ajgq.ENGAGEMENT_TYPE_UNKNOWN || !(ajgqVar == ajgq.ENGAGEMENT_TYPE_VIDEO_TRANSCRIPT_REQUEST || ((vxz) this.j.io()).m(27, 45773832L))) {
            return this.g.f(wrwVar, executor);
        }
        wrwVar.A = 1;
        agkj agkjVar = wrwVar.c;
        return ahno.as(ahno.as(this.k.n(this.h.e()), new qzc(this, ajgqVar, agkjVar, 13, (char[]) null), executor), new qzc((Object) this, (Object) wrwVar, (Object) executor, 14, (byte[]) (0 == true ? 1 : 0)), executor);
    }

    public final ListenableFuture d(wrw wrwVar) {
        if (((aolj) wrwVar.a().instance).h) {
            return this.l.t(wrwVar);
        }
        aepb aepbVar = new aepb(wrwVar, new wki(new wrr(this), new uhd(15), new uhd(16)));
        if (((AtomicBoolean) aepbVar.e).compareAndSet(false, true)) {
            return afxd.f(ape.f(new sdf(aepbVar, 9))).g(new vxq(11), this.e);
        }
        throw new IllegalStateException("renderChunk can only be called once per ChunkRetrofitter instance.");
    }

    final ListenableFuture g(wlu wluVar, wne wneVar, Executor executor) {
        return afxd.f(d((wrw) wluVar)).g(new vdm(wneVar, 15), executor);
    }
}
