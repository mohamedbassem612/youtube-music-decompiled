package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adlm implements adma {
    public final View a;
    public final DisplayMetrics b;
    private final int c;
    private final int d;

    public adlm(Context context) {
        View view = new View(context);
        this.a = view;
        view.setImportantForAccessibility(2);
        this.b = context.getResources().getDisplayMetrics();
        this.c = tzk.n(context, R.attr.ytSeparator).orElse(0);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.default_line_separator_height);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.a;
    }

    public final void d(adll adllVar) {
        int iIntValue = ((Integer) adllVar.a.a(new acpb(this, 9)).e(Integer.valueOf(this.d))).intValue();
        int iIntValue2 = ((Integer) adllVar.b.a(new acpb(this, 10)).e(0)).intValue();
        int iIntValue3 = ((Integer) adllVar.c.a(new acpb(this, 11)).e(0)).intValue();
        View view = this.a;
        view.setMinimumHeight(iIntValue + iIntValue2 + iIntValue3);
        if (iIntValue > 0) {
            view.setBackground(new InsetDrawable((Drawable) new ColorDrawable(adllVar.d ? 0 : this.c), view.getPaddingLeft(), iIntValue2, view.getPaddingRight(), iIntValue3));
        }
    }

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        d((adll) obj);
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
