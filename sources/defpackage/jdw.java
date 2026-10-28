package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jdw implements admd {
    public final FrameLayout a;
    private final int b;
    private boolean c;

    public jdw(Context context) {
        context.getClass();
        this.a = (FrameLayout) View.inflate(context, R.layout.music_item_chrome, null);
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
        FrameLayout frameLayout = this.a;
        frameLayout.removeViewAt(0);
        frameLayout.addView(view, 0);
    }

    @Override // defpackage.admd
    public final void d(View.OnClickListener onClickListener) {
        FrameLayout frameLayout = this.a;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(onClickListener);
        }
    }

    @Override // defpackage.admd
    public final void e(adly adlyVar) {
        if (!this.c) {
            FrameLayout frameLayout = this.a;
            if (frameLayout.hasOnClickListeners() && frameLayout.isClickable()) {
                frameLayout.setBackgroundResource(this.b);
                return;
            }
        }
        this.a.setBackground(null);
    }

    public jdw(Context context, byte[] bArr) {
        this.a = (FrameLayout) View.inflate(context, R.layout.music_item_chrome, null);
        this.c = true;
        this.b = 0;
    }
}
