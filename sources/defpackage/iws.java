package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iws extends RecyclerView implements twn {
    public final xgn ae;
    public final agex af;
    private final RecyclerView ag;
    private final iwr ah;
    private Object ai;
    private final admu aj;

    public iws(Context context, RecyclerView recyclerView, ahek ahekVar, admh admhVar, xgn xgnVar, agex agexVar) {
        super(context);
        recyclerView.getClass();
        this.ag = recyclerView;
        xgnVar.getClass();
        this.ae = xgnVar;
        this.af = agexVar;
        admhVar.getClass();
        admo admoVarD = ahekVar.d(admhVar);
        admoVarD.jR(new gob(this, 10));
        admu admuVar = new admu();
        this.aj = admuVar;
        admoVarD.D(admuVar, null);
        ah(new LinearLayoutManager(getContext()));
        af(null);
        setOverScrollMode(2);
        ad(admoVarD);
        ahno.O(recyclerView.m instanceof admc);
        this.ah = new iwr(this, recyclerView);
        recyclerView.aC(new iwq(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        int childCount;
        View childAt;
        RecyclerView recyclerView = this.ag;
        np npVar = recyclerView.n;
        nh nhVar = recyclerView.m;
        if (nhVar == 0 || nhVar.a() == 0 || npVar == null || (childCount = npVar.getChildCount()) == 0 || (childAt = npVar.getChildAt(0)) == null) {
            return;
        }
        int position = npVar.getPosition(childAt);
        iwr iwrVar = this.ah;
        if (position < iwrVar.m() || ((position == iwrVar.m() && recyclerView.getChildAt(0).getTop() >= 0) || iwrVar.m() < 0)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        int[] iArr = {-1, -1};
        Iterator it = iwrVar.a.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (iIntValue > position) {
                if (iIntValue > childCount + position) {
                    break;
                }
                iArr[1] = iIntValue;
                break;
            }
            Arrays.fill(iArr, iIntValue);
        }
        int i = iArr[0];
        if (i >= 0) {
            Object item = ((admc) nhVar).getItem(i);
            if (this.ai != item) {
                admu admuVar = this.aj;
                admuVar.clear();
                admuVar.add(item);
                this.ai = item;
            }
            int i2 = iArr[0];
            int i3 = iArr[1];
            if (i2 == i3) {
                setTranslationY(0.0f);
                return;
            }
            View childAt2 = recyclerView.getChildAt(i3 - position);
            int measuredHeight = getMeasuredHeight();
            int top = childAt2 != null ? childAt2.getTop() : measuredHeight;
            setTranslationY(top <= measuredHeight ? top - measuredHeight : 0.0f);
        }
    }

    @Override // defpackage.twn
    public final void i() {
        ad(null);
        aI(null);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            a();
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}
