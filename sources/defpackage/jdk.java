package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jdk implements jaj {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public jdk(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.jaj
    public final void b() {
        int i = this.$cid;
        if (i == 0) {
            ((jdm) this.a).c.jW();
            return;
        }
        Object obj = this.a;
        if (i != 1) {
            ((jdt) obj).b.jW();
        } else {
            ((jcw) obj).a.jW();
        }
    }

    @Override // defpackage.jaj
    public final void a() {
    }
}
