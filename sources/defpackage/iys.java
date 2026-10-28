package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class iys extends qr {
    final /* synthetic */ iyt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iys(iyt iytVar, boolean z) {
        super(z);
        this.a = iytVar;
    }

    @Override // defpackage.qr
    public final void b() {
        iyt iytVar = this.a;
        jjm jjmVar = iytVar.b;
        if (jjmVar != null) {
            jjmVar.w();
            g(false);
            iytVar.getOnBackPressedDispatcher().d();
        }
    }
}
