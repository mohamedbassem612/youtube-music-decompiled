package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class fzj implements fzk {
    private final /* synthetic */ int $cid;
    private final String a;
    private final kwq b;

    public fzj(kwq kwqVar, String str, int i) {
        this.$cid = i;
        this.b = kwqVar;
        this.a = str;
    }

    @Override // defpackage.fzk
    public final kwq a(fyy fyyVar) {
        int i = this.$cid;
        if (i == 0) {
            kwq kwqVarF = this.b.F();
            kwqVarF.y(this.a, fyyVar);
            return kwqVarF;
        }
        kwq kwqVar = this.b;
        if (i != 1) {
            kwqVar.y(this.a, fyyVar);
            return kwqVar;
        }
        kwq kwqVarF2 = kwqVar.F();
        kwqVarF2.z(this.a, fyyVar);
        return kwqVarF2;
    }
}
