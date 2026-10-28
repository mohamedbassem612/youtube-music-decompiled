package defpackage;

import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ahsw implements low {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ahsw(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.low
    public final void e(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ahtq ahtqVar = (ahtq) obj;
            if (((FirebaseMessaging) this.a).i()) {
                ahtqVar.d();
                return;
            }
            return;
        }
        if (i == 1) {
            ((kbk) this.a).j = new kjc((Bundle) obj);
            return;
        }
        kkr kkrVar = (kkr) obj;
        if (kkrVar != null) {
            Object obj2 = this.a;
            ahno.i(kkrVar.a);
            ((FirebaseMessaging) obj2).d();
        }
    }
}
