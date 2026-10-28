package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jqk implements duv {
    @Override // defpackage.duv
    public final void a(View view, float f) {
        if (f < -1.0f) {
            view.setAlpha(0.0f);
            return;
        }
        if (f <= 0.0f) {
            view.setAlpha(1.0f - (Math.min(-f, 0.75f) / 0.75f));
        } else if (f <= 1.0f) {
            view.setAlpha(1.0f - (Math.min(f, 0.75f) / 0.75f));
        } else {
            view.setAlpha(0.0f);
        }
    }
}
