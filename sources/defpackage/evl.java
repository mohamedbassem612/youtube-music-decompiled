package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Process;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class evl implements Runnable, Comparable, evi, ffy {
    public static final etx a = new etx("glide_thread_priority_override", null, etx.a);
    private volatile boolean A;
    private boolean B;
    private int C;
    private int D;
    public esc c;
    public ett d;
    public esf e;
    public int f;
    public int g;
    public evs h;
    public ety i;
    public int j;
    public Supplier k;
    public ett l;
    public volatile evj m;
    public volatile boolean n;
    public int o;
    public evx p;
    public final kmm r;
    public dov s;
    private final axr v;
    private Thread w;
    private ett x;
    private Object y;
    private euh z;
    public final evk b = new evk();
    private final List u = new ArrayList();
    private final wkr E = new wkr(null);
    public final ahfi t = new ahfi(null);
    public final juz q = new juz();

    public evl(kmm kmmVar, axr axrVar) {
        this.r = kmmVar;
        this.v = axrVar;
    }

    public static boolean c(ewf ewfVar) {
        Bitmap bitmap;
        Object objC = ewfVar.c();
        if (objC instanceof Bitmap) {
            bitmap = (Bitmap) objC;
        } else {
            bitmap = objC instanceof BitmapDrawable ? ((BitmapDrawable) objC).getBitmap() : null;
        }
        return bitmap != null && bitmap.getConfig() == Bitmap.Config.HARDWARE;
    }

    private final evj h() {
        int i = this.C;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            return new ewg(this.b, this);
        }
        if (i2 == 2) {
            evk evkVar = this.b;
            return new evg(evkVar.d(), evkVar, this);
        }
        if (i2 == 3) {
            return new ewk(this.b, this);
        }
        if (i2 != 5) {
            throw new IllegalStateException("Unrecognized stage: ".concat(ept.n(i)));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x022d A[LOOP:1: B:31:0x009c->B:112:0x022d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x0242 A[Catch: all -> 0x026a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x026a, blocks: (B:117:0x0242, B:127:0x0264, B:128:0x0269), top: B:214:0x0086 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0250 A[Catch: all -> 0x025d, TRY_ENTER, TryCatch #15 {all -> 0x025d, blocks: (B:45:0x00d9, B:47:0x00e3, B:49:0x00e9, B:51:0x00f5, B:53:0x00fb, B:65:0x0123, B:67:0x0129, B:68:0x012c, B:70:0x0142, B:72:0x0156, B:76:0x0167, B:78:0x017a, B:83:0x0195, B:85:0x019f, B:87:0x01a9, B:91:0x01b4, B:93:0x01b8, B:95:0x01e3, B:96:0x01ef, B:121:0x0250, B:122:0x025c, B:94:0x01da, B:97:0x01f8, B:98:0x0205, B:81:0x018f, B:73:0x015b, B:74:0x0164, B:57:0x0107, B:59:0x010d, B:110:0x0228, B:104:0x020f, B:105:0x021d), top: B:212:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x0295  */
    /* JADX WARN: Code duplicated, block: B:149:0x029b  */
    /* JADX WARN: Code duplicated, block: B:152:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:153:0x02af  */
    /* JADX WARN: Code duplicated, block: B:156:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:164:0x02d2 A[Catch: all -> 0x038e, TryCatch #5 {, blocks: (B:162:0x02c9, B:164:0x02d2, B:165:0x02da, B:167:0x02dc, B:169:0x02e4, B:171:0x02e8, B:172:0x030c, B:196:0x037c, B:197:0x0383, B:198:0x0384, B:199:0x038b), top: B:218:0x02c9 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x02dc A[Catch: all -> 0x038e, TryCatch #5 {, blocks: (B:162:0x02c9, B:164:0x02d2, B:165:0x02da, B:167:0x02dc, B:169:0x02e4, B:171:0x02e8, B:172:0x030c, B:196:0x037c, B:197:0x0383, B:198:0x0384, B:199:0x038b), top: B:218:0x02c9 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x02e4 A[Catch: all -> 0x038e, TryCatch #5 {, blocks: (B:162:0x02c9, B:164:0x02d2, B:165:0x02da, B:167:0x02dc, B:169:0x02e4, B:171:0x02e8, B:172:0x030c, B:196:0x037c, B:197:0x0383, B:198:0x0384, B:199:0x038b), top: B:218:0x02c9 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x02e8 A[Catch: all -> 0x038e, TryCatch #5 {, blocks: (B:162:0x02c9, B:164:0x02d2, B:165:0x02da, B:167:0x02dc, B:169:0x02e4, B:171:0x02e8, B:172:0x030c, B:196:0x037c, B:197:0x0383, B:198:0x0384, B:199:0x038b), top: B:218:0x02c9 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x031c A[LOOP:0: B:174:0x0316->B:176:0x031c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:181:0x033c A[Catch: all -> 0x0375, TRY_LEAVE, TryCatch #8 {all -> 0x0375, blocks: (B:179:0x0336, B:181:0x033c, B:183:0x0353, B:185:0x035c, B:186:0x0363, B:182:0x0340), top: B:222:0x0336, inners: #12 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x0366  */
    /* JADX WARN: Code duplicated, block: B:191:0x0371  */
    /* JADX WARN: Code duplicated, block: B:196:0x037c A[Catch: all -> 0x038e, TRY_ENTER, TryCatch #5 {, blocks: (B:162:0x02c9, B:164:0x02d2, B:165:0x02da, B:167:0x02dc, B:169:0x02e4, B:171:0x02e8, B:172:0x030c, B:196:0x037c, B:197:0x0383, B:198:0x0384, B:199:0x038b), top: B:218:0x02c9 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x0384 A[Catch: all -> 0x038e, TryCatch #5 {, blocks: (B:162:0x02c9, B:164:0x02d2, B:165:0x02da, B:167:0x02dc, B:169:0x02e4, B:171:0x02e8, B:172:0x030c, B:196:0x037c, B:197:0x0383, B:198:0x0384, B:199:0x038b), top: B:218:0x02c9 }] */
    /* JADX WARN: Code duplicated, block: B:208:0x0394  */
    /* JADX WARN: Code duplicated, block: B:218:0x02c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x02c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x0240 A[EDGE_INSN: B:244:0x0240->B:116:0x0240 BREAK  A[LOOP:1: B:31:0x009c->B:112:0x022d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v71, types: [ett, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [ett, java.lang.Object] */
    private final void i() throws Throwable {
        boolean z;
        int i;
        ahfi ahfiVar;
        ewe eweVarD;
        evx evxVar;
        evw evwVar;
        euh euhVar;
        int i2;
        ety etyVar;
        ewf ewfVarB;
        euc eucVar;
        int iB;
        eub eubVarM;
        boolean z2;
        ewf ewfVarD;
        Boolean bool;
        Supplier supplier;
        ewf ewfVar = null;
        if (this.s.m(erv.class) && (supplier = this.k) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.k.get()).intValue());
            } catch (IllegalArgumentException | SecurityException unused) {
                this.k = null;
            }
        }
        try {
            euh euhVar2 = this.z;
            Object obj = this.y;
            int i3 = this.D;
            try {
                if (obj == null) {
                    euhVar2.d();
                    z = true;
                } else {
                    try {
                        double d = ffn.a;
                        SystemClock.elapsedRealtimeNanos();
                        evk evkVar = this.b;
                        ewd ewdVarB = evkVar.b(obj.getClass());
                        ety etyVar2 = this.i;
                        boolean z3 = i3 == 4 || evkVar.q;
                        etx etxVar = fap.d;
                        Boolean bool2 = (Boolean) etyVar2.b(etxVar);
                        if (bool2 == null) {
                            etyVar2 = new ety();
                            etyVar2.c(this.i);
                            etyVar2.d(etxVar, Boolean.valueOf(z3));
                        } else if (bool2.booleanValue() && !z3) {
                            z3 = false;
                            etyVar2 = new ety();
                            etyVar2.c(this.i);
                            etyVar2.d(etxVar, Boolean.valueOf(z3));
                        }
                        try {
                            ety etyVar3 = etyVar2;
                            euj eujVarB = this.c.b().b(obj);
                            try {
                                try {
                                    int i4 = this.f;
                                    int i5 = this.g;
                                    List list = (List) ewdVarB.a.a();
                                    try {
                                        List list2 = ewdVarB.b;
                                        int size = list2.size();
                                        ewf ewfVarA = null;
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 >= size) {
                                                euhVar = euhVar2;
                                                z = true;
                                                break;
                                            }
                                            z = true;
                                            try {
                                                evm evmVar = (evm) list2.get(i6);
                                                try {
                                                    List list3 = (List) evmVar.b.a();
                                                    int i7 = size;
                                                    try {
                                                        ewf ewfVarA2 = evmVar.a(eujVarB, i4, i5, etyVar3, list3);
                                                        etyVar = etyVar3;
                                                        try {
                                                            evmVar.b.b(list3);
                                                            Class<?> cls = ewfVarA2.c().getClass();
                                                            if (i3 != 4) {
                                                                euc eucVarA = this.b.a(cls);
                                                                i2 = i7;
                                                                try {
                                                                    euhVar = euhVar2;
                                                                    try {
                                                                        try {
                                                                            Boolean bool3 = (Boolean) this.i.b(fap.e);
                                                                            ewfVarB = (bool3 != null && bool3.booleanValue() && (bool = (Boolean) this.i.b(fap.d)) != null && bool.booleanValue() && c(ewfVarA2)) ? ewfVarA2 : eucVarA.b(this.c, ewfVarA2, this.f, this.g);
                                                                            eucVar = eucVarA;
                                                                        } catch (ewb e) {
                                                                            e = e;
                                                                            list2 = list2;
                                                                            list.add(e);
                                                                            if (ewfVarA != null) {
                                                                                break;
                                                                                if (ewfVarA == null) {
                                                                                    throw new ewb(ewdVarB.c, new ArrayList(list));
                                                                                }
                                                                                ewdVarB.a.b(list);
                                                                                eujVarB.b();
                                                                                euhVar.d();
                                                                                ewfVar = ewfVarA;
                                                                                if (ewfVar == null) {
                                                                                    l();
                                                                                    return;
                                                                                }
                                                                                i = this.D;
                                                                                if (ewfVar instanceof ewc) {
                                                                                    ((ewc) ewfVar).d();
                                                                                }
                                                                                ahfiVar = this.t;
                                                                                if (ahfiVar.m()) {
                                                                                    eweVarD = ewe.d(ewfVar);
                                                                                    ewfVar = eweVarD;
                                                                                } else {
                                                                                    eweVarD = null;
                                                                                }
                                                                                if (this.s.m(erv.class)) {
                                                                                    k();
                                                                                }
                                                                                m();
                                                                                evxVar = this.p;
                                                                                synchronized (evxVar) {
                                                                                    evxVar.d = ewfVar;
                                                                                    evxVar.j = i;
                                                                                    synchronized (evxVar) {
                                                                                        evxVar.k.b();
                                                                                        if (evxVar.i) {
                                                                                            evxVar.d.e();
                                                                                            evxVar.d();
                                                                                        } else {
                                                                                            evwVar = evxVar.a;
                                                                                            if (evwVar.c()) {
                                                                                                throw new IllegalStateException("Received a resource without any callbacks to notify");
                                                                                            }
                                                                                            if (evxVar.e) {
                                                                                                throw new IllegalStateException("Already have resource");
                                                                                            }
                                                                                            evxVar.h = new evz(evxVar.d, evxVar.c, true, evxVar.b, evxVar.l);
                                                                                            boolean z4 = z;
                                                                                            evxVar.e = z4;
                                                                                            evw<evv> evwVarB = evwVar.b();
                                                                                            evxVar.c(evwVarB.a() + (z4 ? 1 : 0));
                                                                                            evxVar.m.r(evxVar, evxVar.b, evxVar.h);
                                                                                            for (evv evvVar : evwVarB) {
                                                                                                evvVar.a.execute(new abta(evxVar, evvVar.b, 1));
                                                                                            }
                                                                                            evxVar.b();
                                                                                        }
                                                                                        this.C = 5;
                                                                                        try {
                                                                                            if (ahfiVar.m()) {
                                                                                                try {
                                                                                                    this.r.e().c(ahfiVar.b, new xsc(ahfiVar.c, ahfiVar.a, (Object) this.i, (byte[]) null));
                                                                                                    ((ewe) ahfiVar.a).f();
                                                                                                } catch (Throwable th) {
                                                                                                    ((ewe) ahfiVar.a).f();
                                                                                                    throw th;
                                                                                                }
                                                                                            }
                                                                                            if (eweVarD != null) {
                                                                                                eweVarD.f();
                                                                                            }
                                                                                            if (this.q.d()) {
                                                                                                a();
                                                                                            }
                                                                                        } catch (Throwable th2) {
                                                                                            if (eweVarD != null) {
                                                                                                eweVarD.f();
                                                                                            }
                                                                                            throw th2;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            i6++;
                                                                            etyVar3 = etyVar;
                                                                            size = i2;
                                                                            euhVar2 = euhVar;
                                                                            list2 = list2;
                                                                        }
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        ewdVarB.a.b(list);
                                                                        throw th;
                                                                    }
                                                                } catch (ewb e2) {
                                                                    e = e2;
                                                                    euhVar = euhVar2;
                                                                    list2 = list2;
                                                                    list.add(e);
                                                                    if (ewfVarA != null) {
                                                                        break;
                                                                        if (ewfVarA == null) {
                                                                            throw new ewb(ewdVarB.c, new ArrayList(list));
                                                                        }
                                                                        ewdVarB.a.b(list);
                                                                        eujVarB.b();
                                                                        euhVar.d();
                                                                        ewfVar = ewfVarA;
                                                                        if (ewfVar == null) {
                                                                            l();
                                                                            return;
                                                                        }
                                                                        i = this.D;
                                                                        if (ewfVar instanceof ewc) {
                                                                            ((ewc) ewfVar).d();
                                                                        }
                                                                        ahfiVar = this.t;
                                                                        if (ahfiVar.m()) {
                                                                            eweVarD = ewe.d(ewfVar);
                                                                            ewfVar = eweVarD;
                                                                        } else {
                                                                            eweVarD = null;
                                                                        }
                                                                        if (this.s.m(erv.class)) {
                                                                            k();
                                                                        }
                                                                        m();
                                                                        evxVar = this.p;
                                                                        synchronized (evxVar) {
                                                                            evxVar.d = ewfVar;
                                                                            evxVar.j = i;
                                                                            synchronized (evxVar) {
                                                                                evxVar.k.b();
                                                                                if (evxVar.i) {
                                                                                    evxVar.d.e();
                                                                                    evxVar.d();
                                                                                } else {
                                                                                    evwVar = evxVar.a;
                                                                                    if (evwVar.c()) {
                                                                                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                                                                                    }
                                                                                    if (evxVar.e) {
                                                                                        throw new IllegalStateException("Already have resource");
                                                                                    }
                                                                                    evxVar.h = new evz(evxVar.d, evxVar.c, true, evxVar.b, evxVar.l);
                                                                                    boolean z5 = z;
                                                                                    evxVar.e = z5;
                                                                                    evw<evv> evwVarB2 = evwVar.b();
                                                                                    evxVar.c(evwVarB2.a() + (z5 ? 1 : 0));
                                                                                    evxVar.m.r(evxVar, evxVar.b, evxVar.h);
                                                                                    while (r0.hasNext()) {
                                                                                        evvVar.a.execute(new abta(evxVar, evvVar.b, 1));
                                                                                    }
                                                                                    evxVar.b();
                                                                                }
                                                                                this.C = 5;
                                                                                if (ahfiVar.m()) {
                                                                                    this.r.e().c(ahfiVar.b, new xsc(ahfiVar.c, ahfiVar.a, (Object) this.i, (byte[]) null));
                                                                                    ((ewe) ahfiVar.a).f();
                                                                                }
                                                                                if (eweVarD != null) {
                                                                                    eweVarD.f();
                                                                                }
                                                                                if (this.q.d()) {
                                                                                    a();
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    i6++;
                                                                    etyVar3 = etyVar;
                                                                    size = i2;
                                                                    euhVar2 = euhVar;
                                                                    list2 = list2;
                                                                }
                                                            } else {
                                                                i2 = i7;
                                                                euhVar = euhVar2;
                                                                list2 = list2;
                                                                ewfVarB = ewfVarA2;
                                                                eucVar = null;
                                                            }
                                                            try {
                                                                if (!ewfVarA2.equals(ewfVarB)) {
                                                                    ewfVarA2.e();
                                                                }
                                                                evk evkVar2 = this.b;
                                                                if (((ci) evkVar2.c.b().f).M(ewfVarB.b()) != null) {
                                                                    eubVarM = ((ci) evkVar2.c.b().f).M(ewfVarB.b());
                                                                    if (eubVarM == null) {
                                                                        throw new esj(ewfVarB.b());
                                                                    }
                                                                    iB = eubVarM.b();
                                                                } else {
                                                                    iB = 3;
                                                                    eubVarM = null;
                                                                }
                                                                ett ettVar = this.l;
                                                                List listE = evkVar2.e();
                                                                ewf ewfVar2 = ewfVarB;
                                                                int size2 = listE.size();
                                                                int i8 = 0;
                                                                while (true) {
                                                                    if (i8 >= size2) {
                                                                        z2 = false;
                                                                        break;
                                                                    }
                                                                    List list4 = listE;
                                                                    if (((hed) listE.get(i8)).b.equals(ettVar)) {
                                                                        z2 = true;
                                                                        break;
                                                                    } else {
                                                                        i8++;
                                                                        listE = list4;
                                                                    }
                                                                }
                                                                if (!this.h.d(!z2, i3, iB) || (this.s.m(erm.class) && c(ewfVar2))) {
                                                                    ewfVarD = ewfVar2;
                                                                } else {
                                                                    if (eubVarM == null) {
                                                                        throw new esj(ewfVar2.c().getClass());
                                                                    }
                                                                    Object ewhVar = iB + (-1) != 0 ? new ewh(evkVar2.h(), this.l, this.d, this.f, this.g, eucVar, cls, this.i) : new evh(this.l, this.d);
                                                                    ewfVarD = ewe.d(ewfVar2);
                                                                    ahfi ahfiVar2 = this.t;
                                                                    ahfiVar2.b = ewhVar;
                                                                    ahfiVar2.c = eubVarM;
                                                                    ahfiVar2.a = ewfVarD;
                                                                }
                                                                ewfVarA = evmVar.a.a(ewfVarD, etyVar);
                                                            } catch (ewb e3) {
                                                                e = e3;
                                                                list.add(e);
                                                            }
                                                        } catch (ewb e4) {
                                                            e = e4;
                                                            i2 = i7;
                                                        }
                                                    } catch (Throwable th4) {
                                                        evmVar.b.b(list3);
                                                        throw th4;
                                                    }
                                                } catch (ewb e5) {
                                                    e = e5;
                                                    euhVar = euhVar2;
                                                    list2 = list2;
                                                    i2 = size;
                                                    etyVar = etyVar3;
                                                }
                                                if (ewfVarA != null) {
                                                    break;
                                                }
                                                i6++;
                                                etyVar3 = etyVar;
                                                size = i2;
                                                euhVar2 = euhVar;
                                                list2 = list2;
                                            } catch (Throwable th5) {
                                                th = th5;
                                            }
                                        }
                                        if (ewfVarA == null) {
                                            throw new ewb(ewdVarB.c, new ArrayList(list));
                                        }
                                        ewdVarB.a.b(list);
                                        eujVarB.b();
                                        euhVar.d();
                                        ewfVar = ewfVarA;
                                    } catch (Throwable th6) {
                                        th = th6;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    eujVarB.b();
                                    throw th;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                eujVarB.b();
                                throw th;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            euhVar2.d();
                            throw th;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                    }
                }
            } catch (ewb e6) {
                e = e6;
                e.b(this.x, this.D, null);
                this.u.add(e);
                ewfVar = null;
            }
        } catch (ewb e7) {
            e = e7;
            z = true;
        }
        if (ewfVar == null) {
            l();
            return;
        }
        i = this.D;
        if (ewfVar instanceof ewc) {
            ((ewc) ewfVar).d();
        }
        ahfiVar = this.t;
        if (ahfiVar.m()) {
            eweVarD = ewe.d(ewfVar);
            ewfVar = eweVarD;
        } else {
            eweVarD = null;
        }
        if (this.s.m(erv.class)) {
            k();
        }
        m();
        evxVar = this.p;
        synchronized (evxVar) {
            evxVar.d = ewfVar;
            evxVar.j = i;
        }
        synchronized (evxVar) {
            evxVar.k.b();
            if (evxVar.i) {
                evxVar.d.e();
                evxVar.d();
            } else {
                evwVar = evxVar.a;
                if (evwVar.c()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (evxVar.e) {
                    throw new IllegalStateException("Already have resource");
                }
                evxVar.h = new evz(evxVar.d, evxVar.c, true, evxVar.b, evxVar.l);
                boolean z6 = z;
                evxVar.e = z6;
                evw<evv> evwVarB3 = evwVar.b();
                evxVar.c(evwVarB3.a() + (z6 ? 1 : 0));
                evxVar.m.r(evxVar, evxVar.b, evxVar.h);
                while (r0.hasNext()) {
                    evvVar.a.execute(new abta(evxVar, evvVar.b, 1));
                }
                evxVar.b();
            }
        }
        this.C = 5;
        if (ahfiVar.m()) {
            this.r.e().c(ahfiVar.b, new xsc(ahfiVar.c, ahfiVar.a, (Object) this.i, (byte[]) null));
            ((ewe) ahfiVar.a).f();
        }
        if (eweVarD != null) {
            eweVarD.f();
        }
        if (this.q.d()) {
            a();
        }
    }

    private final void j() {
        if (this.s.m(erv.class)) {
            k();
        }
        m();
        ewb ewbVar = new ewb("Failed to load resource", new ArrayList(this.u));
        evx evxVar = this.p;
        synchronized (evxVar) {
            evxVar.f = ewbVar;
        }
        synchronized (evxVar) {
            evxVar.k.b();
            if (evxVar.i) {
                evxVar.d();
            } else {
                evw evwVar = evxVar.a;
                if (evwVar.c()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (evxVar.g) {
                    throw new IllegalStateException("Already failed once");
                }
                evxVar.g = true;
                ett ettVar = evxVar.b;
                evw<evv> evwVarB = evwVar.b();
                evxVar.c(evwVarB.a() + 1);
                evxVar.m.r(evxVar, ettVar, null);
                for (evv evvVar : evwVarB) {
                    evvVar.a.execute(new hhy(evxVar, evvVar.b, 1));
                }
                evxVar.b();
            }
        }
        if (this.q.e()) {
            a();
        }
    }

    private final void k() {
        if (!this.s.m(erv.class)) {
            throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        Supplier supplier = this.k;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException unused) {
            this.k = null;
        }
    }

    private final void l() {
        this.w = Thread.currentThread();
        double d = ffn.a;
        SystemClock.elapsedRealtimeNanos();
        boolean zC = false;
        while (!this.n && this.m != null && !(zC = this.m.c())) {
            this.C = e(this.C);
            this.m = h();
            if (this.C == 4) {
                f(2);
                return;
            }
        }
        if ((this.C == 6 || this.n) && !zC) {
            j();
        }
    }

    private final void m() {
        this.E.b();
        if (this.A) {
            List list = this.u;
            throw new IllegalStateException("Already notified", list.isEmpty() ? null : (Throwable) list.get(list.size() - 1));
        }
        this.A = true;
    }

    public final void a() {
        this.q.c();
        ahfi ahfiVar = this.t;
        ahfiVar.b = null;
        ahfiVar.c = null;
        ahfiVar.a = null;
        evk evkVar = this.b;
        evkVar.c = null;
        evkVar.d = null;
        evkVar.m = null;
        evkVar.g = null;
        evkVar.j = null;
        evkVar.h = null;
        evkVar.n = null;
        evkVar.i = null;
        evkVar.o = null;
        evkVar.a.clear();
        evkVar.k = false;
        evkVar.b.clear();
        evkVar.l = false;
        this.A = false;
        this.c = null;
        this.d = null;
        this.i = null;
        this.e = null;
        this.p = null;
        this.C = 0;
        this.m = null;
        this.w = null;
        this.l = null;
        this.y = null;
        this.D = 0;
        this.z = null;
        this.n = false;
        this.u.clear();
        this.v.b(this);
    }

    @Override // defpackage.evi
    public final void b(ett ettVar, Exception exc, euh euhVar, int i) {
        euhVar.d();
        ewb ewbVar = new ewb("Fetching data failed", Collections.singletonList(exc));
        ewbVar.b(ettVar, i, euhVar.a());
        this.u.add(ewbVar);
        if (Thread.currentThread() != this.w) {
            f(2);
        } else {
            l();
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        evl evlVar = (evl) obj;
        int iCompareTo = this.e.compareTo(evlVar.e);
        return iCompareTo == 0 ? this.j - evlVar.j : iCompareTo;
    }

    @Override // defpackage.evi
    public final void d(ett ettVar, Object obj, euh euhVar, int i, ett ettVar2) throws Throwable {
        this.l = ettVar;
        this.y = obj;
        this.z = euhVar;
        this.D = i;
        this.x = ettVar2;
        this.B = ettVar != this.b.d().get(0);
        if (Thread.currentThread() == this.w) {
            i();
        } else {
            f(3);
        }
    }

    public final int e(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            if (this.h.b()) {
                return 2;
            }
            return e(2);
        }
        if (i2 == 1) {
            if (this.h.a()) {
                return 3;
            }
            return e(3);
        }
        if (i2 == 2) {
            return 4;
        }
        if (i2 == 3 || i2 == 5) {
            return 6;
        }
        throw new IllegalArgumentException("Unrecognized stage: ".concat(ept.n(i)));
    }

    public final void f(int i) {
        this.o = i;
        this.p.a().execute(this);
    }

    @Override // defpackage.ffy
    public final wkr g() {
        return this.E;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        euh euhVar = this.z;
        try {
            try {
                try {
                    if (this.n) {
                        j();
                    } else {
                        int i = this.o;
                        int i2 = i - 1;
                        if (i == 0) {
                            throw null;
                        }
                        if (i2 == 0) {
                            this.C = e(1);
                            this.m = h();
                            l();
                        } else if (i2 == 1) {
                            l();
                        } else {
                            if (i2 != 2) {
                                if (i != 1) {
                                    str = i != 2 ? "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE";
                                } else {
                                    str = "INITIALIZE";
                                }
                                throw new IllegalStateException("Unrecognized run reason: ".concat(str));
                            }
                            i();
                        }
                    }
                    if (euhVar != null) {
                        euhVar.d();
                    }
                } catch (evf e) {
                    throw e;
                }
            } catch (Throwable th) {
                if (this.C != 5) {
                    this.u.add(th);
                    j();
                }
                if (!this.n) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (euhVar != null) {
                euhVar.d();
            }
            throw th2;
        }
    }
}
