package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avud extends avub {
    private static final long serialVersionUID = -6022804456014692607L;
    final axsp d;

    public avud(axsp axspVar, Iterator it) {
        super(it);
        this.d = axspVar;
    }

    @Override // defpackage.avub
    public final void d() {
        axsp axspVar = this.d;
        Iterator it = this.a;
        while (!this.b) {
            try {
                Object next = it.next();
                if (this.b) {
                    return;
                }
                if (next == null) {
                    axspVar.b(new NullPointerException("Iterator.next() returned a null value"));
                    return;
                }
                axspVar.kk(next);
                if (this.b) {
                    return;
                }
                try {
                    if (!it.hasNext()) {
                        if (this.b) {
                            return;
                        }
                        axspVar.kn();
                        return;
                    }
                } catch (Throwable th) {
                    avkz.a(th);
                    axspVar.b(th);
                    return;
                }
            } catch (Throwable th2) {
                avkz.a(th2);
                axspVar.b(th2);
                return;
            }
        }
    }

    @Override // defpackage.avub
    public final void f(long j) {
        axsp axspVar = this.d;
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
                            axspVar.b(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        axspVar.kk(next);
                        if (this.b) {
                            return;
                        }
                        try {
                            if (!it.hasNext()) {
                                if (this.b) {
                                    return;
                                }
                                axspVar.kn();
                                return;
                            }
                            j2++;
                        } catch (Throwable th) {
                            avkz.a(th);
                            axspVar.b(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        avkz.a(th2);
                        axspVar.b(th2);
                        return;
                    }
                }
            }
            j = addAndGet(-j2);
        } while (j != 0);
    }
}
