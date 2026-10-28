package defpackage;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vpl extends ViewOutlineProvider {
    final /* synthetic */ Context a;
    final /* synthetic */ vxz b;

    public vpl(Context context, vxz vxzVar) {
        this.a = context;
        this.b = vxzVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float fQ = aecm.q(this.a, this.b);
        int i = (int) fQ;
        outline.setRoundRect(view.getLeft(), view.getTop() - i, view.getRight() + i, view.getBottom(), fQ);
    }
}
