package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class abdt implements abdp {
    public final ajwo a;
    private final xhy b;

    public abdt(xhy xhyVar, ajwo ajwoVar) {
        this.b = xhyVar;
        this.a = ajwoVar;
    }

    @Override // defpackage.abdp
    public final /* bridge */ /* synthetic */ abdq a(abdi abdiVar) {
        ajwo ajwoVar = this.a;
        return new abds(this, abdiVar.o(ajwoVar) ? abdiVar.b(ajwoVar) : this.b, 2);
    }

    @Override // defpackage.abdp
    public final abdy b() {
        return abdy.b;
    }
}
