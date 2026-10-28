package defpackage;

import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vrf implements vxc {
    private final /* synthetic */ int $cid;
    public final Object a;
    public final Object b;
    private final Object c;

    public vrf(wrb wrbVar, ahgb ahgbVar, wwi wwiVar, int i) {
        this.$cid = i;
        wrbVar.getClass();
        this.c = wrbVar;
        ahgbVar.getClass();
        this.b = ahgbVar;
        this.a = wwiVar;
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
    /* JADX WARN: Type inference failed for: r0v1, types: [bog, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v5, types: [bog, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r13v23, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r13v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v25, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, zwb] */
    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        Optional optionalEmpty;
        String str;
        ?? r0;
        srz srzVar;
        int i = this.$cid;
        int i2 = 0;
        agkj agkjVarJ = null;
        int i3 = 1;
        if (i == 0) {
            if (this.c.getLifecycle().a().a(bob.e)) {
                aihl aihlVarCheckIsLite = aihn.checkIsLite(apyi.b);
                ajwoVar.c(aihlVarCheckIsLite);
                if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apyi.b);
                    ajwoVar.c(aihlVarCheckIsLite2);
                    Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                    apyi apyiVar = (apyi) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                    Optional optionalEmpty2 = Optional.empty();
                    Optional optionalEmpty3 = Optional.empty();
                    if (map != null) {
                        optionalEmpty2 = Optional.ofNullable(map.get("com.google.android.libraries.youtube.rendering.elements.sender_view"));
                        if (true == optionalEmpty2.isPresent() && true != (optionalEmpty2.get() instanceof View)) {
                            optionalEmpty2 = Optional.empty();
                        }
                        vre vreVar = new vre(View.class, i2);
                        if (true == optionalEmpty2.isPresent()) {
                            optionalEmpty2 = Optional.ofNullable((View) ((Class) vreVar.a).cast(optionalEmpty2.get()));
                        }
                        optionalEmpty3 = Optional.ofNullable(map.get("com.google.android.libraries.youtube.innertube.endpoint.tag"));
                    }
                    Optional optional = optionalEmpty2;
                    Optional optional2 = optionalEmpty3;
                    aoli aoliVar = apyiVar.d;
                    if (aoliVar == null) {
                        aoliVar = aoli.a;
                    }
                    if ((aoliVar.b & 2) != 0) {
                        aolk aolkVar = aoliVar.f;
                        if (aolkVar == null) {
                            aolkVar = aolk.a;
                        }
                        optionalEmpty = Optional.of(aolkVar.c);
                    } else {
                        optionalEmpty = Optional.empty();
                    }
                    Optional optional3 = optionalEmpty;
                    ghi ghiVar = (ghi) ((qcb) this.b).a;
                    vrj vrjVar = new vrj(ajwoVar, optional3, optional2, optional, (acxx) ghiVar.b.eo.io(), (acxn) ghiVar.a.a.ip.io());
                    Object obj = this.a;
                    byte[] bArrF = yno.F(ajwoVar);
                    if (map != null && (str = (String) tym.U(map, "video_id", String.class)) != null) {
                        agkjVarJ = agkj.j("encryptedVideoId", str);
                    }
                    ((abxv) obj).w(aoliVar, vrjVar, bArrF, agkjVarJ);
                    return;
                }
                return;
            }
            return;
        }
        int i4 = 8;
        if (i == 1) {
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aror.b);
            ajwoVar.c(aihlVarCheckIsLite3);
            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
            Object objC = objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2);
            Object obj2 = this.c;
            aror arorVar = (aror) objC;
            byte[] bArrG = arorVar.g.G();
            byte[] bArrG2 = arorVar.h.G();
            yhi yhiVar = new yhi(this, arorVar, (char[]) null);
            swe sweVar = (swe) obj2;
            sweVar.f.add(yhiVar);
            taf.k(sweVar.h, hed.C(), new gyr(obj2, bArrG, bArrG2, 7), new gyr(obj2, bArrG, bArrG2, i4));
            return;
        }
        if (i == 2) {
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(ajth.b);
            ajwoVar.c(aihlVarCheckIsLite4);
            Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
            ajth ajthVar = (ajth) (objK3 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK3));
            wtg wtgVar = new wtg(this, ajthVar, i3);
            if (ajthVar.d != 2 || !((Boolean) ajthVar.e).booleanValue()) {
                ((woh) this.c.io()).f(ajthVar.d == 1 ? (String) ajthVar.e : "").addListener(wtgVar, this.b);
                return;
            } else {
                woh wohVar = (woh) this.c.io();
                ahng.q(afwl.i(new vlj(wohVar, 12)), wohVar.b).addListener(wtgVar, this.b);
                return;
            }
        }
        if (i == 3) {
            zza zzaVar = (zza) tym.U(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", zza.class);
            if (zzaVar == null && (r0 = this.a) != 0 && (srzVar = (srz) r0.io()) != null) {
                zzaVar = srzVar;
            }
            if (zzaVar != null) {
                aend aendVar = (aend) this.c;
                wtd wtdVar = new wtd(aendVar.b, aendVar.d.e());
                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(alea.b);
                ajwoVar.c(aihlVarCheckIsLite5);
                Object objK4 = ajwoVar.j.k(aihlVarCheckIsLite5.d);
                wtdVar.a = wtd.j(((alea) (objK4 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK4))).c);
                wtdVar.n(vxg.a(ajwoVar));
                taf.i(((wnh) aendVar.c).a(wtdVar), this.b, new wuy(zzaVar, i3), new itt(zzaVar, ajwoVar, 18), new tpo(12));
                return;
            }
            return;
        }
        if (i == 4) {
            wxt wxxVar = (wxt) tym.U(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", wxt.class);
            if (wxxVar == null) {
                wwi wwiVar = (wwi) this.a;
                wxxVar = new wxx(wwiVar.c, wwiVar.d, wwiVar.a, "", wwi.w(wwiVar.b));
            }
            aihl aihlVarCheckIsLite6 = aihn.checkIsLite(appm.b);
            ajwoVar.c(aihlVarCheckIsLite6);
            Object objK5 = ajwoVar.j.k(aihlVarCheckIsLite6.d);
            appm appmVar = (appm) (objK5 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK5));
            wrb wrbVar = (wrb) this.c;
            wrd wrdVar = new wrd(wrbVar.b, wrbVar.c.e());
            wrdVar.b = wxxVar.h();
            wrdVar.c = wxxVar.f();
            wrdVar.d = wxxVar.ji();
            aigj aigjVar = appmVar.c;
            if (aigjVar != null) {
                wrdVar.a = aigjVar;
            }
            if (appmVar.d.size() != 0) {
                ((ahgb) this.b).k(appmVar.d, wxxVar.d(), true);
            }
            if ((ajwoVar.b & 1) != 0) {
                wrdVar.n(ajwoVar.c);
            } else {
                wrdVar.m();
            }
            wrbVar.e.d(wrdVar, wxxVar.jh());
            return;
        }
        aihl aihlVarCheckIsLite7 = aihn.checkIsLite(amte.b);
        ajwoVar.c(aihlVarCheckIsLite7);
        if (ajwoVar.j.n(aihlVarCheckIsLite7.d)) {
            aihl aihlVarCheckIsLite8 = aihn.checkIsLite(amte.b);
            ajwoVar.c(aihlVarCheckIsLite8);
            Object objK6 = ajwoVar.j.k(aihlVarCheckIsLite8.d);
            amte amteVar = (amte) (objK6 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK6));
            String strD = ((aanb) this.a.io()).d();
            int iBc = a.bc(amteVar.c);
            if (iBc == 0) {
                iBc = 1;
            }
            int i5 = iBc - 1;
            if (i5 != 1) {
                if (i5 == 2) {
                    ((aarj) this.b).a();
                    return;
                } else if (i5 == 3) {
                    ((aaqg) this.c).A(strD, true);
                    return;
                } else {
                    if (i5 == 4) {
                        ((aaqg) this.c).A(strD, false);
                        return;
                    }
                    return;
                }
            }
            if (amteVar.d.isEmpty()) {
                return;
            }
            Object obj3 = this.b;
            String str2 = amteVar.d;
            aarj aarjVar = (aarj) obj3;
            ListenableFuture listenableFuture = aarjVar.j;
            if (listenableFuture == null || listenableFuture.isCancelled() || aarjVar.j.isDone()) {
                aarjVar.j = ((aald) aarjVar.e.io()).b(aarjVar.f.e(), str2);
                taf.i(aarjVar.j, MoreExecutors.directExecutor(), new ztb(10), new yqj(obj3, 8), null);
            }
        }
    }

    public vrf(aunn aunnVar, Executor executor, awmd awmdVar, int i) {
        this.$cid = i;
        this.c = aunnVar;
        this.b = executor;
        this.a = awmdVar;
    }

    public vrf(bog bogVar, abxv abxvVar, qcb qcbVar, int i) {
        this.$cid = i;
        this.c = bogVar;
        this.a = abxvVar;
        this.b = qcbVar;
    }

    public vrf(swe sweVar, vwt vwtVar, vxe vxeVar, int i) {
        this.$cid = i;
        this.c = sweVar;
        this.b = vwtVar;
        this.a = vxeVar;
    }

    public vrf(aend aendVar, awmd awmdVar, Executor executor, int i) {
        this.$cid = i;
        aendVar.getClass();
        this.c = aendVar;
        this.a = awmdVar;
        this.b = executor;
    }

    public vrf(aaqg aaqgVar, awmd awmdVar, aarj aarjVar, int i) {
        this.$cid = i;
        this.c = aaqgVar;
        this.a = awmdVar;
        this.b = aarjVar;
    }
}
