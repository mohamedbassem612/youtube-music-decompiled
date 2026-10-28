package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wmk {
    public final wmo a;
    public final Set b;
    public final mbc c;
    public final sxz d;
    public final wlu e;
    public final MessageLite f;
    public final zza g;
    public final boolean h;
    public final awmi i = new awmp(new aho(11));
    public final vxz j;
    public final dov k;
    private final Set l;
    private final awmd m;
    private final awmd n;
    private final awmd o;
    private final awmd p;

    public wmk(dov dovVar, wmo wmoVar, Set set, Set set2, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, mbc mbcVar, sxz sxzVar, vxz vxzVar, wlu wluVar, MessageLite messageLite, zza zzaVar, boolean z) {
        this.k = dovVar;
        this.a = wmoVar;
        this.l = set;
        this.b = set2;
        this.m = awmdVar;
        this.n = awmdVar2;
        this.o = awmdVar3;
        this.p = awmdVar4;
        this.c = mbcVar;
        this.d = sxzVar;
        this.j = vxzVar;
        this.e = wluVar;
        this.f = messageLite;
        this.g = zzaVar;
        this.h = z;
    }

    public static final tmt b(Map map, wmk wmkVar, alop alopVar) {
        return yno.ee(map, alopVar, wmkVar.c, true);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, mbc] */
    private final void f(alop alopVar) {
        affd affdVarM;
        List list;
        wlu wluVar = this.e;
        aihf aihfVarB = wluVar.B();
        ((wjr) this.m.io()).H(aihfVarB, alopVar);
        ((wkd) this.n.io()).b(aihfVarB, alopVar);
        wmy wmyVar = (wmy) this.o.io();
        if (alopVar != null) {
            alyr alyrVar = alopVar.k;
            if (alyrVar == null) {
                alyrVar = alyr.a;
            }
            if (alyrVar.c.size() > 0) {
                zwa zwaVar = wluVar.u;
                wmyVar.a = true;
                if (((vxz) wmyVar.d).l(84, 45845664L, false)) {
                    try {
                        affdVarM = ((syn) wmyVar.c).m(zwaVar);
                    } catch (IllegalStateException e) {
                        if (!zwaVar.m()) {
                            throw e;
                        }
                    }
                } else {
                    affdVarM = ((syn) wmyVar.c).m(zwaVar);
                }
                wjr wjrVarK = ((wmx) aguu.aw((Context) wmyVar.b, wmx.class, affdVarM)).K();
                ?? r2 = wjrVarK.a;
                if (aihfVarB != null) {
                    aloo alooVar = ((InnertubeContext$InnerTubeContext) aihfVarB.instance).f;
                    if (alooVar == null) {
                        alooVar = aloo.a;
                    }
                    alyr alyrVar2 = alooVar.f;
                    if (alyrVar2 == null) {
                        alyrVar2 = alyr.a;
                    }
                    list = alyrVar2.c;
                } else {
                    list = agpi.a;
                }
                alyr alyrVar3 = alopVar.k;
                if (alyrVar3 == null) {
                    alyrVar3 = alyr.a;
                }
                zik.cj(r2, list, alyrVar3.c, wjrVarK.b);
            }
        }
        dov dovVar = (dov) this.p.io();
        if (alopVar != null && (alopVar.b & 33554432) != 0 && !alopVar.l.isEmpty()) {
            ((wnb) dovVar.a).b(alopVar.l);
        }
        if (alopVar != null) {
            for (wmg wmgVar : this.l) {
                wlu wluVar2 = this.e;
                wmgVar.d();
                wmgVar.c(wluVar2, alopVar, wluVar2.h());
            }
        }
    }

    public final long a(agfr agfrVar) {
        if (((Boolean) agfrVar.io()).booleanValue()) {
            return this.c.b();
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final wlz c(tnm tnmVar, aigm aigmVar, MessageLite messageLite, zza zzaVar, agfr agfrVar) {
        zzaVar.jk();
        tgs tgsVar = this.e.x;
        if (tgsVar != null) {
            tgsVar.c();
        }
        long jA = a(agfrVar);
        aiix parserForType = messageLite.getParserForType();
        parserForType.getClass();
        ?? F = parserForType.f(aigmVar, ExtensionRegistryLite.getGeneratedRegistry());
        F.getClass();
        alop alopVar = (alop) this.d.a(F);
        long jA2 = a(agfrVar);
        if (tgsVar != null) {
            tgsVar.b();
        }
        aigj aigjVar = null;
        if (alopVar != null && !alopVar.n.E()) {
            aigjVar = alopVar.n;
        }
        alopVar.getClass();
        return new wlz(F, alopVar, jA2 - jA, tnmVar.a(), aigjVar);
    }

    public final ListenableFuture d(List list, final long j, final tnm tnmVar, final tns tnsVar, final agfr agfrVar, final boolean z, final int i, final boolean z2, final wlz wlzVar, final List list2, final List list3, final List list4, boolean z3, final awql awqlVar) {
        final boolean z4;
        boolean zBooleanValue = ((Boolean) agfrVar.io()).booleanValue();
        final MessageLite messageLite = wlzVar.a;
        if (!zBooleanValue) {
            z4 = false;
            break;
        }
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                z4 = false;
                break;
            }
            if (((wlx) it.next()).e(messageLite)) {
                z4 = true;
                break;
            }
        }
        long jA = a(agfrVar);
        f((alop) this.d.a(messageLite));
        for (wlx wlxVar : this.b) {
            if (wlxVar.e(messageLite)) {
                f(wlxVar.c(messageLite));
            }
        }
        long jA2 = a(agfrVar) - jA;
        final int i2 = (int) jA2;
        if (jA2 != i2) {
            throw new ArithmeticException();
        }
        ListenableFuture listenableFutureK = ahno.aw(list).k(new Callable() { // from class: wmi
            /* JADX WARN: Code duplicated, block: B:122:0x0298 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:123:0x0290 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:125:0x023f A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:126:0x023f A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:128:0x023f A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:130:0x023f A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:132:0x023f A[DONT_GENERATE, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:71:0x01f3  */
            /* JADX WARN: Code duplicated, block: B:73:0x020b  */
            /* JADX WARN: Code duplicated, block: B:76:0x0225  */
            /* JADX WARN: Code duplicated, block: B:78:0x022b  */
            /* JADX WARN: Code duplicated, block: B:80:0x024e  */
            /* JADX WARN: Code duplicated, block: B:82:0x0254  */
            /* JADX WARN: Code duplicated, block: B:83:0x025e  */
            /* JADX WARN: Code duplicated, block: B:85:0x0264  */
            /* JADX WARN: Code duplicated, block: B:86:0x0277  */
            /* JADX WARN: Code duplicated, block: B:88:0x027d  */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                tmt tmtVarA;
                MessageLite messageLite2;
                tmt tmtVar;
                wmi wmiVar;
                int i3;
                boolean z5;
                agke agkeVarG;
                int i4;
                agqs agqsVarListIterator;
                agqs agqsVar;
                int i5;
                tnm tnmVar2;
                wlz wlzVar2;
                boolean z6;
                wkz wkzVar;
                afut afutVar;
                wlz wlzVar3;
                afus afusVar;
                tnm tnmVar3;
                wkz wkzVar2;
                String str;
                afuy afuyVar;
                MessageLite messageLite3 = messageLite;
                tnm tnmVar4 = tnmVar;
                wmk wmkVar = this.a;
                wlu wluVar = wmkVar.e;
                if (!wluVar.x()) {
                    tmtVarA = null;
                    break;
                }
                Map map = tnmVar4.e;
                alop alopVar = (alop) wmkVar.d.a(messageLite3);
                if (wmkVar.j.l(38, 45686717L, false)) {
                    alopVar.getClass();
                    tmt tmtVarB = wmk.b(map, wmkVar, alopVar);
                    if (tmtVarB == null) {
                        Iterator it2 = wmkVar.b.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                tmtVarA = null;
                                break;
                            }
                            wlx wlxVar2 = (wlx) it2.next();
                            if (wlxVar2.e(messageLite3)) {
                                alop alopVarC = wlxVar2.c(messageLite3);
                                alopVarC.getClass();
                                tmt tmtVarB2 = wmk.b(map, wmkVar, alopVarC);
                                if (tmtVarB2 != null) {
                                    tmtVarA = tmtVarB2;
                                    break;
                                }
                            }
                        }
                    } else {
                        tmtVarA = tmtVarB;
                    }
                } else {
                    tmtVarA = yno.ee(map, alopVar, wmkVar.c, false);
                }
                if (tmtVarA != null) {
                    List list5 = list4;
                    if (!list5.isEmpty()) {
                        tms tmsVar = new tms(tmtVarA);
                        tmsVar.c(list5);
                        tmtVarA = tmsVar.a();
                    }
                }
                long j2 = j;
                agfr agfrVar2 = agfrVar;
                int iP = a.p(wmkVar.a(agfrVar2) - j2);
                if (!((Boolean) agfrVar2.io()).booleanValue() || z) {
                    messageLite2 = messageLite3;
                    tmtVar = tmtVarA;
                    wmiVar = this;
                } else {
                    int i6 = i;
                    boolean z7 = z4;
                    int i7 = i2;
                    wlz wlzVar4 = wlzVar;
                    String str2 = wluVar.t;
                    wkz wkzVarA = wla.a();
                    wkzVarA.a = str2;
                    wkzVarA.z(i6);
                    wkzVarA.u(wluVar.i());
                    wkzVarA.q(wluVar.v());
                    wkzVarA.r(z7);
                    wkzVarA.w(wlzVar4.c);
                    wkzVarA.y(wlzVar4.d);
                    wkzVarA.v(iP);
                    wkzVarA.x(i7);
                    wkzVarA.c = wlzVar4.e;
                    afvl afvlVarB = afty.b();
                    boolean z8 = (afwt.a(afvlVarB) ? afvlVarB.g() : null) != null;
                    wkzVarA.s(z8);
                    if (z8) {
                        HashMap map2 = new HashMap();
                        int i8 = -1;
                        if (afty.b() instanceof afum) {
                            afum afumVar = (afum) afty.b();
                            int iC = ((afum) afty.b()).c();
                            if (iC == Integer.MIN_VALUE) {
                                agkeVarG = agpi.a;
                                i4 = 0;
                                z5 = true;
                            } else {
                                afwy[] afwyVarArrE = ((afwy) afumVar.a.e.get()).e(iC);
                                int length = afwyVarArrE.length;
                                int[] iArr = new int[length];
                                z5 = true;
                                int[] iArr2 = new int[length];
                                Arrays.fill(iArr, -1);
                                Arrays.fill(iArr2, -1);
                                i3 = 0;
                                for (int i9 = 0; i9 < length; i9++) {
                                    afwy afwyVar = afwyVarArrE[i9];
                                    int iA = afwyVar.a() - iC;
                                    if (iA >= 0 && afwyVar.d()) {
                                        int i10 = iArr[iA];
                                        if (i10 != -1) {
                                            iArr2[i9] = i10;
                                        }
                                        iArr[iA] = i9;
                                    }
                                }
                                int[] iArr3 = new int[length];
                                Arrays.fill(iArr3, -1);
                                agjz agjzVar = new agjz(4);
                                iArr3[0] = 0;
                                int i11 = 0;
                                int i12 = 0;
                                while (i11 < length) {
                                    int[] iArr4 = iArr2;
                                    int i13 = iArr3[i11];
                                    if (i13 == i8) {
                                        break;
                                    }
                                    afwy afwyVar2 = afwyVarArrE[i13];
                                    if (i13 != 0) {
                                        int iA2 = afwyVar2.a();
                                        agkj agkjVar = agpn.b;
                                        agjzVar.h(new afut(afwyVar2.f(iA2, agkjVar, agkjVar), afuy.e(afwyVar2.g, afwyVar2.b())));
                                    }
                                    int i14 = iArr[i13];
                                    if (i14 != -1) {
                                        for (int i15 = -1; i14 != i15; i15 = -1) {
                                            i12++;
                                            iArr3[i12] = i14;
                                            i14 = iArr4[i14];
                                        }
                                    }
                                    i11++;
                                    iArr2 = iArr4;
                                    iArr3 = iArr3;
                                    i8 = -1;
                                }
                                agkeVarG = agjzVar.g();
                            }
                            agqsVarListIterator = agkeVarG.listIterator(i4);
                            agqsVarListIterator.getClass();
                            while (true) {
                                agqsVar = agqsVarListIterator;
                                messageLite2 = messageLite3;
                                tmtVar = tmtVarA;
                                i5 = i6;
                                if (agqsVarListIterator.hasNext()) {
                                    E next = agqsVar.next();
                                    next.getClass();
                                    afutVar = (afut) next;
                                    wlzVar3 = wlzVar4;
                                    afusVar = afutVar.a;
                                    tnmVar3 = tnmVar4;
                                    wkzVar2 = wkzVarA;
                                    if (afusVar.e != -1) {
                                        throw new IllegalStateException("span has to be child or grandchild of parseNetworkResponseAsync span");
                                    }
                                    str = afusVar.c;
                                    str.getClass();
                                    yno.ei(str, map2, a.p(afusVar.g));
                                    afuyVar = afutVar.b;
                                    switch (str.hashCode()) {
                                        case -1028905677:
                                            if (str.equals("fut tasks")) {
                                                yno.ei("fut tasks size", map2, yno.eV(afuyVar, wln.d));
                                                yno.ei("fut tasks count", map2, yno.eV(afuyVar, wln.g));
                                            }
                                            break;
                                        case -640221188:
                                            if (str.equals("fut entities")) {
                                                yno.ei("fut entities size", map2, yno.eV(afuyVar, wln.c));
                                                yno.ei("fut entities count", map2, yno.eV(afuyVar, wln.e));
                                            }
                                            break;
                                        case 1187781074:
                                            if (str.equals("parseFut")) {
                                                yno.ei("fut size", map2, yno.eV(afuyVar, wln.a));
                                            }
                                            break;
                                        case 1453553970:
                                            if (str.equals("fut elements")) {
                                                yno.ei("fut elements size", map2, yno.eV(afuyVar, wln.b));
                                                yno.ei("fut elements count", map2, yno.eV(afuyVar, wln.f));
                                            }
                                            break;
                                    }
                                    wlzVar4 = wlzVar3;
                                    agqsVarListIterator = agqsVar;
                                    messageLite3 = messageLite2;
                                    tmtVarA = tmtVar;
                                    i6 = i5;
                                    tnmVar4 = tnmVar3;
                                    wkzVarA = wkzVar2;
                                } else {
                                    tnmVar2 = tnmVar4;
                                    wlzVar2 = wlzVar4;
                                    z6 = false;
                                    wkzVar = wkzVarA;
                                    wkzVar.k(((Number) j$.util.Map.EL.getOrDefault(map2, "parseFut", 0)).intValue());
                                    wkzVar.l(((Number) j$.util.Map.EL.getOrDefault(map2, "processFutAsync", 0)).intValue());
                                    wkzVar.f(((Number) j$.util.Map.EL.getOrDefault(map2, "fut entities", 0)).intValue());
                                    wkzVar.c(((Number) j$.util.Map.EL.getOrDefault(map2, "fut elements", 0)).intValue());
                                    wkzVar.o(((Number) j$.util.Map.EL.getOrDefault(map2, "fut tasks", 0)).intValue());
                                    wkzVar.j(((Number) j$.util.Map.EL.getOrDefault(map2, "fut entity mutation", 0)).intValue());
                                    wkzVar.i(((Number) j$.util.Map.EL.getOrDefault(map2, "fut entity mutation persistent commit async", 0)).intValue() + ((Number) j$.util.Map.EL.getOrDefault(map2, "fut entity mutation persistent future", 0)).intValue());
                                    wkzVar.h(((Number) j$.util.Map.EL.getOrDefault(map2, "fut entity mutation in memory commit async", 0)).intValue() + ((Number) j$.util.Map.EL.getOrDefault(map2, "fut entity mutation in memory future", 0)).intValue());
                                    wkzVar.m(((Number) j$.util.Map.EL.getOrDefault(map2, "fut size", 0)).intValue());
                                    wkzVar.g(((Number) j$.util.Map.EL.getOrDefault(map2, "fut entities size", 0)).intValue());
                                    wkzVar.d(((Number) j$.util.Map.EL.getOrDefault(map2, "fut elements size", 0)).intValue());
                                    wkzVar.p(((Number) j$.util.Map.EL.getOrDefault(map2, "fut tasks size", 0)).intValue());
                                    wkzVar.e(((Number) j$.util.Map.EL.getOrDefault(map2, "fut entities count", 0)).intValue());
                                    wkzVar.b(((Number) j$.util.Map.EL.getOrDefault(map2, "fut elements count", 0)).intValue());
                                    wkzVar.n(((Number) j$.util.Map.EL.getOrDefault(map2, "fut tasks count", 0)).intValue());
                                }
                            }
                        } else {
                            i3 = 0;
                            z5 = true;
                            agkeVarG = agpi.a;
                        }
                        i4 = i3;
                        agqsVarListIterator = agkeVarG.listIterator(i4);
                        agqsVarListIterator.getClass();
                        while (true) {
                            agqsVar = agqsVarListIterator;
                            messageLite2 = messageLite3;
                            tmtVar = tmtVarA;
                            i5 = i6;
                            if (agqsVarListIterator.hasNext()) {
                                E next2 = agqsVar.next();
                                next2.getClass();
                                afutVar = (afut) next2;
                                wlzVar3 = wlzVar4;
                                afusVar = afutVar.a;
                                tnmVar3 = tnmVar4;
                                wkzVar2 = wkzVarA;
                                if (afusVar.e != -1) {
                                    throw new IllegalStateException("span has to be child or grandchild of parseNetworkResponseAsync span");
                                }
                                str = afusVar.c;
                                str.getClass();
                                yno.ei(str, map2, a.p(afusVar.g));
                                afuyVar = afutVar.b;
                                switch (str.hashCode()) {
                                    case -1028905677:
                                        if (str.equals("fut tasks")) {
                                            yno.ei("fut tasks size", map2, yno.eV(afuyVar, wln.d));
                                            yno.ei("fut tasks count", map2, yno.eV(afuyVar, wln.g));
                                        }
                                        break;
                                    case -640221188:
                                        if (str.equals("fut entities")) {
                                            yno.ei("fut entities size", map2, yno.eV(afuyVar, wln.c));
                                            yno.ei("fut entities count", map2, yno.eV(afuyVar, wln.e));
                                        }
                                        break;
                                    case 1187781074:
                                        if (str.equals("parseFut")) {
                                            yno.ei("fut size", map2, yno.eV(afuyVar, wln.a));
                                        }
                                        break;
                                    case 1453553970:
                                        if (str.equals("fut elements")) {
                                            yno.ei("fut elements size", map2, yno.eV(afuyVar, wln.b));
                                            yno.ei("fut elements count", map2, yno.eV(afuyVar, wln.f));
                                        }
                                        break;
                                }
                                wlzVar4 = wlzVar3;
                                agqsVarListIterator = agqsVar;
                                messageLite3 = messageLite2;
                                tmtVarA = tmtVar;
                                i6 = i5;
                                tnmVar4 = tnmVar3;
                                wkzVarA = wkzVar2;
                            } else {
                                tnmVar2 = tnmVar4;
                                wlzVar2 = wlzVar4;
                                z6 = false;
                                wkzVar = wkzVarA;
                                wkzVar.k(((Number) j$.util.Map.EL.getOrDefault(map2, "parseFut", 0)).intValue());
                                wkzVar.l(((Number) j$.util.Map.EL.getOrDefault(map2, "processFutAsync", 0)).intValue());
                                wkzVar.f(((Number) j$.util.Map.EL.getOrDefault(map2, "fut entities", 0)).intValue());
                                wkzVar.c(((Number) j$.util.Map.EL.getOrDefault(map2, "fut elements", 0)).intValue());
                                wkzVar.o(((Number) j$.util.Map.EL.getOrDefault(map2, "fut tasks", 0)).intValue());
                                wkzVar.j(((Number) j$.util.Map.EL.getOrDefault(map2, "fut entity mutation", 0)).intValue());
                                wkzVar.i(((Number) j$.util.Map.EL.getOrDefault(map2, "fut entity mutation persistent commit async", 0)).intValue() + ((Number) j$.util.Map.EL.getOrDefault(map2, "fut entity mutation persistent future", 0)).intValue());
                                wkzVar.h(((Number) j$.util.Map.EL.getOrDefault(map2, "fut entity mutation in memory commit async", 0)).intValue() + ((Number) j$.util.Map.EL.getOrDefault(map2, "fut entity mutation in memory future", 0)).intValue());
                                wkzVar.m(((Number) j$.util.Map.EL.getOrDefault(map2, "fut size", 0)).intValue());
                                wkzVar.g(((Number) j$.util.Map.EL.getOrDefault(map2, "fut entities size", 0)).intValue());
                                wkzVar.d(((Number) j$.util.Map.EL.getOrDefault(map2, "fut elements size", 0)).intValue());
                                wkzVar.p(((Number) j$.util.Map.EL.getOrDefault(map2, "fut tasks size", 0)).intValue());
                                wkzVar.e(((Number) j$.util.Map.EL.getOrDefault(map2, "fut entities count", 0)).intValue());
                                wkzVar.b(((Number) j$.util.Map.EL.getOrDefault(map2, "fut elements count", 0)).intValue());
                                wkzVar.n(((Number) j$.util.Map.EL.getOrDefault(map2, "fut tasks count", 0)).intValue());
                            }
                        }
                    } else {
                        messageLite2 = messageLite3;
                        tnmVar2 = tnmVar4;
                        tmtVar = tmtVarA;
                        z6 = false;
                        i5 = i6;
                        wlzVar2 = wlzVar4;
                        wkzVar = wkzVarA;
                        z5 = true;
                    }
                    wla wlaVarA = wkzVar.a();
                    tnm tnmVar5 = tnmVar2;
                    if (tnmVar5 instanceof tmy) {
                        tmy tmyVar = (tmy) tnmVar5;
                        int i16 = wlzVar2.b.o;
                        aihf aihfVarCreateBuilder = axgi.a.createBuilder();
                        long j3 = wlaVarA.a;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgi axgiVar = (axgi) aihfVarCreateBuilder.instance;
                        axgiVar.b |= 1;
                        axgiVar.c = j3;
                        int i17 = wlaVarA.w;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgi axgiVar2 = (axgi) aihfVarCreateBuilder.instance;
                        axgiVar2.b |= 1048576;
                        axgiVar2.w = i17;
                        int i18 = wlaVarA.c;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgi axgiVar3 = (axgi) aihfVarCreateBuilder.instance;
                        axgiVar3.b |= 4;
                        axgiVar3.e = i18;
                        int i19 = wlaVarA.d;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgi axgiVar4 = (axgi) aihfVarCreateBuilder.instance;
                        axgiVar4.b |= 8;
                        axgiVar4.f = i19;
                        boolean z9 = wlaVarA.f;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgi axgiVar5 = (axgi) aihfVarCreateBuilder.instance;
                        axgiVar5.b |= 524288;
                        axgiVar5.v = z9;
                        int i20 = wlaVarA.g;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgi axgiVar6 = (axgi) aihfVarCreateBuilder.instance;
                        axgiVar6.b |= 32;
                        axgiVar6.h = i20;
                        int i21 = wlaVarA.b;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgi axgiVar7 = (axgi) aihfVarCreateBuilder.instance;
                        axgiVar7.b |= 2;
                        axgiVar7.d = i21;
                        int i22 = wlaVarA.h;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgi axgiVar8 = (axgi) aihfVarCreateBuilder.instance;
                        axgiVar8.b |= 64;
                        axgiVar8.i = i22;
                        int i23 = wlaVarA.i;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgi axgiVar9 = (axgi) aihfVarCreateBuilder.instance;
                        axgiVar9.b |= SemanticState.Focused;
                        axgiVar9.j = i23;
                        int i24 = wlaVarA.j;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgi axgiVar10 = (axgi) aihfVarCreateBuilder.instance;
                        axgiVar10.b |= SemanticState.Hidden;
                        axgiVar10.k = i24;
                        int i25 = wlaVarA.k;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgi axgiVar11 = (axgi) aihfVarCreateBuilder.instance;
                        axgiVar11.b |= 65536;
                        axgiVar11.s = i25;
                        int i26 = wlaVarA.l;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgi axgiVar12 = (axgi) aihfVarCreateBuilder.instance;
                        axgiVar12.b |= 131072;
                        axgiVar12.t = i26;
                        int i27 = wlaVarA.m;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgi axgiVar13 = (axgi) aihfVarCreateBuilder.instance;
                        axgiVar13.b |= 262144;
                        axgiVar13.u = i27;
                        int i28 = wlaVarA.n;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgi axgiVar14 = (axgi) aihfVarCreateBuilder.instance;
                        axgiVar14.b |= SemanticState.LiveRegion;
                        axgiVar14.l = i28;
                        int i29 = wlaVarA.o;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgi axgiVar15 = (axgi) aihfVarCreateBuilder.instance;
                        axgiVar15.b |= SemanticState.ReadOnly;
                        axgiVar15.m = i29;
                        int i30 = wlaVarA.p;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgi axgiVar16 = (axgi) aihfVarCreateBuilder.instance;
                        axgiVar16.b |= SemanticState.Modal;
                        axgiVar16.n = i30;
                        int i31 = wlaVarA.q;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgi axgiVar17 = (axgi) aihfVarCreateBuilder.instance;
                        axgiVar17.b |= SemanticState.Obscured;
                        axgiVar17.o = i31;
                        int i32 = wlaVarA.s;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgi axgiVar18 = (axgi) aihfVarCreateBuilder.instance;
                        axgiVar18.b |= SemanticState.Multiline;
                        axgiVar18.p = i32;
                        int i33 = wlaVarA.r;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgi axgiVar19 = (axgi) aihfVarCreateBuilder.instance;
                        axgiVar19.b |= 16384;
                        axgiVar19.q = i33;
                        int i34 = wlaVarA.t;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgi axgiVar20 = (axgi) aihfVarCreateBuilder.instance;
                        axgiVar20.b |= 32768;
                        axgiVar20.r = i34;
                        aihn aihnVarBuild = aihfVarCreateBuilder.build();
                        aihnVarBuild.getClass();
                        aihf aihfVarCreateBuilder2 = axgq.a.createBuilder();
                        aihfVarCreateBuilder2.copyOnWrite();
                        axgq axgqVar = (axgq) aihfVarCreateBuilder2.instance;
                        axgqVar.c = (axgi) aihnVarBuild;
                        axgqVar.b |= 1;
                        aihfVarCreateBuilder2.copyOnWrite();
                        axgq axgqVar2 = (axgq) aihfVarCreateBuilder2.instance;
                        axgqVar2.b |= 2;
                        axgqVar2.d = i16;
                        long j4 = tmyVar.b;
                        long j5 = tmyVar.a;
                        aihfVarCreateBuilder2.copyOnWrite();
                        axgq axgqVar3 = (axgq) aihfVarCreateBuilder2.instance;
                        axgqVar3.b |= 8;
                        axgqVar3.f = j4 - j5;
                        int i35 = tmyVar.c;
                        aihfVarCreateBuilder2.copyOnWrite();
                        axgq axgqVar4 = (axgq) aihfVarCreateBuilder2.instance;
                        axgqVar4.b |= 4;
                        axgqVar4.e = i35;
                        aihn aihnVarBuild2 = aihfVarCreateBuilder2.build();
                        aihnVarBuild2.getClass();
                        wkzVar.t(agke.q((axgq) aihnVarBuild2));
                        wlaVarA = wkzVar.a();
                    }
                    wmiVar = this;
                    tns tnsVar2 = tnsVar;
                    wla wlaVar = (wla) tnsVar2.p(wla.class);
                    if (wlaVar != null) {
                        if (wlaVar.x == i5 && !z2) {
                            wkz wkzVar3 = new wkz(wlaVarA);
                            wkzVar3.r((wlaVarA.e || wlaVar.e) ? z5 : z6);
                            wkzVar3.w(wlaVar.a + wlaVarA.a);
                            wkzVar3.y(wlaVar.w + wlaVarA.w);
                            wkzVar3.v(wlaVar.c + wlaVarA.c);
                            wkzVar3.x(wlaVar.d + wlaVarA.d);
                            wkzVar3.l(wlaVar.b + wlaVarA.b);
                            wkzVar3.k(wlaVar.g + wlaVarA.g);
                            wkzVar3.c(wlaVar.h + wlaVarA.h);
                            wkzVar3.f(wlaVar.i + wlaVarA.i);
                            wkzVar3.o(wlaVar.j + wlaVarA.j);
                            wkzVar3.j(wlaVar.k + wlaVarA.k);
                            wkzVar3.i(wlaVar.l + wlaVarA.l);
                            wkzVar3.h(wlaVar.m + wlaVarA.m);
                            wkzVar3.m(wlaVar.n + wlaVarA.n);
                            wkzVar3.d(wlaVar.o + wlaVarA.o);
                            wkzVar3.g(wlaVar.p + wlaVarA.p);
                            wkzVar3.e(wlaVar.r + wlaVarA.r);
                            wkzVar3.b(wlaVar.s + wlaVarA.s);
                            wkzVar3.n(wlaVar.t + wlaVarA.t);
                            aigj aigjVar = wlaVarA.B;
                            if (aigjVar == null) {
                                aigjVar = wlaVar.B;
                            }
                            wkzVar3.c = aigjVar;
                            agke agkeVar = wlaVar.C;
                            agke agkeVar2 = wlaVarA.C;
                            agkeVar.getClass();
                            if (!agkeVar.isEmpty()) {
                                agkeVar2.getClass();
                                if (agkeVar2.isEmpty()) {
                                    wkzVar3.t(agkeVar);
                                } else {
                                    agjz agjzVar2 = new agjz(4);
                                    agjzVar2.j(agkeVar);
                                    agjzVar2.j(agkeVar2);
                                    wkzVar3.t(agjzVar2.g());
                                }
                            }
                            wlaVarA = wkzVar3.a();
                        }
                        tnsVar2.z(wlaVar);
                    }
                    tnsVar2.K(wlaVarA);
                }
                return awqlVar.invoke(tnx.f(messageLite2, tmtVar), list2, list3);
            }
        }, MoreExecutors.directExecutor());
        if (!z3) {
            return listenableFutureK;
        }
        vdm vdmVar = new vdm(new hgo((Object) awqlVar, (Object) list2, (Object) list3, 10, (short[]) null), 12);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        long j2 = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), vdmVar);
        int i3 = ahbz.d;
        ahby ahbyVar = new ahby(listenableFutureK, IOException.class, afwiVar);
        listenableFutureK.addListener(ahbyVar, MoreExecutors.c(executorDirectExecutor, ahbyVar));
        return ahbyVar;
    }

    public final List e(Executor executor, MessageLite messageLite, zwa zwaVar) throws IOException {
        agke agkeVarG;
        agjz agjzVar = null;
        for (wlx wlxVar : this.b) {
            if (wlxVar.d(messageLite)) {
                afuu afuuVarD = afwt.d(82, "processFutAsync", afux.a, true);
                try {
                    ListenableFuture listenableFutureU = this.k.U(executor, zwaVar, wlxVar.b(messageLite));
                    afuuVarD.a(listenableFutureU);
                    afuuVarD.close();
                    if (agjzVar == null) {
                        agjzVar = new agjz(4);
                    }
                    agjzVar.h(listenableFutureU);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            afuuVarD.close();
                        } catch (Throwable th3) {
                            avkz.d(th, th3);
                        }
                        throw th2;
                    }
                }
            }
        }
        return (agjzVar == null || (agkeVarG = agjzVar.g()) == null) ? awno.a : agkeVarG;
    }
}
