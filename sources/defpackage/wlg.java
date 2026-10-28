package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wlg implements tbu {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ wlg(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.tbu
    public final void a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ((wll) this.a).onSignOut((zwu) obj);
            return;
        }
        if (i == 1) {
            ((wll) this.a).onSignIn((zwt) obj);
        } else if (i == 2) {
            ((wwn) this.a).j((aazk) obj);
        } else {
            Object obj2 = this.a;
            ((aera) obj2).c.execute(afwl.i(new aead(obj2, (aeqi) obj, 19, null)));
        }
    }

    @Override // defpackage.tbu
    public final /* synthetic */ boolean b() {
        return false;
    }
}
