package j$.desugar.sun.nio.fs;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public HashSet a;
    public HashMap b;
    public boolean c;

    public final void a(Object obj, String str) {
        this.b.put(str, obj);
    }

    public final boolean b(String str) {
        return this.c || this.a.contains(str);
    }
}
