package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dse {
    private static final dsa b = new dsi(null);
    private static final ThreadLocal c = new ThreadLocal();
    static final ArrayList a = new ArrayList();

    static afv a() {
        afv afvVar;
        ThreadLocal threadLocal = c;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (afvVar = (afv) weakReference.get()) != null) {
            return afvVar;
        }
        afv afvVar2 = new afv();
        threadLocal.set(new WeakReference(afvVar2));
        return afvVar2;
    }

    public static void b(ViewGroup viewGroup, dsa dsaVar) {
        ArrayList arrayList = a;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (dsaVar == null) {
            dsaVar = b;
        }
        dsa dsaVarClone = dsaVar.clone();
        d(viewGroup, dsaVarClone);
        viewGroup.setTag(R.id.transition_current_scene, null);
        c(viewGroup, dsaVarClone);
    }

    public static void c(ViewGroup viewGroup, dsa dsaVar) {
        if (dsaVar == null || viewGroup == null) {
            return;
        }
        dsd dsdVar = new dsd(dsaVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(dsdVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(dsdVar);
    }

    public static void d(ViewGroup viewGroup, dsa dsaVar) {
        ArrayList arrayList = (ArrayList) a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((dsa) arrayList.get(i)).t(viewGroup);
            }
        }
        if (dsaVar != null) {
            dsaVar.p(viewGroup, true);
        }
        if (((wg) viewGroup.getTag(R.id.transition_current_scene)) != null) {
            throw null;
        }
    }
}
