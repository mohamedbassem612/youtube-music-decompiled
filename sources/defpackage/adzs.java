package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adzs implements aeem {
    public final xgn a;
    private final xgm b;
    private final Optional c;
    private final xgj d = new xgj(xhb.b(147225));
    private final xgj e = new xgj(xhb.b(148565));

    public adzs(xgn xgnVar, xgm xgmVar, Optional optional) {
        this.a = xgnVar;
        this.b = xgmVar;
        this.c = optional;
    }

    @Override // defpackage.aeem
    public final void a(Object obj, int i) {
        if (i == 0) {
            this.a.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_SWIPE, this.d, null);
        } else if (i == 2 || i == 3 || i == 4) {
            this.a.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_AUTOMATED, this.d, null);
        }
        this.a.t();
    }

    @Override // defpackage.aeem
    public final void b(Object obj) {
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        xgn xgnVarHB = this.b.hB();
        if (xgnVarHB != null) {
            xgj xgjVar = this.e;
            xgnVarHB.d(xgjVar);
            xgnVarHB.w(xgjVar, null);
            aihl aihlVar = aoaq.b;
            aihf aihfVarCreateBuilder = aoar.a.createBuilder();
            String strI = xgnVarHB.i();
            aihfVarCreateBuilder.copyOnWrite();
            aoar aoarVar = (aoar) aihfVarCreateBuilder.instance;
            strI.getClass();
            aoarVar.b |= 1;
            aoarVar.c = strI;
            aihfVarCreateBuilder.copyOnWrite();
            aoar aoarVar2 = (aoar) aihfVarCreateBuilder.instance;
            aoarVar2.b |= 2;
            aoarVar2.d = 148565;
            aihhVar.e(aihlVar, (aoar) aihfVarCreateBuilder.build());
        }
        xgn xgnVar = this.a;
        xgnVar.D(xhb.a(147036), xgu.b, (ajwo) aihhVar.build());
        xgj xgjVar2 = this.d;
        xgnVar.d(xgjVar2);
        xgnVar.w(xgjVar2, null);
        this.c.isPresent();
    }
}
