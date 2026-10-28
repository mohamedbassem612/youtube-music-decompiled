package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zbf extends zba {
    private final yxb l;
    private final zfc m;
    private final AtomicLong n;
    private final zbk o;
    private final zjr p;
    private final tfq q;
    private final xxj[] r;

    public zbf(zgy zgyVar, cjz cjzVar, aae aaeVar, bzg bzgVar, aae aaeVar2, cra craVar, wiu wiuVar, wja wjaVar, yxb yxbVar, zfc zfcVar, zbg zbgVar, String str, bss bssVar, wjr wjrVar, xxj[] xxjVarArr, tfq tfqVar, zjr zjrVar) {
        super(zgyVar, cjzVar, aaeVar, bzgVar, aaeVar2, craVar, wiuVar, wjaVar, zbgVar, str, bssVar, wjrVar);
        this.n = new AtomicLong(-9223372036854775807L);
        zkf.a(!wjaVar.t.isEmpty());
        this.l = yxbVar;
        this.m = zfcVar;
        this.o = new zbk(((wgs) wjaVar.t.get(0)).h());
        this.r = xxjVarArr;
        this.q = tfqVar;
        this.p = zjrVar;
    }

    @Override // defpackage.zba, defpackage.cnk
    public final long e() {
        return this.n.getAndSet(-9223372036854775807L);
    }

    @Override // defpackage.zba, defpackage.cnk, defpackage.coq
    public final boolean o(ccy ccyVar) {
        ywu ywuVarL;
        for (cpk cpkVar : this.j) {
            cpl cplVar = cpkVar.e;
            if ((cplVar instanceof zbd) && (ywuVarL = ((zbd) cplVar).l()) != null && ywuVarL.g()) {
                ywuVarL.c(new ywt(this, 14));
                return false;
            }
        }
        return super.o(ccyVar);
    }

    @Override // defpackage.zba
    protected final void s(cpl cplVar) {
        if (cplVar instanceof zbd) {
            this.o.e((zbd) cplVar);
        }
    }

    @Override // defpackage.zba
    protected final cpl u(aami aamiVar, cqs cqsVar) {
        zfc zfcVar = this.m;
        zbk zbkVar = this.o;
        wja wjaVar = this.b;
        zao zaoVar = this.d;
        Object obj = aamiVar.b;
        String str = this.c;
        int i = aamiVar.a;
        boolean zH = wjaVar.H();
        boolean zF = wjaVar.F();
        zbd zbdVar = new zbd(this.a, (wgs[]) obj, this.e, this.l, this.g, (zbg) zaoVar, cqsVar, zfcVar, zbkVar, str, i, zH, zF, this.i, this.r, this.q, this.p);
        zbkVar.c(zbdVar);
        return zbdVar;
    }
}
