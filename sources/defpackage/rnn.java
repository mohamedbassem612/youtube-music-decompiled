package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rnn implements vxc {
    private final /* synthetic */ int $cid;
    private final Object a;

    public rnn(Context context, int i) {
        this.$cid = i;
        context.getClass();
        this.a = context;
    }

    private final Intent d() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", ((Context) this.a).getPackageName());
        return intent;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
        throw null;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v41, types: [axsp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v42, types: [java.lang.Object, stp] */
    /* JADX WARN: Type inference failed for: r10v50, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r10v68, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v73, types: [acnm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v75, types: [acnn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, vxe] */
    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        Intent intent;
        Optional optionalEmpty;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                ((rmy) this.a.io()).c(ajwoVar);
                break;
            case 1:
                rmy rmyVar = (rmy) this.a.io();
                rmyVar.c = false;
                if (rmyVar.d) {
                    rmyVar.b();
                }
                rmyVar.c(ajwoVar);
                break;
            case 2:
                roj rojVar = (roj) this.a.io();
                aihl aihlVarCheckIsLite = aihn.checkIsLite(alkk.b);
                ajwoVar.c(aihlVarCheckIsLite);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                alkk alkkVar = (alkk) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                rnv rnvVar = (rnv) tym.U(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", rnv.class);
                if (rnvVar != null) {
                    rojVar.a(rnvVar);
                }
                dd ddVar = rojVar.i;
                rojVar.h = (roh) ddVar.g("INLINE_AUTH_FRAGMENT_TAG");
                roh rohVar = rojVar.h;
                if (rohVar == null) {
                    roh rohVar2 = new roh();
                    rohVar2.k = rojVar;
                    rojVar.h = rohVar2;
                    av avVar = new av(ddVar);
                    avVar.g(0, rojVar.h, "INLINE_AUTH_FRAGMENT_TAG", 1);
                    avVar.a(false, true);
                } else {
                    rohVar.k = rojVar;
                    if (!rohVar.isVisible()) {
                        av avVar2 = new av(ddVar);
                        avVar2.m(rojVar.h);
                        avVar2.a(false, true);
                    }
                }
                rojVar.k(alkkVar);
                break;
            case 3:
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajzv.b);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                ajzv ajzvVar = (ajzv) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
                ajzw ajzwVar = ajzvVar.d;
                if (ajzwVar == null) {
                    ajzwVar = ajzw.a;
                }
                if ((ajzwVar.b & 1) != 0) {
                    srp srpVar = (srp) tym.U(map, "sectionController", srp.class);
                    if (srpVar == null) {
                        ((tbt) this.a).e(new adtd(ajzvVar));
                    } else {
                        int iAS = a.aS(ajzvVar.e);
                        if (iAS == 0) {
                            iAS = 1;
                        }
                        int i = iAS - 1;
                        if (i == 1) {
                            ajzw ajzwVar2 = ajzvVar.d;
                            if (ajzwVar2 == null) {
                                ajzwVar2 = ajzw.a;
                            }
                            apho aphoVar = ajzwVar2.c;
                            if (aphoVar == null) {
                                aphoVar = apho.a;
                            }
                            srpVar.j(aphoVar, null);
                        } else if (i != 2) {
                            ajzw ajzwVar3 = ajzvVar.d;
                            if (ajzwVar3 == null) {
                                ajzwVar3 = ajzw.a;
                            }
                            apho aphoVar2 = ajzwVar3.c;
                            if (aphoVar2 == null) {
                                aphoVar2 = apho.a;
                            }
                            srpVar.iM(aawb.ae(aphoVar2));
                        } else {
                            ajzw ajzwVar4 = ajzvVar.d;
                            if (ajzwVar4 == null) {
                                ajzwVar4 = ajzw.a;
                            }
                            apho aphoVar3 = ajzwVar4.c;
                            if (aphoVar3 == null) {
                                aphoVar3 = apho.a;
                            }
                            srpVar.y(aphoVar3, Math.max(0, ajzvVar.g));
                        }
                    }
                }
                break;
            case 4:
                cc ccVarG = ((cf) this.a).getSupportFragmentManager().g("comment_dialog_fragment");
                if (ccVarG != null && ccVarG.isVisible()) {
                    ((bp) ccVarG).dismiss();
                    break;
                }
                break;
            case 5:
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(akyt.b);
                ajwoVar.c(aihlVarCheckIsLite3);
                Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
                akyt akytVar = (akyt) (objK3 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK3));
                int i2 = akytVar.c;
                if ((i2 & 1) != 0 && (i2 & 2) != 0) {
                    ?? r10 = this.a;
                    tua tuaVarI = tub.i();
                    tuaVarI.d(akytVar.e);
                    tuaVarI.b = ajwoVar;
                    tuaVarI.d = acjw.i;
                    tuaVarI.b(akytVar.d);
                    tuaVarI.e(akytVar.f);
                    r10.kk(tuaVarI.a());
                    break;
                }
                break;
            case 6:
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aqzv.b);
                ajwoVar.c(aihlVarCheckIsLite4);
                Object objK4 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
                aqzv aqzvVar = (aqzv) (objK4 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK4));
                int i3 = aqzvVar.c;
                if ((i3 & 2) != 0 && (i3 & 4) != 0) {
                    String str = aqzvVar.e;
                    String str2 = aqzvVar.f;
                    boolean z2 = aqzvVar.d;
                    ?? r11 = this.a;
                    if (z2) {
                        r11.b();
                    } else {
                        r11.a();
                    }
                    break;
                }
                break;
            case 7:
                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(amua.b);
                ajwoVar.c(aihlVarCheckIsLite5);
                Object objK5 = ajwoVar.j.k(aihlVarCheckIsLite5.d);
                amua amuaVar = (amua) (objK5 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK5));
                acb acbVar = new acb((char[]) null);
                int iAv = acfz.av(amuaVar.e);
                if (iAv == 0) {
                    iAv = 1;
                }
                acbVar.a = iAv;
                if (!(amuaVar.c == 1 ? (aigj) amuaVar.d : aigj.d).E()) {
                    acbVar.d = amuaVar.c == 1 ? (aigj) amuaVar.d : aigj.d;
                }
                if (!amuaVar.f.isEmpty()) {
                    acbVar.c = amuaVar.f;
                }
                xeu xeuVar = (xeu) this.a;
                if (xeuVar.b) {
                    xff xffVarA = xeuVar.a(acbVar.o(), alot.TRANSACTION_FLOW_FAILED);
                    ztf ztfVar = xffVarA.k.e;
                    xffVarA.l = ztfVar.a();
                    ztfVar.k(xffVarA);
                } else {
                    xeuVar.b(acbVar.h());
                }
                break;
            case 8:
                aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aonv.b);
                ajwoVar.c(aihlVarCheckIsLite6);
                if (ajwoVar.j.n(aihlVarCheckIsLite6.d)) {
                    Object obj = this.a;
                    aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aonv.b);
                    ajwoVar.c(aihlVarCheckIsLite7);
                    Object objK6 = ajwoVar.j.k(aihlVarCheckIsLite7.d);
                    ((suo) obj).k((aonv) (objK6 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK6)));
                }
                break;
            case 9:
                aihl aihlVarCheckIsLite8 = aihn.checkIsLite(arpv.b);
                ajwoVar.c(aihlVarCheckIsLite8);
                Object objK7 = ajwoVar.j.k(aihlVarCheckIsLite8.d);
                Object objC = objK7 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK7);
                Object obj2 = this.a;
                int i4 = ((arpv) objC).c;
                Iterator it = ((vwt) obj2).a.iterator();
                while (it.hasNext()) {
                    ((svp) it.next()).P();
                }
                break;
            case 10:
                aihl aihlVarCheckIsLite9 = aihn.checkIsLite(ajfx.b);
                ajwoVar.c(aihlVarCheckIsLite9);
                ahno.F(ajwoVar.j.n(aihlVarCheckIsLite9.d));
                aihl aihlVarCheckIsLite10 = aihn.checkIsLite(ajfx.b);
                ajwoVar.c(aihlVarCheckIsLite10);
                Object objK8 = ajwoVar.j.k(aihlVarCheckIsLite10.d);
                ((awlo) ((xpl) this.a).b).kk((ajfx) (objK8 == null ? aihlVarCheckIsLite10.b : aihlVarCheckIsLite10.c(objK8)));
                break;
            case 11:
                aihl aihlVarCheckIsLite11 = aihn.checkIsLite(ajfz.b);
                ajwoVar.c(aihlVarCheckIsLite11);
                ahno.F(ajwoVar.j.n(aihlVarCheckIsLite11.d));
                aihl aihlVarCheckIsLite12 = aihn.checkIsLite(ajfz.b);
                ajwoVar.c(aihlVarCheckIsLite12);
                Object objK9 = ajwoVar.j.k(aihlVarCheckIsLite12.d);
                ((awlo) ((xpl) this.a).a).kk((ajfz) (objK9 == null ? aihlVarCheckIsLite12.b : aihlVarCheckIsLite12.c(objK9)));
                break;
            case 12:
                aihl aihlVarCheckIsLite13 = aihn.checkIsLite(ajcj.b);
                ajwoVar.c(aihlVarCheckIsLite13);
                Object objK10 = ajwoVar.j.k(aihlVarCheckIsLite13.d);
                int iAS2 = a.aS(((ajcj) (objK10 == null ? aihlVarCheckIsLite13.b : aihlVarCheckIsLite13.c(objK10))).c);
                int i5 = iAS2 != 0 ? iAS2 : 1;
                if (i5 == 2) {
                    intent = d();
                } else if (i5 == 3) {
                    aihl aihlVarCheckIsLite14 = aihn.checkIsLite(ajcj.b);
                    ajwoVar.c(aihlVarCheckIsLite14);
                    Object objK11 = ajwoVar.j.k(aihlVarCheckIsLite14.d);
                    String str3 = ((ajcj) (objK11 == null ? aihlVarCheckIsLite14.b : aihlVarCheckIsLite14.c(objK11))).d;
                    if (TextUtils.isEmpty(str3)) {
                        intent = d();
                    } else {
                        Intent intent2 = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                        intent2.putExtra("android.provider.extra.APP_PACKAGE", ((Context) this.a).getPackageName());
                        intent2.putExtra("android.provider.extra.CHANNEL_ID", str3);
                        intent = intent2;
                    }
                } else {
                    intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.addCategory("android.intent.category.DEFAULT");
                    intent.setData(Uri.parse("package:".concat(String.valueOf(((Context) this.a).getPackageName()))));
                }
                afwl.m((Context) this.a, intent);
                break;
            case 13:
                aihl aihlVarCheckIsLite15 = aihn.checkIsLite(ajwm.b);
                ajwoVar.c(aihlVarCheckIsLite15);
                Object objK12 = ajwoVar.j.k(aihlVarCheckIsLite15.d);
                Iterator it2 = ((ajwm) (objK12 == null ? aihlVarCheckIsLite15.b : aihlVarCheckIsLite15.c(objK12))).c.iterator();
                while (it2.hasNext()) {
                    this.a.c((ajwo) it2.next(), map);
                }
                break;
            case 14:
                aihl aihlVarCheckIsLite16 = aihn.checkIsLite(amtt.b);
                ajwoVar.c(aihlVarCheckIsLite16);
                Object objK13 = ajwoVar.j.k(aihlVarCheckIsLite16.d);
                Object objC2 = objK13 == null ? aihlVarCheckIsLite16.b : aihlVarCheckIsLite16.c(objK13);
                Object obj3 = this.a;
                amtt amttVar = (amtt) objC2;
                String str4 = amttVar.c;
                aiie<amgu> aiieVar = amttVar.d;
                Bundle bundle = new Bundle();
                for (amgu amguVar : aiieVar) {
                    if ((amguVar.b & 1) != 0) {
                        int i6 = amguVar.c;
                        if (i6 == 2) {
                            bundle.putString(amguVar.e, (String) amguVar.d);
                        } else if (i6 == 4) {
                            bundle.putInt(amguVar.e, ((Integer) amguVar.d).intValue());
                        } else if (i6 == 6) {
                            bundle.putDouble(amguVar.e, ((Double) amguVar.d).doubleValue());
                        } else if (i6 == 5) {
                            bundle.putBoolean(amguVar.e, ((Boolean) amguVar.d).booleanValue());
                        }
                    }
                }
                vxp vxpVar = (vxp) obj3;
                if (vxpVar.b && vxpVar.c) {
                    ((FirebaseAnalytics) vxpVar.a.io()).a.j(null, str4, bundle, false);
                    break;
                }
                break;
            case 15:
                ((wwn) this.a.io()).n(true);
                break;
            case 16:
                ((wwk) this.a).f(ajwoVar);
                break;
            default:
                aihl aihlVarCheckIsLite17 = aihn.checkIsLite(apec.b);
                ajwoVar.c(aihlVarCheckIsLite17);
                ahno.F(ajwoVar.j.n(aihlVarCheckIsLite17.d));
                aihl aihlVarCheckIsLite18 = aihn.checkIsLite(apec.b);
                ajwoVar.c(aihlVarCheckIsLite18);
                Object objK14 = ajwoVar.j.k(aihlVarCheckIsLite18.d);
                apec apecVar = (apec) (objK14 == null ? aihlVarCheckIsLite18.b : aihlVarCheckIsLite18.c(objK14));
                int iBc = a.bc(apecVar.d);
                if (iBc == 0) {
                    iBc = 1;
                }
                Optional optionalA = this.a.a();
                if ((apecVar.c & 4) != 0 && apecVar.f) {
                    z = true;
                }
                acml acmlVar = new acml(iBc, apecVar, z);
                if (true == optionalA.isPresent()) {
                    ?? r12 = optionalA.get();
                    int i7 = acmlVar.c;
                    apec apecVar2 = acmlVar.a;
                    boolean z3 = acmlVar.b;
                    if ((apecVar2.c & 2) != 0) {
                        aped apedVarA = aped.a(apecVar2.e);
                        if (apedVarA == null) {
                            apedVarA = aped.REEL_NAVIGATION_REASON_UNKNOWN;
                        }
                        optionalEmpty = Optional.of(apedVarA);
                    } else {
                        optionalEmpty = Optional.empty();
                    }
                    r12.p(i7, optionalEmpty, z3);
                }
                break;
        }
    }

    public rnn(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public rnn(awmd awmdVar, int i, short[] sArr) {
        this.$cid = i;
        this.a = awmdVar;
    }

    public rnn(awmd awmdVar, int i, byte[] bArr) {
        this.$cid = i;
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public rnn(awmd awmdVar, int i) {
        this.$cid = i;
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public rnn(vxe vxeVar, int i) {
        this.$cid = i;
        vxeVar.getClass();
        this.a = vxeVar;
    }
}
