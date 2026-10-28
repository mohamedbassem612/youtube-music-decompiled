package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cht extends btn {
    private final long b;
    private final long c;
    private final long d;
    private final int e;
    private final long f;
    private final long g;
    private final long h;
    private final cio i;
    private final bss j;
    private final bso k;

    public cht(long j, long j2, long j3, int i, long j4, long j5, long j6, cio cioVar, bss bssVar, bso bsoVar) {
        ahno.O(cioVar.d == (bsoVar != null));
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = i;
        this.f = j4;
        this.g = j5;
        this.h = j6;
        this.i = cioVar;
        this.j = bssVar;
        this.k = bsoVar;
    }

    private static boolean p(cio cioVar) {
        return cioVar.d && cioVar.e != -9223372036854775807L && cioVar.b == -9223372036854775807L;
    }

    @Override // defpackage.btn
    public final int a(Object obj) {
        int iIntValue;
        if (!(obj instanceof Integer) || (iIntValue = ((Integer) obj).intValue() - this.e) < 0 || iIntValue >= b()) {
            return -1;
        }
        return iIntValue;
    }

    @Override // defpackage.btn
    public final int b() {
        return this.i.a();
    }

    @Override // defpackage.btn
    public final int c() {
        return 1;
    }

    @Override // defpackage.btn
    public final btl d(int i, btl btlVar, boolean z) {
        Object obj;
        Integer numValueOf;
        ahno.W(i, b());
        if (z) {
            obj = this.i.d(i).e;
            numValueOf = Integer.valueOf(this.e + i);
        } else {
            obj = null;
            numValueOf = null;
        }
        cio cioVar = this.i;
        btlVar.j(obj, numValueOf, 0, cioVar.c(i), bwp.y(cioVar.d(i).a - cioVar.d(0).a) - this.f, brp.a, false, -9223372036854775807L);
        return btlVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Code duplicated, block: B:19:0x005f A[LOOP:1: B:16:0x0050->B:19:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0067 A[EDGE_INSN: B:32:0x0067->B:21:0x0067 BREAK  A[LOOP:1: B:16:0x0050->B:19:0x005f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0028 A[PHI: r1
      0x0028: PHI (r1v4 long) = (r1v1 long), (r1v7 long) binds: [B:5:0x0017, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.btn
    public final btm e(int i, btm btmVar, long j) {
        long jC;
        long j2;
        int i2;
        ?? r5;
        int size;
        int i3;
        long j3;
        cia ciaVarK;
        ahno.W(i, 1);
        long jH = this.h;
        cio cioVar = this.i;
        if (p(cioVar)) {
            long j4 = 0;
            if (j > 0) {
                jH += j;
                if (jH > this.g) {
                    jH = -9223372036854775807L;
                } else {
                    long j5 = this.f;
                    jC = cioVar.c(0);
                    j2 = j5 + jH;
                    i2 = 0;
                    while (i2 < cioVar.a() - 1 && j2 >= jC) {
                        i2++;
                        j2 -= jC;
                        jC = cioVar.c(i2);
                    }
                    r5 = cioVar.d(i2).f;
                    size = r5.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            j3 = j4;
                            i3 = -1;
                            break;
                        }
                        j3 = j4;
                        if (((cij) r5.get(i3)).b != 2) {
                            break;
                        }
                        i3++;
                        j4 = j3;
                    }
                    if (i3 != -1 && (ciaVarK = ((ciy) ((cij) r5.get(i3)).c.get(0)).k()) != null && ciaVarK.f(jC) != j3) {
                        jH = (jH + ciaVarK.h(ciaVarK.g(j2, jC))) - j2;
                    }
                }
            } else {
                long j6 = this.f;
                jC = cioVar.c(0);
                j2 = j6 + jH;
                i2 = 0;
                while (i2 < cioVar.a() - 1) {
                    i2++;
                    j2 -= jC;
                    jC = cioVar.c(i2);
                }
                r5 = cioVar.d(i2).f;
                size = r5.size();
                i3 = 0;
                while (true) {
                    if (i3 < size) {
                        j3 = j4;
                        i3 = -1;
                        break;
                    }
                    j3 = j4;
                    if (((cij) r5.get(i3)).b != 2) {
                        break;
                        break;
                    }
                    i3++;
                    j4 = j3;
                }
                if (i3 != -1) {
                    jH = (jH + ciaVarK.h(ciaVarK.g(j2, jC))) - j2;
                }
            }
        }
        btmVar.e(btm.a, this.j, cioVar, this.b, this.c, this.d, true, p(cioVar), this.k, jH, this.g, b() - 1, this.f);
        return btmVar;
    }

    @Override // defpackage.btn
    public final Object f(int i) {
        ahno.W(i, b());
        return Integer.valueOf(this.e + i);
    }
}
