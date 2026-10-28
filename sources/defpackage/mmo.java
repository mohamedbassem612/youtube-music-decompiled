package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mmo implements nru {
    private final float a;
    private final int b;

    public mmo(Context context, nee neeVar) {
        this.a = context.getResources().getDisplayMetrics().density;
        this.b = neeVar.w();
    }

    @Override // defpackage.nru
    public final nrt a(nrt nrtVar) {
        View childAt;
        asob asobVar;
        View view = nrtVar.a().b;
        if (this.b - 1 != 2) {
            if (view instanceof HorizontalScrollView) {
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) view;
                childAt = horizontalScrollView.getChildAt(0);
                aihf aihfVarCreateBuilder = asob.a.createBuilder();
                float scrollX = horizontalScrollView.getScrollX();
                float f = this.a;
                aihfVarCreateBuilder.copyOnWrite();
                asob asobVar2 = (asob) aihfVarCreateBuilder.instance;
                asobVar2.b |= 1;
                asobVar2.c = scrollX / f;
                float scrollY = horizontalScrollView.getScrollY();
                aihfVarCreateBuilder.copyOnWrite();
                asob asobVar3 = (asob) aihfVarCreateBuilder.instance;
                asobVar3.b |= 2;
                asobVar3.d = scrollY / f;
                asobVar = (asob) aihfVarCreateBuilder.build();
                aihf aihfVarCreateBuilder2 = ason.a.createBuilder();
                float measuredHeight = childAt.getMeasuredHeight();
                float f2 = this.a;
                aihfVarCreateBuilder2.copyOnWrite();
                ason asonVar = (ason) aihfVarCreateBuilder2.instance;
                asonVar.b |= 2;
                asonVar.d = measuredHeight / f2;
                float measuredWidth = childAt.getMeasuredWidth();
                aihfVarCreateBuilder2.copyOnWrite();
                ason asonVar2 = (ason) aihfVarCreateBuilder2.instance;
                asonVar2.b |= 1;
                asonVar2.c = measuredWidth / f2;
                ket.O(nrtVar, view, asobVar, (ason) aihfVarCreateBuilder2.build(), f2);
            }
        } else if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            childAt = nestedScrollView.getChildAt(0);
            aihf aihfVarCreateBuilder3 = asob.a.createBuilder();
            float scrollX2 = nestedScrollView.getScrollX();
            float f3 = this.a;
            aihfVarCreateBuilder3.copyOnWrite();
            asob asobVar4 = (asob) aihfVarCreateBuilder3.instance;
            asobVar4.b |= 1;
            asobVar4.c = scrollX2 / f3;
            float scrollY2 = nestedScrollView.getScrollY();
            aihfVarCreateBuilder3.copyOnWrite();
            asob asobVar5 = (asob) aihfVarCreateBuilder3.instance;
            asobVar5.b |= 2;
            asobVar5.d = scrollY2 / f3;
            asobVar = (asob) aihfVarCreateBuilder3.build();
            aihf aihfVarCreateBuilder4 = ason.a.createBuilder();
            float measuredHeight2 = childAt.getMeasuredHeight();
            float f4 = this.a;
            aihfVarCreateBuilder4.copyOnWrite();
            ason asonVar3 = (ason) aihfVarCreateBuilder4.instance;
            asonVar3.b |= 2;
            asonVar3.d = measuredHeight2 / f4;
            float measuredWidth2 = childAt.getMeasuredWidth();
            aihfVarCreateBuilder4.copyOnWrite();
            ason asonVar4 = (ason) aihfVarCreateBuilder4.instance;
            asonVar4.b |= 1;
            asonVar4.c = measuredWidth2 / f4;
            ket.O(nrtVar, view, asobVar, (ason) aihfVarCreateBuilder4.build(), f4);
        }
        return nrtVar;
    }
}
