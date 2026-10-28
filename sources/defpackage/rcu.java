package defpackage;

import com.google.android.libraries.video.mediaengine.effects.skia.SkiaLayerLruCache;
import com.google.android.libraries.video.mediaengine.textures.processors.SkiaTextureProcessor;
import j$.lang.Iterable$EL;
import j$.util.Optional;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rcu implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ rcu(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r7v49, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.lang.Runnable
    public final void run() {
        rdi rdiVar;
        rfs rfsVar;
        switch (this.$cid) {
            case 0:
                qxm qxmVar = ((rcz) this.a).l;
                qxmVar.g();
                if (qxmVar.w) {
                    return;
                }
                if (qxmVar.h()) {
                    Iterable$EL.forEach(qxmVar.p, new hgi(7));
                    qxmVar.s++;
                    qxp qxpVar = qxmVar.d;
                    ahno.O(qxpVar.d);
                    qxpVar.b.j(3).p();
                }
                qxmVar.w = true;
                return;
            case 1:
                qxn qxnVar = ((qyh) this.a).l;
                if (qxnVar != null) {
                    qxnVar.a();
                    return;
                }
                return;
            case 2:
                qyb qybVar = new qyb(null);
                qybVar.h();
                rcz rczVar = (rcz) this.a;
                qyt qytVar = rczVar.f;
                qua quaVar = qytVar.a;
                if (quaVar.O) {
                    qybVar.f(new rcx(rczVar.k));
                }
                qxk qxkVar = new qxk(rczVar.c);
                qxkVar.d = rcz.a;
                qxkVar.f = rczVar.b;
                qxkVar.e = 50;
                qxkVar.c = rczVar.n.k();
                qxkVar.i = rczVar.e;
                qxkVar.k = qytVar;
                qxkVar.j = rczVar.i;
                int millis = (int) quaVar.N.toMillis();
                ahno.G((millis ^ (-1)) >>> 31, "Start ahead value must be non-negative.");
                qxkVar.g = millis;
                qxkVar.h = 500;
                qxkVar.l = rczVar.g;
                qxkVar.m = rczVar.h;
                qxkVar.n = rczVar.j;
                qxkVar.o = qybVar;
                ahno.P(qxkVar.d != null, "Output audio format is required.");
                ahno.P(qxkVar.n != null, "Background executor is required.");
                ahno.P(qxkVar.o != null, "Audio sink is required.");
                if (qxkVar.c == null) {
                    qxkVar.c = bwp.I();
                }
                rczVar.l = new qxm(qxkVar);
                rczVar.d.b(qybVar);
                return;
            case 3:
                ((rcz) this.a).l.d();
                return;
            case 4:
                ((rcz) this.a).l.close();
                return;
            case 5:
                ?? r7 = this.a;
                rbm rbmVar = rdi.k;
                try {
                    r7.run();
                    return;
                } catch (RuntimeException e) {
                    rbc rbcVar = new rbc(rdi.k, rbd.e);
                    rbcVar.c();
                    rbcVar.a = e;
                    rbcVar.a("Exception while executing a task on frame renderer thread.", new Object[0]);
                    return;
                }
            case 6:
                rdiVar = (rdi) this.a;
                break;
            case 7:
                rdiVar = (rdi) this.a;
                if (rdiVar.h == null) {
                    return;
                } else {
                    rdiVar.a();
                }
                break;
            case 8:
                ((rdr) this.a).l(System.nanoTime());
                return;
            case 9:
                ((rdr) this.a).l(System.nanoTime());
                return;
            case 10:
                ((rek) this.a).h();
                return;
            case 11:
                rek rekVar = (rek) this.a;
                rek.m.a(rbk.b(rekVar.j, ((rdr) rekVar.h).l));
                return;
            case 12:
                Object obj = this.a;
                rek rekVar2 = (rek) obj;
                synchronized (rekVar2.b) {
                    ((rek) obj).k = false;
                    break;
                }
                rekVar2.f();
                return;
            case 13:
                rek rekVar3 = (rek) this.a;
                rek.m.a(rbk.b(rekVar3.j, ((rdr) rekVar3.h).l));
                return;
            case 14:
                Object obj2 = this.a;
                rgx rgxVar = (rgx) obj2;
                synchronized (rgxVar.c) {
                    rfsVar = ((rgx) obj2).e;
                    ((rgx) obj2).e = null;
                    break;
                }
                if (rfsVar != null) {
                    rgxVar.e(rfsVar);
                    rgxVar.d.f();
                    return;
                }
                return;
            case 15:
                rbm rbmVar2 = rgc.f;
                Optional optionalC = nrb.c(this.a);
                if (true == optionalC.isPresent()) {
                    ((rfs) optionalC.get()).release();
                    return;
                }
                return;
            case 16:
                rgc rgcVar = (rgc) this.a;
                rgcVar.c.c();
                rgcVar.b.e();
                return;
            case 17:
                rga rgaVar = (rga) this.a;
                rgaVar.f.d(rgaVar.b.a());
                return;
            case 18:
                ((Semaphore) this.a).release();
                return;
            case 19:
                SkiaTextureProcessor skiaTextureProcessor = (SkiaTextureProcessor) this.a;
                if (skiaTextureProcessor.f != 0) {
                    rbc rbcVar2 = new rbc(SkiaTextureProcessor.g, rbd.e);
                    rbcVar2.c();
                    rbcVar2.a("Calling prepare multiple times, ignoring.", new Object[0]);
                    return;
                }
                Optional optional = skiaTextureProcessor.d;
                atqx atqxVarD = optional.isPresent() ? nrc.d((qxg) optional.get()) : atqx.a;
                Optional optionalOfNullable = skiaTextureProcessor.e;
                byte[] byteArray = atqxVarD.toByteArray();
                if (true == optionalOfNullable.isPresent()) {
                    SkiaLayerLruCache skiaLayerLruCache = (SkiaLayerLruCache) optionalOfNullable.get();
                    optionalOfNullable = Optional.ofNullable(Long.valueOf(skiaLayerLruCache.b.get() ? skiaLayerLruCache.a : 0L));
                }
                skiaTextureProcessor.f = skiaTextureProcessor.nativeCreateStickersScene(byteArray, ((Long) optionalOfNullable.orElse(0L)).longValue());
                return;
            default:
                SkiaTextureProcessor skiaTextureProcessor2 = (SkiaTextureProcessor) this.a;
                long j = skiaTextureProcessor2.f;
                if (j != 0) {
                    skiaTextureProcessor2.nativeReleaseStickersScene(j);
                    skiaTextureProcessor2.f = 0L;
                    return;
                }
                return;
        }
        rdiVar.h = null;
    }
}
