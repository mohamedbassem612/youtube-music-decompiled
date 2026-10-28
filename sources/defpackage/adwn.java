package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.google.android.libraries.youtube.rendering.ui.ScrollToTopLinearLayoutManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class adwn extends od {
    final /* synthetic */ ScrollToTopLinearLayoutManager a;
    private final boolean n;
    private final int o;
    private float p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adwn(ScrollToTopLinearLayoutManager scrollToTopLinearLayoutManager, Context context, boolean z, int i) {
        super(context);
        this.a = scrollToTopLinearLayoutManager;
        this.n = z;
        this.o = (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    @Override // defpackage.od
    protected final float a(DisplayMetrics displayMetrics) {
        int i;
        if (this.p == 0.0f && (i = this.a.a) != 0) {
            this.p = 300.0f / Math.abs(i);
        }
        float fA = super.a(displayMetrics);
        float f = this.p;
        if (f != 0.0f) {
            return (this.n || f <= fA) ? f : fA;
        }
        return fA;
    }

    @Override // defpackage.od
    public final PointF e(int i) {
        return this.a.computeScrollVectorForPosition(i);
    }

    @Override // defpackage.od
    public final int i(View view, int i) {
        return super.i(view, i) - this.o;
    }

    @Override // defpackage.od
    protected final int l() {
        return -1;
    }
}
