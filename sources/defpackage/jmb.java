package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.EditText;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jmb implements View.OnApplyWindowInsetsListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ jmb(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        aevw aevwVar;
        EditText editText;
        int i = this.$cid;
        if (i == 0) {
            boolean zIsVisible = windowInsets.isVisible(WindowInsets.Type.ime());
            jmg jmgVar = (jmg) this.a;
            if (jmgVar.ag && !zIsVisible && (editText = jmgVar.ad) != null && editText.isFocused()) {
                jmgVar.ad.clearFocus();
            }
            jmgVar.ag = zIsVisible;
            jmgVar.D();
            Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars() | WindowInsets.Type.ime());
            if (jmgVar.at && (aevwVar = jmgVar.E) != null) {
                aevwVar.a().E(insets.top);
            }
            int i2 = jmgVar.at ? 0 : insets.top;
            ViewGroup viewGroup = jmgVar.al;
            if (viewGroup != null) {
                viewGroup.setPadding(insets.left, i2, insets.right, insets.bottom);
            }
            return WindowInsets.CONSUMED;
        }
        if (i != 1) {
            if (i == 2) {
                ((ste) this.a).i();
                return view.onApplyWindowInsets(windowInsets);
            }
            int i3 = zpk.a;
            if (windowInsets.getSystemWindowInsetBottom() <= windowInsets.getStableInsetBottom()) {
                zoz zozVar = (zoz) this.a;
                if (zozVar.isFocused()) {
                    zozVar.clearFocus();
                }
            }
            return view.onApplyWindowInsets(windowInsets);
        }
        jjm jjmVar = (jjm) this.a;
        View view2 = jjmVar.u;
        if (view2 != null) {
            view2.setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        jjy jjyVar = jjmVar.w;
        if (jjyVar == null) {
            return windowInsets;
        }
        jjyVar.e.setPadding(0, windowInsets.getSystemWindowInsetTop(), 0, jjyVar.g());
        jjyVar.d.setMinimumHeight(jjyVar.h());
        return windowInsets;
    }
}
