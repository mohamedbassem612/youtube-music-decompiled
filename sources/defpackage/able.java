package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class able extends acfx {
    final /* synthetic */ ablf a;
    private final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public able(ablf ablfVar, String str, long j, long j2) {
        super(j, j2, 1, 2, str);
        this.a = ablfVar;
        this.b = str;
    }

    @Override // defpackage.acfx
    protected final void c(long j) {
        acip acipVar;
        wjf wjfVarF;
        String str = this.b;
        ablf ablfVar = this.a;
        acga acgaVar = ablfVar.j;
        if ((str.equals(ablfVar.b) || !((acipVar = ablfVar.d) == null || (wjfVarF = acipVar.f()) == null || !wjfVarF.f().aA())) && acgaVar != null) {
            acgaVar.n(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // defpackage.acfx
    public final void d(boolean z, boolean z2, boolean z3, long j) {
        Object obj;
        long j2;
        long j3;
        wjf wjfVar;
        ablf ablfVar = this.a;
        abnx abnxVar = ablfVar.i;
        if (abnxVar == null) {
            obj = ablfVar.b;
            j2 = j;
        } else if (!((String) abnxVar.d).equals(ablfVar.b) || z2) {
            abnx abnxVar2 = ablfVar.i;
            long j4 = abnxVar2.b;
            obj = abnxVar2.d;
            j2 = j4;
        } else {
            obj = ablfVar.b;
            j2 = j;
        }
        abnx abnxVar3 = ablfVar.i;
        if (abnxVar3 != null) {
            if (((String) abnxVar3.d).equals(ablfVar.b)) {
                if (ablfVar.d(this.b)) {
                    return;
                }
            }
        } else if (ablfVar.d(this.b)) {
            return;
        }
        String str = this.b;
        String str2 = (String) obj;
        ablfVar.f(str2, str, j2, false, z2);
        ablfVar.f(str, str2, j, true, z2);
        acip acipVar = ablfVar.d;
        acjb acjbVar = ablfVar.c;
        if (acipVar == null || acjbVar == null) {
            j3 = j;
        } else {
            String strG = null;
            String str3 = true != ablfVar.d(str) ? str : null;
            acjd acjdVarC = acjbVar.c(str);
            aciw aciwVar = acjdVarC instanceof aciw ? (aciw) acjdVarC : null;
            if (aciwVar != null && (wjfVar = aciwVar.i) != null) {
                strG = wjfVar.G();
            }
            acipVar.aw().kk(new aaxt(ablfVar.b, str3, strG));
            j3 = j;
            acipVar.aw().kk(new aaxz(j3, true));
        }
        ablfVar.i = new abnx(str, j3, k());
    }

    @Override // defpackage.acfx
    protected final void e(long j) {
        if (!this.a.a.bS() && this.d && o(j)) {
            d(false, false, false, j);
        }
    }
}
