package defpackage;

import com.google.android.libraries.video.mediaengine.textures.processors.SkiaTextureProcessor;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class rex extends rei {
    final /* synthetic */ rey a;
    private final rif b;
    private final rhe c;
    private final SkiaTextureProcessor d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rex(rey reyVar, rgp rgpVar, rhe rheVar, SkiaTextureProcessor skiaTextureProcessor, rif rifVar) {
        super(reyVar);
        this.a = reyVar;
        this.c = rheVar;
        this.d = skiaTextureProcessor;
        this.b = rifVar;
        f(rgpVar);
    }

    @Override // defpackage.rei
    public final void a(Duration duration) {
        rif rifVar = this.b;
        rifVar.r();
        rgp rgpVar = this.f;
        rgpVar.getClass();
        rgpVar.d();
        rifVar.h(duration.minus(this.a.a.c));
    }

    @Override // defpackage.rei
    protected final boolean b(rjg rjgVar) {
        boolean z;
        boolean z2 = true;
        if (rjgVar.b(rjf.b)) {
            rhe rheVar = this.c;
            rey reyVar = this.a;
            rheVar.i(reyVar.a.c);
            this.d.j(reyVar.a);
            this.b.i(reyVar.a.d);
            z = true;
        } else {
            z = false;
        }
        if (rjgVar.b(rjf.l) || rjgVar.b(rjf.i) || rjgVar.b(rjf.h) || rjgVar.b(rjf.v) || rjgVar.b(rjf.k) || rjgVar.b(rjf.n) || rjgVar.b(rjf.o) || rjgVar.b(rjf.p) || rjgVar.b(rjf.m)) {
            rif rifVar = this.b;
            rey reyVar2 = this.a;
            req reqVar = reyVar2.c;
            rifVar.u(reqVar.n());
            rifVar.t(reqVar.n());
            SkiaTextureProcessor skiaTextureProcessor = this.d;
            skiaTextureProcessor.j(reyVar2.a);
            skiaTextureProcessor.i(reyVar2.h());
        } else {
            z2 = z;
        }
        if (z2) {
            this.b.r();
            rgp rgpVar = this.f;
            rgpVar.getClass();
            rgpVar.d();
            rgp rgpVar2 = this.f;
            rgpVar2.getClass();
            qup qupVar = this.a.b;
            rgpVar2.l(qupVar.c, qupVar.b());
        }
        return z2;
    }

    @Override // defpackage.rei
    protected final ren c(Duration duration) {
        rgp rgpVar = this.f;
        rgpVar.getClass();
        return rgpVar.h(duration);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        rif rifVar = this.b;
        rifVar.r();
        rifVar.e(null);
        rgp rgpVar = this.f;
        rgpVar.getClass();
        rgpVar.close();
        rifVar.close();
    }
}
