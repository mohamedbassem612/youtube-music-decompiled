package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.libraries.multiplatform.elements.runtime.ElementsRuntimeImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jup implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jup(long j, ufq ufqVar, int i) {
        this.$cid = i;
        this.a = j;
        this.b = ufqVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [cfx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, ufq] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        long j;
        long j2;
        long j3;
        ArrayList arrayList;
        Map.Entry entry;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                ((juv) this.b).ae.O(this.a);
                break;
            case 1:
                int i = bwp.a;
                ((boy) this.b).a.e(this.a);
                break;
            case 2:
                ((juv) this.b).ae.N(this.a);
                break;
            case 3:
                ((ldr) this.b).i().Q("sdk_init", this.a);
                break;
            case 4:
                Object obj = this.b;
                adam adamVar = lcl.bh;
                ldr ldrVar = (ldr) obj;
                lbt lbtVar = ldrVar.c;
                if (lbtVar.F(null, adamVar)) {
                    ldrVar.i().ah("legacy_initialize");
                }
                if (lbtVar.F(null, lcl.bm) && lbtVar.F(null, lcl.aT)) {
                    ldrVar.i().Q("sdk_init", this.a);
                    break;
                }
                break;
            case 5:
                ldz ldzVar = (ldz) this.b;
                ldi ldiVar = ldzVar.J().g;
                long j4 = this.a;
                ldiVar.b(j4);
                ldzVar.aT().j.b("Session timeout duration set", Long.valueOf(j4));
                break;
            case 6:
                Object obj2 = this.b;
                ldz ldzVar2 = (ldz) obj2;
                ldzVar2.o();
                ((lbc) obj2).a();
                ldzVar2.aT().j.a("Resetting analytics data (FE)");
                lbb lbbVar = (lbb) obj2;
                lhj lhjVarM = lbbVar.m();
                lhjVarM.o();
                lhe lheVar = lhjVarM.b;
                lheVar.c.a();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                lheVar.a = jElapsedRealtime;
                lheVar.b = jElapsedRealtime;
                lbbVar.h().x();
                ler lerVar = (ler) obj2;
                boolean z = !lerVar.t.w();
                ldl ldlVarJ = ldzVar2.J();
                ldlVarJ.d.b(this.a);
                if (!TextUtils.isEmpty(ldlVarJ.J().p.a())) {
                    ldlVarJ.p.b(null);
                }
                ldlVarJ.k.b(0L);
                ldlVarJ.l.b(0L);
                if (!ldlVarJ.G().q()) {
                    ldlVarJ.j(z);
                }
                ldlVarJ.q.b(null);
                ldlVarJ.r.b(0L);
                ldlVarJ.s.b(null);
                lff lffVarJ = lbbVar.j();
                lffVarJ.o();
                lffVarJ.a();
                lbg lbgVarS = lffVarJ.s(false);
                lffVarJ.k().t();
                lffVarJ.B(new ldu(lffVarJ, lbgVarS, 20));
                lbbVar.m().d.p();
                lerVar.c = z;
                lbbVar.j().w(new AtomicReference());
                break;
            case 7:
                Object obj3 = this.b;
                ((lbb) obj3).g().e(this.a);
                ((lhh) obj3).c = null;
                break;
            case 8:
                Object obj4 = this.b;
                ldz ldzVar3 = (ldz) obj4;
                ldzVar3.o();
                lhj lhjVar = (lhj) obj4;
                lhjVar.t();
                lcx lcxVar = ldzVar3.aT().k;
                long j5 = this.a;
                lcxVar.b("Activity paused, time", Long.valueOf(j5));
                lhc lhcVar = lhjVar.c;
                lhcVar.a = new lhb(lhcVar, System.currentTimeMillis(), j5);
                lhcVar.m().s().postDelayed(lhcVar.a, 2000L);
                if (ldzVar3.G().p()) {
                    lhjVar.b.d();
                }
                break;
            case 9:
                ((ElementsRuntimeImpl) this.b).g(this.a);
                break;
            case 10:
                Iterator it = ((tun) this.b).f.iterator();
                while (it.hasNext()) {
                    ((tul) it.next()).jn(this.a);
                }
                break;
            case 11:
                this.b.a(aikz.b(this.a));
                break;
            case 12:
                long j6 = this.a;
                Object obj5 = this.b;
                try {
                    if (((ygl) obj5).d) {
                        ((ygl) obj5).n(((ygl) obj5).d(j6));
                    }
                } catch (IOException unused) {
                    return;
                }
                break;
            case 13:
                ((ywh) this.b).b.s(this.a);
                break;
            case 14:
                ((yyv) this.b).aA(this.a);
                break;
            case 15:
                final yyv yyvVar = (yyv) this.b;
                AtomicLong atomicLong = yyvVar.O;
                final long j7 = this.a;
                if (j7 == atomicLong.get()) {
                    if (yyvVar.h.m != null) {
                        final long jE = yyvVar.e();
                        final long jT = yyvVar.t();
                        yyvVar.K.execute(afwl.i(new Runnable() { // from class: yyo
                            @Override // java.lang.Runnable
                            public final void run() {
                                yyv yyvVar2 = yyvVar;
                                long j8 = j7;
                                AtomicLong atomicLong2 = yyvVar2.O;
                                if (j8 == atomicLong2.get()) {
                                    long j9 = jT;
                                    if (j9 > 0 && j9 < 10000) {
                                        for (int i2 = 0; i2 < 20; i2++) {
                                        }
                                    }
                                    synchronized (yyvVar2.N) {
                                        if (yyvVar2.Q && j8 == atomicLong2.get()) {
                                            yyvVar2.P = yyvVar2.K.schedule(afwl.i(new jup(yyvVar2, j8, 14)), yyvVar2.h.d.i.c(44, 45755449L, 100L), TimeUnit.MILLISECONDS);
                                        }
                                    }
                                }
                            }
                        }));
                    } else {
                        yyvVar.aB();
                    }
                }
                break;
            case 16:
                ((yyv) this.b).aA(this.a);
                break;
            case 17:
                ((zdw) this.b).b.F(this.a);
                break;
            case 18:
                ((zup) this.b).b(this.a);
                break;
            case 19:
                long j8 = this.a;
                Object obj6 = this.b;
                Long lValueOf = Long.valueOf(j8);
                acah acahVar = (acah) obj6;
                TreeMap treeMap = acahVar.a;
                Map.Entry entryFloorEntry = treeMap.floorEntry(lValueOf);
                if (entryFloorEntry == null || j8 - ((Long) entryFloorEntry.getKey()).longValue() >= ((acao) entryFloorEntry.getValue()).b) {
                    j = j8 / 5000;
                } else {
                    Map.Entry entryHigherEntry = treeMap.higherEntry((Long) entryFloorEntry.getKey());
                    while (true) {
                        Map.Entry entry2 = entryHigherEntry;
                        entry = entryFloorEntry;
                        entryFloorEntry = entry2;
                        if (entryFloorEntry != null && ((acao) entryFloorEntry.getValue()).a == ((acao) entry.getValue()).a + 1) {
                            entryHigherEntry = treeMap.higherEntry((Long) entryFloorEntry.getKey());
                        }
                    }
                    j = ((acao) entry.getValue()).a + 1;
                }
                long j9 = j;
                acac acacVar = acahVar.b;
                if (acacVar.a(treeMap, j8, j9)) {
                    long j10 = 5000 * j9;
                    acbn acbnVar = acahVar.c;
                    twi twiVar = acahVar.d;
                    ArrayList arrayList2 = new ArrayList();
                    List list = acbnVar.b;
                    if (list.isEmpty()) {
                        j3 = j10;
                        arrayList = arrayList2;
                    } else {
                        int iBinarySearch = Collections.binarySearch(list, Long.valueOf(j10));
                        if (iBinarySearch < 0) {
                            iBinarySearch = Math.abs(iBinarySearch + 1);
                        }
                        while (true) {
                            j2 = 4999 + j10;
                            if (iBinarySearch < list.size() - 1 && ((Long) list.get(iBinarySearch)).longValue() <= j2) {
                                twi twiVar2 = twiVar;
                                int i2 = iBinarySearch + 1;
                                long j11 = j10;
                                ArrayList arrayList3 = arrayList2;
                                arrayList3.add(new acbl(((Long) list.get(iBinarySearch)).longValue(), ((Long) list.get(i2)).longValue(), acbnVar.c(((Long) list.get(iBinarySearch)).longValue()), twiVar2));
                                iBinarySearch = i2;
                                arrayList2 = arrayList3;
                                list = list;
                                twiVar = twiVar2;
                                j10 = j11;
                            }
                        }
                        j3 = j10;
                        twi twiVar3 = twiVar;
                        arrayList = arrayList2;
                        List list2 = list;
                        Long l = (Long) aguu.K(list2);
                        if (iBinarySearch == list2.size() - 1 && l != null && l.longValue() <= j2) {
                            arrayList.add(new acbl(l.longValue(), Long.MAX_VALUE, new ArrayList(), twiVar3));
                        }
                    }
                    treeMap.put(Long.valueOf(j3), new acao(j9, 5000, arrayList));
                    acga acgaVar = acahVar.g;
                    acgaVar.h(arrayList);
                    acacVar.b(treeMap, acgaVar, j8);
                    acad acadVar = (acad) acahVar.f;
                    acadVar.a.g(acadVar.b, false);
                }
                break;
            default:
                long j12 = this.a;
                Object obj7 = this.b;
                acah acahVar2 = (acah) obj7;
                acahVar2.e.execute(afwl.i(new abwl(obj7, acahVar2.c.c(j12), 8, bArr)));
                break;
        }
    }

    public /* synthetic */ jup(Object obj, long j, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = j;
    }

    public jup(lbc lbcVar, long j, int i) {
        this.$cid = i;
        this.a = j;
        this.b = lbcVar;
    }

    public jup(ldr ldrVar, long j, int i, byte[] bArr) {
        this.$cid = i;
        this.b = ldrVar;
        this.a = j;
    }
}
