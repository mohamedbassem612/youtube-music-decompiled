package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cmn extends cna {
    private final long c;
    private final long d;
    private final long e;
    private final boolean f;

    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    public cmn(btn btnVar, long j, long j2, boolean z) throws cmo {
        super(btnVar);
        if (j2 != Long.MIN_VALUE && j2 < j) {
            throw new cmo(2, j, j2);
        }
        boolean z2 = true;
        if (btnVar.b() != 1) {
            throw new cmo(0, -9223372036854775807L, -9223372036854775807L);
        }
        btm btmVarE = btnVar.e(0, new btm(), 0L);
        long jMax = Math.max(0L, j);
        if (!z && !btmVarE.l && jMax != 0 && !btmVarE.i) {
            throw new cmo(1, -9223372036854775807L, -9223372036854775807L);
        }
        long jMax2 = j2 == Long.MIN_VALUE ? btmVarE.n : Math.max(0L, j2);
        long j3 = btmVarE.n;
        if (j3 != -9223372036854775807L) {
            jMax2 = jMax2 > j3 ? j3 : jMax2;
            if (jMax > jMax2) {
                jMax = jMax2;
            }
        }
        this.c = jMax;
        this.d = jMax2;
        this.e = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
        if (!btmVarE.j) {
            z2 = false;
        } else if (jMax2 != -9223372036854775807L) {
            long j4 = btmVarE.n;
            if (j4 == -9223372036854775807L || jMax2 != j4) {
                z2 = false;
            }
        }
        this.f = z2;
    }

    @Override // defpackage.cna, defpackage.btn
    public final btl d(int i, btl btlVar, boolean z) {
        this.b.d(0, btlVar, z);
        if (btlVar.e == -9223372036854775807L) {
            btlVar.e = btlVar.d;
        }
        long j = btlVar.f - this.c;
        long j2 = this.e;
        btlVar.j(btlVar.a, btlVar.b, 0, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j, brp.a, btlVar.g, btlVar.e);
        return btlVar;
    }

    @Override // defpackage.cna, defpackage.btn
    public final btm e(int i, btm btmVar, long j) {
        this.b.e(0, btmVar, 0L);
        long j2 = btmVar.q;
        long j3 = this.c;
        btmVar.q = j2 + j3;
        btmVar.n = this.e;
        btmVar.j = this.f;
        long j4 = btmVar.m;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            btmVar.m = jMax;
            long j5 = this.d;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            btmVar.m = jMax;
            btmVar.m = jMax - j3;
        }
        int i2 = bwp.a;
        long j6 = btmVar.f;
        long jF = bwp.F(j3);
        if (j6 != -9223372036854775807L) {
            btmVar.f = j6 + jF;
        }
        long j7 = btmVar.g;
        if (j7 != -9223372036854775807L) {
            btmVar.g = j7 + jF;
        }
        return btmVar;
    }
}
