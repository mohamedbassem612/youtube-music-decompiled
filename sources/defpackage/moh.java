package defpackage;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class moh {
    public static final Rect a = new Rect(0, 0, 0, 0);
    public int b;
    public int c;
    final Rect d;
    public int e;

    private moh(int i, int i2, Rect rect, int i3) {
        this.b = -1;
        this.c = -1;
        if (!FlowLayoutManager.s) {
            new Rect(0, 0, 0, 0);
        }
        this.b = i;
        this.c = i2;
        this.d = rect;
        this.e = i3;
    }

    static moh d(mop mopVar, int i, int i2, int i3, DisplayMetrics displayMetrics) {
        Rect rect;
        if (mopVar != null) {
            Rect rect2 = FlowLayoutManager.r ? mov.a : new Rect(0, 0, 0, 0);
            if (rect2 != null) {
                rect = (FlowLayoutManager.s && rect2.left == 0 && rect2.top == 0 && rect2.right == 0 && rect2.bottom == 0) ? a : new Rect(qnl.bu(rect2.left, displayMetrics), qnl.bu(rect2.top, displayMetrics), qnl.bu(rect2.right, displayMetrics), qnl.bu(rect2.bottom, displayMetrics));
            } else {
                rect = FlowLayoutManager.s ? a : new Rect(0, 0, 0, 0);
            }
        } else {
            rect = null;
        }
        if (rect == null) {
            rect = FlowLayoutManager.s ? a : new Rect(0, 0, 0, 0);
        }
        return new moh(i, i2, rect, i3);
    }

    public final int a(boolean z, int i) {
        Rect rect = this.d;
        if (rect == null) {
            return 0;
        }
        if (i == 1) {
            return z ? rect.right : rect.left;
        }
        return rect.top;
    }

    final int b(int i) {
        Rect rect = this.d;
        if (rect == null) {
            return 0;
        }
        return i == 1 ? rect.bottom : rect.right;
    }

    public final int c(int i) {
        int i2;
        int i3;
        Rect rect = this.d;
        if (rect == null) {
            return 0;
        }
        if (i == 1) {
            i2 = rect.left;
            i3 = rect.right;
        } else {
            i2 = rect.top;
            i3 = rect.bottom;
        }
        return i3 + i2;
    }

    public moh() {
        this.b = -1;
        this.c = -1;
        this.d = FlowLayoutManager.s ? a : new Rect(0, 0, 0, 0);
        this.e = -1;
    }
}
