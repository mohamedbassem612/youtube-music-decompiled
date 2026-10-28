package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class juo implements csu {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ cav a;

    public /* synthetic */ juo(cav cavVar, int i) {
        this.$cid = i;
        this.a = cavVar;
    }

    @Override // defpackage.csu
    public final void a(float f) {
        int i = this.$cid;
        cav cavVar = this.a;
        if (i != 0) {
            ((ctb) cavVar).k.l(f);
            ((cls) cavVar).aK();
        } else {
            juv juvVar = (juv) cavVar;
            juvVar.O.l(f);
            juvVar.aP();
        }
    }
}
