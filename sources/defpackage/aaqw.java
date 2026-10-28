package defpackage;

import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class aaqw {
    public final aaqu a;
    public final aamh b;
    public final HashSet c;
    public final Object d;
    public aami e;
    public volatile int f;
    public volatile int g;
    public volatile int h;
    public volatile int i;
    public volatile int j;
    public volatile int k;
    public volatile boolean l;

    public aaqw(aaqu aaquVar, aamh aamhVar) {
        this.a = aaquVar;
        aamhVar.getClass();
        this.b = aamhVar;
        this.c = new HashSet(aamhVar.d);
        this.d = aaquVar;
    }

    public aami a() {
        aami aamiVar;
        Object obj = this.d;
        synchronized (obj) {
            aamiVar = this.e;
            if (aamiVar == null) {
                aamh aamhVar = this.b;
                int iD = d();
                synchronized (obj) {
                    try {
                        int i = this.i;
                        int i2 = this.k;
                        int i3 = this.f;
                        int i4 = this.g;
                        int i5 = this.h;
                        boolean z = this.l;
                        aamiVar = new aami(aamhVar, iD);
                        this.e = aamiVar;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return aamiVar;
    }

    public void b(String str) {
        synchronized (this.d) {
            typ.f(str);
            this.c.add(str);
            this.a.e(str, this.b.a);
        }
    }

    public boolean c(aamw aamwVar) {
        synchronized (this.d) {
            String strE = aarq.e(aamwVar.f);
            HashSet hashSet = this.c;
            int i = 0;
            if (!hashSet.contains(strE)) {
                return false;
            }
            if (!aamwVar.c()) {
                hashSet.remove(strE);
                this.a.g(strE, this.b.a);
                if (aamwVar.b == aqpc.TRANSFER_STATE_FAILED) {
                    this.l = true;
                    this.k++;
                }
            }
            int i2 = this.b.d;
            if (i2 > 0) {
                int size = i2 - hashSet.size();
                if (size == i2) {
                    this.f = this.g;
                    this.g = 100;
                } else {
                    int iA = (size * 100) / i2;
                    if (aamwVar.c()) {
                        iA += aamwVar.a() / i2;
                    }
                    if (iA == 0) {
                        iA = aamwVar.d > 0 ? 1 : 0;
                    }
                    int iMin = Math.min(99, iA);
                    if (iMin > this.g) {
                        this.f = this.g;
                        this.g = iMin;
                    }
                }
                this.j = size;
            }
            int i3 = i2 - this.i;
            if (i3 > 0) {
                int size2 = i3 - hashSet.size();
                if (size2 == i3) {
                    this.h = 100;
                } else {
                    int iA2 = (size2 * 100) / i3;
                    if (aamwVar.c()) {
                        iA2 += aamwVar.a() / i3;
                    }
                    if (iA2 != 0) {
                        i = iA2;
                    } else if (aamwVar.d > 0) {
                        i = 1;
                    }
                    int iMin2 = Math.min(99, i);
                    if (iMin2 > this.h) {
                        this.h = iMin2;
                    }
                }
                this.j = size2 + this.i;
            }
            this.e = null;
            return true;
        }
    }

    public final int d() {
        int size;
        synchronized (this.d) {
            size = this.c.size();
        }
        return size;
    }
}
