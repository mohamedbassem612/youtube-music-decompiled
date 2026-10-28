package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acgk implements acgl {
    private final abnc a;

    public acgk(abvn abvnVar) {
        abvnVar.getClass();
        this.a = abvnVar.h();
    }

    private final void c(akje akjeVar) {
        ahno.F(akjeVar.b == 3);
        this.a.n((akjeVar.b == 3 ? (akcq) akjeVar.c : akcq.a).b);
    }

    @Override // defpackage.acgl
    public final void a(akje akjeVar, acfx acfxVar, long j) {
        c(akjeVar);
    }

    @Override // defpackage.acgl
    public final void b(akje akjeVar, acfx acfxVar, long j, boolean z) {
        if (z) {
            c(akjeVar);
        } else {
            this.a.n("");
        }
    }
}
