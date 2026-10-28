package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zdz extends ywd {
    final /* synthetic */ zea a;
    private final ywj b;
    private boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdz(zea zeaVar, ywj ywjVar, boolean z) {
        super(ywjVar);
        this.a = zeaVar;
        this.b = ywjVar;
        this.d = z;
    }

    @Override // defpackage.ywd, defpackage.ywj
    public final void A(long j, long j2, ywk ywkVar, boolean z, long j3, zgs zgsVar) {
        this.d = false;
        zea zeaVar = this.a;
        zev zevVar = zeaVar.G;
        if (zevVar != null) {
            ywk ywkVar2 = zevVar.b;
            ywj ywjVar = ywkVar2.b;
            if (ywjVar instanceof zdz) {
                ((zdz) ywjVar).d = false;
            }
            if (zeaVar.f != null) {
                zeaVar.f = new ywk(ywkVar2);
                zeaVar.f.b = ywkVar2.b;
            }
        }
        zeaVar.d = zeaVar.e;
        zeaVar.e = ywj.c;
        zeaVar.G = null;
        zeaVar.s();
        zeaVar.h = false;
        this.b.A(j, j2, ywkVar, z, j3, zgsVar);
    }

    /* JADX WARN: Code duplicated, block: B:410:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x0117  */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x07ae, code lost:
    
        if (r6.e.contains(r7.f()) != false) goto L414;
     */
    @Override // defpackage.ywd, defpackage.yxg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(defpackage.zhz r27) {
        /*
            Method dump skipped, instruction units count: 2433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zdz.h(zhz):void");
    }

    @Override // defpackage.ywd, defpackage.yxg
    public final void i(zhz zhzVar, yxj yxjVar) {
        h(zhzVar);
    }

    @Override // defpackage.ywd, defpackage.yxg
    public final void j(yvu yvuVar) {
        zea zeaVar = this.a;
        if (zeaVar.f != null && this.b == zeaVar.d) {
            zeaVar.E = yvuVar;
        }
        this.b.j(yvuVar);
    }

    @Override // defpackage.ywd, defpackage.yxg
    public final void r() {
        zea zeaVar = this.a;
        if (zeaVar.f != null && this.b == zeaVar.d && zeaVar.A) {
            return;
        }
        this.b.r();
    }

    @Override // defpackage.ywd, defpackage.yxg
    public final void y() {
        zea zeaVar = this.a;
        ywk ywkVar = zeaVar.f;
        if (ywkVar == null || this.b != zeaVar.d || ywkVar.i.aN() || !zeaVar.A || zeaVar.B) {
            this.b.y();
        } else {
            zeaVar.B = true;
        }
    }
}
