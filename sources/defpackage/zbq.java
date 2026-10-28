package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zbq extends zba {
    private final zdd l;
    private final yxr m;
    private final zjr n;

    public zbq(zgy zgyVar, zdd zddVar, cjz cjzVar, aae aaeVar, bzg bzgVar, aae aaeVar2, cra craVar, wiu wiuVar, wja wjaVar, zao zaoVar, String str, bss bssVar, wjr wjrVar, yxr yxrVar, zjr zjrVar) {
        super(zgyVar, cjzVar, aaeVar, bzgVar, aaeVar2, craVar, wiuVar, wjaVar, zaoVar, str, bssVar, wjrVar);
        this.l = zddVar;
        this.m = yxrVar;
        this.n = zjrVar;
    }

    @Override // defpackage.zba
    protected final cpl u(aami aamiVar, cqs cqsVar) {
        cpl cplVarA;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < cqsVar.q(); i++) {
            int iN = cqsVar.n(i);
            wgs wgsVar = ((wgs[]) aamiVar.b)[iN];
            if (wgsVar.Z()) {
                arrayList.add(Integer.valueOf(iN));
                arrayList3.add(wgsVar);
            } else {
                arrayList2.add(Integer.valueOf(iN));
            }
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (int i2 = 0; i2 < cqsVar.d().a; i2++) {
            wgs wgsVar2 = ((wgs[]) aamiVar.b)[i2];
            if (!wgsVar2.Z()) {
                arrayList4.add(Integer.valueOf(i2));
                arrayList5.add(wgsVar2);
            }
        }
        zbm zbmVar = null;
        if (arrayList2.isEmpty()) {
            cplVarA = null;
        } else {
            aami aamiVar2 = new aami(aamiVar.a, (wgs[]) arrayList5.toArray(new wgs[0]));
            zbs zbsVar = new zbs(cqsVar, ahng.S(arrayList4), ahng.S(arrayList2));
            cio cioVarD = this.b.d(this.c);
            cplVarA = this.l.a(cioVarD, (wgs[]) aamiVar2.b, yno.T(cioVarD, aamiVar2), zbsVar, aamiVar2.a, this.g, this.a, this.m);
        }
        if (!arrayList.isEmpty()) {
            aami aamiVar3 = new aami(aamiVar.a, (wgs[]) arrayList3.toArray(new wgs[0]));
            int[] iArrS = ahng.S(arrayList);
            zbs zbsVar2 = new zbs(cqsVar, iArrS, iArrS);
            wiu wiuVar = this.a;
            Object obj = aamiVar3.b;
            zgy zgyVar = this.e;
            bzg bzgVar = this.g;
            String str = this.c;
            int i3 = aamiVar3.a;
            zdd zddVar = this.l;
            zbmVar = new zbm(wiuVar, (wgs[]) obj, zgyVar, bzgVar, zbsVar2, str, i3, zddVar.b, zddVar.a, this.n);
        }
        if (cplVarA == null) {
            if (zbmVar != null) {
                return zbmVar;
            }
            throw new IllegalStateException("no_formats_selected");
        }
        if (zbmVar == null) {
            return cplVarA;
        }
        cpl[] cplVarArr = new cpl[cqsVar.q()];
        for (int i4 = 0; i4 < cqsVar.q(); i4++) {
            cplVarArr[i4] = true != ((wgs[]) aamiVar.b)[cqsVar.n(i4)].Z() ? cplVarA : zbmVar;
        }
        return new zbt(cqsVar, cplVarArr);
    }

    @Override // defpackage.zba
    protected final void s(cpl cplVar) {
    }
}
