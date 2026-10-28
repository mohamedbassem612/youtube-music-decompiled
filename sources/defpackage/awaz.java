package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awaz extends AtomicReference implements avlw {
    private static final long serialVersionUID = -4823716997131257941L;
    final awba a;
    final int b;

    public awaz(awba awbaVar, int i) {
        this.a = awbaVar;
        this.b = i;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        awba awbaVar = this.a;
        if (!awkh.e(awbaVar.h, th)) {
            atqp.n(th);
        } else {
            awbaVar.a();
            awbaVar.c();
        }
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        avnr.d(this, avmnVar);
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        boolean z;
        int i = this.b;
        awba awbaVar = this.a;
        synchronized (awbaVar) {
            Object[] objArr = awbaVar.d;
            if (objArr == null) {
                return;
            }
            Object obj2 = objArr[i];
            int i2 = awbaVar.i;
            if (obj2 == null) {
                i2++;
                awbaVar.i = i2;
            }
            objArr[i] = obj;
            if (i2 == objArr.length) {
                awbaVar.e.j((Object[]) objArr.clone());
                z = true;
            } else {
                z = false;
            }
            if (z) {
                awbaVar.c();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001d A[Catch: all -> 0x002b, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x000b, B:13:0x0015, B:16:0x001f, B:15:0x001d), top: B:25:0x0005 }] */
    @Override // defpackage.avlw
    public final void kn() {
        int i = this.b;
        awba awbaVar = this.a;
        synchronized (awbaVar) {
            Object[] objArr = awbaVar.d;
            if (objArr == null) {
                return;
            }
            boolean z = objArr[i] == null;
            if (z) {
                awbaVar.g = true;
            } else {
                int i2 = awbaVar.j + 1;
                awbaVar.j = i2;
                if (i2 == objArr.length) {
                    awbaVar.g = true;
                }
            }
            if (z) {
                awbaVar.a();
            }
            awbaVar.c();
        }
    }
}
