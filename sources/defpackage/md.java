package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class md extends qa {
    final /* synthetic */ mf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md(mf mfVar) {
        super((byte[]) null);
        this.a = mfVar;
    }

    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        mf mfVar = this.a;
        int iComputeVerticalScrollRange = mfVar.l.computeVerticalScrollRange();
        int i3 = mfVar.k;
        mfVar.m = iComputeVerticalScrollRange - i3 > 0 && i3 >= mfVar.a;
        int iComputeHorizontalScrollRange = mfVar.l.computeHorizontalScrollRange();
        int i4 = mfVar.j;
        boolean z = iComputeHorizontalScrollRange - i4 > 0 && i4 >= mfVar.a;
        mfVar.n = z;
        if (mfVar.m) {
            float f = i3;
            mfVar.e = (int) ((f * (iComputeVerticalScrollOffset + (f / 2.0f))) / iComputeVerticalScrollRange);
            mfVar.d = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        } else if (!z) {
            if (mfVar.o != 0) {
                mfVar.i(0);
                return;
            }
            return;
        }
        if (mfVar.n) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i4;
            mfVar.h = (int) ((f3 * (f2 + (f3 / 2.0f))) / iComputeHorizontalScrollRange);
            mfVar.g = Math.min(i4, (i4 * i4) / iComputeHorizontalScrollRange);
        }
        int i5 = mfVar.o;
        if (i5 == 0 || i5 == 1) {
            mfVar.i(1);
        }
    }
}
