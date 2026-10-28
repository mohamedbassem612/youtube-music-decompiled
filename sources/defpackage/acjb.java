package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class acjb {
    public long a;
    public long b;
    public final List c;
    public final Map d;
    public final WeakReference e;
    public final BiConsumer f;
    public boolean g;
    public acjd h;
    aciw i;
    long j;
    long k;
    public final String l;
    public final Set m;
    private final Consumer n;
    private final Consumer o;
    private final Consumer p;
    private final Supplier q;
    private final acfq r;
    private final abmt s;
    private final TreeMap t;
    private final Map u;
    private aciw v;
    private aciz w;
    private final abnz x;
    private final aciz y;

    private acjb(long j, long j2, acgr acgrVar, Consumer consumer, Consumer consumer2, Consumer consumer3, Supplier supplier, BiConsumer biConsumer, boolean z, String str, aciw aciwVar, acfq acfqVar, abmt abmtVar, abnz abnzVar, acjd... acjdVarArr) {
        this.k = 0L;
        this.m = new HashSet();
        this.y = new aciz((byte[]) null);
        this.a = j;
        this.b = j2;
        this.e = new WeakReference(acgrVar);
        this.n = consumer;
        this.p = consumer2;
        this.o = consumer3;
        this.q = supplier;
        this.f = biConsumer;
        this.g = z;
        this.d = new HashMap();
        this.c = new ArrayList();
        this.i = aciwVar;
        this.s = abmtVar;
        for (acjd acjdVar : acjdVarArr) {
            this.c.add(acjdVar);
            this.d.put(acjdVar.b(), acjdVar);
            if (abmtVar.au() || (acjdVar instanceof aciw)) {
                acjdVar.c(this);
            }
            if (acjdVar instanceof aciw) {
                aciw aciwVar2 = (aciw) acjdVar;
                if (aciwVar != null) {
                    this.j += aciwVar2.b;
                }
            }
        }
        this.j -= j2 - j;
        if (abmtVar == null || !abmtVar.au()) {
            this.h = u();
        } else {
            this.h = (acjd) aguu.J(this.c, null);
        }
        this.t = new TreeMap();
        this.u = new HashMap();
        this.l = str;
        this.r = acfqVar;
        this.x = abnzVar;
    }

    public static List F(acjb acjbVar, String str, long j, long j2, boolean z, abmt abmtVar, aunn aunnVar) {
        Pair pairCreate;
        aciu aciuVarF;
        abmt abmtVar2;
        long j3;
        aciu aciuVarK;
        aciw aciwVar;
        long j4;
        aciw aciwVar2;
        aciu aciuVar;
        String str2 = str;
        long j5 = abmtVar.cc() ? abmtVar.j() : 0L;
        long jMax = Math.max(j, j5);
        ArrayList arrayList = new ArrayList();
        synchronized (acjbVar) {
            if (acjbVar.g() && (str2 == null || acjbVar.c(str) != null)) {
                acjd acjdVar = acjbVar.h;
                aciw aciwVar3 = acjdVar instanceof aciw ? (aciw) acjdVar : null;
                if (aciwVar3 == null || !aciwVar3.j()) {
                    Pair pairAf = af(acjbVar, str2, jMax);
                    if (pairAf != null) {
                        jMax = ((Long) pairAf.first).longValue();
                    }
                    pairCreate = Pair.create(Long.valueOf(jMax), pairAf != null ? (aciw) pairAf.second : null);
                } else {
                    if (str2 != null) {
                        acjd acjdVarC = acjbVar.c(str);
                        if (acjdVarC instanceof aciw) {
                            aciwVar3 = (aciw) acjdVarC;
                        }
                    }
                    pairCreate = Pair.create(Long.valueOf(jMax), aciwVar3);
                }
                long jLongValue = ((Long) pairCreate.first).longValue();
                aciw aciwVar4 = (aciw) pairCreate.second;
                acjd acjdVar2 = acjbVar.h;
                HashSet hashSet = new HashSet();
                boolean zBT = abmtVar.bT();
                aciw aciwVar5 = aciwVar4;
                long j6 = jLongValue;
                int i = 0;
                aciw aciwVar6 = null;
                long jA = j2;
                while (jA > 0 && aciwVar5 != null && (!zBT || i < 50)) {
                    i++;
                    if (i == 50) {
                        abmtVar2 = abmtVar;
                        aj(str2, acjdVar2, abmtVar2, aunnVar);
                    } else {
                        abmtVar2 = abmtVar;
                    }
                    Map.Entry entryAi = ai(aciwVar5, j6, hashSet);
                    long jLongValue2 = entryAi != null ? ((Long) entryAi.getKey()).longValue() : -1L;
                    if (entryAi != null) {
                        aciu aciuVarK2 = am(j6, jLongValue2) ? aciwVar5.k(j6, jLongValue2, acjbVar.an(aciwVar6, aciwVar5)) : null;
                        acjd acjdVar3 = ((acjb) entryAi.getValue()).h;
                        aciwVar2 = acjdVar3 instanceof aciw ? (aciw) acjdVar3 : null;
                        if (!abmtVar2.at() || aciwVar2 == null) {
                            aciuVar = aciuVarK2;
                            j3 = j5;
                        } else {
                            aciuVar = aciuVarK2;
                            j3 = aciwVar2.c;
                        }
                    } else {
                        long j7 = aciwVar5.b;
                        if (am(j6, j7)) {
                            j3 = j6;
                            aciuVarK = aciwVar5.k(j3, j7, acjbVar.an(aciwVar6, aciwVar5));
                        } else {
                            j3 = j6;
                            aciuVarK = null;
                        }
                        acjb acjbVarA = aciwVar5.a();
                        String str3 = aciwVar5.h;
                        aciu aciuVar2 = aciuVarK;
                        if (acjbVarA.S(str3, Optional.of(new aciy(aciw.class, 0)))) {
                            hashSet.add(acjbVarA);
                            aciwVar = acjbVarA.i;
                            if (aciwVar != null) {
                                j4 = acjbVarA.b;
                            } else {
                                aciuVar = aciuVar2;
                                aciwVar2 = aciwVar5;
                                jA = 0;
                            }
                        } else {
                            acjd acjdVarA = acjbVarA.A(str3);
                            aciwVar = acjdVarA instanceof aciw ? (aciw) acjdVarA : null;
                            if (aciwVar != null) {
                                j4 = aciwVar.c;
                            }
                            aciwVar2 = aciwVar;
                            aciuVar = aciuVar2;
                        }
                        j3 = j4;
                        aciwVar2 = aciwVar;
                        aciuVar = aciuVar2;
                    }
                    if (aciuVar != null) {
                        jA -= aciuVar.a();
                        arrayList.add(aciuVar);
                        if (z) {
                            aciwVar5 = aciwVar2;
                            break;
                        }
                        aciwVar6 = aciwVar5;
                    }
                    str2 = str;
                    aciwVar5 = aciwVar2;
                    j6 = j3;
                    j5 = j5;
                }
                if (arrayList.isEmpty() && aciwVar5 != null && (aciuVarF = aciwVar5.f(aciwVar5.b)) != null) {
                    arrayList.add(aciuVarF);
                }
                if (!arrayList.isEmpty()) {
                    acjd acjdVarC2 = acjbVar.c(((aciu) arrayList.get(arrayList.size() - 1)).d());
                    acjbVar.v = acjdVarC2 instanceof aciw ? (aciw) acjdVarC2 : null;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e9 A[Catch: all -> 0x0240, TryCatch #0 {, blocks: (B:8:0x001d, B:11:0x0025, B:13:0x002b, B:15:0x0031, B:18:0x003c, B:22:0x0045, B:37:0x008f, B:44:0x00bd, B:46:0x00c1, B:47:0x00c8, B:49:0x00cc, B:51:0x00d3, B:53:0x00db, B:55:0x00e2, B:58:0x00ea, B:60:0x00f2, B:61:0x00f8, B:63:0x00fc, B:65:0x0106, B:69:0x0119, B:71:0x0125, B:72:0x012a, B:74:0x0130, B:76:0x013e, B:78:0x0146, B:80:0x014a, B:113:0x01e9, B:82:0x0155, B:84:0x015d, B:86:0x016d, B:88:0x0177, B:90:0x0181, B:92:0x0188, B:93:0x018b, B:95:0x0197, B:96:0x019d, B:98:0x01a1, B:100:0x01aa, B:102:0x01c0, B:104:0x01c7, B:107:0x01d1, B:109:0x01dd, B:118:0x01fc, B:121:0x0204, B:123:0x0208, B:125:0x0212, B:126:0x0215, B:128:0x021b, B:130:0x0233, B:132:0x0238, B:133:0x023a, B:23:0x004e, B:26:0x0056, B:32:0x0077, B:34:0x0081, B:36:0x0087, B:27:0x0060, B:29:0x0066, B:135:0x023c), top: B:141:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:115:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:148:0x01fc A[EDGE_INSN: B:148:0x01fc->B:118:0x01fc BREAK  A[LOOP:0: B:38:0x00b1->B:149:0x00b1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    public static List V(acjb acjbVar, String str, long j, boolean z, abmt abmtVar, aunn aunnVar) {
        Pair pair;
        Pair pairCreate;
        acjd acjdVarA;
        long j2;
        aciu aciuVarK;
        long j3;
        aciw aciwVar;
        long j4;
        aciv acivVar;
        aciw aciwVar2;
        acjd acjdVar;
        String str2 = str;
        long j5 = abmtVar.cc() ? abmtVar.j() : 0L;
        long jMax = Math.max(j, j5);
        ArrayList arrayList = new ArrayList();
        synchronized (acjbVar) {
            if (acjbVar.g() && (str2 == null || acjbVar.c(str) != null)) {
                acjd acjdVar2 = acjbVar.h;
                if ((acjdVar2 instanceof aciw) && ((aciw) acjdVar2).j()) {
                    acjd acjdVarC = str2 != null ? acjbVar.c(str) : null;
                    if (acjdVarC != null) {
                        acjdVar2 = acjdVarC;
                    }
                    pairCreate = Pair.create(Long.valueOf(jMax), acjdVar2);
                } else {
                    acjd acjdVarC2 = acjbVar.c(str);
                    if (str2 == null || acjdVarC2 == null) {
                        Pair pairAe = ae(acjbVar, jMax);
                        pair = pairAe != null ? new Pair((Long) pairAe.first, (acjd) pairAe.second) : null;
                    } else {
                        pair = new Pair(Long.valueOf(jMax), acjdVarC2);
                    }
                    if (pair != null) {
                        jMax = ((Long) pair.first).longValue();
                    }
                    pairCreate = Pair.create(Long.valueOf(jMax), pair != null ? (acjd) pair.second : null);
                }
                long jLongValue = ((Long) pairCreate.first).longValue();
                acjd acjdVar3 = (acjd) pairCreate.second;
                acjd acjdVar4 = acjbVar.h;
                HashSet hashSet = new HashSet();
                boolean zBT = abmtVar.bT();
                long jA = Long.MAX_VALUE;
                aciw aciwVar3 = null;
                int i = 0;
                while (jA > 0 && acjdVar3 != null && (!zBT || i < 50)) {
                    i++;
                    if (i == 50) {
                        aj(str2, acjdVar4, abmtVar, aunnVar);
                    }
                    if (acjdVar3 instanceof aciv) {
                        aciv acivVar2 = (aciv) acjdVar3;
                        acjb acjbVar2 = acivVar2.b;
                        if (acjbVar2 != null) {
                            String str3 = acivVar2.a;
                            if (acjbVar2.R(str3)) {
                                hashSet.add(acjbVar2);
                                aciw aciwVar4 = acjbVar2.i;
                                if (aciwVar4 != null) {
                                    jLongValue = acjbVar2.b;
                                    acjdVar3 = aciwVar4;
                                } else {
                                    jA = 0;
                                    acjdVar3 = acjdVar3;
                                }
                            } else {
                                acjdVarA = acjbVar2.A(str3);
                                if (acjdVarA instanceof aciw) {
                                    acjdVar3 = acjdVarA;
                                    jLongValue = ((aciw) acjdVarA).c;
                                    acjdVar3 = acjdVarA;
                                }
                            }
                        } else {
                            jA = 0;
                            acjdVar3 = acjdVar3;
                        }
                        acjdVar3 = acjdVarA;
                        aciwVar3 = null;
                    } else {
                        if (!(acjdVar3 instanceof aciw)) {
                            break;
                        }
                        aciw aciwVar5 = (aciw) acjdVar3;
                        Map.Entry entryAi = ai(aciwVar5, jLongValue, hashSet);
                        long j6 = j5;
                        long jLongValue2 = entryAi != null ? ((Long) entryAi.getKey()).longValue() : -1L;
                        if (entryAi != null) {
                            acjb acjbVar3 = (acjb) entryAi.getValue();
                            if (al(acjbVar3)) {
                                hashSet.add(acjbVar3);
                                acjdVar3 = acjdVar3;
                            } else {
                                if (am(jLongValue, jLongValue2)) {
                                    aciuVarK = aciwVar5.k(jLongValue, jLongValue2, acjbVar.an(aciwVar3, aciwVar5));
                                } else {
                                    aciuVarK = null;
                                }
                                acjd acjdVar5 = acjbVar3.h;
                                if (abmtVar.at() && (acjdVar5 instanceof aciw)) {
                                    j3 = ((aciw) acjdVar5).c;
                                    acjdVar = acjdVar5;
                                } else {
                                    j3 = j6;
                                    acjdVar = acjdVar5;
                                }
                            }
                            i = i;
                            j5 = j6;
                        } else {
                            long j7 = aciwVar5.b;
                            if (am(jLongValue, j7)) {
                                j2 = jLongValue;
                                aciuVarK = aciwVar5.k(j2, j7, acjbVar.an(aciwVar3, aciwVar5));
                            } else {
                                j2 = jLongValue;
                                aciuVarK = null;
                            }
                            acjb acjbVarA = aciwVar5.a();
                            if (abmtVar.au()) {
                                if (acjbVarA.R(acjdVar3.b())) {
                                    hashSet.add(acjbVarA);
                                    aciwVar = acjbVarA.i;
                                    if (aciwVar != null) {
                                        j4 = acjbVarA.b;
                                        jLongValue = j4;
                                        acjdVar3 = aciwVar;
                                    } else {
                                        jLongValue = j2;
                                        jA = 0;
                                        acjdVar3 = acjdVar3;
                                    }
                                } else {
                                    acjd acjdVarA2 = acjbVarA.A(acjdVar3.b());
                                    if (acjdVarA2 instanceof aciw) {
                                        aciwVar2 = (aciw) acjdVarA2;
                                        jLongValue = aciwVar2.c;
                                    } else if (acjdVarA2 instanceof aciv) {
                                        acivVar = (aciv) acjdVarA2;
                                        jLongValue = 0;
                                    } else {
                                        jLongValue = j2;
                                    }
                                }
                            } else if (acjbVarA.S(acjdVar3.b(), Optional.of(new aciy(aciw.class, 0)))) {
                                hashSet.add(acjbVarA);
                                aciwVar = acjbVarA.i;
                                if (aciwVar != null) {
                                    j4 = acjbVarA.b;
                                    jLongValue = j4;
                                    acjdVar3 = aciwVar;
                                } else {
                                    jLongValue = j2;
                                    jA = 0;
                                    acjdVar3 = acjdVar3;
                                }
                            } else {
                                acjd acjdVarA3 = acjbVarA.A(acjdVar3.b());
                                if (acjdVarA3 instanceof aciw) {
                                    aciw aciwVar6 = (aciw) acjdVarA3;
                                    j3 = aciwVar6.c;
                                    acjdVar = aciwVar6;
                                } else {
                                    jLongValue = j2;
                                    acjdVar3 = null;
                                }
                            }
                            if (aciuVarK != null) {
                                acjdVar3 = acjdVar3;
                                acjdVar3 = acivVar;
                                acjdVar3 = aciwVar2;
                                jA -= aciuVarK.a();
                                arrayList.add(aciuVarK);
                                if (!z) {
                                    break;
                                }
                                aciwVar3 = aciwVar5;
                            }
                            acjdVar3 = acjdVar3;
                            acjdVar3 = acivVar;
                            acjdVar3 = aciwVar2;
                            str2 = str;
                            acjdVar3 = acjdVar3;
                            i = i;
                            j5 = j6;
                        }
                        jLongValue = j3;
                        acjdVar3 = acjdVar;
                        if (aciuVarK != null) {
                            acjdVar3 = acjdVar3;
                            acjdVar3 = acivVar;
                            acjdVar3 = aciwVar2;
                            jA -= aciuVarK.a();
                            arrayList.add(aciuVarK);
                            if (!z) {
                                break;
                                break;
                            }
                            aciwVar3 = aciwVar5;
                        }
                        acjdVar3 = acjdVar3;
                        acjdVar3 = acivVar;
                        acjdVar3 = aciwVar2;
                        str2 = str;
                        acjdVar3 = acjdVar3;
                        i = i;
                        j5 = j6;
                    }
                }
                if (arrayList.isEmpty() && acjdVar3 != null && (acjdVar3 instanceof aciw)) {
                    aciw aciwVar7 = (aciw) acjdVar3;
                    aciu aciuVarF = aciwVar7.f(aciwVar7.b);
                    if (aciuVarF != null) {
                        arrayList.add(aciuVarF);
                    }
                }
                if (!arrayList.isEmpty()) {
                    acjd acjdVarC3 = acjbVar.c(((aciu) arrayList.get(arrayList.size() - 1)).d());
                    acjbVar.v = acjdVarC3 instanceof aciw ? (aciw) acjdVarC3 : null;
                }
            }
        }
        return arrayList;
    }

    private static Pair ae(acjb acjbVar, long j) {
        TreeMap treeMap = acjbVar.t;
        Long lValueOf = Long.valueOf(j);
        Map.Entry entryFloorEntry = treeMap.floorEntry(lValueOf);
        if (entryFloorEntry == null) {
            acjd acjdVar = acjbVar.h;
            aciw aciwVar = acjdVar instanceof aciw ? (aciw) acjdVar : null;
            if (aciwVar != null) {
                return new Pair(lValueOf, aciwVar);
            }
            return null;
        }
        acjb acjbVar2 = (acjb) entryFloorEntry.getValue();
        long jLongValue = ((Long) entryFloorEntry.getKey()).longValue();
        long j2 = j - jLongValue;
        long j3 = acjbVar2.b;
        if (jLongValue == acjbVar2.k + j3 + acjbVar2.j && acjbVar2.i != null) {
            return new Pair(Long.valueOf(j3 + j2), acjbVar2.i);
        }
        for (acjd acjdVar2 : acjbVar2.c) {
            if (acjdVar2 instanceof aciw) {
                aciw aciwVar2 = (aciw) acjdVar2;
                long j4 = aciwVar2.b;
                if (j4 > j2) {
                    return new Pair(Long.valueOf(j2), aciwVar2);
                }
                j2 -= j4;
            }
        }
        acjd acjdVar3 = acjbVar.h;
        aciw aciwVar3 = acjdVar3 instanceof aciw ? (aciw) acjdVar3 : null;
        if (aciwVar3 != null) {
            return new Pair(Long.valueOf(j), aciwVar3);
        }
        return null;
    }

    private static Pair af(acjb acjbVar, String str, long j) {
        acjd acjdVarC = acjbVar.c(str);
        aciw aciwVar = acjdVarC instanceof aciw ? (aciw) acjdVarC : null;
        return (str == null || aciwVar == null) ? ae(acjbVar, j) : new Pair(Long.valueOf(j), aciwVar);
    }

    private final aciw ag(long j) {
        acjd acjdVar = this.h;
        aciw aciwVar = acjdVar instanceof aciw ? (aciw) acjdVar : null;
        if (aciwVar == null || !aciwVar.j()) {
            return null;
        }
        Pair pairAe = ae(this, j);
        aciw aciwVar2 = pairAe != null ? (aciw) pairAe.second : null;
        if (aciwVar2 == null) {
            return null;
        }
        aciwVar2.a();
        if (aciwVar2.a() == this || aciwVar2.a().i == null) {
            return null;
        }
        return aciwVar2;
    }

    private final aciz ah() {
        aciz acizVar = this.w;
        if (acizVar != null) {
            return acizVar;
        }
        aciz acizVar2 = new aciz();
        this.w = acizVar2;
        return acizVar2;
    }

    private static Map.Entry ai(aciw aciwVar, long j, Set set) {
        if (!aciwVar.j()) {
            TreeMap treeMap = aciwVar.a;
            if (!treeMap.isEmpty()) {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Long.valueOf(j));
                return (entryCeilingEntry == null || !set.contains(entryCeilingEntry.getValue())) ? entryCeilingEntry : treeMap.ceilingEntry(Long.valueOf(((Long) entryCeilingEntry.getKey()).longValue() + 1));
            }
        }
        return null;
    }

    private static void aj(String str, acjd acjdVar, abmt abmtVar, aunn aunnVar) {
        if (acjdVar instanceof aciw) {
            aciw aciwVar = (aciw) acjdVar;
            if (abmtVar.g.l(321, 45746363L, false)) {
                zvj zvjVarA = zvk.a();
                zvjVarA.j = 21;
                zvjVarA.i = 414;
                zvjVarA.d("b466092763 iterations exceeded. " + str + " isDai: " + aciwVar.j());
                zvjVarA.c(ajtv.ERROR_LEVEL_WARNING);
                ((zvl) aunnVar.io()).a(zvjVarA.a());
            }
        }
    }

    private final synchronized void ak(acjh acjhVar) {
        this.n.r(acjhVar);
        aciz acizVar = this.w;
        if (acizVar != null) {
            this.p.r(acizVar);
            this.w = null;
        }
    }

    private static boolean al(acjb acjbVar) {
        return acjbVar != null && acjbVar.g() && Collection.EL.stream(acjbVar.c).allMatch(new aciy(aciv.class, 0));
    }

    private static boolean am(long j, long j2) {
        return j2 > j && j2 > 0;
    }

    private final zgp an(aciw aciwVar, aciw aciwVar2) {
        if (!this.s.ba()) {
            return null;
        }
        Optional optional = aciwVar2.o;
        if (optional.isEmpty() || aciwVar == null || aciwVar == aciwVar2 || aciwVar.j != 0 || aciwVar2.j != 0) {
            return null;
        }
        long j = aciwVar2.c;
        Map.Entry entryCeilingEntry = aciwVar2.a.ceilingEntry(Long.valueOf(j));
        if (entryCeilingEntry != null && !am(j, ((Long) entryCeilingEntry.getKey()).longValue()) && al((acjb) entryCeilingEntry.getValue())) {
            return null;
        }
        Map.Entry entryCeilingEntry2 = aciwVar.a.ceilingEntry(Long.valueOf(aciwVar.b));
        if (entryCeilingEntry2 != null && al((acjb) entryCeilingEntry2.getValue())) {
            return null;
        }
        Object obj = optional.get();
        if (this.x.a(aciwVar.i, aciwVar2.i)) {
            return (zgp) obj;
        }
        return null;
    }

    private static final boolean ao(acjb acjbVar) {
        aciw aciwVar;
        if (!acjbVar.c.isEmpty() || (aciwVar = acjbVar.i) == null) {
            return false;
        }
        aciwVar.a.remove(Long.valueOf(acjbVar.a));
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    private final void ap(aciw aciwVar, long j, long j2, String str, aciw... aciwVarArr) {
        acgr acgrVar = (acgr) this.e.get();
        if (aciwVar == null || (aciwVarArr.length) == 0 || acgrVar == null) {
            return;
        }
        for (aciw aciwVar2 : aciwVarArr) {
            if (this.d.containsKey(aciwVar2.h)) {
                return;
            }
        }
        Long lValueOf = Long.valueOf(j);
        TreeMap treeMap = aciwVar.a;
        Map.Entry entryFloorEntry = treeMap.floorEntry(lValueOf);
        Map.Entry entryFloorEntry2 = treeMap.floorEntry(Long.valueOf(j2));
        acjb acjbVar = entryFloorEntry == null ? null : (acjb) entryFloorEntry.getValue();
        acjb acjbVar2 = entryFloorEntry2 != null ? (acjb) entryFloorEntry2.getValue() : null;
        if (acjbVar != null && acjbVar2 == acjbVar && acjbVar.f(j) && acjbVar2.f(j2)) {
            return;
        }
        if (acjbVar == null || !acjbVar.f(j)) {
            if (acjbVar2 == null || !acjbVar2.f(j2)) {
                if (acjbVar == null) {
                    if (acjbVar2 != null) {
                        return;
                    }
                } else if (acjbVar != acjbVar2) {
                    return;
                }
                acjb acjbVar3 = new acjb(j, j2, acgrVar, this.n, this.p, this.o, this.q, this.f, this.g, str, aciwVar, this.r, this.s, this.x, aciwVarArr);
                aciwVar.h(acjbVar3);
                this.y.e(agke.p(aciwVarArr));
                ah().b.add(new ijt(agke.p(aciwVarArr)));
                for (aciw aciwVar3 : aciwVarArr) {
                    this.d.put(aciwVar3.h, aciwVar3);
                }
                if (this.g) {
                    Map.Entry entryFloorEntry3 = treeMap.floorEntry(Long.valueOf(j - 1));
                    if (entryFloorEntry3 != null) {
                        acjbVar3.k = ((acjb) entryFloorEntry3.getValue()).k + ((acjb) entryFloorEntry3.getValue()).j;
                    }
                    if (acjbVar3.j != 0) {
                        for (acjb acjbVar4 : treeMap.tailMap(Long.valueOf(j)).values()) {
                            if (acjbVar4 != acjbVar3) {
                                L(acjbVar4);
                                acjbVar4.k += acjbVar3.j;
                                H(acjbVar4);
                            }
                        }
                    }
                    H(acjbVar3);
                }
            }
        }
    }

    public final synchronized acjd A(String str) {
        return B(str, Optional.empty());
    }

    public final synchronized acjd B(String str, Optional optional) {
        acjd acjdVar;
        acjd acjdVar2 = (acjd) this.d.get(str);
        if (acjdVar2 == null) {
            return null;
        }
        List list = this.c;
        int iIndexOf = list.indexOf(acjdVar2);
        if (iIndexOf >= 0) {
            do {
                iIndexOf++;
                if (iIndexOf < list.size()) {
                    acjdVar = (acjd) list.get(iIndexOf);
                    if (optional.isEmpty()) {
                        break;
                    }
                }
            } while (!a$$ExternalSyntheticApiModelOutline0.m9m(optional.get()).test(acjdVar));
            return acjdVar;
        }
        return null;
    }

    public final synchronized agke C(String str) {
        agke agkeVarG;
        acjd acjdVarC = c(str);
        if (acjdVarC == null) {
            agkeVarG = agpi.a;
        } else {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (acjd acjdVar : this.c) {
                if (z) {
                    arrayList.add(acjdVar.b());
                } else if (acjdVar == acjdVarC) {
                    z = true;
                }
            }
            agjz agjzVar = new agjz(4);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                agjzVar.j(d((String) arrayList.get(i)));
            }
            agkeVarG = agjzVar.g();
        }
        return agkeVarG;
    }

    public final synchronized agke D(Optional optional) {
        return (agke) Collection.EL.stream(this.d.values()).filter(new aciy(optional, 3)).collect(aghu.a);
    }

    public final agke E() {
        return (agke) Collection.EL.stream(this.c).filter(new aciy(Optional.empty(), 2)).collect(aghu.a);
    }

    public final synchronized List G() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        this.t.clear();
        this.u.clear();
        agjz agjzVar = new agjz(4);
        List<acjd> list = this.c;
        for (acjd acjdVar : list) {
            if (acjdVar instanceof aciw) {
                agjzVar.h((aciw) acjdVar);
            }
        }
        this.y.f(agjzVar.g());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((acjd) it.next()).b());
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            d((String) arrayList.get(i));
        }
        this.h = null;
        this.v = null;
        this.m.clear();
        return arrayList;
    }

    final void H(acjb acjbVar) {
        long j = acjbVar.a + acjbVar.k;
        TreeMap treeMap = this.t;
        treeMap.put(Long.valueOf(j), acjbVar);
        treeMap.put(Long.valueOf(acjbVar.b + acjbVar.k + acjbVar.j), acjbVar);
        String str = acjbVar.l;
        if (str != null) {
            this.u.put(str, acjbVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068 A[Catch: all -> 0x00d2, EDGE_INSN: B:24:0x0068->B:27:0x0072 BREAK  A[LOOP:2: B:10:0x0023->B:14:0x0034], TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0019, B:8:0x001f, B:27:0x0072, B:29:0x0078, B:31:0x0081, B:33:0x008d, B:34:0x0094, B:35:0x009e, B:37:0x00a5, B:39:0x00af, B:40:0x00b4, B:41:0x00b7, B:11:0x0025, B:13:0x002f, B:14:0x0034, B:15:0x0040, B:17:0x0044, B:19:0x004b, B:24:0x0068, B:22:0x005a, B:25:0x006d, B:26:0x0070), top: B:48:0x0001 }] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.List] */
    public final synchronized void I(String str, String str2) {
        agke agkeVarG;
        acjb acjbVarA;
        agjz agjzVar = new agjz(4);
        Map map = this.d;
        acjd acjdVar = (acjd) map.get(str);
        acjd acjdVar2 = (acjd) map.get(str2);
        if (acjdVar == null || acjdVar2 == null || (acjbVarA = acjdVar.a()) == null) {
            agkeVarG = agpi.a;
        } else {
            acjd acjdVarA = acjdVar;
            while (true) {
                if (acjdVarA == null) {
                    boolean z = acjdVar2 instanceof aciw;
                    if (!z) {
                        if (z) {
                        }
                        agkeVarG = agpi.a;
                        break;
                    }
                    aciw aciwVar = (aciw) acjdVar2;
                    if (!(acjdVar instanceof aciw) || !aciwVar.a.containsValue(((aciw) acjdVar).f)) {
                        if (z || !((aciw) acjdVar2).a.containsValue(acjdVar.a())) {
                            agkeVarG = agpi.a;
                            break;
                        } else {
                            agkeVarG = agjzVar.g();
                            break;
                        }
                    }
                    agkeVarG = agjzVar.g();
                    break;
                }
                if (Objects.equals(str2, acjdVarA.b())) {
                    agkeVarG = agjzVar.g();
                    break;
                } else {
                    agjzVar.h(acjdVarA);
                    acjdVarA = acjbVarA.A(acjdVarA.b());
                }
            }
        }
        if (!agkeVarG.isEmpty()) {
            int i = ((agpi) agkeVarG).d;
            for (int i2 = 0; i2 < i; i2++) {
                acjd acjdVar3 = (acjd) agkeVarG.get(i2);
                acjb acjbVarA2 = acjdVar3.a();
                if (acjbVarA2 != null) {
                    acjbVarA2.d(acjdVar3.b());
                }
                map.remove(acjdVar3.b());
            }
            agjz agjzVar2 = new agjz(4);
            for (int i3 = 0; i3 < i; i3++) {
                acjd acjdVar4 = (acjd) agkeVarG.get(i3);
                if (acjdVar4 instanceof aciw) {
                    agjzVar2.h((aciw) acjdVar4);
                }
            }
            agke agkeVarG2 = agjzVar2.g();
            ah().a.add(new ijt(agkeVarG2));
            this.y.f(agkeVarG2);
        }
    }

    public final synchronized void J() {
        this.q.get();
    }

    public final synchronized void K(String str) {
        if (!this.s.bR()) {
            this.o.r(str);
        }
    }

    final void L(acjb acjbVar) {
        long j = acjbVar.a + acjbVar.k;
        TreeMap treeMap = this.t;
        treeMap.remove(Long.valueOf(j));
        treeMap.remove(Long.valueOf(acjbVar.b + acjbVar.k + acjbVar.j));
        String str = acjbVar.l;
        if (str != null) {
            this.u.remove(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0009 A[Catch: all -> 0x000f, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009), top: B:13:0x0003 }] */
    public final synchronized void M(acjd acjdVar) {
        if (acjdVar == null) {
            this.h = acjdVar;
        } else if (acjdVar.a() == this) {
            this.h = acjdVar;
        }
    }

    public final void N(boolean z) {
        Object objA;
        abnp abnpVarA;
        acjd acjdVar = this.h;
        aciw aciwVar = acjdVar instanceof aciw ? (aciw) acjdVar : null;
        if (aciwVar == null || (objA = aciwVar.g.a()) == null) {
            return;
        }
        acfs acfsVar = (acfs) objA;
        abnp abnpVarD = acfsVar.d();
        if (abnpVarD == null) {
            abno abnoVarA = abnp.a();
            abnoVarA.h(z);
            abnpVarA = abnoVarA.a();
        } else {
            abno abnoVarB = abnp.b(abnpVarD);
            abnoVarB.h(z);
            abnpVarA = abnoVarB.a();
        }
        acfsVar.K(abnpVarA);
    }

    public final synchronized void O(String str, boolean z, acjc acjcVar) {
        ak(new acje(str, z, acjcVar, this.y.b()));
    }

    public final synchronized void P(acja acjaVar) {
        Boolean bool = acjaVar.a;
        ak(new acjg(acjaVar.b.longValue(), bool.booleanValue(), acjaVar.c, this.y.b()));
    }

    public final boolean Q(String str) {
        return this.m.contains(str);
    }

    public final synchronized boolean R(String str) {
        return S(str, Optional.empty());
    }

    public final synchronized boolean S(String str, Optional optional) {
        acjd acjdVar;
        abmt abmtVar = this.s;
        boolean zEquals = false;
        if (abmtVar == null || !abmtVar.au()) {
            return g() && TextUtils.equals(((acjd) aguu.K(this.c)).b(), str);
        }
        List list = this.c;
        int size = list.size();
        do {
            size--;
            if (size >= 0) {
                acjdVar = (acjd) list.get(size);
                if (optional.isEmpty()) {
                    break;
                }
            }
            return zEquals;
        } while (!a$$ExternalSyntheticApiModelOutline0.m9m(optional.get()).test(acjdVar));
        zEquals = TextUtils.equals(acjdVar.b(), str);
        return zEquals;
    }

    public final synchronized boolean T(long j, long j2, aunn aunnVar) throws Throwable {
        try {
            try {
                abmt abmtVar = this.s;
                List listF = F(this, null, j, 1L, false, abmtVar, aunnVar);
                List listF2 = F(this, null, j2, 1L, false, abmtVar, aunnVar);
                return (listF.isEmpty() || listF2.isEmpty() || !((aciu) listF.get(0)).equals(listF2.get(0))) ? false : true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized boolean U(String str, Duration duration, Duration duration2) {
        acjd acjdVarC = c(str);
        aciw aciwVar = acjdVarC instanceof aciw ? (aciw) acjdVarC : null;
        if (aciwVar != null) {
            aciwVar.a();
            acjb acjbVarA = aciwVar.a();
            aciw aciwVar2 = acjbVarA.i;
            if (aciwVar2 != null) {
                Long lValueOf = Long.valueOf(acjbVarA.a);
                TreeMap treeMap = aciwVar2.a;
                treeMap.remove(lValueOf);
                acjbVarA.a = duration.toMillis();
                acjbVarA.b = duration2.toMillis();
                treeMap.put(Long.valueOf(duration.toMillis()), acjbVarA);
                return true;
            }
        }
        return false;
    }

    public final synchronized aciw W(wjf wjfVar, String str, abnp abnpVar, boolean z) {
        abmt abmtVar;
        long j;
        wjf wjfVar2;
        abmtVar = this.s;
        j = abmtVar.cc() ? abmtVar.j() : 0L;
        if (abmtVar.at()) {
            wjfVar2 = wjfVar;
            Long lA = this.r.a(null, wjfVar2, new akm(9));
            if (lA != null) {
                j = lA.longValue();
            }
        } else {
            wjfVar2 = wjfVar;
        }
        return s(wjfVar, str, j, wjfVar2.V() ? Long.MAX_VALUE : wjfVar2.d(), abmtVar.am() ? Long.valueOf(wjfVar2.f().u()) : null, null, 1, abnpVar, null, null, z);
    }

    public final synchronized aciw X(wjf wjfVar, String str, long j, int i, abnp abnpVar) {
        return p(wjfVar, str, j, i, abnpVar, null, null);
    }

    public final synchronized aciw Y(wjf wjfVar, String str, long j, long j2, Long l, Long l2, int i, abnp abnpVar) {
        return r(wjfVar, str, j, j2, l, l2, i, abnpVar, null, null);
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.List] */
    public final synchronized void Z(acjd acjdVar) {
        Map map = this.d;
        String str = ((aciw) acjdVar).h;
        if (map.containsKey(str) || acjdVar.a() != this) {
            return;
        }
        abmt abmtVar = this.s;
        if (abmtVar == null || !abmtVar.au()) {
            if (this.c.isEmpty()) {
                this.h = acjdVar;
            }
        } else if (this.h == null) {
            this.h = acjdVar;
        }
        this.y.c((aciw) acjdVar);
        ah().b.add(new ijt(agke.q(acjdVar)));
        this.c.add(acjdVar);
        map.put(str, acjdVar);
    }

    public synchronized long a(String str, long j) {
        acjd acjdVar;
        acjd acjdVarC = c(str);
        if (acjdVarC != null && acjdVarC.a() != null && acjdVarC.a().g) {
            acjb acjbVarA = acjdVarC.a();
            if (acjbVarA == null || acjbVarA.i == null) {
                acjd acjdVar2 = this.h;
                aciw aciwVar = acjdVar2 instanceof aciw ? (aciw) acjdVar2 : null;
                if (aciwVar != null) {
                    long j2 = aciwVar.b;
                    if (j2 < j) {
                        j = j2;
                    }
                }
                acjd acjdVar3 = acjbVarA.h;
                aciw aciwVar2 = acjdVar3 instanceof aciw ? (aciw) acjdVar3 : null;
                Map.Entry entryFloorEntry = aciwVar2 != null ? aciwVar2.a.floorEntry(Long.valueOf(j)) : null;
                if (entryFloorEntry != null) {
                    if (((acjb) entryFloorEntry.getValue()).b <= j) {
                        j += ((acjb) entryFloorEntry.getValue()).j;
                    }
                    j += ((acjb) entryFloorEntry.getValue()).k;
                }
            } else {
                while (acjbVarA != null && acjbVarA.i != null && acjbVarA.g) {
                    Iterator it = acjbVarA.c.iterator();
                    while (it.hasNext() && (acjdVar = (acjd) it.next()) != acjdVarC) {
                        if (acjdVar instanceof aciw) {
                            j += ((aciw) acjdVar).b;
                        }
                    }
                    j += acjbVarA.a + acjbVarA.k;
                    aciw aciwVar3 = acjbVarA.i;
                    acjbVarA = aciwVar3 != null ? aciwVar3.a() : null;
                }
            }
        }
        return j;
    }

    public final synchronized void aa(long j, long j2, String str, aciw... aciwVarArr) throws Throwable {
        Throwable th;
        aciw aciwVar;
        try {
            try {
                acjd acjdVar = this.h;
                if (acjdVar instanceof aciw) {
                    try {
                        aciwVar = (aciw) acjdVar;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    aciwVar = null;
                }
                ap(aciwVar, j, j2, str, aciwVarArr);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final synchronized void ab(String str, long j, long j2, aciw... aciwVarArr) throws Throwable {
        Throwable th;
        aciw aciwVar;
        try {
            try {
                acjd acjdVarC = c(str);
                if (acjdVarC instanceof aciw) {
                    try {
                        aciwVar = (aciw) acjdVarC;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    aciwVar = null;
                }
                ap(aciwVar, j, j2, null, aciwVarArr);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00d6 A[Catch: all -> 0x0162, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0012, B:8:0x0017, B:10:0x0022, B:13:0x0027, B:15:0x0032, B:17:0x0040, B:19:0x0044, B:20:0x0049, B:21:0x004c, B:26:0x006a, B:29:0x0074, B:31:0x007a, B:34:0x0082, B:37:0x008a, B:43:0x0097, B:45:0x00d6, B:46:0x00ed, B:48:0x00f2, B:49:0x0100, B:51:0x0104, B:53:0x0112, B:54:0x0125, B:56:0x012d, B:57:0x013d, B:59:0x0143, B:61:0x014b, B:62:0x0159, B:24:0x0062), top: B:71:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2 A[Catch: all -> 0x0162, LOOP:1: B:47:0x00f0->B:48:0x00f2, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0012, B:8:0x0017, B:10:0x0022, B:13:0x0027, B:15:0x0032, B:17:0x0040, B:19:0x0044, B:20:0x0049, B:21:0x004c, B:26:0x006a, B:29:0x0074, B:31:0x007a, B:34:0x0082, B:37:0x008a, B:43:0x0097, B:45:0x00d6, B:46:0x00ed, B:48:0x00f2, B:49:0x0100, B:51:0x0104, B:53:0x0112, B:54:0x0125, B:56:0x012d, B:57:0x013d, B:59:0x0143, B:61:0x014b, B:62:0x0159, B:24:0x0062), top: B:71:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0104 A[Catch: all -> 0x0162, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0012, B:8:0x0017, B:10:0x0022, B:13:0x0027, B:15:0x0032, B:17:0x0040, B:19:0x0044, B:20:0x0049, B:21:0x004c, B:26:0x006a, B:29:0x0074, B:31:0x007a, B:34:0x0082, B:37:0x008a, B:43:0x0097, B:45:0x00d6, B:46:0x00ed, B:48:0x00f2, B:49:0x0100, B:51:0x0104, B:53:0x0112, B:54:0x0125, B:56:0x012d, B:57:0x013d, B:59:0x0143, B:61:0x014b, B:62:0x0159, B:24:0x0062), top: B:71:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0112 A[Catch: all -> 0x0162, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0012, B:8:0x0017, B:10:0x0022, B:13:0x0027, B:15:0x0032, B:17:0x0040, B:19:0x0044, B:20:0x0049, B:21:0x004c, B:26:0x006a, B:29:0x0074, B:31:0x007a, B:34:0x0082, B:37:0x008a, B:43:0x0097, B:45:0x00d6, B:46:0x00ed, B:48:0x00f2, B:49:0x0100, B:51:0x0104, B:53:0x0112, B:54:0x0125, B:56:0x012d, B:57:0x013d, B:59:0x0143, B:61:0x014b, B:62:0x0159, B:24:0x0062), top: B:71:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x012d A[Catch: all -> 0x0162, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0012, B:8:0x0017, B:10:0x0022, B:13:0x0027, B:15:0x0032, B:17:0x0040, B:19:0x0044, B:20:0x0049, B:21:0x004c, B:26:0x006a, B:29:0x0074, B:31:0x007a, B:34:0x0082, B:37:0x008a, B:43:0x0097, B:45:0x00d6, B:46:0x00ed, B:48:0x00f2, B:49:0x0100, B:51:0x0104, B:53:0x0112, B:54:0x0125, B:56:0x012d, B:57:0x013d, B:59:0x0143, B:61:0x014b, B:62:0x0159, B:24:0x0062), top: B:71:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0143 A[Catch: all -> 0x0162, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0012, B:8:0x0017, B:10:0x0022, B:13:0x0027, B:15:0x0032, B:17:0x0040, B:19:0x0044, B:20:0x0049, B:21:0x004c, B:26:0x006a, B:29:0x0074, B:31:0x007a, B:34:0x0082, B:37:0x008a, B:43:0x0097, B:45:0x00d6, B:46:0x00ed, B:48:0x00f2, B:49:0x0100, B:51:0x0104, B:53:0x0112, B:54:0x0125, B:56:0x012d, B:57:0x013d, B:59:0x0143, B:61:0x014b, B:62:0x0159, B:24:0x0062), top: B:71:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x013d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.List] */
    public final synchronized void ac(String str, long j, long j2, acjd... acjdVarArr) {
        acjb acjbVar;
        int i;
        Map.Entry entryFloorEntry;
        acjd acjdVarC = c(str);
        aciw aciwVar = acjdVarC instanceof aciw ? (aciw) acjdVarC : null;
        acgr acgrVar = (acgr) this.e.get();
        if (aciwVar != null && (acjdVarArr.length) != 0 && acgrVar != null) {
            ArrayList arrayList = new ArrayList();
            for (acjd acjdVar : acjdVarArr) {
                if (!this.d.containsKey(acjdVar.b())) {
                    if (acjdVar instanceof aciw) {
                        arrayList.add((aciw) acjdVar);
                    }
                }
            }
            Long lValueOf = Long.valueOf(j);
            TreeMap treeMap = aciwVar.a;
            Map.Entry entryFloorEntry2 = treeMap.floorEntry(lValueOf);
            Map.Entry entryFloorEntry3 = treeMap.floorEntry(Long.valueOf(j2));
            acjb acjbVar2 = entryFloorEntry2 == null ? null : (acjb) entryFloorEntry2.getValue();
            acjb acjbVar3 = entryFloorEntry3 != null ? (acjb) entryFloorEntry3.getValue() : null;
            if ((acjbVar2 == null || acjbVar3 != acjbVar2 || !acjbVar2.f(j) || !acjbVar3.f(j2)) && ((acjbVar2 == null || !acjbVar2.f(j)) && (acjbVar3 == null || !acjbVar3.f(j2)))) {
                if (acjbVar2 == null) {
                    if (acjbVar3 == null) {
                        acjbVar = new acjb(j, j2, acgrVar, this.n, this.p, this.o, this.q, this.f, this.g, null, aciwVar, this.r, this.s, this.x, acjdVarArr);
                        aciwVar.h(acjbVar);
                        if (!arrayList.isEmpty()) {
                            agke agkeVarN = agke.n(arrayList);
                            this.y.e(agkeVarN);
                            ah().b.add(new ijt(agkeVarN));
                        }
                        for (acjd acjdVar2 : acjdVarArr) {
                            this.d.put(acjdVar2.b(), acjdVar2);
                        }
                        if (this.g) {
                            entryFloorEntry = treeMap.floorEntry(Long.valueOf(j - 1));
                            if (entryFloorEntry != null) {
                                acjbVar.k = ((acjb) entryFloorEntry.getValue()).k + ((acjb) entryFloorEntry.getValue()).j;
                            }
                            if (acjbVar.j != 0) {
                                for (acjb acjbVar4 : treeMap.tailMap(Long.valueOf(j)).values()) {
                                    if (acjbVar4 != acjbVar) {
                                        L(acjbVar4);
                                        acjbVar4.k += acjbVar.j;
                                        H(acjbVar4);
                                    }
                                }
                            }
                            H(acjbVar);
                        }
                    }
                } else if (acjbVar2 == acjbVar3) {
                    acjbVar = new acjb(j, j2, acgrVar, this.n, this.p, this.o, this.q, this.f, this.g, null, aciwVar, this.r, this.s, this.x, acjdVarArr);
                    aciwVar.h(acjbVar);
                    if (!arrayList.isEmpty()) {
                        agke agkeVarN2 = agke.n(arrayList);
                        this.y.e(agkeVarN2);
                        ah().b.add(new ijt(agkeVarN2));
                    }
                    while (i < r4) {
                        this.d.put(acjdVar2.b(), acjdVar2);
                    }
                    if (this.g) {
                        entryFloorEntry = treeMap.floorEntry(Long.valueOf(j - 1));
                        if (entryFloorEntry != null) {
                            acjbVar.k = ((acjb) entryFloorEntry.getValue()).k + ((acjb) entryFloorEntry.getValue()).j;
                        }
                        if (acjbVar.j != 0) {
                            while (r0.hasNext()) {
                                if (acjbVar4 != acjbVar) {
                                    L(acjbVar4);
                                    acjbVar4.k += acjbVar.j;
                                    H(acjbVar4);
                                }
                            }
                        }
                        H(acjbVar);
                    }
                }
            }
        }
    }

    public final synchronized List ad(String str) {
        acjd acjdVarC = c(str);
        if (acjdVarC == null) {
            return new ArrayList();
        }
        acjb acjbVarA = acjdVarC.a();
        ArrayList arrayList = new ArrayList();
        agke agkeVarN = agke.n(acjbVarA.c);
        int size = agkeVarN.size();
        for (int i = 0; i < size; i++) {
            arrayList.addAll(d(((acjd) agkeVarN.get(i)).b()));
        }
        return arrayList;
    }

    public synchronized long b(long j) {
        Pair pairAe = ae(this, j);
        if (pairAe != null) {
            j = ((Long) pairAe.first).longValue();
        }
        return j;
    }

    public synchronized acjd c(String str) {
        if (str == null) {
            return null;
        }
        return (acjd) this.d.get(str);
    }

    public synchronized List d(String str) {
        ArrayList arrayList;
        Map map = this.d;
        acjd acjdVar = (acjd) map.get(str);
        arrayList = new ArrayList();
        if (acjdVar != null) {
            if (acjdVar instanceof aciw) {
                aciw aciwVar = (aciw) acjdVar;
                arrayList.add(str);
                aciz acizVar = this.y;
                acizVar.d(aciwVar);
                for (acjb acjbVar : aciwVar.a.values()) {
                    arrayList.addAll(acjbVar.d.keySet());
                    agjz agjzVar = new agjz(4);
                    for (acjd acjdVar2 : acjbVar.c) {
                        if (acjdVar2 instanceof aciw) {
                            agjzVar.h((aciw) acjdVar2);
                        }
                    }
                    acizVar.f(agjzVar.g());
                }
                for (acjb acjbVarA = aciwVar.a(); acjbVarA != null; acjbVarA = acjbVarA.w()) {
                    acjbVarA.d.keySet().removeAll(arrayList);
                }
                acjb acjbVarA2 = aciwVar.a();
                acjbVarA2.c.remove(aciwVar);
                if (acjbVarA2.h == aciwVar) {
                    acjbVarA2.h = acjbVarA2.u();
                }
                boolean zAo = ao(acjbVarA2);
                acjd acjdVar3 = this.h;
                aciw aciwVar2 = acjdVar3 instanceof aciw ? (aciw) acjdVar3 : null;
                if (this.g && aciwVar2 != null) {
                    long j = acjbVarA2.j;
                    if (zAo) {
                        L(acjbVarA2);
                    } else {
                        j = aciwVar.b;
                    }
                    if (j != 0) {
                        for (acjb acjbVar2 : aciwVar2.a.tailMap(Long.valueOf(this.a)).values()) {
                            L(acjbVar2);
                            if (acjbVar2 == acjbVarA2) {
                                acjbVar2.j -= j;
                            } else {
                                acjbVar2.k -= j;
                            }
                            H(acjbVar2);
                        }
                    }
                }
            } else {
                abmt abmtVar = this.s;
                if (abmtVar != null && abmtVar.au()) {
                    acjb acjbVarA3 = acjdVar.a();
                    arrayList.add(str);
                    if (acjbVarA3 != null) {
                        acjbVarA3.c.remove(acjdVar);
                        for (acjb acjbVarW = acjbVarA3; acjbVarW != null; acjbVarW = acjbVarW.w()) {
                            acjbVarW.d.keySet().removeAll(arrayList);
                        }
                        ao(acjbVarA3);
                    } else {
                        this.c.remove(acjdVar);
                        map.remove(str);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(boolean z, acjc acjcVar) {
        ak(new acjf(z, acjcVar, this.y.b()));
    }

    public synchronized boolean f(long j) {
        return this.a <= j && j < this.b;
    }

    public synchronized boolean g() {
        return !this.c.isEmpty();
    }

    public synchronized boolean h(String str) {
        aciw aciwVar = this.v;
        return i() && aciwVar != null && TextUtils.equals(aciwVar.h, str);
    }

    public synchronized boolean i() {
        return this.v != null;
    }

    public synchronized void j() {
        this.g = true;
    }

    public final synchronized long k(long j) {
        acjd acjdVar = this.h;
        aciw aciwVar = acjdVar instanceof aciw ? (aciw) acjdVar : null;
        if (aciwVar == null || !aciwVar.j()) {
            return b(j);
        }
        long j2 = aciwVar.b;
        return j2 < j ? j2 : j;
    }

    public final synchronized acgu l(acgu acguVar, String str) {
        acjd acjdVar = this.h;
        aciw aciwVar = acjdVar instanceof aciw ? (aciw) acjdVar : null;
        if (aciwVar == null || c(str) == null) {
            return acguVar;
        }
        Object objA = aciwVar.g.a();
        if (objA == null) {
            return acguVar;
        }
        acgs acgsVar = new acgs(((acfs) objA).B());
        long jA = a(str, ((aazk) acguVar).a);
        acgsVar.b += jA - acgsVar.a;
        acgsVar.a = jA;
        if (jA > acgsVar.d) {
            acgsVar.d = jA;
        }
        return acgsVar;
    }

    public final synchronized aciw m(wjf wjfVar, String str, String str2, aigj aigjVar) throws Throwable {
        Throwable th;
        long j;
        try {
            try {
                abmt abmtVar = this.s;
                if (abmtVar.cc()) {
                    try {
                        j = abmtVar.j();
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    j = 0;
                }
                return p(wjfVar, str, j, 1, null, aigjVar, str2);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final synchronized aciw n(wjf wjfVar, String str, int i, abnp abnpVar) throws Throwable {
        Throwable th;
        long j;
        Long lA;
        try {
            try {
                abmt abmtVar = this.s;
                if (abmtVar.cc()) {
                    try {
                        j = abmtVar.j();
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    j = 0;
                }
                if (abmtVar.at() && (lA = this.r.a(null, wjfVar, new akm(8))) != null) {
                    j = lA.longValue();
                }
                return o(wjfVar, str, j, i, abnpVar);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized aciw o(wjf wjfVar, String str, long j, int i, abnp abnpVar) {
        return X(wjfVar, str, j, i, abnpVar);
    }

    public final synchronized aciw p(wjf wjfVar, String str, long j, int i, abnp abnpVar, aigj aigjVar, String str2) {
        long jD;
        jD = Long.MAX_VALUE;
        if (!wjfVar.V() && !wjfVar.Y() && !wjfVar.Q()) {
            jD = wjfVar.d();
        }
        return r(wjfVar, str, j, jD, this.s.am() ? Long.valueOf(wjfVar.f().u()) : null, null, i, abnpVar, aigjVar, str2);
    }

    public final synchronized aciw q(wjf wjfVar, String str, long j, long j2, Long l, Long l2, int i, abnp abnpVar) {
        return Y(wjfVar, str, j, j2, l, l2, i, abnpVar);
    }

    public final synchronized aciw r(wjf wjfVar, String str, long j, long j2, Long l, Long l2, int i, abnp abnpVar, aigj aigjVar, String str2) {
        return s(wjfVar, str, j, j2, l, l2, i, abnpVar, aigjVar, str2, false);
    }

    public final synchronized aciw s(final wjf wjfVar, final String str, long j, long j2, Long l, Long l2, final int i, final abnp abnpVar, aigj aigjVar, String str2, boolean z) {
        abxz abxzVar;
        Optional optionalEmpty;
        Optional optionalOfNullable = Optional.ofNullable(abnpVar);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((abnp) optionalOfNullable.get()).l);
        }
        abxzVar = (abxz) optionalOfNullable.orElse(abxz.a);
        if (this.s.ba()) {
            optionalEmpty = Optional.ofNullable(abnpVar);
            if (true == optionalEmpty.isPresent()) {
                optionalEmpty = ((abnp) optionalEmpty.get()).k;
                optionalEmpty.getClass();
            }
        } else {
            optionalEmpty = Optional.empty();
        }
        return new aciw(this, new tyy() { // from class: acix
            @Override // defpackage.tyy
            public final Object a() {
                acgr acgrVar = (acgr) this.a.e.get();
                if (acgrVar == null) {
                    return null;
                }
                abnp abnpVar2 = abnpVar;
                int i2 = i;
                return acgrVar.aS(str, wjfVar, i2, abnpVar2);
            }
        }, j, j2, l, l2, str, wjfVar, i, aigjVar, abxzVar, str2, z, optionalEmpty);
    }

    public final aciw t(long j) {
        aciw aciwVarAg;
        if (!this.s.g.l(230, 45705635L, false)) {
            return ag(j);
        }
        synchronized (this) {
            aciwVarAg = ag(j);
        }
        return aciwVarAg;
    }

    public final synchronized aciw u() {
        for (acjd acjdVar : this.c) {
            if (acjdVar instanceof aciw) {
                return (aciw) acjdVar;
            }
        }
        return null;
    }

    public final synchronized acjb v(long j) {
        acjd acjdVar = this.h;
        aciw aciwVarU = acjdVar instanceof aciw ? (aciw) acjdVar : u();
        if (aciwVarU != null) {
            Map.Entry entryFloorEntry = aciwVarU.a.floorEntry(Long.valueOf(j));
            if (entryFloorEntry != null && (((Long) entryFloorEntry.getKey()).longValue() == j || ((acjb) entryFloorEntry.getValue()).f(j))) {
                return (acjb) entryFloorEntry.getValue();
            }
        }
        return null;
    }

    final acjb w() {
        aciw aciwVar = this.i;
        if (aciwVar != null) {
            return aciwVar.a();
        }
        return null;
    }

    public final synchronized acjd x() {
        return this.h;
    }

    public final synchronized acjd y(String str, long j) {
        return z(str, j, Optional.empty());
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.function.Predicate] */
    public final synchronized acjd z(String str, long j, Optional optional) {
        acjd acjdVarB;
        Map.Entry entryCeilingEntry;
        Pair pairAf = af(this, str, j);
        if (pairAf == null || (entryCeilingEntry = ((aciw) pairAf.second).a.ceilingEntry(Long.valueOf(j))) == null || (acjdVarB = ((acjb) entryCeilingEntry.getValue()).h) == null || (!optional.isEmpty() && !optional.get().test(acjdVarB))) {
            acjdVarB = B(str, optional);
        }
        return acjdVarB;
    }

    public acjb(acgr acgrVar, Consumer consumer, Consumer consumer2, Consumer consumer3, Supplier supplier, BiConsumer biConsumer, acfq acfqVar, abmt abmtVar, abnz abnzVar) {
        this(0L, 0L, acgrVar, consumer, consumer2, consumer3, supplier, biConsumer, false, null, null, acfqVar, abmtVar, abnzVar, new acjd[0]);
    }
}
