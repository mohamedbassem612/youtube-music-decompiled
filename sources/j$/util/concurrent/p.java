package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class p extends j {
    public p e;
    public p f;
    public p g;
    public p h;
    public boolean i;

    public p(int i, Object obj, Object obj2, j jVar, p pVar) {
        super(i, obj, obj2, jVar);
        this.e = pVar;
    }

    @Override // j$.util.concurrent.j
    public final j a(int i, Object obj) {
        return b(i, obj, null);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0040 A[PHI: r7
      0x0040: PHI (r7v5 java.lang.Class) = (r7v4 java.lang.Class), (r7v6 java.lang.Class) binds: [B:24:0x003a, B:17:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x004a A[SYNTHETIC] */
    public final p b(int i, Object obj, Class cls) {
        p pVarB;
        if (obj != null) {
            do {
                p pVar = this.f;
                p pVar2 = this.g;
                int i2 = this.a;
                if (i2 > i) {
                    this = pVar;
                } else {
                    if (i2 >= i) {
                        Object obj2 = this.b;
                        if (obj2 == obj) {
                            return this;
                        }
                        if (obj2 != null && obj.equals(obj2)) {
                            return this;
                        }
                        if (pVar != null) {
                            if (pVar2 != null) {
                                if (cls == null && (cls = ConcurrentHashMap.c(obj)) == null) {
                                    pVarB = pVar2.b(i, obj, cls);
                                    if (pVarB != null) {
                                        return pVarB;
                                    }
                                } else {
                                    int i3 = ConcurrentHashMap.g;
                                    int iCompareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                                    if (iCompareTo == 0) {
                                        pVarB = pVar2.b(i, obj, cls);
                                        if (pVarB != null) {
                                            return pVarB;
                                        }
                                    } else if (iCompareTo >= 0) {
                                        pVar = pVar2;
                                    }
                                }
                            }
                            this = pVar;
                        }
                    }
                    this = pVar2;
                }
            } while (this != null);
        }
        return null;
    }
}
