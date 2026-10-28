package defpackage;

import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class yzu extends btn {
    private final btn[] b;
    private final bss[] c;
    private final long[] d;
    private final long[] e;
    private final Object[] f;
    private final zjr g;
    private final Long h;

    public yzu(yzv yzvVar, yzv yzvVar2, AtomicInteger atomicInteger, int i, zjr zjrVar) {
        this.g = zjrVar;
        this.h = zjrVar.eK() ? Long.valueOf(zjrVar.v()) : null;
        btn btnVar = yzvVar.f;
        btn btnVar2 = yzvVar2 != null ? yzvVar2.f : null;
        boolean zP = p(btnVar);
        boolean zP2 = p(btnVar2);
        if (zP) {
            this.b = new btn[0];
            this.c = new bss[0];
            long[] jArr = new long[0];
            this.d = jArr;
            this.e = jArr;
            this.f = new Object[0];
            return;
        }
        if (zP2) {
            this.b = new btn[]{btnVar};
            this.c = new bss[]{q(btnVar, i, atomicInteger)};
            this.d = new long[]{yzvVar.c};
            this.e = new long[]{yzvVar.g};
            this.f = new Object[]{yzvVar.h};
            return;
        }
        this.b = new btn[]{btnVar, btnVar2};
        this.c = new bss[]{q(btnVar, i, atomicInteger), q(btnVar2, i, atomicInteger)};
        this.d = new long[]{yzvVar.c, yzvVar2.c};
        this.e = new long[]{yzvVar.g, yzvVar2.g};
        this.f = new Object[]{yzvVar.h, yzvVar2.h};
    }

    private static boolean p(btn btnVar) {
        int iC;
        int i = 1;
        if (btnVar == null || (iC = btnVar.c()) == 0) {
            return true;
        }
        if (iC != 1) {
            i = iC;
        } else if (btnVar.b() == 1) {
            return false;
        }
        throw new IllegalArgumentException("Child Timeline too complex windowCount " + i + " periodCount " + btnVar.b());
    }

    private static final bss q(btn btnVar, int i, AtomicInteger atomicInteger) {
        btm btmVar = new btm();
        btnVar.e(0, btmVar, 0L);
        zce zceVarA = zce.a(btmVar.d);
        zdj zdjVar = zceVarA != null ? new zdj(zceVarA.b, zceVarA.a) : new zdj((twp) null, (zcf) null);
        zdjVar.b = new twp(i, atomicInteger, btnVar);
        bss bssVar = btmVar.d;
        zce zceVar = new zce((twp) zdjVar.b, (zcf) zdjVar.a);
        bsi bsiVar = new bsi(bssVar);
        bsiVar.d = zceVar;
        if (bssVar.c == null) {
            bsiVar.b = Uri.EMPTY;
        }
        return bsiVar.a();
    }

    @Override // defpackage.btn
    public final int a(Object obj) {
        int i = 0;
        while (true) {
            Object[] objArr = this.f;
            if (i >= objArr.length) {
                return -1;
            }
            if (objArr[i] == obj) {
                return i;
            }
            i++;
        }
    }

    @Override // defpackage.btn
    public final int b() {
        return this.b.length;
    }

    @Override // defpackage.btn
    public final int c() {
        return this.b.length;
    }

    @Override // defpackage.btn
    public final btl d(int i, btl btlVar, boolean z) {
        this.b[i].d(0, btlVar, z);
        btlVar.c = i;
        if (z) {
            btlVar.b = this.f[i];
        }
        long j = this.e[i];
        if (j != -1) {
            btlVar.d = j * 1000;
        }
        return btlVar;
    }

    @Override // defpackage.btn
    public final btm e(int i, btm btmVar, long j) {
        this.b[i].e(0, btmVar, j);
        btmVar.b = this.f[i];
        btmVar.o = i;
        btmVar.p = i;
        btmVar.d = this.c[i];
        Long l = this.h;
        long j2 = this.d[i];
        if (j2 != (l == null ? this.g.v() : l.longValue())) {
            long j3 = (j2 * 1000) - btmVar.q;
            btmVar.m = j3;
            if (j3 < 0) {
                zhq zhqVar = zhq.ABR;
                long j4 = btmVar.m;
                btmVar.m = 0L;
            } else {
                long j5 = btmVar.n;
                if (j5 != -9223372036854775807L && j3 > j5) {
                    zhq zhqVar2 = zhq.ABR;
                    long j6 = btmVar.m;
                    long j7 = btmVar.n;
                }
            }
        }
        long j8 = this.e[i];
        if (j8 != -1) {
            long j9 = (j8 * 1000) - btmVar.q;
            if (btmVar.m > j9) {
                btmVar.m = j9;
            }
            if (btmVar.n > j9) {
                btmVar.n = j9;
            }
        }
        return btmVar;
    }

    @Override // defpackage.btn
    public final Object f(int i) {
        return this.f[i];
    }
}
