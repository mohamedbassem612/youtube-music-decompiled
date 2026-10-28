package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jbs extends admu {
    @Override // defpackage.admu, defpackage.adkz
    public final long c(int i) {
        ajsy ajsyVar = (ajsy) this.e.get(i);
        return (ajsyVar.b & SemanticState.Multiline) != 0 ? ajsyVar.n.hashCode() : ajsyVar.hashCode();
    }

    @Override // defpackage.admu, defpackage.adkz
    public final /* bridge */ /* synthetic */ void h(adky adkyVar) {
        super.hK(adkyVar);
    }
}
