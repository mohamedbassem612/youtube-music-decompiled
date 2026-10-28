package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class abds implements abdq {
    private final /* synthetic */ int $cid;
    private final Object a;
    private final Object b;

    public abds(abdt abdtVar, xhy xhyVar, int i) {
        this.$cid = i;
        this.a = abdtVar;
        this.b = xhyVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xhy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, xhy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, xhy] */
    @Override // defpackage.abdq
    public final abdr a(ajwo ajwoVar) {
        int i = this.$cid;
        if (i == 0) {
            return new abdr((xhy) this.b, (ajwo) this.a, ajwoVar, 0);
        }
        if (i != 1) {
            return new abdr((xhy) this.b, ((abdt) this.a).a, ajwoVar, 0);
        }
        abdr abdrVar = (abdr) this.b;
        return new abdr((xhy) abdrVar.b, abdrVar.a, ajwoVar, 0);
    }

    @Override // defpackage.abdq
    public final abdy b() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? abdy.b : abdy.d;
        }
        return abdy.a;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, xhy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, xhy] */
    @Override // defpackage.abdq
    public final abeb c() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? new abeb(this.b) : new abeb(((abdr) this.b).b);
        }
        return abeb.a;
    }

    @Override // defpackage.abdq
    public final ajwo d() {
        int i = this.$cid;
        Object obj = this.a;
        return (i == 0 || i == 1) ? (ajwo) obj : ((abdt) obj).a;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, xhy] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, xhy] */
    @Override // defpackage.abdq
    public final Optional e(aayw aaywVar) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? Optional.of(new abdn(this.b, aaywVar.c, aaywVar.e, aaywVar.f)) : Optional.empty();
        }
        return Optional.of(new abdt(this.b, aaywVar.e));
    }

    public abds(Object obj, ajwo ajwoVar, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = ajwoVar;
    }
}
