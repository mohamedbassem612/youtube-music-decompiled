package defpackage;

import android.content.Context;
import android.widget.PopupWindow;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aekj implements PopupWindow.OnDismissListener {
    private final Set a;

    public aekj(Context context, vxe vxeVar) {
        context.getClass();
        vxeVar.getClass();
        this.a = new HashSet();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.add(null);
    }
}
