package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jje extends qr {
    final /* synthetic */ jjf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jje(jjf jjfVar) {
        super(false);
        this.a = jjfVar;
    }

    @Override // defpackage.qr
    public final void b() {
        jjf jjfVar = this.a;
        hek hekVar = jjfVar.a;
        if (hekVar instanceof jjt) {
            jjt jjtVar = (jjt) hekVar;
            if (jjtVar.b.isPresent()) {
                jjfVar.g.a((ajwo) jjtVar.b.get());
            }
        }
        g(false);
        jjfVar.requireActivity().getOnBackPressedDispatcher().d();
    }
}
