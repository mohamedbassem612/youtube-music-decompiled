package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avuc extends avub {
    private static final long serialVersionUID = -6022804456014692607L;
    final avok d;

    public avuc(avok avokVar, Iterator it) {
        super(it);
        this.d = avokVar;
    }

    @Override // defpackage.avub
    public final void d() {
        avok avokVar = this.d;
        Iterator it = this.a;
        while (!this.b) {
            try {
                Object next = it.next();
                if (this.b) {
                    return;
                }
                if (next == null) {
                    avokVar.b(new NullPointerException("Iterator.next() returned a null value"));
                    return;
                }
                avokVar.d(next);
                if (this.b) {
                    return;
                }
                try {
                    if (!it.hasNext()) {
                        if (this.b) {
                            return;
                        }
                        avokVar.kn();
                        return;
                    }
                } catch (Throwable th) {
                    avkz.a(th);
                    avokVar.b(th);
                    return;
                }
            } catch (Throwable th2) {
                avkz.a(th2);
                avokVar.b(th2);
                return;
            }
        }
    }

    @Override // defpackage.avub
    public final void f(long j) {
        avok avokVar = this.d;
        Iterator it = this.a;
        do {
            long j2 = 0;
            while (true) {
                if (j2 == j) {
                    j = get();
                    if (j2 == j) {
                        break;
                    }
                } else {
                    if (this.b) {
                        return;
                    }
                    try {
                        Object next = it.next();
                        if (this.b) {
                            return;
                        }
                        if (next == null) {
                            avokVar.b(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        boolean zD = avokVar.d(next);
                        if (this.b) {
                            return;
                        }
                        try {
                            if (!it.hasNext()) {
                                if (this.b) {
                                    return;
                                }
                                avokVar.kn();
                                return;
                            } else if (zD) {
                                j2++;
                            }
                        } catch (Throwable th) {
                            avkz.a(th);
                            avokVar.b(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        avkz.a(th2);
                        avokVar.b(th2);
                        return;
                    }
                }
            }
            j = addAndGet(-j2);
        } while (j != 0);
    }
}
