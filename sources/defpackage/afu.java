package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class afu extends afz {
    final /* synthetic */ afv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afu(afv afvVar) {
        super(afvVar.d);
        this.a = afvVar;
    }

    @Override // defpackage.afz
    protected final Object a(int i) {
        return this.a.g(i);
    }

    @Override // defpackage.afz
    protected final void b(int i) {
        this.a.e(i);
    }
}
