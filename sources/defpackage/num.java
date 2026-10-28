package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.libraries.multiplatform.elements.ElementsServices;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class num {
    public static atbp a(RecyclerView recyclerView, ElementsServices elementsServices, int i, int i2, int i3) {
        float fA = elementsServices.a();
        boolean zC = elementsServices.m().c();
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        float f = iComputeHorizontalScrollOffset / fA;
        float fComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset() / fA;
        int iFindLastVisibleItemPosition = -1;
        if (i3 == 2) {
            View viewM = recyclerView.m(recyclerView.getWidth() / 2, recyclerView.getHeight() / 2);
            if (viewM != null) {
                iFindLastVisibleItemPosition = recyclerView.c(viewM);
            }
        } else {
            np npVar = recyclerView.n;
            if (npVar instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) npVar;
                iFindLastVisibleItemPosition = (zC && linearLayoutManager.getOrientation() == 0) ? linearLayoutManager.findLastVisibleItemPosition() : linearLayoutManager.findFirstVisibleItemPosition();
            }
        }
        int iComputeHorizontalScrollRange = recyclerView.computeHorizontalScrollRange();
        int measuredWidth = recyclerView.getMeasuredWidth();
        if (zC) {
            iComputeHorizontalScrollOffset = (iComputeHorizontalScrollRange - measuredWidth) - iComputeHorizontalScrollOffset;
        }
        float f2 = iComputeHorizontalScrollOffset / fA;
        float f3 = iComputeHorizontalScrollRange / fA;
        float fComputeVerticalScrollRange = recyclerView.computeVerticalScrollRange() / fA;
        float f4 = i / fA;
        float f5 = i2 / fA;
        atbl atblVar = new atbl();
        atkp atkpVar = new atkp();
        atkpVar.aR(f);
        atkpVar.aS(fComputeVerticalScrollOffset);
        atks atksVarAT = atkpVar.aT();
        if (atksVarAT != atblVar.h) {
            atblVar.h = atksVarAT;
            atblVar.e = true;
        }
        atblVar.aT();
        atblVar.bO(8, 2);
        boolean z = atbl.a;
        atblVar.bQ(true != z ? 16 : 12, iFindLastVisibleItemPosition);
        atblVar.aT();
        atblVar.bO(8, 16);
        atblVar.bP(true != z ? 28 : 20, f2);
        atmx atmxVar = new atmx();
        atmxVar.aS(f3);
        atmxVar.aR(fComputeVerticalScrollRange);
        atna atnaVarAT = atmxVar.aT();
        if (atnaVarAT != atblVar.j) {
            atblVar.j = atnaVarAT;
            atblVar.g = true;
        }
        atkp atkpVar2 = new atkp();
        atkpVar2.aR(f4);
        atkpVar2.aS(f5);
        atks atksVarAT2 = atkpVar2.aT();
        if (atksVarAT2 != atblVar.i) {
            atblVar.i = atksVarAT2;
            atblVar.f = true;
        }
        nh nhVar = recyclerView.m;
        if (nhVar != null) {
            int iA = nhVar.a();
            atblVar.aT();
            atblVar.bO(8, 4);
            atblVar.bQ(true != z ? 20 : 16, iA);
        }
        if (atblVar.d) {
            atblVar.bG();
        } else {
            atblVar.d = true;
        }
        atbp atbpVar = new atbp(atblVar.b);
        if (atblVar.h != null) {
            atbpVar.h = atblVar.h;
            atbpVar.e = atblVar.e;
        }
        if (atblVar.i != null) {
            atbpVar.i = atblVar.i;
            atbpVar.f = atblVar.f;
        }
        if (atblVar.j != null) {
            atbpVar.j = atblVar.j;
            atbpVar.g = atblVar.g;
        }
        atbpVar.bJ();
        return atbpVar;
    }
}
