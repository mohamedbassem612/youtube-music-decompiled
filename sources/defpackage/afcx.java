package defpackage;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afcx {
    public int a;
    public boolean b;
    public final Object c;

    public afcx(int i, avgj avgjVar) {
        this.c = new WeakReference(avgjVar);
        this.a = i;
    }

    final boolean a(avgj avgjVar) {
        return avgjVar != null && ((WeakReference) this.c).get() == avgjVar;
    }

    public afcx(FloatingActionButton floatingActionButton) {
        this.b = false;
        this.a = 0;
        this.c = floatingActionButton;
    }
}
