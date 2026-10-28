package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.PopupWindow;
import com.facebook.litho.ComponentTree;
import com.google.android.apps.youtube.music.R;
import j$.util.OptionalInt;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acyj {
    public final avmm a = new avmm();
    public boolean b = false;
    PopupWindow c;
    private final Context d;
    private final aunn e;
    private final aunn f;
    private final afip g;

    public acyj(Context context, aunn aunnVar, aunn aunnVar2, afip afipVar, bog bogVar) {
        this.d = context;
        this.e = aunnVar;
        this.f = aunnVar2;
        this.g = afipVar;
        bogVar.getLifecycle().b(new acyi(this));
    }

    private static int c(int i) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), i == -2 ? 0 : 1073741824);
    }

    public final void a() {
        PopupWindow popupWindow = this.c;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final void b(asmv asmvVar, View view, OptionalInt optionalInt, OptionalInt optionalInt2, OptionalInt optionalInt3) {
        a();
        Context context = this.d;
        int iOrElse = optionalInt.orElse(tzk.i(context, R.attr.ytBrandBackgroundSolid));
        int iApplyDimension = optionalInt2.isPresent() ? (int) TypedValue.applyDimension(1, optionalInt2.getAsInt(), context.getResources().getDisplayMetrics()) : -15;
        int iApplyDimension2 = optionalInt3.isPresent() ? (int) TypedValue.applyDimension(1, optionalInt3.getAsInt(), context.getResources().getDisplayMetrics()) : 0;
        int iOrElse2 = optionalInt.orElse(R.attr.ytStaticWhite);
        fjw fjwVar = new fjw(context);
        fhd fhdVar = fjwVar.y;
        xgn xgnVarHB = ((xgm) this.f.io()).hB();
        mlo mloVar = (mlo) this.e.io();
        nsk nskVarB = nsl.b();
        nskVarB.b(fjwVar);
        nskVarB.n(this.g.e(xgnVarHB));
        fgy fgyVarA = mloVar.a(fhdVar, nskVarB.a(), asmvVar.toByteArray(), new adat(xgnVarHB), this.a);
        ComponentTree componentTree = fjwVar.w;
        if (componentTree == null) {
            fjwVar.K(ComponentTree.c(fhdVar, fgyVarA, null).a(), true);
        } else {
            componentTree.D(fgyVarA, -1, -1, false, null, 0, null, null, false, false);
        }
        fjwVar.setBackgroundColor(iOrElse);
        PopupWindow popupWindow = new PopupWindow((View) fjwVar, -2, -2, true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(iOrElse2));
        popupWindow.setElevation(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
        popupWindow.setOnDismissListener(new acya(this, 2));
        popupWindow.setAnimationStyle(android.R.style.Animation.Dialog);
        fjwVar.measure(c(popupWindow.getWidth()), c(popupWindow.getHeight()));
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        int iCenterX = (this.b ? rect.centerX() - (fjwVar.getMeasuredWidth() / 2) : rect.right - fjwVar.getMeasuredWidth()) + iApplyDimension2;
        boolean z = this.b;
        int measuredHeight = rect.top + iApplyDimension;
        if (z) {
            measuredHeight -= fjwVar.getMeasuredHeight();
        }
        popupWindow.showAtLocation(view, 0, iCenterX, measuredHeight);
        this.c = popupWindow;
    }
}
