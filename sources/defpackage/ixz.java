package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ixz {
    private final int a;
    private final int b;
    private TextView c;
    private CharSequence d;
    private final int e;
    public Supplier g;
    public View h;
    public final /* synthetic */ LoadingFrameLayout i;

    public ixz(LoadingFrameLayout loadingFrameLayout, int i, int i2, int i3) {
        this.i = loadingFrameLayout;
        this.e = i;
        this.a = i2;
        this.b = i3;
    }

    protected View a() {
        int i = this.a;
        LoadingFrameLayout loadingFrameLayout = this.i;
        View viewInflate = LayoutInflater.from(loadingFrameLayout.a).inflate(i, (ViewGroup) loadingFrameLayout, false);
        int i2 = this.b;
        if (i2 > 0) {
            this.c = (TextView) viewInflate.findViewById(i2);
            h(this.d);
        }
        return viewInflate;
    }

    public final void h(CharSequence charSequence) {
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(charSequence);
            charSequence = null;
        }
        this.d = charSequence;
    }

    public final void i(int i) {
        int i2 = this.e;
        View view = this.h;
        if (i2 != i) {
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        if (view == null) {
            View viewA = a();
            this.h = viewA;
            this.i.addView(viewA);
        }
        this.h.setVisibility(0);
        int i3 = 2;
        if (i2 == 2) {
            this.h.setAlpha(0.0f);
            this.h.post(new iqc(this, i3));
        } else if (i2 == 3) {
            this.h.setAlpha(0.0f);
            this.h.animate().alpha(1.0f).setDuration(75L);
        }
        View view2 = this.h;
        int paddingLeft = view2.getPaddingLeft();
        int paddingTop = this.h.getPaddingTop();
        int paddingRight = this.h.getPaddingRight();
        Supplier supplier = this.g;
        view2.setPadding(paddingLeft, paddingTop, paddingRight, supplier != null ? ((Integer) supplier.get()).intValue() : this.h.getPaddingBottom());
    }
}
