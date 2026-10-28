package defpackage;

import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aeeh extends od {
    public int a;

    @Override // defpackage.od
    protected final float a(DisplayMetrics displayMetrics) {
        return 250.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.od
    public final int i(View view, int i) {
        return super.i(view, i) + this.a;
    }

    @Override // defpackage.od
    protected final int l() {
        return -1;
    }
}
