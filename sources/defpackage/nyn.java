package defpackage;

import com.google.android.libraries.elements.interfaces.PerformOnceCommandController;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nyn extends PerformOnceCommandController {
    private static final Set a = new HashSet();

    @Override // com.google.android.libraries.elements.interfaces.PerformOnceCommandController
    public final void clear() {
        Set set = a;
        synchronized (set) {
            set.clear();
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.PerformOnceCommandController
    public final boolean contains(String str) {
        boolean zContains;
        Set set = a;
        synchronized (set) {
            zContains = set.contains(str);
        }
        return zContains;
    }

    @Override // com.google.android.libraries.elements.interfaces.PerformOnceCommandController
    public final void insert(String str) {
        Set set = a;
        synchronized (set) {
            set.add(str);
        }
    }
}
