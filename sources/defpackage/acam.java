package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acam implements acaj {
    private static final Long b = -1L;
    final acbd a;
    private final ScheduledExecutorService c;
    private final wgs d;
    private final String f;
    private final ablm g;
    private final String h;
    private final Long m;
    private final Long n;
    private final axsp o;
    private long p;
    private final acac q;
    private final acai r;
    private final twi s;
    private final acga t;
    private Long k = b;
    private final TreeMap e = new TreeMap();
    private Future i = null;
    private Long j = null;
    private boolean l = false;

    public acam(String str, ScheduledExecutorService scheduledExecutorService, wgs wgsVar, String str2, acga acgaVar, twi twiVar, ablm ablmVar, axsp axspVar, Long l, Long l2, acac acacVar, acai acaiVar, aunn aunnVar, twi twiVar2, boolean z, abmt abmtVar) {
        this.h = str;
        this.d = wgsVar;
        this.c = scheduledExecutorService;
        this.f = str2;
        this.t = acgaVar;
        this.a = aawo.f(wgsVar, twiVar, aunnVar, false, z, abmtVar);
        this.g = ablmVar;
        this.o = axspVar;
        this.m = l;
        this.n = l2;
        this.q = acacVar;
        this.r = acaiVar;
        this.s = twiVar2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0032  */
    private final Long e(long j) {
        TreeMap treeMap = this.e;
        Long lValueOf = Long.valueOf(j);
        Map.Entry entryFloorEntry = treeMap.floorEntry(lValueOf);
        Map.Entry entryCeilingEntry = treeMap.ceilingEntry(lValueOf);
        if (entryFloorEntry == null) {
            if (entryCeilingEntry == null) {
                entryFloorEntry = null;
            } else {
                entryFloorEntry = entryCeilingEntry;
            }
        } else if (entryCeilingEntry != null && j - ((Long) entryFloorEntry.getKey()).longValue() >= ((Long) entryCeilingEntry.getKey()).longValue() - j) {
            entryFloorEntry = entryCeilingEntry;
        }
        if (entryFloorEntry == null) {
            return null;
        }
        acao acaoVar = (acao) entryFloorEntry.getValue();
        return Long.valueOf((long) (acaoVar.a + ((j - ((Long) entryFloorEntry.getKey()).longValue()) / acaoVar.b)));
    }

    private final synchronized void f() {
        this.e.clear();
        Future future = this.i;
        if (future != null && !future.isDone()) {
            this.i.cancel(true);
        }
        this.i = null;
        this.j = null;
        this.k = b;
        this.l = false;
    }

    private final boolean g() {
        return this.g != null;
    }

    @Override // defpackage.acaj
    public final void a() {
        f();
        this.t.p(acbl.class);
    }

    @Override // defpackage.acaj
    public final void b() {
        f();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0251  */
    /* JADX WARN: Code duplicated, block: B:103:0x0255  */
    /* JADX WARN: Code duplicated, block: B:105:0x0260  */
    /* JADX WARN: Code duplicated, block: B:108:0x026e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0276  */
    /* JADX WARN: Code duplicated, block: B:112:0x028c  */
    /* JADX WARN: Code duplicated, block: B:95:0x022a A[PHI: r2
      0x022a: PHI (r2v3 java.lang.Long) = (r2v2 java.lang.Long), (r2v2 java.lang.Long), (r2v2 java.lang.Long), (r2v2 java.lang.Long), (r2v12 java.lang.Long) binds: [B:82:0x01f8, B:92:0x021c, B:94:0x0228, B:90:0x0218, B:86:0x0200] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x022c  */
    /* JADX WARN: Code duplicated, block: B:98:0x023a  */
    /* JADX WARN: Code duplicated, block: B:99:0x023c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, java.util.List] */
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
    @Override // defpackage.acaj
    public final void c(long j) {
        acbd acbdVar;
        Map.Entry entry;
        Long lValueOf;
        long jLongValue;
        Long lValueOf2;
        ablm ablmVar;
        Uri uriA;
        long jLongValue2;
        Map.Entry entry2;
        axsp axspVar;
        this.p = j;
        Uri uriA2 = null;
        futureSubmit = null;
        futureSubmit = null;
        futureSubmit = null;
        futureSubmit = null;
        Future futureSubmit = null;
        Long l = null;
        try {
            Future future = this.i;
            if (future != null) {
                if (future.isDone()) {
                    if (!future.isCancelled()) {
                        aeqc aeqcVar = (aeqc) future.get();
                        Object obj = aeqcVar.b;
                        if ((obj != null || aeqcVar.c != null) && g() && (axspVar = this.o) != null) {
                            axspVar.kk(new aawz((ywx) obj, (ywx) aeqcVar.c, this.d, aeqcVar.a(), aeqcVar.a));
                        }
                        ?? r6 = aeqcVar.d;
                        if (!r6.isEmpty()) {
                            acga acgaVar = this.t;
                            acgaVar.h(r6);
                            acai acaiVar = this.r;
                            ((acad) acaiVar).a.g(((acad) acaiVar).b, false);
                            TreeMap treeMap = this.e;
                            Long lValueOf3 = Long.valueOf(aeqcVar.a);
                            long jA = aeqcVar.a();
                            Integer numB = obj != null ? ((ywx) obj).b("Target-Duration-Us") : null;
                            treeMap.put(lValueOf3, new acao(jA, (numB != null ? numB.intValue() : 0) / 1000, (List) r6));
                            if (obj != null && "T".equals(((ywx) obj).d("Stream-Finished"))) {
                                this.j = Long.valueOf(aeqcVar.a());
                            }
                            this.q.b(treeMap, acgaVar, this.p);
                        }
                    }
                    future = null;
                }
                this.i = future;
            }
        } catch (InterruptedException unused) {
            this.i = null;
        } catch (ExecutionException e) {
            if (e.getCause() instanceof bsz) {
                this.s.a(new aawt(this.k.longValue(), this.h));
                this.l = true;
            }
            this.i = null;
        }
        if (this.i != null || this.l || (acbdVar = this.a) == null) {
            return;
        }
        boolean zG = g();
        TreeMap treeMap2 = this.e;
        if (zG) {
            Long lValueOf4 = Long.valueOf(j);
            Map.Entry entryFloorEntry = treeMap2.floorEntry(lValueOf4);
            if (entryFloorEntry != null && j - ((Long) entryFloorEntry.getKey()).longValue() < ((acao) entryFloorEntry.getValue()).b) {
                Map.Entry entryHigherEntry = treeMap2.higherEntry((Long) entryFloorEntry.getKey());
                while (true) {
                    entry2 = entryFloorEntry;
                    entryFloorEntry = entryHigherEntry;
                    if (entryFloorEntry == null || ((acao) entryFloorEntry.getValue()).a != ((acao) entry2.getValue()).a + 1) {
                        break;
                    } else {
                        entryHigherEntry = treeMap2.higherEntry((Long) entryFloorEntry.getKey());
                    }
                }
                long jLongValue3 = ((Long) entry2.getKey()).longValue() + ((long) ((acao) entry2.getValue()).b) + 1;
                lValueOf2 = Long.valueOf(((acao) entry2.getValue()).a + 1);
                lValueOf4 = Long.valueOf(jLongValue3);
            } else {
                lValueOf2 = e(j);
            }
            jLongValue = lValueOf4.longValue();
        } else {
            Map.Entry entryFloorEntry2 = treeMap2.floorEntry(Long.valueOf(j));
            if (entryFloorEntry2 != null && j - ((Long) entryFloorEntry2.getKey()).longValue() < ((acao) entryFloorEntry2.getValue()).b) {
                Map.Entry entryHigherEntry2 = treeMap2.higherEntry((Long) entryFloorEntry2.getKey());
                while (true) {
                    Map.Entry entry3 = entryHigherEntry2;
                    entry = entryFloorEntry2;
                    entryFloorEntry2 = entry3;
                    if (entryFloorEntry2 == null || ((acao) entryFloorEntry2.getValue()).a != ((acao) entry.getValue()).a + 1) {
                        break;
                    } else {
                        entryHigherEntry2 = treeMap2.higherEntry((Long) entryFloorEntry2.getKey());
                    }
                }
                lValueOf = Long.valueOf(((acao) entry.getValue()).a + 1);
            } else {
                lValueOf = e(j);
            }
            jLongValue = j;
            lValueOf2 = lValueOf;
        }
        if (lValueOf2 == null || this.j == null || lValueOf2.longValue() <= this.j.longValue()) {
            Long l2 = this.m;
            if (l2 != null) {
                Long l3 = this.n;
                if (l3 != null) {
                    if (lValueOf2 == null) {
                        lValueOf2 = l2;
                    } else if (lValueOf2.longValue() <= l3.longValue() && lValueOf2.longValue() >= l2.longValue()) {
                    }
                    if (lValueOf2 == null) {
                        ScheduledExecutorService scheduledExecutorService = this.c;
                        byl bylVar = new byl();
                        bylVar.b = this.f;
                        byo byoVarA = bylVar.a();
                        ablmVar = this.g;
                        if (ablmVar != null) {
                            wgs wgsVar = this.d;
                            if (lValueOf2 != null) {
                                jLongValue2 = lValueOf2.longValue();
                                l = lValueOf2;
                            } else {
                                jLongValue2 = -1;
                            }
                            Long l4 = l;
                            uriA2 = ablmVar.a(wgsVar, jLongValue2, jLongValue);
                            lValueOf2 = l4;
                        }
                        if (uriA2 == null) {
                            uriA2 = this.d.e;
                        }
                        if (lValueOf2 == null) {
                            tyt tytVar = new tyt(uriA2);
                            tytVar.e("cpn", this.h);
                            tytVar.e("headm", "3");
                            uriA = tytVar.a();
                        } else {
                            tyt tytVar2 = new tyt(uriA2);
                            tytVar2.e("cpn", this.h);
                            tytVar2.e("sq", lValueOf2.toString());
                            uriA = tytVar2.a();
                        }
                        futureSubmit = scheduledExecutorService.submit(new acbh(byoVarA, uriA, acbdVar));
                    } else if (this.q.a(this.e, jLongValue, lValueOf2.longValue())) {
                        this.k = lValueOf2;
                        ScheduledExecutorService scheduledExecutorService2 = this.c;
                        byl bylVar2 = new byl();
                        bylVar2.b = this.f;
                        byo byoVarA2 = bylVar2.a();
                        ablmVar = this.g;
                        if (ablmVar != null) {
                            wgs wgsVar2 = this.d;
                            if (lValueOf2 != null) {
                                jLongValue2 = lValueOf2.longValue();
                                l = lValueOf2;
                            } else {
                                jLongValue2 = -1;
                            }
                            Long l5 = l;
                            uriA2 = ablmVar.a(wgsVar2, jLongValue2, jLongValue);
                            lValueOf2 = l5;
                        }
                        if (uriA2 == null) {
                            uriA2 = this.d.e;
                        }
                        if (lValueOf2 == null) {
                            tyt tytVar3 = new tyt(uriA2);
                            tytVar3.e("cpn", this.h);
                            tytVar3.e("headm", "3");
                            uriA = tytVar3.a();
                        } else {
                            tyt tytVar4 = new tyt(uriA2);
                            tytVar4.e("cpn", this.h);
                            tytVar4.e("sq", lValueOf2.toString());
                            uriA = tytVar4.a();
                        }
                        futureSubmit = scheduledExecutorService2.submit(new acbh(byoVarA2, uriA, acbdVar));
                    }
                } else if (lValueOf2 == null || lValueOf2.longValue() >= l2.longValue()) {
                    if (lValueOf2 == null) {
                        ScheduledExecutorService scheduledExecutorService3 = this.c;
                        byl bylVar3 = new byl();
                        bylVar3.b = this.f;
                        byo byoVarA3 = bylVar3.a();
                        ablmVar = this.g;
                        if (ablmVar != null) {
                            wgs wgsVar3 = this.d;
                            if (lValueOf2 != null) {
                                jLongValue2 = lValueOf2.longValue();
                                l = lValueOf2;
                            } else {
                                jLongValue2 = -1;
                            }
                            Long l6 = l;
                            uriA2 = ablmVar.a(wgsVar3, jLongValue2, jLongValue);
                            lValueOf2 = l6;
                        }
                        if (uriA2 == null) {
                            uriA2 = this.d.e;
                        }
                        if (lValueOf2 == null) {
                            tyt tytVar5 = new tyt(uriA2);
                            tytVar5.e("cpn", this.h);
                            tytVar5.e("headm", "3");
                            uriA = tytVar5.a();
                        } else {
                            tyt tytVar6 = new tyt(uriA2);
                            tytVar6.e("cpn", this.h);
                            tytVar6.e("sq", lValueOf2.toString());
                            uriA = tytVar6.a();
                        }
                        futureSubmit = scheduledExecutorService3.submit(new acbh(byoVarA3, uriA, acbdVar));
                    } else if (this.q.a(this.e, jLongValue, lValueOf2.longValue())) {
                        this.k = lValueOf2;
                        ScheduledExecutorService scheduledExecutorService4 = this.c;
                        byl bylVar4 = new byl();
                        bylVar4.b = this.f;
                        byo byoVarA4 = bylVar4.a();
                        ablmVar = this.g;
                        if (ablmVar != null) {
                            wgs wgsVar4 = this.d;
                            if (lValueOf2 != null) {
                                jLongValue2 = lValueOf2.longValue();
                                l = lValueOf2;
                            } else {
                                jLongValue2 = -1;
                            }
                            Long l7 = l;
                            uriA2 = ablmVar.a(wgsVar4, jLongValue2, jLongValue);
                            lValueOf2 = l7;
                        }
                        if (uriA2 == null) {
                            uriA2 = this.d.e;
                        }
                        if (lValueOf2 == null) {
                            tyt tytVar7 = new tyt(uriA2);
                            tytVar7.e("cpn", this.h);
                            tytVar7.e("headm", "3");
                            uriA = tytVar7.a();
                        } else {
                            tyt tytVar8 = new tyt(uriA2);
                            tytVar8.e("cpn", this.h);
                            tytVar8.e("sq", lValueOf2.toString());
                            uriA = tytVar8.a();
                        }
                        futureSubmit = scheduledExecutorService4.submit(new acbh(byoVarA4, uriA, acbdVar));
                    }
                }
            } else if (lValueOf2 == null) {
                ScheduledExecutorService scheduledExecutorService5 = this.c;
                byl bylVar5 = new byl();
                bylVar5.b = this.f;
                byo byoVarA5 = bylVar5.a();
                ablmVar = this.g;
                if (ablmVar != null) {
                    wgs wgsVar5 = this.d;
                    if (lValueOf2 != null) {
                        jLongValue2 = lValueOf2.longValue();
                        l = lValueOf2;
                    } else {
                        jLongValue2 = -1;
                    }
                    Long l8 = l;
                    uriA2 = ablmVar.a(wgsVar5, jLongValue2, jLongValue);
                    lValueOf2 = l8;
                }
                if (uriA2 == null) {
                    uriA2 = this.d.e;
                }
                if (lValueOf2 == null) {
                    tyt tytVar9 = new tyt(uriA2);
                    tytVar9.e("cpn", this.h);
                    tytVar9.e("headm", "3");
                    uriA = tytVar9.a();
                } else {
                    tyt tytVar10 = new tyt(uriA2);
                    tytVar10.e("cpn", this.h);
                    tytVar10.e("sq", lValueOf2.toString());
                    uriA = tytVar10.a();
                }
                futureSubmit = scheduledExecutorService5.submit(new acbh(byoVarA5, uriA, acbdVar));
            } else if (this.q.a(this.e, jLongValue, lValueOf2.longValue())) {
                this.k = lValueOf2;
                ScheduledExecutorService scheduledExecutorService6 = this.c;
                byl bylVar6 = new byl();
                bylVar6.b = this.f;
                byo byoVarA6 = bylVar6.a();
                ablmVar = this.g;
                if (ablmVar != null) {
                    wgs wgsVar6 = this.d;
                    if (lValueOf2 != null) {
                        jLongValue2 = lValueOf2.longValue();
                        l = lValueOf2;
                    } else {
                        jLongValue2 = -1;
                    }
                    Long l9 = l;
                    uriA2 = ablmVar.a(wgsVar6, jLongValue2, jLongValue);
                    lValueOf2 = l9;
                }
                if (uriA2 == null) {
                    uriA2 = this.d.e;
                }
                if (lValueOf2 == null) {
                    tyt tytVar11 = new tyt(uriA2);
                    tytVar11.e("cpn", this.h);
                    tytVar11.e("headm", "3");
                    uriA = tytVar11.a();
                } else {
                    tyt tytVar12 = new tyt(uriA2);
                    tytVar12.e("cpn", this.h);
                    tytVar12.e("sq", lValueOf2.toString());
                    uriA = tytVar12.a();
                }
                futureSubmit = scheduledExecutorService6.submit(new acbh(byoVarA6, uriA, acbdVar));
            }
        }
        this.i = futureSubmit;
    }

    @Override // defpackage.acaj
    public final /* synthetic */ void d(long j, float f) {
    }
}
