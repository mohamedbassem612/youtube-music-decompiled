package defpackage;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class mu extends oq {
    private nd b;
    private nd c;

    private int j(np npVar, nd ndVar, int i, int i2) {
        int[] iArrH = h(i, i2);
        int childCount = npVar.getChildCount();
        float f = 1.0f;
        if (childCount != 0) {
            View view = null;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = npVar.getChildAt(i5);
                int position = npVar.getPosition(childAt);
                if (position != -1) {
                    if (position < i3) {
                        view = childAt;
                        i3 = position;
                    }
                    if (position > i4) {
                        view2 = childAt;
                        i4 = position;
                    }
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(ndVar.a(view), ndVar.a(view2)) - Math.min(ndVar.d(view), ndVar.d(view2));
                if (iMax != 0) {
                    f = iMax / ((i4 - i3) + 1);
                }
            }
        }
        if (f > 0.0f) {
            return Math.round(iArrH[Math.abs(iArrH[0]) > Math.abs(iArrH[1]) ? (char) 0 : (char) 1] / f);
        }
        return 0;
    }

    private nd k(np npVar) {
        nd ndVar = this.c;
        if (ndVar == null || ndVar.a != npVar) {
            this.c = new nb(npVar);
        }
        return this.c;
    }

    private nd l(np npVar) {
        nd ndVar = this.b;
        if (ndVar == null || ndVar.a != npVar) {
            this.b = new nc(npVar);
        }
        return this.b;
    }

    private static final int m(View view, nd ndVar) {
        return (ndVar.d(view) + (ndVar.b(view) / 2)) - (ndVar.j() + (ndVar.k() / 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oq
    public int a(np npVar, int i, int i2) {
        int itemCount;
        View viewB;
        int position;
        int i3;
        PointF pointFComputeScrollVectorForPosition;
        int iJ;
        int iJ2;
        if (!(npVar instanceof oc) || (itemCount = npVar.getItemCount()) == 0 || (viewB = b(npVar)) == null || (position = npVar.getPosition(viewB)) == -1 || (pointFComputeScrollVectorForPosition = ((oc) npVar).computeScrollVectorForPosition((i3 = itemCount - 1))) == null) {
            return -1;
        }
        if (npVar.canScrollHorizontally()) {
            iJ = j(npVar, k(npVar), i, 0);
            if (pointFComputeScrollVectorForPosition.x < 0.0f) {
                iJ = -iJ;
            }
        } else {
            iJ = 0;
        }
        if (npVar.canScrollVertically()) {
            iJ2 = j(npVar, l(npVar), 0, i2);
            if (pointFComputeScrollVectorForPosition.y < 0.0f) {
                iJ2 = -iJ2;
            }
        } else {
            iJ2 = 0;
        }
        if (true == npVar.canScrollVertically()) {
            iJ = iJ2;
        }
        if (iJ == 0) {
            return -1;
        }
        int i4 = position + iJ;
        int i5 = i4 < 0 ? 0 : i4;
        return i5 >= itemCount ? i3 : i5;
    }

    @Override // defpackage.oq
    public View b(np npVar) {
        if (npVar.canScrollVertically()) {
            return kc.a(npVar, l(npVar));
        }
        if (npVar.canScrollHorizontally()) {
            return kc.a(npVar, k(npVar));
        }
        return null;
    }

    @Override // defpackage.oq
    public int[] c(np npVar, View view) {
        int[] iArr = new int[2];
        if (npVar.canScrollHorizontally()) {
            iArr[0] = m(view, k(npVar));
        } else {
            iArr[0] = 0;
        }
        if (npVar.canScrollVertically()) {
            iArr[1] = m(view, l(npVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
