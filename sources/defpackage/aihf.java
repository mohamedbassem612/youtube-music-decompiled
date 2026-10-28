package defpackage;

import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.android.apps.youtube.proto.streaming.MediaCapabilitiesOuterClass$MediaCapabilities;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ErrorMetaData;
import com.google.protos.youtube.api.innertube.InnertubeContext$ClientInfo;
import com.google.protos.youtube.api.innertube.StreamingDataOuterClass$StreamingData;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aihf extends aifr implements aiis, jrs, auau {
    private final aihn defaultInstance;
    public aihn instance;

    public aihf(aihn aihnVar) {
        this.defaultInstance = aihnVar;
        if (aihnVar.isMutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.instance = newMutableInstance();
    }

    private static void mergeFromInstance(aihn aihnVar, aihn aihnVar2) {
        aiiz.a.a(aihnVar).h(aihnVar, aihnVar2);
    }

    private aihn newMutableInstance() {
        return this.defaultInstance.newMutableInstance();
    }

    public final void A(aigj aigjVar) {
        copyOnWrite();
        fxp fxpVar = (fxp) this.instance;
        fxp fxpVar2 = fxp.a;
        aigjVar.getClass();
        aiie aiieVar = fxpVar.c;
        if (!aiieVar.c()) {
            fxpVar.c = aihn.mutableCopy(aiieVar);
        }
        fxpVar.c.add(aigjVar);
    }

    public final void B(jrn jrnVar) {
        copyOnWrite();
        MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilities = (MediaCapabilitiesOuterClass$MediaCapabilities) this.instance;
        MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilities2 = MediaCapabilitiesOuterClass$MediaCapabilities.a;
        jrnVar.getClass();
        aiie aiieVar = mediaCapabilitiesOuterClass$MediaCapabilities.d;
        if (!aiieVar.c()) {
            mediaCapabilitiesOuterClass$MediaCapabilities.d = aihn.mutableCopy(aiieVar);
        }
        mediaCapabilitiesOuterClass$MediaCapabilities.d.add(jrnVar);
    }

    public final lip C(int i) {
        return (lip) ((lin) this.instance).c.get(i);
    }

    public final void D(lip lipVar) {
        copyOnWrite();
        lin linVar = (lin) this.instance;
        lin linVar2 = lin.a;
        lipVar.getClass();
        linVar.a();
        linVar.c.add(lipVar);
    }

    public final void E(int i) {
        copyOnWrite();
        lin linVar = (lin) this.instance;
        lin linVar2 = lin.a;
        linVar.a();
        linVar.c.remove(i);
    }

    public final void F(int i, lip lipVar) {
        copyOnWrite();
        lin linVar = (lin) this.instance;
        lin linVar2 = lin.a;
        lipVar.getClass();
        linVar.a();
        linVar.c.set(i, lipVar);
    }

    public final void G(Iterable iterable) {
        copyOnWrite();
        liq liqVar = (liq) this.instance;
        liq liqVar2 = liq.a;
        liqVar.a();
        aifs.addAll(iterable, liqVar.c);
    }

    public final lin H(int i) {
        return (lin) ((lir) this.instance).e.get(i);
    }

    public final void I(Iterable iterable) {
        copyOnWrite();
        lir lirVar = (lir) this.instance;
        lir lirVar2 = lir.a;
        aiie aiieVar = lirVar.D;
        if (!aiieVar.c()) {
            lirVar.D = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, lirVar.D);
    }

    public final void J(Iterable iterable) {
        copyOnWrite();
        lir lirVar = (lir) this.instance;
        lir lirVar2 = lir.a;
        lirVar.a();
        aifs.addAll(iterable, lirVar.e);
    }

    public final void K(lix lixVar) {
        copyOnWrite();
        lir lirVar = (lir) this.instance;
        lir lirVar2 = lir.a;
        lixVar.getClass();
        lirVar.b();
        lirVar.f.add(lixVar);
    }

    public final void L(int i) {
        copyOnWrite();
        lir lirVar = (lir) this.instance;
        lir lirVar2 = lir.a;
        lirVar.a();
        lirVar.e.remove(i);
    }

    public final void M(int i) {
        copyOnWrite();
        lir lirVar = (lir) this.instance;
        lir lirVar2 = lir.a;
        lirVar.b();
        lirVar.f.remove(i);
    }

    public final void N(int i, lin linVar) {
        copyOnWrite();
        lir lirVar = (lir) this.instance;
        lir lirVar2 = lir.a;
        linVar.getClass();
        lirVar.a();
        lirVar.e.set(i, linVar);
    }

    public final void O(Iterable iterable) {
        copyOnWrite();
        lit litVar = (lit) this.instance;
        lit litVar2 = lit.a;
        aiie aiieVar = litVar.d;
        if (!aiieVar.c()) {
            litVar.d = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, litVar.d);
    }

    public final void P(Iterable iterable) {
        copyOnWrite();
        lit litVar = (lit) this.instance;
        lit litVar2 = lit.a;
        aihy aihyVar = litVar.c;
        if (!aihyVar.c()) {
            litVar.c = aihn.mutableCopy(aihyVar);
        }
        aifs.addAll(iterable, litVar.c);
    }

    public final void Q(Iterable iterable) {
        copyOnWrite();
        lit litVar = (lit) this.instance;
        lit litVar2 = lit.a;
        aiie aiieVar = litVar.e;
        if (!aiieVar.c()) {
            litVar.e = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, litVar.e);
    }

    public final void R(Iterable iterable) {
        copyOnWrite();
        lit litVar = (lit) this.instance;
        lit litVar2 = lit.a;
        aihy aihyVar = litVar.b;
        if (!aihyVar.c()) {
            litVar.b = aihn.mutableCopy(aihyVar);
        }
        aifs.addAll(iterable, litVar.b);
    }

    public final void S(oho ohoVar) {
        copyOnWrite();
        ohp ohpVar = (ohp) this.instance;
        ohp ohpVar2 = ohp.a;
        ohoVar.getClass();
        ohpVar.a();
        ohpVar.h.add(ohoVar);
    }

    public final void T(Iterable iterable) {
        copyOnWrite();
        oip oipVar = (oip) this.instance;
        oip oipVar2 = oip.a;
        aiie aiieVar = oipVar.o;
        if (!aiieVar.c()) {
            oipVar.o = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, oipVar.o);
    }

    public final void U(String str, oip oipVar) {
        str.getClass();
        oipVar.getClass();
        copyOnWrite();
        oiu oiuVar = (oiu) this.instance;
        oiu oiuVar2 = oiu.a;
        oiuVar.a().put(str, oipVar);
    }

    public final void V(String str) {
        str.getClass();
        copyOnWrite();
        oiu oiuVar = (oiu) this.instance;
        oiu oiuVar2 = oiu.a;
        oiuVar.a().remove(str);
    }

    public final void W(String str, ojb ojbVar) {
        str.getClass();
        ojbVar.getClass();
        copyOnWrite();
        ojc ojcVar = (ojc) this.instance;
        ojc ojcVar2 = ojc.a;
        ojcVar.a().put(str, ojbVar);
    }

    public final void X(String str) {
        str.getClass();
        copyOnWrite();
        ojc ojcVar = (ojc) this.instance;
        ojc ojcVar2 = ojc.a;
        ojcVar.a().remove(str);
    }

    public final void Y(aifv aifvVar) {
        copyOnWrite();
        pzm pzmVar = (pzm) this.instance;
        pzm pzmVar2 = pzm.a;
        aifvVar.getClass();
        aiie aiieVar = pzmVar.b;
        if (!aiieVar.c()) {
            pzmVar.b = aihn.mutableCopy(aiieVar);
        }
        pzmVar.b.add(aifvVar);
    }

    public final void Z(String str) {
        copyOnWrite();
        pzn pznVar = (pzn) this.instance;
        pzn pznVar2 = pzn.a;
        pznVar.a();
        pznVar.b.add(str);
    }

    public final void aA(float f) {
        copyOnWrite();
        aimy aimyVar = (aimy) this.instance;
        aimy aimyVar2 = aimy.a;
        aimyVar.a();
        aimyVar.e.h(f);
    }

    public final void aB(int i) {
        copyOnWrite();
        ainm ainmVar = (ainm) this.instance;
        ainm ainmVar2 = ainm.a;
        ainmVar.a();
        ainmVar.b.remove(i);
    }

    public final void aC(Iterable iterable) {
        copyOnWrite();
        ainr ainrVar = (ainr) this.instance;
        ainr ainrVar2 = ainr.a;
        aiie aiieVar = ainrVar.b;
        if (!aiieVar.c()) {
            ainrVar.b = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, ainrVar.b);
    }

    public final void aD(ainw ainwVar) {
        copyOnWrite();
        ainx ainxVar = (ainx) this.instance;
        ainx ainxVar2 = ainx.a;
        ainwVar.getClass();
        ainxVar.a();
        ainxVar.b.add(ainwVar);
    }

    public final void aE(aioc aiocVar) {
        copyOnWrite();
        aioe aioeVar = (aioe) this.instance;
        aioe aioeVar2 = aioe.a;
        aihv aihvVar = aioeVar.e;
        if (!aihvVar.c()) {
            aioeVar.e = aihn.mutableCopy(aihvVar);
        }
        aioeVar.e.h(aiocVar.g);
    }

    public final void aF(aizm aizmVar) {
        copyOnWrite();
        aiyq aiyqVar = (aiyq) this.instance;
        aiyq aiyqVar2 = aiyq.a;
        aizmVar.getClass();
        aiie aiieVar = aiyqVar.f;
        if (!aiieVar.c()) {
            aiyqVar.f = aihn.mutableCopy(aiieVar);
        }
        aiyqVar.f.add(aizmVar);
    }

    public final void aG(aizm aizmVar) {
        copyOnWrite();
        aiyq aiyqVar = (aiyq) this.instance;
        aiyq aiyqVar2 = aiyq.a;
        aizmVar.getClass();
        aiie aiieVar = aiyqVar.d;
        if (!aiieVar.c()) {
            aiyqVar.d = aihn.mutableCopy(aiieVar);
        }
        aiyqVar.d.add(aizmVar);
    }

    public final void aH(aizm aizmVar) {
        copyOnWrite();
        aiyq aiyqVar = (aiyq) this.instance;
        aiyq aiyqVar2 = aiyq.a;
        aizmVar.getClass();
        aiie aiieVar = aiyqVar.e;
        if (!aiieVar.c()) {
            aiyqVar.e = aihn.mutableCopy(aiieVar);
        }
        aiyqVar.e.add(aizmVar);
    }

    public final void aI(aizm aizmVar) {
        copyOnWrite();
        aiyq aiyqVar = (aiyq) this.instance;
        aiyq aiyqVar2 = aiyq.a;
        aizmVar.getClass();
        aiie aiieVar = aiyqVar.g;
        if (!aiieVar.c()) {
            aiyqVar.g = aihn.mutableCopy(aiieVar);
        }
        aiyqVar.g.add(aizmVar);
    }

    public final void aJ(aizm aizmVar) {
        copyOnWrite();
        aizj aizjVar = (aizj) this.instance;
        aizj aizjVar2 = aizj.a;
        aizmVar.getClass();
        aiie aiieVar = aizjVar.g;
        if (!aiieVar.c()) {
            aizjVar.g = aihn.mutableCopy(aiieVar);
        }
        aizjVar.g.add(aizmVar);
    }

    public final void aK(ajbq ajbqVar) {
        copyOnWrite();
        ajbn ajbnVar = (ajbn) this.instance;
        ajbn ajbnVar2 = ajbn.a;
        ajbqVar.getClass();
        aiie aiieVar = ajbnVar.f;
        if (!aiieVar.c()) {
            ajbnVar.f = aihn.mutableCopy(aiieVar);
        }
        ajbnVar.f.add(ajbqVar);
    }

    public final void aL(int i) {
        copyOnWrite();
        ajbp ajbpVar = (ajbp) this.instance;
        ajbp ajbpVar2 = ajbp.a;
        aihv aihvVar = ajbpVar.b;
        if (!aihvVar.c()) {
            ajbpVar.b = aihn.mutableCopy(aihvVar);
        }
        ajbpVar.b.h(i - 1);
    }

    public final void aM(String str) {
        copyOnWrite();
        ajfx ajfxVar = (ajfx) this.instance;
        ajfx ajfxVar2 = ajfx.a;
        str.getClass();
        aiie aiieVar = ajfxVar.d;
        if (!aiieVar.c()) {
            ajfxVar.d = aihn.mutableCopy(aiieVar);
        }
        ajfxVar.d.add(str);
    }

    public final void aN(ajty ajtyVar) {
        copyOnWrite();
        ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData = (ClientErrorOuterClass$ErrorMetaData) this.instance;
        ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData2 = ClientErrorOuterClass$ErrorMetaData.a;
        ajtyVar.getClass();
        aiie aiieVar = clientErrorOuterClass$ErrorMetaData.e;
        if (!aiieVar.c()) {
            clientErrorOuterClass$ErrorMetaData.e = aihn.mutableCopy(aiieVar);
        }
        clientErrorOuterClass$ErrorMetaData.e.add(ajtyVar);
    }

    public final void aO(Iterable iterable) {
        copyOnWrite();
        ajwm ajwmVar = (ajwm) this.instance;
        ajwm ajwmVar2 = ajwm.a;
        ajwmVar.a();
        aifs.addAll(iterable, ajwmVar.c);
    }

    public final void aP(ajwo ajwoVar) {
        copyOnWrite();
        ajwm ajwmVar = (ajwm) this.instance;
        ajwm ajwmVar2 = ajwm.a;
        ajwoVar.getClass();
        ajwmVar.a();
        ajwmVar.c.add(ajwoVar);
    }

    public final void aQ(akca akcaVar) {
        copyOnWrite();
        akby akbyVar = (akby) this.instance;
        akby akbyVar2 = akby.a;
        akcaVar.getClass();
        akbyVar.a();
        akbyVar.c.add(akcaVar);
    }

    public final void aR(alay alayVar) {
        copyOnWrite();
        akdd akddVar = (akdd) this.instance;
        akdd akddVar2 = akdd.a;
        alayVar.getClass();
        akddVar.a();
        akddVar.f.add(alayVar);
    }

    public final void aS(Iterable iterable) {
        copyOnWrite();
        akjg akjgVar = (akjg) this.instance;
        akjg akjgVar2 = akjg.a;
        aiie aiieVar = akjgVar.d;
        if (!aiieVar.c()) {
            akjgVar.d = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, akjgVar.d);
    }

    public final void aT(Iterable iterable) {
        copyOnWrite();
        aknn aknnVar = (aknn) this.instance;
        aknn aknnVar2 = aknn.a;
        aiie aiieVar = aknnVar.e;
        if (!aiieVar.c()) {
            aknnVar.e = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, aknnVar.e);
    }

    public final void aU(akua akuaVar) {
        copyOnWrite();
        akuj akujVar = (akuj) this.instance;
        aihw aihwVar = akuj.a;
        akujVar.a();
        akujVar.r.h(akuaVar.f);
    }

    public final void aV(String str, aigj aigjVar) {
        aigjVar.getClass();
        copyOnWrite();
        akvf akvfVar = (akvf) this.instance;
        akvf akvfVar2 = akvf.a;
        aiip aiipVar = akvfVar.b;
        if (!aiipVar.b) {
            akvfVar.b = aiipVar.a();
        }
        akvfVar.b.put(str, aigjVar);
    }

    public final void aW(String str) {
        copyOnWrite();
        akwm akwmVar = (akwm) this.instance;
        aihw aihwVar = akwm.a;
        aiie aiieVar = akwmVar.Q;
        if (!aiieVar.c()) {
            akwmVar.Q = aihn.mutableCopy(aiieVar);
        }
        akwmVar.Q.add(str);
    }

    public final void aX(aler alerVar) {
        copyOnWrite();
        ales alesVar = (ales) this.instance;
        ales alesVar2 = ales.a;
        alerVar.getClass();
        aiie aiieVar = alesVar.f;
        if (!aiieVar.c()) {
            alesVar.f = aihn.mutableCopy(aiieVar);
        }
        alesVar.f.add(alerVar);
    }

    public final void aY(Iterable iterable) {
        copyOnWrite();
        alfr alfrVar = (alfr) this.instance;
        alfr alfrVar2 = alfr.a;
        alfrVar.a();
        aifs.addAll(iterable, alfrVar.d);
    }

    public final void aZ(alfu alfuVar) {
        copyOnWrite();
        alfr alfrVar = (alfr) this.instance;
        alfr alfrVar2 = alfr.a;
        alfuVar.getClass();
        alfrVar.a();
        alfrVar.d.add(alfuVar);
    }

    public final void aa(String str) {
        copyOnWrite();
        qlk qlkVar = (qlk) this.instance;
        qlk qlkVar2 = qlk.a;
        str.getClass();
        aiie aiieVar = qlkVar.c;
        if (!aiieVar.c()) {
            qlkVar.c = aihn.mutableCopy(aiieVar);
        }
        qlkVar.c.add(str);
    }

    public final void ab(String str, qlk qlkVar) {
        str.getClass();
        qlkVar.getClass();
        copyOnWrite();
        qll qllVar = (qll) this.instance;
        qll qllVar2 = qll.a;
        aiip aiipVar = qllVar.b;
        if (!aiipVar.b) {
            qllVar.b = aiipVar.a();
        }
        qllVar.b.put(str, qlkVar);
    }

    public final void ac(Iterable iterable) {
        copyOnWrite();
        uzc uzcVar = (uzc) this.instance;
        uzc uzcVar2 = uzc.a;
        aiie aiieVar = uzcVar.c;
        if (!aiieVar.c()) {
            uzcVar.c = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, uzcVar.c);
    }

    public final void ad(int i) {
        copyOnWrite();
        vcr vcrVar = (vcr) this.instance;
        vcr vcrVar2 = vcr.a;
        vcrVar.a().remove(Integer.valueOf(i));
    }

    public final void ae(Iterable iterable) {
        copyOnWrite();
        vsw vswVar = (vsw) this.instance;
        vsw vswVar2 = vsw.a;
        vswVar.a();
        aifs.addAll(iterable, vswVar.b);
    }

    public final void af(String str, acuz acuzVar) {
        str.getClass();
        acuzVar.getClass();
        copyOnWrite();
        acuy acuyVar = (acuy) this.instance;
        acuy acuyVar2 = acuy.a;
        acuyVar.a().put(str, acuzVar);
    }

    public final void ag(String str) {
        str.getClass();
        copyOnWrite();
        acuy acuyVar = (acuy) this.instance;
        acuy acuyVar2 = acuy.a;
        acuyVar.a().remove(str);
    }

    public final void ah(alay alayVar) {
        copyOnWrite();
        acwy acwyVar = (acwy) this.instance;
        acwy acwyVar2 = acwy.a;
        alayVar.getClass();
        acwyVar.a();
        acwyVar.d.add(alayVar);
    }

    public final void ai(Iterable iterable) {
        copyOnWrite();
        acxd acxdVar = (acxd) this.instance;
        acxd acxdVar2 = acxd.a;
        acxdVar.a();
        aifs.addAll(iterable, acxdVar.f);
    }

    public final void aj(int i, afiw afiwVar) {
        afiwVar.getClass();
        copyOnWrite();
        afiu afiuVar = (afiu) this.instance;
        afiu afiuVar2 = afiu.a;
        afiuVar.a().put(Integer.valueOf(i), afiwVar);
    }

    public final void ak(afst afstVar) {
        copyOnWrite();
        afsu afsuVar = (afsu) this.instance;
        afsu afsuVar2 = afsu.a;
        afstVar.getClass();
        aiie aiieVar = afsuVar.d;
        if (!aiieVar.c()) {
            afsuVar.d = aihn.mutableCopy(aiieVar);
        }
        afsuVar.d.add(afstVar);
    }

    public final void al(afus afusVar) {
        copyOnWrite();
        afwm afwmVar = (afwm) this.instance;
        afwm afwmVar2 = afwm.a;
        afusVar.getClass();
        aiie aiieVar = afwmVar.e;
        if (!aiieVar.c()) {
            afwmVar.e = aihn.mutableCopy(aiieVar);
        }
        afwmVar.e.add(afusVar);
    }

    public final void am(agzn agznVar) {
        copyOnWrite();
        agzp agzpVar = (agzp) this.instance;
        agzp agzpVar2 = agzp.a;
        agznVar.getClass();
        aiie aiieVar = agzpVar.m;
        if (!aiieVar.c()) {
            agzpVar.m = aihn.mutableCopy(aiieVar);
        }
        agzpVar.m.add(agznVar);
    }

    public final void an(String str) {
        copyOnWrite();
        ahnl ahnlVar = (ahnl) this.instance;
        ahnl ahnlVar2 = ahnl.a;
        aiie aiieVar = ahnlVar.e;
        if (!aiieVar.c()) {
            ahnlVar.e = aihn.mutableCopy(aiieVar);
        }
        ahnlVar.e.add(str);
    }

    public final void ao(String str) {
        copyOnWrite();
        ahnl ahnlVar = (ahnl) this.instance;
        ahnl ahnlVar2 = ahnl.a;
        ahnlVar.a();
        ahnlVar.c.add(str);
    }

    public final void ap(String str) {
        copyOnWrite();
        ahnk ahnkVar = (ahnk) this.instance;
        ahnk ahnkVar2 = ahnk.a;
        aiie aiieVar = ahnkVar.f;
        if (!aiieVar.c()) {
            ahnkVar.f = aihn.mutableCopy(aiieVar);
        }
        ahnkVar.f.add(str);
    }

    public final void aq(String str) {
        copyOnWrite();
        ahnk ahnkVar = (ahnk) this.instance;
        ahnk ahnkVar2 = ahnk.a;
        ahnkVar.a();
        ahnkVar.d.add(str);
    }

    public final void ar(String str) {
        copyOnWrite();
        ahnk ahnkVar = (ahnk) this.instance;
        ahnk ahnkVar2 = ahnk.a;
        aiie aiieVar = ahnkVar.e;
        if (!aiieVar.c()) {
            ahnkVar.e = aihn.mutableCopy(aiieVar);
        }
        ahnkVar.e.add(str);
    }

    public final void as(ahxd ahxdVar) {
        copyOnWrite();
        ahxc ahxcVar = (ahxc) this.instance;
        ahxc ahxcVar2 = ahxc.a;
        ahxdVar.getClass();
        aiie aiieVar = ahxcVar.b;
        if (!aiieVar.c()) {
            ahxcVar.b = aihn.mutableCopy(aiieVar);
        }
        ahxcVar.b.add(ahxdVar);
    }

    public final void at(Iterable iterable) {
        copyOnWrite();
        aiej aiejVar = (aiej) this.instance;
        aiej aiejVar2 = aiej.a;
        aiejVar.a();
        aifs.addAll(iterable, aiejVar.b);
    }

    public final void au(aidu aiduVar) {
        copyOnWrite();
        aife aifeVar = (aife) this.instance;
        aihw aihwVar = aife.a;
        aihv aihvVar = aifeVar.c;
        if (!aihvVar.c()) {
            aifeVar.c = aihn.mutableCopy(aihvVar);
        }
        aifeVar.c.h(aiduVar.d);
    }

    public final void av(String str, ailw ailwVar) {
        ailwVar.getClass();
        copyOnWrite();
        ailg ailgVar = (ailg) this.instance;
        ailg ailgVar2 = ailg.a;
        aiip aiipVar = ailgVar.b;
        if (!aiipVar.b) {
            ailgVar.b = aiipVar.a();
        }
        ailgVar.b.put(str, ailwVar);
    }

    public final void aw(Iterable iterable) {
        copyOnWrite();
        aily ailyVar = (aily) this.instance;
        aily ailyVar2 = aily.a;
        aiie aiieVar = ailyVar.k;
        if (!aiieVar.c()) {
            ailyVar.k = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, ailyVar.k);
    }

    public final void ax(String str, aily ailyVar) {
        str.getClass();
        ailyVar.getClass();
        copyOnWrite();
        aimg aimgVar = (aimg) this.instance;
        aimg aimgVar2 = aimg.a;
        aiip aiipVar = aimgVar.c;
        if (!aiipVar.b) {
            aimgVar.c = aiipVar.a();
        }
        aimgVar.c.put(str, ailyVar);
    }

    public final void ay(String str, aiml aimlVar) {
        aimlVar.getClass();
        copyOnWrite();
        aimj aimjVar = (aimj) this.instance;
        aimj aimjVar2 = aimj.a;
        aiip aiipVar = aimjVar.b;
        if (!aiipVar.b) {
            aimjVar.b = aiipVar.a();
        }
        aimjVar.b.put(str, aimlVar);
    }

    public final void az(Iterable iterable) {
        copyOnWrite();
        aimy aimyVar = (aimy) this.instance;
        aimy aimyVar2 = aimy.a;
        aimyVar.a();
        aifs.addAll(iterable, aimyVar.e);
    }

    public final void bA(Iterable iterable) {
        copyOnWrite();
        amyf amyfVar = (amyf) this.instance;
        amyf amyfVar2 = amyf.a;
        aiie aiieVar = amyfVar.h;
        if (!aiieVar.c()) {
            amyfVar.h = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, amyfVar.h);
    }

    public final void bB(Iterable iterable) {
        copyOnWrite();
        amyf amyfVar = (amyf) this.instance;
        amyf amyfVar2 = amyf.a;
        aiie aiieVar = amyfVar.g;
        if (!aiieVar.c()) {
            amyfVar.g = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, amyfVar.g);
    }

    public final void bC(amyx amyxVar) {
        copyOnWrite();
        amyy amyyVar = (amyy) this.instance;
        amyy amyyVar2 = amyy.a;
        amyxVar.getClass();
        aiie aiieVar = amyyVar.d;
        if (!aiieVar.c()) {
            amyyVar.d = aihn.mutableCopy(aiieVar);
        }
        amyyVar.d.add(amyxVar);
    }

    public final void bD(Iterable iterable) {
        copyOnWrite();
        amzx amzxVar = (amzx) this.instance;
        amzx amzxVar2 = amzx.a;
        aiie aiieVar = amzxVar.i;
        if (!aiieVar.c()) {
            amzxVar.i = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, amzxVar.i);
    }

    public final void bE(Iterable iterable) {
        copyOnWrite();
        andt andtVar = (andt) this.instance;
        andt andtVar2 = andt.a;
        aiie aiieVar = andtVar.g;
        if (!aiieVar.c()) {
            andtVar.g = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, andtVar.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bF(Iterable iterable) {
        copyOnWrite();
        andt andtVar = (andt) this.instance;
        andt andtVar2 = andt.a;
        aihv aihvVar = andtVar.f;
        if (!aihvVar.c()) {
            andtVar.f = aihn.mutableCopy(aihvVar);
        }
        agqs agqsVarListIterator = ((agke) iterable).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            andtVar.f.h(((ancj) agqsVarListIterator.next()).j);
        }
    }

    public final void bG(andt andtVar) {
        copyOnWrite();
        andu anduVar = (andu) this.instance;
        andu anduVar2 = andu.a;
        andtVar.getClass();
        aiie aiieVar = anduVar.b;
        if (!aiieVar.c()) {
            anduVar.b = aihn.mutableCopy(aiieVar);
        }
        anduVar.b.add(andtVar);
    }

    public final void bH(Iterable iterable) {
        copyOnWrite();
        anfy anfyVar = (anfy) this.instance;
        anfy anfyVar2 = anfy.a;
        anfyVar.a();
        aifs.addAll(iterable, anfyVar.c);
    }

    public final void bI(anfv anfvVar) {
        copyOnWrite();
        anfy anfyVar = (anfy) this.instance;
        anfy anfyVar2 = anfy.a;
        anfvVar.getClass();
        anfyVar.a();
        anfyVar.c.add(anfvVar);
    }

    public final void bJ(angf angfVar) {
        copyOnWrite();
        anfy anfyVar = (anfy) this.instance;
        anfy anfyVar2 = anfy.a;
        angfVar.getClass();
        anfyVar.b();
        anfyVar.d.add(angfVar);
    }

    public final void bK(aihh aihhVar) {
        copyOnWrite();
        ankz ankzVar = (ankz) this.instance;
        apji apjiVar = (apji) aihhVar.build();
        ankz ankzVar2 = ankz.a;
        apjiVar.getClass();
        aiie aiieVar = ankzVar.e;
        if (!aiieVar.c()) {
            ankzVar.e = aihn.mutableCopy(aiieVar);
        }
        ankzVar.e.add(apjiVar);
    }

    public final void bL(long j) {
        copyOnWrite();
        anlb anlbVar = (anlb) this.instance;
        anlb anlbVar2 = anlb.a;
        aihy aihyVar = anlbVar.b;
        if (!aihyVar.c()) {
            anlbVar.b = aihn.mutableCopy(aihyVar);
        }
        anlbVar.b.g(j);
    }

    public final void bM(long j) {
        copyOnWrite();
        anlc anlcVar = (anlc) this.instance;
        anlc anlcVar2 = anlc.a;
        anlcVar.a();
        anlcVar.b.g(j);
    }

    public final void bN(annn annnVar) {
        copyOnWrite();
        annl annlVar = (annl) this.instance;
        aihw aihwVar = annl.a;
        annlVar.a();
        annlVar.e.h(annnVar.j);
    }

    public final void bO(Iterable iterable) {
        copyOnWrite();
        anwt anwtVar = (anwt) this.instance;
        anwt anwtVar2 = anwt.a;
        anwtVar.a();
        aifs.addAll(iterable, anwtVar.j);
    }

    public final void bP(anwv anwvVar) {
        copyOnWrite();
        anwt anwtVar = (anwt) this.instance;
        anwt anwtVar2 = anwt.a;
        anwvVar.getClass();
        anwtVar.a();
        anwtVar.j.add(anwvVar);
    }

    public final void bQ(apji apjiVar) {
        copyOnWrite();
        anwt anwtVar = (anwt) this.instance;
        anwt anwtVar2 = anwt.a;
        apjiVar.getClass();
        aiie aiieVar = anwtVar.h;
        if (!aiieVar.c()) {
            anwtVar.h = aihn.mutableCopy(aiieVar);
        }
        anwtVar.h.add(apjiVar);
    }

    public final void bR(aihf aihfVar) {
        copyOnWrite();
        anwt anwtVar = (anwt) this.instance;
        anwv anwvVar = (anwv) aihfVar.build();
        anwt anwtVar2 = anwt.a;
        anwvVar.getClass();
        anwtVar.a();
        anwtVar.j.add(anwvVar);
    }

    public final void bS(apji apjiVar) {
        copyOnWrite();
        anwz anwzVar = (anwz) this.instance;
        anwz anwzVar2 = anwz.a;
        apjiVar.getClass();
        aiie aiieVar = anwzVar.d;
        if (!aiieVar.c()) {
            anwzVar.d = aihn.mutableCopy(aiieVar);
        }
        anwzVar.d.add(apjiVar);
    }

    public final void bT(apji apjiVar) {
        copyOnWrite();
        anxt anxtVar = (anxt) this.instance;
        anxt anxtVar2 = anxt.a;
        apjiVar.getClass();
        anxtVar.a();
        anxtVar.b.add(apjiVar);
    }

    public final void bU(apji apjiVar) {
        copyOnWrite();
        anzn anznVar = (anzn) this.instance;
        anzn anznVar2 = anzn.a;
        apjiVar.getClass();
        anznVar.a();
        anznVar.l.add(apjiVar);
    }

    public final void bV(apji apjiVar) {
        copyOnWrite();
        anzn anznVar = (anzn) this.instance;
        anzn anznVar2 = anzn.a;
        apjiVar.getClass();
        anznVar.b();
        anznVar.m.add(apjiVar);
    }

    public final void bW(Iterable iterable) {
        copyOnWrite();
        aoeg aoegVar = (aoeg) this.instance;
        aoeg aoegVar2 = aoeg.a;
        aiie aiieVar = aoegVar.d;
        if (!aiieVar.c()) {
            aoegVar.d = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, aoegVar.d);
    }

    public final void bX(aohc aohcVar) {
        copyOnWrite();
        aofu aofuVar = (aofu) this.instance;
        aofu aofuVar2 = aofu.a;
        aohcVar.getClass();
        aiie aiieVar = aofuVar.f;
        if (!aiieVar.c()) {
            aofuVar.f = aihn.mutableCopy(aiieVar);
        }
        aofuVar.f.add(aohcVar);
    }

    public final void bY(aoha aohaVar) {
        copyOnWrite();
        aohb aohbVar = (aohb) this.instance;
        aohb aohbVar2 = aohb.a;
        aohaVar.getClass();
        aohbVar.a();
        aohbVar.p.add(aohaVar);
    }

    public final void bZ(aqdp aqdpVar) {
        copyOnWrite();
        aohr aohrVar = (aohr) this.instance;
        aohr aohrVar2 = aohr.a;
        aqdpVar.getClass();
        aiie aiieVar = aohrVar.d;
        if (!aiieVar.c()) {
            aohrVar.d = aihn.mutableCopy(aiieVar);
        }
        aohrVar.d.add(aqdpVar);
    }

    public final void ba(apji apjiVar) {
        copyOnWrite();
        allc allcVar = (allc) this.instance;
        allc allcVar2 = allc.a;
        apjiVar.getClass();
        aiie aiieVar = allcVar.e;
        if (!aiieVar.c()) {
            allcVar.e = aihn.mutableCopy(aiieVar);
        }
        allcVar.e.add(apjiVar);
    }

    public final void bb(Iterable iterable) {
        copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo = (InnertubeContext$ClientInfo) this.instance;
        InnertubeContext$ClientInfo innertubeContext$ClientInfo2 = InnertubeContext$ClientInfo.a;
        aihv aihvVar = innertubeContext$ClientInfo.n;
        if (!aihvVar.c()) {
            innertubeContext$ClientInfo.n = aihn.mutableCopy(aihvVar);
        }
        aifs.addAll(iterable, innertubeContext$ClientInfo.n);
    }

    public final void bc(Iterable iterable) {
        copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo = (InnertubeContext$ClientInfo) this.instance;
        InnertubeContext$ClientInfo innertubeContext$ClientInfo2 = InnertubeContext$ClientInfo.a;
        aiie aiieVar = innertubeContext$ClientInfo.W;
        if (!aiieVar.c()) {
            innertubeContext$ClientInfo.W = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, innertubeContext$ClientInfo.W);
    }

    public final void bd(Iterable iterable) {
        copyOnWrite();
        InnertubeContext$ClientInfo innertubeContext$ClientInfo = (InnertubeContext$ClientInfo) this.instance;
        InnertubeContext$ClientInfo innertubeContext$ClientInfo2 = InnertubeContext$ClientInfo.a;
        aiie aiieVar = innertubeContext$ClientInfo.V;
        if (!aiieVar.c()) {
            innertubeContext$ClientInfo.V = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, innertubeContext$ClientInfo.V);
    }

    public final void be(Iterable iterable) {
        copyOnWrite();
        alow alowVar = (alow) this.instance;
        alow alowVar2 = alow.a;
        aiie aiieVar = alowVar.f;
        if (!aiieVar.c()) {
            alowVar.f = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, alowVar.f);
    }

    public final void bf(FormatIdOuterClass$FormatId formatIdOuterClass$FormatId) {
        copyOnWrite();
        aluw aluwVar = (aluw) this.instance;
        aluw aluwVar2 = aluw.a;
        formatIdOuterClass$FormatId.getClass();
        aiie aiieVar = aluwVar.i;
        if (!aiieVar.c()) {
            aluwVar.i = aihn.mutableCopy(aiieVar);
        }
        aluwVar.i.add(formatIdOuterClass$FormatId);
    }

    public final void bg(aihf aihfVar) {
        copyOnWrite();
        lin linVar = (lin) this.instance;
        lip lipVar = (lip) aihfVar.build();
        lin linVar2 = lin.a;
        lipVar.getClass();
        linVar.a();
        linVar.c.add(lipVar);
    }

    public final void bh(int i, aihf aihfVar) {
        copyOnWrite();
        lin linVar = (lin) this.instance;
        lip lipVar = (lip) aihfVar.build();
        lin linVar2 = lin.a;
        lipVar.getClass();
        linVar.a();
        linVar.c.set(i, lipVar);
    }

    public final void bi(aihf aihfVar) {
        copyOnWrite();
        liq liqVar = (liq) this.instance;
        lir lirVar = (lir) aihfVar.build();
        liq liqVar2 = liq.a;
        lirVar.getClass();
        liqVar.a();
        liqVar.c.add(lirVar);
    }

    public final void bj(int i, aihf aihfVar) {
        copyOnWrite();
        liq liqVar = (liq) this.instance;
        lir lirVar = (lir) aihfVar.build();
        liq liqVar2 = liq.a;
        lirVar.getClass();
        liqVar.a();
        liqVar.c.set(i, lirVar);
    }

    public final void bk(aihf aihfVar) {
        copyOnWrite();
        lir lirVar = (lir) this.instance;
        lin linVar = (lin) aihfVar.build();
        lir lirVar2 = lir.a;
        linVar.getClass();
        lirVar.a();
        lirVar.e.add(linVar);
    }

    public final void bl(int i, aihf aihfVar) {
        copyOnWrite();
        lir lirVar = (lir) this.instance;
        lin linVar = (lin) aihfVar.build();
        lir lirVar2 = lir.a;
        linVar.getClass();
        lirVar.a();
        lirVar.e.set(i, linVar);
    }

    public final void bm(aihf aihfVar) {
        copyOnWrite();
        ahnl ahnlVar = (ahnl) this.instance;
        ahnk ahnkVar = (ahnk) aihfVar.build();
        ahnl ahnlVar2 = ahnl.a;
        ahnkVar.getClass();
        aiie aiieVar = ahnlVar.b;
        if (!aiieVar.c()) {
            ahnlVar.b = aihn.mutableCopy(aiieVar);
        }
        ahnlVar.b.add(ahnkVar);
    }

    public final void bn(aihf aihfVar) {
        copyOnWrite();
        ajta ajtaVar = (ajta) this.instance;
        ajtb ajtbVar = (ajtb) aihfVar.build();
        ajta ajtaVar2 = ajta.a;
        ajtbVar.getClass();
        ajtaVar.a();
        ajtaVar.c.add(ajtbVar);
    }

    public final void bo(aihf aihfVar) {
        copyOnWrite();
        akca akcaVar = (akca) this.instance;
        akcb akcbVar = (akcb) aihfVar.build();
        akca akcaVar2 = akca.a;
        akcbVar.getClass();
        aiie aiieVar = akcaVar.d;
        if (!aiieVar.c()) {
            akcaVar.d = aihn.mutableCopy(aiieVar);
        }
        akcaVar.d.add(akcbVar);
    }

    public final void bp(aihf aihfVar) {
        copyOnWrite();
        alfr alfrVar = (alfr) this.instance;
        alfu alfuVar = (alfu) aihfVar.build();
        alfr alfrVar2 = alfr.a;
        alfuVar.getClass();
        alfrVar.a();
        alfrVar.d.add(alfuVar);
    }

    public final void bq(aihf aihfVar) {
        copyOnWrite();
        almj almjVar = (almj) this.instance;
        almg almgVar = (almg) aihfVar.build();
        almj almjVar2 = almj.a;
        almgVar.getClass();
        almjVar.a();
        almjVar.b.add(almgVar);
    }

    public final void br(aihf aihfVar) {
        copyOnWrite();
        aloi aloiVar = (aloi) this.instance;
        amgu amguVar = (amgu) aihfVar.build();
        aloi aloiVar2 = aloi.a;
        amguVar.getClass();
        aiie aiieVar = aloiVar.c;
        if (!aiieVar.c()) {
            aloiVar.c = aihn.mutableCopy(aiieVar);
        }
        aloiVar.c.add(amguVar);
    }

    public final void bs(aihf aihfVar) {
        copyOnWrite();
        alux aluxVar = (alux) this.instance;
        aluw aluwVar = (aluw) aihfVar.build();
        alux aluxVar2 = alux.a;
        aluwVar.getClass();
        aiie aiieVar = aluxVar.d;
        if (!aiieVar.c()) {
            aluxVar.d = aihn.mutableCopy(aiieVar);
        }
        aluxVar.d.add(aluwVar);
    }

    public final void bt(Iterable iterable) {
        copyOnWrite();
        alyr alyrVar = (alyr) this.instance;
        alyr alyrVar2 = alyr.a;
        aiie aiieVar = alyrVar.b;
        if (!aiieVar.c()) {
            alyrVar.b = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, alyrVar.b);
    }

    public final void bu(amah amahVar) {
        copyOnWrite();
        amai amaiVar = (amai) this.instance;
        amai amaiVar2 = amai.a;
        amahVar.getClass();
        amaiVar.a();
        amaiVar.b.add(amahVar);
    }

    @Override // defpackage.aiir
    public final aihn build() {
        aihn aihnVarBuildPartial = buildPartial();
        if (aihnVarBuildPartial.isInitialized()) {
            return aihnVarBuildPartial;
        }
        throw newUninitializedMessageException(aihnVarBuildPartial);
    }

    @Override // defpackage.aiir
    public aihn buildPartial() {
        boolean zIsMutable = this.instance.isMutable();
        aihn aihnVar = this.instance;
        if (!zIsMutable) {
            return aihnVar;
        }
        aihnVar.makeImmutable();
        return this.instance;
    }

    public final void bv(apox apoxVar) {
        copyOnWrite();
        ambj ambjVar = (ambj) this.instance;
        ambj ambjVar2 = ambj.a;
        apoxVar.getClass();
        aiie aiieVar = ambjVar.d;
        if (!aiieVar.c()) {
            ambjVar.d = aihn.mutableCopy(aiieVar);
        }
        ambjVar.d.add(apoxVar);
    }

    public final void bw(aihh aihhVar) {
        copyOnWrite();
        amfb amfbVar = (amfb) this.instance;
        amfa amfaVar = (amfa) aihhVar.build();
        amfb amfbVar2 = amfb.a;
        amfaVar.getClass();
        aiie aiieVar = amfbVar.b;
        if (!aiieVar.c()) {
            amfbVar.b = aihn.mutableCopy(aiieVar);
        }
        amfbVar.b.add(amfaVar);
    }

    public final void bx(aihf aihfVar) {
        copyOnWrite();
        amiu amiuVar = (amiu) this.instance;
        amis amisVar = (amis) aihfVar.build();
        amiu amiuVar2 = amiu.a;
        amisVar.getClass();
        aiie aiieVar = amiuVar.D;
        if (!aiieVar.c()) {
            amiuVar.D = aihn.mutableCopy(aiieVar);
        }
        amiuVar.D.add(amisVar);
    }

    public final void by(amiv amivVar) {
        copyOnWrite();
        amiw amiwVar = (amiw) this.instance;
        amiw amiwVar2 = amiw.a;
        amivVar.getClass();
        aiie aiieVar = amiwVar.p;
        if (!aiieVar.c()) {
            amiwVar.p = aihn.mutableCopy(aiieVar);
        }
        amiwVar.p.add(amivVar);
    }

    public final void bz(amun amunVar) {
        copyOnWrite();
        amup amupVar = (amup) this.instance;
        amup amupVar2 = amup.a;
        amunVar.getClass();
        amupVar.a();
        amupVar.e.add(amunVar);
    }

    public final void cA(Iterable iterable) {
        copyOnWrite();
        askp askpVar = (askp) this.instance;
        askp askpVar2 = askp.a;
        askpVar.b();
        aifs.addAll(iterable, askpVar.h);
    }

    public final void cB(aihf aihfVar) {
        copyOnWrite();
        askp askpVar = (askp) this.instance;
        asku askuVar = (asku) aihfVar.build();
        askp askpVar2 = askp.a;
        askuVar.getClass();
        askpVar.b();
        askpVar.h.add(askuVar);
    }

    public final void cC(int i) {
        copyOnWrite();
        asnc asncVar = (asnc) this.instance;
        asnc asncVar2 = asnc.a;
        asncVar.a();
        asncVar.h.h(i);
    }

    public final asrl cD(int i) {
        return (asrl) ((asrp) this.instance).c.get(i);
    }

    public final void cE(asrl asrlVar) {
        copyOnWrite();
        asrp asrpVar = (asrp) this.instance;
        asrp asrpVar2 = asrp.a;
        asrlVar.getClass();
        asrpVar.a();
        asrpVar.c.add(asrlVar);
    }

    public final void cF(int i) {
        copyOnWrite();
        asrp asrpVar = (asrp) this.instance;
        asrp asrpVar2 = asrp.a;
        asrpVar.a();
        asrpVar.c.remove(i);
    }

    public final void cG(aktq aktqVar) {
        copyOnWrite();
        assx assxVar = (assx) this.instance;
        assx assxVar2 = assx.a;
        aktqVar.getClass();
        aiie aiieVar = assxVar.k;
        if (!aiieVar.c()) {
            assxVar.k = aihn.mutableCopy(aiieVar);
        }
        assxVar.k.add(aktqVar);
    }

    public final void cH(asso assoVar) {
        copyOnWrite();
        assx assxVar = (assx) this.instance;
        assx assxVar2 = assx.a;
        assoVar.getClass();
        aiie aiieVar = assxVar.j;
        if (!aiieVar.c()) {
            assxVar.j = aihn.mutableCopy(aiieVar);
        }
        assxVar.j.add(assoVar);
    }

    public final void cI(String str, atoy atoyVar) {
        str.getClass();
        atoyVar.getClass();
        copyOnWrite();
        atpa atpaVar = (atpa) this.instance;
        atpa atpaVar2 = atpa.a;
        atpaVar.a().put(str, atoyVar);
    }

    public final void cJ(Iterable iterable) {
        copyOnWrite();
        atpi atpiVar = (atpi) this.instance;
        atpi atpiVar2 = atpi.a;
        aihv aihvVar = atpiVar.f;
        if (!aihvVar.c()) {
            atpiVar.f = aihn.mutableCopy(aihvVar);
        }
        aifs.addAll(iterable, atpiVar.f);
    }

    public final void cK(Iterable iterable) {
        copyOnWrite();
        atpi atpiVar = (atpi) this.instance;
        atpi atpiVar2 = atpi.a;
        aihv aihvVar = atpiVar.e;
        if (!aihvVar.c()) {
            atpiVar.e = aihn.mutableCopy(aihvVar);
        }
        aifs.addAll(iterable, atpiVar.e);
    }

    public final void cL(String str, long j) {
        str.getClass();
        copyOnWrite();
        atpl atplVar = (atpl) this.instance;
        atpl atplVar2 = atpl.a;
        atplVar.a().put(str, Long.valueOf(j));
    }

    public final void cM(String str, boolean z) {
        str.getClass();
        copyOnWrite();
        atpl atplVar = (atpl) this.instance;
        atpl atplVar2 = atpl.a;
        atplVar.c().put(str, Boolean.valueOf(z));
    }

    public final void cN(String str, int i) {
        str.getClass();
        copyOnWrite();
        atpq atpqVar = (atpq) this.instance;
        atpq atpqVar2 = atpq.a;
        aiip aiipVar = atpqVar.m;
        if (!aiipVar.b) {
            atpqVar.m = aiipVar.a();
        }
        atpqVar.m.put(str, Integer.valueOf(i));
    }

    public final void cO(String str, boolean z) {
        str.getClass();
        copyOnWrite();
        atpq atpqVar = (atpq) this.instance;
        atpq atpqVar2 = atpq.a;
        aiip aiipVar = atpqVar.n;
        if (!aiipVar.b) {
            atpqVar.n = aiipVar.a();
        }
        atpqVar.n.put(str, Boolean.valueOf(z));
    }

    public final void cP(String str, atps atpsVar) {
        str.getClass();
        atpsVar.getClass();
        copyOnWrite();
        atpt atptVar = (atpt) this.instance;
        atpt atptVar2 = atpt.a;
        aiip aiipVar = atptVar.d;
        if (!aiipVar.b) {
            atptVar.d = aiipVar.a();
        }
        atptVar.d.put(str, atpsVar);
    }

    public final void cQ(String str, boolean z) {
        str.getClass();
        copyOnWrite();
        atpv atpvVar = (atpv) this.instance;
        atpv atpvVar2 = atpv.a;
        aiip aiipVar = atpvVar.d;
        if (!aiipVar.b) {
            atpvVar.d = aiipVar.a();
        }
        atpvVar.d.put(str, Boolean.valueOf(z));
    }

    public final void ca(int i) {
        copyOnWrite();
        aorb aorbVar = (aorb) this.instance;
        aorb aorbVar2 = aorb.a;
        aihv aihvVar = aorbVar.c;
        if (!aihvVar.c()) {
            aorbVar.c = aihn.mutableCopy(aihvVar);
        }
        aorbVar.c.h(i - 1);
    }

    public final void cb(aihf aihfVar) {
        copyOnWrite();
        aorw aorwVar = (aorw) this.instance;
        aorn aornVar = (aorn) aihfVar.build();
        aorw aorwVar2 = aorw.a;
        aornVar.getClass();
        aorwVar.a();
        aorwVar.d.add(aornVar);
    }

    public final void cc(aigj aigjVar) {
        copyOnWrite();
        apbv apbvVar = (apbv) this.instance;
        apbv apbvVar2 = apbv.a;
        aiie aiieVar = apbvVar.g;
        if (!aiieVar.c()) {
            apbvVar.g = aihn.mutableCopy(aiieVar);
        }
        apbvVar.g.add(aigjVar);
    }

    public final void cd(ajwo ajwoVar) {
        copyOnWrite();
        apcb apcbVar = (apcb) this.instance;
        apcb apcbVar2 = apcb.a;
        ajwoVar.getClass();
        aiie aiieVar = apcbVar.g;
        if (!aiieVar.c()) {
            apcbVar.g = aihn.mutableCopy(aiieVar);
        }
        apcbVar.g.add(ajwoVar);
    }

    @Deprecated
    public final void ce(aihf aihfVar) {
        copyOnWrite();
        aplv aplvVar = (aplv) this.instance;
        ajgs ajgsVar = (ajgs) aihfVar.build();
        aplv aplvVar2 = aplv.a;
        ajgsVar.getClass();
        aiie aiieVar = aplvVar.c;
        if (!aiieVar.c()) {
            aplvVar.c = aihn.mutableCopy(aiieVar);
        }
        aplvVar.c.add(ajgsVar);
    }

    public final void cf(String str) {
        copyOnWrite();
        apmi apmiVar = (apmi) this.instance;
        apmi apmiVar2 = apmi.a;
        str.getClass();
        aiie aiieVar = apmiVar.d;
        if (!aiieVar.c()) {
            apmiVar.d = aihn.mutableCopy(aiieVar);
        }
        apmiVar.d.add(str);
    }

    public final void cg(apoj apojVar) {
        copyOnWrite();
        apok apokVar = (apok) this.instance;
        apok apokVar2 = apok.a;
        apojVar.getClass();
        aiie aiieVar = apokVar.c;
        if (!aiieVar.c()) {
            apokVar.c = aihn.mutableCopy(aiieVar);
        }
        apokVar.c.add(apojVar);
    }

    public final void ch(Iterable iterable) {
        copyOnWrite();
        apoq apoqVar = (apoq) this.instance;
        apoq apoqVar2 = apoq.a;
        apoqVar.a();
        aifs.addAll(iterable, apoqVar.f);
    }

    public final void ci(apox apoxVar) {
        copyOnWrite();
        apoq apoqVar = (apoq) this.instance;
        apoq apoqVar2 = apoq.a;
        apoxVar.getClass();
        apoqVar.a();
        apoqVar.f.add(apoxVar);
    }

    public final void cj(aihf aihfVar) {
        copyOnWrite();
        apoq apoqVar = (apoq) this.instance;
        apox apoxVar = (apox) aihfVar.build();
        apoq apoqVar2 = apoq.a;
        apoxVar.getClass();
        apoqVar.a();
        apoqVar.f.add(0, apoxVar);
    }

    public final void ck(aihf aihfVar) {
        copyOnWrite();
        apoq apoqVar = (apoq) this.instance;
        apox apoxVar = (apox) aihfVar.build();
        apoq apoqVar2 = apoq.a;
        apoxVar.getClass();
        apoqVar.a();
        apoqVar.f.add(apoxVar);
    }

    public final void cl(aihf aihfVar) {
        copyOnWrite();
        apoq apoqVar = (apoq) this.instance;
        apos aposVar = (apos) aihfVar.build();
        apoq apoqVar2 = apoq.a;
        aposVar.getClass();
        aiie aiieVar = apoqVar.g;
        if (!aiieVar.c()) {
            apoqVar.g = aihn.mutableCopy(aiieVar);
        }
        apoqVar.g.add(aposVar);
    }

    public final aihf clear() {
        if (this.defaultInstance.isMutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.instance = newMutableInstance();
        return this;
    }

    @Override // defpackage.aifr
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public aihf mo53clone() {
        aihf aihfVarNewBuilderForType = getDefaultInstanceForType().newBuilderForType();
        aihfVarNewBuilderForType.instance = buildPartial();
        return aihfVarNewBuilderForType;
    }

    public final void cm(aihf aihfVar) {
        copyOnWrite();
        apzb apzbVar = (apzb) this.instance;
        apyx apyxVar = (apyx) aihfVar.build();
        apzb apzbVar2 = apzb.a;
        apyxVar.getClass();
        apzbVar.a();
        apzbVar.e.add(apyxVar);
    }

    public final void cn(ajwo ajwoVar) {
        copyOnWrite();
        apzd apzdVar = (apzd) this.instance;
        apzd apzdVar2 = apzd.a;
        ajwoVar.getClass();
        aiie aiieVar = apzdVar.f;
        if (!aiieVar.c()) {
            apzdVar.f = aihn.mutableCopy(aiieVar);
        }
        apzdVar.f.add(ajwoVar);
    }

    public final alaw co(int i) {
        return (alaw) ((StreamingDataOuterClass$StreamingData) this.instance).f.get(i);
    }

    public final void copyOnWrite() {
        if (this.instance.isMutable()) {
            return;
        }
        copyOnWriteInternal();
    }

    protected void copyOnWriteInternal() {
        aihn aihnVarNewMutableInstance = newMutableInstance();
        mergeFromInstance(aihnVarNewMutableInstance, this.instance);
        this.instance = aihnVarNewMutableInstance;
    }

    public final void cp(alaw alawVar) {
        copyOnWrite();
        StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData = (StreamingDataOuterClass$StreamingData) this.instance;
        aihw aihwVar = StreamingDataOuterClass$StreamingData.a;
        alawVar.getClass();
        streamingDataOuterClass$StreamingData.a();
        streamingDataOuterClass$StreamingData.f.add(alawVar);
    }

    public final void cq(alaw alawVar) {
        copyOnWrite();
        StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData = (StreamingDataOuterClass$StreamingData) this.instance;
        aihw aihwVar = StreamingDataOuterClass$StreamingData.a;
        alawVar.getClass();
        streamingDataOuterClass$StreamingData.b();
        streamingDataOuterClass$StreamingData.e.add(alawVar);
    }

    public final void cr(aihh aihhVar) {
        copyOnWrite();
        StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData = (StreamingDataOuterClass$StreamingData) this.instance;
        alaw alawVar = (alaw) aihhVar.build();
        aihw aihwVar = StreamingDataOuterClass$StreamingData.a;
        alawVar.getClass();
        streamingDataOuterClass$StreamingData.b();
        streamingDataOuterClass$StreamingData.e.add(alawVar);
    }

    public final void cs(Iterable iterable) {
        copyOnWrite();
        aqhl aqhlVar = (aqhl) this.instance;
        aqhl aqhlVar2 = aqhl.a;
        aiie aiieVar = aqhlVar.g;
        if (!aiieVar.c()) {
            aqhlVar.g = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, aqhlVar.g);
    }

    public final void ct(aqll aqllVar) {
        copyOnWrite();
        aqlm aqlmVar = (aqlm) this.instance;
        aqlm aqlmVar2 = aqlm.a;
        aqllVar.getClass();
        aiie aiieVar = aqlmVar.l;
        if (!aiieVar.c()) {
            aqlmVar.l = aihn.mutableCopy(aiieVar);
        }
        aqlmVar.l.add(aqllVar);
    }

    public final void cu(Iterable iterable) {
        copyOnWrite();
        ascf ascfVar = (ascf) this.instance;
        ascf ascfVar2 = ascf.a;
        aiie aiieVar = ascfVar.P;
        if (!aiieVar.c()) {
            ascfVar.P = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, ascfVar.P);
    }

    public final void cv(akhn akhnVar) {
        copyOnWrite();
        asdf asdfVar = (asdf) this.instance;
        asdf asdfVar2 = asdf.a;
        akhnVar.getClass();
        aiie aiieVar = asdfVar.c;
        if (!aiieVar.c()) {
            asdfVar.c = aihn.mutableCopy(aiieVar);
        }
        asdfVar.c.add(akhnVar);
    }

    public final void cw(ajsv ajsvVar) {
        copyOnWrite();
        aseq aseqVar = (aseq) this.instance;
        aseq aseqVar2 = aseq.a;
        ajsvVar.getClass();
        aiie aiieVar = aseqVar.c;
        if (!aiieVar.c()) {
            aseqVar.c = aihn.mutableCopy(aiieVar);
        }
        aseqVar.c.add(ajsvVar);
    }

    public final void cx(asjc asjcVar) {
        copyOnWrite();
        asjd asjdVar = (asjd) this.instance;
        asjd asjdVar2 = asjd.a;
        asjcVar.getClass();
        asjdVar.a();
        asjdVar.c.add(asjcVar);
    }

    public final void cy(int i, aihf aihfVar) {
        copyOnWrite();
        asjd asjdVar = (asjd) this.instance;
        asjc asjcVar = (asjc) aihfVar.build();
        asjd asjdVar2 = asjd.a;
        asjcVar.getClass();
        asjdVar.a();
        asjdVar.c.set(i, asjcVar);
    }

    public final void cz(apsr apsrVar) {
        copyOnWrite();
        asjv asjvVar = (asjv) this.instance;
        asjv asjvVar2 = asjv.a;
        apsrVar.getClass();
        asjvVar.a();
        asjvVar.d.add(apsrVar);
    }

    @Override // defpackage.aiis
    public final boolean isInitialized() {
        return aihn.isInitialized(this.instance, false);
    }

    @Override // defpackage.aifr
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public aihf mo59mergeFrom(byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) throws aiik {
        copyOnWrite();
        try {
            aiiz.a.a(this.instance).j(this.instance, bArr, i, i + i2, new aifw(extensionRegistryLite));
            return this;
        } catch (aiik e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // defpackage.aiis
    public aihn getDefaultInstanceForType() {
        return this.defaultInstance;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aifr
    public aihf internalMergeFrom(aihn aihnVar) {
        return mergeFrom(aihnVar);
    }

    /* JADX INFO: renamed from: clear, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ aiir m60clear() {
        clear();
        return this;
    }

    public aihf() {
        throw null;
    }

    public aihf(short[][][] sArr, byte[] bArr) {
        this(akkr.a);
    }

    public aihf(char[][][] cArr, short[] sArr) {
        this(alyr.a);
    }

    public aihf(int[] iArr, short[] sArr) {
        this(amai.a);
    }

    public aihf(short[] sArr, byte[] bArr) {
        this(ambj.a);
    }

    public aihf(boolean[][][] zArr, byte[] bArr) {
        this(amfb.a);
    }

    public aihf(boolean[] zArr, byte[] bArr) {
        this(amiu.a);
    }

    public aihf(int[][] iArr) {
        this(amiw.a);
    }

    public aihf(short[][] sArr, byte[] bArr) {
        this(amup.a);
    }

    public aihf(byte[][][] bArr, byte[] bArr2) {
        this(amyf.a);
    }

    public aihf(short[][] sArr, char[] cArr) {
        this(amyy.a);
    }

    public aihf(boolean[] zArr, char[] cArr) {
        this(amzx.a);
    }

    public aihf(byte[][][] bArr, char[] cArr) {
        this(andt.a);
    }

    public aihf(byte[] bArr, char[] cArr) {
        this(andu.a);
    }

    public aihf(boolean[][][] zArr, char[] cArr) {
        this(anfy.a);
    }

    public aihf(short[] sArr, short[] sArr2) {
        this(ankz.a);
    }

    public aihf(int[][][] iArr, short[] sArr) {
        this(anlb.a);
    }

    public aihf(boolean[][] zArr, short[] sArr) {
        this(anlc.a);
    }

    public aihf(char[] cArr, int[] iArr) {
        this(annl.b);
    }

    public aihf(byte[][] bArr, short[] sArr) {
        this(antp.a);
    }

    public aihf(char[] cArr) {
        this(anwt.a);
    }

    public aihf(float[] fArr) {
        this(anwz.a);
    }

    @Override // defpackage.aifr, defpackage.aiir
    public aihf mergeFrom(aigm aigmVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        copyOnWrite();
        try {
            aijg aijgVarA = aiiz.a.a(this.instance);
            aihn aihnVar = this.instance;
            Object aignVar = aigmVar.k;
            if (aignVar == null) {
                aignVar = new aign(aigmVar);
            }
            aijgVarA.i(aihnVar, (aign) aignVar, extensionRegistryLite);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    public aihf(float[][][] fArr) {
        this(anxt.a);
    }

    public aihf(char[][][] cArr) {
        this(anzn.a);
    }

    public aihf(float[] fArr, byte[] bArr) {
        this(aocd.a);
    }

    public aihf(boolean[][] zArr) {
        this(aoec.a);
    }

    public aihf(int[][] iArr, byte[] bArr) {
        this(aoeg.a);
    }

    public aihf(char[][][] cArr, byte[] bArr) {
        this(aofu.a);
    }

    public aihf(int[][] iArr, char[] cArr) {
        this(aohb.a);
    }

    public aihf(float[] fArr, char[] cArr) {
        this(aohr.a);
    }

    public aihf(char[][][] cArr, char[] cArr2) {
        this(aolg.a);
    }

    public aihf(char[] cArr, char[] cArr2) {
        this(aorb.a);
    }

    public aihf(float[][][] fArr, char[] cArr) {
        this(aorw.a);
    }

    public aihf(boolean[] zArr, short[] sArr) {
        this(aotf.a);
    }

    public aihf mergeFrom(aihn aihnVar) {
        if (aihnVar != null && !getDefaultInstanceForType().getClass().isInstance(aihnVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        if (!getDefaultInstanceForType().equals(aihnVar)) {
            copyOnWrite();
            mergeFromInstance(this.instance, aihnVar);
        }
        return this;
    }

    public aihf(boolean[][][] zArr, short[] sArr) {
        this(apbv.a);
    }

    public aihf(float[][] fArr, short[] sArr) {
        this(apcb.a);
    }

    public aihf(short[] sArr, int[] iArr) {
        this(aplq.a);
    }

    public aihf(char[][] cArr, short[] sArr) {
        this(aplv.a);
    }

    public aihf(byte[] bArr) {
        this(apmi.a);
    }

    public aihf(boolean[] zArr) {
        this(apok.a);
    }

    @Override // defpackage.aifr
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public aihf mo58mergeFrom(byte[] bArr, int i, int i2) {
        return mo59mergeFrom(bArr, i, i2, ExtensionRegistryLite.a);
    }

    public aihf(boolean[][][] zArr) {
        this(apoq.a);
    }

    public aihf(byte[][][] bArr) {
        this(apzb.a);
    }

    public aihf(int[] iArr, byte[] bArr) {
        this(apzd.a);
    }

    public aihf(short[][] sArr) {
        this(apzh.a);
    }

    public aihf(char[][] cArr, byte[] bArr) {
        this(StreamingDataOuterClass$StreamingData.b);
    }

    public aihf(float[][] fArr, byte[] bArr) {
        this(aqhl.a);
    }

    public aihf(char[][] cArr, char[] cArr2) {
        this(aqlm.a);
    }

    public aihf(int[] iArr, char[] cArr) {
        this(aqot.a);
    }

    public aihf(float[][] fArr, char[] cArr) {
        this(arkk.a);
    }

    public aihf(float[][][] fArr, byte[] bArr) {
        this(ascf.a);
    }

    public aihf(int[][][] iArr, char[] cArr) {
        this(asdf.a);
    }

    public aihf(char[] cArr, short[] sArr) {
        this(asem.a);
    }

    public aihf(short[][][] sArr, short[] sArr2) {
        this(aseq.a);
    }

    public aihf(int[][] iArr, short[] sArr) {
        this(asjd.a);
    }

    public aihf(byte[] bArr, int[] iArr) {
        this(asjv.a);
    }

    public aihf(float[] fArr, short[] sArr) {
        this(askp.a);
    }

    public aihf(short[] sArr) {
        this(asnc.a);
    }

    public aihf(byte[][] bArr) {
        this(asnm.a);
    }

    public aihf(byte[] bArr, byte[] bArr2) {
        this(asrp.a);
    }

    public aihf(short[][][] sArr) {
        this(assx.a);
    }

    public aihf(byte[][] bArr, byte[] bArr2) {
        this(atop.a);
    }

    public aihf(float[][] fArr) {
        this(atoy.a);
    }

    public aihf(boolean[][] zArr, byte[] bArr) {
        this(atpa.a);
    }

    public aihf(int[][][] iArr, byte[] bArr) {
        this(atpi.a);
    }

    public aihf(boolean[][] zArr, char[] cArr) {
        this(atpl.a);
    }

    public aihf(byte[][] bArr, char[] cArr) {
        this(atpq.a);
    }

    public aihf(short[][][] sArr, char[] cArr) {
        this(atpt.a);
    }

    public aihf(short[] sArr, char[] cArr) {
        this(atpv.a);
    }

    public aihf(byte[] bArr, short[] sArr) {
        this(atrl.a);
    }

    public aihf(float[][][] fArr, short[] sArr) {
        this(aufa.a);
    }

    public aihf(byte[][][] bArr, short[] sArr) {
        this(aufx.a);
    }

    public aihf(int[] iArr, int[] iArr2) {
        this(auge.a);
    }

    public aihf(short[][] sArr, short[] sArr2) {
        this(augd.a);
    }

    public aihf(int[] iArr) {
        this(auhh.a);
    }

    public aihf(char[][] cArr) {
        this(axgt.a);
    }

    public aihf(char[] cArr, byte[] bArr) {
        this(axhv.a);
    }

    public aihf(int[][][] iArr) {
        this(axsu.a);
    }
}
