package defpackage;

import com.google.android.libraries.video.mediaengine.textures.processors.SkiaTextureProcessor;
import j$.time.Duration;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rdv extends res implements qug {
    private static final Duration i = Duration.ofMillis(300);
    private static final rbm j = new rbm("rdv");
    public rco a;

    public rdv(qup qupVar, req reqVar) {
        super(qupVar, reqVar, 3);
        this.a = h(qupVar);
    }

    private static rco h(qup qupVar) {
        return rco.i(agke.q(qupVar), ((quu) ((quy) qupVar.b)).a);
    }

    @Override // defpackage.qug
    public final void a(quk qukVar) {
        rbc rbcVar = new rbc(j, rbd.c);
        rbcVar.c();
        rbcVar.a("AnimatedTextSegmentRenderer onError: %s", String.valueOf(qukVar.b));
        this.c.a(qukVar);
    }

    public final float b() {
        req reqVar = this.c;
        return reqVar.n().getHeight() / reqVar.o().getHeight();
    }

    @Override // defpackage.res
    public final synchronized boolean d(qup qupVar, Duration duration) {
        this.a = h(qupVar);
        return super.d(qupVar, duration);
    }

    @Override // defpackage.res
    protected final Duration e() {
        return i;
    }

    @Override // defpackage.res
    protected final /* synthetic */ rei f() {
        req reqVar = this.c;
        int iJ = reqVar.p().a.w ? 0 : j(reqVar.w());
        int i2 = rgm.c;
        rgk rgkVar = new rgk();
        rgkVar.a = this.e;
        rgkVar.b = iJ;
        rgkVar.d = reqVar.p().a;
        rhe rheVar = new rhe();
        rheVar.i(this.b.c);
        rgkVar.b(rheVar);
        try {
            rjc rjcVarD = reqVar.q().d("AnimatedTextSkiaThread");
            req reqVar2 = this.c;
            Optional optionalY = reqVar2.y();
            Optional optionalK = reqVar2.k();
            qua quaVar = reqVar2.p().a;
            SkiaTextureProcessor skiaTextureProcessor = new SkiaTextureProcessor(rjcVarD, optionalY, optionalK, this);
            skiaTextureProcessor.h();
            skiaTextureProcessor.j(this.a);
            skiaTextureProcessor.i(b());
            rgkVar.b(skiaTextureProcessor);
            reqVar2.K();
            rif rifVar = new rif(reqVar2.m(), this.b.a, reqVar2.n(), ((quy) this.b.b).j, Optional.empty(), new rih(reqVar2.p().b, this.b.d, 1), rjcVarD, reqVar2.p().a, false, this);
            rgm rgmVarA = rgkVar.a();
            qup qupVar = this.b;
            rgmVarA.l(qupVar.c, qupVar.b());
            rgmVarA.i(rifVar);
            rifVar.t(reqVar2.n());
            rifVar.s(reqVar2.q());
            rifVar.w();
            return new rdu(this, rgmVarA, rheVar, skiaTextureProcessor, rifVar);
        } catch (bvn e) {
            ahxq ahxqVar = new ahxq("Failed to create dedicated GL thread");
            ahxqVar.initCause(e);
            throw ahxqVar;
        }
    }
}
