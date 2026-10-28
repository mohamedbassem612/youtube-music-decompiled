package defpackage;

import com.google.android.libraries.video.mediaengine.textures.processors.SkiaTextureProcessor;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class rdu extends rei {
    final /* synthetic */ rdv a;
    private final rif b;
    private final rhe c;
    private final SkiaTextureProcessor d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdu(rdv rdvVar, rgp rgpVar, rhe rheVar, SkiaTextureProcessor skiaTextureProcessor, rif rifVar) {
        super(rdvVar);
        this.a = rdvVar;
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
        rifVar.h(duration.minus(this.a.b.c));
    }

    @Override // defpackage.rei
    protected final boolean b(rjg rjgVar) {
        boolean z;
        boolean z2 = true;
        if (rjgVar.b(rjf.b)) {
            rhe rheVar = this.c;
            rdv rdvVar = this.a;
            rheVar.i(rdvVar.b.c);
            this.d.j(rdvVar.a);
            this.b.i(rdvVar.b.d);
            z = true;
        } else {
            z = false;
        }
        if (rjgVar.b(rjf.l) || rjgVar.b(rjf.i) || rjgVar.b(rjf.h) || rjgVar.b(rjf.v) || rjgVar.b(rjf.k) || rjgVar.b(rjf.n)) {
            rif rifVar = this.b;
            rdv rdvVar2 = this.a;
            req reqVar = rdvVar2.c;
            rifVar.u(reqVar.n());
            rifVar.t(reqVar.n());
            SkiaTextureProcessor skiaTextureProcessor = this.d;
            skiaTextureProcessor.j(rdvVar2.a);
            skiaTextureProcessor.i(rdvVar2.b());
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
        ren renVarH = rgpVar.h(duration);
        if (renVarH.b()) {
            rfs rfsVarA = renVarH.a();
            agke agkeVarI = rfsVarA.i();
            if (!agkeVarI.isEmpty()) {
                rfsVarA.x(((rfp) agkeVarI.get(0)).b);
            }
            rdv rdvVar = this.a;
            duration.minus(rdvVar.b.c);
            rfsVarA.t(nrc.i((quy) rdvVar.b.b));
        }
        return renVarH;
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
