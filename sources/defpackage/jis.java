package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jis extends afcu {
    final /* synthetic */ jit a;
    final /* synthetic */ int b;
    final /* synthetic */ jin c;
    final /* synthetic */ vxz d;
    final /* synthetic */ qcb e;

    public jis(jit jitVar, int i, qcb qcbVar, jin jinVar, vxz vxzVar) {
        this.b = i;
        this.e = qcbVar;
        this.c = jinVar;
        this.d = vxzVar;
        this.a = jitVar;
    }

    @Override // defpackage.afcu
    /* JADX INFO: renamed from: a */
    public final void b(afcv afcvVar, int i) {
        this.a.i(this.b, this.e, this.c, this.d);
    }

    @Override // defpackage.afcu, defpackage.aewo
    public final /* bridge */ /* synthetic */ void b(Object obj, int i) {
        b((afcv) obj, i);
    }
}
