package defpackage;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class feh implements ViewTreeObserver.OnPreDrawListener {
    private final WeakReference a;

    public feh(ahto ahtoVar) {
        this.a = new WeakReference(ahtoVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ahto ahtoVar = (ahto) this.a.get();
        if (ahtoVar == null) {
            return true;
        }
        ?? r0 = ahtoVar.b;
        if (r0.isEmpty()) {
            return true;
        }
        int iP = ahtoVar.p();
        int iO = ahtoVar.o();
        if (!ahto.r(iP, iO)) {
            return true;
        }
        ArrayList arrayList = new ArrayList((Collection) r0);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((fed) arrayList.get(i)).d(iP, iO);
        }
        ahtoVar.q();
        return true;
    }
}
