package defpackage;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vpm extends ViewOutlineProvider {
    final /* synthetic */ Context a;
    final /* synthetic */ vxz b;

    public vpm(Context context, vxz vxzVar) {
        this.a = context;
        this.b = vxzVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float fQ = aecm.q(this.a, this.b);
        int i = (int) fQ;
        outline.setRoundRect(view.getLeft() - i, view.getTop() - i, view.getRight(), view.getBottom(), fQ);
    }
}
