package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.EdgeEffect;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bcy {
    public static float a(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static float b(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static EdgeEffect c(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static final ViewParent d(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static boolean e(cvj cvjVar, boolean z) {
        int i;
        bwb bwbVar = new bwb(16);
        boolean z2 = true;
        while (true) {
            bwbVar.L(8);
            if (!cvjVar.n(bwbVar.b, 0, 8, true)) {
                break;
            }
            long jW = bwbVar.w();
            int i2 = bwbVar.i();
            if (jW != 1) {
                i = 8;
            } else {
                if (!cvjVar.n(bwbVar.b, 8, 8, true)) {
                    break;
                }
                bwbVar.O(16);
                jW = bwbVar.x();
                i = 16;
            }
            long j = i;
            if (jW < j) {
                break;
            }
            int i3 = (int) (jW - j);
            if (z2) {
                if (i2 == 1718909296 && i3 >= 8) {
                    bwbVar.L(4);
                    cvb cvbVar = (cvb) cvjVar;
                    cvbVar.n(bwbVar.b, 0, 4, false);
                    if (bwbVar.i() != 1751476579) {
                        break;
                    }
                    if (!z) {
                        return true;
                    }
                    cvbVar.m(i3 - 4, false);
                } else {
                    break;
                }
            } else {
                if (i2 == 1836086884) {
                    return true;
                }
                if (i3 != 0) {
                    ((cvb) cvjVar).m(i3, false);
                }
            }
            z2 = false;
        }
        return false;
    }
}
