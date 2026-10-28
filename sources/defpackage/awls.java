package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awls extends AtomicReference implements awlq {
    private static final long serialVersionUID = 1107649250281456395L;
    final int a = 1;
    int b;
    volatile awlp c;
    awlp d;
    volatile boolean e;

    public awls() {
        awlp awlpVar = new awlp(null);
        this.d = awlpVar;
        this.c = awlpVar;
    }

    @Override // defpackage.awlq
    public final void a(Object obj) {
        awlp awlpVar = new awlp(obj);
        awlp awlpVar2 = this.d;
        this.d = awlpVar;
        this.b++;
        awlpVar2.set(awlpVar);
        int i = this.b;
        if (i > this.a) {
            this.b = i - 1;
            this.c = (awlp) this.c.get();
        }
    }

    @Override // defpackage.awlq
    public final void b(Object obj) {
        awlp awlpVar = new awlp(obj);
        awlp awlpVar2 = this.d;
        this.d = awlpVar;
        this.b++;
        awlpVar2.lazySet(awlpVar);
        awlp awlpVar3 = this.c;
        if (awlpVar3.a != null) {
            awlp awlpVar4 = new awlp(null);
            awlpVar4.lazySet((awlp) awlpVar3.get());
            this.c = awlpVar4;
        }
        this.e = true;
    }

    @Override // defpackage.awlq
    public final void c(awlr awlrVar) {
        if (awlrVar.getAndIncrement() == 0) {
            avlw avlwVar = awlrVar.a;
            awlp awlpVar = (awlp) awlrVar.c;
            if (awlpVar == null) {
                awlpVar = this.c;
            }
            int iAddAndGet = 1;
            while (!awlrVar.d) {
                awlp awlpVar2 = (awlp) awlpVar.get();
                if (awlpVar2 != null) {
                    boolean z = this.e;
                    Object obj = awlpVar2.a;
                    if (z && awlpVar2.get() == null) {
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
                    awlpVar = awlpVar2;
                } else if (awlpVar.get() == null) {
                    awlrVar.c = awlpVar;
                    iAddAndGet = awlrVar.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    continue;
                }
            }
            awlrVar.c = null;
        }
    }
}
