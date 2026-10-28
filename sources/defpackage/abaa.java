package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abaa implements agat {
    public static final /* synthetic */ int a = 0;
    private static final acca b = acca.b("");
    private final agau c;
    private final abvn d;
    private final Optional e;

    public abaa(may mayVar, abvn abvnVar) {
        Optional optionalEmpty = Optional.empty();
        abvnVar.getClass();
        this.d = abvnVar;
        this.e = optionalEmpty;
        this.c = (agau) mayVar.b(new afzb(6), new aazx(mayVar, abvnVar, 3, null));
    }

    @Override // defpackage.agat
    public final aigv a(asho ashoVar) {
        abvk abvkVarO = this.d.o();
        aifz aifzVar = ashoVar.b;
        if (aifzVar == null) {
            aifzVar = aifz.a;
        }
        abvkVarO.an(aifzVar.b);
        return aigv.a;
    }

    @Override // defpackage.agat
    public final aigv b(asgs asgsVar) {
        if ((asgsVar.b & 1) != 0) {
            abnk abnkVar = new abnk();
            ajwo ajwoVar = asgsVar.c;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            abnkVar.a = ajwoVar;
            abnkVar.g = Boolean.valueOf(asgsVar.d);
            this.d.n().g(abnkVar.a());
        }
        return aigv.a;
    }

    @Override // defpackage.agat
    public final aigv c(ashn ashnVar) {
        this.d.o().af(ashnVar.b);
        return aigv.a;
    }

    @Override // defpackage.agat
    public final aigv d(asfz asfzVar) {
        abvk abvkVarO = this.d.o();
        ajhl ajhlVar = asfzVar.b;
        if (ajhlVar == null) {
            ajhlVar = ajhl.a;
        }
        abvkVarO.F(ajhlVar.d);
        return aigv.a;
    }

    @Override // defpackage.agat
    public final aigv e(asgb asgbVar) {
        if ((asgbVar.b & 1) != 0 && this.d.g().Z()) {
            this.e.isPresent();
        }
        return aigv.a;
    }

    @Override // defpackage.agat
    public final aigv f(asgd asgdVar) {
        if ((asgdVar.b & 1) == 0) {
            return aigv.a;
        }
        abvn abvnVar = this.d;
        List listE = abvnVar.v().e();
        if (listE == null) {
            listE = new ArrayList();
        }
        int i = 13;
        Optional optionalFindFirst = Stream.CC.concat(Collection.EL.stream(listE), Collection.EL.stream(abvnVar.v().d())).filter(new aajl(asgdVar, i)).findFirst();
        abvk abvkVarO = abvnVar.o();
        abvkVarO.getClass();
        yyk yykVar = new yyk(abvkVarO, i);
        if (true == optionalFindFirst.isPresent()) {
            Object obj = optionalFindFirst.get();
            ((abvk) yykVar.a).K((acca) obj);
        }
        return aigv.a;
    }

    /* JADX WARN: Type inference failed for: r6v11, types: [acey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13, types: [abwy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [acey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [abwy, java.lang.Object] */
    @Override // defpackage.agat
    public final aigv g(asha ashaVar) {
        arfb arfbVarA;
        int i = ashaVar.b;
        if (i == 2) {
            asgy asgyVar = (asgy) ashaVar.c;
            int i2 = asgyVar.d;
            aipc aipcVarA = aipc.a(asgyVar.g);
            if (aipcVarA == null) {
                aipcVarA = aipc.QUALITY_ORDINAL_UNKNOWN;
            }
            wiw wiwVar = new wiw(i2, aipcVarA, asgyVar.c, asgyVar.e, agkz.n(asgyVar.f));
            abvk abvkVarO = this.d.o();
            if (abvkVarO.i.bb()) {
                abvkVarO.v.a.f(new abxl(wiwVar.a, wiwVar.d, wiwVar.e));
            } else {
                ?? r6 = abvkVarO.o.d;
                if (r6 != 0) {
                    r6.Y(wiwVar);
                }
            }
        } else if (i == 1) {
            abvk abvkVarO2 = this.d.o();
            if (ashaVar.b != 1 || (arfbVarA = arfb.a(((Integer) ashaVar.c).intValue())) == null) {
                arfbVarA = arfb.VIDEO_QUALITY_SETTING_UNKNOWN;
            }
            if (abvkVarO2.i.bb()) {
                abvkVarO2.v.a.f(new abxm(arfbVarA));
            } else {
                ?? r7 = abvkVarO2.o.d;
                if (r7 != 0) {
                    r7.Z(arfbVarA);
                }
            }
        }
        return aigv.a;
    }

    @Override // defpackage.agat
    public final aigv h(ashb ashbVar) {
        abvn abvnVar = this.d;
        if (abvnVar.o() != null) {
            abvnVar.o().J(ashbVar.b);
        }
        return aigv.a;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [abwy, java.lang.Object] */
    @Override // defpackage.agat
    public final aigv i(ashd ashdVar) {
        this.d.aA().c.f(new abxj(ashdVar.c, Float.valueOf(ashdVar.d)));
        return aigv.a;
    }

    @Override // defpackage.agat
    public final aigv j() {
        this.d.o().K(b);
        return aigv.a;
    }

    @Override // defpackage.agat
    public final asgm k() {
        accc acccVar;
        acag acagVarV = this.d.v();
        acca accaVarB = acagVarV.b();
        if (accaVarB == null && (acccVar = acagVarV.o) != null) {
            accaVarB = (acca) Collection.EL.stream(acccVar.h()).filter(new aaep(16)).findFirst().orElse(null);
        }
        if (accaVarB != null) {
            acagVarV.n(new aazb(accaVarB, aazh.b, 0, acagVarV.c()));
        }
        aihf aihfVarCreateBuilder = asgm.a.createBuilder();
        if (accaVarB != null) {
            aihf aihfVarCreateBuilder2 = ajoj.a.createBuilder();
            String string = typ.b(accaVarB.p).toString();
            aihfVarCreateBuilder2.copyOnWrite();
            ajoj ajojVar = (ajoj) aihfVarCreateBuilder2.instance;
            string.getClass();
            ajojVar.b |= 1;
            ajojVar.c = string;
            aihfVarCreateBuilder2.copyOnWrite();
            ajoj ajojVar2 = (ajoj) aihfVarCreateBuilder2.instance;
            String str = accaVarB.k;
            str.getClass();
            ajojVar2.b |= 2;
            ajojVar2.d = str;
            aihfVarCreateBuilder2.copyOnWrite();
            ajoj ajojVar3 = (ajoj) aihfVarCreateBuilder2.instance;
            String str2 = accaVarB.a;
            str2.getClass();
            ajojVar3.b |= 4;
            ajojVar3.e = str2;
            aihfVarCreateBuilder.copyOnWrite();
            asgm asgmVar = (asgm) aihfVarCreateBuilder.instance;
            ajoj ajojVar4 = (ajoj) aihfVarCreateBuilder2.build();
            ajojVar4.getClass();
            asgmVar.c = ajojVar4;
            asgmVar.b |= 1;
        }
        return (asgm) aihfVarCreateBuilder.build();
    }

    @Override // defpackage.agat
    public final asgc l() {
        if (this.d.g().Z()) {
            this.e.isPresent();
        }
        aihf aihfVarCreateBuilder = asgc.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        asgc asgcVar = (asgc) aihfVarCreateBuilder.instance;
        asgcVar.b |= 1;
        asgcVar.c = false;
        return (asgc) aihfVarCreateBuilder.build();
    }

    @Override // defpackage.agat
    public final ashe m() {
        aihf aihfVarCreateBuilder = ashe.a.createBuilder();
        float fA = this.d.o().a();
        aihfVarCreateBuilder.copyOnWrite();
        ashe asheVar = (ashe) aihfVarCreateBuilder.instance;
        asheVar.b |= 1;
        asheVar.c = fA;
        return (ashe) aihfVarCreateBuilder.build();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [abwy, java.lang.Object] */
    @Override // defpackage.agat
    public final asfx n() {
        abxg abxgVar = (abxg) this.d.aA().c.a();
        aihf aihfVarCreateBuilder = ashd.a.createBuilder();
        abxj abxjVar = abxgVar.c;
        float f = abxjVar.b;
        aihfVarCreateBuilder.copyOnWrite();
        ashd ashdVar = (ashd) aihfVarCreateBuilder.instance;
        ashdVar.b |= 1;
        ashdVar.c = f;
        Float f2 = abxjVar.c;
        if (f2 != null) {
            float fFloatValue = f2.floatValue();
            aihfVarCreateBuilder.copyOnWrite();
            ashd ashdVar2 = (ashd) aihfVarCreateBuilder.instance;
            ashdVar2.b |= 2;
            ashdVar2.d = fFloatValue;
        }
        aihf aihfVarCreateBuilder2 = asfx.a.createBuilder();
        float f3 = abxgVar.b;
        aihfVarCreateBuilder2.copyOnWrite();
        asfx asfxVar = (asfx) aihfVarCreateBuilder2.instance;
        asfxVar.b |= 1;
        asfxVar.c = f3;
        ashd ashdVar3 = (ashd) aihfVarCreateBuilder.build();
        aihfVarCreateBuilder2.copyOnWrite();
        asfx asfxVar2 = (asfx) aihfVarCreateBuilder2.instance;
        ashdVar3.getClass();
        asfxVar2.d = ashdVar3;
        asfxVar2.b |= 2;
        return (asfx) aihfVarCreateBuilder2.build();
    }

    @Override // defpackage.agat
    public final ashk o() {
        aihf aihfVarCreateBuilder = ashk.a.createBuilder();
        aihf aihfVarCreateBuilder2 = ashj.a.createBuilder();
        String strH = this.c.h();
        aihfVarCreateBuilder2.copyOnWrite();
        ashj ashjVar = (ashj) aihfVarCreateBuilder2.instance;
        strH.getClass();
        ashjVar.b |= 1;
        ashjVar.c = strH;
        ashj ashjVar2 = (ashj) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        ashk ashkVar = (ashk) aihfVarCreateBuilder.instance;
        ashjVar2.getClass();
        ashkVar.c = ashjVar2;
        ashkVar.b |= 1;
        return (ashk) aihfVarCreateBuilder.build();
    }

    @Override // defpackage.agat
    public final ashp p() {
        aihf aihfVarCreateBuilder = ashp.a.createBuilder();
        aifz aifzVarA = aifz.a(this.d.o().T());
        aihfVarCreateBuilder.copyOnWrite();
        ashp ashpVar = (ashp) aihfVarCreateBuilder.instance;
        aifzVarA.getClass();
        ashpVar.c = aifzVarA;
        ashpVar.b |= 1;
        return (ashp) aihfVarCreateBuilder.build();
    }

    @Override // defpackage.agat
    public final aigv q() {
        this.d.o().ap(false, 19);
        return aigv.a;
    }

    @Override // defpackage.agat
    public final aigv r() {
        this.d.o().A();
        return aigv.a;
    }

    @Override // defpackage.agat
    public final aigv s() {
        this.d.o().D();
        return aigv.a;
    }
}
