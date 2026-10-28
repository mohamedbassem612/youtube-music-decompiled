package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jff implements admd {
    public final SwipeLayout a;
    private final int b;

    public jff(Context context) {
        context.getClass();
        this.a = (SwipeLayout) View.inflate(context, R.layout.music_swipeable_item_chrome, null);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.defaultItemSelector, typedValue, true);
        this.b = typedValue.resourceId;
    }

    @Override // defpackage.admd
    public final View a() {
        return this.a;
    }

    @Override // defpackage.admd
    public final void b(boolean z) {
        this.a.setClickable(z);
    }

    @Override // defpackage.admd
    public final void c(View view) {
        view.getClass();
        SwipeLayout swipeLayout = this.a;
        swipeLayout.removeViewAt(0);
        swipeLayout.addView(view, 0);
    }

    @Override // defpackage.admd
    public final void d(View.OnClickListener onClickListener) {
        SwipeLayout swipeLayout = this.a;
        if (swipeLayout != null) {
            swipeLayout.setOnClickListener(onClickListener);
        }
    }

    @Override // defpackage.admd
    public final void e(adly adlyVar) {
        SwipeLayout swipeLayout = this.a;
        if (swipeLayout.hasOnClickListeners() && swipeLayout.isClickable()) {
            swipeLayout.setBackgroundResource(this.b);
        } else {
            swipeLayout.setBackground(null);
        }
    }
}
