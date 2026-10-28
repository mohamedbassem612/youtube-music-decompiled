package defpackage;

import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kb implements io {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public kb(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.io
    public final void O(iq iqVar) {
        int i = this.$cid;
        if (i == 0) {
            io ioVar = ((ActionMenuView) this.a).d;
            if (ioVar != null) {
                ioVar.O(iqVar);
                return;
            }
            return;
        }
        Object obj = this.a;
        if (i != 1) {
            Toolbar toolbar = (Toolbar) obj;
            if (!toolbar.a.m()) {
                toolbar.u.c(iqVar);
            }
            io ioVar2 = toolbar.A;
            if (ioVar2 != null) {
                ioVar2.O(iqVar);
                return;
            }
            return;
        }
        gx gxVar = (gx) obj;
        if (gxVar.c.p()) {
            gxVar.a.onPanelClosed(108, iqVar);
            return;
        }
        Window.Callback callback = gxVar.a;
        if (callback.onPreparePanel(0, null, iqVar)) {
            callback.onMenuOpened(108, iqVar);
        }
    }

    @Override // defpackage.io
    public final boolean S(iq iqVar, MenuItem menuItem) {
        hhb hhbVar;
        pd pdVar;
        if (this.$cid != 0 || (hhbVar = ((ActionMenuView) this.a).e) == null) {
            return false;
        }
        Toolbar toolbar = (Toolbar) hhbVar.a;
        return toolbar.u.e(menuItem) || ((pdVar = toolbar.w) != null && pdVar.a(menuItem));
    }
}
