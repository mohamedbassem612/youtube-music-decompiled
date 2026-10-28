package defpackage;

import android.view.ActionMode;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class afbx implements ViewTreeObserver.OnScrollChangedListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ afbx(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int i = this.$cid;
        Object obj = this.a;
        if (i == 0) {
            ((afcd) obj).k();
            return;
        }
        oxe oxeVar = (oxe) obj;
        int i2 = oxeVar.A;
        if (i2 != 1) {
            if (oxeVar.B == 1 && i2 != 5 && i2 != 2) {
                oxeVar.c.a();
            }
            ActionMode actionMode = oxeVar.k;
            if (actionMode != null) {
                actionMode.invalidateContentRect();
            }
            oxeVar.h();
        }
    }
}
