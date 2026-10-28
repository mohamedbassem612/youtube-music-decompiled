package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: do, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0027do {
    public static final dv a = new du();
    public static final dv b;

    static {
        dv dvVar = null;
        try {
            Class<?> cls = Class.forName("drt");
            cls.getClass();
            dvVar = (dv) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = dvVar;
    }

    public static final void a(cc ccVar, cc ccVar2, boolean z, afv afvVar, boolean z2) {
        if ((z ? ccVar2.getEnterTransitionCallback() : ccVar.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList(afvVar.d);
            Iterator it = afvVar.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((View) ((Map.Entry) it.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList(afvVar.d);
            Iterator it2 = afvVar.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getKey());
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public static final void b(List list, int i) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
