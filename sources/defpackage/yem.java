package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yem implements agfr {
    final /* synthetic */ vyo a;
    final /* synthetic */ yfu b;

    public yem(vyo vyoVar, yfu yfuVar) {
        this.a = vyoVar;
        this.b = yfuVar;
    }

    @Override // defpackage.agfr
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized jsk io() {
        anew anewVar = this.a.b().j;
        if (anewVar == null) {
            anewVar = anew.a;
        }
        akwk akwkVar = anewVar.b;
        if (akwkVar == null) {
            akwkVar = akwk.a;
        }
        if (akwkVar.c) {
            return null;
        }
        return this.b.io();
    }
}
