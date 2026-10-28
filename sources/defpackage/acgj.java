package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acgj implements acgl {
    public hwz a;

    /* JADX WARN: Type inference failed for: r4v2, types: [awqg, java.lang.Object] */
    private final void c(akje akjeVar) {
        hwz hwzVar;
        int i = akjeVar.b;
        if (i != 1 || (hwzVar = this.a) == null) {
            return;
        }
        akjeVar.getClass();
        if (i == 1) {
            Optional optionalB = ((heg) hwzVar.a).b();
            hun hunVar = new hun(new hol(akjeVar, 5), 4);
            if (true == optionalB.isPresent()) {
                hunVar.a.invoke(optionalB.get());
            }
        }
    }

    @Override // defpackage.acgl
    public final void a(akje akjeVar, acfx acfxVar, long j) {
        if (acfxVar.o(j)) {
            c(akjeVar);
        }
    }

    @Override // defpackage.acgl
    public final void b(akje akjeVar, acfx acfxVar, long j, boolean z) {
        if (!z || acfxVar.o(j)) {
            return;
        }
        c(akjeVar);
    }
}
