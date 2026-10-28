package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class xmp extends qr {
    final /* synthetic */ xmq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xmp(xmq xmqVar) {
        super(true);
        this.a = xmqVar;
    }

    @Override // defpackage.qr
    public final void b() {
        xmq xmqVar = this.a;
        if (xmqVar.f(xmqVar.a)) {
            return;
        }
        xmqVar.finish();
    }
}
