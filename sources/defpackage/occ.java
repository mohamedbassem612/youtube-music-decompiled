package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class occ implements aupn {
    private final aupr a;
    private final aupr b;
    private final aupr c;
    private final aupr d;
    private final aupr e;
    private final aupr f;
    private final aupr g;
    private final aupr h;
    private final aupr i;
    private final aupr j;

    public occ(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, aupr auprVar5, aupr auprVar6, aupr auprVar7, aupr auprVar8, aupr auprVar9, aupr auprVar10) {
        this.a = auprVar;
        this.b = auprVar2;
        this.c = auprVar3;
        this.d = auprVar4;
        this.e = auprVar5;
        this.f = auprVar6;
        this.g = auprVar7;
        this.h = auprVar8;
        this.i = auprVar9;
        this.j = auprVar10;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* bridge */ /* synthetic */ Object io() {
        ahex ahexVar = (ahex) this.a.io();
        ocd ocdVar = (ocd) this.b.io();
        ocu ocuVar = (ocu) this.c.io();
        Object obj = ((aupo) this.d).b;
        Object obj2 = ((aupo) this.e).b;
        Object obj3 = ((aupo) this.f).b;
        return new aerj(ahexVar, ocdVar, ocuVar, (obb) obj, (String) obj2, (fxg) obj3, this.g, this.h, this.i, (omj) this.j.io());
    }
}
