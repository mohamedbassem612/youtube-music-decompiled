package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mme {
    final View.OnLayoutChangeListener a = new jfx(this, 5);
    final View.OnScrollChangeListener b = new View.OnScrollChangeListener() { // from class: mmc
        @Override // android.view.View.OnScrollChangeListener
        public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
            mmf mmfVar = this.a.e;
            if (mmfVar.l(view)) {
                if (true != mmfVar.a) {
                    i = i2;
                }
                mmfVar.i(view, i);
            }
        }
    };
    final View.OnAttachStateChangeListener c = new jh(this, 2);
    final ViewGroup.OnHierarchyChangeListener d = new mmd(this);
    public final /* synthetic */ mmf e;

    public mme(mmf mmfVar) {
        this.e = mmfVar;
    }
}
