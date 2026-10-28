package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class oyj extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        oyk oykVar = (oyk) view;
        int i = oyk.E;
        if (oykVar.x > 0.0f) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), oykVar.x);
        } else {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
        }
    }
}
