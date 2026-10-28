package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.rendering.ui.spec.motion.TouchFeedbackDrawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aedg {
    public int a;
    public Drawable b;
    private final Context c;
    private int d;

    private aedg(Context context) {
        this.c = context;
    }

    public static aedg a(Context context) {
        aedg aedgVar = new aedg(context);
        aedgVar.a = tzk.o(context.getResources(), context.getTheme(), R.attr.ytTouchResponse).orElse(0);
        aedgVar.c(0);
        return aedgVar;
    }

    public final TouchFeedbackDrawable b() {
        int i = this.a;
        DisplayMetrics displayMetrics = this.c.getResources().getDisplayMetrics();
        agrf agrfVar = twm.a;
        displayMetrics.getClass();
        return new TouchFeedbackDrawable(i, (int) (((double) displayMetrics.density) + 0.5d), this.d, this.b, null);
    }

    public final void c(int i) {
        if (i != -1 && i != -2) {
            DisplayMetrics displayMetrics = this.c.getResources().getDisplayMetrics();
            agrf agrfVar = twm.a;
            displayMetrics.getClass();
            i = (int) (((double) (i * displayMetrics.density)) + 0.5d);
        }
        this.d = i;
    }
}
