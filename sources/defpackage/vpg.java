package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vpg {
    private static final Paint a;
    private View b;
    private ViewGroup c;
    private Integer d;

    static {
        Paint paint = new Paint(1);
        a = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    private final int d(Context context) {
        Integer num = this.d;
        return num != null ? num.intValue() : tzk.n(context, R.attr.ytBrandBackgroundSolid).orElse(-16777216);
    }

    private final void e(View view, Context context) {
        if (i(context)) {
            j(view, -16777216);
        } else {
            j(view, d(context));
        }
    }

    private static void f(View view) {
        if (view.getLayerType() != 0) {
            view.setLayerType(0, null);
        }
    }

    private static void g(View view, Paint paint) {
        if (view.getLayerType() != 2) {
            view.setLayerType(2, paint);
        }
    }

    private static void h(ViewGroup viewGroup, View view, boolean z) {
        if (z) {
            g(viewGroup, null);
            g(view, a);
        } else {
            f(viewGroup);
            f(view);
        }
    }

    private final boolean i(Context context) {
        return Color.alpha(d(context)) == 0;
    }

    private static final void j(View view, int i) {
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i, 0}));
    }

    public final void a() {
        View view = this.b;
        if (view != null) {
            view.setVisibility(8);
            f(view);
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            f(viewGroup);
        }
        this.d = null;
    }

    public final void b(int i) {
        this.d = Integer.valueOf(i);
        View view = this.b;
        if (view != null) {
            Context context = view.getContext();
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                h(viewGroup, view, i(context));
            }
            e(view, context);
        }
    }

    public final void c(ViewGroup viewGroup, Context context) {
        this.c = viewGroup;
        View view = this.b;
        if (view == null) {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.engagement_panel_seamless_fade, viewGroup, false);
            this.b = viewInflate;
            viewInflate.setVisibility(0);
            viewGroup.addView(this.b);
        } else if (!Objects.equals(view.getParent(), viewGroup)) {
            ViewGroup viewGroup2 = (ViewGroup) this.b.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.b);
            }
            viewGroup.addView(this.b);
        }
        h(viewGroup, this.b, i(context));
        View view2 = this.b;
        if (view2 != null) {
            view2.setVisibility(0);
            e(view2, context);
            view2.bringToFront();
        }
    }
}
