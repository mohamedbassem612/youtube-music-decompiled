package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yyq implements tyy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ yyq(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.tyy
    public final Object a() {
        int i = this.$cid;
        if (i == 0) {
            zcf zcfVar = ((yyv) this.a).h.m;
            return Boolean.valueOf(zcfVar == null ? false : zcfVar.d.f);
        }
        if (i == 1) {
            return ((vor) this.a).g();
        }
        if (i == 2) {
            return ((yye) this.a).l;
        }
        if (i == 3) {
            return ((zcf) this.a).F;
        }
        Object obj = this.a;
        if (i != 4) {
            return i != 5 ? ((abyv) obj).b : ((abyv) obj).c;
        }
        return ((aciq) obj).d;
    }
}
