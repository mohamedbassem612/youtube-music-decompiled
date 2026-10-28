package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mmd implements ViewGroup.OnHierarchyChangeListener {
    final /* synthetic */ mme a;

    public mmd(mme mmeVar) {
        this.a = mmeVar;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        mmf mmfVar = this.a.e;
        synchronized (mmfVar) {
            if (mmfVar.l(view) && (view instanceof ViewGroup)) {
                mmfVar.g((ViewGroup) view);
                mmfVar.h(view);
            }
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        mme mmeVar = this.a;
        mmf mmfVar = mmeVar.e;
        synchronized (mmfVar) {
            view2.removeOnLayoutChangeListener(mmeVar.a);
            if (mmfVar.l(view) && (view instanceof ViewGroup)) {
                mmfVar.g((ViewGroup) view);
                mmfVar.h(view);
            }
        }
    }
}
