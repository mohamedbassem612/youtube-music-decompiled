package defpackage;

import android.text.TextUtils;
import com.google.protobuf.MessageLite;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class xge implements xgn, xfq {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/logging/interaction/DefaultInteractionLogger");
    protected final tbt b;
    public final xgo c;
    protected final xgp d;
    public final xhp e;
    protected final awmd f;
    public final Executor g;
    public final boolean h;
    protected final vxz k;
    private final Map m;
    private final awmd n;
    private final agfr o;
    private final agfr p;
    private final agfr q;
    private final tqj r;
    private final boolean t;
    private final String u;
    private final boolean v;
    public final Queue i = new ArrayDeque();
    public Optional j = Optional.empty();
    private volatile Optional s = Optional.empty();

    public xge(dov dovVar, txp txpVar, tbt tbtVar, xgo xgoVar, xgp xgpVar, vxz vxzVar, awmd awmdVar, Executor executor, tqj tqjVar, awmd awmdVar2, boolean z, boolean z2) {
        int i = tqr.a;
        this.v = tqjVar.k(1073830416);
        this.t = z;
        xgoVar.getClass();
        this.c = xgoVar;
        dovVar.getClass();
        txpVar.getClass();
        tbtVar.getClass();
        this.b = tbtVar;
        this.e = new xhp(xgoVar);
        this.d = xgpVar;
        this.m = new ConcurrentHashMap();
        AtomicInteger atomicInteger = xhb.a;
        if (atomicInteger.get() <= 0) {
            atomicInteger.set(2);
        }
        this.k = vxzVar;
        this.n = awmdVar;
        this.g = executor;
        this.r = tqjVar;
        this.f = awmdVar2;
        this.h = z2;
        vxzVar.getClass();
        this.o = aguu.al(new wkw(vxzVar, 8));
        this.p = aguu.al(new wkw(vxzVar, 9));
        if (z) {
            this.q = aguu.al(new tar(awmdVar, 9));
            this.u = tqjVar.k(1073830446) ? xgt.d(Optional.of(vxzVar)) : null;
        } else {
            this.q = aguu.al(new wkw(awmdVar, 10));
            this.u = null;
        }
    }

    private final xgt X(xie xieVar, int i) {
        if (!ad(xieVar) || i == 138480) {
            return null;
        }
        return a();
    }

    private final xie Y() {
        return E(ajij.AUTOMATED_LOG_EVENT_SOURCE_UNKNOWN);
    }

    private final void Z(final Consumer consumer) {
        this.g.execute(new Runnable() { // from class: xfr
            @Override // java.lang.Runnable
            public final void run() {
                xge xgeVar = this.a;
                xgt xgtVar = (xgt) xgeVar.j.orElse(null);
                Consumer consumer2 = consumer;
                if (xgeVar.h && xgtVar == null) {
                    xgeVar.i.add(consumer2);
                } else if (xgtVar != null) {
                    xgeVar.V(xgtVar, consumer2);
                }
            }
        });
    }

    private final void aa(final Consumer consumer) {
        if (this.v) {
            this.g.execute(new Runnable() { // from class: xgd
                @Override // java.lang.Runnable
                public final void run() {
                    xge xgeVar = this.a;
                    xgt xgtVarT = (xgt) xgeVar.j.orElse(null);
                    if (xgtVarT != null) {
                        xgtVarT = xgeVar.T(xgtVarT);
                    }
                    Consumer consumer2 = consumer;
                    if (xgeVar.h && (xgtVarT == null || xgtVarT.n)) {
                        xgeVar.i.add(consumer2);
                    } else if (xgtVarT != null) {
                        xgeVar.V(xgtVarT, consumer2);
                    }
                }
            });
        } else {
            Z(consumer);
        }
    }

    private final void ab(final BiConsumer biConsumer, final xie xieVar) {
        this.g.execute(new Runnable() { // from class: xfz
            @Override // java.lang.Runnable
            public final void run() {
                xge xgeVar = this.a;
                if (!xgeVar.j.isPresent()) {
                    ((agrc) ((agrc) xge.a.c()).k("com/google/android/libraries/youtube/logging/interaction/DefaultInteractionLogger", "executeScreenLogAction", 522, "DefaultInteractionLogger.java")).t("Screen is null in executeScreenLogAction");
                    return;
                }
                final xie xieVar2 = xieVar;
                final BiConsumer biConsumer2 = biConsumer;
                xgeVar.V((xgt) xgeVar.j.get(), new Consumer() { // from class: xfy
                    @Override // java.util.function.Consumer
                    /* JADX INFO: renamed from: accept */
                    public final void r(Object obj) {
                        biConsumer2.accept((xgt) obj, xieVar2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        });
    }

    private final void ac() {
        this.g.execute(new xfd(this, 4));
    }

    private final boolean ad(xie xieVar) {
        return this.t && xieVar.e != ajij.AUTOMATED_LOG_EVENT_SOURCE_PAGE_SYSTEM;
    }

    private final void ae(final xgt xgtVar, xgu xguVar, final amdd amddVar, final amdd amddVar2, final Optional optional, final xie xieVar) {
        xgt xgtVarB;
        String str = xgtVar.b;
        if (str != null && (xgtVarB = ((xhk) this.f.io()).b(str)) != null) {
            String str2 = xgtVarB.a;
            if (!str2.equals(str)) {
                xgtVar.b = str2;
            }
        }
        final Optional optionalEmpty = (!((Boolean) this.p.io()).booleanValue() || TextUtils.isEmpty(xgtVar.c)) ? Optional.empty() : Optional.ofNullable(a());
        W(xgtVar, false);
        this.g.execute(new Runnable() { // from class: xfv
            /* JADX WARN: Code duplicated, block: B:185:0x048c  */
            /* JADX WARN: Code duplicated, block: B:188:0x049c  */
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                xgt xgtVar2;
                xie xieVar2;
                alou alouVar;
                xgo xgoVar;
                xie xieVar3;
                String str3;
                String str4;
                int i2;
                argn argnVar;
                xgo xgoVar2 = this.a.c;
                amdz amdzVarA = xgoVar2.a();
                xgt xgtVar3 = xgtVar;
                if (xgo.p(amdzVarA, xgtVar3)) {
                    int i3 = xgtVar3.f;
                    ajva ajvaVar = xgtVar3.d;
                    argn argnVarC = xgo.c(i3);
                    if (ajvaVar != null) {
                        aihf builder = argnVarC.toBuilder();
                        builder.copyOnWrite();
                        argn argnVar2 = (argn) builder.instance;
                        argnVar2.i = ajvaVar;
                        argnVar2.b |= 64;
                        argnVarC = (argn) builder.build();
                    }
                    aihf aihfVarCreateBuilder = ambz.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    ambz ambzVar = (ambz) aihfVarCreateBuilder.instance;
                    argnVarC.getClass();
                    ambzVar.c = argnVarC;
                    ambzVar.b |= 1;
                    String str5 = xgtVar3.a;
                    aihfVarCreateBuilder.copyOnWrite();
                    ambz ambzVar2 = (ambz) aihfVarCreateBuilder.instance;
                    str5.getClass();
                    ambzVar2.b |= 2;
                    ambzVar2.d = str5;
                    String str6 = xgtVar3.c;
                    if (!TextUtils.isEmpty(str6)) {
                        aihfVarCreateBuilder.copyOnWrite();
                        ambz ambzVar3 = (ambz) aihfVarCreateBuilder.instance;
                        str6.getClass();
                        ambzVar3.b |= 4;
                        ambzVar3.e = str6;
                    }
                    amdd amddVar3 = amddVar;
                    if (amddVar3 != null) {
                        aihfVarCreateBuilder.copyOnWrite();
                        ambz ambzVar4 = (ambz) aihfVarCreateBuilder.instance;
                        ambzVar4.f = amddVar3;
                        ambzVar4.b |= 8;
                    }
                    String str7 = xgtVar3.b;
                    boolean zIsEmpty = TextUtils.isEmpty(str7);
                    argn argnVar3 = xgtVar3.e;
                    boolean z = xgo.f(argnVar3.c) || xgo.e(argnVar3);
                    amdd amddVar4 = amddVar2;
                    if (!zIsEmpty || z || amddVar4 != null) {
                        aihf aihfVarCreateBuilder2 = amby.a.createBuilder();
                        if (z) {
                            aihfVarCreateBuilder2.copyOnWrite();
                            amby ambyVar = (amby) aihfVarCreateBuilder2.instance;
                            argnVar3.getClass();
                            ambyVar.c = argnVar3;
                            ambyVar.b |= 1;
                        }
                        if (str7 != null) {
                            aihfVarCreateBuilder2.copyOnWrite();
                            amby ambyVar2 = (amby) aihfVarCreateBuilder2.instance;
                            ambyVar2.b |= 2;
                            ambyVar2.d = str7;
                        }
                        if (amddVar4 != null) {
                            aihfVarCreateBuilder2.copyOnWrite();
                            amby ambyVar3 = (amby) aihfVarCreateBuilder2.instance;
                            ambyVar3.e = amddVar4;
                            ambyVar3.b |= 4;
                        }
                        aihfVarCreateBuilder.copyOnWrite();
                        ambz ambzVar5 = (ambz) aihfVarCreateBuilder.instance;
                        amby ambyVar4 = (amby) aihfVarCreateBuilder2.build();
                        ambyVar4.getClass();
                        ambzVar5.g = ambyVar4;
                        ambzVar5.b |= 16;
                    }
                    Optional optionalOfNullable = optional;
                    if (true == optionalOfNullable.isPresent()) {
                        amue amueVar = ((amdy) optionalOfNullable.get()).d;
                        if (amueVar == null) {
                            amueVar = amue.a;
                        }
                        if ((amueVar.b & 2) == 0) {
                            optionalOfNullable = Optional.empty();
                        }
                    }
                    if (true == optionalOfNullable.isPresent()) {
                        amue amueVar2 = ((amdy) optionalOfNullable.get()).d;
                        if (amueVar2 == null) {
                            amueVar2 = amue.a;
                        }
                        amuf amufVar = amueVar2.c;
                        if (amufVar == null) {
                            amufVar = amuf.a;
                        }
                        optionalOfNullable = Optional.ofNullable(amufVar);
                    }
                    hkp hkpVar = new hkp(aihfVarCreateBuilder, 14);
                    if (true == optionalOfNullable.isPresent()) {
                        Object obj = optionalOfNullable.get();
                        aihf aihfVar = (aihf) hkpVar.a;
                        aihfVar.copyOnWrite();
                        ambz ambzVar6 = (ambz) aihfVar.instance;
                        ambzVar6.h = (amuf) obj;
                        ambzVar6.b |= 32;
                    }
                    xie xieVar4 = xieVar;
                    alou alouVar2 = alou.a;
                    alos alosVar = (alos) alouVar2.createBuilder();
                    alosVar.copyOnWrite();
                    alou alouVar3 = (alou) alosVar.instance;
                    ambz ambzVar7 = (ambz) aihfVarCreateBuilder.build();
                    ambzVar7.getClass();
                    alouVar3.d = ambzVar7;
                    alouVar3.c = 156;
                    xgoVar2.d(alosVar, xgtVar3, xieVar4);
                    xhf xhfVar = (xhf) xgoVar2.c.io();
                    ambz ambzVar8 = (ambz) aihfVarCreateBuilder.build();
                    if (xhfVar.c()) {
                        xgoVar2 = xgoVar2;
                        i = i3;
                        xgtVar2 = xgtVar3;
                        str5 = str5;
                        str6 = str6;
                        xieVar2 = xieVar4;
                        alouVar = alouVar2;
                    } else {
                        amby ambyVar5 = ambzVar8.g;
                        if (ambyVar5 == null) {
                            ambyVar5 = amby.a;
                        }
                        String str8 = ambyVar5.d;
                        HashMap map = new HashMap();
                        argn argnVar4 = ambzVar8.c;
                        if (argnVar4 == null) {
                            argnVar4 = argn.a;
                        }
                        map.put("client.params.pageVe", xhf.i(argnVar4));
                        if ((ambzVar8.b & 2) == 0 || ambzVar8.d.isEmpty()) {
                            xgoVar2 = xgoVar2;
                            i = i3;
                            xgtVar2 = xgtVar3;
                            str5 = str5;
                            str6 = str6;
                            xieVar2 = xieVar4;
                            alouVar = alouVar2;
                            argn argnVar5 = ambzVar8.c;
                            if (argnVar5 == null) {
                                argnVar5 = argn.a;
                            }
                            xhf.j("INTERACTIONLOGGINGBUG->NEW_SCREEN_MISSING_CSN", "ve: " + xhf.i(argnVar5) + " event_context: " + xieVar2.toString());
                            xhfVar.f("INTERACTIONLOGGINGBUG->NEW_SCREEN_MISSING_CSN", map);
                        } else {
                            String str9 = ambzVar8.d;
                            Map map2 = xhfVar.a;
                            if (map2.containsKey(str9)) {
                                argn argnVar6 = ambzVar8.c;
                                if (argnVar6 == null) {
                                    argnVar6 = argn.a;
                                }
                                xhf.j("INTERACTIONLOGGINGBUG->MULTIPLE_NEW_SCREENS_WITH_SAME_CSN", "ve: " + xhf.i(argnVar6) + " event_context: " + xieVar4.toString());
                                xhfVar.f("INTERACTIONLOGGINGBUG->MULTIPLE_NEW_SCREENS_WITH_SAME_CSN", map);
                                xgoVar2 = xgoVar2;
                                i = i3;
                                xgtVar2 = xgtVar3;
                                str5 = str5;
                                str6 = str6;
                                xieVar2 = xieVar4;
                                alouVar = alouVar2;
                            } else {
                                argn argnVar7 = ambzVar8.c;
                                alouVar = alouVar2;
                                if (((argnVar7 == null ? argn.a : argnVar7).b & 2) == 0) {
                                    i = i3;
                                    xgtVar2 = xgtVar3;
                                    str5 = str5;
                                    str6 = str6;
                                    xieVar2 = xieVar4;
                                    argnVar = ambzVar8.c;
                                    if (argnVar == null) {
                                        argnVar = argn.a;
                                    }
                                    xhf.j("INTERACTIONLOGGINGBUG->INVALID_SCREEN_VE_TYPE", "page_ve: " + xhf.i(argnVar) + "   csn: " + ambzVar8.d + " event_context: " + xieVar2.toString());
                                    xhfVar.f("INTERACTIONLOGGINGBUG->INVALID_SCREEN_VE_TYPE", map);
                                } else {
                                    int i4 = (argnVar7 == null ? argn.a : argnVar7).d;
                                    AtomicInteger atomicInteger = xhb.a;
                                    if (i4 > 0) {
                                        i = i3;
                                        if (xhb.a.get() != 1 || xhb.d.containsKey(Integer.valueOf(i4))) {
                                            String str10 = ambzVar8.d;
                                            argn argnVar8 = ambzVar8.c;
                                            if (argnVar8 == null) {
                                                argnVar8 = argn.a;
                                            }
                                            map2.put(str10, new xsc(xhb.a(argnVar8.d)));
                                            xsc xscVar = (xsc) map2.get(ambzVar8.d);
                                            argn argnVar9 = ambzVar8.c;
                                            if (argnVar9 == null) {
                                                argnVar9 = argn.a;
                                            }
                                            xscVar.f(argnVar9);
                                            if ((ambzVar8.b & 4) == 0 || ambzVar8.e.isEmpty() || map2.containsKey(ambzVar8.e)) {
                                                if ((ambzVar8.b & 16) != 0) {
                                                    amby ambyVar6 = ambzVar8.g;
                                                    if (ambyVar6 == null) {
                                                        ambyVar6 = amby.a;
                                                    }
                                                    if ((ambyVar6.b & 1) == 0 || xhfVar.b(ambyVar6)) {
                                                        xgtVar2 = xgtVar3;
                                                        amby ambyVar7 = ambzVar8.g;
                                                        if (ambyVar7 == null) {
                                                            ambyVar7 = amby.a;
                                                        }
                                                        if (!map2.containsKey(ambyVar7.d)) {
                                                            argn argnVar10 = ambyVar6.c;
                                                            if (argnVar10 == null) {
                                                                argnVar10 = argn.a;
                                                            }
                                                            map.put("client.params.parentVe", xhf.i(argnVar10));
                                                            argn argnVar11 = ambzVar8.c;
                                                            if (argnVar11 == null) {
                                                                argnVar11 = argn.a;
                                                            }
                                                            String strI = xhf.i(argnVar11);
                                                            String str11 = ambzVar8.d;
                                                            amby ambyVar8 = ambzVar8.g;
                                                            String str12 = (ambyVar8 == null ? amby.a : ambyVar8).d;
                                                            if (ambyVar8 == null) {
                                                                ambyVar8 = amby.a;
                                                            }
                                                            argn argnVar12 = ambyVar8.c;
                                                            if (argnVar12 == null) {
                                                                argnVar12 = argn.a;
                                                            }
                                                            xhf.j("INTERACTIONLOGGINGBUG->UNRESOLVED_PARENT_CSN", "page_ve: " + strI + "   csn: " + str11 + "   parent_csn: " + str12 + "   parent_ve_type: " + xhf.i(argnVar12) + " event_context: " + xieVar4.toString());
                                                            xhfVar.f("INTERACTIONLOGGINGBUG->UNRESOLVED_PARENT_CSN", map);
                                                        }
                                                    } else {
                                                        xgtVar2 = xgtVar3;
                                                        argn argnVar13 = ambyVar6.c;
                                                        if (argnVar13 == null) {
                                                            argnVar13 = argn.a;
                                                        }
                                                        map.put("client.params.parentVe", xhf.i(argnVar13));
                                                        argn argnVar14 = ambzVar8.c;
                                                        if (argnVar14 == null) {
                                                            argnVar14 = argn.a;
                                                        }
                                                        xhf.i(argnVar14);
                                                        String str13 = ambzVar8.d;
                                                        amby ambyVar9 = ambzVar8.g;
                                                        if (ambyVar9 == null) {
                                                            ambyVar9 = amby.a;
                                                        }
                                                        argn argnVar15 = ambyVar9.c;
                                                        if (argnVar15 == null) {
                                                            argnVar15 = argn.a;
                                                        }
                                                        xhf.i(argnVar15);
                                                        xieVar4.toString();
                                                        xhfVar.f("INTERACTIONLOGGINGBUG->MISSING_PARENT_CSN", map);
                                                        argn argnVar16 = ambzVar8.c;
                                                        if (argnVar16 == null) {
                                                            argnVar16 = argn.a;
                                                        }
                                                        int i5 = argnVar16.d;
                                                        argn argnVar17 = ambyVar6.c;
                                                        if (argnVar17 == null) {
                                                            argnVar17 = argn.a;
                                                        }
                                                        xhf.a(argnVar17);
                                                    }
                                                    str6 = str6;
                                                    if (xhfVar.b(ambyVar6) && (ambyVar6.b & 1) == 0) {
                                                        amby ambyVar10 = ambzVar8.g;
                                                        if (ambyVar10 == null) {
                                                            ambyVar10 = amby.a;
                                                        }
                                                        String str14 = ambyVar10.d;
                                                        argn argnVar18 = ambzVar8.c;
                                                        if (argnVar18 == null) {
                                                            argnVar18 = argn.a;
                                                        }
                                                        str5 = str5;
                                                        xgoVar2 = xgoVar2;
                                                        xieVar2 = xieVar4;
                                                        String str15 = "page_ve: " + xhf.i(argnVar18) + "   csn: " + ambzVar8.d + "   parent_page_ve: " + xhf.l((xhc) ((xsc) map2.get(str14)).b) + "   parent_csn: " + str14 + " event_context: " + xieVar4.toString();
                                                        map.put("client.params.parentPageVe", xhf.l((xhc) ((xsc) map2.get(str14)).b));
                                                        argn argnVar19 = ambzVar8.c;
                                                        if (argnVar19 == null) {
                                                            argnVar19 = argn.a;
                                                        }
                                                        int i6 = argnVar19.d;
                                                        xhf.j("INTERACTIONLOGGINGBUG->MISSING_PARENT_VE", str15);
                                                        xhfVar.f("INTERACTIONLOGGINGBUG->MISSING_PARENT_VE", map);
                                                    } else {
                                                        xgoVar2 = xgoVar2;
                                                        str5 = str5;
                                                        xieVar2 = xieVar4;
                                                        if (xhfVar.b(ambyVar6) && (ambyVar6.b & 1) != 0) {
                                                            argn argnVar20 = ambyVar6.c;
                                                            if (argnVar20 == null) {
                                                                argnVar20 = argn.a;
                                                            }
                                                            map.put("client.params.parentVe", xhf.i(argnVar20));
                                                            xsc xscVar2 = (xsc) map2.get(ambyVar6.d);
                                                            xhc xhcVar = (xhc) xscVar2.b;
                                                            map.put("client.params.parentPageVe", xhf.l(xhcVar));
                                                            argn argnVar21 = ambyVar6.c;
                                                            if (argnVar21 == null) {
                                                                argnVar21 = argn.a;
                                                            }
                                                            if (xhfVar.n("PARENT_VE_IN_SCREEN_CREATED", xscVar2, argnVar21)) {
                                                                String strE = xsc.e("PARENT_VE_IN_SCREEN_CREATED");
                                                                xsc.e("PARENT_VE_IN_SCREEN_CREATED");
                                                                argn argnVar22 = ambyVar6.c;
                                                                if (argnVar22 == null) {
                                                                    argnVar22 = argn.a;
                                                                }
                                                                xhfVar.m(xhcVar, argnVar22);
                                                                xhfVar.f(strE, map);
                                                            }
                                                        }
                                                    }
                                                }
                                                xieVar2 = xieVar4;
                                            } else {
                                                argn argnVar23 = ambzVar8.c;
                                                if (argnVar23 == null) {
                                                    argnVar23 = argn.a;
                                                }
                                                xhf.j("INTERACTIONLOGGINGBUG->UNRESOLVED_CLONE_CSN", "page_ve: " + xhf.i(argnVar23) + "   csn: " + ambzVar8.d + "   clone_csn: " + ambzVar8.e + " event_context: " + xieVar4.toString());
                                                xhfVar.f("INTERACTIONLOGGINGBUG->UNRESOLVED_CLONE_CSN", map);
                                            }
                                            xgtVar2 = xgtVar3;
                                            xieVar2 = xieVar4;
                                        }
                                    } else {
                                        i = i3;
                                    }
                                    xgtVar2 = xgtVar3;
                                    str5 = str5;
                                    str6 = str6;
                                    xieVar2 = xieVar4;
                                    argnVar = ambzVar8.c;
                                    if (argnVar == null) {
                                        argnVar = argn.a;
                                    }
                                    xhf.j("INTERACTIONLOGGINGBUG->INVALID_SCREEN_VE_TYPE", "page_ve: " + xhf.i(argnVar) + "   csn: " + ambzVar8.d + " event_context: " + xieVar2.toString());
                                    xhfVar.f("INTERACTIONLOGGINGBUG->INVALID_SCREEN_VE_TYPE", map);
                                }
                            }
                        }
                    }
                    amby ambyVar11 = ((ambz) aihfVarCreateBuilder.instance).g;
                    if (ambyVar11 == null) {
                        ambyVar11 = amby.a;
                    }
                    Optional optionalOf = Optional.of(ambyVar11);
                    if (xgoVar2.a().e) {
                        xgoVar = xgoVar2;
                        xieVar3 = xieVar2;
                        sda sdaVar = new sda(xgoVar, xieVar3, 18);
                        optionalOf.isPresent();
                        Object obj2 = optionalOf.get();
                        Object obj3 = sdaVar.a;
                        Object obj4 = sdaVar.b;
                        amby ambyVar12 = (amby) obj2;
                        int i7 = ambyVar12.b;
                        if ((i7 & 2) != 0 && (i7 & 1) != 0) {
                            aihf aihfVarCreateBuilder3 = amcb.a.createBuilder();
                            String str16 = ambyVar12.d;
                            aihfVarCreateBuilder3.copyOnWrite();
                            amcb amcbVar = (amcb) aihfVarCreateBuilder3.instance;
                            str16.getClass();
                            amcbVar.b |= 1;
                            amcbVar.c = str16;
                            argn argnVar24 = ambyVar12.c;
                            if (argnVar24 == null) {
                                argnVar24 = argn.a;
                            }
                            aihfVarCreateBuilder3.copyOnWrite();
                            amcb amcbVar2 = (amcb) aihfVarCreateBuilder3.instance;
                            argnVar24.getClass();
                            amcbVar2.d = argnVar24;
                            amcbVar2.b |= 2;
                            amcb amcbVar3 = (amcb) aihfVarCreateBuilder3.build();
                            alos alosVar2 = (alos) alouVar.createBuilder();
                            alosVar2.copyOnWrite();
                            alou alouVar4 = (alou) alosVar2.instance;
                            amcbVar3.getClass();
                            alouVar4.d = amcbVar3;
                            alouVar4.c = 78;
                            ((wjr) ((xgo) obj3).g.io()).A(alosVar2, (xie) obj4);
                        }
                    } else {
                        xgoVar = xgoVar2;
                        xieVar3 = xieVar2;
                    }
                    amuh amuhVar = xgoVar.f.b().n;
                    if (amuhVar == null) {
                        amuhVar = amuh.a;
                    }
                    amug amugVar = amuhVar.f;
                    if (amugVar == null) {
                        amugVar = amug.a;
                    }
                    if (amugVar.h) {
                        alos alosVar3 = (alos) alouVar.createBuilder();
                        aihf aihfVarCreateBuilder4 = alao.a.createBuilder();
                        String strD = ((xfp) xgoVar.e.io()).d();
                        aihfVarCreateBuilder4.copyOnWrite();
                        alao alaoVar = (alao) aihfVarCreateBuilder4.instance;
                        strD.getClass();
                        alaoVar.b |= 1;
                        alaoVar.c = strD;
                        aihfVarCreateBuilder4.copyOnWrite();
                        alao alaoVar2 = (alao) aihfVarCreateBuilder4.instance;
                        str5.getClass();
                        alaoVar2.b |= 2;
                        str3 = str5;
                        alaoVar2.d = str3;
                        alosVar3.copyOnWrite();
                        alou alouVar5 = (alou) alosVar3.instance;
                        alao alaoVar3 = (alao) aihfVarCreateBuilder4.build();
                        alaoVar3.getClass();
                        alouVar5.d = alaoVar3;
                        alouVar5.c = 111;
                        ((wjr) xgoVar.g.io()).A(alosVar3, xieVar3);
                    } else {
                        str3 = str5;
                    }
                    xgoVar.b.c(new xhi(str3));
                    boolean z2 = xgoVar.h;
                    xgt xgtVarA = null;
                    if (!z2 || TextUtils.isEmpty(str6)) {
                        str4 = str6;
                    } else {
                        str4 = str6;
                        xgtVarA = ((xhk) xgoVar.d.io()).a(str4);
                    }
                    xgt xgtVar4 = xgtVar2;
                    xgtVar4.h.clear();
                    xgtVar4.i.clear();
                    xgtVar4.g.clear();
                    xgtVar4.j.clear();
                    xgtVar4.k.clear();
                    awmd awmdVar = xgoVar.d;
                    ((xhk) awmdVar.io()).d(xgtVar4);
                    boolean z3 = xgoVar.i;
                    if (!z3) {
                        Optional optional2 = optionalEmpty;
                        if (optional2.isPresent() && ((xgt) optional2.get()).a.equals(str4)) {
                            j$.util.Map.EL.forEach(((xgt) optional2.get()).l, new adcv(xgoVar, xgtVar4, xieVar3, 1));
                            return;
                        }
                    }
                    if (!z2 && !TextUtils.isEmpty(str4)) {
                        xgtVarA = ((xhk) awmdVar.io()).a(str4);
                    }
                    if (xgtVarA != null) {
                        if (!xgoVar.k || (i2 = i) == 4724 || i2 == 62985 || i2 == 32633) {
                            Collection.EL.stream(xgtVarA.l.entrySet()).forEachOrdered(new hrr(xgoVar, xgtVar4, xieVar3, 13));
                            if (z3) {
                                Iterable$EL.forEach((List) Collection.EL.stream(xgtVarA.g).map(new vmw(19)).collect(aghu.a), new hrr(xgoVar, xgtVar4, xieVar3, 14));
                            }
                        }
                    }
                }
            }
        });
        if (this.h) {
            ac();
        }
        if (xguVar != null) {
            this.d.d(xguVar, xgtVar);
        }
        this.b.c(new xhj(this));
    }

    @Override // defpackage.xhz
    public final void A(xgz xgzVar, amdd amddVar) {
        Z(new xfw(this, xgzVar, amddVar, Y(), 1));
    }

    @Override // defpackage.xgn
    public void B() {
        this.s = Optional.empty();
        this.m.clear();
        this.g.execute(new xfd(this, 5));
    }

    @Override // defpackage.xgn
    public void C(xgt xgtVar) {
        W(xgtVar, true);
    }

    @Override // defpackage.xgn
    public final xgt D(xhc xhcVar, xgu xguVar, ajwo ajwoVar) {
        return c(xhcVar, xguVar, ajwoVar, null, null);
    }

    @Override // defpackage.xfq
    public final xie E(ajij ajijVar) {
        xej xejVar = (xej) this.n.io();
        xid xidVar = (xid) this.q.io();
        xidVar.e(xejVar.b.f().toEpochMilli());
        xidVar.c = ajijVar;
        tun tunVar = (tun) xejVar.c.io();
        long jB = tunVar.c.b();
        long j = tunVar.a;
        xidVar.d(j != -1 ? jB - j : -1L);
        return xidVar.a();
    }

    @Override // defpackage.xfq
    public final xie F(long j, ajij ajijVar) {
        return ((xej) this.n.io()).d((xid) this.q.io(), j, ajijVar);
    }

    @Override // defpackage.xfq
    public final void G() {
        this.s = Optional.empty();
        this.g.execute(new xfd(this, 3));
    }

    @Override // defpackage.xfq
    public final /* synthetic */ void H(ajij ajijVar) {
        yno.dn(this, ajijVar);
    }

    @Override // defpackage.xfq
    public final /* synthetic */ void I(ajij ajijVar) {
        yno.m947do(this, ajijVar);
    }

    @Override // defpackage.xfq
    public final /* synthetic */ void J(ajij ajijVar) {
        yno.dp(this, ajijVar);
    }

    @Override // defpackage.xfq
    public final /* synthetic */ void K(ajij ajijVar) {
        yno.dq(this, ajijVar);
    }

    @Override // defpackage.xfq
    public final void L(xie xieVar) {
        if (ad(xieVar)) {
            return;
        }
        ab(new gpd(this.c, 9), xieVar);
        this.d.c(a());
    }

    @Override // defpackage.xfq
    public final void M(xie xieVar) {
        if (ad(xieVar)) {
            return;
        }
        ab(new gpd(this.c, 10), xieVar);
    }

    @Override // defpackage.xfq
    public final void N(xie xieVar) {
        if (ad(xieVar)) {
            return;
        }
        if (((Boolean) this.o.io()).booleanValue()) {
            ab(new gpd(this.c, 12), xieVar);
        } else {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/logging/interaction/DefaultInteractionLogger", "logScreenHidden", 923, "DefaultInteractionLogger.java")).t("Screen visibility logging disabled.");
        }
    }

    @Override // defpackage.xfq
    public final void O(xie xieVar) {
        if (ad(xieVar)) {
            return;
        }
        if (((Boolean) this.o.io()).booleanValue()) {
            ab(new gpd(this.c, 13), xieVar);
        } else {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/logging/interaction/DefaultInteractionLogger", "logScreenShown", 903, "DefaultInteractionLogger.java")).t("Screen visibility logging disabled.");
        }
    }

    @Override // defpackage.xfq
    public final /* synthetic */ void P(xhc xhcVar, xgu xguVar, ajwo ajwoVar, amdd amddVar, amdd amddVar2, ajij ajijVar) {
        yno.dr(this, xhcVar, xguVar, ajwoVar, amddVar, amddVar2, ajijVar);
    }

    @Override // defpackage.xfq
    public final /* synthetic */ void Q(xhc xhcVar, xgu xguVar, argn argnVar, String str, String str2, amdd amddVar, amdd amddVar2, ajij ajijVar) {
        yno.ds(this, xhcVar, xguVar, argnVar, str, str2, amddVar, amddVar2, ajijVar);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:65:0x0153  */
    @Override // defpackage.xfq
    public final xgt R(int i, xgu xguVar, ajwo ajwoVar, amdd amddVar, amdd amddVar2, xie xieVar) {
        Optional optionalOfNullable;
        aihf aihfVarCreateBuilder;
        argn argnVarC;
        String str;
        xgt xgtVarX = X(xieVar, i);
        if (xgtVarX != null) {
            return xgtVarX;
        }
        Optional optionalOfNullable2 = Optional.ofNullable(ajwoVar);
        if (true == optionalOfNullable2.isPresent()) {
            ajwp ajwpVar = ((ajwo) optionalOfNullable2.get()).e;
            if (ajwpVar == null) {
                ajwpVar = ajwp.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(amdy.b);
            ajwpVar.c(aihlVarCheckIsLite);
            if (true != ajwpVar.j.n(aihlVarCheckIsLite.d)) {
                optionalOfNullable2 = Optional.empty();
            }
        }
        if (true == optionalOfNullable2.isPresent()) {
            ajwp ajwpVar2 = ((ajwo) optionalOfNullable2.get()).e;
            if (ajwpVar2 == null) {
                ajwpVar2 = ajwp.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(amdy.b);
            ajwpVar2.c(aihlVarCheckIsLite2);
            Object objK = ajwpVar2.j.k(aihlVarCheckIsLite2.d);
            optionalOfNullable2 = Optional.ofNullable((amdy) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
        }
        Optional optional = optionalOfNullable2;
        if (true != optional.isPresent()) {
            optionalOfNullable = optional;
        } else {
            apmo apmoVar = ((amdy) optional.get()).c;
            if (apmoVar == null) {
                apmoVar = apmo.a;
            }
            if ((apmoVar.b & 1) != 0) {
                optionalOfNullable = optional;
            } else {
                optionalOfNullable = Optional.empty();
            }
        }
        if (true == optionalOfNullable.isPresent()) {
            apmo apmoVar2 = ((amdy) optionalOfNullable.get()).c;
            if (apmoVar2 == null) {
                apmoVar2 = apmo.a;
            }
            optionalOfNullable = Optional.ofNullable(Integer.valueOf(apmoVar2.c));
        }
        int iIntValue = ((Integer) optionalOfNullable.orElse(Integer.valueOf(i))).intValue();
        vxz vxzVar = this.k;
        ajij ajijVar = xieVar.e;
        Optional optionalOf = Optional.of(vxzVar);
        String str2 = null;
        String str3 = a() == null ? this.u : null;
        if (xgt.f(ajwoVar)) {
            ajwoVar.getClass();
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aoaq.b);
            ajwoVar.c(aihlVarCheckIsLite3);
            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
            aoar aoarVar = (aoar) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2));
            int i2 = aoarVar.d;
            if (xgt.g(i2)) {
                argnVarC = xgt.c(i2, aoarVar.e);
            } else {
                aihfVarCreateBuilder = argn.a.createBuilder();
                if (ajwoVar != null && (ajwoVar.b & 1) != 0) {
                    aigj aigjVar = ajwoVar.c;
                    aihfVarCreateBuilder.copyOnWrite();
                    argn argnVar = (argn) aihfVarCreateBuilder.instance;
                    aigjVar.getClass();
                    argnVar.b |= 1;
                    argnVar.c = aigjVar;
                }
                argnVarC = (argn) aihfVarCreateBuilder.build();
            }
        } else {
            aihfVarCreateBuilder = argn.a.createBuilder();
            if (ajwoVar != null) {
                aigj aigjVar2 = ajwoVar.c;
                aihfVarCreateBuilder.copyOnWrite();
                argn argnVar2 = (argn) aihfVarCreateBuilder.instance;
                aigjVar2.getClass();
                argnVar2.b |= 1;
                argnVar2.c = aigjVar2;
            }
            argnVarC = (argn) aihfVarCreateBuilder.build();
        }
        argn argnVar3 = argnVarC;
        if (xgt.f(ajwoVar)) {
            ajwoVar.getClass();
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aoaq.b);
            ajwoVar.c(aihlVarCheckIsLite4);
            Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
            aoar aoarVar2 = (aoar) (objK3 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK3));
            if ((aoarVar2.b & 1) != 0) {
                str = aoarVar2.c;
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (xgt.f(ajwoVar)) {
            ajwoVar.getClass();
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aoaq.b);
            ajwoVar.c(aihlVarCheckIsLite5);
            Object objK4 = ajwoVar.j.k(aihlVarCheckIsLite5.d);
            aoar aoarVar3 = (aoar) (objK4 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK4));
            if ((aoarVar3.b & 32) != 0) {
                str2 = aoarVar3.f;
            }
        }
        xgt xgtVar = new xgt(iIntValue, argnVar3, str, str2, optionalOf, ajijVar, str3);
        ae(xgtVar, xguVar, amddVar, amddVar2, optional, xieVar);
        return xgtVar;
    }

    @Override // defpackage.xfq
    public final void S(int i, xgu xguVar, argn argnVar, String str, String str2, amdd amddVar, amdd amddVar2, xie xieVar) {
        if (X(xieVar, i) == null) {
            vxz vxzVar = this.k;
            ae(new xgt(i, argnVar, str, str2, Optional.of(vxzVar), xieVar.e, a() == null ? this.u : null), xguVar, amddVar, amddVar2, Optional.ofNullable(null), xieVar);
        }
    }

    public final xgt T(xgt xgtVar) {
        xgt xgtVarB;
        int i = tqr.a;
        return (!this.r.k(1073828951) || (xgtVarB = ((xhk) this.f.io()).b(xgtVar.a)) == null) ? xgtVar : xgtVarB;
    }

    protected argn U(int i, int i2) {
        xgt xgtVarA = a();
        if (xgtVarA == null) {
            return null;
        }
        aihf aihfVarCreateBuilder = argn.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        argn argnVar = (argn) aihfVarCreateBuilder.instance;
        argnVar.b |= 2;
        argnVar.d = i;
        if (i2 > 0) {
            aihfVarCreateBuilder.copyOnWrite();
            argn argnVar2 = (argn) aihfVarCreateBuilder.instance;
            argnVar2.b |= 4;
            argnVar2.e = i2;
        } else {
            aihfVarCreateBuilder.copyOnWrite();
            argn argnVar3 = (argn) aihfVarCreateBuilder.instance;
            argnVar3.b |= 4;
            argnVar3.e = 0;
        }
        int iA = xgtVarA.a(i);
        aihfVarCreateBuilder.copyOnWrite();
        argn argnVar4 = (argn) aihfVarCreateBuilder.instance;
        argnVar4.b |= 8;
        argnVar4.f = iA;
        return (argn) aihfVarCreateBuilder.build();
    }

    public final void V(xgt xgtVar, Consumer consumer) {
        consumer.r(T(xgtVar));
    }

    public void W(xgt xgtVar, boolean z) {
        this.s = Optional.ofNullable(xgtVar);
        this.g.execute(new wdd(this, xgtVar, 7));
        if (this.h && z) {
            ac();
        }
    }

    @Override // defpackage.xgn
    public xgt a() {
        Optional optionalOfNullable = this.s;
        xfs xfsVar = new xfs(this);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(xfsVar.a.T((xgt) optionalOfNullable.get()));
        }
        return (xgt) optionalOfNullable.orElse(null);
    }

    @Override // defpackage.xgn
    public final xgt b(xhc xhcVar, ajwo ajwoVar, amdd amddVar) {
        return c(xhcVar, null, ajwoVar, amddVar, null);
    }

    @Override // defpackage.xgn
    public final xgt c(xhc xhcVar, xgu xguVar, ajwo ajwoVar, amdd amddVar, amdd amddVar2) {
        return R(xhcVar.a, xguVar, ajwoVar, amddVar, amddVar2, Y());
    }

    @Override // defpackage.xhy
    public final /* bridge */ /* synthetic */ xhz d(xgz xgzVar) {
        if (xgzVar == null) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/logging/interaction/DefaultInteractionLogger", "logAttachChild", 580, "DefaultInteractionLogger.java")).t("null VE container encountered in logAttachChild");
        } else {
            Z(new xga(this, xgzVar, Y(), 1));
        }
        return this;
    }

    @Override // defpackage.xhy
    public final /* bridge */ /* synthetic */ xhz e(xgz xgzVar, xgz xgzVar2) {
        if (xgzVar2 == null) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/logging/interaction/DefaultInteractionLogger", "logAttachChild", 600, "DefaultInteractionLogger.java")).t("null VE container encountered in logAttachChild");
            return this;
        }
        Z(new xfw(this, xgzVar, xgzVar2, Y(), 0));
        return this;
    }

    @Override // defpackage.xhy
    public final ajwo f(ajwo ajwoVar) {
        return xgh.a(a(), ajwoVar);
    }

    @Override // defpackage.xgn
    public final argn g(Object obj, xhc xhcVar) {
        return h(obj, xhcVar, -1);
    }

    @Override // defpackage.xgn
    public final argn h(Object obj, xhc xhcVar, final int i) {
        if (a() == null) {
            return null;
        }
        final int i2 = xhcVar.a;
        return (argn) j$.util.Map.EL.computeIfAbsent(this.m, new xha(obj, i2, i), new Function() { // from class: xgc
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public final /* synthetic */ Function mo840andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                argn argnVarU = this.a.U(i2, i);
                argnVarU.getClass();
                return argnVarU;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.xhy
    public String i() {
        xgt xgtVarA = a();
        if (xgtVarA != null) {
            return xgtVarA.a;
        }
        String str = this.u;
        return str == null ? "" : str;
    }

    @Override // defpackage.xgn
    public final void j(Object obj, xhc xhcVar, int i) {
        int i2 = xhcVar.a;
        j$.util.Map.EL.computeIfAbsent(this.m, new xha(obj, i2, -1), new xfu(i2, i, 0));
    }

    @Override // defpackage.xgn
    public final void k(List list) {
        Z(new hrr((Object) this, (Object) list, (Object) Y(), 12, (byte[]) null));
    }

    @Override // defpackage.xgn
    public final void l(xgz xgzVar) {
        if (xgzVar == null) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/logging/interaction/DefaultInteractionLogger", "logAttachVisibleChild", 629, "DefaultInteractionLogger.java")).t("null VE container encountered in logAttachVisibleChild");
        } else {
            Z(new xga(this, xgzVar, Y(), 0));
        }
    }

    @Override // defpackage.xgn
    public final void m(xgz xgzVar, xgz xgzVar2) {
        if (xgzVar != null) {
            Z(new hnw((Object) this, (Object) xgzVar, (Object) xgzVar2, (Object) Y(), 7));
        } else {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/logging/interaction/DefaultInteractionLogger", "logAttachVisibleChild", 647, "DefaultInteractionLogger.java")).t("null VE container encountered in logAttachVisibleChild");
        }
    }

    @Override // defpackage.xgn
    public final void n(List list) {
        if (list.isEmpty()) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/logging/interaction/DefaultInteractionLogger", "logAttachVisibleChildren", 673, "DefaultInteractionLogger.java")).t("empty VE container list encountered in logAttachVisibleChildren");
        } else {
            Z(new hrr((Object) this, (Object) list, (Object) Y(), 11, (byte[]) null));
        }
    }

    @Override // defpackage.xhz
    public final void o(ameb amebVar, xgz xgzVar, amdd amddVar) {
        Z(new xgb(this, amebVar, xgzVar, amddVar, Y(), 0));
    }

    @Override // defpackage.xhz
    public final void p(xgz xgzVar, amdd amddVar) {
        q(xgzVar, null, amddVar);
    }

    @Override // defpackage.xhz
    public final void q(xgz xgzVar, atqe atqeVar, amdd amddVar) {
        Z(new hsl(this, xgzVar, atqeVar, amddVar, Y(), 2));
    }

    @Override // defpackage.xhy
    public final void r(String str) {
        aa(new hrr((Object) this, (Object) str, (Object) Y(), 10, (byte[]) null));
    }

    @Override // defpackage.xhy
    public final void s(xgz xgzVar, String str) {
        aa(new hnw(this, xgzVar, (Object) str, Y(), 8));
    }

    @Override // defpackage.xhy
    public final void t() {
        xie xieVarY = Y();
        if (ad(xieVarY)) {
            return;
        }
        ab(new gpd(this.c, 11), xieVarY);
        this.d.c(a());
    }

    @Override // defpackage.xgn
    public final void u() {
        N(Y());
    }

    @Override // defpackage.xgn
    public final void v() {
        O(Y());
    }

    @Override // defpackage.xhz
    public final void w(xgz xgzVar, amdd amddVar) {
        x(xgzVar, null, amddVar);
    }

    @Override // defpackage.xhz
    public final void x(xgz xgzVar, atqd atqdVar, amdd amddVar) {
        Z(new xgb(this, xgzVar, atqdVar, amddVar, Y(), 1));
    }

    @Override // defpackage.xgn
    public final void y(MessageLite messageLite, aigj aigjVar, amdd amddVar) {
        if (messageLite != null) {
            amud amudVarA = xia.a(messageLite);
            if (amudVarA != null) {
                aigjVar = amudVarA.d;
            }
            if (aigjVar != null) {
                Z(new hnw(this, (xgz) new xgj(aigjVar, amudVarA), (Object) amddVar, Y(), 6));
            }
        }
    }

    @Override // defpackage.xgn
    public final void z(final Consumer consumer) {
        final xie xieVarY = Y();
        Z(new Consumer() { // from class: xft
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void r(Object obj) {
                final xgt xgtVar = (xgt) obj;
                final xge xgeVar = this.a;
                final Consumer consumer2 = consumer;
                final xie xieVar = xieVarY;
                xgeVar.g.execute(new Runnable() { // from class: xfx
                    @Override // java.lang.Runnable
                    public final void run() {
                        xge xgeVar2 = xgeVar;
                        consumer2.r(new aaok(xgeVar2.c, xgeVar2.e, xgtVar, xieVar));
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        });
    }
}
