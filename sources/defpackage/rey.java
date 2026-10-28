package defpackage;

import com.google.android.libraries.video.mediaengine.textures.processors.SkiaTextureProcessor;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rey extends res implements qug {
    private static final Duration i = Duration.ofMillis(300);
    public rco a;

    public rey(rco rcoVar, req reqVar) {
        super(rcoVar, reqVar, 3);
        this.a = rcoVar;
    }

    @Override // defpackage.qug
    public final void a(quk qukVar) {
        if (qukVar.d instanceof quh) {
            Iterable$EL.forEach(this.a.f, new rew(this, qukVar, 0));
        } else {
            this.c.a(qukVar);
        }
    }

    @Override // defpackage.res
    public final synchronized boolean d(qup qupVar, Duration duration) {
        this.a = (rco) qupVar;
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
        rheVar.i(this.a.c);
        rgkVar.b(rheVar);
        try {
            rjc rjcVarD = reqVar.q().d("EngineSkiaLayerThread");
            req reqVar2 = this.c;
            Optional optionalY = reqVar2.y();
            Optional optionalK = reqVar2.k();
            qua quaVar = reqVar2.p().a;
            SkiaTextureProcessor skiaTextureProcessor = new SkiaTextureProcessor(rjcVarD, optionalY, optionalK, reqVar2);
            skiaTextureProcessor.h();
            skiaTextureProcessor.j(this.a);
            skiaTextureProcessor.i(h());
            rgkVar.b(skiaTextureProcessor);
            reqVar2.K();
            rif rifVar = new rif(reqVar2.m(), this.a.a, reqVar2.n(), ((rcm) this.b.b).j, Optional.empty(), new rih(reqVar2.p().b, this.a.d, 1), rjcVarD, reqVar2.p().a, false, this);
            rgm rgmVarA = rgkVar.a();
            qup qupVar = this.b;
            rgmVarA.l(qupVar.c, qupVar.b());
            rgmVarA.i(rifVar);
            rifVar.t(reqVar2.n());
            rifVar.s(reqVar2.q());
            rifVar.w();
            return new rex(this, rgmVarA, rheVar, skiaTextureProcessor, rifVar);
        } catch (bvn e) {
            ahxq ahxqVar = new ahxq("Failed to create a dedicated GL thread");
            ahxqVar.initCause(e);
            throw ahxqVar;
        }
    }

    public final float h() {
        req reqVar = this.c;
        return reqVar.n().getHeight() / reqVar.o().getHeight();
    }
}
