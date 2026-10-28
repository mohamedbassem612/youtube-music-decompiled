package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.work.impl.WorkDatabase;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aerj {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public aerj(awmd awmdVar, awmd awmdVar2, mbc mbcVar, tym tymVar, tqj tqjVar, zhk zhkVar) {
        this.a = awmdVar;
        this.b = awmdVar2;
        this.e = mbcVar;
        this.f = tymVar;
        this.d = tqjVar;
        this.g = new ArrayList();
        int i = tqr.a;
        int iA = tqjVar.a(1075839808);
        boolean zK = tqjVar.k(1073830230);
        ThreadLocal threadLocal = trj.a;
        trj.b = zK ? (int) ((((long) iA) & (-67108865)) | 67108864) : iA;
        if ((trj.b & 15) <= ThreadLocalRandom.current().nextInt(15)) {
            trj.b = 0;
        } else {
            trj.d(SemanticState.Focused);
        }
        if ((trj.b & 64) != 0) {
            if (((((long) trj.b) >> 13) & 31) <= ThreadLocalRandom.current().nextLong(31L)) {
                trj.d(64);
            }
        }
        if ((trj.b & SemanticState.Hidden) == 0 || Process.getThreadPriority(Process.myTid()) >= 0) {
            zhkVar.a();
        }
        this.c = new int[]{0, 1, 1, 1, 1};
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7  */
    public static void b(aihf aihfVar, awmd awmdVar, awmd awmdVar2, tqj tqjVar, awmd awmdVar3) {
        alou alouVar;
        if (aihfVar != null) {
            aqih aqihVar = ((ajej) aihfVar.instance).e;
            if (aqihVar == null) {
                aqihVar = aqih.a;
            }
            aqib aqibVar = aqihVar.g;
            if (aqibVar == null) {
                aqibVar = aqib.a;
            }
            long j = aqibVar.e;
            xeu xeuVar = (xeu) awmdVar.io();
            if (xeuVar.b) {
                xff xffVarA = xeuVar.a(aihfVar, alot.APP_CRASHED);
                xffVarA.h = j;
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
                alos alosVar = (alos) alou.a.createBuilder();
                alosVar.copyOnWrite();
                alou alouVar2 = (alou) alosVar.instance;
                ajej ajejVar = (ajej) aihfVar.build();
                ajejVar.getClass();
                alouVar2.d = ajejVar;
                alouVar2.c = 20;
                alouVar = (alou) alosVar.build();
            } else {
                alos alosVar2 = (alos) alou.a.createBuilder();
                alosVar2.copyOnWrite();
                alou alouVar3 = (alou) alosVar2.instance;
                ajej ajejVar2 = (ajej) aihfVar.build();
                ajejVar2.getClass();
                alouVar3.d = ajejVar2;
                alouVar3.c = 20;
                alou alouVar4 = (alou) alosVar2.build();
                xeuVar.c(alouVar4, j);
                alouVar = alouVar4;
            }
            ((ahtv) awmdVar2.io()).e(alouVar);
            int i = tqr.a;
            if (tqjVar.k(1073830141)) {
                ajej ajejVar3 = (ajej) aihfVar.instance;
                int iS = aext.s(ajejVar3.c);
                if (iS == 0) {
                    iS = 1;
                }
                int i2 = 16;
                if ((ajejVar3.b & 16) != 0) {
                    aqih aqihVar2 = ajejVar3.e;
                    if (((aqihVar2 == null ? aqih.a : aqihVar2).b & 4) != 0) {
                        if (aqihVar2 == null) {
                            aqihVar2 = aqih.a;
                        }
                        aqie aqieVar = aqihVar2.e;
                        if (aqieVar == null) {
                            aqieVar = aqie.a;
                        }
                        boolean z = aqieVar.h;
                        if (iS != 11) {
                            i2 = true != z ? 15 : 14;
                        } else if (true != z) {
                            i2 = 17;
                        }
                    } else if (iS == 11) {
                        i2 = 25;
                    } else {
                        i2 = 24;
                    }
                } else if (iS == 11) {
                    i2 = 25;
                } else {
                    i2 = 24;
                }
                ((xkn) awmdVar3.io()).a(i2);
            }
        }
    }

    public static void f(TextView textView, ajnf ajnfVar) {
        if (ajnfVar == null) {
            textView.setVisibility(8);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, tqj] */
    public final boolean a() {
        int i = tqr.a;
        ?? r1 = this.a;
        return (r1.k(1073808360) && r1.k(1073808361)) || r1.k(1073808373);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    public final aesh c() {
        return (aesh) this.a.io();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    public final aesk d() {
        return (aesk) this.c.io();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    public final aesn e() {
        return (aesn) this.d.io();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, xgm] */
    public final void g(TextView textView, final aefs aefsVar, ajnf ajnfVar, final int i) {
        int iAr;
        if (textView.getVisibility() != 8) {
            aeaa aeaaVarD = ((afip) this.e).d(textView);
            aeaaVarD.a(ajnfVar, this.a.hB(), null);
            aeaaVarD.c = new adzw() { // from class: aefm
                @Override // defpackage.adzw
                public final void iP(aihh aihhVar) {
                    aefsVar.b(i != 1 ? 0 : 1);
                }
            };
            if (aeaaVarD.h && ajnfVar.c == 1 && (iAr = ahng.ar(((Integer) ajnfVar.d).intValue())) != 0 && iAr == 14) {
                if (aeaaVarD.g) {
                    TextView textView2 = aeaaVarD.f;
                    aeaaVarD.b(textView2, dl.d(textView2.getContext(), R.drawable.tooltip_button_background), true);
                } else {
                    TextView textView3 = aeaaVarD.f;
                    tuk.k(textView3, dl.d(textView3.getContext(), R.drawable.tooltip_button_background), 0);
                }
                aeaaVarD.i = true;
                aeaaVarD.h = false;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [awmd, java.lang.Object] */
    public final aapn h() {
        isi isiVar = (isi) this.d.io();
        isiVar.getClass();
        aerj aerjVar = (aerj) this.a.io();
        aerjVar.getClass();
        vxz vxzVar = (vxz) this.f.io();
        vxzVar.getClass();
        ahbw ahbwVar = (ahbw) this.g.io();
        ahbwVar.getClass();
        zwb zwbVar = (zwb) this.c.io();
        zwbVar.getClass();
        wco wcoVar = (wco) this.b.io();
        wcoVar.getClass();
        return new aapn(isiVar, aerjVar, this.e, vxzVar, ahbwVar, zwbVar, wcoVar);
    }

    public final void i(String str) {
        ((ci) this.c).aA(str);
    }

    public final boolean j(String str, String str2, String str3, aohx aohxVar, String str4, aodp aodpVar, aamn aamnVar, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        return k(str, ((txp) this.a).a(), str2, str3, aohxVar, str4, aodpVar, aamnVar, i, z, z2, z3, z4, i2);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [aary, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, mbc] */
    public final boolean k(String str, String str2, String str3, String str4, aohx aohxVar, String str5, aodp aodpVar, aamn aamnVar, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        aogq aogqVarV;
        taq.c();
        String str6 = (String) this.b;
        String strE = aajc.e(str6, str);
        ?? r10 = this.f;
        r10.g();
        agev agevVarB = r10.b(strE);
        if (agevVarB.g() && (((aaro) agevVarB.c()).d() || ((aaro) agevVarB.c()).b())) {
            return false;
        }
        Object obj = this.d;
        aamv aamvVar = new aamv();
        int iA = aaus.a(aohxVar, 360);
        long j = aarq.a;
        aamvVar.j("stream_quality", iA);
        aarq.i(aamvVar, aamnVar.b());
        if (str5 != null) {
            aamvVar.l("audio_track_id", str5);
        }
        aarq.h(aamvVar, aodpVar);
        ahgb ahgbVar = (ahgb) obj;
        Object obj2 = ahgbVar.d;
        byte[] bArrAu = ((aaex) obj2).au(str);
        if (bArrAu == null) {
            bArrAu = vzh.b;
        }
        aamvVar.i("click_tracking_params", bArrAu);
        aamvVar.l("video_id", str);
        aamvVar.h("user_triggered", 1 == (i ^ 1));
        aamvVar.h("triggered_by_refresh", z2);
        aamvVar.j("download_constraint", i2 - 1);
        aamvVar.h("is_sync", z3);
        aamvVar.l("transfer_nonce", str2);
        if (str3 != null) {
            aamvVar.l("playlist_id", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            aamvVar.l("video_list_id", str4);
        }
        if (z) {
            ((abqq) ahgbVar.b).f(str);
        }
        aamvVar.k("transfer_added_time_millis", ahgbVar.e.f().toEpochMilli());
        aaek aaekVar = (aaek) ahgbVar.a;
        aamvVar.j("retry_strategy", aaekVar.b);
        aamvVar.j("max_retries", aaekVar.c);
        aamvVar.k("base_retry_milli_secs", aaekVar.d);
        aamvVar.k("max_retry_milli_secs", aaekVar.e);
        alik alikVarB = ((vyo) ahgbVar.c).b();
        aoev aoevVar = alikVarB.i;
        if (aoevVar == null) {
            aoevVar = aoev.a;
        }
        if (aoevVar.i) {
            aoev aoevVar2 = alikVarB.i;
            if (aoevVar2 == null) {
                aoevVar2 = aoev.a;
            }
            aamvVar.j("offline_digest_store_level", aoevVar2.j);
        }
        wjf wjfVarC = ((aaew) obj2).c(str);
        if (wjfVarC != null && (aogqVarV = wjfVarC.v()) != null) {
            aigj aigjVar = aogqVarV.k;
            if (!aigjVar.E()) {
                aamvVar.i("logging_params", aigjVar.G());
            }
        }
        if (z4) {
            aamvVar.h("is_external_media_source", true);
        }
        aamvVar.j("transfer_type", 4);
        aihf aihfVarCreateBuilder = aogy.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aogy aogyVar = (aogy) aihfVarCreateBuilder.instance;
        str.getClass();
        aogyVar.b |= 1;
        aogyVar.d = str;
        int i3 = true != z2 ? 2 : 4;
        aihfVarCreateBuilder.copyOnWrite();
        aogy aogyVar2 = (aogy) aihfVarCreateBuilder.instance;
        aogyVar2.h = i3 - 1;
        aogyVar2.b |= 16;
        aihfVarCreateBuilder.copyOnWrite();
        aogy aogyVar3 = (aogy) aihfVarCreateBuilder.instance;
        aogyVar3.t = aohxVar.l;
        aogyVar3.b |= 1048576;
        aofb aofbVarB = aamnVar.b();
        aihfVarCreateBuilder.copyOnWrite();
        aogy aogyVar4 = (aogy) aihfVarCreateBuilder.instance;
        aogyVar4.r = aofbVarB.i;
        aogyVar4.b |= 65536;
        aihfVarCreateBuilder.copyOnWrite();
        aogy aogyVar5 = (aogy) aihfVarCreateBuilder.instance;
        aogyVar5.x = 4;
        aogyVar5.c |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        aogy aogyVar6 = (aogy) aihfVarCreateBuilder.instance;
        aogyVar6.g = 1;
        aogyVar6.b |= 8;
        if (!TextUtils.isEmpty(str2)) {
            aihfVarCreateBuilder.copyOnWrite();
            aogy aogyVar7 = (aogy) aihfVarCreateBuilder.instance;
            str2.getClass();
            aogyVar7.b |= 2;
            aogyVar7.e = str2;
        }
        String strD = aarq.d(aamvVar);
        if (strD != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aogy aogyVar8 = (aogy) aihfVarCreateBuilder.instance;
            aogyVar8.b |= 524288;
            aogyVar8.s = strD;
        }
        byte[] bArrN = aamvVar.n("logging_params");
        if (bArrN != null) {
            aigj aigjVarV = aigj.v(bArrN);
            aihfVarCreateBuilder.copyOnWrite();
            aogy aogyVar9 = (aogy) aihfVarCreateBuilder.instance;
            aigjVarV.getClass();
            aogyVar9.c |= 32;
            aogyVar9.z = aigjVarV;
        }
        ((aalv) this.g.io()).d((aogy) aihfVarCreateBuilder.build());
        int i4 = 1 != i ? 200 : 150;
        taq.c();
        ((ci) this.c).au(str6, strE, i4, aamvVar);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    public final Executor l() {
        return (Executor) this.a.io();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final synchronized aebc m(String str) {
        aebc aebcVar;
        aebcVar = new aebc(this, str);
        this.g.add(aebcVar);
        return aebcVar;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v0, types: [ahex, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture n() {
        if (!((ocd) this.c).c()) {
            return new aher("7");
        }
        if (!((ocu) this.b).c()) {
            iug iugVar = new iug(this, 15);
            ?? r4 = this.e;
            ahfo ahfoVar = new ahfo(iugVar);
            r4.execute(ahfoVar);
            return ahfoVar;
        }
        ?? r0 = this.f;
        ArrayList arrayList = new ArrayList(r0.size());
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            arrayList.add(this.e.submit((odk) it.next()));
        }
        return new ahek(false, agke.j(arrayList)).a(new ebs(this, 10), MoreExecutors.directExecutor());
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [aunn, java.lang.Object] */
    public final void o() {
        avlh avlhVarI;
        boolean zL = ((vxz) this.a).l(183, 45682757L, false);
        Object obj = this.b;
        int i = 15;
        int i2 = 17;
        if (zL) {
            avlhVarI = avlh.I(((avlh) obj).H(new hbz(i2)), ((avlh) this.c).H(new hbz(18)).x(new hgu(i)));
        } else {
            avlhVarI = avlh.I(((avlh) obj).H(new hbz(i2)), ((avlh) this.c).H(new hbz(19)).x(new hgu(16)));
        }
        avlh.I(avlhVarI, ((avlh) ((abvn) this.e.io()).r().n).H(new hbz(20)).x(new hgu(i2))).p().L((avmb) this.g).al(new icy(this, 2), new hyx(i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
    public final ict p(int i) {
        abjp abjpVar = (abjp) this.c.io();
        abjpVar.getClass();
        awku awkuVar = (awku) this.a.io();
        awkuVar.getClass();
        Handler handler = (Handler) this.d.io();
        handler.getClass();
        avmb avmbVar = (avmb) this.f.io();
        avmbVar.getClass();
        icu icuVar = (icu) this.g.io();
        icuVar.getClass();
        vxz vxzVar = (vxz) this.b.io();
        vxzVar.getClass();
        return new ict(abjpVar, this.e, awkuVar, handler, avmbVar, icuVar, vxzVar, i);
    }

    public final synchronized void q(evx evxVar, ett ettVar) {
        ((dov) this.c).l(ettVar, evxVar);
    }

    public final synchronized void r(evx evxVar, ett ettVar, evz evzVar) {
        if (evzVar != null) {
            if (evzVar.a) {
                ((eve) this.a).b(ettVar, evzVar);
            }
        }
        ((dov) this.c).l(ettVar, evxVar);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [exk, java.lang.Object] */
    public final void s(ett ettVar, evz evzVar) {
        ((eve) this.a).d(ettVar);
        if (evzVar.a) {
            this.d.d(ettVar, evzVar);
        } else {
            ((aerz) this.g).g(evzVar, false);
        }
    }

    public aerj(aess aessVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6) {
        this.f = aessVar;
        this.a = awmdVar;
        this.c = awmdVar2;
        this.d = awmdVar3;
        this.e = awmdVar4;
        this.g = awmdVar5;
        this.b = awmdVar6;
    }

    public aerj(aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6, aunn aunnVar7) {
        this.d = aunnVar;
        this.g = aunnVar2;
        this.a = aunnVar3;
        this.e = aunnVar4;
        this.b = aunnVar5;
        this.f = aunnVar6;
        this.c = aunnVar7;
    }

    public aerj(awmd awmdVar, awmd awmdVar2, avlh avlhVar, avlh avlhVar2, aunn aunnVar, vxz vxzVar, avmb avmbVar) {
        this.d = awmdVar;
        this.f = awmdVar2;
        this.c = avlhVar;
        this.b = avlhVar2;
        this.e = aunnVar;
        this.a = vxzVar;
        this.g = avmbVar;
    }

    public aerj(oat oatVar) {
        this.c = this;
        this.a = oatVar;
        aupr auprVarC = aupm.c(ocb.a);
        this.d = auprVarC;
        aupr auprVar = oatVar.b;
        aupr auprVar2 = oatVar.d;
        aupr auprVar3 = oatVar.H;
        aupr auprVar4 = oatVar.K;
        aupr auprVar5 = oatVar.v;
        aupr auprVar6 = oatVar.k;
        aupr auprVarC2 = aupm.c(new obv(auprVar, auprVar2, auprVar3, auprVarC, auprVar4, auprVar5, auprVar6, 3, (short[]) null));
        this.e = auprVarC2;
        aupr auprVarC3 = aupm.c(oca.a);
        this.g = auprVarC3;
        oau oauVar = new oau(this);
        this.f = oauVar;
        this.b = aupm.c(new obv(auprVar2, auprVarC2, auprVar3, oatVar.G, auprVarC3, (aupr) oauVar, auprVar6, 2, (char[]) null));
    }

    public aerj(tqj tqjVar, awmd awmdVar, awmd awmdVar2, aess aessVar, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5) {
        this.a = tqjVar;
        this.b = awmdVar;
        this.g = awmdVar2;
        this.c = aessVar;
        this.d = awmdVar3;
        this.e = awmdVar4;
        this.f = awmdVar5;
    }

    public aerj(txp txpVar, String str, awmd awmdVar, ahgb ahgbVar, aary aaryVar, ci ciVar, abfv abfvVar) {
        this.a = txpVar;
        this.b = str;
        this.g = awmdVar;
        this.d = ahgbVar;
        this.f = aaryVar;
        this.c = ciVar;
        this.e = abfvVar;
    }

    public aerj(xgm xgmVar, afip afipVar, vxz vxzVar, aunn aunnVar, afip afipVar2, acyx acyxVar, awmd awmdVar) {
        this.a = xgmVar;
        this.e = afipVar;
        this.f = vxzVar;
        this.c = acyxVar;
        this.d = afipVar2;
        this.b = aunnVar;
        this.g = awmdVar;
    }

    public aerj(ahex ahexVar, ocd ocdVar, ocu ocuVar, obb obbVar, String str, fxg fxgVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, omj omjVar) {
        this.e = ahexVar;
        this.c = ocdVar;
        this.d = str;
        this.b = ocuVar;
        this.a = fxgVar;
        this.g = omjVar;
        int iOrdinal = obbVar.ordinal();
        if (iOrdinal == 0) {
            this.f = ((aupt) awmdVar).io();
        } else if (iOrdinal == 1) {
            this.f = ((aupt) awmdVar2).io();
        } else {
            if (iOrdinal == 2) {
                this.f = ((aupt) awmdVar3).io();
                return;
            }
            throw new IllegalStateException();
        }
    }

    public aerj(Context context, dyl dylVar, axfd axfdVar, eds edsVar, WorkDatabase workDatabase, ees eesVar, List list) {
        context.getClass();
        workDatabase.getClass();
        this.e = dylVar;
        this.g = axfdVar;
        this.b = edsVar;
        this.f = workDatabase;
        this.c = eesVar;
        this.d = list;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        new bnz(null);
    }

    public aerj(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7) {
        awmdVar.getClass();
        this.d = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
        awmdVar3.getClass();
        this.e = awmdVar3;
        this.f = awmdVar4;
        this.g = awmdVar5;
        awmdVar6.getClass();
        this.c = awmdVar6;
        awmdVar7.getClass();
        this.b = awmdVar7;
    }

    public aerj(dd ddVar, gzj gzjVar, ahfi ahfiVar, hke hkeVar, vxz vxzVar, jki jkiVar, kro kroVar) {
        this.a = ddVar;
        this.b = gzjVar;
        this.f = ahfiVar;
        hkeVar.getClass();
        this.d = hkeVar;
        vxzVar.getClass();
        this.g = vxzVar;
        jkiVar.getClass();
        this.c = jkiVar;
        this.e = kroVar;
    }

    public aerj(xkd xkdVar, abnc abncVar, zho zhoVar, tbt tbtVar, tqj tqjVar, jnj jnjVar) {
        xkdVar.getClass();
        this.e = xkdVar;
        this.c = abncVar;
        zhoVar.getClass();
        this.f = zhoVar;
        tbtVar.getClass();
        this.b = tbtVar;
        this.a = tqjVar;
        this.g = new hau();
        this.d = jnjVar;
    }

    public aerj(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, char[] cArr) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.d = awmdVar2;
        awmdVar3.getClass();
        this.b = awmdVar3;
        this.f = awmdVar4;
        this.e = awmdVar5;
        this.c = awmdVar6;
        awmdVar7.getClass();
        this.g = awmdVar7;
    }

    public aerj(cf cfVar, syn synVar, gze gzeVar, sru sruVar, vor vorVar, jin jinVar) {
        this.e = new hbt(this);
        this.a = cfVar;
        this.g = synVar;
        this.b = gzeVar;
        this.d = sruVar;
        this.f = vorVar;
        this.c = jinVar;
    }

    public aerj(exk exkVar, exd exdVar, exs exsVar, exs exsVar2, exs exsVar3, exs exsVar4, boolean z) throws Throwable {
        this.d = exkVar;
        kmm kmmVar = new kmm(exdVar);
        this.b = kmmVar;
        eve eveVar = new eve(z);
        this.a = eveVar;
        synchronized (this) {
            try {
                synchronized (eveVar) {
                    try {
                        try {
                            eveVar.e = this;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                this.c = new dov((char[]) null);
                this.f = new jnj(exsVar, exsVar2, exsVar4, this, this);
                this.e = new tgr(kmmVar);
                this.g = new aerz((byte[]) null);
                ((exj) exkVar).a = this;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public aerj(agev agevVar, agev agevVar2, awmd awmdVar, awmd awmdVar2, tqj tqjVar, hhb hhbVar, hhb hhbVar2) {
        this.g = (awmd) ((agfa) agevVar).a;
        this.d = agevVar2;
        this.b = awmdVar;
        this.e = awmdVar2;
        this.a = tqjVar;
        this.c = hhbVar;
        this.f = hhbVar2;
    }

    public aerj(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.c = awmdVar2;
        this.d = awmdVar3;
        awmdVar4.getClass();
        this.g = awmdVar4;
        awmdVar5.getClass();
        this.e = awmdVar5;
        this.f = awmdVar6;
        awmdVar7.getClass();
        this.b = awmdVar7;
    }

    public aerj(sdy sdyVar, agfr agfrVar, agfr agfrVar2, Executor executor, aunn aunnVar, axfd axfdVar, awmd awmdVar) {
        this.b = new AtomicBoolean(true);
        this.d = sdyVar;
        this.g = agfrVar;
        this.f = agfrVar2;
        this.a = executor;
        this.e = axfdVar.V(executor, aunnVar, null);
        this.c = awmdVar;
    }

    public aerj() {
        throw null;
    }

    public aerj(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, byte[] bArr) {
        this.g = awmdVar;
        awmdVar2.getClass();
        this.e = awmdVar2;
        awmdVar3.getClass();
        this.f = awmdVar3;
        awmdVar4.getClass();
        this.a = awmdVar4;
        awmdVar5.getClass();
        this.b = awmdVar5;
        awmdVar6.getClass();
        this.c = awmdVar6;
        awmdVar7.getClass();
        this.d = awmdVar7;
    }

    public aerj(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.c = awmdVar;
        awmdVar2.getClass();
        this.e = awmdVar2;
        awmdVar3.getClass();
        this.a = awmdVar3;
        this.d = awmdVar4;
        awmdVar5.getClass();
        this.f = awmdVar5;
        awmdVar6.getClass();
        this.g = awmdVar6;
        awmdVar7.getClass();
        this.b = awmdVar7;
    }
}
