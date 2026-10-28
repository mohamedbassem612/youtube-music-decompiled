package defpackage;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.RtlAwareViewPager;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ixb implements tae {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ixb(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference failed for: r13v37, types: [java.lang.Object, zwx] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, suw] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, vxe] */
    @Override // defpackage.tae, defpackage.twi
    public final void a(Object obj) {
        int i = 8;
        switch (this.$cid) {
            case 0:
                anlm anlmVar = (anlm) obj;
                if (anlmVar.d.size() != 0) {
                    Object obj2 = this.a;
                    ixn ixnVar = new ixn(2, 3, false);
                    if ((anlmVar.b & 64) != 0) {
                        ((ixd) obj2).b.e(new jeo(ixnVar, 1));
                    } else {
                        ((ixd) obj2).b.add(ixnVar);
                    }
                    ixd ixdVar = (ixd) obj2;
                    admu admuVar = ixdVar.b;
                    admuVar.add(anlmVar);
                    ixdVar.g = anlmVar;
                    if (!anlmVar.i) {
                        admuVar.add(new ixn(4, 2, false));
                    }
                    admuVar.e(new jeo(ixdVar.f.f, 4));
                    admuVar.e(new jeo(ixdVar.c, 0));
                    admuVar.e(new jeo(obj2, 2));
                    return;
                }
                return;
            case 1:
                this.a.b(null, (gnq) obj);
                return;
            case 2:
                rnf rnfVar = (rnf) this.a;
                rnfVar.e();
                rnfVar.f();
                return;
            case 3:
                ((roe) this.a).o.set(false);
                return;
            case 4:
                amaq amaqVar = (amaq) obj;
                swe sweVar = (swe) this.a;
                arox aroxVar = (arox) sweVar.h;
                if (!aroxVar.i) {
                    ((sud) sweVar.a).i();
                }
                if (amaqVar == null) {
                    amaqVar = amaq.a;
                }
                ?? r1 = sweVar.g;
                if (r1 != 0) {
                    r1.b();
                }
                int i2 = amaqVar.c;
                if (i2 == 2) {
                    akco akcoVar = i2 == 2 ? (akco) amaqVar.d : akco.a;
                    sweVar.f.b(akcoVar.d);
                    if (akcoVar.e && (akcoVar.b & 1) != 0) {
                        aihf aihfVarCreateBuilder = amax.a.createBuilder();
                        amar amarVar = akcoVar.c;
                        if (amarVar == null) {
                            amarVar = amar.a;
                        }
                        aihfVarCreateBuilder.copyOnWrite();
                        amax amaxVar = (amax) aihfVarCreateBuilder.instance;
                        amarVar.getClass();
                        amaxVar.d = amarVar;
                        amaxVar.b |= 2;
                        ((vwt) sweVar.d).V((amax) aihfVarCreateBuilder.build());
                    }
                } else if ((amaqVar.b & 2) != 0) {
                    ?? r2 = sweVar.f;
                    ajwo ajwoVar = amaqVar.f;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    r2.c(ajwoVar, null);
                } else {
                    ((vwt) sweVar.d).U();
                }
                sweVar.c.d(new xgj(amaqVar.g, (amud) null));
                ?? r3 = sweVar.f;
                ajwn ajwnVar = aroxVar.k;
                if (ajwnVar == null) {
                    ajwnVar = ajwn.a;
                }
                nsh.h(r3, ajwnVar);
                if ((amaqVar.b & 32) != 0) {
                    int iAV = a.aV(amaqVar.h);
                    int i3 = (iAV != 0 ? iAV : 1) - 1;
                    if (i3 == 2) {
                        sweVar.a(39);
                        return;
                    } else if (i3 != 3) {
                        sweVar.a(4);
                        return;
                    } else {
                        sweVar.a(46);
                        return;
                    }
                }
                acb acbVarD = sweVar.d();
                xeu xeuVar = (xeu) sweVar.b;
                if (!xeuVar.b) {
                    xeuVar.b(acbVarD.l());
                    return;
                }
                xff xffVarA = xeuVar.a(acbVarD.o(), alot.TRANSACTION_FLOW_SUCCEEDED);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
                return;
            case 5:
                sve sveVar = (sve) this.a;
                alpy alpyVar = (alpy) obj;
                ((sud) sveVar.f).i();
                if ((alpyVar.b & 2) != 0) {
                    ?? r13 = sveVar.b;
                    ajwo ajwoVar2 = alpyVar.d;
                    if (ajwoVar2 == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    r13.a(ajwoVar2);
                    return;
                }
                return;
            case 6:
                final alpw alpwVar = (alpw) obj;
                final vhc vhcVar = (vhc) this.a;
                vhcVar.t.execute(afwl.i(new Runnable() { // from class: vgy
                    @Override // java.lang.Runnable
                    public final void run() {
                        alpw alpwVar2;
                        apji apjiVar;
                        alay alayVar;
                        apji apjiVar2;
                        alay alayVar2;
                        vhc vhcVar2 = vhcVar;
                        if (!nuo.h(vhcVar2) || (alpwVar2 = alpwVar) == null) {
                            return;
                        }
                        boolean z = vhcVar2.H;
                        vhcVar2.G = z ? alpwVar2.h : vhcVar2.G;
                        if (z) {
                            vhcVar2.H = false;
                        }
                        vha vhaVar = vhcVar2.C;
                        vhaVar.getClass();
                        RtlAwareViewPager rtlAwareViewPager = vhcVar2.y;
                        rtlAwareViewPager.getClass();
                        int i4 = vhaVar.f;
                        int i5 = alpwVar2.g;
                        if (i4 != i5) {
                            vhaVar.f = i5;
                            vhaVar.l();
                            rtlAwareViewPager.l(vhcVar2.G);
                        }
                        vhk vhkVar = (vhk) vhaVar.p(rtlAwareViewPager.a());
                        if (vhkVar == null || !nuo.h(vhkVar)) {
                            return;
                        }
                        vhg vhgVar = vhkVar.a;
                        vhgVar.q = vhcVar2;
                        vhgVar.p = vhcVar2.m;
                        if (!vhcVar2.F && (alpwVar2.b & 2) != 0) {
                            vxz vxzVar = vhcVar2.J;
                            if (vxzVar == null || !vxzVar.m(79, 45838789L)) {
                                apji apjiVar3 = alpwVar2.d;
                                if (apjiVar3 == null) {
                                    apjiVar3 = apji.a;
                                }
                                aihl aihlVarCheckIsLite = aihn.checkIsLite(aqcq.a);
                                apjiVar3.c(aihlVarCheckIsLite);
                                Object objK = apjiVar3.j.k(aihlVarCheckIsLite.d);
                                vhcVar2.z = (aqcp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                                aqcp aqcpVar = vhcVar2.z;
                                aqcpVar.getClass();
                                int i6 = aqcpVar.b;
                                if ((i6 & 2) != 0) {
                                    apjiVar = aqcpVar.d;
                                    if (apjiVar == null) {
                                        apjiVar = apji.a;
                                    }
                                } else {
                                    apjiVar = null;
                                }
                                if ((i6 & 1) != 0) {
                                    alayVar = aqcpVar.c;
                                    if (alayVar == null) {
                                        alayVar = alay.a;
                                    }
                                } else {
                                    alayVar = null;
                                }
                                vhcVar2.l(apjiVar, alayVar, vhcVar2.x);
                            } else {
                                apji apjiVar4 = alpwVar2.d;
                                if (apjiVar4 == null) {
                                    apjiVar4 = apji.a;
                                }
                                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aqcq.a);
                                apjiVar4.c(aihlVarCheckIsLite2);
                                Object objK2 = apjiVar4.j.k(aihlVarCheckIsLite2.d);
                                aqcp aqcpVar2 = (aqcp) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
                                int i7 = aqcpVar2.b;
                                if ((i7 & 2) != 0) {
                                    apjiVar2 = aqcpVar2.d;
                                    if (apjiVar2 == null) {
                                        apjiVar2 = apji.a;
                                    }
                                } else {
                                    apjiVar2 = null;
                                }
                                if ((i7 & 1) != 0) {
                                    alayVar2 = aqcpVar2.c;
                                    if (alayVar2 == null) {
                                        alayVar2 = alay.a;
                                    }
                                } else {
                                    alayVar2 = null;
                                }
                                vhcVar2.l(apjiVar2, alayVar2, vhcVar2.x);
                            }
                            vhcVar2.F = true;
                        }
                        if ((alpwVar2.b & 4) != 0) {
                            apji apjiVar5 = alpwVar2.e;
                            if (apjiVar5 == null) {
                                apjiVar5 = apji.a;
                            }
                            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aqda.a);
                            apjiVar5.c(aihlVarCheckIsLite3);
                            if (apjiVar5.j.n(aihlVarCheckIsLite3.d)) {
                                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aqda.a);
                                apjiVar5.c(aihlVarCheckIsLite4);
                                Object objK3 = apjiVar5.j.k(aihlVarCheckIsLite4.d);
                                aqcz aqczVar = (aqcz) (objK3 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK3));
                                int i8 = aqczVar.c;
                                if (i8 > 0) {
                                    vhkVar.c(i8);
                                }
                                if (aqczVar.b.size() > 0) {
                                    vhkVar.d(aqczVar.b);
                                }
                                vhe.a(vhcVar2.l, aqczVar.b);
                            } else {
                                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(apda.a);
                                apjiVar5.c(aihlVarCheckIsLite5);
                                if (apjiVar5.j.n(aihlVarCheckIsLite5.d)) {
                                    vhe vheVar = vhcVar2.u;
                                    aihl aihlVarCheckIsLite6 = aihn.checkIsLite(apda.a);
                                    apjiVar5.c(aihlVarCheckIsLite6);
                                    Object objK4 = apjiVar5.j.k(aihlVarCheckIsLite6.d);
                                    vhkVar.c(((apcz) (objK4 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK4))).b);
                                    taf.k(vhkVar, vheVar.b.a(vhkVar), new jco(17), new svm(vheVar, vhkVar, 17, null));
                                } else {
                                    aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aqru.a);
                                    apjiVar5.c(aihlVarCheckIsLite7);
                                    if (apjiVar5.j.n(aihlVarCheckIsLite7.d)) {
                                        xsc xscVar = vhcVar2.K;
                                        aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aqru.a);
                                        apjiVar5.c(aihlVarCheckIsLite8);
                                        Object objK5 = apjiVar5.j.k(aihlVarCheckIsLite8.d);
                                        aqrt aqrtVar = (aqrt) (objK5 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK5));
                                        agke agkeVar = ((vge) xscVar.a).b;
                                        if (agkeVar.isEmpty()) {
                                            ((Handler) xscVar.c).post(new vhm(vhcVar2, 3));
                                        } else {
                                            ArrayList arrayList = new ArrayList(agkeVar.size());
                                            for (int i9 = 0; i9 < agkeVar.size(); i9++) {
                                                String str = (String) agkeVar.get(i9);
                                                aihf aihfVarCreateBuilder2 = aqcr.a.createBuilder();
                                                alay alayVarC = ackj.c(str);
                                                aihfVarCreateBuilder2.copyOnWrite();
                                                aqcr aqcrVar = (aqcr) aihfVarCreateBuilder2.instance;
                                                alayVarC.getClass();
                                                aqcrVar.d = alayVarC;
                                                aqcrVar.b |= 2;
                                                aihfVarCreateBuilder2.copyOnWrite();
                                                aqcr aqcrVar2 = (aqcr) aihfVarCreateBuilder2.instance;
                                                aqcrVar2.c = 3;
                                                aqcrVar2.b |= 1;
                                                aqcr aqcrVar3 = (aqcr) aihfVarCreateBuilder2.build();
                                                aihh aihhVar = (aihh) apji.a.createBuilder();
                                                aihhVar.e(aqct.b, aqcrVar3);
                                                arrayList.add((apji) aihhVar.build());
                                            }
                                            ((Handler) xscVar.c).post(new brc(xscVar, arrayList, vhkVar, aqrtVar, vhcVar2, 6));
                                        }
                                    }
                                }
                            }
                        }
                        if ((alpwVar2.b & 8) != 0) {
                            vxz vxzVar2 = vhcVar2.J;
                            if (vxzVar2 == null || !vxzVar2.m(79, 45838789L)) {
                                apji apjiVar6 = alpwVar2.f;
                                if (apjiVar6 == null) {
                                    apjiVar6 = apji.a;
                                }
                                aihl aihlVarCheckIsLite9 = aihn.checkIsLite(aqdc.a);
                                apjiVar6.c(aihlVarCheckIsLite9);
                                Object objK6 = apjiVar6.j.k(aihlVarCheckIsLite9.d);
                                vhcVar2.A = (aqdb) (objK6 == null ? aihlVarCheckIsLite9.b : aihlVarCheckIsLite9.c(objK6));
                                aqdb aqdbVar = vhcVar2.A;
                                aqdbVar.getClass();
                                if (vhcVar2.B.d() == 0 && aqdbVar.b.size() > 0) {
                                    vhcVar2.q(aqdbVar.b);
                                }
                            } else {
                                apji apjiVar7 = alpwVar2.f;
                                if (apjiVar7 == null) {
                                    apjiVar7 = apji.a;
                                }
                                aihl aihlVarCheckIsLite10 = aihn.checkIsLite(aqdc.a);
                                apjiVar7.c(aihlVarCheckIsLite10);
                                Object objK7 = apjiVar7.j.k(aihlVarCheckIsLite10.d);
                                aqdb aqdbVar2 = (aqdb) (objK7 == null ? aihlVarCheckIsLite10.b : aihlVarCheckIsLite10.c(objK7));
                                if (vhcVar2.B.d() == 0 && aqdbVar2.b.size() > 0) {
                                    vhcVar2.q(aqdbVar2.b);
                                }
                            }
                            if (vhcVar2.B.d() == 0 || alpwVar2.h >= vhcVar2.B.d()) {
                                return;
                            }
                            vhcVar2.B.h(alpwVar2.h);
                        }
                    }
                }));
                return;
            case 7:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                Object obj3 = this.a;
                if (zBooleanValue) {
                    ((vjj) obj3).e.isPresent();
                } else {
                    Log.w(vjh.a, "finalize edit is unsuccessful");
                    zvp.a(zvn.b, zvm.m, "InteractiveStickerCreation [BaseInteractiveStickerController] finalizeEdit failed");
                }
                ((vjj) obj3).g(bool.booleanValue());
                return;
            case 8:
                Boolean bool2 = (Boolean) obj;
                if (!bool2.booleanValue()) {
                    Log.w(vjh.a, "finalize edit is unsuccessful");
                }
                ((vjj) this.a).g(bool2.booleanValue());
                return;
            case 9:
                wfy wfyVar = (wfy) obj;
                Object obj4 = this.a;
                vta vtaVar = (vta) obj4;
                vtaVar.f();
                vtaVar.ac();
                ((vmz) obj4).e.d(new xgj(wfyVar.d()));
                vtaVar.h(wfyVar);
                almd almdVar = wfyVar.a;
                if (almdVar.n.size() != 0) {
                    vtaVar.i.d(almdVar.n, null);
                    return;
                }
                return;
            case 10:
                alsm alsmVar = (alsm) obj;
                Object obj5 = this.a;
                if (alsmVar == null) {
                    yno.eW(7, ((vwb) obj5).g);
                    return;
                } else {
                    yno.eW(8, ((vwb) obj5).g);
                    return;
                }
            case 11:
                Optional optional = (Optional) obj;
                vrl vrlVar = new vrl(this.a, i);
                if (true == optional.isPresent()) {
                    aesp aespVar = (aesp) optional.get();
                    alei aleiVar = ((alop) vrlVar.a).g;
                    if (aleiVar == null) {
                        aleiVar = alei.a;
                    }
                    aespVar.f(aleiVar);
                    return;
                }
                return;
            case 12:
                this.a.n("rpc_r");
                return;
            case 13:
                alrz alrzVar = (alrz) obj;
                Object obj6 = this.a;
                wzq wzqVar = (wzq) obj6;
                wzqVar.k.setVisibility(8);
                wzqVar.j.removeAllViews();
                ajwo ajwoVar3 = alrzVar.b == 6 ? (ajwo) alrzVar.c : ajwo.a;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(apxs.b);
                ajwoVar3.c(aihlVarCheckIsLite);
                boolean zN = ajwoVar3.j.n(aihlVarCheckIsLite.d);
                xgn xgnVar = zN ? wzqVar.i : wzqVar.h.l;
                xgnVar.e(new xgj(alrzVar.e.G()), new xgj(wzqVar.n));
                xgnVar.w(new xgj(alrzVar.e.G()), null);
                int i4 = alrzVar.b;
                if (i4 == 6) {
                    ajwo ajwoVar4 = (ajwo) alrzVar.c;
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akrx.a);
                    ajwoVar4.c(aihlVarCheckIsLite2);
                    if (ajwoVar4.j.n(aihlVarCheckIsLite2.d)) {
                        ((wzk) obj6).c();
                        try {
                            ((wzq) obj6).o.c(alrzVar.b == 6 ? (ajwo) alrzVar.c : ajwo.a, agkj.j("com.google.android.libraries.youtube.logging.interaction_logger", ((wzq) obj6).h.l));
                            return;
                        } catch (vxo unused) {
                            return;
                        }
                    }
                    if (zN) {
                        ((wzk) obj6).c();
                        wzqVar.g.a(alrzVar.b == 6 ? (ajwo) alrzVar.c : ajwo.a);
                        return;
                    } else {
                        Log.e("LiveChatPurchaseFlow", "No usable Command provided!");
                        wzqVar.k.setVisibility(8);
                        wzqVar.l.setVisibility(0);
                        return;
                    }
                }
                if (((i4 == 3 ? (alsa) alrzVar.c : alsa.a).b & 1) == 0) {
                    wzqVar.l.setVisibility(0);
                    return;
                }
                ampg ampgVar = (alrzVar.b == 3 ? (alsa) alrzVar.c : alsa.a).c;
                if (ampgVar == null) {
                    ampgVar = ampg.a;
                }
                adma admaVarE = adul.e((admh) wzqVar.b.io(), ampgVar, wzqVar.j);
                if (admaVarE == null) {
                    wzqVar.k.setVisibility(8);
                    wzqVar.l.setVisibility(0);
                    return;
                }
                adly adlyVar = new adly();
                adlyVar.f("listenerKey", obj6);
                View viewA = admaVarE.a();
                wzqVar.j.addView(viewA);
                wzqVar.j.setVisibility(0);
                ampg ampgVar2 = (alrzVar.b == 3 ? (alsa) alrzVar.c : alsa.a).c;
                if (ampgVar2 == null) {
                    ampgVar2 = ampg.a;
                }
                admaVarE.hU(adlyVar, ampgVar2);
                viewA.requestFocus();
                return;
            case 14:
                if (((Boolean) obj).booleanValue()) {
                    this.a.getClass().getCanonicalName();
                    return;
                }
                return;
            case 15:
                ((zty) this.a).g((alox) obj);
                return;
            case 16:
                xfn xfnVar = (xfn) this.a;
                xfnVar.l(3, xfnVar.g, xfnVar.h, false);
                return;
            case 17:
                agrf agrfVar = xnv.a;
                Collection.EL.stream((List) obj).forEach(new vnm(this.a, 11));
                return;
            case 18:
                Optional optional2 = (Optional) obj;
                if (optional2.isPresent()) {
                    Object obj7 = this.a;
                    xvn xvnVar = (xvn) optional2.get();
                    xnv xnvVar = (xnv) obj7;
                    xnvVar.f.add(xvnVar);
                    Iterator it = xnvVar.g.iterator();
                    while (it.hasNext()) {
                        ((xnu) it.next()).a(xvnVar);
                    }
                    if (!xnvVar.i.a().equals("<unknown ssid>")) {
                        xnvVar.m.d(xvnVar);
                    }
                    Map mapO = xvnVar.o();
                    if (mapO == null || mapO.isEmpty() || "c0ef1ca".equals(mapO.get("testYWRkaXR"))) {
                        return;
                    }
                    long epochMilli = xnvVar.k.f().toEpochMilli();
                    xwc xwcVar = xvnVar.n;
                    Map map = xnvVar.l;
                    String str = xwcVar.b;
                    Long l = (Long) map.get(str);
                    if (l != null) {
                        long jLongValue = epochMilli - l.longValue();
                        TimeUnit timeUnit = TimeUnit.DAYS;
                        if (jLongValue <= 86400000) {
                            return;
                        }
                    }
                    map.put(str, Long.valueOf(epochMilli));
                    aihf aihfVarCreateBuilder2 = amww.a.createBuilder();
                    String str2 = xvnVar.c;
                    aihfVarCreateBuilder2.copyOnWrite();
                    amww amwwVar = (amww) aihfVarCreateBuilder2.instance;
                    str2.getClass();
                    amwwVar.b |= 1;
                    amwwVar.c = str2;
                    String str3 = xvnVar.e;
                    if (str3 != null) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        amww amwwVar2 = (amww) aihfVarCreateBuilder2.instance;
                        amwwVar2.b |= 4;
                        amwwVar2.e = str3;
                    }
                    String str4 = xvnVar.f;
                    if (str4 != null) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        amww amwwVar3 = (amww) aihfVarCreateBuilder2.instance;
                        amwwVar3.b |= 2;
                        amwwVar3.d = str4;
                    }
                    xeu xeuVar2 = xnvVar.j;
                    if (xeuVar2.b) {
                        xff xffVarA2 = xeuVar2.a(aihfVarCreateBuilder2, alot.MDX_BROKEN_ADDITIONAL_DATA_DEVICE_DETECTED);
                        ztf ztfVar2 = xffVarA2.k.e;
                        xffVarA2.l = ztfVar2.a();
                        ztfVar2.k(xffVarA2);
                        return;
                    }
                    alos alosVar = (alos) alou.a.createBuilder();
                    alosVar.copyOnWrite();
                    alou alouVar = (alou) alosVar.instance;
                    amww amwwVar4 = (amww) aihfVarCreateBuilder2.build();
                    amwwVar4.getClass();
                    alouVar.d = amwwVar4;
                    alouVar.c = 93;
                    xeuVar2.b((alou) alosVar.build());
                    return;
                }
                return;
            case 19:
                aihf aihfVarCreateBuilder3 = atpg.a.createBuilder();
                aihfVarCreateBuilder3.copyOnWrite();
                atpg atpgVar = (atpg) aihfVarCreateBuilder3.instance;
                atpgVar.b |= 2;
                atpgVar.d = 1;
                ydu yduVar = (ydu) this.a;
                yds ydsVar = yduVar.e;
                long epochMilli2 = ydsVar.c.f().toEpochMilli();
                aihfVarCreateBuilder3.copyOnWrite();
                atpg atpgVar2 = (atpg) aihfVarCreateBuilder3.instance;
                atpgVar2.b |= 1;
                atpgVar2.c = epochMilli2;
                atpg atpgVar3 = (atpg) aihfVarCreateBuilder3.build();
                ydsVar.j.writeLock().lock();
                try {
                    j$.util.Map.EL.merge(ydsVar.i, 1, atpgVar3, new ito(atpgVar3, i));
                    ydsVar.j.writeLock().unlock();
                    yduVar.g();
                    return;
                } catch (Throwable th) {
                    ydsVar.j.writeLock().unlock();
                    throw th;
                }
            default:
                ((ydu) this.a).g();
                return;
        }
    }
}
