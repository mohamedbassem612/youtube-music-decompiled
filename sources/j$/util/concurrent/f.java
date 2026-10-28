package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class f extends j {
    public final j[] e;

    public f(j[] jVarArr) {
        super(-1, null, null);
        this.e = jVarArr;
    }

    @Override // j$.util.concurrent.j
    public final j a(int i, Object obj) {
        int length;
        j jVarK;
        Object obj2;
        while (true) {
            j[] jVarArr = this.e;
            if (jVarArr == null || (length = jVarArr.length) == 0 || (jVarK = ConcurrentHashMap.k(jVarArr, (length - 1) & i)) == null) {
                return null;
            }
            do {
                int i2 = jVarK.a;
                if (i2 == i && ((obj2 = jVarK.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return jVarK;
                }
                if (i2 >= 0) {
                    jVarK = jVarK.d;
                } else {
                    if (!(jVarK instanceof f)) {
                        return jVarK.a(i, obj);
                    }
                    this = (f) jVarK;
                }
            } while (jVarK != null);
            return null;
        }
    }
}
