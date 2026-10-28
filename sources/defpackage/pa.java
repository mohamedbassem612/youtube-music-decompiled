package defpackage;

import android.window.OnBackInvokedCallback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pa implements OnBackInvokedCallback {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ pa(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [aeyt, java.lang.Object] */
    public final void onBackInvoked() {
        int i = this.$cid;
        if (i == 0) {
            this.a.run();
            return;
        }
        if (i == 1) {
            ((gp) this.a).R();
            return;
        }
        if (i == 2) {
            ((djp) this.a).b();
            return;
        }
        ?? r2 = this.a;
        if (i != 3) {
            r2.B();
        } else {
            ((jmg) r2).q();
        }
    }

    public pa(jmg jmgVar, int i) {
        this.$cid = i;
        this.a = jmgVar;
    }
}
