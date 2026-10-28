package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xsm implements DialogInterface.OnKeyListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ aevy a;

    public /* synthetic */ xsm(jmg jmgVar, int i) {
        this.$cid = i;
        this.a = jmgVar;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (this.$cid != 0) {
            if (i != 4 || keyEvent.getAction() != 1) {
                return false;
            }
            ((jmg) this.a).q();
        } else {
            if (keyEvent.getAction() == 0) {
                return ((xsn) this.a).t.c(i);
            }
            if (keyEvent.getAction() != 1) {
                return false;
            }
        }
        return true;
    }

    public xsm(xsn xsnVar, int i) {
        this.$cid = i;
        this.a = xsnVar;
    }
}
