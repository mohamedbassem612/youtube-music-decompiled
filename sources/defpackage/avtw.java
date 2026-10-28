package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avtw extends avtx {
    private static final long serialVersionUID = 2587302975077663557L;
    final axsp a;

    public avtw(axsp axspVar, Object[] objArr) {
        super(objArr);
        this.a = axspVar;
    }

    @Override // defpackage.avtx
    public final void d() {
        Object[] objArr = this.b;
        int length = objArr.length;
        int i = this.c;
        while (true) {
            axsp axspVar = this.a;
            boolean z = this.d;
            if (i == length) {
                if (z) {
                    return;
                }
                axspVar.kn();
                return;
            } else {
                if (z) {
                    return;
                }
                Object obj = objArr[i];
                if (obj == null) {
                    axspVar.b(new NullPointerException(a.bP(i, "The element at index ", " is null")));
                    return;
                } else {
                    axspVar.kk(obj);
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
                axsp axspVar = this.a;
                if (j2 == j || i == length) {
                    if (i == length) {
                        if (this.d) {
                            return;
                        }
                        axspVar.kn();
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
                        axspVar.b(new NullPointerException(a.bP(i, "The element at index ", " is null")));
                        return;
                    } else {
                        axspVar.kk(obj);
                        j2++;
                        i++;
                    }
                }
            }
            this.c = i;
            j = addAndGet(-j2);
        } while (j != 0);
    }
}
