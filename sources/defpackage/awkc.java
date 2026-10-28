package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awkc {
    public final Object[] a;
    Object[] b;
    int c;

    public awkc() {
        Object[] objArr = new Object[5];
        this.a = objArr;
        this.b = objArr;
    }

    public final void a(Object obj) {
        int i = this.c;
        if (i == 4) {
            Object[] objArr = new Object[5];
            this.b[4] = objArr;
            this.b = objArr;
            i = 0;
        }
        this.b[i] = obj;
        this.c = i + 1;
    }

    public final void b(awkb awkbVar) {
        Object obj;
        for (Object[] objArr = this.a; objArr != null; objArr = objArr[4]) {
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (awkbVar.a(obj)) {
                    return;
                }
            }
        }
    }

    public final void c(Object obj) {
        this.a[0] = obj;
    }

    public final boolean d(axsp axspVar) {
        Object obj;
        Object[] objArr = this.a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (obj == awkl.COMPLETE) {
                    axspVar.kn();
                } else if (obj instanceof awkj) {
                    axspVar.b(((awkj) obj).a);
                } else {
                    if (obj instanceof awkk) {
                        axspVar.e(((awkk) obj).a);
                    } else {
                        axspVar.kk(obj);
                    }
                }
                return true;
            }
            objArr = objArr[4];
        }
    }
}
