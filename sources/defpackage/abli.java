package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abli extends acfx {
    public final long a;
    final /* synthetic */ ablk b;
    private final String c;
    private final wjf k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abli(ablk ablkVar, String str, wjf wjfVar, long j, long j2, long j3) {
        super(j2, j3, 1, 2, str);
        this.b = ablkVar;
        this.c = str;
        this.k = wjfVar;
        this.a = j;
    }

    @Override // defpackage.acfx
    public final void d(boolean z, boolean z2, boolean z3, long j) {
        ablk ablkVar = this.b;
        ablkVar.g = this;
        int i = ablkVar.m;
        boolean z4 = i == 2 || (i == 3 && z2);
        boolean z5 = i == 1;
        ablkVar.m = 3;
        long j2 = ablkVar.f;
        if (j2 == -1) {
            j2 = j;
        }
        ablj abljVar = ablkVar.l;
        if (abljVar == null) {
            String str = ablkVar.b;
            abljVar = new ablj(str, ablkVar.c(str), -1L);
        }
        String str2 = this.c;
        wjf wjfVar = this.k;
        long j3 = j2;
        ablj abljVar2 = new ablj(str2, wjfVar, this.a);
        ablkVar.l = abljVar2;
        ablkVar.f = k();
        if (Objects.equals(abljVar.b, str2)) {
            return;
        }
        ablj abljVar3 = abljVar;
        ablkVar.h(abljVar3, abljVar2, j3, false, z4, z5);
        ablkVar.h(abljVar2, abljVar3, j, true, z4, z5);
        if (true == ablkVar.i(str2)) {
            str2 = null;
        }
        ablkVar.c.aw().kk(new aaxt(ablkVar.b, str2, wjfVar != null ? wjfVar.G() : null));
        ablkVar.c.aw().kk(new aaxz(j, true));
    }

    @Override // defpackage.acfx
    protected final void e(long j) {
        if (!this.b.a.bS() && this.d && o(j)) {
            d(false, false, false, j);
        }
    }

    @Override // defpackage.acfx
    protected final void f(long j, acgb acgbVar, acgb acgbVar2) {
        acge acgeVar = new acge(acgbVar.a, acgbVar.b, 0, null);
        acge acgeVar2 = new acge(acgbVar2.a, acgbVar2.b, 0, null);
        if (acgeVar.o(j) || !acgeVar2.o(j)) {
            return;
        }
        d(false, false, false, j);
    }
}
