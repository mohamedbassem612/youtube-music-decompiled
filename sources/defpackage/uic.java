package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uic implements View.OnApplyWindowInsetsListener {
    private final /* synthetic */ int $cid;

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int i = this.$cid;
        if (i != 0) {
            if (i != 1) {
                view.setPadding(0, windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
            } else {
                view.setPadding(0, windowInsets.getSystemWindowInsetTop(), 0, 0);
            }
        }
        return windowInsets;
    }
}
