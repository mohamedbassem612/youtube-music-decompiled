package defpackage;

import android.view.View;
import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ftq extends fqk {
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
        return ndVar.d(view) - ndVar.j();
    }

    private static final View m(np npVar, nd ndVar) {
        int childCount = npVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
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
        View childAt2 = npVar.getChildAt(childCount - 1);
        if (npVar.getPosition(childAt2) == npVar.getItemCount() - 1) {
            return Math.abs(ndVar.a(childAt2) - ndVar.f()) < i ? childAt2 : view;
        }
        return view;
    }

    @Override // defpackage.mu, defpackage.oq
    public final View b(np npVar) {
        if (npVar.canScrollVertically()) {
            return m(npVar, k(npVar));
        }
        if (npVar.canScrollHorizontally()) {
            return m(npVar, j(npVar));
        }
        return null;
    }

    @Override // defpackage.mu, defpackage.oq
    public final int[] c(np npVar, View view) {
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
}
