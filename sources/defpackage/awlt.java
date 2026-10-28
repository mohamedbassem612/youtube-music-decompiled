package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awlt extends AtomicReference implements awlq {
    private static final long serialVersionUID = -733876083048047795L;
    final List a;
    volatile boolean b;
    volatile int c;

    public awlt(int i) {
        this.a = new ArrayList(i);
    }

    @Override // defpackage.awlq
    public final void a(Object obj) {
        this.a.add(obj);
        this.c++;
    }

    @Override // defpackage.awlq
    public final void b(Object obj) {
        this.a.add(obj);
        this.c++;
        this.b = true;
    }

    @Override // defpackage.awlq
    public final void c(awlr awlrVar) {
        int iIntValue;
        if (awlrVar.getAndIncrement() == 0) {
            List list = this.a;
            avlw avlwVar = awlrVar.a;
            Integer num = (Integer) awlrVar.c;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
                awlrVar.c = 0;
            }
            int iAddAndGet = 1;
            while (!awlrVar.d) {
                int i = this.c;
                while (i != iIntValue) {
                    if (awlrVar.d) {
                        awlrVar.c = null;
                        return;
                    }
                    int i2 = iIntValue + 1;
                    Object obj = list.get(iIntValue);
                    if (this.b && i2 == i && i2 == (i = this.c)) {
                        if (awkl.d(obj)) {
                            avlwVar.kn();
                        } else {
                            avlwVar.b(awkl.a(obj));
                        }
                        awlrVar.c = null;
                        awlrVar.d = true;
                        return;
                    }
                    avlwVar.kk(obj);
                    iIntValue = i2;
                }
                if (iIntValue == this.c) {
                    awlrVar.c = Integer.valueOf(iIntValue);
                    iAddAndGet = awlrVar.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            awlrVar.c = null;
        }
    }
}
