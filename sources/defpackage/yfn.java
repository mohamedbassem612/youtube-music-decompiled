package defpackage;

import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yfn implements yfk {
    final long a;
    private final agfr b;
    private agfr c;
    private final long d;
    private final float e;
    private final long f;
    private final long g;
    private final float h;
    private final mbc i;
    private yfm j;
    private final long k;

    public yfn(agfr agfrVar, akwi akwiVar, akwi akwiVar2, mbc mbcVar, long j) {
        this.i = mbcVar;
        this.k = j;
        boolean z = false;
        if (akwiVar != null && akwiVar2 != null && akwiVar.c > 0 && akwiVar2.c > 0) {
            z = true;
        }
        this.b = agfrVar;
        this.a = z ? akwiVar.b : 268435456L;
        this.d = z ? akwiVar.c : 536870912L;
        this.e = z ? akwiVar.d : 0.2f;
        this.f = z ? akwiVar2.b : 67108864L;
        this.g = z ? akwiVar2.c : 2147483648L;
        this.h = z ? akwiVar2.d : 0.2f;
    }

    @Override // defpackage.yfk
    public final long a(long j) {
        File file;
        agfr agfrVar = this.c;
        if (agfrVar == null) {
            agfrVar = this.b;
        }
        if (agfrVar == null || (file = (File) agfrVar.io()) == null) {
            return this.f;
        }
        if (this.j == null || this.i.f().toEpochMilli() - this.j.d > this.k) {
            this.j = new yfm(file.getTotalSpace(), file.getUsableSpace(), file.getFreeSpace(), this.i.f().toEpochMilli());
        }
        yfm yfmVar = this.j;
        long j2 = yfmVar.b;
        return Math.max(Math.min(this.g, (long) (this.h * Math.max(0L, (j2 - Math.max(this.a, Math.min(this.d, (long) ((yfmVar.a - (yfmVar.c - j2)) * this.e)))) + j))), this.f);
    }

    @Override // defpackage.yfk
    public final void b(agfr agfrVar) {
        this.c = agfrVar;
    }
}
