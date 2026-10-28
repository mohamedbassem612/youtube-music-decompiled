package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cpi implements coo {
    public final cpk a;
    final /* synthetic */ cpk b;
    private final con c;
    private final int d;
    private boolean e;

    public cpi(cpk cpkVar, cpk cpkVar2, con conVar, int i) {
        this.b = cpkVar;
        this.a = cpkVar2;
        this.c = conVar;
        this.d = i;
    }

    private final void g() {
        if (this.e) {
            return;
        }
        cpk cpkVar = this.b;
        int i = this.d;
        cpkVar.p.d(cpkVar.b[i], cpkVar.c[i], 0, null, cpkVar.j);
        this.e = true;
    }

    @Override // defpackage.coo
    public final /* synthetic */ int a() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r1.c(r4.d + 1) <= r4.c.h()) goto L8;
     */
    @Override // defpackage.coo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.ccu r5, androidx.media3.decoder.DecoderInputBuffer r6, int r7) {
        /*
            r4 = this;
            cpk r0 = r4.b
            boolean r1 = r0.k()
            if (r1 != 0) goto L1c
            cpb r1 = r0.k
            if (r1 == 0) goto L1e
            int r2 = r4.d
            con r3 = r4.c
            int r2 = r2 + 1
            int r1 = r1.c(r2)
            int r2 = r3.h()
            if (r1 > r2) goto L1e
        L1c:
            r4 = -3
            goto L29
        L1e:
            r4.g()
            con r4 = r4.c
            boolean r0 = r0.o
            int r4 = r4.l(r5, r6, r7, r0)
        L29:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpi.b(ccu, androidx.media3.decoder.DecoderInputBuffer, int):int");
    }

    @Override // defpackage.coo
    public final int c(long j) throws Throwable {
        cpk cpkVar = this.b;
        if (cpkVar.k()) {
            return 0;
        }
        con conVar = this.c;
        int iJ = conVar.j(j, cpkVar.o);
        cpb cpbVar = cpkVar.k;
        if (cpbVar != null) {
            iJ = Math.min(iJ, cpbVar.c(this.d + 1) - conVar.h());
        }
        conVar.A(iJ);
        if (iJ > 0) {
            g();
        }
        return iJ;
    }

    public final void e() {
        boolean[] zArr = this.b.d;
        int i = this.d;
        ahno.O(zArr[i]);
        zArr[i] = false;
    }

    @Override // defpackage.coo
    public final boolean f() {
        cpk cpkVar = this.b;
        return !cpkVar.k() && this.c.F(cpkVar.o);
    }

    @Override // defpackage.coo
    public final void gu() {
    }
}
