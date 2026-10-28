package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axcu {
    public static final axdy a = new axdy("CLOSED");

    public static final Object a(axcv axcvVar, long j, awqk awqkVar) {
        while (true) {
            long j2 = axcvVar.b;
            if (j2 >= j && !axcvVar.t()) {
                return axcvVar;
            }
            Object objL = axcvVar.l();
            axdy axdyVar = a;
            if (objL == axdyVar) {
                return axdyVar;
            }
            axcv axcvVar2 = (axcv) objL;
            if (axcvVar2 != null) {
                axcvVar = axcvVar2;
            } else {
                axcv axcvVar3 = (axcv) awqkVar.invoke(Long.valueOf(j2 + 1), axcvVar);
                if (axcvVar.a.d(null, axcvVar3)) {
                    if (axcvVar.t()) {
                        axcvVar.p();
                    }
                    axcvVar = axcvVar3;
                }
            }
        }
    }
}
