package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class vmu implements vxc {
    public final zwh a;
    public final ztf b;
    private final wco c;
    private final wbz d;
    private final Executor e;
    private final zta f;
    private final vxz g;
    private final aczl h;

    public vmu(zwh zwhVar, wco wcoVar, wbz wbzVar, ztf ztfVar, vxz vxzVar, Executor executor, vmx vmxVar, aczl aczlVar) {
        this.a = zwhVar;
        this.c = wcoVar;
        this.d = wbzVar;
        this.b = ztfVar;
        this.e = executor;
        this.h = aczlVar;
        this.g = vxzVar;
        this.f = ztfVar.p() ? new zta(ztfVar, vmxVar) : null;
    }

    private static final void d(String str, boolean z, wek wekVar) {
        String strG = wfs.g(318, str);
        strG.getClass();
        ahno.P(!strG.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = anqt.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anqt anqtVar = (anqt) aihfVarCreateBuilder.instance;
        anqtVar.b |= 1;
        anqtVar.c = strG;
        anqq anqqVar = new anqq(aihfVarCreateBuilder);
        aihf aihfVar = anqqVar.a;
        Boolean.valueOf(z).getClass();
        aihfVar.copyOnWrite();
        anqt anqtVar2 = (anqt) aihfVar.instance;
        anqtVar2.b |= 2;
        anqtVar2.d = z;
        anqs anqsVarAm = anqqVar.am();
        wer werVarE = wekVar.e();
        werVarE.e(anqsVarAm);
        werVarE.b().D();
    }

    @Override // defpackage.vxc
    public final void a(ajwo ajwoVar) {
        throw null;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amla.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(amla.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            amlh amlhVar = ((amla) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).g;
            if (amlhVar == null) {
                amlhVar = amlh.a;
            }
            int i = amlhVar.b & 1;
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(amla.b);
            ajwoVar.c(aihlVarCheckIsLite3);
            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
            amlh amlhVar2 = ((amla) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).g;
            if (amlhVar2 == null) {
                amlhVar2 = amlh.a;
            }
            if ((amlhVar2.b & 2) == 0 && i == 0) {
                return;
            }
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(amla.b);
            ajwoVar.c(aihlVarCheckIsLite4);
            Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
            Object objC = objK3 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK3);
            wco wcoVar = this.c;
            zwh zwhVar = this.a;
            amla amlaVar = (amla) objC;
            wcn wcnVarB = wcoVar.b(zwhVar.hw());
            wby wbyVarE = this.d.e(zwhVar.hw());
            amlh amlhVar3 = amlaVar.g;
            String str = (amlhVar3 == null ? amlh.a : amlhVar3).c;
            if (amlhVar3 == null) {
                amlhVar3 = amlh.a;
            }
            vxz vxzVar = this.g;
            String str2 = amlhVar3.d;
            if (vxzVar.l(222, 45757689L, false) && !str2.isEmpty()) {
                amlg amlgVarA = amlg.a(amlaVar.f);
                if (amlgVarA == null) {
                    amlgVarA = amlg.LIKE;
                }
                int iOrdinal = amlgVarA.ordinal();
                if (iOrdinal == 0) {
                    d(str2, true, wbyVarE);
                } else if (iOrdinal == 2) {
                    d(str2, false, wbyVarE);
                }
            }
            if (!str.isEmpty()) {
                amlb amlbVarE = amld.e(wfs.g(62, str));
                amlg amlgVarA2 = amlg.a(amlaVar.f);
                if (amlgVarA2 == null) {
                    amlgVarA2 = amlg.LIKE;
                }
                amlbVarE.am(amlgVarA2);
                amld amldVarAn = amlbVarE.an();
                wer werVarE = wcnVarB.e();
                werVarE.e(amldVarAn);
                werVarE.b();
                wer werVarE2 = wbyVarE.e();
                werVarE2.e(amldVarAn);
                werVarE2.b();
            }
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(amla.b);
            ajwoVar.c(aihlVarCheckIsLite5);
            Object objK4 = ajwoVar.j.k(aihlVarCheckIsLite5.d);
            amlg amlgVarA3 = amlg.a(((amla) (objK4 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK4))).f);
            if (amlgVarA3 == null) {
                amlgVarA3 = amlg.LIKE;
            }
            int iOrdinal2 = amlgVarA3.ordinal();
            if (iOrdinal2 == 0) {
                this.h.D(ajwoVar, map);
            } else if (iOrdinal2 == 1) {
                this.h.C(ajwoVar, map);
            } else if (iOrdinal2 == 2) {
                this.h.E(ajwoVar, map);
            }
            zta ztaVar = this.f;
            if (ztaVar == null) {
                this.e.execute(afwl.i(new uqd(this, ajwoVar, 8)));
                return;
            }
            zup zupVarQ = this.b.q();
            ajwoVar.getClass();
            zuf zufVar = new zuf(new rzt(ajwoVar, 15), zupVarQ, ztaVar);
            ztf ztfVar = zufVar.k.e;
            zufVar.l = ztfVar.a();
            ztfVar.k(zufVar);
        }
    }
}
