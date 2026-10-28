package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bqz extends bqy {
    final /* synthetic */ bre g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqz(bre breVar) {
        super(breVar);
        this.g = breVar;
    }

    @Override // defpackage.bqs
    public final brf a() {
        bre breVar = this.g;
        bqp bqpVar = breVar.d;
        if (bqpVar != null) {
            return bqpVar == breVar.a ? new brf(this.b.getCurrentBrowserInfo()) : bqpVar.d;
        }
        throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
    }
}
