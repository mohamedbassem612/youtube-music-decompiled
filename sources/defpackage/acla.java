package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acla {
    public final Object a = new Object();
    public volatile axmq[] b = new axmq[0];
    private final int c;

    public acla(int i) {
        this.c = i;
    }

    public final Object a(long j) {
        for (axmq axmqVar : this.b) {
            if (axmqVar.a == j) {
                return axmqVar.b;
            }
        }
        return null;
    }

    public final void b(long j, Object obj) {
        synchronized (this.a) {
            axmq[] axmqVarArr = this.b;
            int length = axmqVarArr.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                axmq axmqVar = axmqVarArr[i2];
                if (axmqVar.a == j) {
                    int length2 = axmqVarArr.length;
                    if (i2 != length2 - 1 || axmqVar.b != obj) {
                        axmq axmqVar2 = axmqVarArr[i2];
                        if (axmqVar2.b != obj) {
                            axmqVar2 = new axmq(j, obj);
                        }
                        axmq[] axmqVarArr2 = new axmq[length2];
                        while (i < length2) {
                            axmqVarArr2[i] = i < i2 ? axmqVarArr[i] : i < axmqVarArr.length + (-1) ? axmqVarArr[i + 1] : axmqVar2;
                            i++;
                        }
                        this.b = axmqVarArr2;
                    }
                }
            }
            this.b = c(axmqVarArr, new axmq(j, obj));
        }
    }

    public final axmq[] c(axmq[] axmqVarArr, axmq axmqVar) {
        int length = axmqVarArr.length;
        int i = this.c;
        int i2 = 0;
        if (length >= i) {
            axmq[] axmqVarArr2 = new axmq[i];
            while (i2 < i) {
                int i3 = i2 + 1;
                axmqVarArr2[i2] = i2 < i + (-1) ? axmqVarArr[i3] : axmqVar;
                i2 = i3;
            }
            return axmqVarArr2;
        }
        int i4 = length + 1;
        axmq[] axmqVarArr3 = new axmq[i4];
        while (i2 < i4) {
            axmqVarArr3[i2] = i2 < axmqVarArr.length ? axmqVarArr[i2] : axmqVar;
            i2++;
        }
        return axmqVarArr3;
    }
}
