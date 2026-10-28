package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class oym extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        oyn oynVar = (oyn) view;
        ViewOutlineProvider viewOutlineProvider = oyn.b;
        if (oynVar.c > 0.0f) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), oynVar.c);
        } else {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
        }
    }
}
