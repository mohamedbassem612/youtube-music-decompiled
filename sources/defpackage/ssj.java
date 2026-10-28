package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ssj implements vxc {
    private final /* synthetic */ int $cid;
    public final Object a;
    public final Object b;

    public ssj(Context context, vxe vxeVar, int i) {
        this.$cid = i;
        context.getClass();
        this.b = context;
        vxeVar.getClass();
        this.a = vxeVar;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
        throw null;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.lang.Object, xgm] */
    /* JADX WARN: Type inference failed for: r11v24, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r11v25, types: [aaps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v26, types: [java.lang.Object, nry] */
    /* JADX WARN: Type inference failed for: r11v28, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r11v29, types: [axsp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v34, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r11v35, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r11v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r12v44, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v25, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r13v41, types: [java.lang.Object, xgm] */
    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        int iAq;
        int iAq2;
        int iAq3;
        int iAq4;
        int i = 5;
        aead aeadVar = null;
        switch (this.$cid) {
            case 0:
                aihl aihlVar = apyf.b;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                ajwoVar.c(aihlVarCheckIsLite);
                if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                    ajwoVar.c(aihlVarCheckIsLite2);
                    Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                    if (((apyf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c) {
                        ((awlo) this.a).kk(Boolean.TRUE);
                        for (srp srpVar : ((roq) this.b).a) {
                            acjx acjxVar = srpVar.d;
                            srpVar.d = null;
                            srpVar.iM(acjxVar);
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ajqf.b);
                ajwoVar.c(aihlVarCheckIsLite3);
                Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
                ajqf ajqfVar = (ajqf) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2));
                if ((ajqfVar.c & 2) == 0) {
                    int i2 = ajqfVar.f;
                    int iAq5 = ahng.aq(i2);
                    if ((iAq5 == 0 || iAq5 != 39) && (((iAq = ahng.aq(i2)) == 0 || iAq != 40) && (((iAq2 = ahng.aq(i2)) == 0 || iAq2 != 52) && (((iAq3 = ahng.aq(i2)) == 0 || iAq3 != 55) && ((iAq4 = ahng.aq(i2)) == 0 || iAq4 != 58))))) {
                        ((rkt) this.a.io()).i(ajwoVar);
                        return;
                    } else {
                        ((abzi) this.b).b(ajqfVar);
                        return;
                    }
                }
                arrc arrcVar = ajqfVar.e;
                if (arrcVar == null) {
                    arrcVar = arrc.a;
                }
                int i3 = arrcVar.b;
                if (i3 != 1) {
                    Object obj = this.b;
                    if (i3 != 3) {
                        ((abzi) obj).b(ajqfVar);
                        return;
                    }
                    abzi abziVar = (abzi) obj;
                    aapw aapwVar = (aapw) abziVar.b;
                    wor worVarI = aapwVar.i();
                    worVarI.a = ajqfVar.d;
                    arrc arrcVar2 = ajqfVar.e;
                    worVarI.b = arrcVar2 == null ? arrc.a : arrcVar2;
                    if (arrcVar2 == null) {
                        arrcVar2 = arrc.a;
                    }
                    arre arreVar = arrcVar2.b == 3 ? (arre) arrcVar2.c : arre.a;
                    ?? r12 = abziVar.l;
                    taf.i(aapwVar.j(worVarI, r12), r12, new ijj(obj, 18), new rjy(obj, arreVar.c, ajqfVar, i), null);
                    return;
                }
                Object obj2 = this.b;
                wpl wplVar = (wpl) tym.U(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", wpl.class);
                arrc arrcVar3 = ajqfVar.e;
                if (arrcVar3 == null) {
                    arrcVar3 = arrc.a;
                }
                abzi abziVar2 = (abzi) obj2;
                Object obj3 = abziVar2.b;
                aihf builder = arrcVar3.toBuilder();
                aapw aapwVar2 = (aapw) obj3;
                wor worVarI2 = aapwVar2.i();
                worVarI2.a = ajqfVar.d;
                if (wplVar != null) {
                    arrc arrcVar4 = (arrc) builder.instance;
                    aihf builder2 = (arrcVar4.b == 1 ? (arrd) arrcVar4.c : arrd.a).toBuilder();
                    String strB = wplVar.b();
                    builder2.copyOnWrite();
                    arrd arrdVar = (arrd) builder2.instance;
                    arrdVar.b |= 1;
                    arrdVar.c = strB;
                    arrd arrdVar2 = (arrd) builder2.build();
                    builder.copyOnWrite();
                    arrc arrcVar5 = (arrc) builder.instance;
                    arrdVar2.getClass();
                    arrcVar5.c = arrdVar2;
                    arrcVar5.b = 1;
                }
                worVarI2.b = (arrc) builder.build();
                ?? r13 = abziVar2.l;
                byte[] bArr = null;
                taf.i(aapwVar2.j(worVarI2, r13), r13, new gwc(obj2, wplVar, builder, 6, bArr), new rjy(obj2, (Object) wplVar, (Object) builder, 4, bArr), null);
                return;
            case 2:
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(alem.b);
                ajwoVar.c(aihlVarCheckIsLite4);
                if (ajwoVar.j.n(aihlVarCheckIsLite4.d)) {
                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(alem.b);
                    ajwoVar.c(aihlVarCheckIsLite5);
                    Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite5.d);
                    alem alemVar = (alem) (objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3));
                    if ((alemVar.c & 2) != 0) {
                        ?? r14 = this.a;
                        ajwo ajwoVar2 = alemVar.e;
                        if (ajwoVar2 == null) {
                            ajwoVar2 = ajwo.a;
                        }
                        r14.a(ajwoVar2);
                    }
                    Object obj4 = this.b;
                    alen alenVar = alemVar.d;
                    if (alenVar == null) {
                        alenVar = alen.a;
                    }
                    aigj aigjVar = alenVar.b;
                    alen alenVar2 = alemVar.d;
                    if (alenVar2 == null) {
                        alenVar2 = alen.a;
                    }
                    aigj aigjVar2 = alenVar2.c;
                    aigj aigjVar3 = alemVar.k;
                    String str = alemVar.i;
                    aroq aroqVar = alemVar.j;
                    if (aroqVar == null) {
                        aroqVar = aroq.a;
                    }
                    ((svl) obj4).b(aigjVar, aigjVar2, aigjVar3, str, aroqVar, new sub(this, alemVar));
                    return;
                }
                return;
            case 3:
                aihl aihlVarCheckIsLite6 = aihn.checkIsLite(amfq.b);
                ajwoVar.c(aihlVarCheckIsLite6);
                Object objK4 = ajwoVar.j.k(aihlVarCheckIsLite6.d);
                Object objC = objK4 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK4);
                Object obj5 = this.b;
                amfq amfqVar = (amfq) objC;
                byte[] bArrG = amfqVar.c.G();
                byte[] bArrG2 = amfqVar.d.G();
                qcb qcbVar = new qcb(this);
                svh svhVar = (svh) obj5;
                svhVar.d.add(qcbVar);
                taf.k(svhVar.b, hed.C(), new gyr(obj5, bArrG, bArrG2, 12), new gyr(obj5, bArrG, bArrG2, 13));
                return;
            case 4:
                aihl aihlVarCheckIsLite7 = aihn.checkIsLite(ajtp.a);
                ajwoVar.c(aihlVarCheckIsLite7);
                if (ajwoVar.j.n(aihlVarCheckIsLite7.d)) {
                    aihl aihlVarCheckIsLite8 = aihn.checkIsLite(ajtp.a);
                    ajwoVar.c(aihlVarCheckIsLite8);
                    Object objK5 = ajwoVar.j.k(aihlVarCheckIsLite8.d);
                    ajto ajtoVar = (ajto) (objK5 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK5));
                    if ((ajtoVar.b & 2) == 0) {
                        if (ajtoVar.c) {
                            this.a.hB().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(ajwoVar.c, (amud) null), null);
                            return;
                        }
                        return;
                    }
                    boolean z = ajtoVar.c;
                    String str2 = xhd.b;
                    HashMap map2 = new HashMap();
                    if (map != null) {
                        map2.putAll(map);
                    }
                    if (z) {
                        map2.put(xhd.c, Boolean.TRUE);
                    }
                    ?? r11 = this.b;
                    ajwo ajwoVar3 = ajtoVar.d;
                    if (ajwoVar3 == null) {
                        ajwoVar3 = ajwo.a;
                    }
                    r11.c(ajwoVar3, map2);
                    return;
                }
                return;
            case 5:
                this.b.c(((aanb) this.a.io()).d());
                return;
            case 6:
                Optional optionalOfNullable = Optional.ofNullable((nrv) tym.U(map, "com.google.android.libraries.elements.interfaces.command_event_data", nrv.class));
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable(((nrv) optionalOfNullable.get()).e());
                }
                nrt nrtVar = (nrt) (true != optionalOfNullable.isPresent() ? nrv.d() : optionalOfNullable.get());
                if (map != null && map.containsKey("com.google.android.libraries.youtube.rendering.elements.sender_view")) {
                    nrtVar.d((View) tym.U(map, "com.google.android.libraries.youtube.rendering.elements.sender_view", View.class));
                }
                Optional optionalOfNullable2 = Optional.ofNullable(tym.S(map, "sectionListController"));
                acrj acrjVar = new acrj(nrtVar, 6);
                if (true == optionalOfNullable2.isPresent()) {
                    ((nrt) acrjVar.a).a.e("sectionListController", optionalOfNullable2.get());
                }
                Object objS = tym.S(map, "221293762");
                if (objS != null) {
                    nrtVar.a.e("221293762", objS);
                }
                xgn xgnVarHB = map == null ? null : (xgn) map.get("com.google.android.libraries.youtube.logging.interaction_logger");
                if (xgnVarHB == null) {
                    ?? r15 = this.a;
                    xgnVarHB = r15 != 0 ? r15.hB() : null;
                }
                if (xgnVarHB == null) {
                    xgnVarHB = null;
                }
                nrtVar.d = new adaq(null, null, xgnVarHB, ajwoVar);
                ?? r16 = this.b;
                aihl aihlVarCheckIsLite9 = aihn.checkIsLite(akrx.a);
                ajwoVar.c(aihlVarCheckIsLite9);
                Object objK6 = ajwoVar.j.k(aihlVarCheckIsLite9.d);
                r16.a((CommandOuterClass$Command) (objK6 == null ? aihlVarCheckIsLite9.b : aihlVarCheckIsLite9.c(objK6)), nrtVar.a()).D();
                return;
            case 7:
                aihl aihlVarCheckIsLite10 = aihn.checkIsLite(aqzl.b);
                ajwoVar.c(aihlVarCheckIsLite10);
                Object objK7 = ajwoVar.j.k(aihlVarCheckIsLite10.d);
                aqzl aqzlVar = (aqzl) (objK7 == null ? aihlVarCheckIsLite10.b : aihlVarCheckIsLite10.c(objK7));
                List<adhf> listF = ((aeod) this.a).f(aqzlVar.d);
                if (listF != null) {
                    for (adhf adhfVar : listF) {
                        if (aqzlVar.e.size() > 0) {
                            List listA = adhf.a(aqzlVar.e);
                            adhf.b(adhfVar.d, listA);
                            adhfVar.e.kk(new Object());
                            adhfVar.h.addAll((Collection) j$.util.Collection.EL.stream(listA).map(new accu(8)).collect(Collectors.toCollection(new yoj(14))));
                        }
                        if ((aqzlVar.c & 4) != 0) {
                            ajwo ajwoVar4 = aqzlVar.g;
                            if (ajwoVar4 == null) {
                                ajwoVar4 = ajwo.a;
                            }
                            adhfVar.i = Optional.of(ajwoVar4);
                        }
                    }
                    if ((aqzlVar.c & 2) != 0) {
                        ?? r17 = this.b;
                        ajwo ajwoVar5 = aqzlVar.f;
                        if (ajwoVar5 == null) {
                            ajwoVar5 = ajwo.a;
                        }
                        r17.a(ajwoVar5);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                aihl aihlVarCheckIsLite11 = aihn.checkIsLite(apmv.b);
                ajwoVar.c(aihlVarCheckIsLite11);
                Object objK8 = ajwoVar.j.k(aihlVarCheckIsLite11.d);
                apmv apmvVar = (apmv) (objK8 == null ? aihlVarCheckIsLite11.b : aihlVarCheckIsLite11.c(objK8));
                if (apmvVar.isInitialized()) {
                    if ((apmvVar.c & 2) != 0) {
                        ((Optional) this.b).isPresent();
                        aeadVar = new aead(this, apmvVar, i);
                    }
                    aead aeadVar2 = aeadVar;
                    adwr adwrVar = (adwr) tym.U(map, "sectionListController", adwr.class);
                    if (adwrVar != null) {
                        String str3 = apmvVar.d;
                        int i4 = apmvVar.f;
                        int i5 = apmvVar.h;
                        if (adwrVar.v(str3, i4, aeadVar2) || aeadVar2 == null) {
                            return;
                        }
                        aeadVar2.run();
                        return;
                    }
                    ?? r18 = this.a;
                    String str4 = apmvVar.g;
                    if (str4 == null) {
                        throw new NullPointerException("Null sectionListId");
                    }
                    String str5 = apmvVar.d;
                    if (str5 == null) {
                        throw new NullPointerException("Null targetSectionId");
                    }
                    r18.kk(new aecn(str4, str5, apmvVar.f, apmvVar.h, apmvVar.i, aeadVar2, null));
                    return;
                }
                return;
            default:
                aihl aihlVarCheckIsLite12 = aihn.checkIsLite(akfr.b);
                ajwoVar.c(aihlVarCheckIsLite12);
                Object objK9 = ajwoVar.j.k(aihlVarCheckIsLite12.d);
                akfr akfrVar = (akfr) (objK9 == null ? aihlVarCheckIsLite12.b : aihlVarCheckIsLite12.c(objK9));
                ClipboardManager clipboardManager = (ClipboardManager) ((Context) this.b).getSystemService("clipboard");
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("text/plain", akfrVar.c));
                    this.a.b(akfrVar.d);
                    return;
                } else {
                    if (akfrVar.e.size() > 0) {
                        this.a.b(akfrVar.e);
                        return;
                    }
                    return;
                }
        }
    }

    public ssj(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public ssj(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public ssj(roq roqVar, int i) {
        this.$cid = i;
        this.b = roqVar;
        this.a = new awlo();
    }
}
