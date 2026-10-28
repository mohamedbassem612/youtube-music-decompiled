package defpackage;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fen implements ViewTreeObserver.OnPreDrawListener {
    private final WeakReference a;

    public fen(afwv afwvVar) {
        this.a = new WeakReference(afwvVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        afwv afwvVar = (afwv) this.a.get();
        if (afwvVar == null) {
            return true;
        }
        ?? r0 = afwvVar.a;
        if (r0.isEmpty()) {
            return true;
        }
        int iK = afwvVar.k();
        int iJ = afwvVar.j();
        if (!afwv.m(iK, iJ)) {
            return true;
        }
        ArrayList arrayList = new ArrayList((Collection) r0);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((fed) arrayList.get(i)).d(iK, iJ);
        }
        afwvVar.l();
        return true;
    }
}
