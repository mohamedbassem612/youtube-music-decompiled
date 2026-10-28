package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acgi implements acgl {
    private final abvn a;
    private final vxz b;

    public acgi(abvn abvnVar, vxz vxzVar) {
        this.a = abvnVar;
        this.b = vxzVar;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [abwy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [abwy, java.lang.Object] */
    @Override // defpackage.acgl
    public final void a(akje akjeVar, acfx acfxVar, long j) {
        ahno.F(akjeVar.b == 4);
        if (this.b.l(214, 45696146L, false) && acfxVar.o(j)) {
            abvn abvnVar = this.a;
            float f = ((abxg) abvnVar.aA().c.a()).c.b;
            abvnVar.aA().c.f(new abxj(f, Float.valueOf((((akjeVar.b == 4 ? (ajif) akjeVar.c : ajif.a).b - 1.0f) / f) + 1.0f)));
        }
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [abwy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [abwy, java.lang.Object] */
    @Override // defpackage.acgl
    public final void b(akje akjeVar, acfx acfxVar, long j, boolean z) {
        ahno.F(akjeVar.b == 4);
        if (this.b.l(214, 45696146L, false) && !acfxVar.o(j) && z) {
            abvn abvnVar = this.a;
            abvnVar.aA().c.f(new abxj(((abxg) abvnVar.aA().c.a()).c.b, Float.valueOf((akjeVar.b == 4 ? (ajif) akjeVar.c : ajif.a).b)));
        }
    }
}
