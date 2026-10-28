package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agpp implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;
    final int[] b;

    public agpp(agow agowVar) {
        agku agkuVar = (agku) agowVar;
        int size = agkuVar.j().size();
        this.a = new Object[size];
        this.b = new int[size];
        int i = 0;
        for (agox agoxVar : agkuVar.j()) {
            this.a[i] = agoxVar.a;
            this.b[i] = agoxVar.a();
            i++;
        }
    }

    Object readResolve() {
        Object[] objArr = this.a;
        agkr agkrVar = new agkr(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            agkrVar.d(objArr[i], this.b[i]);
        }
        return agkrVar.a();
    }
}
