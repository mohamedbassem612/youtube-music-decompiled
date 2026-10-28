package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adzl extends ViewOutlineProvider {
    final /* synthetic */ int a;

    public adzl(int i) {
        this.a = i;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        view.getClass();
        outline.getClass();
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.a);
    }
}
