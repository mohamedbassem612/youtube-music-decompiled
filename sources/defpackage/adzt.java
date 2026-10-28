package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class adzt implements View.OnApplyWindowInsetsListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ ViewGroup.MarginLayoutParams a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;

    public /* synthetic */ adzt(Object obj, ViewGroup.MarginLayoutParams marginLayoutParams, View view, int i) {
        this.$cid = i;
        this.c = obj;
        this.a = marginLayoutParams;
        this.b = view;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (this.$cid != 0) {
            Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars());
            if (((acfd) this.c).a) {
                return view.onApplyWindowInsets(windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), insets.bottom));
            }
            View view2 = this.b;
            ViewGroup.MarginLayoutParams marginLayoutParams = this.a;
            marginLayoutParams.bottomMargin = 0;
            view2.setLayoutParams(marginLayoutParams);
            return view.onApplyWindowInsets(windowInsets);
        }
        Insets insets2 = windowInsets.getInsets(WindowInsets.Type.systemBars());
        if (((adyw) this.c).G) {
            return view.onApplyWindowInsets(windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), insets2.bottom));
        }
        View view3 = this.b;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = this.a;
        marginLayoutParams2.bottomMargin = 0;
        view3.setLayoutParams(marginLayoutParams2);
        return view.onApplyWindowInsets(windowInsets);
    }
}
