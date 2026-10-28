package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.blocks.runtime.BaseClient;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import internal.org.jni_zero.CommonApis;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaok {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public aaok(aunn aunnVar, qcb qcbVar, Executor executor) {
        aunnVar.getClass();
        qcbVar.getClass();
        executor.getClass();
        this.c = aunnVar;
        this.b = qcbVar;
        this.d = executor;
        this.a = (afzc) ((Container) aunnVar.io()).b(new afzb(0), new uot(this, 1));
    }

    public static final smr ag(String str, String str2, wjf wjfVar, slm slmVar, boolean z) {
        aivr aivrVar;
        aisu aisuVarM = wjfVar.m();
        if (aisuVarM == null || (aivrVar = aisuVarM.j) == null) {
            aivrVar = aivr.a;
        }
        aixo aixoVar = aixo.SLOT_TYPE_PLAYER_BYTES;
        shh shhVarB = shh.b(new shx(slmVar), new sic(str2), new sid(wjfVar), new siv(z));
        Optional optionalOf = Optional.of(aivrVar);
        smq smqVarA = smq.a(aixoVar, 1);
        agke agkeVar = agpi.a;
        return new smr(str, smqVarA, 4, agkeVar, agkeVar, agkeVar, shhVarB, optionalOf, Optional.empty(), false, Optional.empty(), agkeVar);
    }

    public static final Optional ah(skl sklVar) {
        return (sklVar == null || sklVar.d() == null) ? Optional.of(aivr.a) : Optional.of(sklVar.d());
    }

    public static final List ai(String str, acfw acfwVar, wjf wjfVar, slm slmVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new sic(str));
        arrayList.add(new sjy(acfwVar));
        arrayList.add(new sid(wjfVar));
        arrayList.add(new shx(slmVar));
        return arrayList;
    }

    public static final Optional aj(long j, wjf wjfVar, long j2) {
        if (j <= j2) {
            return Optional.of(new snh(j, nre.b(nre.f(wjfVar, j), j2)));
        }
        rmp.j(null, String.format(Locale.US, "Could not create a PlayerBytesSlot since the ad break start time = %d ms happens after the video end time = %d ms", Long.valueOf(j), Long.valueOf(j2)));
        return Optional.empty();
    }

    public static final long ak(skl sklVar) {
        if (sklVar == null || sklVar.b() != slm.MID_ROLL) {
            return 9223372036854775806L;
        }
        return sklVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0088  */
    public static final agke al(aehs aehsVar, List list, String str) {
        agev agevVarI;
        sko skoVarA;
        agke agkeVarC;
        smr smrVarH;
        aiua aiuaVar;
        agke agkeVarC2;
        int i = 4;
        agjz agjzVar = new agjz(4);
        if (list == null) {
            return agjzVar.g();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aivt aivtVar = (aivt) it.next();
            if ((aivtVar.b & 8) != 0) {
                try {
                    try {
                        aizs aizsVar = aivtVar.f;
                        if (aizsVar == null) {
                            aizsVar = aizs.a;
                        }
                        snk snkVarB = nrj.b(aizsVar, Optional.of(str));
                        aivs aivsVar = aivtVar.c;
                        if (aivsVar == null) {
                            aivsVar = aivs.a;
                        }
                        aixo aixoVarA = aixo.a(aivsVar.d);
                        if (aixoVarA == null) {
                            aixoVarA = aixo.SLOT_TYPE_UNSPECIFIED;
                        }
                        int iOrdinal = aixoVarA.ordinal();
                        if (iOrdinal == 10) {
                            aivu aivuVar = aivtVar.e;
                            if (aivuVar == null) {
                                aivuVar = aivu.a;
                            }
                            apji apjiVar = aivuVar.b;
                            if (apjiVar == null) {
                                apjiVar = apji.a;
                            }
                            ajlh ajlhVar = (ajlh) aavv.s(apjiVar, ajli.a);
                            if (ajlhVar == null) {
                                throw new sas("Unable to fetch the below player ad layout renderer to build a below player layout.", 117);
                            }
                            agjz agjzVar2 = new agjz(i);
                            try {
                                Object obj = aehsVar.i;
                                agjzVar2.j(nrj.c(ajlhVar.d, Optional.empty()));
                            } catch (sav e) {
                                Object obj2 = aehsVar.e;
                                rmp.n(null, "Failed to create a client trigger. ".concat(String.valueOf(e.getMessage())));
                            }
                            agke agkeVarG = agjzVar2.g();
                            aiuc aiucVar = ajlhVar.b;
                            if (aiucVar == null) {
                                aiucVar = aiuc.a;
                            }
                            amco amcoVarI = aehsVar.i(snkVarB, aivtVar, aiucVar);
                            ArrayList arrayList = new ArrayList();
                            apji apjiVar2 = ajlhVar.c;
                            if (apjiVar2 == null) {
                                apjiVar2 = apji.a;
                            }
                            akrn akrnVar = (akrn) aavv.s(apjiVar2, akrs.a);
                            if (akrnVar != null) {
                                aihf aihfVarCreateBuilder = akck.a.createBuilder();
                                aihfVarCreateBuilder.copyOnWrite();
                                akck akckVar = (akck) aihfVarCreateBuilder.instance;
                                akckVar.c = akrnVar;
                                akckVar.b |= 32;
                                agevVarI = agev.i((akck) aihfVarCreateBuilder.build());
                            } else {
                                apji apjiVar3 = ajlhVar.c;
                                if (apjiVar3 == null) {
                                    apjiVar3 = apji.a;
                                }
                                anjk anjkVar = (anjk) aavv.s(apjiVar3, anjk.b);
                                if (anjkVar != null) {
                                    aihf aihfVarCreateBuilder2 = akck.a.createBuilder();
                                    aihfVarCreateBuilder2.copyOnWrite();
                                    akck akckVar2 = (akck) aihfVarCreateBuilder2.instance;
                                    akckVar2.d = anjkVar;
                                    akckVar2.b |= 64;
                                    agevVarI = agev.i((akck) aihfVarCreateBuilder2.build());
                                } else {
                                    agevVarI = agdf.a;
                                }
                            }
                            if (!agevVarI.g()) {
                                throw new sas("Unable to create a companion ad from the rendering content.", 117);
                            }
                            arrayList.add(new sia((akck) agevVarI.c()));
                            arrayList.add(new shu(ajlhVar));
                            skn sknVarA = sko.a();
                            sknVarA.l(aiucVar.c);
                            aixg aixgVarA = aixg.a(aiucVar.d);
                            if (aixgVarA == null) {
                                aixgVarA = aixg.LAYOUT_TYPE_UNSPECIFIED;
                            }
                            sknVarA.a = aixgVarA;
                            sknVarA.m(1);
                            sknVarA.g(agkeVarG);
                            aiua aiuaVar2 = aiucVar.e;
                            if (aiuaVar2 == null) {
                                aiuaVar2 = aiua.a;
                            }
                            sknVarA.b(aiuaVar2);
                            sknVarA.c(amcoVarI);
                            sknVarA.c = shh.a(arrayList);
                            skoVarA = sknVarA.a();
                        } else if (iOrdinal == 13) {
                            aivu aivuVar2 = aivtVar.e;
                            if (aivuVar2 == null) {
                                aivuVar2 = aivu.a;
                            }
                            apji apjiVar4 = aivuVar2.b;
                            if (apjiVar4 == null) {
                                apjiVar4 = apji.a;
                            }
                            albg albgVar = (albg) aavv.s(apjiVar4, albh.a);
                            if (albgVar == null) {
                                throw new sas("Unable to fetch the fullscreen engagement ad layout renderer to build a layout", 117);
                            }
                            apji apjiVar5 = albgVar.c;
                            if (apjiVar5 == null) {
                                apjiVar5 = apji.a;
                            }
                            albi albiVar = (albi) aavv.s(apjiVar5, albj.a);
                            if (albiVar == null) {
                                throw new sas("Unable to fetch the ad engagement panels from the fullscreen engagement ad layout renderer.", 117);
                            }
                            agke agkeVarC3 = agpi.a;
                            try {
                                Object obj3 = aehsVar.i;
                                agkeVarC3 = nrj.c(albgVar.d, Optional.empty());
                            } catch (sav e2) {
                                Object obj4 = aehsVar.e;
                                rmp.n(null, "Failed to create a client trigger. ".concat(String.valueOf(e2.getMessage())));
                            }
                            aiuc aiucVar2 = albgVar.b;
                            if (aiucVar2 == null) {
                                aiucVar2 = aiuc.a;
                            }
                            if ((aiucVar2.b & i) != 0) {
                                aiuaVar = aiucVar2.e;
                                if (aiuaVar == null) {
                                    aiuaVar = aiua.a;
                                }
                            } else if ((albiVar.b & i) != 0) {
                                aiuaVar = albiVar.c;
                                if (aiuaVar == null) {
                                    aiuaVar = aiua.a;
                                }
                            } else {
                                aiuaVar = null;
                            }
                            amco amcoVarI2 = aehsVar.i(snkVarB, aivtVar, aiucVar2);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(new sht(albiVar));
                            skn sknVarA2 = sko.a();
                            sknVarA2.l(aiucVar2.c);
                            aixg aixgVarA2 = aixg.a(aiucVar2.d);
                            if (aixgVarA2 == null) {
                                aixgVarA2 = aixg.LAYOUT_TYPE_UNSPECIFIED;
                            }
                            sknVarA2.a = aixgVarA2;
                            sknVarA2.m(1);
                            sknVarA2.g(agkeVarC3);
                            sknVarA2.c(amcoVarI2);
                            sknVarA2.c = shh.a(arrayList2);
                            if (aiuaVar != null) {
                                sknVarA2.b(aiuaVar);
                            }
                            skoVarA = sknVarA2.a();
                        } else if (iOrdinal != 17) {
                            skoVarA = null;
                        } else {
                            aivu aivuVar3 = aivtVar.e;
                            if (aivuVar3 == null) {
                                aivuVar3 = aivu.a;
                            }
                            apji apjiVar6 = aivuVar3.b;
                            if (apjiVar6 == null) {
                                apjiVar6 = apji.a;
                            }
                            ajlj ajljVar = (ajlj) aavv.s(apjiVar6, ajlk.a);
                            if (ajljVar == null) {
                                throw new sas("Unable to fetch the below player immersive ad layout renderer to build a layout.", 117);
                            }
                            apji apjiVar7 = ajljVar.d;
                            if (apjiVar7 == null) {
                                apjiVar7 = apji.a;
                            }
                            aitm aitmVar = (aitm) aavv.s(apjiVar7, aitn.a);
                            if (aitmVar == null) {
                                throw new sas("Unable to fetch the ad engagement panels from the below player immersive layout renderer.", 117);
                            }
                            aiie aiieVar = aitmVar.c;
                            if (aiieVar.isEmpty()) {
                                skoVarA = null;
                            } else {
                                aiuc aiucVar3 = ajljVar.c;
                                if (aiucVar3 == null) {
                                    aiucVar3 = aiuc.a;
                                }
                                aivs aivsVar2 = aivtVar.c;
                                if (aivsVar2 == null) {
                                    aivsVar2 = aivs.a;
                                }
                                List listK = aehsVar.k(aiieVar, aivsVar2.c);
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(new shr(aiieVar));
                                arrayList3.add(new sin(listK));
                                if ((ajljVar.b & i) != 0) {
                                    ajwo ajwoVar = ajljVar.h;
                                    if (ajwoVar == null) {
                                        ajwoVar = ajwo.a;
                                    }
                                    arrayList3.add(new sjv(ajwoVar));
                                    arrayList3.add(new sjt(agpn.b));
                                }
                                agke agkeVarC4 = agpi.a;
                                try {
                                    Object obj5 = aehsVar.i;
                                    agkeVarC2 = nrj.c(ajljVar.e, Optional.empty());
                                    try {
                                        agkeVarC4 = nrj.c(ajljVar.f, Optional.empty());
                                    } catch (sav e3) {
                                        e = e3;
                                        Object obj6 = aehsVar.e;
                                        rmp.n(null, "Failed to create a client trigger. ".concat(String.valueOf(e.getMessage())));
                                    }
                                } catch (sav e4) {
                                    e = e4;
                                    agkeVarC2 = agkeVarC4;
                                }
                                amco amcoVarI3 = aehsVar.i(snkVarB, aivtVar, aiucVar3);
                                skn sknVarA3 = sko.a();
                                sknVarA3.l(aiucVar3.c);
                                aixg aixgVarA3 = aixg.a(aiucVar3.d);
                                if (aixgVarA3 == null) {
                                    aixgVarA3 = aixg.LAYOUT_TYPE_UNSPECIFIED;
                                }
                                sknVarA3.a = aixgVarA3;
                                sknVarA3.m(1);
                                sknVarA3.g(agkeVarC2);
                                sknVarA3.i(agkeVarC4);
                                sknVarA3.c(amcoVarI3);
                                sknVarA3.c = shh.a(arrayList3);
                                if ((aiucVar3.b & i) != 0) {
                                    aiua aiuaVar3 = aiucVar3.e;
                                    if (aiuaVar3 == null) {
                                        aiuaVar3 = aiua.a;
                                    }
                                    sknVarA3.b(aiuaVar3);
                                }
                                skoVarA = sknVarA3.a();
                            }
                        }
                        Optional optionalOfNullable = Optional.ofNullable(skoVarA);
                        aivs aivsVar3 = aivtVar.c;
                        if (aivsVar3 == null) {
                            aivsVar3 = aivs.a;
                        }
                        aixo aixoVarA2 = aixo.a(aivsVar3.d);
                        if (aixoVarA2 == null) {
                            aixoVarA2 = aixo.SLOT_TYPE_UNSPECIFIED;
                        }
                        if (aixoVarA2 == aixo.SLOT_TYPE_BELOW_PLAYER || aixoVarA2 == aixo.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE || aixoVarA2 == aixo.SLOT_TYPE_FULLSCREEN_ENGAGEMENT) {
                            agke agkeVarC5 = agpi.a;
                            try {
                                agkeVarC = nrj.c(aivtVar.g, Optional.empty());
                                try {
                                    agkeVarC5 = nrj.c(aivtVar.h, Optional.of(str));
                                } catch (sav e5) {
                                    e = e5;
                                    rmp.j(null, "Failed to create a client trigger. ".concat(String.valueOf(e.getMessage())));
                                }
                            } catch (sav e6) {
                                e = e6;
                                agkeVarC = agkeVarC5;
                            }
                            agke agkeVar = agkeVarC5;
                            agke agkeVar2 = agkeVarC;
                            ArrayList arrayList4 = new ArrayList();
                            if (optionalOfNullable.isPresent()) {
                                arrayList4.add(new sjk((sko) optionalOfNullable.get()));
                            }
                            aivs aivsVar4 = aivtVar.c;
                            String str2 = (aivsVar4 == null ? aivs.a : aivsVar4).c;
                            aixo aixoVarA3 = aixo.a((aivsVar4 == null ? aivs.a : aivsVar4).d);
                            if (aixoVarA3 == null) {
                                aixoVarA3 = aixo.SLOT_TYPE_UNSPECIFIED;
                            }
                            aixo aixoVar = aixoVarA3;
                            if (aivsVar4 == null) {
                                aivsVar4 = aivs.a;
                            }
                            int i2 = aivsVar4.e;
                            agke agkeVarQ = agke.q(snkVarB);
                            shh shhVarA = shh.a(arrayList4);
                            aivs aivsVar5 = aivtVar.c;
                            if (aivsVar5 == null) {
                                aivsVar5 = aivs.a;
                            }
                            aivr aivrVar = aivsVar5.f;
                            if (aivrVar == null) {
                                aivrVar = aivr.a;
                            }
                            smrVarH = smr.h(str2, aixoVar, i2, agkeVarQ, agkeVar2, agkeVar, shhVarA, Optional.of(aivrVar), optionalOfNullable);
                        } else {
                            smrVarH = null;
                        }
                        if (smrVarH != null) {
                            agjzVar.h(smrVarH);
                        }
                    } catch (sav e7) {
                        e = e7;
                        rmp.j(null, "Failed to create a client companion or engagement panel slot. ".concat(String.valueOf(e.getMessage())));
                    }
                } catch (sas e8) {
                    e = e8;
                    rmp.j(null, "Failed to create a client companion or engagement panel slot. ".concat(String.valueOf(e.getMessage())));
                }
                i = 4;
            }
        }
        return agjzVar.g();
    }

    private static agke ao(alup alupVar) {
        agjz agjzVarF = agke.f(alupVar.d.size());
        for (alun alunVar : alupVar.d) {
            agjzVarF.h(new tnd(alunVar.c, alunVar.d));
        }
        return agjzVarF.g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    private final Map ap() {
        String strI = this.d.e().i();
        ?? r2 = this.a;
        Map map = (Map) r2.get(strI);
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap();
        r2.put(strI, map2);
        return map2;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, wjf] */
    private final void aq(sep sepVar, String str) {
        Object obj = this.d;
        ((tce) this.b).a(new seq(sepVar, (slm) this.a, this.c, (smc) obj, str));
    }

    private final snk ar(String str, String str2, skl sklVar, snh snhVar) {
        slm slmVar = slm.PRE_ROLL;
        int iOrdinal = sklVar.b().ordinal();
        if (iOrdinal == 0) {
            Object obj = this.d;
            aixr aixrVar = aixr.TRIGGER_TYPE_SLOT_ID_SCHEDULED;
            return new smy(((xsc) obj).Z(aixrVar), aixrVar, false, str);
        }
        if (iOrdinal == 1) {
            return slk.c(((xsc) this.d).Z(aixr.TRIGGER_TYPE_MEDIA_TIME_RANGE), str2, snhVar, false);
        }
        if (iOrdinal == 2) {
            Object obj2 = this.d;
            aixr aixrVar2 = aixr.TRIGGER_TYPE_CONTENT_VIDEO_ID_ENDED;
            return new skb(((xsc) obj2).Z(aixrVar2), aixrVar2, false, str2, false);
        }
        if (iOrdinal != 3) {
            throw new RuntimeException(null, null);
        }
        Object obj3 = this.d;
        aixr aixrVar3 = aixr.TRIGGER_TYPE_DURATION_AFTER_MEDIA_PAUSED;
        return new skf(((xsc) obj3).Z(aixrVar3), aixrVar3, str2, agpi.a, false);
    }

    private static final smy as(aivt aivtVar) {
        aizs aizsVar = aivtVar.f;
        if (aizsVar == null) {
            aizsVar = aizs.a;
        }
        String str = aizsVar.d;
        aizs aizsVar2 = (aizs) aivtVar.g.get(0);
        return new smy(str, aixr.TRIGGER_TYPE_SLOT_ID_SCHEDULED, false, (aizsVar2.b == 12 ? (aqaq) aizsVar2.c : aqaq.a).b);
    }

    public static aaok b(aodw aodwVar) {
        if (aodwVar == null || (aodwVar.b & 1) == 0) {
            return null;
        }
        aodv aodvVar = aodwVar.c;
        if (aodvVar == null) {
            aodvVar = aodv.a;
        }
        aqmh aqmhVar = aodvVar.d;
        if (aqmhVar == null) {
            aqmhVar = aqmh.a;
        }
        return c(aodwVar, new abuz(aqmhVar));
    }

    public static aaok c(aodw aodwVar, abuz abuzVar) {
        if (aodwVar == null || (aodwVar.b & 1) == 0) {
            return null;
        }
        aodv aodvVar = aodwVar.c;
        if (aodvVar == null) {
            aodvVar = aodv.a;
        }
        String str = aodvVar.c;
        String str2 = aodvVar.e;
        aodu aoduVar = aodvVar.g;
        if (aoduVar == null) {
            aoduVar = aodu.a;
        }
        String str3 = aoduVar.b;
        boolean z = aodvVar.f;
        return new aaok(str, str2, abuzVar, aodwVar);
    }

    public static void d(boolean z, zds zdsVar, ywn ywnVar) {
        zdsVar.d = z;
        ywnVar.g(zdsVar.a, 1 == zdsVar.c, z, zdsVar.b, zdsVar.e, zdsVar.f);
    }

    public static final boolean r(bp bpVar) {
        Dialog dialog;
        if ((!bpVar.isAdded() && bpVar.isRemoving()) || (dialog = bpVar.f) == null) {
            return false;
        }
        dialog.hide();
        return true;
    }

    public final boolean A() {
        return ((vxz) this.c).m(24, 45624077L);
    }

    public final boolean B() {
        return ((vxz) this.b).l(563, 45818662L, false);
    }

    public final boolean C() {
        return ((vxz) this.b).l(597, 45837443L, false);
    }

    public final boolean D() {
        return ((vxz) this.b).l(525, 45787781L, false);
    }

    public final boolean E() {
        return ((vxz) this.b).l(438, 45732553L, false);
    }

    public final boolean F() {
        return ((vxz) this.c).l(85, 45795108L, false);
    }

    public final boolean G() {
        return ((vxz) this.b).l(564, 45819273L, false);
    }

    public final boolean H() {
        return ((vxz) this.b).l(307, 45664265L, false);
    }

    public final boolean I() {
        return ((vxz) this.b).m(309, 45665058L);
    }

    public final boolean J() {
        return ((vxz) this.b).l(534, 45794321L, false);
    }

    public final boolean K() {
        return ((vxz) this.b).l(527, 45788058L, false);
    }

    public final boolean L() {
        return ((vxz) this.c).m(45, 45655666L);
    }

    public final boolean M() {
        return F() && ((vxz) this.c).l(83, 45779235L, false);
    }

    public final boolean N() {
        return ((vxz) this.b).l(577, 45826306L, false);
    }

    public final boolean O() {
        return ((vxz) this.c).l(69, 45713560L, false);
    }

    public final boolean P() {
        return ((vxz) this.b).m(113, 45415854L);
    }

    public final boolean Q() {
        return ((vxz) this.c).l(34, 45634049L, false);
    }

    public final boolean R() {
        apvx apvxVar = ((vyo) this.a).b().u;
        if (apvxVar == null) {
            apvxVar = apvx.a;
        }
        return apvxVar.b;
    }

    public final boolean S() {
        return ((vxz) this.b).l(583, 45830812L, false);
    }

    public final void T() {
        aq(sep.d, null);
    }

    public final void U(abob abobVar, String str) {
        int iOrdinal = abobVar.ordinal();
        if (iOrdinal == 4) {
            aq(sep.b, str);
        } else if (iOrdinal == 5) {
            aq(sep.c, str);
        }
    }

    public final long V(skl sklVar) {
        vyo vyoVar = (vyo) this.c;
        return (afxw.e(vyoVar).ad && afxw.e(vyoVar).ae) ? sklVar.b.a.d : ((rsi) this.a).g;
    }

    public final sdq W(String str, String str2, snh snhVar, boolean z, boolean z2, boolean z3) {
        aixr aixrVar = aixr.TRIGGER_TYPE_SLOT_ID_FULFILLED_NON_EMPTY;
        xsc xscVar = (xsc) this.d;
        agke agkeVarQ = agke.q(new smx(xscVar.Z(aixrVar), aixrVar, str));
        aixr aixrVar2 = aixr.TRIGGER_TYPE_MEDIA_TIME_RANGE;
        agke agkeVarQ2 = agke.q(new slk(xscVar.Z(aixrVar2), aixrVar2, false, str2, snhVar, true, false, z, z2, aosr.b, z3));
        aixr aixrVar3 = aixr.TRIGGER_TYPE_SLOT_ID_EXITED;
        smv smvVar = new smv(xscVar.Z(aixrVar3), aixrVar3, false, str);
        aixr aixrVar4 = aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID;
        slt sltVar = new slt(xscVar.Z(aixrVar4), aixrVar4, false, str2, true);
        aixr aixrVar5 = aixr.TRIGGER_TYPE_SLOT_ID_FULFILLED_EMPTY;
        return new sdq(agkeVarQ, agkeVarQ2, agke.s(smvVar, sltVar, new smw(xscVar.Z(aixrVar5), aixrVar5, str)));
    }

    public final smr X(alam alamVar, String str, acfw acfwVar, wjf wjfVar, skl sklVar, Optional optional, snh snhVar, ski skiVar) {
        Optional optionalOfNullable;
        Object obj = this.d;
        aixo aixoVar = aixo.SLOT_TYPE_FORECASTING;
        xsc xscVar = (xsc) obj;
        String strAa = xscVar.aa();
        agke agkeVarQ = agke.q(ar(strAa, str, sklVar, snhVar));
        aixr aixrVar = aixr.TRIGGER_TYPE_SLOT_ID_ENTERED;
        agke agkeVarQ2 = agke.q(new smu(xscVar.Z(aixrVar), aixrVar, false, strAa));
        aixr aixrVar2 = aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID;
        slt sltVar = new slt(xscVar.Z(aixrVar2), aixrVar2, false, str, false);
        aixr aixrVar3 = aixr.TRIGGER_TYPE_SLOT_ID_EXITED;
        agke agkeVarR = agke.r(sltVar, new smv(xscVar.Z(aixrVar3), aixrVar3, false, strAa));
        shh shhVarB = skiVar != null ? shh.b(new sil(skiVar), new sic(str), new sip(sklVar), new sjy(acfwVar)) : shh.b(new sim(alamVar), new sip(sklVar), new sic(str), new sid(wjfVar), new sjy(acfwVar));
        if (true == optional.isPresent()) {
            aivr aivrVar = ((wgj) optional.get()).a.j;
            if (aivrVar == null) {
                aivrVar = aivr.a;
            }
            optionalOfNullable = Optional.ofNullable(aivrVar);
        } else {
            optionalOfNullable = optional;
        }
        return smr.b(strAa, aixoVar, 1, 1, agkeVarQ, agkeVarQ2, agkeVarR, shhVarB, optionalOfNullable);
    }

    public final smr Y(skl sklVar, wjf wjfVar, acfw acfwVar, String str) {
        aixo aixoVar = aixo.SLOT_TYPE_AD_BREAK_REQUEST;
        xsc xscVar = (xsc) this.d;
        String strAa = xscVar.aa();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new sip(sklVar));
        arrayList.add(new sid(wjfVar));
        arrayList.add(new sjy(acfwVar));
        arrayList.add(new sic(str));
        aixr aixrVar = aixr.TRIGGER_TYPE_SLOT_ID_FULFILLED_NON_EMPTY;
        smx smxVar = new smx(xscVar.Z(aixrVar), aixrVar, strAa);
        agjz agjzVar = new agjz(4);
        agjzVar.h(abnr.DEFAULT);
        agjzVar.h(abnr.FULLSCREEN);
        aixr aixrVar2 = aixr.TRIGGER_TYPE_DURATION_AFTER_MEDIA_PAUSED;
        skf skfVar = new skf(xscVar.Z(aixrVar2), aixrVar2, str, agjzVar.g(), afxw.e((vyo) this.c).aW);
        agjz agjzVar2 = new agjz(4);
        aixr aixrVar3 = aixr.TRIGGER_TYPE_SLOT_ID_EXITED;
        agjzVar2.h(new smv(xscVar.Z(aixrVar3), aixrVar3, false, strAa));
        aixr aixrVar4 = aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID;
        agjzVar2.h(new slt(xscVar.Z(aixrVar4), aixrVar4, false, str, true));
        return smr.b(strAa, aixoVar, 1, 1, agke.q(smxVar), agke.q(skfVar), agjzVar2.g(), shh.a(arrayList), ah(sklVar));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019f  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:106:0x01af  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:108:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:111:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:114:0x01db  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:126:0x020d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0221  */
    /* JADX WARN: Code duplicated, block: B:132:0x0239  */
    /* JADX WARN: Code duplicated, block: B:134:0x024b  */
    /* JADX WARN: Code duplicated, block: B:137:0x0253  */
    /* JADX WARN: Code duplicated, block: B:139:0x0259  */
    /* JADX WARN: Code duplicated, block: B:142:0x0263  */
    /* JADX WARN: Code duplicated, block: B:146:0x0271  */
    /* JADX WARN: Code duplicated, block: B:151:0x0289  */
    /* JADX WARN: Code duplicated, block: B:153:0x0293  */
    /* JADX WARN: Code duplicated, block: B:157:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:158:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:161:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:162:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:165:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:166:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:169:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:172:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:173:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:176:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:177:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:180:0x0300  */
    /* JADX WARN: Code duplicated, block: B:183:0x0306  */
    /* JADX WARN: Code duplicated, block: B:186:0x030c  */
    /* JADX WARN: Code duplicated, block: B:187:0x030f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0321  */
    /* JADX WARN: Code duplicated, block: B:193:0x0327  */
    /* JADX WARN: Code duplicated, block: B:68:0x011c  */
    /* JADX WARN: Code duplicated, block: B:95:0x018d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0198  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [agjz] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [agjz] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v4, types: [j$.util.Optional] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final smr Z(aivt aivtVar, String str, wjf wjfVar, acfw acfwVar, Optional optional, Optional optional2, Optional optional3, Optional optional4, aqi aqiVar) {
        ?? r7;
        ?? r12;
        Object obj;
        Object slkVar;
        smr smrVar;
        ?? r13;
        ?? r8;
        ?? r3;
        List arrayList;
        aivs aivsVar;
        int iBf;
        int i;
        Optional optionalOf;
        aivu aivuVar;
        apji apjiVar;
        aopn aopnVar;
        aivs aivsVar2;
        aivs aivsVar3;
        aivs aivsVar4;
        aixo aixoVarA;
        agke agkeVarQ;
        aivs aivsVar5;
        aivr aivrVar;
        Object obj2;
        boolean zV;
        boolean zP;
        boolean z;
        boolean z2;
        boolean z3;
        aigj aigjVarC;
        aoqd aoqdVar;
        akjl akjlVar;
        akjl akjlVar2;
        akjm akjmVarA;
        Object obj3;
        Object obj4;
        snk snkVarAb;
        int i2;
        boolean zAh;
        Object obj5;
        Object obj6;
        String str2;
        Object obj7;
        ?? r9;
        agke agkeVarC = agpi.a;
        Object agjzVar = new agjz(4);
        try {
            aizs aizsVar = aivtVar.f;
            if (aizsVar == null) {
                aizsVar = aizs.a;
            }
            ?? r10 = 17;
            r10 = 17;
            try {
                try {
                    try {
                        if (aizsVar.b == 17) {
                            try {
                                if (optional2.isEmpty()) {
                                    aivs aivsVar6 = aivtVar.c;
                                    if (aivsVar6 == null) {
                                        aivsVar6 = aivs.a;
                                    }
                                    int iBf2 = a.bf(aivsVar6.g);
                                    if (iBf2 == 0 || iBf2 != 2) {
                                        String str3 = str;
                                        obj4 = agjzVar;
                                        Optional optional5 = optional2;
                                        snkVarAb = ab(optional5, str3, wjfVar, aivtVar);
                                        obj5 = optional5;
                                        r9 = str3;
                                    } else {
                                        Optional optionalOf2 = Optional.of(Long.valueOf(acfwVar.a()));
                                        Object obj8 = this.c;
                                        if (taq.aq((vyo) obj8)) {
                                            slm slmVar = slm.PRE_ROLL;
                                            int iOrdinal = (optional4.isEmpty() ? abnr.REMOTE : (abnr) optional4.get()).ordinal();
                                            if (iOrdinal != 0) {
                                                i2 = iOrdinal != 2 ? -1 : 2;
                                            } else {
                                                i2 = 0;
                                            }
                                            zAh = taq.ah((vyo) obj8, i2);
                                        } else {
                                            zAh = false;
                                        }
                                        if (zAh) {
                                            long millis = Duration.ofSeconds(wjfVar.a()).toMillis();
                                            aizs aizsVar2 = aivtVar.f;
                                            if (aizsVar2 == null) {
                                                aizsVar2 = aizs.a;
                                            }
                                            long j = (aizsVar2.b == 17 ? (anfh) aizsVar2.c : anfh.a).c;
                                            optionalOf2.isPresent();
                                            try {
                                                snh snhVar = (snh) aj(j + ((Long) optionalOf2.get()).longValue(), wjfVar, millis).orElseThrow(new ieu(12));
                                                long j2 = snhVar.a;
                                                long j3 = snhVar.b;
                                                try {
                                                    if (j2 > j3) {
                                                        throw new sav("Invalid time range for the trigger.", 116);
                                                    }
                                                    aizs aizsVar3 = aivtVar.f;
                                                    if (aizsVar3 == null) {
                                                        aizsVar3 = aizs.a;
                                                    }
                                                    try {
                                                        String str4 = str;
                                                        obj6 = agjzVar;
                                                        slkVar = new slk(aizsVar3.d, aixr.TRIGGER_TYPE_MEDIA_TIME_RANGE, aizsVar3.f, str4, new snh(j2, j3), (aizsVar3.b == 17 ? (anfh) aizsVar3.c : anfh.a).e, false, true, true, aosr.b, false);
                                                        str2 = str4;
                                                    } catch (sav unused) {
                                                        r10 = str;
                                                        obj3 = agjzVar;
                                                        snkVarAb = as(aivtVar);
                                                        obj5 = optional2;
                                                        r9 = r10;
                                                        obj4 = obj3;
                                                        slkVar = snkVarAb;
                                                        obj = obj5;
                                                        r7 = r9;
                                                        obj7 = obj4;
                                                    }
                                                } catch (sav unused2) {
                                                }
                                            } catch (sav unused3) {
                                                r10 = str;
                                                obj3 = agjzVar;
                                            }
                                            try {
                                                snkVarAb = as(aivtVar);
                                                obj5 = optional2;
                                                r9 = r10;
                                                obj4 = obj3;
                                            } catch (sav e) {
                                                e = e;
                                                agjzVar = optional2;
                                                r12 = obj3;
                                                obj = agjzVar;
                                                r7 = r10;
                                                slkVar = null;
                                                smrVar = null;
                                                rmp.j(null, "Failed to create a client trigger. ".concat(String.valueOf(e.getMessage())));
                                                r3 = obj;
                                                r8 = r7;
                                                r13 = r12;
                                                agke agkeVar = agkeVarC;
                                                arrayList = new ArrayList();
                                                aivsVar = aivtVar.c;
                                                if (aivsVar == null) {
                                                    aivsVar = aivs.a;
                                                }
                                                iBf = a.bf(aivsVar.g);
                                                if (iBf == 0) {
                                                    iBf = 1;
                                                }
                                                slm slmVar2 = slm.PRE_ROLL;
                                                i = iBf - 1;
                                                if (i == 1) {
                                                    optionalOf = Optional.of(slm.PRE_ROLL);
                                                } else if (i == 2) {
                                                    optionalOf = Optional.of(slm.MID_ROLL);
                                                } else if (i != 3) {
                                                    rmp.j(smrVar, "Failed to parse the slot trigger event.");
                                                    optionalOf = Optional.empty();
                                                } else {
                                                    optionalOf = Optional.of(slm.POST_ROLL);
                                                }
                                                if (optionalOf.isPresent()) {
                                                    arrayList = ai(r8, acfwVar, wjfVar, (slm) optionalOf.get());
                                                }
                                                if (r3.isPresent()) {
                                                    arrayList.add(new shl((wgk) r3.get()));
                                                }
                                                aivuVar = aivtVar.e;
                                                if (aivuVar == null) {
                                                    aivuVar = aivu.a;
                                                }
                                                apjiVar = aivuVar.b;
                                                if (apjiVar == null) {
                                                    apjiVar = apji.a;
                                                }
                                                aopnVar = (aopn) aavv.s(apjiVar, aopo.a);
                                                if (aopnVar != null) {
                                                    arrayList.add(new sjf(aopnVar));
                                                }
                                                if (optional.isPresent()) {
                                                    arrayList.add(new sjk((sko) optional.get()));
                                                }
                                                if (optional3.isPresent()) {
                                                    arrayList.add(new sih((yvs) optional3.get()));
                                                }
                                                if (wjfVar.f().av()) {
                                                    arrayList.add(new siv(true));
                                                    aoqdVar = wjfVar.f().d;
                                                    akjlVar = aoqdVar.F;
                                                    if (akjlVar == null) {
                                                        akjlVar = akjl.a;
                                                    }
                                                    if ((akjlVar.b & SemanticState.Obscured) != 0) {
                                                        akjlVar2 = aoqdVar.F;
                                                        if (akjlVar2 == null) {
                                                            akjlVar2 = akjl.a;
                                                        }
                                                        akjmVarA = akjm.a(akjlVar2.g);
                                                        if (akjmVarA == null) {
                                                            akjmVarA = akjm.DAI_SKIPPABLE_TYPE_UNKNOWN;
                                                        }
                                                        arrayList.add(new sii(akjmVarA));
                                                    }
                                                }
                                                if (r3.isPresent()) {
                                                    arrayList.add(new sjp(aigjVarC));
                                                }
                                                if (aqiVar != null) {
                                                    arrayList.add(new sjg(aqiVar));
                                                }
                                                if (wjfVar != null) {
                                                    obj2 = this.c;
                                                    zV = wjfVar.V();
                                                    zP = wjfVar.P();
                                                    if (optionalOf.get() == slm.PRE_ROLL) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    if (optionalOf.get() == slm.MID_ROLL) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    if (optionalOf.get() == slm.POST_ROLL) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    if (taq.at((vyo) obj2, zV, zP, z, z2, z3, false)) {
                                                        Object obj9 = this.d;
                                                        aixr aixrVar = aixr.TRIGGER_TYPE_ON_PLAYBACK_DESTROYED;
                                                        r13.h(new slv(((xsc) obj9).Z(aixrVar), aixrVar, false, r8));
                                                    }
                                                }
                                                aivsVar2 = aivtVar.c;
                                                if (aivsVar2 == null) {
                                                    aivsVar3 = aivs.a;
                                                } else {
                                                    aivsVar3 = aivsVar2;
                                                }
                                                String str5 = aivsVar3.c;
                                                if (aivsVar2 == null) {
                                                    aivsVar4 = aivs.a;
                                                } else {
                                                    aivsVar4 = aivsVar2;
                                                }
                                                aixoVarA = aixo.a(aivsVar4.d);
                                                if (aixoVarA == null) {
                                                    aixoVarA = aixo.SLOT_TYPE_UNSPECIFIED;
                                                }
                                                aixo aixoVar = aixoVarA;
                                                if (aivsVar2 == null) {
                                                    aivsVar2 = aivs.a;
                                                }
                                                int i3 = aivsVar2.e;
                                                if (slkVar == null) {
                                                    agkeVarQ = agpi.a;
                                                } else {
                                                    agkeVarQ = agke.q(slkVar);
                                                }
                                                agke agkeVar2 = agkeVarQ;
                                                agke agkeVarG = r13.g();
                                                shh shhVarA = shh.a(arrayList);
                                                aivsVar5 = aivtVar.c;
                                                if (aivsVar5 == null) {
                                                    aivsVar5 = aivs.a;
                                                }
                                                aivrVar = aivsVar5.f;
                                                if (aivrVar == null) {
                                                    aivrVar = aivr.a;
                                                }
                                                return smr.h(str5, aixoVar, i3, agkeVar2, agkeVar, agkeVarG, shhVarA, Optional.of(aivrVar), optional);
                                            }
                                        } else {
                                            str2 = str;
                                            slkVar = as(aivtVar);
                                            obj6 = agjzVar;
                                        }
                                        obj = optional2;
                                        r7 = str2;
                                        obj7 = obj6;
                                    }
                                } else {
                                    String str6 = str;
                                    obj4 = agjzVar;
                                    Optional optional6 = optional2;
                                    snkVarAb = ab(optional6, str6, wjfVar, aivtVar);
                                    obj5 = optional6;
                                    r9 = str6;
                                }
                                agkeVarC = nrj.c(aivtVar.g, Optional.of(r7));
                                r12 = obj7;
                                r12.j(nrj.c(aivtVar.h, Optional.of(r7)));
                                smrVar = null;
                                r3 = obj;
                                r8 = r7;
                                r13 = r12;
                            } catch (sav e2) {
                                e = e2;
                                r10 = str;
                                obj3 = agjzVar;
                            }
                            agke agkeVar3 = agkeVarC;
                            arrayList = new ArrayList();
                            aivsVar = aivtVar.c;
                            if (aivsVar == null) {
                                aivsVar = aivs.a;
                            }
                            iBf = a.bf(aivsVar.g);
                            if (iBf == 0) {
                                iBf = 1;
                            }
                            slm slmVar3 = slm.PRE_ROLL;
                            i = iBf - 1;
                            if (i == 1) {
                                optionalOf = Optional.of(slm.PRE_ROLL);
                            } else if (i == 2) {
                                optionalOf = Optional.of(slm.MID_ROLL);
                            } else if (i != 3) {
                                rmp.j(smrVar, "Failed to parse the slot trigger event.");
                                optionalOf = Optional.empty();
                            } else {
                                optionalOf = Optional.of(slm.POST_ROLL);
                            }
                            if (optionalOf.isPresent()) {
                                arrayList = ai(r8, acfwVar, wjfVar, (slm) optionalOf.get());
                            }
                            if (r3.isPresent()) {
                                arrayList.add(new shl((wgk) r3.get()));
                            }
                            aivuVar = aivtVar.e;
                            if (aivuVar == null) {
                                aivuVar = aivu.a;
                            }
                            apjiVar = aivuVar.b;
                            if (apjiVar == null) {
                                apjiVar = apji.a;
                            }
                            aopnVar = (aopn) aavv.s(apjiVar, aopo.a);
                            if (aopnVar != null) {
                                arrayList.add(new sjf(aopnVar));
                            }
                            if (optional.isPresent()) {
                                arrayList.add(new sjk((sko) optional.get()));
                            }
                            if (optional3.isPresent()) {
                                arrayList.add(new sih((yvs) optional3.get()));
                            }
                            if (wjfVar.f().av()) {
                                arrayList.add(new siv(true));
                                aoqdVar = wjfVar.f().d;
                                akjlVar = aoqdVar.F;
                                if (akjlVar == null) {
                                    akjlVar = akjl.a;
                                }
                                if ((akjlVar.b & SemanticState.Obscured) != 0) {
                                    akjlVar2 = aoqdVar.F;
                                    if (akjlVar2 == null) {
                                        akjlVar2 = akjl.a;
                                    }
                                    akjmVarA = akjm.a(akjlVar2.g);
                                    if (akjmVarA == null) {
                                        akjmVarA = akjm.DAI_SKIPPABLE_TYPE_UNKNOWN;
                                    }
                                    arrayList.add(new sii(akjmVarA));
                                }
                            }
                            if (r3.isPresent() && (aigjVarC = ((wgk) r3.get()).c()) != null) {
                                arrayList.add(new sjp(aigjVarC));
                            }
                            if (aqiVar != null) {
                                arrayList.add(new sjg(aqiVar));
                            }
                            if (wjfVar != null && optionalOf.isPresent()) {
                                obj2 = this.c;
                                zV = wjfVar.V();
                                zP = wjfVar.P();
                                if (optionalOf.get() == slm.PRE_ROLL) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (optionalOf.get() == slm.MID_ROLL) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (optionalOf.get() == slm.POST_ROLL) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (taq.at((vyo) obj2, zV, zP, z, z2, z3, false)) {
                                    Object obj10 = this.d;
                                    aixr aixrVar2 = aixr.TRIGGER_TYPE_ON_PLAYBACK_DESTROYED;
                                    r13.h(new slv(((xsc) obj10).Z(aixrVar2), aixrVar2, false, r8));
                                }
                            }
                            aivsVar2 = aivtVar.c;
                            if (aivsVar2 == null) {
                                aivsVar3 = aivs.a;
                            } else {
                                aivsVar3 = aivsVar2;
                            }
                            String str7 = aivsVar3.c;
                            if (aivsVar2 == null) {
                                aivsVar4 = aivs.a;
                            } else {
                                aivsVar4 = aivsVar2;
                            }
                            aixoVarA = aixo.a(aivsVar4.d);
                            if (aixoVarA == null) {
                                aixoVarA = aixo.SLOT_TYPE_UNSPECIFIED;
                            }
                            aixo aixoVar2 = aixoVarA;
                            if (aivsVar2 == null) {
                                aivsVar2 = aivs.a;
                            }
                            int i4 = aivsVar2.e;
                            if (slkVar == null) {
                                agkeVarQ = agpi.a;
                            } else {
                                agkeVarQ = agke.q(slkVar);
                            }
                            agke agkeVar4 = agkeVarQ;
                            agke agkeVarG2 = r13.g();
                            shh shhVarA2 = shh.a(arrayList);
                            aivsVar5 = aivtVar.c;
                            if (aivsVar5 == null) {
                                aivsVar5 = aivs.a;
                            }
                            aivrVar = aivsVar5.f;
                            if (aivrVar == null) {
                                aivrVar = aivr.a;
                            }
                            return smr.h(str7, aixoVar2, i4, agkeVar4, agkeVar3, agkeVarG2, shhVarA2, Optional.of(aivrVar), optional);
                        }
                        String str8 = str;
                        obj4 = agjzVar;
                        obj5 = optional2;
                        aizs aizsVar4 = aivtVar.f;
                        if (aizsVar4 == null) {
                            aizsVar4 = aizs.a;
                        }
                        snkVarAb = nrj.b(aizsVar4, Optional.of(str8));
                        r9 = str8;
                        r12.j(nrj.c(aivtVar.h, Optional.of(r7)));
                        smrVar = null;
                        r3 = obj;
                        r8 = r7;
                        r13 = r12;
                    } catch (sav e3) {
                        e = e3;
                        smrVar = null;
                        rmp.j(null, "Failed to create a client trigger. ".concat(String.valueOf(e.getMessage())));
                        r3 = obj;
                        r8 = r7;
                        r13 = r12;
                    }
                    agkeVarC = nrj.c(aivtVar.g, Optional.of(r7));
                    r12 = obj7;
                } catch (sav e4) {
                    e = e4;
                    r12 = obj7;
                }
                slkVar = snkVarAb;
                obj = obj5;
                r7 = r9;
                obj7 = obj4;
            } catch (sav e5) {
                e = e5;
            }
        } catch (sav e6) {
            e = e6;
            r7 = str;
            r12 = agjzVar;
            obj = optional2;
        }
        agke agkeVar5 = agkeVarC;
        arrayList = new ArrayList();
        aivsVar = aivtVar.c;
        if (aivsVar == null) {
            aivsVar = aivs.a;
        }
        iBf = a.bf(aivsVar.g);
        if (iBf == 0) {
            iBf = 1;
        }
        slm slmVar4 = slm.PRE_ROLL;
        i = iBf - 1;
        if (i == 1) {
            optionalOf = Optional.of(slm.PRE_ROLL);
        } else if (i == 2) {
            optionalOf = Optional.of(slm.MID_ROLL);
        } else if (i != 3) {
            rmp.j(smrVar, "Failed to parse the slot trigger event.");
            optionalOf = Optional.empty();
        } else {
            optionalOf = Optional.of(slm.POST_ROLL);
        }
        if (optionalOf.isPresent()) {
            arrayList = ai(r8, acfwVar, wjfVar, (slm) optionalOf.get());
        }
        if (r3.isPresent()) {
            arrayList.add(new shl((wgk) r3.get()));
        }
        aivuVar = aivtVar.e;
        if (aivuVar == null) {
            aivuVar = aivu.a;
        }
        apjiVar = aivuVar.b;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aopnVar = (aopn) aavv.s(apjiVar, aopo.a);
        if (aopnVar != null) {
            arrayList.add(new sjf(aopnVar));
        }
        if (optional.isPresent()) {
            arrayList.add(new sjk((sko) optional.get()));
        }
        if (optional3.isPresent()) {
            arrayList.add(new sih((yvs) optional3.get()));
        }
        if (wjfVar.f().av()) {
            arrayList.add(new siv(true));
            aoqdVar = wjfVar.f().d;
            akjlVar = aoqdVar.F;
            if (akjlVar == null) {
                akjlVar = akjl.a;
            }
            if ((akjlVar.b & SemanticState.Obscured) != 0) {
                akjlVar2 = aoqdVar.F;
                if (akjlVar2 == null) {
                    akjlVar2 = akjl.a;
                }
                akjmVarA = akjm.a(akjlVar2.g);
                if (akjmVarA == null) {
                    akjmVarA = akjm.DAI_SKIPPABLE_TYPE_UNKNOWN;
                }
                arrayList.add(new sii(akjmVarA));
            }
        }
        if (r3.isPresent()) {
            arrayList.add(new sjp(aigjVarC));
        }
        if (aqiVar != null) {
            arrayList.add(new sjg(aqiVar));
        }
        if (wjfVar != null) {
            obj2 = this.c;
            zV = wjfVar.V();
            zP = wjfVar.P();
            if (optionalOf.get() == slm.PRE_ROLL) {
                z = true;
            } else {
                z = false;
            }
            if (optionalOf.get() == slm.MID_ROLL) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (optionalOf.get() == slm.POST_ROLL) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (taq.at((vyo) obj2, zV, zP, z, z2, z3, false)) {
                Object obj11 = this.d;
                aixr aixrVar3 = aixr.TRIGGER_TYPE_ON_PLAYBACK_DESTROYED;
                r13.h(new slv(((xsc) obj11).Z(aixrVar3), aixrVar3, false, r8));
            }
        }
        aivsVar2 = aivtVar.c;
        if (aivsVar2 == null) {
            aivsVar3 = aivs.a;
        } else {
            aivsVar3 = aivsVar2;
        }
        String str9 = aivsVar3.c;
        if (aivsVar2 == null) {
            aivsVar4 = aivs.a;
        } else {
            aivsVar4 = aivsVar2;
        }
        aixoVarA = aixo.a(aivsVar4.d);
        if (aixoVarA == null) {
            aixoVarA = aixo.SLOT_TYPE_UNSPECIFIED;
        }
        aixo aixoVar3 = aixoVarA;
        if (aivsVar2 == null) {
            aivsVar2 = aivs.a;
        }
        int i5 = aivsVar2.e;
        if (slkVar == null) {
            agkeVarQ = agpi.a;
        } else {
            agkeVarQ = agke.q(slkVar);
        }
        agke agkeVar6 = agkeVarQ;
        agke agkeVarG3 = r13.g();
        shh shhVarA3 = shh.a(arrayList);
        aivsVar5 = aivtVar.c;
        if (aivsVar5 == null) {
            aivsVar5 = aivs.a;
        }
        aivrVar = aivsVar5.f;
        if (aivrVar == null) {
            aivrVar = aivr.a;
        }
        return smr.h(str9, aixoVar3, i5, agkeVar6, agkeVar5, agkeVarG3, shhVarA3, Optional.of(aivrVar), optional);
    }

    public final Optional a() {
        Bundle bundle = ((Notification) this.c).extras;
        return !bundle.containsKey("EXTRA_ALL_IMAGES_LOADED") ? Optional.empty() : Optional.of(Boolean.valueOf(bundle.getBoolean("EXTRA_ALL_IMAGES_LOADED")));
    }

    public final smr aa(String str, long j, long j2, smr smrVar) {
        snh snhVar = new snh(j, j2);
        Object obj = this.d;
        aixo aixoVar = aixo.SLOT_TYPE_AD_BREAK_REQUEST;
        String strAa = ((xsc) obj).aa();
        sdq sdqVarW = W(strAa, str, snhVar, ad(), ae(), true);
        shh shhVarB = shh.b(new siz());
        return smr.b(strAa, aixoVar, smrVar.a(), smrVar.c, sdqVarW.a, sdqVarW.b, sdqVarW.c, afxw.e((vyo) this.c).bu ? shh.c(smrVar.g, shhVarB) : smrVar.g, smrVar.h);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00d3  */
    public final snk ab(Optional optional, String str, wjf wjfVar, aivt aivtVar) throws sav {
        long j;
        long j2;
        long j3;
        int i;
        anfh anfhVar;
        boolean zAr = taq.ar((vyo) this.c);
        if (optional.isEmpty() && !zAr) {
            throw new sav("Empty ad break response for building the media time range trigger.", 116);
        }
        long millis = Duration.ofSeconds(wjfVar.a()).toMillis();
        aisu aisuVarD = (zAr && optional.isEmpty()) ? null : ((wgk) optional.get()).d();
        if (aisuVarD != null) {
            j = aisuVarD.c;
        } else {
            aizs aizsVar = aivtVar.f;
            if (aizsVar == null) {
                aizsVar = aizs.a;
            }
            if (aizsVar.b != 17) {
                throw new sav("Unable to get the offset start time range for constructing the trigger.", 116);
            }
            aizs aizsVar2 = aivtVar.f;
            if (aizsVar2 == null) {
                aizsVar2 = aizs.a;
            }
            j = (aizsVar2.b == 17 ? (anfh) aizsVar2.c : anfh.a).c;
        }
        snh snhVar = (snh) aj(j, wjfVar, millis).orElseThrow(new ieu(11));
        aizs aizsVar3 = aivtVar.f;
        if (aizsVar3 == null) {
            aizsVar3 = aizs.a;
        }
        if (((aizsVar3.b == 17 ? (anfh) aizsVar3.c : anfh.a).b & 1) != 0) {
            j2 = (aizsVar3.b == 17 ? (anfh) aizsVar3.c : anfh.a).c;
        } else {
            j2 = snhVar.a;
        }
        int i2 = aizsVar3.b;
        if (((i2 == 17 ? (anfh) aizsVar3.c : anfh.a).b & 2) == 0) {
            j3 = snhVar.b;
        } else {
            if (i2 == 17) {
                anfhVar = (anfh) aizsVar3.c;
                i = 17;
            } else {
                i = i2;
                anfhVar = anfh.a;
            }
            if (anfhVar.d != -1) {
                j3 = (i == 17 ? (anfh) aizsVar3.c : anfh.a).d;
            } else {
                j3 = snhVar.b;
            }
        }
        String str2 = aizsVar3.d;
        aixr aixrVar = aixr.TRIGGER_TYPE_MEDIA_TIME_RANGE;
        boolean z = aizsVar3.f;
        snh snhVar2 = new snh(j2, j3);
        int i3 = aizsVar3.b;
        boolean z2 = (i3 == 17 ? (anfh) aizsVar3.c : anfh.a).e;
        aosr aosrVar = (i3 == 17 ? (anfh) aizsVar3.c : anfh.a).f;
        if (aosrVar == null) {
            aosrVar = aosr.b;
        }
        return new slk(str2, aixrVar, z, str, snhVar2, z2, false, true, true, aosrVar, false);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public final j$.util.Optional ac(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r27v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public final boolean ad() {
        vyo vyoVar = (vyo) this.c;
        if (taq.aN(vyoVar)) {
            return true;
        }
        String strAb = taq.ab(vyoVar);
        return strAb.equalsIgnoreCase("landscape") || strAb.equalsIgnoreCase("both");
    }

    public final boolean ae() {
        vyo vyoVar = (vyo) this.c;
        if (taq.aN(vyoVar)) {
            return false;
        }
        String strAb = taq.ab(vyoVar);
        return strAb.equalsIgnoreCase("portrait") || strAb.equalsIgnoreCase("both");
    }

    public final smr af(String str, acfw acfwVar, skl sklVar, Optional optional, snh snhVar) {
        Object obj = this.d;
        aixo aixoVar = aixo.SLOT_TYPE_FORECASTING;
        xsc xscVar = (xsc) obj;
        String strAa = xscVar.aa();
        agke agkeVarQ = agke.q(ar(strAa, str, sklVar, snhVar));
        aixr aixrVar = aixr.TRIGGER_TYPE_SLOT_ID_ENTERED;
        agke agkeVarQ2 = agke.q(new smu(xscVar.Z(aixrVar), aixrVar, false, strAa));
        aixr aixrVar2 = aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID;
        slt sltVar = new slt(xscVar.Z(aixrVar2), aixrVar2, false, str, false);
        aixr aixrVar3 = aixr.TRIGGER_TYPE_SLOT_ID_EXITED;
        agke agkeVarR = agke.r(sltVar, new smv(xscVar.Z(aixrVar3), aixrVar3, false, strAa));
        shh shhVarB = shh.b(new sjy(acfwVar));
        optional.isPresent();
        aivr aivrVar = ((wgj) optional.get()).a.j;
        if (aivrVar == null) {
            aivrVar = aivr.a;
        }
        smr smrVarB = smr.b(strAa, aixoVar, 1, 1, agkeVarQ, agkeVarQ2, agkeVarR, shhVarB, Optional.ofNullable(aivrVar));
        saa saaVar = new saa(smrVarB, 8);
        optional.isPresent();
        Object obj2 = optional.get();
        Object obj3 = saaVar.a;
        if ((((wgj) obj2).a.b & SemanticState.Obscured) == 0) {
            rmp.k((smr) obj3, "Forecasting SASDE not found and no raw ei due to non-existent forecastAd");
        }
        return smrVarB;
    }

    public final xsc am(apsr apsrVar, uzj uzjVar, qvk qvkVar) {
        aihf aihfVarCreateBuilder = aufd.a.createBuilder();
        long andIncrement = ((AtomicLong) this.a).getAndIncrement();
        aihfVarCreateBuilder.copyOnWrite();
        aufd aufdVar = (aufd) aihfVarCreateBuilder.instance;
        aufdVar.b |= 4;
        aufdVar.i = andIncrement;
        aihfVarCreateBuilder.copyOnWrite();
        aufd aufdVar2 = (aufd) aihfVarCreateBuilder.instance;
        apsrVar.getClass();
        aufdVar2.g = apsrVar;
        aufdVar2.b |= 1;
        aldh aldhVar = aldh.XENO_EFFECT_RENDERING_LAYER_COLOR_CORRECTION;
        arlj arljVarFB = yno.fB(uzjVar);
        if ((arljVarFB != null && yno.fz(arljVarFB) == aldhVar) || !((aaok) this.c).O()) {
            aihf aihfVarCreateBuilder2 = aufe.a.createBuilder();
            atte atteVar = uzjVar.d;
            aihfVarCreateBuilder2.copyOnWrite();
            aufe aufeVar = (aufe) aihfVarCreateBuilder2.instance;
            atteVar.getClass();
            aufeVar.c = atteVar;
            aufeVar.b |= 1;
            ajhv ajhvVar = uzjVar.c;
            if (ajhvVar == null) {
                ajhvVar = ajhv.a;
                ajhvVar.getClass();
            }
            aihfVarCreateBuilder2.copyOnWrite();
            aufe aufeVar2 = (aufe) aihfVarCreateBuilder2.instance;
            ajhvVar.getClass();
            aufeVar2.d = ajhvVar;
            aufeVar2.b |= 2;
            aihfVarCreateBuilder.copyOnWrite();
            aufd aufdVar3 = (aufd) aihfVarCreateBuilder.instance;
            aufe aufeVar3 = (aufe) aihfVarCreateBuilder2.build();
            aufeVar3.getClass();
            aufdVar3.d = aufeVar3;
            aufdVar3.c = 2;
        }
        String str = (apsrVar.b == 4 ? (apse) apsrVar.c : apse.a).c;
        str.getClass();
        return new xsc(aihfVarCreateBuilder, str, qvkVar);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, zvl] */
    public final ury an(xsc xscVar) {
        String str = (String) xscVar.b;
        ajfz ajfzVarL = ((vat) this.d).l(str);
        Object obj = xscVar.c;
        if (ajfzVarL != null) {
            aihf aihfVarCreateBuilder = auff.a.createBuilder();
            aihh aihhVar = (aihh) ajwo.a.createBuilder();
            aihhVar.e(ajfz.b, ajfzVarL);
            aihfVarCreateBuilder.copyOnWrite();
            auff auffVar = (auff) aihfVarCreateBuilder.instance;
            ajwo ajwoVar = (ajwo) aihhVar.build();
            ajwoVar.getClass();
            auffVar.c = ajwoVar;
            auffVar.b |= 1;
            aihf aihfVar = (aihf) obj;
            aihfVar.copyOnWrite();
            aufd aufdVar = (aufd) aihfVar.instance;
            auff auffVar2 = (auff) aihfVarCreateBuilder.build();
            aufd aufdVar2 = aufd.a;
            auffVar2.getClass();
            aufdVar.f = auffVar2;
            aufdVar.e = 1000;
        } else {
            ?? r4 = this.b;
            zvj zvjVarA = zvk.a();
            zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
            zvjVarA.j = 40;
            zvjVarA.d("[ShortsCreation][Android][Edit] Updating MediaComposition effect without the selection command for asset ID: ".concat(str));
            r4.a(zvjVarA.a());
        }
        return new ury((aufd) ((aihf) obj).build(), (qvc) xscVar.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [awmd, java.lang.Object] */
    public final yvf e(aaqc aaqcVar) {
        Context context = (Context) this.b.io();
        context.getClass();
        ((zgy) this.a.io()).getClass();
        ((zjr) this.c.io()).getClass();
        aaqcVar.getClass();
        return new yvf(context, this.d, aaqcVar);
    }

    public final tnm f(alup alupVar) throws IOException {
        int i = alupVar.b;
        int iE = CommonApis.e(i);
        if (iE != 0 && iE == 2) {
            int i2 = alupVar.c;
            if (i2 == 200) {
                return new tnm(200, alupVar.e.G(), false, (List) ao(alupVar));
            }
            IOException iOException = new IOException(a.bR(i2, "Non-200 Apiary response: "));
            ((ytf) this.d).e("response.badstatus", iOException);
            throw iOException;
        }
        int iE2 = CommonApis.e(i);
        if (iE2 == 0) {
            iE2 = 1;
        }
        StringBuilder sb = new StringBuilder("Non-OK Onesie proxy status received: ");
        sb.append(iE2 - 1);
        IOException iOException2 = new IOException(sb.toString());
        ((ytf) this.d).e("response.badproxystatus", iOException2);
        throw iOException2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r2v4, types: [awmd, java.lang.Object] */
    public final yqq g(ByteBuffer byteBuffer) {
        yqq yqaVar;
        try {
            aigm aigmVarT = aigm.T(agke.q(byteBuffer));
            Object obj = this.a;
            alup alupVar = alup.a;
            alupVar.getClass();
            Object objF = alupVar.getParserForType().f(aigmVarT, ExtensionRegistryLite.getGeneratedRegistry());
            ((dov) ((wjr) obj).b.io()).V(((wjr) obj).a.e(), albe.a);
            alup alupVar2 = (alup) objF;
            if (alupVar2 == null) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid OnesieInnertubeResponse");
                ((ytf) this.d).e("response.parse", illegalArgumentException);
                yqaVar = new yqb(illegalArgumentException);
            } else {
                yqaVar = new yqa(alupVar2);
            }
            return yqaVar;
        } catch (aiik e) {
            ((ytf) this.d).e("response.parse", e);
            return new yqb(e);
        }
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, yqh] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, zjd] */
    public final ListenableFuture h(alup alupVar) {
        int iE = CommonApis.e(alupVar.b);
        if (iE == 0 || iE != 2) {
            zhq zhqVar = zhq.ABR;
            int iE2 = CommonApis.e(alupVar.b);
            if (iE2 == 0) {
                iE2 = 1;
            }
            StringBuilder sb = new StringBuilder("Non-OK Onesie proxy status received: ");
            sb.append(iE2 - 1);
            IOException iOException = new IOException(sb.toString());
            ((ytf) this.d).e("response.badproxystatus", iOException);
            return ahng.m(iOException);
        }
        if (alupVar.c == 200) {
            tnm tnmVar = new tnm(200, alupVar.e.G(), false, (List) ao(alupVar));
            this.b.N();
            return afxd.f(this.c.d(MoreExecutors.directExecutor(), tnmVar)).h(new uzh(this, 19), MoreExecutors.directExecutor());
        }
        zhq zhqVar2 = zhq.ABR;
        IOException iOException2 = new IOException("Non-200 Apiary response: " + alupVar.c);
        ((ytf) this.d).e("response.badstatus", iOException2);
        return ahng.m(iOException2);
    }

    public final void i(xgz xgzVar, xgz xgzVar2) {
        Object obj = this.b;
        xgt xgtVar = (xgt) this.c;
        ((xgo) this.a).h(xgtVar, xgzVar.c(), xgzVar2.c(), (xie) obj);
    }

    public final void j(xgz xgzVar, amdd amddVar) {
        Optional optionalOfNullable = Optional.ofNullable(null);
        Optional optionalEmpty = Optional.empty();
        xie xieVar = (xie) this.b;
        ((xhp) this.d).a(xgzVar, optionalOfNullable, optionalEmpty, amddVar, (xgt) this.c, xieVar);
    }

    public final void k(xgz xgzVar, amdd amddVar) {
        Object obj = this.b;
        xgt xgtVar = (xgt) this.c;
        ((xhp) this.d).b(xgzVar, Optional.ofNullable(null), amddVar, xgtVar, (xie) obj);
    }

    public final void l(ameb amebVar, xgz xgzVar) {
        ((xgo) this.a).j((xgt) this.c, amebVar, xgzVar.c(), null, (xie) this.b);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final synchronized void m() {
        this.d.clear();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Queue] */
    public final synchronized void n(amej amejVar) {
        amer amerVarDu = yno.du(amejVar);
        amep amepVar = amerVarDu.f;
        if (amepVar == null) {
            amepVar = amep.a;
        }
        String str = yno.dx(amepVar) ? "_queue_id_above_chat_placement" : amerVarDu.i;
        ?? r1 = this.d;
        if (!r1.containsKey(str)) {
            if (r1.size() >= 10) {
                Collection.EL.removeIf(r1.entrySet(), new xdn(1));
            }
            r1.put(str, new zs((short[]) null));
        }
        zs zsVar = (zs) r1.get(str);
        if (zsVar != null) {
            zsVar.a.add(new xdm(zsVar, amejVar, this.b.b()));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void o(String str) {
        Iterable$EL.forEach(this.d.values(), new vnm(str, 9));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final synchronized boolean p() {
        ?? r0 = this.d;
        if (r0.isEmpty()) {
            return true;
        }
        return Collection.EL.stream(r0.values()).allMatch(new xdn(0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.List] */
    public final synchronized Optional q(xdh xdhVar) {
        Object obj;
        Optional optionalMin;
        xdm xdmVar;
        zs zsVar;
        java.util.Collection collectionValues = this.d.values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (true) {
            obj = this.c;
            int i = 1;
            if (!it.hasNext()) {
                break;
            }
            Optional optionalMin2 = Collection.EL.stream(((zs) it.next()).a).filter(new xdo(xdhVar, i)).min(((elq) obj).a);
            xdd xddVar = new xdd(arrayList, 2);
            if (true == optionalMin2.isPresent()) {
                xddVar.a.add((xdm) optionalMin2.get());
            }
        }
        optionalMin = Collection.EL.stream(arrayList).min(((elq) obj).a);
        if (true == optionalMin.isPresent() && (zsVar = (xdmVar = (xdm) optionalMin.get()).e) != null) {
            zsVar.a.remove(xdmVar);
            xdmVar.e = null;
        }
        if (true == optionalMin.isPresent()) {
            optionalMin = Optional.ofNullable(((xdm) optionalMin.get()).a);
        }
        return optionalMin;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.Collection] */
    public final void s(woo wooVar, wfy wfyVar) {
        Optional optionalEmpty;
        Object obj = this.a;
        synchronized (obj) {
            try {
                Object obj2 = this.c;
                ((Optional) obj2).isPresent();
                if (((Boolean) ((Optional) obj2).orElse(Boolean.FALSE)).booleanValue()) {
                    String str = wooVar.a;
                    String str2 = wooVar.i;
                    synchronized (obj) {
                        try {
                            if (!str.equals("")) {
                                optionalEmpty = Optional.of(str);
                            } else if (!str2.equals("")) {
                                Iterator it = ap().entrySet().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        optionalEmpty = Optional.empty();
                                        break;
                                    }
                                    Map.Entry entry = (Map.Entry) it.next();
                                    if (((Set) entry.getValue()).contains(str2)) {
                                        optionalEmpty = Optional.of((String) entry.getKey());
                                        break;
                                    }
                                }
                            } else {
                                optionalEmpty = Optional.empty();
                            }
                            if (optionalEmpty.isEmpty()) {
                                return;
                            }
                            Set set = (Set) j$.util.Map.EL.computeIfAbsent(ap(), optionalEmpty.get(), new vmw(13));
                            HashSet hashSet = new HashSet();
                            agqr it2 = ((agkz) Collection.EL.stream(((zs) this.b).a).flatMap(new woi(wfyVar, 0)).collect(aghu.b)).iterator();
                            while (it2.hasNext()) {
                                apos aposVar = (apos) it2.next();
                                int i = aposVar.b;
                                if ((i & 4) != 0) {
                                    apho aphoVar = aposVar.e;
                                    if (aphoVar == null) {
                                        aphoVar = apho.a;
                                    }
                                    hashSet.add(aphoVar.d);
                                } else if ((i & 1) != 0) {
                                    aobx aobxVar = aposVar.c;
                                    if (aobxVar == null) {
                                        aobxVar = aobx.a;
                                    }
                                    hashSet.add(aobxVar.e);
                                }
                            }
                            set.addAll(hashSet);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture t(ajgq ajgqVar, Map map, int i, boolean z) {
        if (!((tfq) this.c).i() && !((vwd) this.d).c()) {
            aihf aihfVarCreateBuilder = ajgu.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            ajgu ajguVar = (ajgu) aihfVarCreateBuilder.instance;
            ajguVar.g = 10;
            ajguVar.b |= 16;
            return ahng.n((ajgu) aihfVarCreateBuilder.build());
        }
        vwd vwdVar = (vwd) this.d;
        mbc mbcVar = vwdVar.c;
        int i2 = vwdVar.i;
        if (mbcVar.f().toEpochMilli() > vwdVar.g && (i2 == 4 || i2 == 3 || i2 == 2 || i2 == 7)) {
            if (z) {
                return ahno.as(vwdVar.a(), afwl.d(new vwa(this, ajgqVar, map, i, 0)), this.b);
            }
            vwdVar.a();
        }
        return u(ajgqVar, map, i);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture u(ajgq ajgqVar, Map map, int i) {
        aihf aihfVarCreateBuilder = ajgu.a.createBuilder();
        vwd vwdVar = (vwd) this.d;
        String str = vwdVar.f;
        int i2 = vwdVar.i;
        if (!str.isEmpty()) {
            aihfVarCreateBuilder.copyOnWrite();
            ajgu ajguVar = (ajgu) aihfVarCreateBuilder.instance;
            str.getClass();
            ajguVar.b |= 1;
            ajguVar.e = str;
        }
        if (i2 != 3) {
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 == 0 || i3 == 1) {
                aihfVarCreateBuilder.copyOnWrite();
                ajgu ajguVar2 = (ajgu) aihfVarCreateBuilder.instance;
                ajguVar2.g = 8;
                ajguVar2.b |= 16;
            } else if (i3 == 3) {
                aihfVarCreateBuilder.copyOnWrite();
                ajgu ajguVar3 = (ajgu) aihfVarCreateBuilder.instance;
                ajguVar3.g = 7;
                ajguVar3.b |= 16;
            } else if (i3 == 4) {
                aihfVarCreateBuilder.copyOnWrite();
                ajgu ajguVar4 = (ajgu) aihfVarCreateBuilder.instance;
                ajguVar4.g = 5;
                ajguVar4.b |= 16;
            } else if (i3 == 6) {
                aihfVarCreateBuilder.copyOnWrite();
                ajgu ajguVar5 = (ajgu) aihfVarCreateBuilder.instance;
                ajguVar5.g = 6;
                ajguVar5.b |= 16;
            }
        } else {
            if (yno.eM(str)) {
                HashMap map2 = new HashMap();
                map2.put("c", str);
                map2.put("e", ajgqVar.name());
                map2.putAll(map);
                return ahng.r(afwl.j(new vvz(this, str, i, map2, aihfVarCreateBuilder, 0)), this.b);
            }
            tyt tytVarEI = yno.eI(str);
            if (yno.eN(tytVarEI, "c9a")) {
                String strB = tytVarEI.b("c9a");
                strB.getClass();
                if (strB.equals("1")) {
                    if (((vwc) this.a).a() == null) {
                        aihfVarCreateBuilder.copyOnWrite();
                        ajgu ajguVar6 = (ajgu) aihfVarCreateBuilder.instance;
                        ajguVar6.g = 12;
                        ajguVar6.b |= 16;
                        return ahng.n((ajgu) aihfVarCreateBuilder.build());
                    }
                    if (!map.containsKey("cpn")) {
                        aihfVarCreateBuilder.copyOnWrite();
                        ajgu ajguVar7 = (ajgu) aihfVarCreateBuilder.instance;
                        ajguVar7.g = 13;
                        ajguVar7.b |= 16;
                        return ahng.n((ajgu) aihfVarCreateBuilder.build());
                    }
                    String str2 = (String) map.get("cpn");
                    if (ahno.aa(str2)) {
                        aihfVarCreateBuilder.copyOnWrite();
                        ajgu ajguVar8 = (ajgu) aihfVarCreateBuilder.instance;
                        ajguVar8.g = 13;
                        ajguVar8.b |= 16;
                        return ahng.n((ajgu) aihfVarCreateBuilder.build());
                    }
                    CharSequence[] charSequenceArr = {str, str2};
                    StringBuilder sb = new StringBuilder();
                    sb.append(charSequenceArr[0]);
                    sb.append((CharSequence) ",");
                    sb.append(charSequenceArr[1]);
                    aigj aigjVarB = vwc.b(sb.toString().getBytes());
                    if (aigjVarB == null) {
                        aihfVarCreateBuilder.copyOnWrite();
                        ajgu ajguVar9 = (ajgu) aihfVarCreateBuilder.instance;
                        ajguVar9.g = 14;
                        ajguVar9.b |= 16;
                        return ahng.n((ajgu) aihfVarCreateBuilder.build());
                    }
                    List listC = vwc.c();
                    if (listC == null || listC.isEmpty()) {
                        aihfVarCreateBuilder.copyOnWrite();
                        ajgu ajguVar10 = (ajgu) aihfVarCreateBuilder.instance;
                        ajguVar10.g = 15;
                        ajguVar10.b |= 16;
                        return ahng.n((ajgu) aihfVarCreateBuilder.build());
                    }
                    aihf aihfVarCreateBuilder2 = ajgt.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    ajgt ajgtVar = (ajgt) aihfVarCreateBuilder2.instance;
                    ajgtVar.b |= 1;
                    ajgtVar.d = aigjVarB;
                    aihfVarCreateBuilder2.copyOnWrite();
                    ajgt ajgtVar2 = (ajgt) aihfVarCreateBuilder2.instance;
                    aiie aiieVar = ajgtVar2.c;
                    if (!aiieVar.c()) {
                        ajgtVar2.c = aihn.mutableCopy(aiieVar);
                    }
                    aifs.addAll(listC, ajgtVar2.c);
                    aihfVarCreateBuilder.copyOnWrite();
                    ajgu ajguVar11 = (ajgu) aihfVarCreateBuilder.instance;
                    ajgt ajgtVar3 = (ajgt) aihfVarCreateBuilder2.build();
                    ajgtVar3.getClass();
                    ajguVar11.f = ajgtVar3;
                    ajguVar11.b |= 2;
                }
            }
        }
        return ahng.n((ajgu) aihfVarCreateBuilder.build());
    }

    public final ListenableFuture v(ajgq ajgqVar, Map map) {
        return t(ajgqVar, map, (int) vwd.a.toMillis(), true);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture w(uoi uoiVar, List list, String str, String str2, String str3) {
        ListenableFuture listenableFutureE;
        list.getClass();
        str.getClass();
        str2.getClass();
        aihf aihfVarCreateBuilder = asda.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        aihf aihfVarCreateBuilder2 = apgv.a.createBuilder();
        aihfVarCreateBuilder2.getClass();
        ahub ahubVar = new ahub(aihfVarCreateBuilder2);
        uoiVar.c(ahubVar);
        aihf aihfVarCreateBuilder3 = apgt.a.createBuilder();
        aihfVarCreateBuilder3.getClass();
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((apgt) aihfVarCreateBuilder3.instance).b);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
        aihfVarCreateBuilder3.copyOnWrite();
        apgt apgtVar = (apgt) aihfVarCreateBuilder3.instance;
        aiie aiieVar = apgtVar.b;
        if (!aiieVar.c()) {
            apgtVar.b = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(list, apgtVar.b);
        aihn aihnVarBuild = aihfVarCreateBuilder3.build();
        aihnVarBuild.getClass();
        aihf aihfVar = (aihf) ahubVar.a;
        aihfVar.copyOnWrite();
        apgv apgvVar = (apgv) aihfVar.instance;
        apgvVar.f = (apgt) aihnVarBuild;
        apgvVar.b |= 1;
        List listUnmodifiableList2 = DesugarCollections.unmodifiableList(apgvVar.e);
        listUnmodifiableList2.getClass();
        new aikl(listUnmodifiableList2);
        aihf aihfVarCreateBuilder4 = apgo.a.createBuilder();
        aihfVarCreateBuilder4.getClass();
        aihf aihfVarCreateBuilder5 = akhb.a.createBuilder();
        aihfVarCreateBuilder5.getClass();
        aihfVarCreateBuilder5.copyOnWrite();
        akhb akhbVar = (akhb) aihfVarCreateBuilder5.instance;
        akhbVar.b = 8;
        akhbVar.c = str;
        aihn aihnVarBuild2 = aihfVarCreateBuilder5.build();
        aihnVarBuild2.getClass();
        aihfVarCreateBuilder4.copyOnWrite();
        apgo apgoVar = (apgo) aihfVarCreateBuilder4.instance;
        apgoVar.c = (akhb) aihnVarBuild2;
        apgoVar.b |= 1;
        aihn aihnVarBuild3 = aihfVarCreateBuilder4.build();
        aihnVarBuild3.getClass();
        apgo apgoVar2 = (apgo) aihnVarBuild3;
        aihfVar.copyOnWrite();
        apgv apgvVar2 = (apgv) aihfVar.instance;
        aiie aiieVar2 = apgvVar2.e;
        if (!aiieVar2.c()) {
            apgvVar2.e = aihn.mutableCopy(aiieVar2);
        }
        apgvVar2.e.add(apgoVar2);
        if (str3 != null) {
            aihf aihfVarCreateBuilder6 = apgu.a.createBuilder();
            aihfVarCreateBuilder6.getClass();
            aihfVarCreateBuilder6.copyOnWrite();
            apgu apguVar = (apgu) aihfVarCreateBuilder6.instance;
            apguVar.b |= 1;
            apguVar.c = str3;
            aihn aihnVarBuild4 = aihfVarCreateBuilder6.build();
            aihnVarBuild4.getClass();
            aihfVar.copyOnWrite();
            apgv apgvVar3 = (apgv) aihfVar.instance;
            apgvVar3.g = (apgu) aihnVarBuild4;
            apgvVar3.b |= 4;
        }
        Object obj = this.a;
        aihn aihnVarBuild5 = aihfVar.build();
        aihnVarBuild5.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        asda asdaVar = (asda) aihfVarCreateBuilder.instance;
        asdaVar.c = (apgv) aihnVarBuild5;
        asdaVar.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        asda asdaVar2 = (asda) aihfVarCreateBuilder.instance;
        asdaVar2.b |= 4;
        asdaVar2.d = str2;
        aihn aihnVarBuild6 = aihfVarCreateBuilder.build();
        aihnVarBuild6.getClass();
        asda asdaVar3 = (asda) aihnVarBuild6;
        vcl vclVarI = ((afzc) obj).i();
        if (vclVarI != null) {
            listenableFutureE = vclVarI.b(asdaVar3);
        } else {
            asdb asdbVar = asdb.a;
            listenableFutureE = ((BaseClient) obj).e(97947547, asdaVar3, aihn.getParserForClass(asdb.class));
        }
        return ahno.ar(listenableFutureE, new rwj(new rla(str, 9), 16), this.d);
    }

    public final int x() {
        int iD = (int) ((vxz) this.b).d(17, 45714694L);
        if (iD <= 0) {
            return 180000;
        }
        return iD;
    }

    public final int y() {
        int iD = (int) ((vxz) this.b).d(13, 45645689L);
        if (iD <= 0) {
            return 60000;
        }
        return iD;
    }

    public final boolean z() {
        return ((vxz) this.b).l(599, 45838846L, false);
    }

    public aaok(Notification notification, aabr aabrVar, awmd awmdVar, vyo vyoVar) {
        this.c = notification;
        this.b = aabrVar;
        this.d = awmdVar;
        this.a = vyoVar;
    }

    public aaok(awmd awmdVar, awmd awmdVar2, mbc mbcVar, tqj tqjVar) {
        this.c = awmdVar;
        this.d = awmdVar2;
        this.b = mbcVar;
        this.a = tqjVar;
    }

    public aaok(awmd awmdVar, mbc mbcVar, abfv abfvVar, String str) {
        this.a = awmdVar;
        this.b = mbcVar;
        this.c = abfvVar;
        this.d = str;
    }

    public aaok(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.d = obj2;
        this.b = obj3;
        this.c = obj4;
    }

    public aaok(syi syiVar, vxz vxzVar, syn synVar, elr elrVar) {
        this.b = syiVar;
        this.c = vxzVar;
        this.a = synVar;
        this.d = elrVar;
    }

    public aaok(vwd vwdVar, tfq tfqVar, Executor executor) {
        this.d = vwdVar;
        this.c = tfqVar;
        this.b = executor;
        this.a = new vwc();
    }

    public aaok(vyo vyoVar, vxz vxzVar, vxz vxzVar2, vxz vxzVar3) {
        this.a = vyoVar;
        this.b = vxzVar;
        this.c = vxzVar2;
        this.d = vxzVar3;
    }

    public aaok(xgo xgoVar, xhp xhpVar, xgt xgtVar, xie xieVar) {
        this.a = xgoVar;
        this.d = xhpVar;
        this.c = xgtVar;
        this.b = xieVar;
    }

    public aaok(aaok aaokVar, vat vatVar, zvl zvlVar) {
        aaokVar.getClass();
        vatVar.getClass();
        zvlVar.getClass();
        this.a = new AtomicLong(1L);
        this.c = aaokVar;
        this.d = vatVar;
        this.b = zvlVar;
    }

    public aaok(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
        awmdVar3.getClass();
        this.d = awmdVar3;
        awmdVar4.getClass();
        this.c = awmdVar4;
    }

    public aaok(Optional optional, zwb zwbVar, zs zsVar) {
        this.a = new HashMap();
        this.c = optional;
        this.d = zwbVar;
        this.b = zsVar;
    }

    public aaok(String str, String str2, abuz abuzVar, aodw aodwVar) {
        str.getClass();
        this.b = str;
        this.d = str2;
        this.c = abuzVar;
        this.a = aodwVar;
    }

    public aaok(tce tceVar, smc smcVar, slm slmVar, wjf wjfVar) {
        this.b = tceVar;
        this.d = smcVar;
        slmVar.getClass();
        this.a = slmVar;
        wjfVar.getClass();
        this.c = wjfVar;
    }

    public aaok(Activity activity, wwb wwbVar) {
        activity.getClass();
        wwbVar.getClass();
        this.b = activity;
        this.d = wwbVar;
        this.a = new ArrayList();
        this.c = new wwe(this, 1);
    }

    public aaok(aamq aamqVar, List list, List list2, aogf aogfVar) {
        this.b = aamqVar;
        this.a = list;
        this.d = list2;
        this.c = aogfVar;
    }

    public aaok(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, byte[] bArr) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.d = awmdVar2;
        awmdVar3.getClass();
        this.a = awmdVar3;
        this.c = awmdVar4;
    }

    public aaok(ahey aheyVar, abps abpsVar, xpl xplVar, zwb zwbVar) {
        aheyVar.getClass();
        abpsVar.getClass();
        zwbVar.getClass();
        this.c = aheyVar;
        this.d = abpsVar;
        this.a = xplVar;
        this.b = zwbVar;
    }

    public aaok(ywn ywnVar, String str, String str2, long j, long j2, zev zevVar, boolean z) {
        this.c = ywnVar;
        ywk ywkVar = zevVar.b;
        this.b = ywkVar.a;
        this.d = new zds(j, z, 0, ywkVar.h, ywkVar.d.g);
        this.a = new zds(j2, z, 1, str, str2);
    }

    public aaok(ytv ytvVar, abrg abrgVar, zfs zfsVar, txp txpVar) {
        ytvVar.getClass();
        abrgVar.getClass();
        zfsVar.getClass();
        txpVar.getClass();
        this.b = ytvVar;
        this.c = abrgVar;
        this.d = zfsVar;
        this.a = txpVar;
    }

    public aaok(aaok aaokVar, aaok aaokVar2, awut awutVar) {
        awutVar.getClass();
        this.c = aaokVar;
        this.a = aaokVar2;
        this.b = awutVar;
        this.d = new ConcurrentHashMap();
    }

    public aaok(Context context, ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.a = viewGroup;
        this.c = viewGroup2;
        this.b = context;
        this.d = new ArrayList();
    }

    public aaok(mbc mbcVar, acxn acxnVar) {
        this.b = mbcVar;
        this.a = acxnVar;
        this.d = new HashMap();
        this.c = new elq(null, null, null, null);
    }

    public aaok(awmd awmdVar, mbc mbcVar, awmd awmdVar2) {
        this.a = awmdVar;
        this.b = mbcVar;
        this.d = awmdVar2;
        this.c = new ConcurrentHashMap();
    }
}
