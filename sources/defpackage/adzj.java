package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adzj extends aevq {
    public final View a;
    public boolean b = true;
    public int c;

    public adzj(View view) {
        this.a = view;
    }

    @Override // defpackage.aevq
    public final void a(View view, float f) {
        if (this.b) {
            float fMin = Math.min(f, 1.0f);
            View view2 = this.a;
            int i = this.c;
            tym.h(view2, new tyi(i - ((int) (i * Math.max(fMin, 0.0f))), 1), ViewGroup.MarginLayoutParams.class);
        }
    }

    public final void c() {
        this.c = 0;
        tym.h(this.a, new tyi(0, 1), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.aevq
    public final void b(View view, int i) {
    }
}
