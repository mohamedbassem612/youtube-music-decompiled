package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vis extends nh {
    public View.OnClickListener a;
    private final int e;
    private final ahbo f;
    private final LinearLayout.LayoutParams g;
    private final viu h;
    private final agke i;
    private RecyclerView j;
    private vip k;
    private int l = 0;
    private final boolean m;

    public vis(Context context, ahbo ahboVar, vir virVar, boolean z) {
        this.m = z;
        this.f = ahboVar;
        if (virVar != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(context.getResources().getDimensionPixelSize(virVar.a), context.getResources().getDimensionPixelSize(virVar.b));
            this.g = layoutParams;
            layoutParams.gravity = 17;
            vit vitVar = new vit();
            vitVar.a(0);
            vitVar.a = context.getResources().getColor(virVar.c);
            vitVar.e = (byte) (vitVar.e | 1);
            vitVar.b = context.getResources().getDimension(virVar.d);
            vitVar.e = (byte) (vitVar.e | 2);
            vitVar.c = context.getResources().getDimensionPixelSize(virVar.e);
            vitVar.e = (byte) (vitVar.e | 4);
            vitVar.a(virVar.f);
            if (vitVar.e != 15) {
                StringBuilder sb = new StringBuilder();
                if ((vitVar.e & 1) == 0) {
                    sb.append(" borderColor");
                }
                if ((vitVar.e & 2) == 0) {
                    sb.append(" borderWidth");
                }
                if ((vitVar.e & 4) == 0) {
                    sb.append(" horizontalPadding");
                }
                if ((vitVar.e & 8) == 0) {
                    sb.append(" footerPaddingOffsetDp");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            this.h = new viu(vitVar.a, vitVar.b, vitVar.c, vitVar.d);
            this.i = virVar.g;
        } else {
            this.g = null;
            this.h = null;
            this.i = agpi.a;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            this.e = 1;
            return;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.e = Math.max(Math.min(point.x, point.y), 1);
    }

    public final boolean A() {
        return a() == 1;
    }

    @Override // defpackage.nh
    public final int a() {
        return this.h != null ? ((agpi) this.i).d : this.f.b;
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ oh e(ViewGroup viewGroup, int i) {
        this.j = (RecyclerView) viewGroup;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 16);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(layoutParams);
        return new xuc(frameLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ void o(oh ohVar, int i) {
        LinearLayout linearLayout;
        np npVar;
        np npVar2;
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        viu viuVar = this.h;
        xuc xucVar = (xuc) ohVar;
        if (viuVar == null || (layoutParams2 = this.g) == null) {
            linearLayout = (LinearLayout) LayoutInflater.from(((ViewGroup) xucVar.s).getContext()).inflate(this.f.a(i), (ViewGroup) null, false);
        } else {
            agke agkeVar = (agke) this.i.get(i);
            ViewGroup viewGroup = (ViewGroup) xucVar.s;
            linearLayout = new LinearLayout(viewGroup.getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams3.addRule(12, -1);
            linearLayout.setLayoutParams(layoutParams3);
            linearLayout.setGravity(16);
            linearLayout.setOrientation(0);
            linearLayout.setBaselineAligned(false);
            int size = agkeVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                linearLayout.addView(new viy(viewGroup.getContext(), viuVar, (vix) agkeVar.get(i2)), layoutParams2);
            }
        }
        ((ViewGroup) xucVar.s).addView(linearLayout);
        int childCount = linearLayout.getChildCount();
        boolean z = true;
        double d = true != A() ? 0.5d : 0.0d;
        double d2 = childCount;
        int i3 = this.e;
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = linearLayout.getChildAt(i4);
            View.OnClickListener onClickListener = this.a;
            onClickListener.getClass();
            childAt.setOnClickListener(onClickListener);
            ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
            boolean z2 = z;
            if (layoutParams4 != null) {
                if (!this.m || viuVar == null || (layoutParams = this.g) == null || childCount == 9) {
                    int i5 = (int) (((double) i3) / (d2 + d));
                    if (!A() || i5 < layoutParams4.width) {
                        layoutParams4.width = i5;
                    }
                } else {
                    layoutParams4.width = layoutParams.width;
                }
            }
            vip vipVar = this.k;
            if (vipVar != null && vipVar.a((vjb) childAt)) {
                this.k = null;
                this.l = 0;
                RecyclerView recyclerView = this.j;
                if (recyclerView != null && (npVar2 = recyclerView.n) != null) {
                    npVar2.scrollToPosition(i);
                }
                this.a.onClick(childAt);
            }
            i4++;
            z = z2;
        }
        if (this.k != null) {
            int i6 = this.l + 1;
            this.l = i6;
            if (i6 < a()) {
                int iA = (i + 1) % a();
                RecyclerView recyclerView2 = this.j;
                if (recyclerView2 == null || (npVar = recyclerView2.n) == null) {
                    return;
                }
                npVar.scrollToPosition(iA);
            }
        }
    }

    public final void z(vip vipVar) {
        this.l = 0;
        this.k = vipVar;
        jW();
    }
}
