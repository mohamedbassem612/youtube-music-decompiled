package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mim extends qa implements nru {
    private final float a;
    private final boolean b;
    private int c;
    private int d;
    private final ftc e;
    private final int f;

    public mim(myz myzVar, Context context, ftc ftcVar) {
        super((byte[]) null);
        Resources resources = context.getResources();
        this.a = resources.getDisplayMetrics().density;
        this.b = qnl.bs(resources);
        this.f = myzVar.E();
        this.e = ftcVar;
    }

    @Override // defpackage.nru
    public final nrt a(nrt nrtVar) {
        float width;
        float height;
        RecyclerView recyclerViewA = this.e.a();
        if (recyclerViewA != null) {
            float fComputeHorizontalScrollOffset = recyclerViewA.computeHorizontalScrollOffset();
            float fComputeVerticalScrollOffset = recyclerViewA.computeVerticalScrollOffset();
            float fComputeHorizontalScrollRange = recyclerViewA.computeHorizontalScrollRange();
            float fComputeVerticalScrollRange = recyclerViewA.computeVerticalScrollRange();
            float measuredWidth = recyclerViewA.getMeasuredWidth();
            float measuredHeight = recyclerViewA.getMeasuredHeight();
            nh nhVar = recyclerViewA.m;
            int iA = nhVar != null ? nhVar.a() : 0;
            boolean z = this.b;
            float f = this.a;
            float f2 = z ? ((fComputeHorizontalScrollRange - measuredWidth) - fComputeHorizontalScrollOffset) / f : fComputeHorizontalScrollOffset / f;
            aihf aihfVarCreateBuilder = aslk.a.createBuilder();
            asob asobVar = asob.a;
            aihf aihfVarCreateBuilder2 = asobVar.createBuilder();
            float f3 = this.a;
            aihfVarCreateBuilder2.copyOnWrite();
            asob asobVar2 = (asob) aihfVarCreateBuilder2.instance;
            asobVar2.b |= 1;
            asobVar2.c = fComputeHorizontalScrollOffset / f3;
            aihfVarCreateBuilder2.copyOnWrite();
            asob asobVar3 = (asob) aihfVarCreateBuilder2.instance;
            asobVar3.b |= 2;
            asobVar3.d = fComputeVerticalScrollOffset / f3;
            aihfVarCreateBuilder.copyOnWrite();
            aslk aslkVar = (aslk) aihfVarCreateBuilder.instance;
            asob asobVar4 = (asob) aihfVarCreateBuilder2.build();
            asobVar4.getClass();
            aslkVar.d = asobVar4;
            aslkVar.c |= 1;
            int i = this.f;
            String str = mio.a;
            int iE = -1;
            if (i == 2) {
                View viewM = recyclerViewA.m(recyclerViewA.getWidth() / 2, recyclerViewA.getHeight() / 2);
                if (viewM != null) {
                    iE = recyclerViewA.c(viewM);
                }
            } else {
                np npVar = recyclerViewA.n;
                if (npVar instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) npVar;
                    iE = (z && linearLayoutManager.getOrientation() == 0) ? linearLayoutManager.findLastVisibleItemPosition() : linearLayoutManager.findFirstVisibleItemPosition();
                } else if (npVar instanceof FlowLayoutManager) {
                    FlowLayoutManager flowLayoutManager = (FlowLayoutManager) npVar;
                    iE = (z && flowLayoutManager.w == 0) ? flowLayoutManager.e() : flowLayoutManager.c();
                }
            }
            aihfVarCreateBuilder.copyOnWrite();
            aslk aslkVar2 = (aslk) aihfVarCreateBuilder.instance;
            aslkVar2.c |= 4;
            aslkVar2.f = iE;
            aihfVarCreateBuilder.copyOnWrite();
            aslk aslkVar3 = (aslk) aihfVarCreateBuilder.instance;
            aslkVar3.c |= 8;
            aslkVar3.g = iA;
            aihfVarCreateBuilder.copyOnWrite();
            aslk aslkVar4 = (aslk) aihfVarCreateBuilder.instance;
            aslkVar4.c |= 32;
            aslkVar4.i = f2;
            ason asonVar = ason.a;
            aihf aihfVarCreateBuilder3 = asonVar.createBuilder();
            aihfVarCreateBuilder3.copyOnWrite();
            ason asonVar2 = (ason) aihfVarCreateBuilder3.instance;
            asonVar2.b |= 2;
            asonVar2.d = fComputeVerticalScrollRange / f3;
            aihfVarCreateBuilder3.copyOnWrite();
            ason asonVar3 = (ason) aihfVarCreateBuilder3.instance;
            asonVar3.b |= 1;
            asonVar3.c = fComputeHorizontalScrollRange / f3;
            ason asonVar4 = (ason) aihfVarCreateBuilder3.build();
            aihfVarCreateBuilder.copyOnWrite();
            aslk aslkVar5 = (aslk) aihfVarCreateBuilder.instance;
            asonVar4.getClass();
            aslkVar5.h = asonVar4;
            aslkVar5.c |= 16;
            aihf aihfVarCreateBuilder4 = asobVar.createBuilder();
            float f4 = this.c / f3;
            aihfVarCreateBuilder4.copyOnWrite();
            asob asobVar5 = (asob) aihfVarCreateBuilder4.instance;
            asobVar5.b |= 1;
            asobVar5.c = f4;
            float f5 = this.d / f3;
            aihfVarCreateBuilder4.copyOnWrite();
            asob asobVar6 = (asob) aihfVarCreateBuilder4.instance;
            asobVar6.b |= 2;
            asobVar6.d = f5;
            aihfVarCreateBuilder.copyOnWrite();
            aslk aslkVar6 = (aslk) aihfVarCreateBuilder.instance;
            asob asobVar7 = (asob) aihfVarCreateBuilder4.build();
            asobVar7.getClass();
            aslkVar6.e = asobVar7;
            aslkVar6.c |= 2;
            Object parent = recyclerViewA.getParent();
            if (parent instanceof View) {
                View view = (View) parent;
                width = view.getWidth();
                height = view.getHeight();
            } else {
                width = 0.0f;
                height = 0.0f;
            }
            Rect rect = new Rect();
            recyclerViewA.getWindowVisibleDisplayFrame(rect);
            aihf aihfVarCreateBuilder5 = aslp.a.createBuilder();
            aslx aslxVar = aslx.a;
            aihf aihfVarCreateBuilder6 = aslxVar.createBuilder();
            aihf aihfVarCreateBuilder7 = asonVar.createBuilder();
            aihfVarCreateBuilder7.copyOnWrite();
            ason asonVar5 = (ason) aihfVarCreateBuilder7.instance;
            asonVar5.b |= 1;
            asonVar5.c = measuredWidth / f3;
            aihfVarCreateBuilder7.copyOnWrite();
            ason asonVar6 = (ason) aihfVarCreateBuilder7.instance;
            asonVar6.b |= 2;
            asonVar6.d = measuredHeight / f3;
            ason asonVar7 = (ason) aihfVarCreateBuilder7.build();
            aihfVarCreateBuilder6.copyOnWrite();
            aslx aslxVar2 = (aslx) aihfVarCreateBuilder6.instance;
            asonVar7.getClass();
            aslxVar2.c = asonVar7;
            aslxVar2.b |= 1;
            aslx aslxVar3 = (aslx) aihfVarCreateBuilder6.build();
            aihfVarCreateBuilder5.copyOnWrite();
            aslp aslpVar = (aslp) aihfVarCreateBuilder5.instance;
            aslxVar3.getClass();
            aslpVar.d = aslxVar3;
            aslpVar.c |= 1;
            aihf aihfVarCreateBuilder8 = aslxVar.createBuilder();
            aihf aihfVarCreateBuilder9 = asonVar.createBuilder();
            aihfVarCreateBuilder9.copyOnWrite();
            ason asonVar8 = (ason) aihfVarCreateBuilder9.instance;
            asonVar8.b |= 1;
            asonVar8.c = width / f3;
            aihfVarCreateBuilder9.copyOnWrite();
            ason asonVar9 = (ason) aihfVarCreateBuilder9.instance;
            asonVar9.b |= 2;
            asonVar9.d = height / f3;
            ason asonVar10 = (ason) aihfVarCreateBuilder9.build();
            aihfVarCreateBuilder8.copyOnWrite();
            aslx aslxVar4 = (aslx) aihfVarCreateBuilder8.instance;
            asonVar10.getClass();
            aslxVar4.c = asonVar10;
            aslxVar4.b |= 1;
            aslx aslxVar5 = (aslx) aihfVarCreateBuilder8.build();
            aihfVarCreateBuilder5.copyOnWrite();
            aslp aslpVar2 = (aslp) aihfVarCreateBuilder5.instance;
            aslxVar5.getClass();
            aslpVar2.e = aslxVar5;
            aslpVar2.c |= 2;
            aihf aihfVarCreateBuilder10 = aslxVar.createBuilder();
            aihf aihfVarCreateBuilder11 = asonVar.createBuilder();
            float fWidth = rect.width() / f3;
            aihfVarCreateBuilder11.copyOnWrite();
            ason asonVar11 = (ason) aihfVarCreateBuilder11.instance;
            asonVar11.b |= 1;
            asonVar11.c = fWidth;
            float fHeight = rect.height() / f3;
            aihfVarCreateBuilder11.copyOnWrite();
            ason asonVar12 = (ason) aihfVarCreateBuilder11.instance;
            asonVar12.b |= 2;
            asonVar12.d = fHeight;
            ason asonVar13 = (ason) aihfVarCreateBuilder11.build();
            aihfVarCreateBuilder10.copyOnWrite();
            aslx aslxVar6 = (aslx) aihfVarCreateBuilder10.instance;
            asonVar13.getClass();
            aslxVar6.c = asonVar13;
            aslxVar6.b |= 1;
            aslx aslxVar7 = (aslx) aihfVarCreateBuilder10.build();
            aihfVarCreateBuilder5.copyOnWrite();
            aslp aslpVar3 = (aslp) aihfVarCreateBuilder5.instance;
            aslxVar7.getClass();
            aslpVar3.f = aslxVar7;
            aslpVar3.c |= 4;
            aslp aslpVar4 = (aslp) aihfVarCreateBuilder5.build();
            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = nrtVar.e;
            aihh aihhVar = senderStateOuterClass$SenderState != null ? (aihh) senderStateOuterClass$SenderState.toBuilder() : (aihh) SenderStateOuterClass$SenderState.a.createBuilder();
            aihhVar.e(aslk.b, (aslk) aihfVarCreateBuilder.build());
            aihhVar.e(aslp.b, aslpVar4);
            nrtVar.e = (SenderStateOuterClass$SenderState) aihhVar.build();
        }
        return nrtVar;
    }

    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        this.c = i;
        this.d = i2;
    }
}
