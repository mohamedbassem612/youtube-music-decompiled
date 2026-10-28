package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class laf extends laq {
    final /* synthetic */ Runnable a;
    final /* synthetic */ lay b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public laf(lay layVar, Runnable runnable) {
        super(layVar, true);
        this.a = runnable;
        this.b = layVar;
    }

    @Override // defpackage.laq
    public final void a() {
        kzj kzjVar = this.b.e;
        kro.l(kzjVar);
        kzjVar.retrieveAndUploadBatches(new kzo(this.a));
    }
}
