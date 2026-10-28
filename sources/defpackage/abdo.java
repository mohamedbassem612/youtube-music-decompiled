package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class abdo implements abdq {
    private final abdn a;
    private final xhz b;
    private final ajwo c;

    public abdo(abdn abdnVar, xhz xhzVar, ajwo ajwoVar) {
        this.a = abdnVar;
        this.b = xhzVar;
        this.c = ajwoVar;
    }

    @Override // defpackage.abdq
    public final abdr a(ajwo ajwoVar) {
        abdn abdnVar = this.a;
        return new abdr(abdnVar.a, abdnVar.b, ajwoVar, 0);
    }

    @Override // defpackage.abdq
    public final abdy b() {
        return abdy.c;
    }

    @Override // defpackage.abdq
    public final abeb c() {
        return new abeb(this.a.a);
    }

    @Override // defpackage.abdq
    public final ajwo d() {
        return this.c;
    }

    @Override // defpackage.abdq
    public final Optional e(aayw aaywVar) {
        return Optional.of(new abdr(this.a.a, aaywVar.d, aaywVar.e, 1));
    }
}
