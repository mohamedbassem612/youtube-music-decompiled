package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awaw extends AtomicInteger implements avmn {
    private static final long serialVersionUID = 6770240836423125754L;
    final avlw a;
    final away b;
    awax c;
    int d;
    long e;
    volatile boolean f;

    public awaw(avlw avlwVar, away awayVar) {
        this.a = avlwVar;
        this.b = awayVar;
        this.c = awayVar.g;
    }

    @Override // defpackage.avmn
    public final void dispose() {
        AtomicReference atomicReference;
        awaw[] awawVarArr;
        awaw[] awawVarArr2;
        if (this.f) {
            return;
        }
        this.f = true;
        away awayVar = this.b;
        do {
            atomicReference = awayVar.e;
            awawVarArr = (awaw[]) atomicReference.get();
            int length = awawVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (awawVarArr[i] == this) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                awawVarArr2 = away.b;
            } else {
                awaw[] awawVarArr3 = new awaw[length - 1];
                System.arraycopy(awawVarArr, 0, awawVarArr3, 0, i);
                System.arraycopy(awawVarArr, i + 1, awawVarArr3, i, (length - i) - 1);
                awawVarArr2 = awawVarArr3;
            }
        } while (!a.av(atomicReference, awawVarArr, awawVarArr2));
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.f;
    }
}
