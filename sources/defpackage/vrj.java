package defpackage;

import j$.util.Collection;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vrj implements vri {
    private final ajwo a;
    private final Optional b;
    private final Optional c;
    private final Optional d;
    private final acxn e;
    private final acxx f;

    public vrj(ajwo ajwoVar, Optional optional, Optional optional2, Optional optional3, acxx acxxVar, acxn acxnVar) {
        this.a = ajwoVar;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
        this.f = acxxVar;
        this.e = acxnVar;
    }

    private final acxd c(aolg aolgVar, Optional optional) {
        aihf aihfVarCreateBuilder = acxd.a.createBuilder();
        if (optional.isPresent()) {
            Object obj = optional.get();
            aihfVarCreateBuilder.copyOnWrite();
            acxd acxdVar = (acxd) aihfVarCreateBuilder.instance;
            acxdVar.b |= 1;
            acxdVar.c = (String) obj;
        }
        if ((aolgVar.b & 1) != 0) {
            apji apjiVar = aolgVar.c;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aigj aigjVarA = a(apjiVar);
            aihfVarCreateBuilder.copyOnWrite();
            acxd acxdVar2 = (acxd) aihfVarCreateBuilder.instance;
            aigjVarA.getClass();
            acxdVar2.b |= 4;
            acxdVar2.e = aigjVarA;
        }
        if (aolgVar.g.size() > 0) {
            aihfVarCreateBuilder.ai((Iterable) Collection.EL.stream(aolgVar.g).map(new uot(this, 18)).collect(aghu.a));
        }
        if ((aolgVar.b & 2) != 0) {
            if (aolgVar.h) {
                apji apjiVar2 = aolgVar.d;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aigj aigjVarA2 = a(apjiVar2);
                aihfVarCreateBuilder.copyOnWrite();
                acxd acxdVar3 = (acxd) aihfVarCreateBuilder.instance;
                aigjVarA2.getClass();
                acxdVar3.b |= 16;
                acxdVar3.h = aigjVarA2;
            } else {
                apji apjiVar3 = aolgVar.d;
                if (apjiVar3 == null) {
                    apjiVar3 = apji.a;
                }
                aigj aigjVarA3 = a(apjiVar3);
                aihfVarCreateBuilder.copyOnWrite();
                acxd acxdVar4 = (acxd) aihfVarCreateBuilder.instance;
                aigjVarA3.getClass();
                acxdVar4.a();
                acxdVar4.f.add(aigjVarA3);
            }
        }
        if ((aolgVar.b & 4) != 0) {
            apji apjiVar4 = aolgVar.e;
            if (apjiVar4 == null) {
                apjiVar4 = apji.a;
            }
            aigj aigjVarA4 = a(apjiVar4);
            aihfVarCreateBuilder.copyOnWrite();
            acxd acxdVar5 = (acxd) aihfVarCreateBuilder.instance;
            aigjVarA4.getClass();
            acxdVar5.b |= 8;
            acxdVar5.g = aigjVarA4;
        }
        return (acxd) aihfVarCreateBuilder.build();
    }

    public final aigj a(apji apjiVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        return aigj.v(this.e.a((akrn) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c);
    }

    @Override // defpackage.vri
    public final void b(aoln aolnVar) {
        Optional optionalEmpty;
        amzi amziVar;
        acxd acxdVarC = c(aolnVar.b == 441573002 ? (aolg) aolnVar.c : aolg.a, this.b);
        ajwo ajwoVar = this.a;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apyi.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        Object objC = objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK);
        acxx acxxVar = this.f;
        apyi apyiVar = (apyi) objC;
        if ((apyiVar.c & 2) != 0) {
            apmn apmnVar = apyiVar.e;
            if (apmnVar == null) {
                apmnVar = apmn.a;
            }
            optionalEmpty = Optional.of(apmnVar);
        } else {
            optionalEmpty = Optional.empty();
        }
        Optional optional = this.d;
        Optional optional2 = this.c;
        Optional optionalEmpty2 = Optional.empty();
        Optional optional3 = optionalEmpty;
        Optional optionalEmpty3 = Optional.empty();
        Optional optionalOf = Optional.of(ajwoVar);
        Optional optionalEmpty4 = Optional.empty();
        Optional optionalOf2 = Optional.of(Boolean.valueOf(apyiVar.f));
        Optional optionalEmpty5 = Optional.empty();
        int iAV = a.aV(apyiVar.g);
        if (iAV == 0) {
            iAV = 1;
        }
        boolean z = apyiVar.i;
        int iAU = a.aU(apyiVar.j);
        if (iAU == 0) {
            iAU = 1;
        }
        akeg akegVar = apyiVar.h;
        if (akegVar == null) {
            akegVar = akeg.a;
        }
        if ((akegVar.b & 16) != 0) {
            akeg akegVar2 = apyiVar.h;
            if (akegVar2 == null) {
                akegVar2 = akeg.a;
            }
            amziVar = akegVar2.c;
            if (amziVar == null) {
                amziVar = amzi.a;
            }
        } else {
            amziVar = null;
        }
        acxxVar.k(acxdVarC, optional3, optionalEmpty2, optional, optional2, optionalEmpty3, optionalOf, optionalEmpty4, optionalOf2, optionalEmpty5, iAV, new adzc(z, iAU, amziVar));
    }

    @Override // defpackage.vri
    public final void e() {
        this.f.f(this.b);
    }

    @Override // defpackage.vri
    public final void f(aoln aolnVar, byte[] bArr) {
        aolg aolgVar = aolnVar.b == 441573002 ? (aolg) aolnVar.c : aolg.a;
        Optional optional = this.b;
        acxd acxdVarC = c(aolgVar, optional);
        acxx acxxVar = this.f;
        acxxVar.g(bArr, (String) optional.orElse(null));
        acxxVar.h(acxdVarC);
    }
}
