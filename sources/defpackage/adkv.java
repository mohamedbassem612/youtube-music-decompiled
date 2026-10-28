package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class adkv {
    private final Context a;
    private final admh b;
    private final Queue c;
    private final Queue d;

    public adkv(Context context, admh admhVar) {
        context.getClass();
        this.a = context;
        admhVar.getClass();
        this.b = admhVar;
        this.c = new LinkedList();
        this.d = new LinkedList();
    }

    protected abstract ViewGroup a(Context context);

    public final adly b(adly adlyVar) {
        adly adlyVar2 = (adly) this.d.poll();
        if (adlyVar2 == null) {
            return new adly(adlyVar);
        }
        adlyVar2.i(adlyVar);
        return adlyVar2;
    }

    public final void c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) childAt;
                View childAt2 = viewGroup2.getChildAt(0);
                if (childAt2 != null) {
                    viewGroup2.removeAllViews();
                    adly adlyVarC = adul.c(childAt2);
                    if (adlyVarC != null) {
                        adlyVarC.h();
                        this.d.add(adlyVarC);
                        adul.i(childAt2, null);
                    }
                    this.b.e(childAt2);
                }
                this.c.add(viewGroup2);
            }
        }
        viewGroup.removeAllViews();
    }

    public final View d(adly adlyVar, Object obj, ViewGroup viewGroup) {
        View view;
        ViewGroup viewGroupA = (ViewGroup) this.c.poll();
        if (viewGroupA == null) {
            viewGroupA = a(this.a);
        }
        if (obj != null) {
            admh admhVar = this.b;
            int iA = admhVar.a(obj);
            adma admaVarC = admhVar.c(iA, viewGroup);
            if (admaVarC == null) {
                view = null;
            } else {
                admaVarC.hU(adlyVar, obj);
                View viewA = admaVarC.a();
                adul.j(viewA, admaVarC, iA);
                adul.i(viewA, adlyVar);
                view = viewA;
            }
            if (view != null) {
                viewGroupA.addView(view, -1, -2);
            }
        }
        return viewGroupA;
    }
}
