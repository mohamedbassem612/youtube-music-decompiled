package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fdh {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public final Set b = new HashSet();
    public boolean c;

    public final boolean a(fdx fdxVar) {
        boolean z = true;
        if (fdxVar != null) {
            Set set = this.a;
            Set set2 = this.b;
            boolean zRemove = set.remove(fdxVar);
            if (!set2.remove(fdxVar) && !zRemove) {
                z = false;
            }
            if (z) {
                fdxVar.c();
            }
        }
        return z;
    }

    public final String toString() {
        Set set = this.a;
        return super.toString() + "{numRequests=" + set.size() + ", isPaused=" + this.c + '}';
    }
}
