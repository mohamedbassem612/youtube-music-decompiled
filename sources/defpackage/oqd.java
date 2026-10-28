package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
abstract class oqd implements oqz {
    protected final float a;
    protected final float b;
    private RecyclerView c = null;
    private final int d;

    public oqd(int i, float f, float f2) {
        this.d = i;
        this.a = f;
        this.b = f2;
    }

    protected abstract LinearLayoutManager a(Context context);

    @Override // defpackage.oqz
    public final np b(Context context, RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.c;
        if (recyclerView2 == recyclerView) {
            return a(context);
        }
        if (recyclerView2 != null) {
            d(recyclerView2);
        }
        this.c = recyclerView;
        LinearLayoutManager linearLayoutManagerA = a(context);
        recyclerView.ah(linearLayoutManagerA);
        return linearLayoutManagerA;
    }

    @Override // defpackage.oqz
    public final mqs c(Context context) {
        int iFindFirstVisibleItemPosition;
        int i;
        int decoratedTop;
        int paddingTop;
        LinearLayoutManager linearLayoutManagerA = a(context);
        if (linearLayoutManagerA.findFirstCompletelyVisibleItemPosition() == 0 || linearLayoutManagerA.getItemCount() == 0 || (iFindFirstVisibleItemPosition = linearLayoutManagerA.findFirstVisibleItemPosition()) == -1) {
            return null;
        }
        View viewFindViewByPosition = linearLayoutManagerA.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition != null) {
            if (f()) {
                decoratedTop = linearLayoutManagerA.getDecoratedLeft(viewFindViewByPosition);
                paddingTop = linearLayoutManagerA.getPaddingLeft();
            } else {
                decoratedTop = linearLayoutManagerA.getDecoratedTop(viewFindViewByPosition);
                paddingTop = linearLayoutManagerA.getPaddingTop();
            }
            i = decoratedTop - paddingTop;
        } else {
            i = 0;
        }
        aihf aihfVarCreateBuilder = mqs.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        mqs mqsVar = (mqs) aihfVarCreateBuilder.instance;
        mqsVar.c |= 1;
        mqsVar.d = iFindFirstVisibleItemPosition;
        aihfVarCreateBuilder.copyOnWrite();
        mqs mqsVar2 = (mqs) aihfVarCreateBuilder.instance;
        mqsVar2.c |= 2;
        mqsVar2.e = i;
        return (mqs) aihfVarCreateBuilder.build();
    }

    @Override // defpackage.oqz
    public final void d(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.c;
        if (recyclerView2 == recyclerView) {
            recyclerView2.ah(null);
            this.c = null;
        }
    }

    @Override // defpackage.oqz
    public final void e(mqs mqsVar, Context context) {
        a(context).scrollToPositionWithOffset(mqsVar.d, mqsVar.e);
    }

    @Override // defpackage.oqz
    public final boolean f() {
        return this.d == 2;
    }

    @Override // defpackage.oqz
    public boolean g(oqz oqzVar) {
        if (this == oqzVar) {
            return true;
        }
        if (oqzVar != null && getClass() == oqzVar.getClass()) {
            oqd oqdVar = (oqd) oqzVar;
            if (f() == oqdVar.f() && this.a == oqdVar.a && this.b == oqdVar.b && i() == oqdVar.i() && h() == oqdVar.h()) {
                return true;
            }
        }
        return false;
    }
}
