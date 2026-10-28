package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class abmp implements abqb {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public abmp(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [axsp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [axsp, java.lang.Object] */
    @Override // defpackage.abqb
    public final void e() {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            ((abmo) obj).g.i.kk(aays.a);
        } else {
            ((abmq) obj).d.i.kk(aays.a);
        }
    }

    @Override // defpackage.abqb
    public final void f(aboe aboeVar) {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            abmo abmoVar = (abmo) obj;
            if (abmoVar.c.g) {
                abmoVar.h.e(aboeVar);
                return;
            }
            return;
        }
        abmq abmqVar = (abmq) obj;
        if (abmqVar.a.g) {
            abmqVar.e.e(aboeVar);
        }
    }

    @Override // defpackage.abqb
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.abqb
    public final /* synthetic */ void a(int i) {
    }

    @Override // defpackage.abqb
    public final /* synthetic */ void b(aboe aboeVar) {
    }

    @Override // defpackage.abqb
    public final /* synthetic */ void d(wjf wjfVar) {
    }

    @Override // defpackage.abqb
    public final /* synthetic */ void g(wgi wgiVar, String str) {
    }
}
