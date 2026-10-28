package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xch extends qa {
    public xcg a;
    public int b;
    private final advb c;
    private final wwv d;
    private final ViewGroup e;
    private final View f;
    private int g;

    public xch(advb advbVar, wwv wwvVar, View view) {
        super((byte[]) null);
        view.getClass();
        this.f = view;
        advbVar.getClass();
        this.c = advbVar;
        wwvVar.getClass();
        this.d = wwvVar;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.docked_view_container);
        this.e = viewGroup;
        viewGroup.setClipToOutline(true);
        this.g = view.getHeight();
        this.b = -1;
    }

    public final void m() {
        this.a = null;
        ViewGroup viewGroup = this.e;
        viewGroup.removeAllViews();
        viewGroup.setVisibility(8);
        viewGroup.setTranslationY(0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0103  */
    @Override // defpackage.qa
    public final void n(Canvas canvas, RecyclerView recyclerView) {
        int iC;
        View childAt;
        ampd ampdVar;
        adma admaVarE;
        View view = this.f;
        if (this.g != view.getHeight()) {
            m();
            this.g = view.getHeight();
            return;
        }
        View viewM = recyclerView.m(0.0f, 0.0f);
        if (viewM == null || (iC = recyclerView.c(viewM)) == -1) {
            return;
        }
        int i = this.b;
        if (i != -1) {
            if (iC < i) {
                m();
                return;
            }
        } else if (iC != 0) {
            this.b = iC - 1;
        } else {
            i = -1;
            if (iC < i) {
                m();
                return;
            }
        }
        int i2 = iC;
        while (true) {
            if (i2 <= this.b) {
                i2 = -1;
                break;
            } else if (this.d.s(i2)) {
                break;
            } else {
                i2--;
            }
        }
        if (i2 != -1) {
            wwv wwvVar = this.d;
            Object objD = wwvVar.d(i2);
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.live_chat_docked_header_container, (ViewGroup) recyclerView, false);
            if ((objD instanceof ampd) && (admaVarE = adul.e((admh) this.c.io(), (ampdVar = (ampd) objD), recyclerView)) != null) {
                admaVarE.hU(new adly(), ampdVar);
                ViewGroup viewGroup = (ViewGroup) linearLayout.findViewById(R.id.dock_container);
                View viewA = admaVarE.a();
                viewA.setClipToOutline(true);
                viewGroup.addView(viewA);
            }
            if (linearLayout == null) {
                return;
            }
            xcg xcgVar = this.a;
            if (xcgVar != null) {
                ViewGroup viewGroup2 = this.e;
                viewGroup2.removeAllViews();
                viewGroup2.setVisibility(8);
                xcgVar.f = false;
            }
            xcg xcgVar2 = new xcg(this.e, linearLayout, wwvVar.b(i2), i2);
            this.a = xcgVar2;
            xcgVar2.g = this;
            xcgVar2.c.postDelayed(new wvr(xcgVar2, 17), xcgVar2.e);
            xcgVar2.f = true;
        }
        xcg xcgVar3 = this.a;
        if (xcgVar3 != null) {
            int i3 = 0;
            while (true) {
                if (i3 >= recyclerView.getChildCount()) {
                    childAt = null;
                    break;
                }
                childAt = recyclerView.getChildAt(i3);
                int iC2 = recyclerView.c(childAt);
                if (iC2 >= 0 && this.d.s(iC2) && xcgVar3.d != iC2 && childAt.getTop() <= xcgVar3.a.getHeight()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (childAt != null) {
                View view2 = xcgVar3.b;
                view2.setTranslationY(childAt.getTop() - xcgVar3.a.getHeight());
                view2.setVisibility(0);
                return;
            }
            this.e.setVisibility(0);
        }
        this.b = iC;
    }
}
