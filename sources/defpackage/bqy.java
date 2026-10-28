package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
class bqy extends bqv {
    final /* synthetic */ bre f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqy(bre breVar) {
        super(breVar);
        this.f = breVar;
    }

    @Override // defpackage.bqs
    public final void b() {
        this.b = new bqx(this, this.f);
        this.b.onCreate();
    }
}
