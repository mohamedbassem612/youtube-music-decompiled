package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import j$.util.Optional;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(b = aixo.SLOT_TYPE_AD_BREAK_REQUEST, d = {sid.class, sic.class, sjy.class})
public final class ruz extends rvo {
    public final aazw a;
    public final mbc b;
    public final vyo c;
    public final long d;
    public final rtl e;
    public final sac f;
    public final atzn g;
    public final aehs h;
    private final Executor j;
    private final Executor k;
    private final sdo l;
    private final abfv m;

    public ruz(rvr rvrVar, Executor executor, Executor executor2, rtl rtlVar, aazw aazwVar, aehs aehsVar, rsi rsiVar, sdo sdoVar, mbc mbcVar, sac sacVar, atzn atznVar, vyo vyoVar, abfv abfvVar) {
        super(rvrVar);
        this.j = executor;
        this.k = executor2;
        this.e = rtlVar;
        this.a = aazwVar;
        this.h = aehsVar;
        this.l = sdoVar;
        this.b = mbcVar;
        this.d = rsiVar.f;
        this.f = sacVar;
        this.g = atznVar;
        this.c = vyoVar;
        this.m = abfvVar;
    }

    public final wgk a(wgk wgkVar, String str, acfw acfwVar) {
        wgk wgkVar2;
        if (afxw.e(this.c).cu) {
            wgkVar2 = wgkVar;
            this.k.execute(afwl.i(new mrh(this, wgkVar2, str, acfwVar, 12, (char[]) null)));
        } else {
            wgkVar2 = wgkVar;
            this.f.e(wgkVar2, str, acfwVar);
        }
        if (Collection.EL.stream(wgkVar2.a()).noneMatch(new rej(14))) {
            return wgkVar2;
        }
        allc allcVar = wgkVar2.a;
        aihf builder = allcVar.toBuilder();
        builder.copyOnWrite();
        ((allc) builder.instance).e = allc.emptyProtobufList();
        for (apji apjiVar : allcVar.e) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aivv.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aivv.a);
                apjiVar.c(aihlVarCheckIsLite2);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                if (!sdc.b((aivt) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)))) {
                }
            }
            builder.ba(apjiVar);
        }
        return new wgk((allc) builder.build(), wgkVar2.b);
    }

    @Override // defpackage.rvo
    public final void b() {
        rvr rvrVar = this.i;
        final long jA = ((acfw) rvrVar.a.d(sjy.class)).a();
        rvrVar.a(new agek() { // from class: ruy
            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.CharSequence, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v27, types: [java.lang.Object, mbc] */
            @Override // defpackage.agek
            public final Object apply(Object obj) {
                String str;
                smr smrVar = (smr) obj;
                wjf wjfVar = (wjf) smrVar.d(sid.class);
                String str2 = (String) smrVar.d(sic.class);
                acfw acfwVar = (acfw) smrVar.d(sjy.class);
                if (wjfVar.R()) {
                    throw new IllegalStateException("Received fulfillment request for offline playback");
                }
                long j = jA;
                ruz ruzVar = this.a;
                if (smrVar.e(sip.class)) {
                    skl sklVar = (skl) smrVar.d(sip.class);
                    if (!sklVar.f().isEmpty()) {
                        rmp.n(smrVar, "Prefetched ads exist");
                        return null;
                    }
                    vyo vyoVar = ruzVar.c;
                    if (taq.aM(vyoVar)) {
                        long epochMilli = ruzVar.b.f().toEpochMilli();
                        long jZ = taq.Z(vyoVar);
                        atzn atznVar = ruzVar.g;
                        if (epochMilli - (TextUtils.equals(atznVar.b, str2) ? atznVar.a : 0L) < jZ) {
                            rmp.k(smrVar, "Midroll/Pause ad slot dropped due to frequency cap.");
                            return null;
                        }
                    }
                    rtl rtlVar = ruzVar.e;
                    byte[] bArr = sklVar.h;
                    String strE = sklVar.e();
                    long jA2 = sklVar.a();
                    int i = sklVar.c;
                    ruzVar.a.a();
                    wgk wgkVarA = rtlVar.a(str2, bArr, strE, "", -1L, jA2, i, j, new axmq(ruzVar.b, ruzVar.d), false, smrVar.e(sih.class) ? Optional.of(((yvs) smrVar.d(sih.class)).a) : Optional.empty(), smrVar.e(siz.class) && ((Boolean) smrVar.d(siz.class)).booleanValue(), null);
                    if (wgkVarA == null) {
                        return null;
                    }
                    if (wgkVarA.a().isEmpty() && wgkVarA.g().isEmpty() && !wgkVarA.h()) {
                        return null;
                    }
                    if (taq.aM(vyoVar)) {
                        atzn atznVar2 = ruzVar.g;
                        if (!wgkVarA.h()) {
                            atznVar2.a = atznVar2.c.f().toEpochMilli();
                            atznVar2.b = str2;
                        }
                    }
                    wgk wgkVarA2 = ruzVar.a(wgkVarA, str2, acfwVar);
                    if (wgkVarA2.a().isEmpty() && wgkVarA2.g().isEmpty() && !wgkVarA2.h()) {
                        return null;
                    }
                    return ruzVar.h.e(smrVar, wgkVarA2.h() ? aixg.LAYOUT_TYPE_THROTTLED_AD_BREAK_RESPONSE : aixg.LAYOUT_TYPE_AD_BREAK_RESPONSE, wjfVar, wgkVarA2, str2);
                }
                if (!smrVar.e(sih.class) || !smrVar.e(shj.class)) {
                    throw new IllegalStateException("Neither InstreamAdBreak or (CuePoint + AdBreakIndex) is provided for the ABR slot.");
                }
                yvs yvsVar = (yvs) smrVar.d(sih.class);
                rtl rtlVar2 = ruzVar.e;
                byte[] bArrAb = wjfVar.ab();
                Iterator it = wjfVar.H().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = "";
                        break;
                    }
                    aisu aisuVar = (aisu) it.next();
                    int iBi = a.bi(aisuVar.f);
                    if (iBi == 0) {
                        iBi = 1;
                    }
                    if (iBi == 7) {
                        str = aisuVar.g;
                        break;
                    }
                }
                String str3 = yvsVar.e;
                String str4 = str3 != null ? str3 : "";
                long j2 = yvsVar.d;
                long jA3 = yvsVar.a();
                int iIntValue = ((Integer) smrVar.d(shj.class)).intValue();
                ruzVar.a.a();
                wgk wgkVarA3 = rtlVar2.a(str2, bArrAb, str, str4, j2, jA3, iIntValue, j, new axmq(ruzVar.b, ruzVar.d), true, Optional.of(((yvs) smrVar.d(sih.class)).a), false, null);
                if (wgkVarA3 == null) {
                    ruzVar.c(wjfVar, smrVar, yvsVar, abad.SERVER_ERROR);
                    return null;
                }
                if (wgkVarA3.h()) {
                    ruzVar.c(wjfVar, smrVar, yvsVar, abad.NO_DAI_CONFIG_RETURNED_IN_GAB);
                    return null;
                }
                if (afxw.e(ruzVar.c).aN && wgkVarA3.a.d.size() <= 0 && wgkVarA3.b(agke.q(aixo.SLOT_TYPE_PLAYER_BYTES)).isEmpty()) {
                    ruzVar.c(wjfVar, smrVar, yvsVar, abad.NO_DAI_CONFIG_RETURNED_IN_GAB);
                }
                boolean z = (wgkVarA3.a().isEmpty() && wgkVarA3.g().isEmpty()) ? false : true;
                wgk wgkVarA4 = ruzVar.a(wgkVarA3, str2, acfwVar);
                if (z && wgkVarA4.a().isEmpty() && wgkVarA4.g().isEmpty()) {
                    return null;
                }
                return ruzVar.h.e(smrVar, aixg.LAYOUT_TYPE_AD_BREAK_RESPONSE, wjfVar, wgkVarA4, str2);
            }
        }, this.j, this.k, null);
    }

    public final void c(wjf wjfVar, smr smrVar, yvs yvsVar, abad abadVar) {
        if (wjfVar == null || wjfVar.f() == null || !wjfVar.f().aa()) {
            this.l.g((acfw) smrVar.d(sjy.class), yvsVar.a);
        } else {
            this.m.b((String) smrVar.d(sic.class), yvsVar.a, abadVar);
        }
    }
}
