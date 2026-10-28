package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Size;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.MessageLite;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kjh implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kjh(String str, int i) {
        this.$cid = i;
        this.b = str;
        this.a = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v73, types: [agek, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v55, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        kiz kizVar;
        aixg aixgVarA;
        int i = 8;
        aiua aiuaVar = null;
        int i2 = 0;
        switch (this.$cid) {
            case 0:
                kic kicVar = (kic) obj;
                ListenableFuture listenableFutureF = kicVar.f((kid) this.b);
                boolean zD = kjn.d(listenableFutureF);
                Object obj2 = this.a;
                if (!zD) {
                    return nre.a(listenableFutureF).b(MoreExecutors.directExecutor(), new kji(obj2, kicVar, i2));
                }
                try {
                    kizVar = (kiz) a.i(listenableFutureF);
                    break;
                } catch (ExecutionException unused) {
                    kizVar = kiz.b;
                }
                return ((kjn) obj2).c(kicVar, kizVar);
            case 1:
                List list = (List) obj;
                list.getClass();
                agke agkeVarN = agke.n(list);
                Stream map = Collection.EL.stream(agkeVarN).map(new itm(11));
                Collector collector = aghu.a;
                agke agkeVar = (agke) map.collect(collector);
                iux iuxVar = (iux) this.a;
                aihh aihhVarV = hmy.V(iuxVar);
                aqmh thumbnailDetails = !agkeVarN.isEmpty() ? ((anyx) agkeVarN.get(0)).getThumbnailDetails() : aawb.N(ixt.r(((iuo) this.b).b, R.drawable.playlist_empty_state));
                aihhVarV.copyOnWrite();
                anuu anuuVar = (anuu) aihhVarV.instance;
                anuu anuuVar2 = anuu.a;
                thumbnailDetails.getClass();
                anuuVar.h = thumbnailDetails;
                anuuVar.b |= 32;
                long size = agkeVarN.size();
                aihhVarV.copyOnWrite();
                anuu anuuVar3 = (anuu) aihhVarV.instance;
                anuuVar3.b |= SemanticState.Focused;
                anuuVar3.k = size;
                anuk anukVarAq = anuk.e((anuu) aihhVarV.build()).aq();
                return hcg.f(anukVarAq, hef.p(anukVarAq), (agke) Collection.EL.stream(iuxVar.c).filter(new ibz(agkeVar, i)).map(new itm(15)).collect(collector), agkeVarN);
            case 2:
                Object obj3 = this.b;
                xgg xggVar = (xgg) this.a;
                oip oipVar = (oip) obj3;
                agkj agkjVarE = xggVar.e(xggVar.d(oipVar), (agkj) obj);
                for (oin oinVar : oipVar.o) {
                    if (!agkjVarE.containsKey(oinVar)) {
                        Object[] objArr = {"FileGroupManager", oipVar.d, oinVar.c};
                        int i3 = onb.a;
                        agrf agrfVar = ona.a;
                        ((agrc) ((agrc) agrfVar.c()).k("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "w", 178, "LogUtil.java")).I("%s: Detected corruption of isolated structure for group %s %s", objArr);
                        ((agrc) agrfVar.c()).L();
                        return Boolean.FALSE;
                    }
                }
                return Boolean.TRUE;
            case 3:
                if (!((Boolean) obj).booleanValue()) {
                    ((ong) ((xgg) this.b).d).j(1036);
                }
                return this.a;
            case 4:
                agkj agkjVar = (agkj) obj;
                agqr it = ((agkj) this.a).entrySet().iterator();
                while (true) {
                    Object obj4 = this.b;
                    if (!it.hasNext()) {
                        return ((agkh) obj4).d(false);
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    oiz oizVar = (oiz) entry.getValue();
                    if (oizVar != null && agkjVar.containsKey(oizVar)) {
                        ((agkh) obj4).e((oin) entry.getKey(), (Uri) agkjVar.get(oizVar));
                    }
                }
                break;
            case 5:
                oiu oiuVar = (oiu) obj;
                aihf builder = oiuVar.toBuilder();
                ?? r1 = this.a;
                for (String str : DesugarCollections.unmodifiableMap(oiuVar.b).keySet()) {
                    try {
                        r1.add(qnl.aX(str));
                    } catch (onv e) {
                        onb.f(e, "Failed to deserialize groupKey:".concat(String.valueOf(str)));
                        builder.V(str);
                    }
                }
                return (oiu) builder.build();
            case 6:
                aihf builder2 = ((oiu) obj).toBuilder();
                builder2.U((String) this.a, (oip) this.b);
                return (oiu) builder2.build();
            case 7:
                ojc ojcVar = (ojc) obj;
                agkh agkhVar = new agkh(4);
                agqr it2 = ((agkz) this.a).iterator();
                while (it2.hasNext()) {
                    Object obj5 = this.b;
                    oiz oizVar2 = (oiz) it2.next();
                    olt oltVar = (olt) obj5;
                    ojb ojbVar = (ojb) DesugarCollections.unmodifiableMap(ojcVar.b).get(nst.d(oizVar2, oltVar.a, oltVar.b));
                    if (ojbVar != null) {
                        agkhVar.e(oizVar2, ojbVar);
                    }
                }
                return agkhVar.d(false);
            case 8:
                aihf builder3 = ((ojc) obj).toBuilder();
                builder3.W((String) this.a, (ojb) this.b);
                return (ojc) builder3.build();
            case 9:
                ojc ojcVar2 = (ojc) obj;
                ArrayList arrayList = new ArrayList();
                aihf builder4 = ojcVar2.toBuilder();
                Object obj6 = this.b;
                for (String str2 : DesugarCollections.unmodifiableMap(ojcVar2.b).keySet()) {
                    try {
                        arrayList.add(nst.c(str2, ((olt) obj6).a, ((olt) obj6).b));
                    } catch (onx e2) {
                        builder4.X(str2);
                        onb.f(e2, "Failed to deserialize newFileKey:".concat(String.valueOf(str2)));
                        agfm.c("|").h(str2).size();
                    }
                }
                ((AtomicReference) this.a).set(arrayList);
                return (ojc) builder4.build();
            case 10:
                pky pkyVar = (pky) obj;
                if (pkyVar.g()) {
                    ((agsj) ((agsj) qam.a.c()).k("com/google/android/libraries/notifications/registration/impl/RegistrationHandler", "storeAllAccountsAsync", 172, "RegistrationHandler.java")).t("Failed fetching accounts from storage, not storing accounts");
                    return null;
                }
                for (plx plxVar : (List) pkyVar.d()) {
                    String str3 = plxVar.b;
                    int i4 = plxVar.f;
                    if (i4 == 1 || i4 == 2 || i4 == 3) {
                        Object obj7 = this.b;
                        ahno.G(!TextUtils.isEmpty(str3), "Account name must not be empty.");
                        qam qamVar = (qam) obj7;
                        ahno.G(qamVar.c.b != null, "GcmSenderProjectId must be set on GnpConfig");
                        if (qamVar.e.a(str3)) {
                            try {
                                plx plxVarA = ((qam) obj7).b.a(new pxo(str3));
                                Object obj8 = this.a;
                                qamVar.b.b(str3);
                                qamVar.d.c(plxVarA, (aier) obj8);
                            } catch (pvd e3) {
                                ((agsj) ((agsj) ((agsj) qam.a.b()).j(e3)).k("com/google/android/libraries/notifications/registration/impl/RegistrationHandler", "register", 107, "RegistrationHandler.java")).t("Registration failed. Error inserting account.");
                            }
                        } else {
                            ((agsj) ((agsj) qam.a.c()).k("com/google/android/libraries/notifications/registration/impl/RegistrationHandler", "register", 96, "RegistrationHandler.java")).t("Registration failed. Provided account is not available on device.");
                            new Exception("Account intended to register is not available on device.");
                        }
                    }
                }
                return null;
            case 11:
                axfs axfsVar = (axfs) ((agke) this.a).get(0);
                while (!((SharedPreferences) ((qgg) this.b).d.io()).edit().putString("lastExitProcessName", axfsVar.c).putLong("lastExitTimestamp", axfsVar.g).commit()) {
                    i2++;
                    if (i2 >= 3) {
                        ((agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitMetricServiceImpl", "updateLastRecordedAppExit", 220, "ApplicationExitMetricServiceImpl.java")).t("Failed to persist most recent App Exit");
                        return null;
                    }
                    break;
                }
                return null;
            case 12:
                qll qllVar = (qll) obj;
                int i5 = qmp.a;
                Object obj9 = this.b;
                qlk qlkVar = qlk.a;
                obj9.getClass();
                qlk qlkVar2 = (qlk) qllVar.b.get(obj9);
                if (qlkVar2 != null) {
                    qlkVar = qlkVar2;
                }
                Object obj10 = this.a;
                aihf builder5 = qlkVar.toBuilder();
                if (!DesugarCollections.unmodifiableList(((qlk) builder5.instance).c).contains(obj10)) {
                    builder5.aa((String) obj10);
                }
                aihf builder6 = qllVar.toBuilder();
                builder5.copyOnWrite();
                qlk qlkVar3 = (qlk) builder5.instance;
                qlkVar3.b |= 1;
                qlkVar3.d = (String) obj10;
                builder6.ab((String) obj9, (qlk) builder5.build());
                return (qll) builder6.build();
            case 13:
                rfa rfaVar = (rfa) this.b;
                Size sizeN = ((qww) rfaVar.a.get()).a;
                if (sizeN == null) {
                    sizeN = rfaVar.c.n();
                }
                rif rifVar = (rif) this.a;
                rifVar.t(sizeN);
                rifVar.w();
                return null;
            case 14:
                Object obj11 = this.b;
                rmo rmoVar = (rmo) this.a;
                rmoVar.o((rlt) obj11);
                ((axfd) rmoVar.g.io()).P((affd) obj);
                return null;
            case 15:
                ajha ajhaVar = (ajha) obj;
                ajha ajhaVar2 = ajha.a;
                boolean zEquals = ajhaVar2.equals(ajhaVar);
                Object obj12 = this.a;
                if (!zEquals) {
                    aihf aihfVar = (aihf) obj12;
                    aihfVar.copyOnWrite();
                    aiqv aiqvVar = (aiqv) aihfVar.instance;
                    aiqv aiqvVar2 = aiqv.a;
                    ajhaVar.getClass();
                    aiqvVar.e = ajhaVar;
                    aiqvVar.b |= 8;
                }
                Object obj13 = this.b;
                alos alosVar = (alos) alou.a.createBuilder();
                alosVar.copyOnWrite();
                alou alouVar = (alou) alosVar.instance;
                aiqv aiqvVar3 = (aiqv) ((aihf) obj12).build();
                aiqvVar3.getClass();
                alouVar.d = aiqvVar3;
                alouVar.c = 23;
                alou alouVar2 = (alou) alosVar.build();
                rpw rpwVar = (rpw) obj13;
                dov dovVar = (dov) rpwVar.b.io();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                dovVar.S(alouVar2, TimeUnit.HOURS.toMillis(rpwVar.a.f().toEpochMilli() / 3600000));
                return ajhaVar2;
            case 16:
                ajha ajhaVar3 = (ajha) obj;
                ajha ajhaVar4 = ajha.a;
                boolean zEquals2 = ajhaVar4.equals(ajhaVar3);
                Object obj14 = this.a;
                if (!zEquals2) {
                    aihf aihfVar2 = (aihf) obj14;
                    aihfVar2.copyOnWrite();
                    aiqv aiqvVar4 = (aiqv) aihfVar2.instance;
                    aiqv aiqvVar5 = aiqv.a;
                    ajhaVar3.getClass();
                    aiqvVar4.e = ajhaVar3;
                    aiqvVar4.b |= 8;
                }
                Object obj15 = this.b;
                alou alouVar3 = alou.a;
                alos alosVar2 = (alos) alouVar3.createBuilder();
                alosVar2.copyOnWrite();
                alou alouVar4 = (alou) alosVar2.instance;
                aiqv aiqvVar6 = (aiqv) ((aihf) obj14).build();
                aiqvVar6.getClass();
                alouVar4.d = aiqvVar6;
                alouVar4.c = 23;
                rqa rqaVar = (rqa) obj15;
                awmd awmdVar = rqaVar.g;
                ((dov) awmdVar.io()).S((alou) alosVar2.build(), rqaVar.b());
                aihf aihfVarCreateBuilder = aiqw.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aiqw aiqwVar = (aiqw) aihfVarCreateBuilder.instance;
                aiqwVar.c = 1;
                aiqwVar.b |= 1;
                aiqw aiqwVar2 = (aiqw) aihfVarCreateBuilder.build();
                alos alosVar3 = (alos) alouVar3.createBuilder();
                alosVar3.copyOnWrite();
                alou alouVar5 = (alou) alosVar3.instance;
                aiqwVar2.getClass();
                alouVar5.d = aiqwVar2;
                alouVar5.c = 24;
                ((dov) awmdVar.io()).T((alou) alosVar3.build(), zvz.a);
                return ajhaVar4;
            case 17:
                smr smrVar = (smr) obj;
                aoqc aoqcVar = (aoqc) this.a;
                int i6 = aoqcVar.b;
                aehs aehsVar = ((rvc) this.b).a;
                if (i6 != 361588638) {
                    Object obj16 = aehsVar.f;
                    String str4 = smrVar.a;
                    aixg aixgVar = aixg.LAYOUT_TYPE_COMPANION;
                    xsc xscVar = (xsc) obj16;
                    String strX = xscVar.X(aixgVar, str4);
                    amco amcoVarAi = ((vwt) aehsVar.a).ai(smrVar, strX, aixgVar, null);
                    skn sknVarA = sko.a();
                    sknVarA.l(strX);
                    sknVarA.a = aixgVar;
                    sknVarA.m(1);
                    aixr aixrVar = aixr.TRIGGER_TYPE_ON_LAYOUT_SELF_EXIT_REQUESTED;
                    sknVarA.g(agke.q(new slr(xscVar.Z(aixrVar), aixrVar, false, strX)));
                    sknVarA.c(amcoVarAi);
                    sknVarA.c = shh.b(new sji(aoqcVar));
                    return sknVarA.a();
                }
                ajlh ajlhVar = i6 == 361588638 ? (ajlh) aoqcVar.c : ajlh.a;
                aiuc aiucVar = ajlhVar.b;
                if (aiucVar == null) {
                    aiucVar = aiuc.a;
                }
                int i7 = aiucVar.b;
                if ((i7 & 2) == 0 || (aixgVarA = aixg.a(aiucVar.d)) == null) {
                    aixgVarA = aixg.LAYOUT_TYPE_UNSPECIFIED;
                }
                String strX2 = (i7 & 1) != 0 ? aiucVar.c : ((xsc) aehsVar.f).X(aixgVarA, smrVar.a);
                if ((aiucVar.b & 4) != 0 && (aiuaVar = aiucVar.e) == null) {
                    aiuaVar = aiua.a;
                }
                amco amcoVarAi2 = ((vwt) aehsVar.a).ai(smrVar, strX2, aixgVarA, aiuaVar);
                skn sknVarA2 = sko.a();
                sknVarA2.l(strX2);
                sknVarA2.a = aixgVarA;
                sknVarA2.m(1);
                Object obj17 = aehsVar.f;
                aixr aixrVar2 = aixr.TRIGGER_TYPE_ON_LAYOUT_SELF_EXIT_REQUESTED;
                sknVarA2.g(agke.q(new slr(((xsc) obj17).Z(aixrVar2), aixrVar2, false, strX2)));
                sknVarA2.c(amcoVarAi2);
                sknVarA2.c = shh.b(new shu(ajlhVar));
                if (aiuaVar != null) {
                    sknVarA2.b(aiuaVar);
                }
                return sknVarA2.a();
            case 18:
                smr smrVar2 = (smr) obj;
                skm skmVar = (skm) smrVar2.d(siq.class);
                wjf wjfVar = (wjf) smrVar2.d(sid.class);
                sgn sgnVar = (sgn) smrVar2.d(shn.class);
                String str5 = (String) smrVar2.d(sib.class);
                String str6 = (String) smrVar2.d(sjh.class);
                smc smcVar = skmVar.a;
                if (!(smcVar instanceof snn) || TextUtils.isEmpty(((snn) smcVar).k())) {
                    rmp.n(null, "Missing ad video id.");
                    return null;
                }
                Object obj18 = this.a;
                if (obj18 == null || Objects.equals(obj18, akck.a)) {
                    return null;
                }
                rvh rvhVar = (rvh) this.b;
                return rvhVar.b.m(rvhVar.a, str6, skmVar, (akck) obj18, wjfVar, str5, sgnVar);
            case 19:
                smr smrVar3 = (smr) obj;
                skm skmVar2 = (skm) smrVar3.d(siq.class);
                wjf wjfVar2 = (wjf) smrVar3.d(sid.class);
                sgn sgnVar2 = (sgn) smrVar3.d(shn.class);
                String str7 = (String) smrVar3.d(sib.class);
                String str8 = (String) smrVar3.d(sjh.class);
                smc smcVar2 = skmVar2.a;
                boolean z = smcVar2 instanceof snn;
                ?? r4 = this.a;
                if (!z || TextUtils.isEmpty(((snn) smcVar2).k())) {
                    rmp.n(null, "Missing ad video id.");
                    return null;
                }
                try {
                    akck akckVar = (akck) r4.get();
                    if (akckVar == null || Objects.equals(akckVar, akck.a)) {
                        return null;
                    }
                    rvz rvzVar = (rvz) this.b;
                    return rvzVar.b.m(rvzVar.a, str8, skmVar2, akckVar, wjfVar2, str7, sgnVar2);
                } catch (InterruptedException | ExecutionException e4) {
                    throw new RuntimeException(e4);
                }
            default:
                tpk tpkVar = (tpk) this.b;
                sya syaVar = tpkVar.b;
                MessageLite messageLite = (MessageLite) obj;
                Object objIo = tpkVar.a.io();
                aimn aimnVar = (aimn) ((MessageLite) this.a.apply(syaVar.a(objIo, messageLite)));
                aimn aimnVar2 = iqe.a;
                aihf builder7 = ((aili) messageLite).toBuilder();
                aimnVar.getClass();
                builder7.copyOnWrite();
                aili ailiVar = (aili) builder7.instance;
                aiip aiipVar = ailiVar.b;
                if (!aiipVar.b) {
                    ailiVar.b = aiipVar.a();
                }
                ailiVar.b.put(objIo, aimnVar);
                return (aili) builder7.build();
        }
    }

    public /* synthetic */ kjh(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ kjh(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
