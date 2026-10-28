package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class adtw implements advm {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ adtw(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.advm
    public final void a() {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            ((gnf) obj).B(true);
            return;
        }
        adty adtyVar = (adty) obj;
        acjx acjxVar = adtyVar.h;
        if (acjxVar != null) {
            ((adtv) obj).iM(acjxVar);
            adtyVar.h = null;
        }
    }
}
