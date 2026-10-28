package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class gwf implements jkv {
    private final /* synthetic */ int $cid;
    final /* synthetic */ gwg a;

    public gwf(gwg gwgVar, int i) {
        this.$cid = i;
        this.a = gwgVar;
    }

    @Override // defpackage.jkv
    public final void a(String str, int i) {
        if (this.$cid != 0) {
            this.a.a.c(new gsi(jkx.b(), gsh.c));
        } else {
            this.a.a.c(new gsi(jkx.a(), gsh.c));
        }
    }

    @Override // defpackage.jkv
    public final void b(String str, int i) {
        if (this.$cid != 0) {
            this.a.a.c(new gsi(jkx.b(), gsh.b));
        } else {
            this.a.a.c(new gsi(jkx.a(), gsh.b));
        }
    }
}
