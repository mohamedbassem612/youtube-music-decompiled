package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jw implements ja {
    final /* synthetic */ jx a;

    public jw(jx jxVar) {
        this.a = jxVar;
    }

    @Override // defpackage.ja
    public final void a(iq iqVar, boolean z) {
        if (iqVar instanceof jj) {
            iqVar.a().i(false);
        }
        ja jaVar = this.a.e;
        if (jaVar != null) {
            jaVar.a(iqVar, z);
        }
    }

    @Override // defpackage.ja
    public final boolean b(iq iqVar) {
        jx jxVar = this.a;
        if (iqVar != jxVar.c) {
            is isVar = ((jj) iqVar).l;
            ja jaVar = jxVar.e;
            if (jaVar != null) {
                return jaVar.b(iqVar);
            }
        }
        return false;
    }
}
