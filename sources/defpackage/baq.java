package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.google.android.apps.youtube.music.R;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class baq extends bat {
    public static final Interpolator a = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final Interpolator b = new bnm();
    public static final Interpolator c = new DecelerateInterpolator(1.5f);
    public static final Interpolator d = new AccelerateInterpolator(1.5f);

    static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) == null ? view.onApplyWindowInsets(windowInsets) : windowInsets;
    }

    static bam b(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof bap) {
            return ((bap) tag).a;
        }
        return null;
    }

    static void c(View view, bbn bbnVar, List list) {
        bam bamVarB = b(view);
        if (bamVarB != null) {
            bamVarB.a(bbnVar, list);
            if (bamVarB.c == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                c(viewGroup.getChildAt(i), bbnVar, list);
            }
        }
    }

    static void d(View view, ci ciVar) {
        bam bamVarB = b(view);
        if (bamVarB != null) {
            bamVarB.c(ciVar);
            if (bamVarB.c == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                d(viewGroup.getChildAt(i), ciVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    static void e(View view, ci ciVar, bbn bbnVar, boolean z) {
        bam bamVarB = b(view);
        ?? r8 = z;
        if (bamVarB != null) {
            bamVarB.b = bbnVar;
            if (!z) {
                r8 = z;
                bamVarB.d(ciVar);
                r8 = bamVarB.c ^ 1;
            }
        }
        r8 = z;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), ciVar, bbnVar, 1 == r8);
            }
        }
    }

    public static void f(View view, ci ciVar, bal balVar) {
        bam bamVarB = b(view);
        if (bamVarB != null) {
            bamVarB.b(ciVar, balVar);
            if (bamVarB.c == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), ciVar, balVar);
            }
        }
    }
}
