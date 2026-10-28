package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class abdr implements abdp {
    private final /* synthetic */ int $cid;
    public final ajwo a;
    public final Object b;
    private final Object c;

    public abdr(xhy xhyVar, ajwo ajwoVar, ajwo ajwoVar2, int i) {
        this.$cid = i;
        this.c = xhyVar;
        this.a = ajwoVar;
        this.b = ajwoVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xhy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, xhy] */
    @Override // defpackage.abdp
    public final /* synthetic */ abdq a(abdi abdiVar) {
        if (this.$cid != 0) {
            abdiVar.r(this.b, (wgi) this.c, abdiVar.e);
            return new abds(this, this.a, 1);
        }
        ?? r0 = this.c;
        if (r0 != 0) {
            abdiVar.h(r0, this.a, (ajwo) this.b);
        }
        ajwo ajwoVar = (ajwo) this.b;
        abdiVar.l(abdiVar.p(ajwoVar));
        return new abds((Object) r0, ajwoVar, 0);
    }

    @Override // defpackage.abdp
    public final abdy b() {
        return this.$cid != 0 ? abdy.d : abdy.a;
    }

    public abdr(xhy xhyVar, wgi wgiVar, ajwo ajwoVar, int i) {
        this.$cid = i;
        this.b = xhyVar;
        this.c = wgiVar;
        this.a = ajwoVar;
    }
}
