package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import com.google.android.apps.youtube.music.ui.tabs.TabbedView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class awu implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ int a;
    final /* synthetic */ Object b;

    public /* synthetic */ awu(Object obj, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r1v24, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v24, types: [cfx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v33, types: [awmd, java.lang.Object] */
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
    public final void run() throws Throwable {
        ts tsVar;
        Throwable th;
        ut utVar;
        Throwable th2;
        long jElapsedRealtime;
        jig jigVar;
        int i = 5;
        ut utVar2 = null;
        fxl fxlVarAs = null;
        utVar2 = null;
        utVar2 = null;
        switch (this.$cid) {
            case 0:
                Object obj = ((zf) this.b).a;
                if (obj != null) {
                    ((avr) obj).a(this.a);
                    return;
                }
                return;
            case 1:
                SystemClock.elapsedRealtime();
                int i2 = this.a;
                Object obj2 = this.b;
                try {
                    try {
                        utVar = new ut();
                        try {
                            tv tvVar = ((ug) obj2).a;
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                            tvVar.b.writeLock().lock();
                            try {
                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                try {
                                    utVar.e((int) (jElapsedRealtime - jElapsedRealtime2));
                                    int i3 = tvVar.d + i2;
                                    tvVar.d = i3;
                                    if (i3 >= 100) {
                                        tvVar.s(utVar);
                                    }
                                    tvVar.o(jElapsedRealtime, SystemClock.elapsedRealtime(), 10);
                                    tvVar.b.writeLock().unlock();
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    tvVar.o(jElapsedRealtime, SystemClock.elapsedRealtime(), 10);
                                    tvVar.b.writeLock().unlock();
                                    throw th2;
                                }
                            } catch (Throwable th4) {
                                th2 = th4;
                                jElapsedRealtime = 0;
                            }
                        } catch (ts e) {
                            tsVar = e;
                            utVar2 = utVar;
                            Log.w("AppSearchSessionImpl", "Error occurred when check for optimize", tsVar);
                            utVar = utVar2;
                        } catch (Throwable th5) {
                            th = th5;
                            utVar2 = utVar;
                            if (utVar2 == null) {
                                throw th;
                            }
                            SystemClock.elapsedRealtime();
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                    break;
                } catch (ts e2) {
                    tsVar = e2;
                }
                if (utVar != null) {
                    SystemClock.elapsedRealtime();
                }
                return;
            case 2:
                ces cesVar = ((ccs) this.b).q;
                cdy cdyVarB = cesVar.B();
                cesVar.H(cdyVarB, 1034, new ccd(cdyVarB, this.a, i));
                return;
            case 3:
                int i4 = bwp.a;
                ((boy) this.b).a.f(this.a);
                return;
            case 4:
                dii diiVar = ((dgm) this.b).b.c.e;
                if (diiVar != null) {
                    diiVar.g(this.a);
                    return;
                }
                return;
            case 5:
                dii diiVar2 = ((dgm) this.b).b.c.e;
                if (diiVar2 != null) {
                    diiVar2.h(this.a);
                    return;
                }
                return;
            case 6:
                int i5 = this.a;
                Object obj3 = this.b;
                if (i5 > 0) {
                    try {
                        Thread.sleep(i5 * 1000);
                        break;
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    Context context = ((gbg) obj3).a;
                    fxlVarAs = ksy.as(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                    break;
                } catch (Throwable unused2) {
                }
                gbg gbgVar = (gbg) this.b;
                gbgVar.i = fxlVarAs;
                int i6 = this.a;
                if (i6 < 4) {
                    if (fxlVarAs != null && (fxlVarAs.b & 4194304) != 0 && !fxlVarAs.t.equals("0000000000000000000000000000000000000000000000000000000000000000") && (fxlVarAs.e & 64) != 0) {
                        fxo fxoVar = fxlVarAs.an;
                        if (fxoVar == null) {
                            fxoVar = fxo.a;
                        }
                        if ((fxoVar.b & 1) != 0) {
                            fxo fxoVar2 = fxlVarAs.an;
                            if (fxoVar2 == null) {
                                fxoVar2 = fxo.a;
                            }
                            if (fxoVar2.c != -2) {
                                return;
                            }
                        }
                    }
                    gbgVar.f(i6 + 1);
                    return;
                }
                return;
            case 7:
                ((hef) this.b).c(this.a);
                return;
            case 8:
                ahgb ahgbVar = (ahgb) this.b;
                ?? r1 = ahgbVar.e;
                int i7 = this.a;
                if (!tym.as(r1) && i7 == 15) {
                    ((tmo) ahgbVar.a.io()).e();
                    i7 = 15;
                }
                if (!tym.ar(r1) && i7 >= 5) {
                    ((adhv) ahgbVar.d.io()).p();
                }
                ((aeqx) ahgbVar.b.io()).b(i7);
                return;
            case 9:
                jcz jczVar = (jcz) this.b;
                if ((jczVar.a.getLineCount() <= this.a || jczVar.c == null) && ((jigVar = jczVar.c) == null || !jigVar.e())) {
                    jczVar.b.setVisibility(8);
                    return;
                } else {
                    jczVar.b.setVisibility(0);
                    jczVar.c.c();
                    return;
                }
            case 10:
                int i8 = this.a;
                if (i8 >= 0) {
                    TabbedView tabbedView = (TabbedView) this.b;
                    if (i8 < tabbedView.a.c().size()) {
                        if (i8 == tabbedView.h()) {
                            tabbedView.q(i8);
                            return;
                        } else {
                            tabbedView.a.k(tabbedView.c(i8));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 11:
                jol jolVar = (jol) this.b;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) jolVar.q.n;
                if (linearLayoutManager != null) {
                    int i9 = this.a;
                    od odVar = jolVar.G;
                    odVar.b = i9;
                    linearLayoutManager.startSmoothScroll(odVar);
                    return;
                }
                return;
            case 12:
                ((jol) this.b).q.ab(this.a);
                return;
            case 13:
                kam kamVar = (kam) this.b;
                kan kanVar = kamVar.a;
                kanVar.k = -1;
                kanVar.l = -1;
                kanVar.g = null;
                kanVar.h = null;
                kanVar.i = 0.0d;
                kanVar.u();
                kanVar.j = false;
                kanVar.m = null;
                kanVar.r = 1;
                int i10 = this.a;
                List list = kanVar.q;
                synchronized (list) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((hna) it.next()).L(i10);
                    }
                    break;
                }
                kamVar.a.o();
                return;
            case 14:
                int i11 = this.a;
                Object obj4 = this.b;
                if (i11 == 0) {
                    kan kanVar2 = ((kam) obj4).a;
                    kanVar2.r = 3;
                    kanVar2.c = true;
                    kanVar2.d = true;
                    List list2 = kanVar2.q;
                    synchronized (list2) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            ((hna) it2.next()).I();
                        }
                        break;
                    }
                    return;
                }
                kam kamVar2 = (kam) obj4;
                kan kanVar3 = kamVar2.a;
                kanVar3.r = 1;
                List list3 = kanVar3.q;
                synchronized (list3) {
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        ((hna) it3.next()).J(i11);
                    }
                    break;
                }
                kamVar2.a.p();
                return;
            case 15:
                ((kam) this.b).a.u.N(this.a);
                return;
            case 16:
                kan kanVar4 = ((kam) this.b).a;
                kanVar4.r = 4;
                int i12 = this.a;
                List list4 = kanVar4.q;
                synchronized (list4) {
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        ((hna) it4.next()).K(i12);
                    }
                    break;
                }
                return;
            case 17:
                ((khb) this.b).o.N(this.a);
                return;
            case 18:
                ((kol) this.b).k(this.a);
                return;
            case 19:
                ((odx) this.b).b(this.a + 1);
                return;
            default:
                ((qih) this.b).a(this.a + 1);
                return;
        }
    }

    public awu(Object obj, int i, int i2, byte[] bArr) {
        this.$cid = i2;
        this.a = i;
        this.b = obj;
    }

    public awu(Object obj, int i, int i2, char[] cArr) {
        this.$cid = i2;
        this.b = obj;
        this.a = i;
    }
}
