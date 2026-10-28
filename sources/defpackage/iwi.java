package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class iwi extends jlc {
    final /* synthetic */ ajwo a;
    final /* synthetic */ xgj b;
    final /* synthetic */ iwj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwi(iwj iwjVar, avmb avmbVar, ajwo ajwoVar, xgj xgjVar) {
        super(300L, avmbVar);
        this.a = ajwoVar;
        this.b = xgjVar;
        this.c = iwjVar;
    }

    @Override // defpackage.jlc
    public final void a() {
        ajwo ajwoVar = this.a;
        if (ajwoVar != null) {
            this.c.k(ajwoVar, this.b);
        }
    }
}
