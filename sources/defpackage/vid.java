package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vid implements vii {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ vid(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.vii
    public final void a(aihf aihfVar) {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            vgw vgwVar = (vgw) obj;
            vgwVar.d.j();
            vgwVar.g.e(aihfVar);
        } else {
            vie vieVar = (vie) obj;
            vieVar.e.j();
            vieVar.g.e(aihfVar);
        }
    }
}
