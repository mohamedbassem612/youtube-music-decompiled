package defpackage;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class aejb {
    private final int a;
    final /* synthetic */ LoadingFrameLayout b;
    private final int c;
    private final int d;
    private View e;
    private TextView f;
    private CharSequence g;

    public aejb(LoadingFrameLayout loadingFrameLayout, int i, int i2, int i3) {
        this.b = loadingFrameLayout;
        this.a = i;
        this.c = i2;
        this.d = i3;
    }

    protected View a() {
        int i = this.c;
        LoadingFrameLayout loadingFrameLayout = this.b;
        View viewInflate = LayoutInflater.from(loadingFrameLayout.c).inflate(i, (ViewGroup) loadingFrameLayout, false);
        int i2 = this.d;
        if (i2 > 0) {
            TextView textView = (TextView) viewInflate.findViewById(i2);
            this.f = textView;
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            c(this.g);
        }
        return viewInflate;
    }

    public final void c(CharSequence charSequence) {
        TextView textView = this.f;
        if (textView != null) {
            textView.setText(charSequence);
            charSequence = null;
        }
        this.g = charSequence;
    }

    public final void d(int i) {
        int i2 = this.a;
        View view = this.e;
        if (i2 != i) {
            if (view != null) {
                view.setVisibility(8);
                this.e.clearFocus();
                return;
            }
            return;
        }
        if (view == null) {
            View viewA = a();
            this.e = viewA;
            this.b.addView(viewA);
        }
        this.e.setVisibility(0);
    }
}
