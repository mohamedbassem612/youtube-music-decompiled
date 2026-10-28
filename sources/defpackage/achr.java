package defpackage;

import android.os.Handler;
import j$.lang.Iterable$EL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class achr extends acii {
    public static final long a;
    public final awmd b;
    public final abmt c;
    public awku d;
    public achq e;
    public volatile boolean f;
    public final Set g;
    achl h;
    public long i;
    public boolean j;
    public acib k;
    private final ScheduledExecutorService l;
    private final awmd m;
    private final Handler n;
    private final Executor o;
    private final vyo p;
    private final SecureRandom q;
    private final wjb r;
    private final xeu s;
    private final Map t;
    private String u;
    private final AtomicInteger v;
    private final mbc w;
    private final boolean x;
    private final boolean y;
    private final dxu z;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a = 30000L;
    }

    public achr(awmd awmdVar, ScheduledExecutorService scheduledExecutorService, awmd awmdVar2, dxu dxuVar, Handler handler, Executor executor, vyo vyoVar, abmt abmtVar, SecureRandom secureRandom, wjb wjbVar, xeu xeuVar, awku awkuVar, mbc mbcVar) {
        super(0);
        this.t = new HashMap();
        this.u = null;
        this.f = false;
        this.i = a;
        this.k = null;
        awmdVar.getClass();
        this.b = awmdVar;
        scheduledExecutorService.getClass();
        this.l = scheduledExecutorService;
        this.m = awmdVar2;
        this.z = dxuVar;
        handler.getClass();
        this.n = handler;
        this.g = abmtVar.ac() ? new CopyOnWriteArraySet() : new HashSet();
        this.d = awkuVar;
        this.o = executor;
        this.p = vyoVar;
        this.c = abmtVar;
        this.q = secureRandom;
        this.v = new AtomicInteger();
        this.r = wjbVar;
        this.s = xeuVar;
        this.w = mbcVar;
        this.x = abmtVar.o.l(267, 45814502L, false);
        this.y = abmtVar.o.l(268, 45814503L, false);
    }

    private final achq M(wjf wjfVar, String str) {
        wjf wjfVar2;
        String str2;
        byte[] bArr;
        alvl alvlVar;
        boolean z;
        alvf alvfVarS = wjfVar.s();
        if (this.j) {
            wjfVar2 = wjfVar;
        } else {
            if (abmt.aG(this.p)) {
                wjfVar2 = wjfVar;
                if (wjfVar2.K(this.r)) {
                    z = true;
                }
                this.j = z;
            } else {
                wjfVar2 = wjfVar;
            }
            z = false;
            this.j = z;
        }
        String strG = wjfVar2.G();
        byte[] bArrAb = wjfVar2.ab();
        alvl alvlVarT = wjfVar2.t();
        achp achpVar = new achp();
        achpVar.a(strG);
        achpVar.b = bArrAb;
        if (alvlVarT == null) {
            throw new NullPointerException("Null initialPlayabilityStatus");
        }
        achpVar.c = alvlVarT;
        achpVar.b(false);
        achpVar.c(false);
        achpVar.d = wjfVar2.g();
        achpVar.a(wjfVar2.G());
        achpVar.e = alvfVarS;
        achpVar.b = wjfVar2.ab();
        achpVar.g = wjfVar2.w();
        achpVar.b(this.j);
        achpVar.h = wjfVar2.h().d();
        achpVar.i = wjfVar2.h().c();
        achpVar.c(wjfVar2.V());
        achpVar.m = wjfVar2.h().a();
        achpVar.l = str;
        if (alvfVarS != null) {
            achpVar.f = alvfVarS.i;
        }
        if (achpVar.n == 3 && (str2 = achpVar.a) != null && (bArr = achpVar.b) != null && (alvlVar = achpVar.c) != null) {
            return new achq(str2, bArr, alvlVar, achpVar.d, achpVar.e, achpVar.f, achpVar.g, achpVar.h, achpVar.i, achpVar.j, achpVar.k, achpVar.l, achpVar.m);
        }
        StringBuilder sb = new StringBuilder();
        if (achpVar.a == null) {
            sb.append(" currentVideoId");
        }
        if (achpVar.b == null) {
            sb.append(" trackingParams");
        }
        if (achpVar.c == null) {
            sb.append(" initialPlayabilityStatus");
        }
        if ((achpVar.n & 1) == 0) {
            sb.append(" enablePremiereTrailerCodepath");
        }
        if ((achpVar.n & 2) == 0) {
            sb.append(" live");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    private final void N() {
        achl achlVar = this.h;
        if (achlVar != null) {
            achlVar.a();
            this.h = null;
        }
        Set set = this.g;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((achv) it.next()).l();
        }
        set.clear();
        this.d.kn();
    }

    private final void O(aboe aboeVar, alvl alvlVar, boolean z) {
        Q();
        aihf aihfVarCreateBuilder = alhb.a.createBuilder();
        if (alvlVar != null) {
            aigj aigjVar = alvlVar.t;
            aihfVarCreateBuilder.copyOnWrite();
            alhb alhbVar = (alhb) aihfVarCreateBuilder.instance;
            aigjVar.getClass();
            alhbVar.b |= 1;
            alhbVar.c = aigjVar;
        }
        xeu xeuVar = this.s;
        aihfVarCreateBuilder.copyOnWrite();
        alhb alhbVar2 = (alhb) aihfVarCreateBuilder.instance;
        alhbVar2.b |= 2;
        alhbVar2.d = z;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.HEARTBEAT_ACTION_PLAYER_HALTED);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
        } else {
            alos alosVar = (alos) alou.a.createBuilder();
            alosVar.copyOnWrite();
            alou alouVar = (alou) alosVar.instance;
            alhb alhbVar3 = (alhb) aihfVarCreateBuilder.build();
            alhbVar3.getClass();
            alouVar.d = alhbVar3;
            alouVar.c = 332;
            xeuVar.b((alou) alosVar.build());
        }
        acib acibVar = this.k;
        if (acibVar != null) {
            this.n.post(new abwl(acibVar, aboeVar, 15));
        }
    }

    private final synchronized void P(Collection collection) {
        if (this.c.ac()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((achv) it.next()).l();
            }
            this.g.removeAll(collection);
            return;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            achv achvVar = (achv) it2.next();
            achvVar.l();
            this.g.remove(achvVar);
        }
    }

    private final void Q() {
        this.v.set(0);
    }

    private final void R() {
        ArrayList arrayList = new ArrayList();
        achq achqVar = this.e;
        if (achqVar == null) {
            P(new ArrayList(this.g));
            return;
        }
        if (this.x && achqVar.e == null) {
            return;
        }
        achl achlVar = new achl(this, achqVar);
        acho achoVar = achlVar.d;
        Set<achv> set = this.g;
        achu achuVarA = achoVar.a();
        boolean z = false;
        boolean z2 = false;
        for (achv achvVar : set) {
            if (achvVar.m(achqVar, null)) {
                achs achsVarF = achvVar.f();
                if (achsVarF != null) {
                    achlVar.b.add(achsVarF);
                }
                int iB = achvVar.b(achuVarA);
                if (iB == 0) {
                    z2 = true;
                } else if (iB == 4) {
                    aboe aboeVarD = achvVar.d(achuVarA.a);
                    if (aboeVarD != null) {
                        S(achlVar, aboeVarD);
                        z = true;
                    }
                } else if (iB != 5) {
                    arrayList.add(achvVar);
                }
            } else {
                arrayList.add(achvVar);
            }
        }
        if (!z && z2) {
            U(achlVar, this.i);
        }
        alvl alvlVar = achuVarA.a;
        if (alvlVar != null) {
            this.d.kk(alvlVar);
        }
        P(arrayList);
    }

    private final synchronized void S(achl achlVar, aboe aboeVar) {
        Q();
        this.h = achlVar;
        F(aboeVar);
    }

    private final synchronized void T(long j) {
        achl achlVar = this.h;
        if (achlVar != null) {
            E(achlVar, j);
        }
    }

    private final synchronized void U(achl achlVar, long j) {
        Q();
        this.h = achlVar;
        E(achlVar, j);
    }

    private static boolean V(alvl alvlVar) {
        if (alvlVar != null && (alvlVar.b & 524288) != 0) {
            alvg alvgVar = alvlVar.r;
            if (alvgVar == null) {
                alvgVar = alvg.a;
            }
            if ((alvgVar.b & 1) != 0) {
                alvg alvgVar2 = alvlVar.r;
                if (alvgVar2 == null) {
                    alvgVar2 = alvg.a;
                }
                amsp amspVar = alvgVar2.c;
                if (amspVar == null) {
                    amspVar = amsp.a;
                }
                if ((amspVar.b & 32) != 0) {
                    alvg alvgVar3 = alvlVar.r;
                    if (alvgVar3 == null) {
                        alvgVar3 = alvg.a;
                    }
                    amsp amspVar2 = alvgVar3.c;
                    if (amspVar2 == null) {
                        amspVar2 = amsp.a;
                    }
                    if (amspVar2.g > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void A() {
        Collection collection = (Collection) this.m.io();
        Set set = this.g;
        set.addAll(collection);
        Iterable$EL.forEach(set, new aavj(3));
        this.d = new awku();
    }

    public final void B(avlh avlhVar, avlh avlhVar2) {
        new avmm().e(avlhVar.al(new acae(this, 10), new achk(0)), avlhVar2.ak(new acae(this, 11)));
    }

    public final synchronized void C(wjf wjfVar, String str) {
        achl achlVar;
        if (this.c.al()) {
            if (wjfVar != null && str != null) {
                achq achqVarM = M(wjfVar, str);
                this.t.put(str, achqVarM);
                String str2 = this.u;
                if (str2 == null) {
                    this.u = str;
                    str2 = str;
                }
                if (str.equals(str2)) {
                    this.e = achqVarM;
                    achl achlVar2 = this.h;
                    if (achlVar2 == null || !achlVar2.b()) {
                        if (this.y && this.g.isEmpty() && achqVarM.e != null) {
                            A();
                        }
                        this.i = z(null);
                        R();
                    }
                }
            }
        } else if (wjfVar != null && ((achlVar = this.h) == null || !achlVar.b())) {
            this.e = M(wjfVar, str);
            if (this.y && this.g.isEmpty() && this.e.e != null) {
                A();
            }
            this.i = z(null);
            R();
        }
    }

    public final synchronized void D() {
        if (this.c.al()) {
            this.t.clear();
            this.u = null;
        }
        this.e = null;
        this.i = a;
        N();
    }

    public final synchronized void E(achl achlVar, long j) {
        achlVar.a = this.l.schedule(achlVar, j, TimeUnit.MILLISECONDS);
    }

    public final synchronized void F(aboe aboeVar) {
        achq achqVar;
        alvf alvfVar;
        achq achqVar2;
        if (this.h == null || (achqVar = this.e) == null) {
            return;
        }
        AtomicInteger atomicInteger = this.v;
        abmt abmtVar = this.c;
        int iIncrementAndGet = atomicInteger.incrementAndGet();
        boolean z = false;
        if (abmtVar.bL() && (achqVar2 = this.e) != null && achqVar2.k) {
            z = true;
        }
        if ((!achqVar.j && !abmtVar.bk() && !z) || (alvfVar = achqVar.e) == null) {
            Q();
            T(this.i);
        } else if (iIncrementAndGet <= alvfVar.e) {
            T((((long) atomicInteger.get()) * 2000) + ((long) (this.q.nextInt(999) - 499)));
        } else if (!alvfVar.g) {
            O(aboeVar, null, true);
        } else {
            Q();
            T(this.i);
        }
    }

    @Override // defpackage.acii
    public final void G(acib acibVar) {
        this.k = acibVar;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x016a A[Catch: all -> 0x0177, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0005, B:7:0x0014, B:9:0x0018, B:10:0x001a, B:12:0x001f, B:14:0x0027, B:15:0x0029, B:17:0x002d, B:19:0x0035, B:21:0x003b, B:23:0x0041, B:24:0x0045, B:25:0x0056, B:26:0x0059, B:27:0x0063, B:29:0x0069, B:31:0x0077, B:33:0x007d, B:36:0x0084, B:41:0x0090, B:43:0x0096, B:47:0x00ab, B:49:0x00b2, B:51:0x00bf, B:53:0x00c7, B:54:0x00c9, B:57:0x00cf, B:61:0x00d8, B:63:0x00de, B:65:0x00e4, B:66:0x00e8, B:67:0x00f9, B:69:0x0100, B:71:0x0104, B:74:0x010e, B:75:0x0113, B:77:0x011e, B:80:0x0128, B:81:0x012d, B:83:0x0133, B:85:0x013b, B:86:0x013d, B:88:0x0141, B:91:0x015f, B:92:0x0164, B:93:0x016a), top: B:104:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0170 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:97:0x0172  */
    /* JADX WARN: Instruction removed from duplicated block: B:95:0x0170, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
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
    public final synchronized boolean H(achu achuVar) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        alvl alvlVar = achuVar.a;
        acib acibVar = this.k;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (acibVar != null && alvlVar != null) {
            alvg alvgVar = alvlVar.r;
            if (alvgVar == null) {
                alvgVar = alvg.a;
            }
            if ((alvgVar.b & 1) != 0) {
                aony aonyVarA = aony.a(alvlVar.c);
                if (aonyVarA == null) {
                    aonyVarA = aony.OK;
                }
                if (aonyVarA == aony.LIVE_STREAM_OFFLINE) {
                    if (!this.c.as()) {
                        acibVar.ap();
                    } else if (!a.x()) {
                        this.o.execute(afwl.i(new abwl(achuVar, acibVar, 16, objArr2 == true ? 1 : 0)));
                    } else if (!achuVar.a()) {
                        acibVar.ap();
                    }
                }
            }
        }
        Set<achv> set = this.g;
        z = false;
        aboe aboeVarD = null;
        aboe aboeVarD2 = null;
        boolean z2 = false;
        for (achv achvVar : set) {
            if (achvVar.m(this.e, achuVar)) {
                int iC = achvVar.c(achuVar);
                if (iC == 1) {
                    arrayList.add(achvVar);
                } else if (iC == 2) {
                    aboeVarD = achvVar.d(alvlVar);
                } else {
                    if (iC != 0) {
                        if (iC == 3) {
                            if (acibVar != null && aaje.u(alvlVar)) {
                                this.o.execute(afwl.i(new abwl(achuVar, acibVar, 17, objArr == true ? 1 : 0)));
                            }
                        } else if (iC == 4) {
                            aboeVarD2 = achvVar.d(alvlVar);
                        }
                    }
                    z2 = true;
                }
            }
        }
        if (alvlVar != null) {
            this.d.kk(alvlVar);
            if (this.c.bH()) {
                int i = alvlVar.c;
                aony aonyVarA2 = aony.a(i);
                if (aonyVarA2 == null) {
                    aonyVarA2 = aony.OK;
                }
                aony aonyVar = aony.OK;
                if (aonyVarA2 != aonyVar && acibVar != null) {
                    aony aonyVarA3 = aony.a(i);
                    aony aonyVar2 = aonyVarA3 == null ? aonyVar : aonyVarA3;
                    if (!a.x()) {
                        this.o.execute(afwl.i(new aapc(achuVar, acibVar, aonyVar2, 12, (short[]) null)));
                    } else if (!achuVar.a()) {
                        acibVar.r(aonyVar2);
                    }
                }
            }
        }
        P(arrayList);
        achq achqVar = this.e;
        String str = achqVar != null ? achqVar.l : null;
        if (aboeVarD != null) {
            if (this.c.aD() && str != null) {
                aboeVarD.a(str, "");
            }
            O(aboeVarD, alvlVar, false);
            this.z.e(aboeVarD);
        } else if (aboeVarD2 != null) {
            if (this.c.aD() && str != null) {
                aboeVarD2.a(str, "");
            }
            F(aboeVarD2);
        } else if (alvlVar != null) {
            aony aonyVarA4 = aony.a(alvlVar.c);
            if (aonyVarA4 == null) {
                aonyVarA4 = aony.OK;
            }
            if (aonyVarA4 == aony.UNPLAYABLE) {
                aboe aboeVar = new aboe(3, false, 2, alvlVar.e, null, null, null, null);
                if (this.c.aD() && str != null) {
                    aboeVar.a(str, "");
                }
                this.z.e(aboeVar);
            } else if (set.isEmpty()) {
                z = z2;
            }
        } else if (set.isEmpty()) {
            z = z2;
        }
        return z;
    }

    public final boolean I() {
        achq achqVar = this.e;
        alvf alvfVar = achqVar != null ? achqVar.e : null;
        return (!this.c.g.l(305, 45738237L, false) || alvfVar == null || alvfVar.k) ? false : true;
    }

    @Override // defpackage.acii
    public final synchronized void J(String str) {
        if (this.c.al()) {
            achl achlVar = this.h;
            if (achlVar != null) {
                achlVar.a();
                this.h = null;
            }
            this.u = str;
            achq achqVar = str != null ? (achq) this.t.get(str) : null;
            if (achqVar != null) {
                this.e = achqVar;
                if (this.y && this.g.isEmpty() && this.e.e != null) {
                    A();
                }
                this.i = z(null);
                R();
            } else {
                this.e = null;
            }
        }
    }

    @Override // defpackage.acii
    public final void b(String str) {
        achl achlVar = this.h;
        if (achlVar != null) {
            achlVar.a();
            this.h = null;
        }
    }

    @Override // defpackage.acii
    public final synchronized void e(String str) {
        if (this.c.al()) {
            this.t.remove(str);
            if (str != null && str.equals(this.u)) {
                this.u = null;
                this.e = null;
                achl achlVar = this.h;
                if (achlVar != null) {
                    achlVar.a();
                    this.h = null;
                }
            }
        }
    }

    @Override // defpackage.acii
    public final synchronized void f(aazj aazjVar) {
        achl achlVar;
        afvn afvnVarB = aawb.b(aazjVar, "MHPL");
        try {
            int iOrdinal = aazjVar.a.ordinal();
            if (iOrdinal == 0) {
                D();
            } else if (iOrdinal == 1) {
                D();
                if (!this.y) {
                    A();
                }
            } else if (iOrdinal == 2) {
                String str = aazjVar.h;
                if (str == null) {
                    str = aazjVar.g;
                }
                C(aazjVar.b, str);
            } else if (iOrdinal == 8) {
                achl achlVar2 = this.h;
                if (achlVar2 == null || !achlVar2.b()) {
                    R();
                }
            } else if (iOrdinal == 9 && ((this.j || this.c.d.m(2, 45353986L)) && ((achlVar = this.h) == null || !achlVar.b()))) {
                R();
            }
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                ((achv) it.next()).i(aazjVar);
            }
            afvnVarB.close();
        } catch (Throwable th) {
            try {
                afvnVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.acii
    public final synchronized void g(aazk aazkVar) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((achv) it.next()).j(aazkVar);
        }
    }

    @Override // defpackage.acii
    public final void h(aazn aaznVar) {
        achl achlVar;
        if (I()) {
            boolean z = this.f;
            this.f = aaznVar.a == 3;
            achl achlVar2 = this.h;
            if (!this.f && z && achlVar2 != null && achlVar2.c && !this.l.isShutdown()) {
                E(achlVar2, 0L);
            }
        }
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((achv) it.next()).k(aaznVar);
        }
        if (aaznVar.a != 5 || (achlVar = this.h) == null) {
            return;
        }
        acho achoVar = achlVar.d;
        if (achoVar.c != null) {
            H(achoVar.a());
        }
    }

    @Override // defpackage.acii
    public final void w() {
        N();
        A();
        R();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x004d A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0010, B:11:0x0017, B:13:0x001b, B:18:0x0027, B:20:0x002d, B:22:0x0033, B:24:0x0037, B:25:0x0039, B:27:0x003f, B:29:0x0043, B:30:0x0045, B:32:0x0049, B:85:0x00e9, B:33:0x004d, B:35:0x0051, B:37:0x0057, B:39:0x005d, B:41:0x0065, B:43:0x0069, B:44:0x006b, B:46:0x006f, B:93:0x00f7, B:47:0x0073, B:49:0x007b, B:52:0x0081, B:54:0x0085, B:55:0x0087, B:57:0x008d, B:59:0x0091, B:60:0x0093, B:62:0x0097, B:63:0x009a, B:65:0x00a0, B:67:0x00a4, B:69:0x00a8, B:71:0x00ac, B:73:0x00c6, B:77:0x00d5, B:79:0x00dd, B:81:0x00e1, B:82:0x00e3, B:84:0x00e7, B:88:0x00ed, B:90:0x00f3), top: B:100:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0065 A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0010, B:11:0x0017, B:13:0x001b, B:18:0x0027, B:20:0x002d, B:22:0x0033, B:24:0x0037, B:25:0x0039, B:27:0x003f, B:29:0x0043, B:30:0x0045, B:32:0x0049, B:85:0x00e9, B:33:0x004d, B:35:0x0051, B:37:0x0057, B:39:0x005d, B:41:0x0065, B:43:0x0069, B:44:0x006b, B:46:0x006f, B:93:0x00f7, B:47:0x0073, B:49:0x007b, B:52:0x0081, B:54:0x0085, B:55:0x0087, B:57:0x008d, B:59:0x0091, B:60:0x0093, B:62:0x0097, B:63:0x009a, B:65:0x00a0, B:67:0x00a4, B:69:0x00a8, B:71:0x00ac, B:73:0x00c6, B:77:0x00d5, B:79:0x00dd, B:81:0x00e1, B:82:0x00e3, B:84:0x00e7, B:88:0x00ed, B:90:0x00f3), top: B:100:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0069 A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0010, B:11:0x0017, B:13:0x001b, B:18:0x0027, B:20:0x002d, B:22:0x0033, B:24:0x0037, B:25:0x0039, B:27:0x003f, B:29:0x0043, B:30:0x0045, B:32:0x0049, B:85:0x00e9, B:33:0x004d, B:35:0x0051, B:37:0x0057, B:39:0x005d, B:41:0x0065, B:43:0x0069, B:44:0x006b, B:46:0x006f, B:93:0x00f7, B:47:0x0073, B:49:0x007b, B:52:0x0081, B:54:0x0085, B:55:0x0087, B:57:0x008d, B:59:0x0091, B:60:0x0093, B:62:0x0097, B:63:0x009a, B:65:0x00a0, B:67:0x00a4, B:69:0x00a8, B:71:0x00ac, B:73:0x00c6, B:77:0x00d5, B:79:0x00dd, B:81:0x00e1, B:82:0x00e3, B:84:0x00e7, B:88:0x00ed, B:90:0x00f3), top: B:100:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x006f A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0010, B:11:0x0017, B:13:0x001b, B:18:0x0027, B:20:0x002d, B:22:0x0033, B:24:0x0037, B:25:0x0039, B:27:0x003f, B:29:0x0043, B:30:0x0045, B:32:0x0049, B:85:0x00e9, B:33:0x004d, B:35:0x0051, B:37:0x0057, B:39:0x005d, B:41:0x0065, B:43:0x0069, B:44:0x006b, B:46:0x006f, B:93:0x00f7, B:47:0x0073, B:49:0x007b, B:52:0x0081, B:54:0x0085, B:55:0x0087, B:57:0x008d, B:59:0x0091, B:60:0x0093, B:62:0x0097, B:63:0x009a, B:65:0x00a0, B:67:0x00a4, B:69:0x00a8, B:71:0x00ac, B:73:0x00c6, B:77:0x00d5, B:79:0x00dd, B:81:0x00e1, B:82:0x00e3, B:84:0x00e7, B:88:0x00ed, B:90:0x00f3), top: B:100:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x00ed A[Catch: all -> 0x00fd, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0010, B:11:0x0017, B:13:0x001b, B:18:0x0027, B:20:0x002d, B:22:0x0033, B:24:0x0037, B:25:0x0039, B:27:0x003f, B:29:0x0043, B:30:0x0045, B:32:0x0049, B:85:0x00e9, B:33:0x004d, B:35:0x0051, B:37:0x0057, B:39:0x005d, B:41:0x0065, B:43:0x0069, B:44:0x006b, B:46:0x006f, B:93:0x00f7, B:47:0x0073, B:49:0x007b, B:52:0x0081, B:54:0x0085, B:55:0x0087, B:57:0x008d, B:59:0x0091, B:60:0x0093, B:62:0x0097, B:63:0x009a, B:65:0x00a0, B:67:0x00a4, B:69:0x00a8, B:71:0x00ac, B:73:0x00c6, B:77:0x00d5, B:79:0x00dd, B:81:0x00e1, B:82:0x00e3, B:84:0x00e7, B:88:0x00ed, B:90:0x00f3), top: B:100:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x00f3 A[Catch: all -> 0x00fd, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0010, B:11:0x0017, B:13:0x001b, B:18:0x0027, B:20:0x002d, B:22:0x0033, B:24:0x0037, B:25:0x0039, B:27:0x003f, B:29:0x0043, B:30:0x0045, B:32:0x0049, B:85:0x00e9, B:33:0x004d, B:35:0x0051, B:37:0x0057, B:39:0x005d, B:41:0x0065, B:43:0x0069, B:44:0x006b, B:46:0x006f, B:93:0x00f7, B:47:0x0073, B:49:0x007b, B:52:0x0081, B:54:0x0085, B:55:0x0087, B:57:0x008d, B:59:0x0091, B:60:0x0093, B:62:0x0097, B:63:0x009a, B:65:0x00a0, B:67:0x00a4, B:69:0x00a8, B:71:0x00ac, B:73:0x00c6, B:77:0x00d5, B:79:0x00dd, B:81:0x00e1, B:82:0x00e3, B:84:0x00e7, B:88:0x00ed, B:90:0x00f3), top: B:100:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x00f7 A[Catch: all -> 0x00fd, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0010, B:11:0x0017, B:13:0x001b, B:18:0x0027, B:20:0x002d, B:22:0x0033, B:24:0x0037, B:25:0x0039, B:27:0x003f, B:29:0x0043, B:30:0x0045, B:32:0x0049, B:85:0x00e9, B:33:0x004d, B:35:0x0051, B:37:0x0057, B:39:0x005d, B:41:0x0065, B:43:0x0069, B:44:0x006b, B:46:0x006f, B:93:0x00f7, B:47:0x0073, B:49:0x007b, B:52:0x0081, B:54:0x0085, B:55:0x0087, B:57:0x008d, B:59:0x0091, B:60:0x0093, B:62:0x0097, B:63:0x009a, B:65:0x00a0, B:67:0x00a4, B:69:0x00a8, B:71:0x00ac, B:73:0x00c6, B:77:0x00d5, B:79:0x00dd, B:81:0x00e1, B:82:0x00e3, B:84:0x00e7, B:88:0x00ed, B:90:0x00f3), top: B:100:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x00f9 A[DONT_GENERATE, PHI: r4
      0x00f9: PHI (r4v5 long) = (r4v4 long), (r4v9 long) binds: [B:93:0x00f7, B:38:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:94:0x00f9, please report this as an issue */
    final synchronized long z(alus alusVar) {
        long jC;
        amsp amspVar;
        achq achqVar;
        wja wjaVar;
        alvf alvfVar;
        alvl alvlVar;
        alvg alvgVar;
        achq achqVar2;
        abmt abmtVar = this.c;
        achq achqVar3 = this.e;
        boolean z = false;
        if (abmtVar.bL() && (achqVar2 = this.e) != null && achqVar2.k) {
            z = true;
        }
        if (achqVar3 == null || !(achqVar3.j || abmtVar.bk() || z)) {
            aoqs aoqsVarR = abmt.r(this.p);
            if (aoqsVarR == null || !aoqsVarR.x) {
                if (abmtVar.y()) {
                    jC = a;
                } else {
                    jC = this.i;
                }
            } else if (alusVar != null) {
                alvl alvlVar2 = alusVar.d;
                if (alvlVar2 == null) {
                    alvlVar2 = alvl.a;
                }
                if (V(alvlVar2)) {
                    alvg alvgVar2 = alvlVar2.r;
                    if (alvgVar2 == null) {
                        alvgVar2 = alvg.a;
                    }
                    amspVar = alvgVar2.c;
                    if (amspVar == null) {
                        amspVar = amsp.a;
                    }
                    jC = amspVar.g;
                } else if (abmtVar.y()) {
                    jC = this.i;
                } else {
                    jC = a;
                }
            } else {
                if (abmtVar.y() && (achqVar = this.e) != null && achqVar.k && (wjaVar = achqVar.d) != null) {
                    long jB = this.w.b() - wjaVar.j;
                    vxz vxzVar = abmtVar.g;
                    if (jB > vxzVar.c(49, 45774710L, 0L)) {
                        jC = vxzVar.c(50, 45774711L, 0L);
                    }
                }
                if (achqVar3 != null) {
                    alvl alvlVar3 = achqVar3.c;
                    if (V(alvlVar3)) {
                        alvg alvgVar3 = alvlVar3.r;
                        if (alvgVar3 == null) {
                            alvgVar3 = alvg.a;
                        }
                        amspVar = alvgVar3.c;
                        if (amspVar == null) {
                            amspVar = amsp.a;
                        }
                        jC = amspVar.g;
                    }
                }
                if (abmtVar.y()) {
                    jC = this.i;
                } else {
                    jC = a;
                }
            }
        } else if (alusVar == null) {
            alvfVar = achqVar3.e;
            if (alvfVar != null && (alvfVar.b & 2) != 0) {
                jC = alvfVar.d;
                if (jC <= 0) {
                }
            }
            alvlVar = achqVar3.c;
            if (V(alvlVar)) {
                alvgVar = alvlVar.r;
                if (alvgVar == null) {
                    alvgVar = alvg.a;
                }
                amspVar = alvgVar.c;
                if (amspVar == null) {
                    amspVar = amsp.a;
                }
                jC = amspVar.g;
            }
            jC = a;
        } else {
            if ((alusVar.b & 32) != 0) {
                jC = alusVar.f;
                if (jC <= 0) {
                }
            }
            alvl alvlVar4 = alusVar.d;
            if (alvlVar4 == null) {
                alvlVar4 = alvl.a;
            }
            if (V(alvlVar4)) {
                alvg alvgVar4 = alvlVar4.r;
                if (alvgVar4 == null) {
                    alvgVar4 = alvg.a;
                }
                amspVar = alvgVar4.c;
                if (amspVar == null) {
                    amspVar = amsp.a;
                }
            } else {
                alvfVar = achqVar3.e;
                if (alvfVar != null) {
                    jC = alvfVar.d;
                    if (jC <= 0) {
                    }
                }
                alvlVar = achqVar3.c;
                if (V(alvlVar)) {
                    alvgVar = alvlVar.r;
                    if (alvgVar == null) {
                        alvgVar = alvg.a;
                    }
                    amspVar = alvgVar.c;
                    if (amspVar == null) {
                        amspVar = amsp.a;
                    }
                }
                jC = a;
            }
            jC = amspVar.g;
        }
        return jC;
    }
}
