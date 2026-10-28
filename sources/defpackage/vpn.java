package defpackage;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vpn extends ViewOutlineProvider {
    final /* synthetic */ Context a;
    final /* synthetic */ vxz b;

    public vpn(Context context, vxz vxzVar) {
        this.a = context;
        this.b = vxzVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float fQ = aecm.q(this.a, this.b);
        outline.setRoundRect(view.getLeft(), view.getTop() - ((int) fQ), view.getRight(), view.getBottom(), fQ);
    }
}
