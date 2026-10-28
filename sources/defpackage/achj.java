package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class achj implements achv {
    public String a;
    private final abmt b;
    private final aawa c;
    private final achs d;

    public achj(String str, abmt abmtVar, aawa aawaVar) {
        this.b = abmtVar;
        aawaVar.getClass();
        this.c = aawaVar;
        this.a = null;
        this.d = new achi(this, str);
    }

    private static int a(achu achuVar) {
        alvl alvlVar = achuVar.a;
        if (alvlVar == null) {
            return 4;
        }
        if (aaje.q(alvlVar)) {
            return 0;
        }
        aony aonyVarA = aony.a(alvlVar.c);
        if (aonyVarA == null) {
            aonyVarA = aony.OK;
        }
        return aonyVarA != aony.ERROR ? 2 : 4;
    }

    @Override // defpackage.achv
    public final int b(achu achuVar) {
        return a(achuVar);
    }

    @Override // defpackage.achv
    public final int c(achu achuVar) {
        return a(achuVar);
    }

    @Override // defpackage.achv
    public final aboe d(alvl alvlVar) {
        int iD;
        if (aaje.q(alvlVar)) {
            return null;
        }
        if (alvlVar != null) {
            int i = alvlVar.c;
            aony aonyVarA = aony.a(i);
            if (aonyVarA == null) {
                aonyVarA = aony.OK;
            }
            if (aonyVarA != aony.ERROR) {
                aony aonyVarA2 = aony.a(i);
                if (aonyVarA2 == null) {
                    aonyVarA2 = aony.OK;
                }
                int i2 = 9;
                if (aonyVarA2 == aony.UNPLAYABLE && (iD = agvp.D(alvlVar.d)) != 0 && iD == 1001) {
                    i2 = 17;
                }
                return new aboe(i2, true, 1, alvlVar.e, null, null, null, this.b.aD() ? aaje.m(alvlVar) : null);
            }
        }
        return new aboe(7, true, 1, null, null, null, null, null);
    }

    @Override // defpackage.achv
    public final aboe e(wno wnoVar) {
        return new aboe(8, true, 1, null, wnoVar, null, null, null);
    }

    @Override // defpackage.achv
    public final achs f() {
        return this.d;
    }

    @Override // defpackage.achv
    public final void l() {
        this.a = null;
    }

    @Override // defpackage.achv
    public final boolean m(achq achqVar, achu achuVar) {
        if (achqVar == null) {
            return false;
        }
        abmt abmtVar = this.b;
        boolean z = abmtVar.bL() && achqVar.k;
        if (!achqVar.j && !abmtVar.bk() && !z) {
            return false;
        }
        alvf alvfVar = achqVar.e;
        wja wjaVar = achqVar.d;
        boolean z2 = wjaVar != null && wjaVar.A;
        byte[] bArr = achqVar.b;
        if (alvfVar != null) {
            this.a = alvfVar.c;
        }
        return this.c.c && aavv.l(alvfVar) && aavv.m(bArr) && aavv.n(abmtVar, alvfVar, z2);
    }

    @Override // defpackage.achv
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.achv
    public final /* synthetic */ void i(aazj aazjVar) {
    }

    @Override // defpackage.achv
    public final /* synthetic */ void j(aazk aazkVar) {
    }

    @Override // defpackage.achv
    public final /* synthetic */ void k(aazn aaznVar) {
    }
}
