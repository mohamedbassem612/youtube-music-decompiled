package defpackage;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adkx extends adkq {
    private ConstraintLayout a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int[] g;
    private View h;
    private View i;

    @Override // defpackage.adkq
    protected final ViewGroup d(Context context) {
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        this.a = constraintLayout;
        constraintLayout.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        return this.a;
    }

    @Override // defpackage.adkq
    protected final adkv e(Context context, admh admhVar) {
        return new adkw(context, admhVar);
    }

    @Override // defpackage.adkq
    protected final void f(int i, adly adlyVar, adla adlaVar) {
        this.g = new int[i];
        this.b = adlyVar.b("grid_row_presenter_horizontal_row_padding", adlaVar.c);
        this.d = adlyVar.b("grid_row_presenter_top_padding", 0);
        this.c = adlyVar.b("grid_row_presenter_horizontal_row_padding", adlaVar.d);
        this.e = adlyVar.b("grid_row_presenter_bottom_padding", adlaVar.b);
        this.f = adlaVar.e;
    }

    @Override // defpackage.adkq
    protected final void g(adly adlyVar, adla adlaVar) {
        int length;
        ag agVar = new ag();
        ConstraintLayout constraintLayout = this.a;
        int childCount = constraintLayout.getChildCount();
        HashMap map = agVar.a;
        map.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ae aeVar = (ae) childAt.getLayoutParams();
            int id = childAt.getId();
            Integer numValueOf = Integer.valueOf(id);
            if (!map.containsKey(numValueOf)) {
                map.put(numValueOf, new af());
            }
            af afVar = (af) map.get(numValueOf);
            afVar.d = id;
            afVar.h = aeVar.d;
            afVar.i = aeVar.e;
            afVar.j = aeVar.f;
            afVar.k = aeVar.g;
            afVar.l = aeVar.h;
            afVar.m = aeVar.i;
            afVar.n = aeVar.j;
            afVar.o = aeVar.k;
            afVar.p = aeVar.l;
            afVar.q = aeVar.m;
            afVar.r = aeVar.n;
            afVar.s = aeVar.o;
            afVar.t = aeVar.p;
            afVar.u = aeVar.w;
            afVar.v = aeVar.x;
            afVar.w = aeVar.y;
            afVar.x = aeVar.K;
            afVar.y = aeVar.L;
            afVar.z = aeVar.M;
            afVar.g = aeVar.c;
            afVar.e = aeVar.a;
            afVar.f = aeVar.b;
            afVar.b = aeVar.width;
            afVar.c = aeVar.height;
            afVar.A = aeVar.leftMargin;
            afVar.B = aeVar.rightMargin;
            afVar.C = aeVar.topMargin;
            afVar.D = aeVar.bottomMargin;
            afVar.N = aeVar.B;
            afVar.O = aeVar.A;
            afVar.Q = aeVar.D;
            afVar.P = aeVar.C;
            afVar.ad = aeVar.E;
            afVar.ae = aeVar.F;
            afVar.af = aeVar.I;
            afVar.ag = aeVar.J;
            afVar.ah = aeVar.G;
            afVar.ai = aeVar.H;
            afVar.E = aeVar.getMarginEnd();
            afVar.F = aeVar.getMarginStart();
            afVar.G = childAt.getVisibility();
            afVar.R = childAt.getAlpha();
            afVar.U = childAt.getRotationX();
            afVar.V = childAt.getRotationY();
            afVar.W = childAt.getScaleX();
            afVar.X = childAt.getScaleY();
            afVar.Y = childAt.getPivotX();
            afVar.Z = childAt.getPivotY();
            afVar.aa = childAt.getTranslationX();
            afVar.ab = childAt.getTranslationY();
            afVar.ac = childAt.getTranslationZ();
            if (afVar.S) {
                afVar.T = childAt.getElevation();
            }
        }
        agVar.b(this.h.getId(), 6, 0, 6);
        agVar.d(this.h.getId(), 6, this.b);
        agVar.b(this.i.getId(), 7, 0, 7);
        agVar.d(this.i.getId(), 7, this.c);
        int[] iArr = this.g;
        int i2 = 1;
        if (iArr.length == 1) {
            agVar.b(iArr[0], 6, this.h.getId(), 6);
            agVar.b(this.g[0], 7, this.i.getId(), 7);
        } else {
            int id2 = this.h.getId();
            int id3 = this.i.getId();
            int[] iArr2 = this.g;
            if (iArr2.length < 2) {
                throw new IllegalArgumentException("must have 2 or more widgets in a chain");
            }
            agVar.a(iArr2[0]).P = 0;
            agVar.e(iArr2[0], 6, id2, 6);
            while (true) {
                length = iArr2.length;
                if (i2 >= length) {
                    break;
                }
                int i3 = i2 - 1;
                agVar.e(iArr2[i2], 6, iArr2[i3], 7);
                agVar.e(iArr2[i3], 7, iArr2[i2], 6);
                i2++;
            }
            agVar.e(iArr2[length - 1], 7, id3, 7);
        }
        int i4 = 0;
        while (true) {
            int[] iArr3 = this.g;
            if (i4 >= iArr3.length) {
                this.a.c = agVar;
                return;
            }
            agVar.b(iArr3[i4], 3, 0, 3);
            agVar.b(this.g[i4], 4, 0, 4);
            agVar.a(this.g[i4]).v = 0.0f;
            int iC = adlh.c(i4, this.g.length, this.f);
            int[] iArr4 = this.g;
            int iB = adlh.b(i4, iArr4.length, this.f);
            int i5 = this.d;
            int i6 = this.e;
            agVar.d(iArr4[i4], 6, iC);
            agVar.d(this.g[i4], 7, iB);
            agVar.d(this.g[i4], 3, i5);
            agVar.d(this.g[i4], 4, i6);
            i4++;
        }
    }

    @Override // defpackage.adkq
    protected final void h(View view, adla adlaVar, int i) {
        this.g[i] = view.getId();
        if (i == 0) {
            View view2 = new View(view.getContext());
            this.h = view2;
            view2.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
            this.h.setId(View.generateViewId());
            this.h.setVisibility(4);
            this.a.addView(this.h);
            i = 0;
        }
        this.a.addView(view);
        if (i == adlaVar.a - 1) {
            View view3 = new View(view.getContext());
            this.i = view3;
            view3.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
            this.i.setId(View.generateViewId());
            this.i.setVisibility(4);
            this.a.addView(this.i);
        }
    }
}
