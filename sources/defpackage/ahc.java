package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahc {
    public static final Object a = new Object();

    public static final Object a(ahb ahbVar, int i) {
        Object obj;
        int iA = ahe.a(ahbVar.b, ahbVar.d, i);
        if (iA < 0 || (obj = ahbVar.c[iA]) == a) {
            return null;
        }
        return obj;
    }

    public static final void b(ahb ahbVar, int i) {
        int iA = ahe.a(ahbVar.b, ahbVar.d, i);
        if (iA >= 0) {
            Object[] objArr = ahbVar.c;
            Object obj = objArr[iA];
            Object obj2 = a;
            if (obj != obj2) {
                objArr[iA] = obj2;
                ahbVar.a = true;
            }
        }
    }

    public static final void c(ahb ahbVar) {
        int i = ahbVar.d;
        int[] iArr = ahbVar.b;
        Object[] objArr = ahbVar.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        ahbVar.a = false;
        ahbVar.d = i2;
    }
}
