package defpackage;

import android.animation.ArgbEvaluator;
import android.app.Activity;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iwe {
    public int a;
    public boolean b;
    private final Activity c;
    private final ArgbEvaluator d = new ArgbEvaluator();
    private int e;
    private boolean f;
    private float g;

    public iwe(Activity activity) {
        activity.getClass();
        this.c = activity;
        this.e = activity.getColor(R.color.header_color);
        this.a = activity.getColor(R.color.quantum_black_100);
        this.f = true;
        d();
    }

    public final void a(int i) {
        this.e = i;
        d();
    }

    public final void b(boolean z) {
        this.f = z;
        if (z) {
            d();
        }
    }

    public final void c(float f) {
        this.g = Math.max(0.0f, Math.min(1.0f, f));
        d();
    }

    public final void d() {
        int iIntValue;
        if (this.f) {
            float f = this.g;
            if (f > 0.0f) {
                iIntValue = this.c.getColor(R.color.music_full_transparent);
            } else if (this.b) {
                iIntValue = this.a;
            } else {
                iIntValue = ((Integer) this.d.evaluate(f, Integer.valueOf(this.e), Integer.valueOf(this.a))).intValue();
            }
            this.c.getWindow().setStatusBarColor(iIntValue);
        }
    }
}
