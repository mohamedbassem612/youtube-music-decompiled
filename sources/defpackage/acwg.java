package defpackage;

import android.app.Dialog;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acwg implements acwn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ acwg(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.acwn
    public final void a() {
        int i = this.$cid;
        if (i == 0) {
            acwh acwhVar = (acwh) this.a;
            if (acwhVar.c != null) {
                acwhVar.b(6);
                return;
            }
            return;
        }
        Object obj = this.a;
        if (i == 1) {
            ((Dialog) obj).dismiss();
        } else if (((fv) obj).isShowing()) {
            ((gr) obj).dismiss();
        }
    }
}
