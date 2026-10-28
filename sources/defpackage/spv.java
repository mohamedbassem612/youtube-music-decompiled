package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class spv {
    public static final /* synthetic */ int c = 0;
    private static final agkz d = agkz.q(aixn.RENDERING_EVENT_TYPE_REEL_OPPORTUNITY_ADS_RECEIVED, aixn.RENDERING_EVENT_TYPE_REEL_AD_START_TSLA);
    private static final agkz e = agkz.q(aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_RECEIVED, aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_ENTERED);
    public final oml a;
    public final vwt b;
    private final rsi f;
    private final vyo g;
    private final mbc h;
    private final xeu i;
    private final ScheduledExecutorService j;
    private final boolean l;
    private final awmd m;
    private final AtomicInteger k = new AtomicInteger(0);
    private final List n = new CopyOnWriteArrayList();

    public spv(rsi rsiVar, vyo vyoVar, mbc mbcVar, xeu xeuVar, ScheduledExecutorService scheduledExecutorService, vwt vwtVar, vxz vxzVar, oml omlVar, awmd awmdVar) {
        this.f = rsiVar;
        this.g = vyoVar;
        this.h = mbcVar;
        this.i = xeuVar;
        this.j = scheduledExecutorService;
        this.b = vwtVar;
        this.l = vxzVar.l(31, 45381560L, false);
        this.a = omlVar;
        this.m = awmdVar;
    }

    public static aixz b(int i, int i2) {
        aihf aihfVarCreateBuilder = aixz.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aixz aixzVar = (aixz) aihfVarCreateBuilder.instance;
        aixzVar.c = i - 1;
        aixzVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        aixz aixzVar2 = (aixz) aihfVarCreateBuilder.instance;
        if (i2 == 0) {
            throw null;
        }
        aixzVar2.d = i2 - 1;
        aixzVar2.b |= 2;
        return (aixz) aihfVarCreateBuilder.build();
    }

    public final void a(aizg aizgVar, skh skhVar, smr smrVar, sko skoVar) {
        Optional optionalEmpty;
        sqd sqdVar;
        sqd sqdVar2;
        aizg aizgVar2 = aizgVar;
        aixn aixnVarA = aixn.a(aizgVar2.e);
        if (aixnVarA == null) {
            aixnVarA = aixn.RENDERING_EVENT_TYPE_UNSPECIFIED;
        }
        aixn aixnVar = aixn.RENDERING_EVENT_TYPE_THROTTLED;
        if (aixnVarA != aixnVar) {
            int iOrdinal = aixnVarA.ordinal();
            if (iOrdinal != 1) {
                optionalEmpty = (iOrdinal == 5 || iOrdinal == 6) ? Optional.of(aixm.RENDERING_EVENT_TIER_PERMANENT) : Optional.of(aixm.RENDERING_EVENT_TIER_DEBUG);
            } else {
                optionalEmpty = Optional.empty();
            }
            Optional optional = optionalEmpty;
            if (optional.isEmpty()) {
                return;
            }
            Object obj = optional.get();
            aixm aixmVar = aixm.RENDERING_EVENT_TIER_DEBUG;
            if (!((aixm) obj).equals(aixmVar) || this.b.ah()) {
                aixm aixmVarA = aixm.a(aizgVar2.f);
                if (aixmVarA == null) {
                    aixmVarA = aixm.RENDERING_EVENT_TIER_UNSPECIFIED;
                }
                if (aixmVarA != optional.get()) {
                    aihf builder = aizgVar2.toBuilder();
                    Object obj2 = optional.get();
                    builder.copyOnWrite();
                    aizg aizgVar3 = (aizg) builder.instance;
                    aizgVar3.f = ((aixm) obj2).d;
                    aizgVar3.b |= 2;
                    aizgVar2 = (aizg) builder.build();
                }
                aizg aizgVar4 = aizgVar2;
                Object obj3 = optional.get();
                if (afxw.e(this.g).bH && ((aixm) obj3).equals(aixmVar) && smrVar == null && d.contains(aixnVarA)) {
                    f(aixe.ADS_CLIENT_EVENT_TYPE_RENDERING_EVENT, null, skoVar, null, null, 0, null, null, skhVar, null, aizgVar4, false);
                    return;
                }
                rsk rskVar = (rsk) this.m.io();
                if (rskVar == null || (sqdVar = (sqd) rskVar.a(smrVar, (aixm) optional.get()).a(new rmk(10)).e(sqd.a)) == (sqdVar2 = sqd.c)) {
                    return;
                }
                sqd sqdVar3 = sqd.b;
                if (sqdVar == sqdVar3) {
                    aihf builder2 = aizgVar4.toBuilder();
                    builder2.copyOnWrite();
                    aizg aizgVar5 = (aizg) builder2.instance;
                    aizgVar5.e = aixnVar.C;
                    aizgVar5.b |= 1;
                    aizgVar4 = (aizg) builder2.build();
                }
                f(aixe.ADS_CLIENT_EVENT_TYPE_RENDERING_EVENT, smrVar, skoVar, null, null, 0, null, null, skhVar, null, aizgVar4, false);
                agev agevVarA = rskVar.a(smrVar, (aixm) optional.get());
                if (agevVarA.g()) {
                    sqe sqeVar = (sqe) agevVarA.c();
                    int i = sqeVar.b + 1;
                    sqeVar.b = i;
                    int i2 = sqeVar.a;
                    if (i == i2) {
                        sqeVar.c = sqdVar3;
                    } else if (i > i2) {
                        sqeVar.c = sqdVar2;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x04e4  */
    public final aiya c(aixe aixeVar, smr smrVar, sko skoVar, sni sniVar, snl snlVar, int i, List list, smb smbVar, skh skhVar, aixz aixzVar, aizg aizgVar, boolean z, int i2) {
        int i3;
        aiua aiuaVar;
        aiyo aiyoVar;
        aihf aihfVarCreateBuilder = aiya.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aiya aiyaVar = (aiya) aihfVarCreateBuilder.instance;
        aiyaVar.c = aixeVar.Z;
        boolean z2 = true;
        aiyaVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        aiya aiyaVar2 = (aiya) aihfVarCreateBuilder.instance;
        aiyaVar2.b |= 8;
        aiyaVar2.f = i2;
        boolean zAh = this.b.ah();
        aihf aihfVarCreateBuilder2 = aixs.a.createBuilder();
        if (smrVar != null) {
            aizk aizkVarAe = vwt.ae(smrVar, z, zAh);
            aihfVarCreateBuilder2.copyOnWrite();
            aixs aixsVar = (aixs) aihfVarCreateBuilder2.instance;
            aizkVarAe.getClass();
            aixsVar.d = aizkVarAe;
            aixsVar.b |= 2;
        }
        if (skoVar != null) {
            aihf aihfVarAk = vwt.ak(skoVar.b, skoVar.c);
            if (zAh) {
                aihf aihfVarCreateBuilder3 = aiyq.a.createBuilder();
                String str = skoVar.a;
                aihfVarCreateBuilder3.copyOnWrite();
                aiyq aiyqVar = (aiyq) aihfVarCreateBuilder3.instance;
                str.getClass();
                aiyqVar.b |= 1;
                aiyqVar.c = str;
                agke agkeVar = skoVar.d;
                for (int i4 = 0; i4 < ((agpi) agkeVar).d; i4++) {
                    aihfVarCreateBuilder3.aG(vwt.af((snk) agkeVar.get(i4)));
                }
                agke agkeVar2 = skoVar.e;
                int size = agkeVar2.size();
                int i5 = 0;
                while (i5 < size) {
                    aihfVarCreateBuilder3.aG(vwt.ag((aizs) agkeVar2.get(i5)));
                    i5++;
                    agkeVar2 = agkeVar2;
                }
                agke agkeVar3 = skoVar.f;
                for (int i6 = 0; i6 < ((agpi) agkeVar3).d; i6++) {
                    aihfVarCreateBuilder3.aH(vwt.af((snk) agkeVar3.get(i6)));
                }
                agke agkeVar4 = skoVar.g;
                int size2 = agkeVar4.size();
                int i7 = 0;
                while (i7 < size2) {
                    aihfVarCreateBuilder3.aH(vwt.ag((aizs) agkeVar4.get(i7)));
                    i7++;
                    agkeVar4 = agkeVar4;
                }
                agke agkeVar5 = skoVar.h;
                for (int i8 = 0; i8 < ((agpi) agkeVar5).d; i8++) {
                    aihfVarCreateBuilder3.aF(vwt.af((snk) agkeVar5.get(i8)));
                }
                agke agkeVar6 = skoVar.i;
                int size3 = agkeVar6.size();
                int i9 = 0;
                while (i9 < size3) {
                    aihfVarCreateBuilder3.aF(vwt.ag((aizs) agkeVar6.get(i9)));
                    i9++;
                    agkeVar6 = agkeVar6;
                }
                agke agkeVar7 = skoVar.j;
                for (int i10 = 0; i10 < ((agpi) agkeVar7).d; i10++) {
                    aihfVarCreateBuilder3.aI(vwt.af((snk) agkeVar7.get(i10)));
                }
                agke agkeVar8 = skoVar.k;
                int size4 = agkeVar8.size();
                int i11 = 0;
                while (i11 < size4) {
                    aihfVarCreateBuilder3.aI(vwt.ag((aizs) agkeVar8.get(i11)));
                    i11++;
                    agkeVar8 = agkeVar8;
                }
                aiyq aiyqVar2 = (aiyq) aihfVarCreateBuilder3.build();
                aihfVarAk.copyOnWrite();
                aiyr aiyrVar = (aiyr) aihfVarAk.instance;
                aiyr aiyrVar2 = aiyr.a;
                aiyqVar2.getClass();
                aiyrVar.d = aiyqVar2;
                aiyrVar.b |= 2;
            }
            aiyr aiyrVar3 = (aiyr) aihfVarAk.build();
            aihfVarCreateBuilder2.copyOnWrite();
            aixs aixsVar2 = (aixs) aihfVarCreateBuilder2.instance;
            aiyrVar3.getClass();
            aixsVar2.e = aiyrVar3;
            aixsVar2.b |= 4;
        } else {
            zAh = zAh;
            z2 = true;
        }
        if (sniVar != null) {
            aihf aihfVarCreateBuilder4 = aizm.a.createBuilder();
            aixq aixqVar = (aixq) sdd.a.get(Integer.valueOf(sniVar.a));
            if (aixqVar == null) {
                aixqVar = aixq.TRIGGER_CATEGORY_UNSPECIFIED;
            }
            aihfVarCreateBuilder4.copyOnWrite();
            aizm aizmVar = (aizm) aihfVarCreateBuilder4.instance;
            aizmVar.f = aixqVar.k;
            aizmVar.b |= 2;
            aizm aizmVarAl = vwt.al(sniVar.b, aihfVarCreateBuilder4);
            aihfVarCreateBuilder2.copyOnWrite();
            aixs aixsVar3 = (aixs) aihfVarCreateBuilder2.instance;
            aizmVarAl.getClass();
            aixsVar3.f = aizmVarAl;
            aixsVar3.b |= 8;
        }
        if (snlVar != null) {
            aihf aihfVarCreateBuilder5 = aizm.a.createBuilder();
            aixq aixqVar2 = (aixq) sdd.a.get(Integer.valueOf(snlVar.a));
            if (aixqVar2 == null) {
                aixqVar2 = aixq.TRIGGER_CATEGORY_UNSPECIFIED;
            }
            aihfVarCreateBuilder5.copyOnWrite();
            aizm aizmVar2 = (aizm) aihfVarCreateBuilder5.instance;
            aizmVar2.f = aixqVar2.k;
            aizmVar2.b |= 2;
            aizm aizmVarAm = vwt.am(snlVar.b, aihfVarCreateBuilder5);
            aihfVarCreateBuilder2.copyOnWrite();
            aixs aixsVar4 = (aixs) aihfVarCreateBuilder2.instance;
            aizmVarAm.getClass();
            aixsVar4.f = aizmVarAm;
            aixsVar4.b |= 8;
        }
        if (i != 0) {
            aihf aihfVarCreateBuilder6 = aiyu.a.createBuilder();
            aihfVarCreateBuilder6.copyOnWrite();
            aiyu aiyuVar = (aiyu) aihfVarCreateBuilder6.instance;
            aiyuVar.d = i - 1;
            aiyuVar.b |= 2;
            if (zAh) {
                aihf aihfVarCreateBuilder7 = aiyt.a.createBuilder();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        aizk aizkVarAe2 = vwt.ae((smr) it.next(), false, z2);
                        aihfVarCreateBuilder7.copyOnWrite();
                        aiyt aiytVar = (aiyt) aihfVarCreateBuilder7.instance;
                        aizkVarAe2.getClass();
                        aiie aiieVar = aiytVar.b;
                        if (!aiieVar.c()) {
                            aiytVar.b = aihn.mutableCopy(aiieVar);
                        }
                        aiytVar.b.add(aizkVarAe2);
                        z2 = true;
                    }
                }
                aiyt aiytVar2 = (aiyt) aihfVarCreateBuilder7.build();
                aihfVarCreateBuilder6.copyOnWrite();
                aiyu aiyuVar2 = (aiyu) aihfVarCreateBuilder6.instance;
                aiytVar2.getClass();
                aiyuVar2.c = aiytVar2;
                aiyuVar2.b |= 1;
            }
            aiyu aiyuVar3 = (aiyu) aihfVarCreateBuilder6.build();
            aihfVarCreateBuilder2.copyOnWrite();
            aixs aixsVar5 = (aixs) aihfVarCreateBuilder2.instance;
            aiyuVar3.getClass();
            aixsVar5.c = aiyuVar3;
            aixsVar5.b |= 1;
        }
        if (smbVar != null) {
            aihf aihfVarCreateBuilder8 = aiyx.a.createBuilder();
            aihfVarCreateBuilder8.copyOnWrite();
            aiyx aiyxVar = (aiyx) aihfVarCreateBuilder8.instance;
            aiyxVar.c = smbVar.d - 1;
            aiyxVar.b |= 4;
            aihfVarCreateBuilder8.copyOnWrite();
            aiyx aiyxVar2 = (aiyx) aihfVarCreateBuilder8.instance;
            aiyxVar2.b |= 32;
            aiyxVar2.f = smbVar.a;
            aigj aigjVar = smbVar.b.g;
            aihfVarCreateBuilder8.copyOnWrite();
            aiyx aiyxVar3 = (aiyx) aihfVarCreateBuilder8.instance;
            aigjVar.getClass();
            aiyxVar3.b |= 8;
            aiyxVar3.d = aigjVar;
            if (zAh) {
                agev agevVar = smbVar.c;
                if (agevVar.g()) {
                    aihf aihfVarCreateBuilder9 = aiyw.a.createBuilder();
                    agke<String> agkeVar9 = ((skj) agevVar.c()).e;
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : agkeVar9) {
                        agjt agjtVar = sdd.e;
                        if (agjtVar.containsKey(str2)) {
                            arrayList.add((aixi) agjtVar.get(str2));
                        }
                    }
                    aihfVarCreateBuilder9.copyOnWrite();
                    aiyw aiywVar = (aiyw) aihfVarCreateBuilder9.instance;
                    aihv aihvVar = aiywVar.b;
                    if (!aihvVar.c()) {
                        aiywVar.b = aihn.mutableCopy(aihvVar);
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        aiywVar.b.h(((aixi) it2.next()).ac);
                    }
                    aihfVarCreateBuilder8.copyOnWrite();
                    aiyx aiyxVar4 = (aiyx) aihfVarCreateBuilder8.instance;
                    aiyw aiywVar2 = (aiyw) aihfVarCreateBuilder9.build();
                    aiywVar2.getClass();
                    aiyxVar4.e = aiywVar2;
                    aiyxVar4.b |= 16;
                }
            }
            aiyx aiyxVar5 = (aiyx) aihfVarCreateBuilder8.build();
            aihfVarCreateBuilder2.copyOnWrite();
            aixs aixsVar6 = (aixs) aihfVarCreateBuilder2.instance;
            aiyxVar5.getClass();
            aixsVar6.g = aiyxVar5;
            aixsVar6.b |= 16;
        }
        if (skhVar != null) {
            if (skhVar == skh.a) {
                aiyoVar = aiyo.a;
            } else {
                aihf aihfVarCreateBuilder10 = aiyo.a.createBuilder();
                slz slzVar = skhVar.b;
                aihf aihfVarCreateBuilder11 = aiyv.a.createBuilder();
                String str3 = slzVar.a;
                if (!TextUtils.isEmpty(str3)) {
                    aihfVarCreateBuilder11.copyOnWrite();
                    aiyv aiyvVar = (aiyv) aihfVarCreateBuilder11.instance;
                    aiyvVar.b |= 1;
                    aiyvVar.c = str3;
                }
                boolean z3 = slzVar.b;
                aihfVarCreateBuilder11.copyOnWrite();
                aiyv aiyvVar2 = (aiyv) aihfVarCreateBuilder11.instance;
                aiyvVar2.b |= 2;
                aiyvVar2.d = z3;
                boolean z4 = slzVar.c;
                aihfVarCreateBuilder11.copyOnWrite();
                aiyv aiyvVar3 = (aiyv) aihfVarCreateBuilder11.instance;
                aiyvVar3.b |= 16;
                aiyvVar3.g = z4;
                boolean z5 = slzVar.d;
                aihfVarCreateBuilder11.copyOnWrite();
                aiyv aiyvVar4 = (aiyv) aihfVarCreateBuilder11.instance;
                aiyvVar4.b |= 4;
                aiyvVar4.e = z5;
                boolean z6 = slzVar.e;
                aihfVarCreateBuilder11.copyOnWrite();
                aiyv aiyvVar5 = (aiyv) aihfVarCreateBuilder11.instance;
                aiyvVar5.b |= 8;
                aiyvVar5.f = z6;
                sgu sguVar = skhVar.c;
                aihf aihfVarCreateBuilder12 = aixx.a.createBuilder();
                String str4 = sguVar.a;
                if (!TextUtils.isEmpty(str4)) {
                    aihfVarCreateBuilder12.copyOnWrite();
                    aixx aixxVar = (aixx) aihfVarCreateBuilder12.instance;
                    aixxVar.b |= 1;
                    aixxVar.c = str4;
                }
                aihfVarCreateBuilder10.copyOnWrite();
                aiyo aiyoVar2 = (aiyo) aihfVarCreateBuilder10.instance;
                aiyv aiyvVar6 = (aiyv) aihfVarCreateBuilder11.build();
                aiyvVar6.getClass();
                aiyoVar2.c = aiyvVar6;
                aiyoVar2.b |= 1;
                aihfVarCreateBuilder10.copyOnWrite();
                aiyo aiyoVar3 = (aiyo) aihfVarCreateBuilder10.instance;
                aixx aixxVar2 = (aixx) aihfVarCreateBuilder12.build();
                aixxVar2.getClass();
                aiyoVar3.d = aixxVar2;
                aiyoVar3.b |= 4;
                aiyoVar = (aiyo) aihfVarCreateBuilder10.build();
            }
            aihfVarCreateBuilder2.copyOnWrite();
            aixs aixsVar7 = (aixs) aihfVarCreateBuilder2.instance;
            aiyoVar.getClass();
            aixsVar7.i = aiyoVar;
            aixsVar7.b |= 64;
        }
        if (aizgVar != null) {
            aihfVarCreateBuilder2.copyOnWrite();
            aixs aixsVar8 = (aixs) aihfVarCreateBuilder2.instance;
            aixsVar8.h = aizgVar;
            aixsVar8.b |= 32;
        }
        aixs aixsVar9 = (aixs) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        aiya aiyaVar3 = (aiya) aihfVarCreateBuilder.instance;
        aixsVar9.getClass();
        aiyaVar3.d = aixsVar9;
        aiyaVar3.b |= 2;
        if (smrVar != null) {
            saa saaVar = new saa(aihfVarCreateBuilder, 9);
            Optional optional = smrVar.h;
            if (true == optional.isPresent()) {
                Object obj = optional.get();
                Object obj2 = saaVar.a;
                aigj aigjVar2 = ((aivr) obj).b;
                aihf aihfVar = (aihf) obj2;
                aihfVar.copyOnWrite();
                aiya aiyaVar4 = (aiya) aihfVar.instance;
                aigjVar2.getClass();
                aiyaVar4.b |= 16;
                aiyaVar4.g = aigjVar2;
            }
            if (smrVar.j) {
                aihfVarCreateBuilder.copyOnWrite();
                aiya aiyaVar5 = (aiya) aihfVarCreateBuilder.instance;
                aiyaVar5.b |= 64;
                i3 = 1;
                aiyaVar5.i = true;
            } else {
                i3 = 1;
            }
        } else {
            i3 = 1;
        }
        if (skoVar != null && (aiuaVar = (aiua) skoVar.m.f()) != null && (aiuaVar.b & i3) != 0) {
            aigj aigjVar3 = aiuaVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            aiya aiyaVar6 = (aiya) aihfVarCreateBuilder.instance;
            aigjVar3.getClass();
            aiyaVar6.b |= 4;
            aiyaVar6.e = aigjVar3;
        }
        if (aixeVar == aixe.ADS_CLIENT_EVENT_TYPE_ERROR && aixzVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aiya aiyaVar7 = (aiya) aihfVarCreateBuilder.instance;
            aiyaVar7.h = aixzVar;
            aiyaVar7.b |= 32;
        }
        return (aiya) aihfVarCreateBuilder.build();
    }

    public final void d(int i, int i2, skh skhVar, smr smrVar) {
        f(aixe.ADS_CLIENT_EVENT_TYPE_ERROR, smrVar, null, null, null, 0, null, null, skhVar, b(i, i2), null, false);
    }

    public final void e(int i, int i2, skh skhVar, smr smrVar, sko skoVar) {
        f(aixe.ADS_CLIENT_EVENT_TYPE_ERROR, smrVar, skoVar, null, null, 0, null, null, skhVar, b(i, i2), null, false);
    }

    public final void f(final aixe aixeVar, final smr smrVar, final sko skoVar, final sni sniVar, final snl snlVar, final int i, final List list, final smb smbVar, final skh skhVar, final aixz aixzVar, final aizg aizgVar, final boolean z) {
        ajaa ajaaVar;
        long j;
        slz slzVar;
        aiua aiuaVar;
        final spv spvVar = this;
        if (aixeVar != aixe.ADS_CLIENT_EVENT_TYPE_UNSPECIFIED) {
            long epochMilli = spvVar.h.f().toEpochMilli();
            AtomicInteger atomicInteger = spvVar.k;
            rsi rsiVar = spvVar.f;
            vyo vyoVar = spvVar.g;
            final int iIncrementAndGet = atomicInteger.incrementAndGet();
            boolean z2 = afxw.e(vyoVar).bK;
            int i2 = rsiVar.k;
            if (!z2) {
                if (vyoVar == null || vyoVar.b() == null || (ajaaVar = vyoVar.b().A) == null) {
                    ajaaVar = ajaa.a;
                }
                if (ajaaVar.b && afxw.e(vyoVar).bs) {
                    String str = (!taq.af(vyoVar) || skhVar == null || (slzVar = skhVar.b) == null) ? "" : slzVar.a;
                    boolean z3 = afxw.e(vyoVar).bN;
                    boolean zContains = e.contains(aixeVar);
                    if (!z3 || zContains) {
                        ScheduledExecutorService scheduledExecutorService = spvVar.j;
                        if (i2 > 0) {
                            j = epochMilli;
                            scheduledExecutorService.schedule(new spu(spvVar, skoVar, j, str, 0), i2, TimeUnit.MILLISECONDS);
                            spvVar = this;
                        } else {
                            j = epochMilli;
                            spvVar = this;
                            scheduledExecutorService.execute(afwl.i(new spu(spvVar, skoVar, j, str, 2)));
                            i2 = 0;
                        }
                    }
                }
                if (rsiVar.j || spvVar.l) {
                    g(aixeVar, smrVar, skoVar, sniVar, snlVar, i, list, smbVar, skhVar, aixzVar, aizgVar, z, j, iIncrementAndGet);
                }
                ScheduledExecutorService scheduledExecutorService2 = spvVar.j;
                if (i2 > 0) {
                    final int i3 = 1;
                    final long j2 = j;
                    scheduledExecutorService2.schedule(new Runnable(spvVar) { // from class: spt
                        public final /* synthetic */ spv a;

                        {
                            this.a = spvVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i3;
                            int i5 = iIncrementAndGet;
                            if (i4 != 0) {
                                long j3 = j2;
                                boolean z4 = z;
                                aizg aizgVar2 = aizgVar;
                                aixz aixzVar2 = aixzVar;
                                skh skhVar2 = skhVar;
                                smb smbVar2 = smbVar;
                                List list2 = list;
                                int i6 = i;
                                snl snlVar2 = snlVar;
                                sni sniVar2 = sniVar;
                                sko skoVar2 = skoVar;
                                smr smrVar2 = smrVar;
                                this.a.g(aixeVar, smrVar2, skoVar2, sniVar2, snlVar2, i6, list2, smbVar2, skhVar2, aixzVar2, aizgVar2, z4, j3, i5);
                                return;
                            }
                            long j4 = j2;
                            boolean z5 = z;
                            aizg aizgVar3 = aizgVar;
                            aixz aixzVar3 = aixzVar;
                            skh skhVar3 = skhVar;
                            smb smbVar3 = smbVar;
                            List list3 = list;
                            int i7 = i;
                            snl snlVar3 = snlVar;
                            sni sniVar3 = sniVar;
                            sko skoVar3 = skoVar;
                            smr smrVar3 = smrVar;
                            this.a.g(aixeVar, smrVar3, skoVar3, sniVar3, snlVar3, i7, list3, smbVar3, skhVar3, aixzVar3, aizgVar3, z5, j4, i5);
                        }
                    }, i2, TimeUnit.MILLISECONDS);
                    return;
                } else {
                    final long j3 = j;
                    final int i4 = 0;
                    scheduledExecutorService2.execute(afwl.i(new Runnable(this) { // from class: spt
                        public final /* synthetic */ spv a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i5 = i4;
                            int i6 = iIncrementAndGet;
                            if (i5 != 0) {
                                long j4 = j3;
                                boolean z4 = z;
                                aizg aizgVar2 = aizgVar;
                                aixz aixzVar2 = aixzVar;
                                skh skhVar2 = skhVar;
                                smb smbVar2 = smbVar;
                                List list2 = list;
                                int i7 = i;
                                snl snlVar2 = snlVar;
                                sni sniVar2 = sniVar;
                                sko skoVar2 = skoVar;
                                smr smrVar2 = smrVar;
                                this.a.g(aixeVar, smrVar2, skoVar2, sniVar2, snlVar2, i7, list2, smbVar2, skhVar2, aixzVar2, aizgVar2, z4, j4, i6);
                                return;
                            }
                            long j5 = j3;
                            boolean z5 = z;
                            aizg aizgVar3 = aizgVar;
                            aixz aixzVar3 = aixzVar;
                            skh skhVar3 = skhVar;
                            smb smbVar3 = smbVar;
                            List list3 = list;
                            int i8 = i;
                            snl snlVar3 = snlVar;
                            sni sniVar3 = sniVar;
                            sko skoVar3 = skoVar;
                            smr smrVar3 = smrVar;
                            this.a.g(aixeVar, smrVar3, skoVar3, sniVar3, snlVar3, i8, list3, smbVar3, skhVar3, aixzVar3, aizgVar3, z5, j5, i6);
                        }
                    }));
                    return;
                }
            }
            if (skoVar != null && (aiuaVar = (aiua) skoVar.m.f()) != null && (aiuaVar.b & 1) != 0) {
                aiuaVar.c.G();
                for (sqc sqcVar : spvVar.n) {
                    ScheduledExecutorService scheduledExecutorService3 = spvVar.j;
                    if (i2 > 0) {
                        scheduledExecutorService3.schedule(afwl.i(new rxn(sqcVar, 8)), i2, TimeUnit.MILLISECONDS);
                    } else {
                        scheduledExecutorService3.execute(afwl.i(new rxn(sqcVar, 9)));
                    }
                }
            }
            j = epochMilli;
            if (rsiVar.j) {
            }
            g(aixeVar, smrVar, skoVar, sniVar, snlVar, i, list, smbVar, skhVar, aixzVar, aizgVar, z, j, iIncrementAndGet);
        }
    }

    public final void g(final aixe aixeVar, final smr smrVar, final sko skoVar, final sni sniVar, final snl snlVar, final int i, final List list, final smb smbVar, final skh skhVar, final aixz aixzVar, final aizg aizgVar, final boolean z, long j, final int i2) {
        if (taq.aT(this.g)) {
            return;
        }
        if (this.l) {
            this.i.g(new Function() { // from class: sps
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public final /* synthetic */ Function mo840andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    alos alosVar = (alos) obj;
                    aiya aiyaVarC = this.a.c(aixeVar, smrVar, skoVar, sniVar, snlVar, i, list, smbVar, skhVar, aixzVar, aizgVar, z, i2);
                    aihf aihfVarCreateBuilder = aiyb.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    aiyb aiybVar = (aiyb) aihfVarCreateBuilder.instance;
                    aiyaVarC.getClass();
                    aiybVar.c = aiyaVarC;
                    aiybVar.b = 11;
                    aiyb aiybVar2 = (aiyb) aihfVarCreateBuilder.build();
                    alosVar.copyOnWrite();
                    alou alouVar = (alou) alosVar.instance;
                    alou alouVar2 = alou.a;
                    aiybVar2.getClass();
                    alouVar.d = aiybVar2;
                    alouVar.c = 197;
                    return alosVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, xel.c(j));
            return;
        }
        aiya aiyaVarC = c(aixeVar, smrVar, skoVar, sniVar, snlVar, i, list, smbVar, skhVar, aixzVar, aizgVar, z, i2);
        aihf aihfVarCreateBuilder = aiyb.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aiyb aiybVar = (aiyb) aihfVarCreateBuilder.instance;
        aiyaVarC.getClass();
        aiybVar.c = aiyaVarC;
        aiybVar.b = 11;
        xeu xeuVar = this.i;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.ADS_CLIENT_STATE_CHANGE);
            xffVarA.h = j;
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        aiyb aiybVar2 = (aiyb) aihfVarCreateBuilder.build();
        aiybVar2.getClass();
        alouVar.d = aiybVar2;
        alouVar.c = 197;
        xeuVar.c((alou) alosVar.build(), j);
    }

    public final void h(int i) {
        if (taq.aT(this.g)) {
            return;
        }
        aihf aihfVarCreateBuilder = aizl.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aizl aizlVar = (aizl) aihfVarCreateBuilder.instance;
        aizlVar.c = i - 1;
        aizlVar.b |= 1;
        aizl aizlVar2 = (aizl) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder2 = aiyb.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        aiyb aiybVar = (aiyb) aihfVarCreateBuilder2.instance;
        aizlVar2.getClass();
        aiybVar.c = aizlVar2;
        aiybVar.b = 16;
        long epochMilli = this.h.f().toEpochMilli();
        xeu xeuVar = this.i;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder2, alot.ADS_CLIENT_STATE_CHANGE);
            xffVarA.h = epochMilli;
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        aiyb aiybVar2 = (aiyb) aihfVarCreateBuilder2.build();
        aiybVar2.getClass();
        alouVar.d = aiybVar2;
        alouVar.c = 197;
        xeuVar.d((alou) alosVar.build(), xel.c(epochMilli));
    }
}
