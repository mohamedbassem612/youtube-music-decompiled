package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avxy extends avrf {
    final axso[] c;
    final Iterable d;
    public final avnn e;

    public avxy(avlh avlhVar, Iterable iterable, avnn avnnVar) {
        super(avlhVar);
        this.c = null;
        this.d = iterable;
        this.e = avnnVar;
    }

    @Override // defpackage.avlh
    protected final void ar(axsp axspVar) {
        int length;
        axso[] axsoVarArr = this.c;
        if (axsoVarArr == null) {
            axsoVarArr = new axso[8];
            try {
                length = 0;
                for (axso axsoVar : this.d) {
                    if (length == axsoVarArr.length) {
                        axsoVarArr = (axso[]) Arrays.copyOf(axsoVarArr, (length >> 1) + length);
                    }
                    int i = length + 1;
                    axsoVarArr[length] = axsoVar;
                    length = i;
                }
            } catch (Throwable th) {
                avkz.a(th);
                awjx.f(th, axspVar);
                return;
            }
        } else {
            length = axsoVarArr.length;
        }
        if (length == 0) {
            new avux(this.b, new acpr((avlh) this, 18)).ar(axspVar);
            return;
        }
        avxw avxwVar = new avxw(axspVar, this.e, length);
        axspVar.e(avxwVar);
        avxx[] avxxVarArr = avxwVar.c;
        AtomicReference atomicReference = avxwVar.e;
        for (int i2 = 0; i2 < length && atomicReference.get() != awka.CANCELLED; i2++) {
            axsoVarArr[i2].aq(avxxVarArr[i2]);
        }
        this.b.ap(avxwVar);
    }

    public avxy(avlh avlhVar, axso[] axsoVarArr, avnn avnnVar) {
        super(avlhVar);
        this.c = axsoVarArr;
        this.d = null;
        this.e = avnnVar;
    }
}
