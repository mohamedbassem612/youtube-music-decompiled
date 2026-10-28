package defpackage;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class nf extends oq {
    private nd b;
    private nd c;

    private final nd j(np npVar) {
        nd ndVar = this.c;
        if (ndVar == null || ndVar.a != npVar) {
            this.c = new nb(npVar);
        }
        return this.c;
    }

    private final nd k(np npVar) {
        nd ndVar = this.b;
        if (ndVar == null || ndVar.a != npVar) {
            this.b = new nc(npVar);
        }
        return this.b;
    }

    private static final int l(View view, nd ndVar) {
        return (ndVar.d(view) + (ndVar.b(view) / 2)) - (ndVar.j() + (ndVar.k() / 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oq
    public int a(np npVar, int i, int i2) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = npVar.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        View view = null;
        nd ndVarK = npVar.canScrollVertically() ? k(npVar) : npVar.canScrollHorizontally() ? j(npVar) : null;
        if (ndVarK == null) {
            return -1;
        }
        int childCount = npVar.getChildCount();
        boolean z = false;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        View view2 = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = npVar.getChildAt(i5);
            if (childAt != null) {
                int iL = l(childAt, ndVarK);
                if (iL <= 0 && iL > i3) {
                    view2 = childAt;
                    i3 = iL;
                }
                if (iL >= 0 && iL < i4) {
                    view = childAt;
                    i4 = iL;
                }
            }
        }
        if (true != npVar.canScrollHorizontally()) {
            i = i2;
        }
        boolean z2 = i > 0;
        if (z2) {
            if (view != null) {
                return npVar.getPosition(view);
            }
        } else if (view2 != null) {
            return npVar.getPosition(view2);
        }
        if (true == z2) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = npVar.getPosition(view);
        int itemCount2 = npVar.getItemCount();
        if ((npVar instanceof oc) && (pointFComputeScrollVectorForPosition = ((oc) npVar).computeScrollVectorForPosition(itemCount2 - 1)) != null && (pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f)) {
            z = true;
        }
        int i6 = position + (z == z2 ? -1 : 1);
        if (i6 < 0 || i6 >= itemCount) {
            return -1;
        }
        return i6;
    }

    @Override // defpackage.oq
    public View b(np npVar) {
        if (npVar.canScrollVertically()) {
            return kc.a(npVar, k(npVar));
        }
        if (npVar.canScrollHorizontally()) {
            return kc.a(npVar, j(npVar));
        }
        return null;
    }

    @Override // defpackage.oq
    public int[] c(np npVar, View view) {
        int[] iArr = new int[2];
        if (npVar.canScrollHorizontally()) {
            iArr[0] = l(view, j(npVar));
        } else {
            iArr[0] = 0;
        }
        if (npVar.canScrollVertically()) {
            iArr[1] = l(view, k(npVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // defpackage.oq
    protected od d(np npVar) {
        if (npVar instanceof oc) {
            return new ne(this, this.a.getContext());
        }
        return null;
    }
}
