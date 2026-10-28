package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aaak {
    public boolean a;
    private final xeu b;
    private final boolean c;
    private final abte d;

    public aaak(xeu xeuVar, abte abteVar, vyo vyoVar, vxu vxuVar) {
        this.b = xeuVar;
        this.d = abteVar;
        boolean z = false;
        if (vxuVar.c() != null) {
            amuc amucVar = vxuVar.c().p;
            akzo akzoVar = (amucVar == null ? amuc.a : amucVar).d;
            if ((akzoVar == null ? akzo.a : akzoVar).d) {
                z = true;
            }
        }
        this.c = z;
        vyoVar.d().af(new zgd(this, 9));
    }

    public final void a(int i, ajda ajdaVar) {
        if (ajdaVar == null || (ajdaVar.b & SemanticState.Multiline) == 0) {
            return;
        }
        aocc aoccVar = ajdaVar.t;
        if (aoccVar == null) {
            aoccVar = aocc.a;
        }
        b(i, aoccVar);
    }

    public final void b(int i, aocc aoccVar) {
        if (aoccVar != null) {
            if (this.a || aoccVar.c) {
                aihf aihfVarCreateBuilder = aoca.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aoca aocaVar = (aoca) aihfVarCreateBuilder.instance;
                aocaVar.c = aoccVar;
                aocaVar.b |= 1;
                aihfVarCreateBuilder.copyOnWrite();
                aoca aocaVar2 = (aoca) aihfVarCreateBuilder.instance;
                int i2 = i - 1;
                aocaVar2.d = i2;
                aocaVar2.b |= 4;
                xeu xeuVar = this.b;
                if (xeuVar.b) {
                    xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.NOTAIRE_EVENT);
                    ztf ztfVar = xffVarA.k.e;
                    xffVarA.l = ztfVar.a();
                    ztfVar.k(xffVarA);
                } else {
                    alos alosVar = (alos) alou.a.createBuilder();
                    alosVar.copyOnWrite();
                    alou alouVar = (alou) alosVar.instance;
                    aoca aocaVar3 = (aoca) aihfVarCreateBuilder.build();
                    aocaVar3.getClass();
                    alouVar.d = aocaVar3;
                    alouVar.c = 298;
                    xeuVar.b((alou) alosVar.build());
                }
                if (this.c) {
                    abte abteVar = this.d;
                    xfh xfhVar = new xfh(i2, 2);
                    aihf aihfVarCreateBuilder2 = akzk.a.createBuilder();
                    aihf aihfVarCreateBuilder3 = aocb.a.createBuilder();
                    aihfVarCreateBuilder3.copyOnWrite();
                    aocb aocbVar = (aocb) aihfVarCreateBuilder3.instance;
                    aocbVar.c = aoccVar;
                    aocbVar.b |= 1;
                    aihfVarCreateBuilder2.copyOnWrite();
                    akzk akzkVar = (akzk) aihfVarCreateBuilder2.instance;
                    aocb aocbVar2 = (aocb) aihfVarCreateBuilder3.build();
                    aocbVar2.getClass();
                    akzkVar.d = aocbVar2;
                    akzkVar.b |= 1;
                    xfhVar.a = (akzk) aihfVarCreateBuilder2.build();
                    abteVar.e(xfhVar, alai.FLOW_TYPE_NOTAIRE, aoccVar.b);
                }
            }
        }
    }
}
