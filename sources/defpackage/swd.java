package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class swd implements admd {
    public View a;
    private final swj b;
    private View.OnClickListener c;
    private boolean d;

    public swd(Context context) {
        context.getClass();
        TypedValue typedValue = new TypedValue();
        this.b = new swj(context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true) ? context.getDrawable(typedValue.resourceId) : null, tzk.n(context, R.attr.cmtDivider).orElse(0), context.getResources().getDimensionPixelSize(R.dimen.separator_height));
    }

    @Override // defpackage.admd
    public final View a() {
        return this.a;
    }

    @Override // defpackage.admd
    public final void b(boolean z) {
        this.d = z;
        View view = this.a;
        if (view != null) {
            view.setClickable(z);
        }
    }

    @Override // defpackage.admd
    public final void c(View view) {
        view.getClass();
        this.a = view;
        view.setOnClickListener(this.c);
        this.a.setClickable(this.d);
    }

    @Override // defpackage.admd
    public final void d(View.OnClickListener onClickListener) {
        this.c = onClickListener;
        View view = this.a;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    @Override // defpackage.admd
    public final void e(adly adlyVar) {
        this.a.getClass();
        int i = adlh.d(adlyVar).b;
        boolean zJ = adlyVar.j("showLineSeparator");
        boolean z = false;
        if (i == 1 && zJ) {
            z = true;
        }
        swj swjVar = this.b;
        if (swjVar.a != z) {
            swjVar.a = z;
            swjVar.invalidateSelf();
        }
        tym.Z(this.a, swjVar);
    }
}
