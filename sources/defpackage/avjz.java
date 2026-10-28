package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avjz {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final avjt[] b;

    static {
        new avjz(new avjt[0]);
    }

    public avjz(avjt[] avjtVarArr) {
        this.b = avjtVarArr;
    }

    public static /* synthetic */ void b(avjz avjzVar) {
        int i = 0;
        while (true) {
            avjt[] avjtVarArr = avjzVar.b;
            if (i >= avjtVarArr.length) {
                return;
            }
            avjt avjtVar = avjtVarArr[i];
            i++;
        }
    }

    public final void a(long j) {
        int i = 0;
        while (true) {
            avjt[] avjtVarArr = this.b;
            if (i >= avjtVarArr.length) {
                return;
            }
            avjt avjtVar = avjtVarArr[i];
            i++;
        }
    }
}
