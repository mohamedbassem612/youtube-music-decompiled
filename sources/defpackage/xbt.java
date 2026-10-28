package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xbt implements xcq {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ xbt(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.xcq
    public final void a() {
        wwk wwkVar;
        int i = this.$cid;
        Object obj = this.a;
        if (i == 0) {
            ((xbw) obj).b(true, true, false);
            return;
        }
        wvx wvxVar = (wvx) obj;
        String str = wvxVar.h;
        if (str == null || (wwkVar = wvxVar.j) == null) {
            return;
        }
        wwkVar.c(str);
    }
}
