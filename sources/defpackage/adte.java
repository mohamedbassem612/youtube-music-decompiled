package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class adte implements ViewGroup.OnHierarchyChangeListener {
    private final ViewGroup.OnHierarchyChangeListener a;
    private final agex b;

    public adte(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener, agex agexVar) {
        this.a = onHierarchyChangeListener;
        this.b = agexVar;
    }

    private final void a(View view, View view2) {
        this.a.onChildViewAdded(view, view2);
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            viewGroup.setOnHierarchyChangeListener(this);
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                a(viewGroup, viewGroup.getChildAt(i));
            }
        }
    }

    private final void b(View view, View view2) {
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                b(viewGroup, viewGroup.getChildAt(i));
            }
            viewGroup.setOnHierarchyChangeListener(null);
        }
        this.a.onChildViewRemoved(view, view2);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        if (this.b.a(view2)) {
            a(view, view2);
        } else {
            this.a.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        if (this.b.a(view2)) {
            b(view, view2);
        } else {
            this.a.onChildViewRemoved(view, view2);
        }
    }
}
