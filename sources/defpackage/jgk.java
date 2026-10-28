package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jgk implements adma {
    private final Context a;
    private final ViewGroup b;
    private final View c;
    private final View d;
    private final View e;
    private final hfn f;

    public jgk(Context context, hfn hfnVar) {
        context.getClass();
        this.a = context;
        ViewGroup viewGroup = (ViewGroup) View.inflate(context, R.layout.shelf_divider, null);
        this.b = viewGroup;
        this.c = viewGroup.findViewById(R.id.line);
        this.d = viewGroup.findViewById(R.id.divider);
        this.e = viewGroup.findViewById(R.id.divider_after);
        this.f = hfnVar;
    }

    @Override // defpackage.adma
    public final View a() {
        return this.b;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        ViewGroup viewGroup = this.b;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.height = -2;
        viewGroup.setLayoutParams(layoutParams);
    }

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        int dimensionPixelSize;
        ixn ixnVar = (ixn) obj;
        int i = bac.a;
        ViewGroup viewGroup = this.b;
        viewGroup.setImportantForAccessibility(2);
        int i2 = ixnVar.c - 1;
        View view = this.e;
        View view2 = this.d;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int i3 = 8;
        if (i2 == 0 ? !adlyVar.j("isFirstItem") : i2 != 2 || adlyVar.j("isFirstItem")) {
            viewGroup.setVisibility(0);
            view2.setVisibility(0);
            view.setVisibility(0);
            View view3 = this.c;
            if (ixnVar.a && !adlyVar.j("isLastMergedItem")) {
                i3 = 0;
            }
            view3.setVisibility(i3);
            int i4 = ixnVar.d;
            int i5 = ixnVar.b - 1;
            if (i5 == 0) {
                dimensionPixelSize = 0;
            } else if (i5 == 1) {
                dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.shelf_divider_extra_small_height);
            } else if (i5 == 3) {
                dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.shelf_divider_large_height);
            } else if (i5 == 4) {
                dimensionPixelSize = this.f.K();
            } else if (i5 != 5) {
                dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.shelf_divider_small_height);
            } else {
                hfn hfnVar = this.f;
                dimensionPixelSize = hfnVar.K() + hfnVar.J();
            }
            layoutParams.height = dimensionPixelSize;
            layoutParams2.height = 0;
        } else {
            layoutParams.height = 1;
            this.c.setVisibility(8);
            view.setVisibility(8);
        }
        view2.setLayoutParams(layoutParams);
        view.setLayoutParams(layoutParams2);
    }
}
