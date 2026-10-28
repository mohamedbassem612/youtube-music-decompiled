package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rzs implements sah, sai {
    public final awmd a;
    public final awmd b;
    public final awmd c;
    public final awmd d;
    public final agkz e;
    public String f = "";
    public final awmd g;
    public final awmd h;
    public final vyo i;
    public final rtm j;
    public final vxu k;
    private final Executor l;

    public rzs(awmd awmdVar, rtm rtmVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, agkz agkzVar, vyo vyoVar, vxu vxuVar, awmd awmdVar5, awmd awmdVar6, Executor executor) {
        this.a = awmdVar;
        this.j = rtmVar;
        this.b = awmdVar2;
        this.c = awmdVar3;
        this.d = awmdVar4;
        this.e = agkzVar;
        this.g = awmdVar5;
        this.h = awmdVar6;
        this.i = vyoVar;
        this.k = vxuVar;
        this.l = executor;
    }

    @Override // defpackage.sah
    public final void W(final smr smrVar, final sko skoVar) {
        final String str;
        wjf wjfVar;
        slb slbVar;
        if (skoVar.f(aixg.LAYOUT_TYPE_MEDIA, new Class[0])) {
            String str2 = skoVar.a;
            if (TextUtils.equals(str2, this.f)) {
                return;
            }
            if (smrVar.e(sic.class)) {
                str = (String) smrVar.d(sic.class);
            } else {
                str = skoVar.e(sic.class) ? (String) skoVar.d(sic.class) : "";
            }
            if (smrVar.e(sid.class)) {
                wjfVar = (wjf) smrVar.d(sid.class);
            } else {
                wjfVar = skoVar.e(sid.class) ? (wjf) skoVar.d(sid.class) : null;
            }
            if (smrVar.c == 4) {
                if (skoVar.e(sjm.class)) {
                    ((roq) this.a.io()).f(4, skh.a(str, wjfVar), new rzo(this, smrVar, skoVar, (smk) skoVar.d(sjm.class), 0));
                    return;
                }
                return;
            }
            if (skoVar.e(sjd.class)) {
                slbVar = (slb) skoVar.d(sjd.class);
            } else if (!skoVar.e(sjb.class)) {
                return;
            } else {
                slbVar = (slb) skoVar.d(sjb.class);
            }
            final slb slbVar2 = slbVar;
            final ListenableFuture listenableFutureA = this.j.a(slbVar2);
            this.f = str2;
            final wjf wjfVar2 = wjfVar;
            listenableFutureA.addListener(new Runnable() { // from class: rzp
                @Override // java.lang.Runnable
                public final void run() {
                    rzs rzsVar = this.a;
                    smr smrVar2 = smrVar;
                    slb slbVar3 = slbVar2;
                    ListenableFuture listenableFuture = listenableFutureA;
                    String str3 = str;
                    wjf wjfVar3 = wjfVar2;
                    sko skoVar2 = skoVar;
                    try {
                        wgi wgiVar = (wgi) ahng.v(listenableFuture);
                        if (wgiVar == null) {
                            rmp.j(null, "Received null watch next response.");
                            return;
                        }
                        amae amaeVar = wgiVar.a;
                        sac sacVar = (sac) rzsVar.h.io();
                        Iterable$EL.forEach(wgiVar.e, new rme((ruk) sacVar.b.io(), 17));
                        agke agkeVarE = wgiVar.e();
                        ovo ovoVarA = sgp.a();
                        ovoVarA.m(str3);
                        ovoVarA.n(skh.a(str3, wjfVar3));
                        sgp sgpVarL = ovoVarA.l();
                        agke agkeVarA = sacVar.a(agkeVarE, sgpVarL);
                        int i = ((agpi) agkeVarA).d;
                        int i2 = 0;
                        while (i2 < i) {
                            smr smrVar3 = (smr) agkeVarA.get(i2);
                            sacVar.a.f(aixe.ADS_CLIENT_EVENT_TYPE_SLOT_RECEIVED, smrVar3, null, null, null, 0, null, null, sgpVarL.a, null, null, false);
                            Optional optional = smrVar3.i;
                            sko skoVar3 = skoVar2;
                            smr smrVar4 = smrVar2;
                            hmr hmrVar = new hmr(sacVar, sgpVarL, smrVar3, 4);
                            if (true == optional.isPresent()) {
                                Object obj = optional.get();
                                Object obj2 = hmrVar.a;
                                Object obj3 = hmrVar.b;
                                sgp sgpVar = (sgp) obj3;
                                sac sacVar2 = (sac) obj2;
                                sacVar2.c(sgpVar, (smr) hmrVar.c, (sko) obj);
                            }
                            i2++;
                            skoVar2 = skoVar3;
                            smrVar2 = smrVar4;
                        }
                        sko skoVar4 = skoVar2;
                        smr smrVar5 = smrVar2;
                        sacVar.b(agkeVarA, sgpVarL);
                        int i3 = amaeVar.b;
                        if ((i3 & 64) == 0 && (i3 & 32768) == 0 && amaeVar.s.isEmpty()) {
                            int i4 = amaeVar.b;
                            if ((i4 & SemanticState.Hidden) == 0 && (i4 & SemanticState.Focused) == 0 && amaeVar.i.size() <= 0) {
                                return;
                            }
                        }
                        agke agkeVar = (agke) Collection.EL.stream(wgiVar.e()).filter(new rej(20)).collect(aghu.a);
                        if (!agkeVar.isEmpty()) {
                            ((roq) rzsVar.a.io()).f(18, skh.a(str3, wjfVar3), new mly(rzsVar, agkeVar, str3, 5));
                        } else if (amaeVar.i.size() == 0) {
                            ((roq) rzsVar.a.io()).f(18, skh.a(str3, wjfVar3), new rzr(rzsVar, smrVar5, skoVar4, slbVar3, listenableFuture, 0));
                        }
                    } catch (ExecutionException e) {
                        rmp.k(null, "Exception getting the WatchNextResponseFuture.".concat(String.valueOf(e.getMessage())));
                    }
                }
            }, this.l);
            ((roq) this.a.io()).f(4, skh.a(str, wjfVar2), new Supplier() { // from class: rzq
                /* JADX WARN: Code duplicated, block: B:191:0x04a8  */
                /* JADX WARN: Code duplicated, block: B:194:0x04c0  */
                /* JADX WARN: Code duplicated, block: B:197:0x04cd  */
                /* JADX WARN: Code duplicated, block: B:198:0x04d0  */
                /* JADX WARN: Code duplicated, block: B:201:0x04d9  */
                /* JADX WARN: Code duplicated, block: B:204:0x04df  */
                /* JADX WARN: Code duplicated, block: B:207:0x04e5  */
                /* JADX WARN: Code duplicated, block: B:208:0x04e8  */
                /* JADX WARN: Code duplicated, block: B:211:0x04f6  */
                /* JADX WARN: Code duplicated, block: B:214:0x04fc  */
                /* JADX WARN: Code duplicated, block: B:217:0x05d6  */
                /* JADX WARN: Code duplicated, block: B:223:0x05f2  */
                /* JADX WARN: Code duplicated, block: B:240:0x0645  */
                /* JADX WARN: Code duplicated, block: B:256:0x075b  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r20v11 */
                /* JADX WARN: Type inference failed for: r20v18 */
                /* JADX WARN: Type inference failed for: r20v24 */
                /* JADX WARN: Type inference failed for: r20v25 */
                /* JADX WARN: Type inference failed for: r20v29 */
                /* JADX WARN: Type inference failed for: r20v30 */
                /* JADX WARN: Type inference failed for: r20v31 */
                /* JADX WARN: Type inference failed for: r20v5, types: [java.lang.Object, java.lang.String] */
                /* JADX WARN: Type inference failed for: r20v6 */
                /* JADX WARN: Type inference failed for: r20v7 */
                /* JADX WARN: Type inference failed for: r20v8 */
                /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List] */
                /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r2v20, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v28 */
                /* JADX WARN: Type inference failed for: r2v29 */
                /* JADX WARN: Type inference failed for: r2v30 */
                /* JADX WARN: Type inference failed for: r2v31, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r2v32, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r2v33 */
                /* JADX WARN: Type inference failed for: r2v34 */
                /* JADX WARN: Type inference failed for: r2v35 */
                /* JADX WARN: Type inference failed for: r2v36 */
                @Override // java.util.function.Supplier
                public final Object get() {
                    char c;
                    int i;
                    ?? r2;
                    agkz agkzVar;
                    aixo aixoVar;
                    sko skoVar2;
                    alkd alkdVar;
                    boolean z;
                    Object skwVar;
                    ?? r20;
                    String str3;
                    rzs rzsVar;
                    agke agkeVar;
                    snk snkVar;
                    agke agkeVar2;
                    ?? r21;
                    Optional optional;
                    ArrayList arrayList;
                    aivs aivsVar;
                    aivs aivsVar2;
                    aixo aixoVarA;
                    agke agkeVarQ;
                    aivs aivsVar3;
                    aivr aivrVar;
                    snk snkVar2;
                    ?? r22;
                    agke agkeVar3;
                    agke agkeVarC;
                    aiua aiuaVar;
                    aizx aizxVarE;
                    ?? r3;
                    ?? arrayList2 = new ArrayList();
                    ListenableFuture listenableFuture = listenableFutureA;
                    slb slbVar3 = slbVar2;
                    smr smrVar2 = smrVar;
                    sko skoVar3 = skoVar;
                    rzs rzsVar2 = this.a;
                    if (smrVar2.e(siv.class) && ((Boolean) smrVar2.d(siv.class)).booleanValue() && smrVar2.e(sih.class) && (!smrVar2.e(shl.class) || !((wgk) smrVar2.d(shl.class)).e(skoVar3.a).isPresent())) {
                        agkz agkzVar2 = rzsVar2.e;
                        aixo aixoVar2 = aixo.SLOT_TYPE_IN_PLAYER;
                        if (agkzVar2.contains(aixoVar2) && smrVar2.g(aixo.SLOT_TYPE_PLAYER_BYTES, sic.class, sih.class)) {
                            aaok aaokVar = (aaok) rzsVar2.c.io();
                            String str4 = skoVar3.a;
                            String str5 = (String) smrVar2.d(sic.class);
                            yvs yvsVar = (yvs) smrVar2.d(sih.class);
                            xsc xscVar = (xsc) aaokVar.d;
                            String strAa = xscVar.aa();
                            aixr aixrVar = aixr.TRIGGER_TYPE_LAYOUT_ID_ENTERED;
                            agke agkeVarQ2 = agke.q(new skv(xscVar.Z(aixrVar), aixrVar, false, str4));
                            aixr aixrVar2 = aixr.TRIGGER_TYPE_SLOT_ID_ENTERED;
                            agke agkeVarQ3 = agke.q(new smu(xscVar.Z(aixrVar2), aixrVar2, false, strAa));
                            aixr aixrVar3 = aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID;
                            slt sltVar = new slt(xscVar.Z(aixrVar3), aixrVar3, false, str5, false);
                            aixr aixrVar4 = aixr.TRIGGER_TYPE_SLOT_ID_EXITED;
                            arrayList2.add(smr.i(strAa, aixoVar2, agkeVarQ2, agkeVarQ3, agke.r(sltVar, new smv(xscVar.Z(aixrVar4), aixrVar4, false, strAa)), shh.b(new sih(yvsVar), new sjb(slbVar3), new sjh(str4), new sjz(listenableFuture))));
                        }
                        skoVar2 = skoVar3;
                        rzsVar2 = rzsVar2;
                        r3 = arrayList2;
                    } else {
                        if (rzsVar2.e.contains(aixo.SLOT_TYPE_IN_PLAYER) && (slbVar3 instanceof skz)) {
                            c = 5;
                            if (smrVar2.g(aixo.SLOT_TYPE_PLAYER_BYTES, sic.class, sid.class, shx.class)) {
                                i = 6;
                                if (skoVar3.f(aixg.LAYOUT_TYPE_MEDIA, shn.class)) {
                                    vyo vyoVar = rzsVar2.i;
                                    if (nrj.i(smrVar2, vyoVar)) {
                                        smrVar2 = smrVar2;
                                        skoVar3 = skoVar3;
                                        rzsVar2 = rzsVar2;
                                        r2 = arrayList2;
                                    } else {
                                        sgs sgsVarB = (slb.av(slbVar3.iJ()) || ((aizxVarE = afxw.e(vyoVar)) != null && aizxVarE.as && smrVar2.e(sii.class) && smrVar2.d(sii.class) == akjm.DAI_SKIPPABLE_TYPE_SKIP_TO_SLATE)) ? ((sag) rzsVar2.b.io()).b(smrVar2, skoVar3) : ((sag) rzsVar2.b.io()).a(smrVar2, skoVar3);
                                        Optional optionalE = (((slm) smrVar2.d(shx.class)) == slm.PRE_ROLL || !smrVar2.e(shl.class)) ? nre.e(((wjf) smrVar2.d(sid.class)).u(), skoVar3.a) : ((wgk) smrVar2.d(shl.class)).e(skoVar3.a);
                                        if (optionalE.isPresent()) {
                                            aaok aaokVar2 = (aaok) rzsVar2.c.io();
                                            aehs aehsVar = (aehs) rzsVar2.d.io();
                                            Object obj = optionalE.get();
                                            arrayList2 = (String) smrVar2.d(sic.class);
                                            wjf wjfVar3 = (wjf) smrVar2.d(sid.class);
                                            slm slmVar = (slm) smrVar2.d(shx.class);
                                            sgn sgnVar = (sgn) skoVar3.d(shn.class);
                                            boolean zBooleanValue = ((Boolean) skoVar3.d(six.class)).booleanValue();
                                            aivt aivtVar = (aivt) obj;
                                            aivs aivsVar4 = aivtVar.c;
                                            if (aivsVar4 == null) {
                                                aivsVar4 = aivs.a;
                                            }
                                            String str6 = aivsVar4.c;
                                            agke agkeVarC2 = agpi.a;
                                            Optional optionalEmpty = Optional.empty();
                                            try {
                                                Object obj2 = aaokVar2.b;
                                                aizs aizsVar = ((aivt) obj).f;
                                                if (aizsVar == null) {
                                                    aizsVar = aizs.a;
                                                }
                                                snk snkVarB = nrj.b(aizsVar, Optional.of(arrayList2));
                                                try {
                                                    str3 = str6;
                                                    try {
                                                        agke agkeVarC3 = nrj.c(((aivt) obj).g, Optional.of(arrayList2));
                                                        try {
                                                            agkeVar = agkeVarC3;
                                                            try {
                                                                agke agkeVarC4 = nrj.c(((aivt) obj).h, Optional.of(arrayList2));
                                                                try {
                                                                    aivu aivuVar = ((aivt) obj).e;
                                                                    if (aivuVar == null) {
                                                                        aivuVar = aivu.a;
                                                                    }
                                                                    apji apjiVar = aivuVar.b;
                                                                    if (apjiVar == null) {
                                                                        apjiVar = apji.a;
                                                                    }
                                                                    agkeVar3 = agkeVarC4;
                                                                    try {
                                                                        aljy aljyVar = (aljy) aavv.s(apjiVar, aljz.a);
                                                                        try {
                                                                            if (aljyVar == null) {
                                                                                throw new sas("Unable to get the inPlayerAdLayoutRenderer when building the layout", 117);
                                                                            }
                                                                            apji apjiVar2 = aljyVar.c;
                                                                            if (apjiVar2 == null) {
                                                                                apjiVar2 = apji.a;
                                                                            }
                                                                            snkVar2 = snkVarB;
                                                                            try {
                                                                                ambn ambnVar = (ambn) aavv.s(apjiVar2, ambo.a);
                                                                                if (ambnVar == null) {
                                                                                    throw new sas("Unable to get the instreamAdPlayerOverlayRenderer when building the layout", 117);
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                Object obj3 = aehsVar.i;
                                                                                                skoVar3 = skoVar3;
                                                                                                try {
                                                                                                    try {
                                                                                                        agkeVarC2 = nrj.c(aljyVar.d, Optional.of(arrayList2));
                                                                                                    } catch (sav e) {
                                                                                                        e = e;
                                                                                                        try {
                                                                                                            Object obj4 = aehsVar.e;
                                                                                                            rmp.n(null, "Failed to create a client trigger for the InPlayer layout. ".concat(String.valueOf(e.getMessage())));
                                                                                                        } catch (sav e2) {
                                                                                                            e = e2;
                                                                                                            rzsVar = rzsVar2;
                                                                                                        }
                                                                                                    }
                                                                                                } catch (sas e3) {
                                                                                                    e = e3;
                                                                                                    rzsVar = rzsVar2;
                                                                                                }
                                                                                            } catch (sas e4) {
                                                                                                e = e4;
                                                                                                skoVar3 = skoVar3;
                                                                                                rzsVar = rzsVar2;
                                                                                                agkeVarC2 = agkeVar3;
                                                                                                r22 = arrayList2;
                                                                                                snkVar = snkVar2;
                                                                                                r20 = r22;
                                                                                                rmp.j(null, "Failed to create a client trigger or a layout for the InPlayer slot ".concat(String.valueOf(e.getMessage())));
                                                                                                agkeVar2 = agkeVarC2;
                                                                                                r21 = r20;
                                                                                                optional = optionalEmpty;
                                                                                                agke agkeVar4 = agkeVar;
                                                                                                arrayList = new ArrayList();
                                                                                                arrayList.add(new sid(wjfVar3));
                                                                                                arrayList.add(new shx(slmVar));
                                                                                                arrayList.add(new shq(sgsVarB));
                                                                                                arrayList.add(new shn(sgnVar));
                                                                                                arrayList.add(new sjz(listenableFuture));
                                                                                                arrayList.add(new sho(slbVar3.o));
                                                                                                arrayList.add(new sjw(slbVar3.c()));
                                                                                                arrayList.add(new sjx(slbVar3.p()));
                                                                                                arrayList.add(new sja(slbVar3.G()));
                                                                                                arrayList.add(new shy(slbVar3.q()));
                                                                                                arrayList.add(new sjo(Integer.valueOf(slbVar3.m())));
                                                                                                arrayList.add(new six(zBooleanValue));
                                                                                                if (optional.isPresent()) {
                                                                                                    arrayList.add(new sjk((sko) optional.get()));
                                                                                                }
                                                                                                if (wjfVar3.f().av()) {
                                                                                                    arrayList.add(new siv(true));
                                                                                                }
                                                                                                aivsVar = aivtVar.c;
                                                                                                if (aivsVar == null) {
                                                                                                    aivsVar2 = aivs.a;
                                                                                                } else {
                                                                                                    aivsVar2 = aivsVar;
                                                                                                }
                                                                                                aixoVarA = aixo.a(aivsVar2.d);
                                                                                                if (aixoVarA == null) {
                                                                                                    aixoVarA = aixo.SLOT_TYPE_UNSPECIFIED;
                                                                                                }
                                                                                                aixo aixoVar3 = aixoVarA;
                                                                                                if (aivsVar == null) {
                                                                                                    aivsVar = aivs.a;
                                                                                                }
                                                                                                int i2 = aivsVar.e;
                                                                                                if (snkVar == null) {
                                                                                                    agkeVarQ = agpi.a;
                                                                                                } else {
                                                                                                    agkeVarQ = agke.q(snkVar);
                                                                                                }
                                                                                                agke agkeVar5 = agkeVarQ;
                                                                                                shh shhVarA = shh.a(arrayList);
                                                                                                aivsVar3 = aivtVar.c;
                                                                                                if (aivsVar3 == null) {
                                                                                                    aivsVar3 = aivs.a;
                                                                                                }
                                                                                                aivrVar = aivsVar3.f;
                                                                                                if (aivrVar == null) {
                                                                                                    aivrVar = aivr.a;
                                                                                                }
                                                                                                smr smrVarH = smr.h(str3, aixoVar3, i2, agkeVar5, agkeVar4, agkeVar2, shhVarA, Optional.of(aivrVar), optional);
                                                                                                ?? r4 = r21;
                                                                                                r4.add(smrVarH);
                                                                                                smrVar2 = smrVar2;
                                                                                                rzsVar2 = rzsVar;
                                                                                                r2 = r4;
                                                                                                agkzVar = rzsVar2.e;
                                                                                                aixoVar = aixo.SLOT_TYPE_IN_PLAYER;
                                                                                                if (agkzVar.contains(aixoVar)) {
                                                                                                    skoVar2 = skoVar3;
                                                                                                    r3 = r2;
                                                                                                } else {
                                                                                                    skoVar2 = skoVar3;
                                                                                                    r3 = r2;
                                                                                                }
                                                                                                rzsVar2.f = skoVar2.a;
                                                                                                return r3;
                                                                                            } catch (sav e5) {
                                                                                                e = e5;
                                                                                                skoVar3 = skoVar3;
                                                                                            }
                                                                                            agkeVarC = nrj.c(aljyVar.e, Optional.of(arrayList2));
                                                                                        } catch (sav e6) {
                                                                                            e = e6;
                                                                                            try {
                                                                                                Object obj5 = aehsVar.e;
                                                                                                rmp.n(null, "Failed to create a client trigger for the InPlayer layout. ".concat(String.valueOf(e.getMessage())));
                                                                                            } catch (sav e7) {
                                                                                                e = e7;
                                                                                                arrayList2 = arrayList2;
                                                                                                agkeVarC2 = agkeVar3;
                                                                                                r22 = arrayList2;
                                                                                                snkVar = snkVar2;
                                                                                                r20 = r22;
                                                                                                rmp.j(null, "Failed to create a client trigger or a layout for the InPlayer slot ".concat(String.valueOf(e.getMessage())));
                                                                                                agkeVar2 = agkeVarC2;
                                                                                                r21 = r20;
                                                                                            }
                                                                                        }
                                                                                        Object obj6 = aehsVar.i;
                                                                                        rzsVar = rzsVar2;
                                                                                    } catch (sas e8) {
                                                                                        e = e8;
                                                                                        rzsVar = rzsVar2;
                                                                                        arrayList2 = arrayList2;
                                                                                        agkeVarC2 = agkeVar3;
                                                                                        r22 = arrayList2;
                                                                                        snkVar = snkVar2;
                                                                                        r20 = r22;
                                                                                        rmp.j(null, "Failed to create a client trigger or a layout for the InPlayer slot ".concat(String.valueOf(e.getMessage())));
                                                                                        agkeVar2 = agkeVarC2;
                                                                                        r21 = r20;
                                                                                        optional = optionalEmpty;
                                                                                        agke agkeVar6 = agkeVar;
                                                                                        arrayList = new ArrayList();
                                                                                        arrayList.add(new sid(wjfVar3));
                                                                                        arrayList.add(new shx(slmVar));
                                                                                        arrayList.add(new shq(sgsVarB));
                                                                                        arrayList.add(new shn(sgnVar));
                                                                                        arrayList.add(new sjz(listenableFuture));
                                                                                        arrayList.add(new sho(slbVar3.o));
                                                                                        arrayList.add(new sjw(slbVar3.c()));
                                                                                        arrayList.add(new sjx(slbVar3.p()));
                                                                                        arrayList.add(new sja(slbVar3.G()));
                                                                                        arrayList.add(new shy(slbVar3.q()));
                                                                                        arrayList.add(new sjo(Integer.valueOf(slbVar3.m())));
                                                                                        arrayList.add(new six(zBooleanValue));
                                                                                        if (optional.isPresent()) {
                                                                                            arrayList.add(new sjk((sko) optional.get()));
                                                                                        }
                                                                                        if (wjfVar3.f().av()) {
                                                                                            arrayList.add(new siv(true));
                                                                                        }
                                                                                        aivsVar = aivtVar.c;
                                                                                        if (aivsVar == null) {
                                                                                            aivsVar2 = aivs.a;
                                                                                        } else {
                                                                                            aivsVar2 = aivsVar;
                                                                                        }
                                                                                        aixoVarA = aixo.a(aivsVar2.d);
                                                                                        if (aixoVarA == null) {
                                                                                            aixoVarA = aixo.SLOT_TYPE_UNSPECIFIED;
                                                                                        }
                                                                                        aixo aixoVar4 = aixoVarA;
                                                                                        if (aivsVar == null) {
                                                                                            aivsVar = aivs.a;
                                                                                        }
                                                                                        int i3 = aivsVar.e;
                                                                                        if (snkVar == null) {
                                                                                            agkeVarQ = agpi.a;
                                                                                        } else {
                                                                                            agkeVarQ = agke.q(snkVar);
                                                                                        }
                                                                                        agke agkeVar7 = agkeVarQ;
                                                                                        shh shhVarA2 = shh.a(arrayList);
                                                                                        aivsVar3 = aivtVar.c;
                                                                                        if (aivsVar3 == null) {
                                                                                            aivsVar3 = aivs.a;
                                                                                        }
                                                                                        aivrVar = aivsVar3.f;
                                                                                        if (aivrVar == null) {
                                                                                            aivrVar = aivr.a;
                                                                                        }
                                                                                        smr smrVarH2 = smr.h(str3, aixoVar4, i3, agkeVar7, agkeVar6, agkeVar2, shhVarA2, Optional.of(aivrVar), optional);
                                                                                        ?? r5 = r21;
                                                                                        r5.add(smrVarH2);
                                                                                        smrVar2 = smrVar2;
                                                                                        rzsVar2 = rzsVar;
                                                                                        r2 = r5;
                                                                                        agkzVar = rzsVar2.e;
                                                                                        aixoVar = aixo.SLOT_TYPE_IN_PLAYER;
                                                                                        if (agkzVar.contains(aixoVar)) {
                                                                                            skoVar2 = skoVar3;
                                                                                            r3 = r2;
                                                                                        } else {
                                                                                            skoVar2 = skoVar3;
                                                                                            r3 = r2;
                                                                                        }
                                                                                        rzsVar2.f = skoVar2.a;
                                                                                        return r3;
                                                                                    } catch (sav e9) {
                                                                                        e = e9;
                                                                                        rzsVar = rzsVar2;
                                                                                    }
                                                                                    agke agkeVar8 = agkeVarC2;
                                                                                    agkeVarC = agpi.a;
                                                                                    agke agkeVar9 = agkeVarC;
                                                                                    aiuc aiucVar = aljyVar.b;
                                                                                    if (aiucVar == null) {
                                                                                        aiucVar = aiuc.a;
                                                                                    }
                                                                                    String str7 = aiucVar.c;
                                                                                    aixg aixgVarA = aixg.a(aiucVar.d);
                                                                                    if (aixgVarA == null) {
                                                                                        aixgVarA = aixg.LAYOUT_TYPE_UNSPECIFIED;
                                                                                    }
                                                                                    aixg aixgVar = aixgVarA;
                                                                                    if ((aiucVar.b & 4) != 0) {
                                                                                        aiua aiuaVar2 = aiucVar.e;
                                                                                        if (aiuaVar2 == null) {
                                                                                            aiuaVar2 = aiua.a;
                                                                                        }
                                                                                        aiuaVar = aiuaVar2;
                                                                                    } else {
                                                                                        aiuaVar = null;
                                                                                    }
                                                                                    Object obj7 = aehsVar.a;
                                                                                    aivs aivsVar5 = ((aivt) obj).c;
                                                                                    String str8 = (aivsVar5 == null ? aivs.a : aivsVar5).c;
                                                                                    if (aivsVar5 == null) {
                                                                                        aivsVar5 = aivs.a;
                                                                                    }
                                                                                    aixo aixoVarA2 = aixo.a(aivsVar5.d);
                                                                                    if (aixoVarA2 == null) {
                                                                                        aixoVarA2 = aixo.SLOT_TYPE_UNSPECIFIED;
                                                                                    }
                                                                                    aixo aixoVar5 = aixoVarA2;
                                                                                    agke agkeVarQ4 = agke.q(snkVar2);
                                                                                    aivs aivsVar6 = ((aivt) obj).c;
                                                                                    if (aivsVar6 == null) {
                                                                                        aivsVar6 = aivs.a;
                                                                                    }
                                                                                    amco amcoVarAj = ((vwt) obj7).aj(str8, aixoVar5, agkeVarQ4, aivsVar6.e, str7, aixgVar, aiuaVar);
                                                                                    aiua aiuaVar3 = aiuaVar;
                                                                                    r21 = arrayList2;
                                                                                    skn sknVarA = sko.a();
                                                                                    sknVarA.l(str7);
                                                                                    sknVarA.a = aixgVar;
                                                                                    sknVarA.m(1);
                                                                                    sknVarA.g(agkeVar8);
                                                                                    sknVarA.i(agkeVar9);
                                                                                    sknVarA.c(amcoVarAj);
                                                                                    sknVarA.c = shh.b(new sir(ambnVar));
                                                                                    sknVarA.n(new sgy(ambnVar));
                                                                                    if (aiuaVar3 != null) {
                                                                                        sknVarA.b(aiuaVar3);
                                                                                    }
                                                                                    optionalEmpty = Optional.of(sknVarA.a());
                                                                                    agkeVar2 = agkeVar3;
                                                                                    snkVar = snkVar2;
                                                                                } catch (sas e10) {
                                                                                    e = e10;
                                                                                }
                                                                                optional = optionalEmpty;
                                                                                agke agkeVar10 = agkeVar;
                                                                                arrayList = new ArrayList();
                                                                                arrayList.add(new sid(wjfVar3));
                                                                                arrayList.add(new shx(slmVar));
                                                                                arrayList.add(new shq(sgsVarB));
                                                                                arrayList.add(new shn(sgnVar));
                                                                                arrayList.add(new sjz(listenableFuture));
                                                                                arrayList.add(new sho(slbVar3.o));
                                                                                arrayList.add(new sjw(slbVar3.c()));
                                                                                arrayList.add(new sjx(slbVar3.p()));
                                                                                arrayList.add(new sja(slbVar3.G()));
                                                                                arrayList.add(new shy(slbVar3.q()));
                                                                                arrayList.add(new sjo(Integer.valueOf(slbVar3.m())));
                                                                                arrayList.add(new six(zBooleanValue));
                                                                                if (optional.isPresent()) {
                                                                                    arrayList.add(new sjk((sko) optional.get()));
                                                                                }
                                                                                if (wjfVar3.f().av()) {
                                                                                    arrayList.add(new siv(true));
                                                                                }
                                                                                aivsVar = aivtVar.c;
                                                                                if (aivsVar == null) {
                                                                                    aivsVar2 = aivs.a;
                                                                                } else {
                                                                                    aivsVar2 = aivsVar;
                                                                                }
                                                                                aixoVarA = aixo.a(aivsVar2.d);
                                                                                if (aixoVarA == null) {
                                                                                    aixoVarA = aixo.SLOT_TYPE_UNSPECIFIED;
                                                                                }
                                                                                aixo aixoVar6 = aixoVarA;
                                                                                if (aivsVar == null) {
                                                                                    aivsVar = aivs.a;
                                                                                }
                                                                                int i4 = aivsVar.e;
                                                                                if (snkVar == null) {
                                                                                    agkeVarQ = agpi.a;
                                                                                } else {
                                                                                    agkeVarQ = agke.q(snkVar);
                                                                                }
                                                                                agke agkeVar11 = agkeVarQ;
                                                                                shh shhVarA3 = shh.a(arrayList);
                                                                                aivsVar3 = aivtVar.c;
                                                                                if (aivsVar3 == null) {
                                                                                    aivsVar3 = aivs.a;
                                                                                }
                                                                                aivrVar = aivsVar3.f;
                                                                                if (aivrVar == null) {
                                                                                    aivrVar = aivr.a;
                                                                                }
                                                                                smr smrVarH3 = smr.h(str3, aixoVar6, i4, agkeVar11, agkeVar10, agkeVar2, shhVarA3, Optional.of(aivrVar), optional);
                                                                                ?? r6 = r21;
                                                                                r6.add(smrVarH3);
                                                                                smrVar2 = smrVar2;
                                                                                rzsVar2 = rzsVar;
                                                                                r2 = r6;
                                                                            } catch (sas e11) {
                                                                                e = e11;
                                                                                skoVar3 = skoVar3;
                                                                                rzsVar = rzsVar2;
                                                                                agkeVarC2 = agkeVar3;
                                                                                r22 = arrayList2;
                                                                                snkVar = snkVar2;
                                                                                r20 = r22;
                                                                                rmp.j(null, "Failed to create a client trigger or a layout for the InPlayer slot ".concat(String.valueOf(e.getMessage())));
                                                                                agkeVar2 = agkeVarC2;
                                                                                r21 = r20;
                                                                                optional = optionalEmpty;
                                                                                agke agkeVar12 = agkeVar;
                                                                                arrayList = new ArrayList();
                                                                                arrayList.add(new sid(wjfVar3));
                                                                                arrayList.add(new shx(slmVar));
                                                                                arrayList.add(new shq(sgsVarB));
                                                                                arrayList.add(new shn(sgnVar));
                                                                                arrayList.add(new sjz(listenableFuture));
                                                                                arrayList.add(new sho(slbVar3.o));
                                                                                arrayList.add(new sjw(slbVar3.c()));
                                                                                arrayList.add(new sjx(slbVar3.p()));
                                                                                arrayList.add(new sja(slbVar3.G()));
                                                                                arrayList.add(new shy(slbVar3.q()));
                                                                                arrayList.add(new sjo(Integer.valueOf(slbVar3.m())));
                                                                                arrayList.add(new six(zBooleanValue));
                                                                                if (optional.isPresent()) {
                                                                                    arrayList.add(new sjk((sko) optional.get()));
                                                                                }
                                                                                if (wjfVar3.f().av()) {
                                                                                    arrayList.add(new siv(true));
                                                                                }
                                                                                aivsVar = aivtVar.c;
                                                                                if (aivsVar == null) {
                                                                                    aivsVar2 = aivs.a;
                                                                                } else {
                                                                                    aivsVar2 = aivsVar;
                                                                                }
                                                                                aixoVarA = aixo.a(aivsVar2.d);
                                                                                if (aixoVarA == null) {
                                                                                    aixoVarA = aixo.SLOT_TYPE_UNSPECIFIED;
                                                                                }
                                                                                aixo aixoVar7 = aixoVarA;
                                                                                if (aivsVar == null) {
                                                                                    aivsVar = aivs.a;
                                                                                }
                                                                                int i5 = aivsVar.e;
                                                                                if (snkVar == null) {
                                                                                    agkeVarQ = agpi.a;
                                                                                } else {
                                                                                    agkeVarQ = agke.q(snkVar);
                                                                                }
                                                                                agke agkeVar13 = agkeVarQ;
                                                                                shh shhVarA4 = shh.a(arrayList);
                                                                                aivsVar3 = aivtVar.c;
                                                                                if (aivsVar3 == null) {
                                                                                    aivsVar3 = aivs.a;
                                                                                }
                                                                                aivrVar = aivsVar3.f;
                                                                                if (aivrVar == null) {
                                                                                    aivrVar = aivr.a;
                                                                                }
                                                                                smr smrVarH4 = smr.h(str3, aixoVar7, i5, agkeVar13, agkeVar12, agkeVar2, shhVarA4, Optional.of(aivrVar), optional);
                                                                                ?? r7 = r21;
                                                                                r7.add(smrVarH4);
                                                                                smrVar2 = smrVar2;
                                                                                rzsVar2 = rzsVar;
                                                                                r2 = r7;
                                                                                agkzVar = rzsVar2.e;
                                                                                aixoVar = aixo.SLOT_TYPE_IN_PLAYER;
                                                                                if (agkzVar.contains(aixoVar)) {
                                                                                    skoVar2 = skoVar3;
                                                                                    r3 = r2;
                                                                                } else {
                                                                                    skoVar2 = skoVar3;
                                                                                    r3 = r2;
                                                                                }
                                                                                rzsVar2.f = skoVar2.a;
                                                                                return r3;
                                                                            } catch (sav e12) {
                                                                                e = e12;
                                                                                skoVar3 = skoVar3;
                                                                                rzsVar = rzsVar2;
                                                                                agkeVarC2 = agkeVar3;
                                                                                r22 = arrayList2;
                                                                                snkVar = snkVar2;
                                                                                r20 = r22;
                                                                                rmp.j(null, "Failed to create a client trigger or a layout for the InPlayer slot ".concat(String.valueOf(e.getMessage())));
                                                                                agkeVar2 = agkeVarC2;
                                                                                r21 = r20;
                                                                                optional = optionalEmpty;
                                                                                agke agkeVar14 = agkeVar;
                                                                                arrayList = new ArrayList();
                                                                                arrayList.add(new sid(wjfVar3));
                                                                                arrayList.add(new shx(slmVar));
                                                                                arrayList.add(new shq(sgsVarB));
                                                                                arrayList.add(new shn(sgnVar));
                                                                                arrayList.add(new sjz(listenableFuture));
                                                                                arrayList.add(new sho(slbVar3.o));
                                                                                arrayList.add(new sjw(slbVar3.c()));
                                                                                arrayList.add(new sjx(slbVar3.p()));
                                                                                arrayList.add(new sja(slbVar3.G()));
                                                                                arrayList.add(new shy(slbVar3.q()));
                                                                                arrayList.add(new sjo(Integer.valueOf(slbVar3.m())));
                                                                                arrayList.add(new six(zBooleanValue));
                                                                                if (optional.isPresent()) {
                                                                                    arrayList.add(new sjk((sko) optional.get()));
                                                                                }
                                                                                if (wjfVar3.f().av()) {
                                                                                    arrayList.add(new siv(true));
                                                                                }
                                                                                aivsVar = aivtVar.c;
                                                                                if (aivsVar == null) {
                                                                                    aivsVar2 = aivs.a;
                                                                                } else {
                                                                                    aivsVar2 = aivsVar;
                                                                                }
                                                                                aixoVarA = aixo.a(aivsVar2.d);
                                                                                if (aixoVarA == null) {
                                                                                    aixoVarA = aixo.SLOT_TYPE_UNSPECIFIED;
                                                                                }
                                                                                aixo aixoVar8 = aixoVarA;
                                                                                if (aivsVar == null) {
                                                                                    aivsVar = aivs.a;
                                                                                }
                                                                                int i6 = aivsVar.e;
                                                                                if (snkVar == null) {
                                                                                    agkeVarQ = agpi.a;
                                                                                } else {
                                                                                    agkeVarQ = agke.q(snkVar);
                                                                                }
                                                                                agke agkeVar15 = agkeVarQ;
                                                                                shh shhVarA5 = shh.a(arrayList);
                                                                                aivsVar3 = aivtVar.c;
                                                                                if (aivsVar3 == null) {
                                                                                    aivsVar3 = aivs.a;
                                                                                }
                                                                                aivrVar = aivsVar3.f;
                                                                                if (aivrVar == null) {
                                                                                    aivrVar = aivr.a;
                                                                                }
                                                                                smr smrVarH5 = smr.h(str3, aixoVar8, i6, agkeVar15, agkeVar14, agkeVar2, shhVarA5, Optional.of(aivrVar), optional);
                                                                                ?? r8 = r21;
                                                                                r8.add(smrVarH5);
                                                                                smrVar2 = smrVar2;
                                                                                rzsVar2 = rzsVar;
                                                                                r2 = r8;
                                                                                agkzVar = rzsVar2.e;
                                                                                aixoVar = aixo.SLOT_TYPE_IN_PLAYER;
                                                                                if (agkzVar.contains(aixoVar)) {
                                                                                    skoVar2 = skoVar3;
                                                                                    r3 = r2;
                                                                                } else {
                                                                                    skoVar2 = skoVar3;
                                                                                    r3 = r2;
                                                                                }
                                                                                rzsVar2.f = skoVar2.a;
                                                                                return r3;
                                                                            }
                                                                        } catch (sas e13) {
                                                                            e = e13;
                                                                        } catch (sav e14) {
                                                                            e = e14;
                                                                        }
                                                                    } catch (sas | sav e15) {
                                                                        e = e15;
                                                                        skoVar3 = skoVar3;
                                                                        rzsVar = rzsVar2;
                                                                        snkVar2 = snkVarB;
                                                                    }
                                                                } catch (sas | sav e16) {
                                                                    e = e16;
                                                                    agkeVar3 = agkeVarC4;
                                                                }
                                                                agkeVarC2 = agkeVar3;
                                                                r22 = arrayList2;
                                                            } catch (sas | sav e17) {
                                                                e = e17;
                                                                skoVar3 = skoVar3;
                                                                rzsVar = rzsVar2;
                                                                snkVar2 = snkVarB;
                                                                r22 = arrayList2;
                                                            }
                                                        } catch (sas | sav e18) {
                                                            e = e18;
                                                            agkeVar = agkeVarC3;
                                                        }
                                                    } catch (sas | sav e19) {
                                                        e = e19;
                                                        skoVar3 = skoVar3;
                                                        rzsVar = rzsVar2;
                                                        snkVar2 = snkVarB;
                                                        agkeVar = agkeVarC2;
                                                        r22 = arrayList2;
                                                    }
                                                } catch (sas | sav e20) {
                                                    e = e20;
                                                    str3 = str6;
                                                }
                                                snkVar = snkVar2;
                                                r20 = r22;
                                            } catch (sas | sav e21) {
                                                e = e21;
                                                r20 = arrayList2;
                                                str3 = str6;
                                                skoVar3 = skoVar3;
                                                rzsVar = rzsVar2;
                                                agkeVar = agkeVarC2;
                                                snkVar = null;
                                            }
                                            rmp.j(null, "Failed to create a client trigger or a layout for the InPlayer slot ".concat(String.valueOf(e.getMessage())));
                                            agkeVar2 = agkeVarC2;
                                            r21 = r20;
                                            optional = optionalEmpty;
                                            agke agkeVar16 = agkeVar;
                                            arrayList = new ArrayList();
                                            arrayList.add(new sid(wjfVar3));
                                            arrayList.add(new shx(slmVar));
                                            arrayList.add(new shq(sgsVarB));
                                            arrayList.add(new shn(sgnVar));
                                            arrayList.add(new sjz(listenableFuture));
                                            arrayList.add(new sho(slbVar3.o));
                                            arrayList.add(new sjw(slbVar3.c()));
                                            arrayList.add(new sjx(slbVar3.p()));
                                            arrayList.add(new sja(slbVar3.G()));
                                            arrayList.add(new shy(slbVar3.q()));
                                            arrayList.add(new sjo(Integer.valueOf(slbVar3.m())));
                                            arrayList.add(new six(zBooleanValue));
                                            if (optional.isPresent()) {
                                                arrayList.add(new sjk((sko) optional.get()));
                                            }
                                            if (wjfVar3.f().av()) {
                                                arrayList.add(new siv(true));
                                            }
                                            aivsVar = aivtVar.c;
                                            if (aivsVar == null) {
                                                aivsVar2 = aivs.a;
                                            } else {
                                                aivsVar2 = aivsVar;
                                            }
                                            aixoVarA = aixo.a(aivsVar2.d);
                                            if (aixoVarA == null) {
                                                aixoVarA = aixo.SLOT_TYPE_UNSPECIFIED;
                                            }
                                            aixo aixoVar9 = aixoVarA;
                                            if (aivsVar == null) {
                                                aivsVar = aivs.a;
                                            }
                                            int i7 = aivsVar.e;
                                            if (snkVar == null) {
                                                agkeVarQ = agpi.a;
                                            } else {
                                                agkeVarQ = agke.q(snkVar);
                                            }
                                            agke agkeVar17 = agkeVarQ;
                                            shh shhVarA6 = shh.a(arrayList);
                                            aivsVar3 = aivtVar.c;
                                            if (aivsVar3 == null) {
                                                aivsVar3 = aivs.a;
                                            }
                                            aivrVar = aivsVar3.f;
                                            if (aivrVar == null) {
                                                aivrVar = aivr.a;
                                            }
                                            smr smrVarH6 = smr.h(str3, aixoVar9, i7, agkeVar17, agkeVar16, agkeVar2, shhVarA6, Optional.of(aivrVar), optional);
                                            ?? r9 = r21;
                                            r9.add(smrVarH6);
                                            smrVar2 = smrVar2;
                                            rzsVar2 = rzsVar;
                                            r2 = r9;
                                        } else {
                                            skoVar3 = skoVar3;
                                            rzsVar2 = rzsVar2;
                                            aaok aaokVar3 = (aaok) rzsVar2.c.io();
                                            String str9 = skoVar3.a;
                                            smrVar2 = smrVar2;
                                            String str10 = (String) smrVar2.d(sic.class);
                                            wjf wjfVar4 = (wjf) smrVar2.d(sid.class);
                                            slm slmVar2 = (slm) smrVar2.d(shx.class);
                                            sgn sgnVar2 = (sgn) skoVar3.d(shn.class);
                                            Object obj8 = aaokVar3.d;
                                            aixo aixoVar10 = aixo.SLOT_TYPE_IN_PLAYER;
                                            xsc xscVar2 = (xsc) obj8;
                                            String strAa2 = xscVar2.aa();
                                            aixr aixrVar5 = aixr.TRIGGER_TYPE_LAYOUT_ID_ENTERED;
                                            agke agkeVarQ5 = agke.q(new skv(xscVar2.Z(aixrVar5), aixrVar5, false, str9));
                                            aixr aixrVar6 = aixr.TRIGGER_TYPE_SLOT_ID_ENTERED;
                                            agke agkeVarQ6 = agke.q(new smu(xscVar2.Z(aixrVar6), aixrVar6, false, strAa2));
                                            aixr aixrVar7 = aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID;
                                            slt sltVar2 = new slt(xscVar2.Z(aixrVar7), aixrVar7, false, str10, false);
                                            aixr aixrVar8 = aixr.TRIGGER_TYPE_SLOT_ID_EXITED;
                                            arrayList2.add(smr.i(strAa2, aixoVar10, agkeVarQ5, agkeVarQ6, agke.r(sltVar2, new smv(xscVar2.Z(aixrVar8), aixrVar8, false, strAa2)), shh.b(new sjh(str9), new sid(wjfVar4), new shx(slmVar2), new shq(sgsVarB), new shn(sgnVar2), new sjz(listenableFuture), new sjb(slbVar3))));
                                            r2 = arrayList2;
                                        }
                                    }
                                } else {
                                    smrVar2 = smrVar2;
                                    skoVar3 = skoVar3;
                                    rzsVar2 = rzsVar2;
                                    r2 = arrayList2;
                                }
                            }
                            agkzVar = rzsVar2.e;
                            aixoVar = aixo.SLOT_TYPE_IN_PLAYER;
                            if (agkzVar.contains(aixoVar) || !(slbVar3 instanceof skz)) {
                                skoVar2 = skoVar3;
                                r3 = r2;
                            } else {
                                aixo aixoVar11 = aixo.SLOT_TYPE_PLAYER_BYTES;
                                if (!smrVar2.g(aixoVar11, sic.class) || slbVar3.e().isEmpty()) {
                                    skoVar2 = skoVar3;
                                    r3 = r2;
                                } else {
                                    ambn ambnVar2 = (ambn) slbVar3.e().get();
                                    if (slbVar3.c() == null) {
                                        alkdVar = null;
                                    } else {
                                        alkdVar = slbVar3.c().u().A;
                                        if (alkdVar == null) {
                                            alkdVar = alkd.a;
                                        }
                                        if ((alkdVar.b == 156617590 ? (ajvx) alkdVar.c : ajvx.a).h.size() <= 0) {
                                            alkdVar = null;
                                        }
                                    }
                                    if (alkdVar == null) {
                                        skoVar2 = skoVar3;
                                        r3 = r2;
                                    } else {
                                        apji apjiVar3 = ambnVar2.i;
                                        if (apjiVar3 == null) {
                                            apjiVar3 = apji.a;
                                        }
                                        apzt apztVar = (apzt) aavv.s(apjiVar3, apzu.a);
                                        ajwo ajwoVarF = slbVar3.F();
                                        if (apztVar == null || ajwoVarF == null) {
                                            skoVar2 = skoVar3;
                                            r3 = r2;
                                        } else {
                                            aaok aaokVar4 = (aaok) rzsVar2.c.io();
                                            skoVar2 = skoVar3;
                                            String str11 = skoVar2.a;
                                            String str12 = (String) skoVar2.d(sib.class);
                                            String str13 = (String) smrVar2.d(sic.class);
                                            xsc xscVar3 = (xsc) aaokVar4.d;
                                            String strAa3 = xscVar3.aa();
                                            vyo vyoVar2 = (vyo) aaokVar4.c;
                                            if (afxw.e(vyoVar2).ao) {
                                                skwVar = skt.e(xscVar3.Z(aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON), str12, 2);
                                                z = false;
                                            } else if (afxw.e(vyoVar2).an) {
                                                z = false;
                                                skwVar = skt.e(xscVar3.Z(aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON), str12, 0);
                                            } else {
                                                z = false;
                                                aixr aixrVar9 = aixr.TRIGGER_TYPE_LAYOUT_ID_EXITED;
                                                skwVar = new skw(xscVar3.Z(aixrVar9), aixrVar9, false, str12);
                                            }
                                            aixr aixrVar10 = aixr.TRIGGER_TYPE_SLOT_ID_ENTERED;
                                            smu smuVar = new smu(xscVar3.Z(aixrVar10), aixrVar10, z, strAa3);
                                            agke agkeVarQ7 = agke.q(skwVar);
                                            agke agkeVarQ8 = agke.q(smuVar);
                                            aixr aixrVar11 = aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID;
                                            slt sltVar3 = new slt(xscVar3.Z(aixrVar11), aixrVar11, false, str13, false);
                                            aixr aixrVar12 = aixr.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED;
                                            sln slnVar = new sln(xscVar3.Z(aixrVar12), aixrVar12, false, str11, aixoVar11, aixg.LAYOUT_TYPE_MEDIA);
                                            aixr aixrVar13 = aixr.TRIGGER_TYPE_SLOT_ID_EXITED;
                                            agke agkeVarS = agke.s(sltVar3, slnVar, new smv(xscVar3.Z(aixrVar13), aixrVar13, false, strAa3));
                                            sht[] shtVarArr = new sht[i];
                                            shtVarArr[0] = new sif(alkdVar);
                                            shtVarArr[1] = new sjn(apztVar);
                                            shtVarArr[2] = new shm(ajwoVarF);
                                            shtVarArr[3] = new sjh(str11);
                                            shtVarArr[4] = new sjb(slbVar3);
                                            shtVarArr[c] = new sic(str13);
                                            r2.add(smr.i(strAa3, aixoVar, agkeVarQ7, agkeVarQ8, agkeVarS, shh.b(shtVarArr)));
                                            r3 = r2;
                                        }
                                    }
                                }
                            }
                        } else {
                            c = 5;
                        }
                        i = 6;
                        r2 = arrayList2;
                        agkzVar = rzsVar2.e;
                        aixoVar = aixo.SLOT_TYPE_IN_PLAYER;
                        if (agkzVar.contains(aixoVar)) {
                            skoVar2 = skoVar3;
                            r3 = r2;
                        } else {
                            skoVar2 = skoVar3;
                            r3 = r2;
                        }
                    }
                    rzsVar2.f = skoVar2.a;
                    return r3;
                }
            });
        }
    }

    @Override // defpackage.sai
    public final void b(smr smrVar, sko skoVar, int i) {
        if (skoVar.f(aixg.LAYOUT_TYPE_MEDIA, new Class[0]) && TextUtils.equals(skoVar.a, this.f)) {
            this.f = "";
        }
    }

    public final void c(List list, smr smrVar, sko skoVar, slb slbVar, ListenableFuture listenableFuture) {
        agkz agkzVar = this.e;
        aixo aixoVar = aixo.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE;
        if (agkzVar.contains(aixoVar) && smrVar.g(aixo.SLOT_TYPE_PLAYER_BYTES, sic.class, sid.class) && skoVar.f(aixg.LAYOUT_TYPE_MEDIA, sib.class)) {
            sgn sgnVar = skoVar.o.e(shn.class) ? (sgn) skoVar.d(shn.class) : sgn.a;
            aaok aaokVar = (aaok) this.c.io();
            String str = (String) smrVar.d(sic.class);
            wjf wjfVar = (wjf) smrVar.d(sid.class);
            String str2 = (String) skoVar.d(sib.class);
            xsc xscVar = (xsc) aaokVar.d;
            String strAa = xscVar.aa();
            aixr aixrVar = aixr.TRIGGER_TYPE_ON_PLAYBACK_WITH_CONTENT_VIDEO_ID;
            slw slwVar = new slw(xscVar.Z(aixrVar), aixrVar, true, str);
            aixr aixrVar2 = aixr.TRIGGER_TYPE_SLOT_ID_ENTERED;
            smu smuVar = new smu(xscVar.Z(aixrVar2), aixrVar2, false, strAa);
            agjz agjzVar = new agjz(4);
            aixr aixrVar3 = aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID;
            agjzVar.h(new slt(xscVar.Z(aixrVar3), aixrVar3, false, str, false));
            aixr aixrVar4 = aixr.TRIGGER_TYPE_SLOT_ID_EXITED;
            agjzVar.h(new smv(xscVar.Z(aixrVar4), aixrVar4, false, strAa));
            vyo vyoVar = (vyo) aaokVar.c;
            if (afxw.e(vyoVar).K || afxw.e(vyoVar).M || afxw.e(vyoVar).L) {
                aixr aixrVar5 = aixr.TRIGGER_TYPE_MEDIA_PAUSED;
                agjzVar.h(new slg(xscVar.Z(aixrVar5), aixrVar5, false, str));
            }
            if (sgnVar.c > 1 && !taq.ai(vyoVar) && taq.ak(vyoVar)) {
                agjzVar.h(skt.e(xscVar.Z(aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON), str2, 0));
            }
            sdq sdqVar = new sdq(agke.q(slwVar), agke.q(smuVar), agjzVar.g());
            list.add(smr.i(strAa, aixoVar, sdqVar.a, sdqVar.b, sdqVar.c, shh.b(new sjh(skoVar.a), new siq(new skm(slbVar)), new sid(wjfVar), new sib(str2), new shn(sgnVar), new shv(ahcs.e(listenableFuture, afwl.a(new rmk(19)), MoreExecutors.directExecutor())), new shs(ahcs.e(listenableFuture, afwl.a(new rmk(20)), MoreExecutors.directExecutor())), new sju(ahcs.e(listenableFuture, afwl.a(new sdp(1)), MoreExecutors.directExecutor())), new sjs(ahcs.e(listenableFuture, afwl.a(new sdp(0)), MoreExecutors.directExecutor())), new sic(str), new sit(false))));
        }
    }

    public final void d(List list, smr smrVar, sko skoVar, slb slbVar, ListenableFuture listenableFuture) {
        agkz agkzVar = this.e;
        aixo aixoVar = aixo.SLOT_TYPE_BELOW_PLAYER;
        if (agkzVar.contains(aixoVar) && smrVar.g(aixo.SLOT_TYPE_PLAYER_BYTES, sic.class, sid.class) && skoVar.f(aixg.LAYOUT_TYPE_MEDIA, sib.class)) {
            sgn sgnVar = skoVar.o.e(shn.class) ? (sgn) skoVar.d(shn.class) : sgn.a;
            aaok aaokVar = (aaok) this.c.io();
            String str = (String) smrVar.d(sic.class);
            wjf wjfVar = (wjf) smrVar.d(sid.class);
            String str2 = (String) skoVar.d(sib.class);
            xsc xscVar = (xsc) aaokVar.d;
            String strAa = xscVar.aa();
            agjz agjzVar = new agjz(4);
            aixr aixrVar = aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID;
            agjzVar.h(new slt(xscVar.Z(aixrVar), aixrVar, false, str, false));
            aixr aixrVar2 = aixr.TRIGGER_TYPE_SLOT_ID_EXITED;
            agjzVar.h(new smv(xscVar.Z(aixrVar2), aixrVar2, false, strAa));
            if (sgnVar.c > 1 && taq.ak((vyo) aaokVar.c)) {
                agjzVar.h(skt.e(xscVar.Z(aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON), str2, 0));
            }
            aixr aixrVar3 = aixr.TRIGGER_TYPE_LAYOUT_ID_ENTERED_AND_SLOT_FULFILLED;
            String strZ = xscVar.Z(aixrVar3);
            String str3 = skoVar.a;
            agke agkeVarQ = agke.q(new sku(strZ, aixrVar3, str3, strAa));
            aixr aixrVar4 = aixr.TRIGGER_TYPE_LAYOUT_ID_ENTERED;
            sdq sdqVar = new sdq(agkeVarQ, agke.q(new skv(xscVar.Z(aixrVar4), aixrVar4, false, str3)), agjzVar.g());
            list.add(smr.i(strAa, aixoVar, sdqVar.a, sdqVar.b, sdqVar.c, shh.b(new sjh(str3), new siq(new skm(slbVar)), new sid(wjfVar), new sib(str2), new shn(sgnVar), new sic(str), new shz(ahcs.e(listenableFuture, afwl.a(new rmk(18)), MoreExecutors.directExecutor())))));
        }
    }

    public final void e(List list, smr smrVar, sko skoVar, slb slbVar) {
        agkz agkzVar = this.e;
        aixo aixoVar = aixo.SLOT_TYPE_ADS_WATCH_NEXT_REQUEST;
        if (agkzVar.contains(aixoVar) && smrVar.g(aixo.SLOT_TYPE_PLAYER_BYTES, sic.class, sid.class) && skoVar.f(aixg.LAYOUT_TYPE_MEDIA, sib.class)) {
            sgn sgnVar = skoVar.o.e(shn.class) ? (sgn) skoVar.d(shn.class) : sgn.a;
            aaok aaokVar = (aaok) this.c.io();
            String str = (String) smrVar.d(sic.class);
            wjf wjfVar = (wjf) smrVar.d(sid.class);
            String str2 = (String) skoVar.d(sib.class);
            xsc xscVar = (xsc) aaokVar.d;
            String strAa = xscVar.aa();
            String str3 = skoVar.a;
            shh shhVarB = shh.b(new sjh(str3), new siq(new skm(slbVar)), new sid(wjfVar), new sib(str2), new shn(sgnVar));
            aixr aixrVar = aixr.TRIGGER_TYPE_SLOT_ID_FULFILLED_NON_EMPTY;
            agke agkeVarQ = agke.q(new smx(xscVar.Z(aixrVar), aixrVar, strAa));
            aixr aixrVar2 = aixr.TRIGGER_TYPE_LAYOUT_ID_ENTERED;
            agke agkeVarQ2 = agke.q(new skv(xscVar.Z(aixrVar2), aixrVar2, false, str3));
            aixr aixrVar3 = aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID;
            slt sltVar = new slt(xscVar.Z(aixrVar3), aixrVar3, false, str, false);
            aixr aixrVar4 = aixr.TRIGGER_TYPE_SLOT_ID_EXITED;
            list.add(smr.i(strAa, aixoVar, agkeVarQ, agkeVarQ2, agke.r(sltVar, new smv(xscVar.Z(aixrVar4), aixrVar4, false, strAa)), shhVarB));
        }
    }
}
