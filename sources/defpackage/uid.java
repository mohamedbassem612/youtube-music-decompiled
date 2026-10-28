package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class uid extends qr {
    final /* synthetic */ aevw a;
    final /* synthetic */ uii d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uid(uii uiiVar, aevw aevwVar) {
        super(true);
        this.a = aevwVar;
        this.d = uiiVar;
    }

    @Override // defpackage.qr
    public final void b() {
        uii uiiVar = this.d;
        uih uihVar = uiiVar.r;
        if ((uihVar == null || !uihVar.k()) && uiiVar.w) {
            this.a.cancel();
        }
    }
}
