package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.youtube.creation.editor.image.mediagen.MediaGenInputView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeyo implements ayx {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public aeyo(aevn aevnVar, aeyq aeyqVar, int i) {
        this.$cid = i;
        this.b = aevnVar;
        this.a = aeyqVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f4  */
    @Override // defpackage.ayx
    public final bbn a(View view, bbn bbnVar) {
        boolean z;
        boolean z2 = true;
        if (this.$cid != 0) {
            boolean zX = bbnVar.x();
            Object obj = this.a;
            if (!zX) {
                upo upoVar = (upo) obj;
                upoVar.b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                upoVar.b();
                return bbnVar;
            }
            Object obj2 = this.b;
            int i = bbnVar.f(8).e;
            int[] iArr = new int[2];
            upo upoVar2 = (upo) obj;
            MediaGenInputView mediaGenInputView = upoVar2.b;
            mediaGenInputView.getLocationOnScreen(iArr);
            mediaGenInputView.setLayoutParams(new FrameLayout.LayoutParams(-1, (((Activity) obj2).getWindowManager().getCurrentWindowMetrics().getBounds().height() - iArr[1]) - i));
            upoVar2.d();
            return bbnVar;
        }
        aeyq aeyqVar = new aeyq((aeyq) this.a);
        avw avwVarF = bbnVar.f(519);
        int i2 = avwVarF.c;
        aevn aevnVar = (aevn) this.b;
        BottomSheetBehavior bottomSheetBehavior = aevnVar.b;
        avw avwVarF2 = bbnVar.f(32);
        bottomSheetBehavior.v = i2;
        boolean zC = afba.C(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        if (bottomSheetBehavior.o) {
            int iA = bbnVar.a();
            bottomSheetBehavior.u = iA;
            paddingBottom = iA + aeyqVar.d;
        }
        if (bottomSheetBehavior.p) {
            paddingLeft = (zC ? aeyqVar.c : aeyqVar.a) + avwVarF.b;
        }
        if (bottomSheetBehavior.q) {
            paddingRight = (zC ? aeyqVar.a : aeyqVar.c) + avwVarF.d;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z3 = false;
        if (bottomSheetBehavior.r) {
            int i3 = marginLayoutParams.leftMargin;
            int i4 = avwVarF.b;
            if (i3 != i4) {
                marginLayoutParams.leftMargin = i4;
                z3 = true;
            }
        }
        if (bottomSheetBehavior.s) {
            int i5 = marginLayoutParams.rightMargin;
            int i6 = avwVarF.d;
            if (i5 != i6) {
                marginLayoutParams.rightMargin = i6;
            } else {
                z2 = z3;
            }
        } else {
            z2 = z3;
        }
        if (!bottomSheetBehavior.t || marginLayoutParams.topMargin == i2) {
            if (z2) {
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            z = aevnVar.a;
            if (z) {
                bottomSheetBehavior.m = avwVarF2.e;
            }
            if (bottomSheetBehavior.o || z) {
                bottomSheetBehavior.R();
            }
            return bbnVar;
        }
        marginLayoutParams.topMargin = i2;
        view.setLayoutParams(marginLayoutParams);
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        z = aevnVar.a;
        if (z) {
            bottomSheetBehavior.m = avwVarF2.e;
        }
        if (bottomSheetBehavior.o) {
            bottomSheetBehavior.R();
        } else {
            bottomSheetBehavior.R();
        }
        return bbnVar;
    }

    public /* synthetic */ aeyo(upo upoVar, Activity activity, int i) {
        this.$cid = i;
        this.a = upoVar;
        this.b = activity;
    }
}
