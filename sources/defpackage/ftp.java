package defpackage;

import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ftp extends oq {
    public RecyclerView b;
    private nd c;
    private nd d;
    private np e;
    private np f;
    private final int g;

    public ftp(int i) {
        this.g = i;
    }

    private final nd j(np npVar) {
        if (this.d == null || this.f != npVar) {
            this.d = new nb(npVar);
            this.f = npVar;
        }
        return this.d;
    }

    private final nd k(np npVar) {
        if (this.c == null || this.e != npVar) {
            this.c = new nc(npVar);
            this.e = npVar;
        }
        return this.c;
    }

    private static View l(np npVar, nd ndVar) {
        int childCount = npVar.getChildCount();
        View view = null;
        if (childCount != 0) {
            int iJ = ndVar.j();
            int i = Alert.DURATION_SHOW_INDEFINITELY;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = npVar.getChildAt(i2);
                int iAbs = Math.abs(ndVar.d(childAt) - iJ);
                if (iAbs < i) {
                    view = childAt;
                    i = iAbs;
                }
            }
        }
        return view;
    }

    private static final int m(View view, nd ndVar) {
        return ndVar.d(view) - ndVar.j();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oq
    public final int a(np npVar, int i, int i2) {
        int position;
        int itemCount = npVar.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        boolean zCanScrollHorizontally = npVar.canScrollHorizontally();
        nd ndVarJ = zCanScrollHorizontally ? j(npVar) : k(npVar);
        int childCount = npVar.getChildCount();
        View view = null;
        if (childCount != 0) {
            int iJ = ndVarJ.j();
            int i3 = Alert.DURATION_SHOW_INDEFINITELY;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = npVar.getChildAt(i4);
                int iD = ndVarJ.d(childAt);
                int iAbs = Math.abs(iD - iJ);
                if (iD < iJ && iAbs < i3) {
                    view = childAt;
                    i3 = iAbs;
                }
            }
        }
        if (view == null || (position = npVar.getPosition(view)) == -1) {
            return -1;
        }
        boolean z = true;
        int i5 = true == zCanScrollHorizontally ? i : i2;
        if (npVar instanceof oc) {
            PointF pointFComputeScrollVectorForPosition = ((oc) npVar).computeScrollVectorForPosition(itemCount - 1);
            if (pointFComputeScrollVectorForPosition == null || (pointFComputeScrollVectorForPosition.x >= 0.0f && pointFComputeScrollVectorForPosition.y >= 0.0f)) {
                z = false;
            }
        } else {
            z = false;
        }
        if (i5 > 0) {
            int i6 = this.g;
            position = z ? position - i6 : position + i6;
        }
        int i7 = position >= 0 ? position : 0;
        return i7 >= itemCount ? (-1) + itemCount : i7;
    }

    @Override // defpackage.oq
    public final View b(np npVar) {
        if (npVar.canScrollVertically()) {
            return l(npVar, k(npVar));
        }
        if (npVar.canScrollHorizontally()) {
            return l(npVar, j(npVar));
        }
        return null;
    }

    @Override // defpackage.oq
    public final int[] c(np npVar, View view) {
        if (fhz.ax(npVar, this.b)) {
            return new int[]{0, 0};
        }
        int[] iArr = new int[2];
        if (npVar.canScrollHorizontally()) {
            iArr[0] = m(view, j(npVar));
        } else {
            iArr[0] = 0;
        }
        if (npVar.canScrollVertically()) {
            iArr[1] = m(view, k(npVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // defpackage.oq
    public final void f(RecyclerView recyclerView) {
        this.b = recyclerView;
        super.f(recyclerView);
    }

    @Override // defpackage.oq
    protected final od i(np npVar) {
        if (npVar instanceof oc) {
            return new fto(this, this.b.getContext());
        }
        return null;
    }
}
