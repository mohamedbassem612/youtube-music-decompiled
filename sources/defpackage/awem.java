package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awem extends ArrayList implements aweh {
    private static final long serialVersionUID = 7063189396499112664L;
    volatile int a;

    public awem() {
        super(16);
    }

    @Override // defpackage.aweh
    public final void b() {
        add(awkl.COMPLETE);
        this.a++;
    }

    @Override // defpackage.aweh
    public final void c(Throwable th) {
        add(new awkj(th));
        this.a++;
    }

    @Override // defpackage.aweh
    public final void d(Object obj) {
        add(obj);
        this.a++;
    }

    @Override // defpackage.aweh
    public final void e(awef awefVar) {
        if (awefVar.getAndIncrement() == 0) {
            avlw avlwVar = awefVar.b;
            int iAddAndGet = 1;
            while (!awefVar.d) {
                int i = this.a;
                Integer num = (Integer) awefVar.c;
                int iIntValue = num != null ? num.intValue() : 0;
                while (iIntValue < i) {
                    if (awkl.b(get(iIntValue), avlwVar) || awefVar.d) {
                        return;
                    } else {
                        iIntValue++;
                    }
                }
                awefVar.c = Integer.valueOf(iIntValue);
                iAddAndGet = awefVar.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }
}
