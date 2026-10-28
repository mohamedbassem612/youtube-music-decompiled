package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acue implements abtj {
    private final /* synthetic */ int $cid;
    public final Object a;
    public final Object b;

    public acue(acue acueVar, hno hnoVar, int i) {
        this.$cid = i;
        acueVar.getClass();
        hnoVar.getClass();
        this.a = acueVar;
        this.b = hnoVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [abyj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [abyj, java.lang.Object] */
    @Override // defpackage.abtj
    public final abyj a() {
        int i = this.$cid;
        ?? r1 = this.a;
        return i == 0 ? ((acue) r1).a : r1;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [acew, java.lang.Object] */
    @Override // defpackage.abtj
    public final acew b() {
        if (this.$cid == 0) {
            this = (acue) this.a;
        }
        return this.b;
    }

    @Override // defpackage.abtj
    public final boolean d() {
        return (this.$cid == 0 && ((vxz) ((hno) this.b).g).l(501, 45840961L, false)) ? false : true;
    }

    public acue(acew acewVar, abyi abyiVar, int i) {
        this.$cid = i;
        this.b = acewVar;
        this.a = abyiVar;
    }
}
