package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListPopupWindow;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class adwl extends adva {
    private final FrameLayout a;
    private final Context g;
    private final Optional h;
    private final vxe i;
    private final Optional j;

    public adwl(Context context, vxe vxeVar, advb advbVar, ci ciVar, ahek ahekVar, hef hefVar, jnj jnjVar, ci ciVar2, Optional optional, Optional optional2, Optional optional3) {
        super(context, vxeVar, advbVar, ciVar, ahekVar, hefVar, jnjVar, ciVar2, optional, optional2, optional3);
        this.g = context;
        this.h = optional3;
        this.a = new FrameLayout(context);
        this.i = vxeVar;
        this.j = optional;
    }

    @Override // defpackage.adva
    public void k(anfy anfyVar, View view, Object obj, xgn xgnVar) {
        if (anfyVar.i && (anfyVar.b & 131072) != 0) {
            this.d = obj;
            this.e = xgnVar;
            vxe vxeVar = this.i;
            ajwo ajwoVar = anfyVar.j;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            vxeVar.a(ajwoVar);
            return;
        }
        Optional optional = this.h;
        optional.isPresent();
        Context context = this.g;
        if (adzb.h(context, (vxz) optional.orElse(null), 2)) {
            super.k(anfyVar, view, obj, xgnVar);
            return;
        }
        admu admuVar = this.c;
        ListPopupWindow listPopupWindowN = n();
        admuVar.clear();
        this.j.isPresent();
        admuVar.addAll(a(anfyVar, obj));
        this.d = obj;
        this.e = xgnVar;
        adln adlnVar = this.b;
        FrameLayout frameLayout = this.a;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(twm.i(context), Integer.MIN_VALUE);
        int count = adlnVar.getCount();
        int i = 0;
        int i2 = 0;
        View view2 = null;
        for (int i3 = 0; i3 < count; i3++) {
            int itemViewType = adlnVar.getItemViewType(i3);
            if (itemViewType != i2) {
                view2 = null;
                i2 = itemViewType;
            }
            view2 = adlnVar.getView(i3, view2, frameLayout);
            view2.measure(iMakeMeasureSpec, 0);
            int measuredWidth = view2.getMeasuredWidth();
            if (measuredWidth > i) {
                i = measuredWidth;
            }
        }
        float dimension = context.getResources().getDimension(R.dimen.innertube_menu_width_increment_dp);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float fB = twm.b(displayMetrics, dimension);
        float fCeil = ((float) Math.ceil(twm.b(displayMetrics, i) / fB)) * fB;
        if (fCeil > twm.h(context)) {
            fCeil -= fB;
        }
        if (fCeil < ((double) fB) * 1.5d) {
            fCeil = 1.5f * fB;
        }
        listPopupWindowN.setWidth((int) twm.a(displayMetrics, fCeil));
        listPopupWindowN.setDropDownGravity(8388661);
        listPopupWindowN.setAnchorView(view);
        listPopupWindowN.show();
    }
}
