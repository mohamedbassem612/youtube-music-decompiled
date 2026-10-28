package defpackage;

import android.content.Intent;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class svg implements sxt {
    final /* synthetic */ svh a;

    public svg(svh svhVar) {
        this.a = svhVar;
    }

    @Override // defpackage.sxt
    public final boolean d(int i, int i2, Intent intent) {
        if (i != 1901) {
            return false;
        }
        if (i2 == -1) {
            Set set = this.a.d;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((vwt) ((ssj) ((qcb) it.next()).a).a).U();
            }
            set.clear();
            return false;
        }
        if (i2 == 0) {
            Set set2 = this.a.d;
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                ((vwt) ((ssj) ((qcb) it2.next()).a).a).U();
            }
            set2.clear();
            return false;
        }
        if (i2 != 1) {
            ((agrc) ((agrc) svh.a.b()).k("com/google/android/libraries/youtube/commerce/payment/controller/AddInstrumentController$AddInstrumentAPIResultCallback", "handleActivityResult", 161, "AddInstrumentController.java")).u("Unknown add instrument result code received: %d", i2);
            return false;
        }
        Set<qcb> set3 = this.a.d;
        for (qcb qcbVar : set3) {
        }
        set3.clear();
        return false;
    }
}
