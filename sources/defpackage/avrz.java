package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avrz extends avlh {
    final axso[] b;
    final Iterable c;
    public final avnn d;
    final int e;

    public avrz(Iterable iterable, avnn avnnVar, int i) {
        this.b = null;
        this.c = iterable;
        this.d = avnnVar;
        this.e = i;
    }

    @Override // defpackage.avlh
    public final void ar(axsp axspVar) {
        int length;
        axso[] axsoVarArr = this.b;
        if (axsoVarArr == null) {
            axsoVarArr = new axso[8];
            try {
                Iterator it = this.c.iterator();
                it.getClass();
                length = 0;
                while (it.hasNext()) {
                    try {
                        try {
                            axso axsoVar = (axso) it.next();
                            axsoVar.getClass();
                            if (length == axsoVarArr.length) {
                                axso[] axsoVarArr2 = new axso[(length >> 2) + length];
                                System.arraycopy(axsoVarArr, 0, axsoVarArr2, 0, length);
                                axsoVarArr = axsoVarArr2;
                            }
                            axsoVarArr[length] = axsoVar;
                            length++;
                        } catch (Throwable th) {
                            avkz.a(th);
                            awjx.f(th, axspVar);
                            return;
                        }
                    } catch (Throwable th2) {
                        avkz.a(th2);
                        awjx.f(th2, axspVar);
                        return;
                    }
                }
            } catch (Throwable th3) {
                avkz.a(th3);
                awjx.f(th3, axspVar);
                return;
            }
        } else {
            length = axsoVarArr.length;
        }
        if (length == 0) {
            axspVar.e(awjx.INSTANCE);
            axspVar.kn();
            return;
        }
        if (length == 1) {
            axsoVarArr[0].aq(new avuw(axspVar, new acpr((avlh) this, 17)));
            return;
        }
        avrx avrxVar = new avrx(axspVar, this.d, length, this.e);
        axspVar.e(avrxVar);
        avry[] avryVarArr = avrxVar.c;
        for (int i = 0; i < length && !avrxVar.k && !avrxVar.i; i++) {
            axsoVarArr[i].aq(avryVarArr[i]);
        }
    }

    public avrz(axso[] axsoVarArr, avnn avnnVar, int i) {
        this.b = axsoVarArr;
        this.c = null;
        this.d = avnnVar;
        this.e = i;
    }
}
