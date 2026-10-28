package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class axai implements awvk {
    public final axak a;
    public final long b;
    public final Object c;
    public final awoq d;

    public axai(axak axakVar, long j, Object obj, awoq awoqVar) {
        this.a = axakVar;
        this.b = j;
        this.c = obj;
        this.d = awoqVar;
    }

    @Override // defpackage.awvk
    public final void kv() {
        axak axakVar = this.a;
        synchronized (axakVar) {
            long j = this.b;
            if (j >= axakVar.d()) {
                Object[] objArr = axakVar.a;
                objArr.getClass();
                if (axal.a(objArr, j) == this) {
                    axal.b(objArr, j, axal.a);
                    axakVar.h();
                }
            }
        }
    }
}
