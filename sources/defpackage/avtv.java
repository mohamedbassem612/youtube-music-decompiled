package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avtv extends avtx {
    private static final long serialVersionUID = 2587302975077663557L;
    final avok a;

    public avtv(avok avokVar, Object[] objArr) {
        super(objArr);
        this.a = avokVar;
    }

    @Override // defpackage.avtx
    public final void d() {
        Object[] objArr = this.b;
        int length = objArr.length;
        int i = this.c;
        while (true) {
            avok avokVar = this.a;
            boolean z = this.d;
            if (i == length) {
                if (z) {
                    return;
                }
                avokVar.kn();
                return;
            } else {
                if (z) {
                    return;
                }
                Object obj = objArr[i];
                if (obj == null) {
                    avokVar.b(new NullPointerException(a.bP(i, "The element at index ", " is null")));
                    return;
                } else {
                    avokVar.d(obj);
                    i++;
                }
            }
        }
    }

    @Override // defpackage.avtx
    public final void f(long j) {
        Object[] objArr = this.b;
        int length = objArr.length;
        int i = this.c;
        do {
            long j2 = 0;
            while (true) {
                avok avokVar = this.a;
                if (j2 == j || i == length) {
                    if (i == length) {
                        if (this.d) {
                            return;
                        }
                        avokVar.kn();
                        return;
                    } else {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    }
                } else {
                    if (this.d) {
                        return;
                    }
                    Object obj = objArr[i];
                    if (obj == null) {
                        avokVar.b(new NullPointerException(a.bP(i, "The element at index ", " is null")));
                        return;
                    } else {
                        if (avokVar.d(obj)) {
                            j2++;
                        }
                        i++;
                    }
                }
            }
            this.c = i;
            j = addAndGet(-j2);
        } while (j != 0);
    }
}
