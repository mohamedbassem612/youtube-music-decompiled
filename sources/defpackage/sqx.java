package defpackage;

import android.content.DialogInterface;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sqx implements DialogInterface.OnDismissListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ sqx(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, xgn] */
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.$cid;
        if (i == 0) {
            ((srd) this.a).g();
            return;
        }
        if (i == 1) {
            this.a.t();
            return;
        }
        if (i == 2) {
            ((srd) this.a).g();
            return;
        }
        Object obj = this.a;
        if (i == 3) {
            ((srd) obj).g();
            return;
        }
        adof adofVar = (adof) ((ahhp) ((adyc) obj).b).a;
        adofVar.f = false;
        Iterator it = adofVar.d.iterator();
        while (it.hasNext()) {
            ((adoe) it.next()).a();
        }
        adofVar.e.kk(Boolean.FALSE);
    }
}
