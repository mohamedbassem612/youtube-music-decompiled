package j$.nio.file;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a0 {
    public static final j$.desugar.sun.nio.fs.h a;

    static {
        j$.nio.file.attribute.p0 p0Var = j$.nio.file.attribute.p0.OWNER_READ;
        j$.nio.file.attribute.p0 p0Var2 = j$.nio.file.attribute.p0.OWNER_WRITE;
        HashSet hashSet = new HashSet(EnumSet.of(p0Var, p0Var2));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((j$.nio.file.attribute.p0) it.next()).getClass();
        }
        new j$.desugar.sun.nio.fs.h((byte) 2, hashSet);
        HashSet hashSet2 = new HashSet(EnumSet.of(p0Var, p0Var2, j$.nio.file.attribute.p0.OWNER_EXECUTE));
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            ((j$.nio.file.attribute.p0) it2.next()).getClass();
        }
        a = new j$.desugar.sun.nio.fs.h((byte) 2, hashSet2);
    }
}
