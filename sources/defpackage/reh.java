package defpackage;

import com.google.android.libraries.video.mediaengine.textures.processors.SkiaTextureProcessor;
import j$.time.Duration;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class reh extends res {
    private static final Duration i = Duration.ofMillis(300);
    public rco a;

    public reh(rco rcoVar, req reqVar) {
        super(rcoVar, reqVar, 0);
        this.a = rcoVar;
    }

    @Override // defpackage.res
    public final synchronized boolean d(qup qupVar, Duration duration) {
        this.a = (rco) qupVar;
        return super.d(qupVar, duration);
    }

    @Override // defpackage.res
    public final Duration e() {
        return i;
    }

    @Override // defpackage.res
    protected final /* synthetic */ rei f() {
        req reqVar = this.c;
        rjc rjcVarT = reqVar.t();
        Optional optionalY = reqVar.y();
        Optional optionalK = reqVar.k();
        qua quaVar = reqVar.p().a;
        SkiaTextureProcessor skiaTextureProcessor = new SkiaTextureProcessor(rjcVarT, optionalY, optionalK, reqVar);
        skiaTextureProcessor.h();
        skiaTextureProcessor.j(this.a);
        skiaTextureProcessor.i(h());
        return new reg(this, skiaTextureProcessor);
    }

    public final float h() {
        req reqVar = this.c;
        return reqVar.n().getHeight() / reqVar.o().getHeight();
    }
}
