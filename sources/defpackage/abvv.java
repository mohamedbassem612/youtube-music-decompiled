package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abvv implements abmj {
    private final /* synthetic */ int $cid;
    final /* synthetic */ abug a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    public abvv(Object obj, abug abugVar, Object obj2, int i) {
        this.$cid = i;
        this.a = abugVar;
        this.b = obj2;
        this.c = obj;
    }

    @Override // defpackage.abmj
    public final abnl a(abnl abnlVar) {
        int i = this.$cid;
        if (i == 0) {
            return this.a.i.a(abnlVar);
        }
        if (i == 1) {
            return this.a.i.a(abnlVar);
        }
        abue abueVar = this.a.i;
        return i != 2 ? abueVar.a(abnlVar) : abueVar.a(abnlVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [abvz, java.lang.Object] */
    @Override // defpackage.abmj
    public final void b(abnl abnlVar) {
        int i = this.$cid;
        if (i == 0) {
            ((abvx) this.c).d((abvw) this.b, abnlVar);
            return;
        }
        if (i == 1) {
            ((abvx) this.c).d((abvw) this.b, abnlVar);
            return;
        }
        ?? r1 = this.b;
        if (i != 2) {
            ((abwf) this.c).l(this.a.e, r1, abnlVar);
        } else {
            abug abugVar = this.a;
            Object obj = this.c;
            ((abwf) obj).l(abugVar.e, r1, r1.a());
        }
    }
}
