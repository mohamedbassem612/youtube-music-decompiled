package defpackage;

import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ztm {
    public final Deque a;
    public final List b;
    public final zvb c;
    public final zus d;
    public final zua e;
    public final ztd f;
    public zuo g;
    public long h;
    public boolean i;
    public ztr j;
    public boolean k;

    public ztm(ztd ztdVar, zua zuaVar, zvb zvbVar, zus zusVar) {
        String str = ztf.K;
        this.f = ztdVar;
        this.e = zuaVar;
        this.c = zvbVar;
        this.d = zusVar;
        this.b = new ArrayList();
        this.a = new ArrayDeque();
    }

    static long a(File file) {
        if (file == null) {
            return -1L;
        }
        try {
            return Long.parseLong(file.getName());
        } catch (Throwable unused) {
            return -1L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    final ztl b(int i) {
        int i2;
        boolean z = true;
        int i3 = 1;
        if (this.k) {
            i2 = 0;
        } else {
            k();
            j();
            int size = this.a.size();
            if (size == 0) {
                i2 = 0;
            } else {
                if (size > 1) {
                    i2 = 2;
                    break;
                }
                zuo zuoVar = this.g;
                i(zuoVar);
                if (zuoVar.m && zuoVar.h != 2) {
                    throw new IllegalStateException("mmcb !loaded");
                }
                if (zuoVar.M != 0) {
                    zuoVar.Y();
                    int i4 = zuoVar.Z;
                    int i5 = zuoVar.j;
                    int iB = (int) zuoVar.b(i4, i5);
                    zuoVar.W(iB);
                    int i6 = iB == 0 ? 0 : (iB + zuoVar.ab) - 1;
                    int i7 = 0;
                    loop0: while (true) {
                        if (i6 == 0) {
                            i2 = i3;
                            break;
                        }
                        zuoVar.ad(i6);
                        int iC = (int) zuoVar.c((i6 << 3) + 39, 8);
                        zuoVar.af(i6, iC);
                        zuoVar.Y();
                        int i8 = zuoVar.Q[iC];
                        if (i8 != 0) {
                            i7 += i8;
                            if (i7 <= i) {
                                int i9 = 0;
                                while (true) {
                                    if (i9 <= i3) {
                                        zuoVar.ad(i6);
                                        zuoVar.ac(i9);
                                        int i10 = zuoVar.ac + i6 + (zuoVar.ae * i9);
                                        zuoVar.ab(i10);
                                        int iB2 = (int) zuoVar.b(i10, i5);
                                        while (true) {
                                            if (iB2 != 0) {
                                                int i11 = zuoVar.o;
                                                long j = zuoVar.f;
                                                int i12 = i3;
                                                if ((((i12 << (i11 >>> 16)) - 1) & ((Memory.peekByte((((long) iB2) + j) + ((long) ((i11 >> 3) & 8191))) & 255) >>> (i11 & 7))) == 0) {
                                                    int i13 = zuoVar.n;
                                                    int i14 = (iB2 << 3) + ((char) i13);
                                                    iB2 = (int) ((((Memory.peekByte(j + ((long) (i14 >> 3))) & 255) >>> (i14 & 7)) & 1) == 0 ? 0L : zuoVar.c(i14 + 1, (i13 >>> 16) - 1));
                                                    i3 = i12;
                                                }
                                            } else {
                                                i9++;
                                            }
                                        }
                                    }
                                }
                            }
                            i2 = 2;
                            break;
                        }
                        i3 = i3;
                        int iB3 = (int) zuoVar.b(i6, 2555904);
                        zuoVar.W(iB3);
                        i6 = iB3 == 0 ? 0 : (iB3 + zuoVar.ab) - 1;
                    }
                } else {
                    i2 = 0;
                }
                z = false;
            }
        }
        return new ztl(z, i2);
    }

    final zuo c(long j) {
        k();
        j();
        zuo zuoVar = this.g;
        if (zuoVar != null) {
            zuoVar.ah(false);
        }
        long jY = this.d.y(j);
        ztd ztdVar = this.f;
        ztdVar.V(jY);
        Deque deque = this.a;
        zuo zuoVar2 = new zuo(this, Math.max(j, (deque.isEmpty() ? 0L : ((zuo) deque.getFirst()).P) + 1), ztdVar.T.c);
        j();
        aihf aihfVar = ztdVar.O.b;
        long j2 = ((akkr) aihfVar.instance).aq + 1;
        aihfVar.copyOnWrite();
        akkr akkrVar = (akkr) aihfVar.instance;
        akkrVar.d |= 8;
        akkrVar.aq = j2;
        zuoVar2.ah(true);
        deque.addFirst(zuoVar2);
        this.g = zuoVar2;
        if (l(zuoVar2)) {
            return zuoVar2;
        }
        throw new IllegalStateException();
    }

    final zuo d() {
        j();
        return this.g;
    }

    final File e(long j) {
        return new File(f(), String.valueOf(j));
    }

    public final File f() {
        return new File(this.d.D(), "pages");
    }

    final Deque g() {
        k();
        j();
        return this.a;
    }

    final List h() {
        k();
        j();
        return this.b;
    }

    public final void i(zuo zuoVar) {
        if (zti.a) {
            if (zuoVar == null) {
                k();
                throw ugi.e("!currentPage");
            }
            if (zuoVar != this.g) {
                throw ugi.e("currentPage != page");
            }
            if (!zuoVar.W) {
                throw ugi.e("currentPage !current");
            }
            if (this.a.getFirst() != zuoVar) {
                throw ugi.e("currentPage !first");
            }
            if (zuoVar.h != 2) {
                throw ugi.e("currentPage !loaded");
            }
        }
    }

    public final void j() {
        if (zti.a && !this.d.E()) {
            throw ugi.e("store !locked");
        }
    }

    public final void k() {
        if (zti.a && !this.i) {
            throw ugi.e("store !startPersist");
        }
    }

    final boolean l(zuo zuoVar) {
        k();
        j();
        if (zuoVar.d() != txb.a) {
            return false;
        }
        List list = this.b;
        if (!list.contains(zuoVar)) {
            list.add(zuoVar);
            j$.util.List.EL.sort(list, Comparator$EL.reversed(Comparator$CC.comparingLong(new ygh(6))));
        }
        return true;
    }

    final zrs m() {
        return this.d.F();
    }
}
