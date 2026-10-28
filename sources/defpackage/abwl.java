package defpackage;

import android.os.Handler;
import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class abwl implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ abwl(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [abwo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [abyp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [acey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v73, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [abyp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v98, types: [acib, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v99, types: [acib, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, wjf] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, wjf] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int iA;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                this.a.b((xpl) this.b);
                return;
            case 1:
                this.a.B(this.b, null);
                return;
            case 2:
                acia aciaVar = (acia) ((abyq) this.b).i.io();
                abnk abnkVar = new abnk();
                ajwo ajwoVar = ((alus) this.a).e;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                abnkVar.a = ajwoVar;
                aciaVar.g(abnkVar.a());
                return;
            case 3:
                this.b.r((aony) this.a);
                return;
            case 4:
                this.a.h((aboe) this.b);
                return;
            case 5:
                abyx abyxVar = (abyx) this.a;
                abyxVar.b((wjm) this.b, abyxVar.h);
                return;
            case 6:
                ((abzn) this.a).b(this.b);
                return;
            case 7:
                taq.c();
                Object obj = this.a;
                abzt abztVar = (abzt) obj;
                abztVar.d = Thread.currentThread();
                byte[] bArr = new byte[SemanticState.Obscured];
                tgr tgrVar = abztVar.f;
                tgrVar.d(-10);
                long jB = -1;
                Object objA = this.b;
                while (true) {
                    boolean z2 = false;
                    while (!abztVar.c && !z2) {
                        try {
                            int i = ((abzt) obj).b;
                            if (i > 0) {
                                Thread.sleep(i);
                            }
                            tgrVar.e(-10);
                            long j = ((byi) objA).h;
                            try {
                                try {
                                    bye byeVar = ((abzt) obj).a;
                                    jB = byeVar.b((byi) objA);
                                    while (!((abzt) obj).c && (iA = byeVar.a(bArr, 0, SemanticState.Obscured)) >= 0) {
                                        j += (long) iA;
                                    }
                                    try {
                                        ((abzt) obj).a.f();
                                    } catch (IOException unused) {
                                    } catch (InterruptedException unused2) {
                                        z2 = true;
                                        abztVar.c = true;
                                    }
                                    z2 = true;
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        ((abzt) obj).a.f();
                                        break;
                                    } catch (IOException unused3) {
                                    }
                                    throw th;
                                }
                            } catch (bti unused4) {
                                long j2 = jB;
                                try {
                                    if (j > ((byi) objA).h) {
                                        byi byiVar = new byi(((byi) objA).a, j, j2, ((byi) objA).j);
                                        try {
                                            if (((abzt) obj).e.m(14, 45627566L)) {
                                                byh byhVar = new byh(byiVar);
                                                ypp yppVarA = ypq.a();
                                                yppVarA.j(tok.PLAYER_CMS_PATH_PROBE_CLIENT);
                                                byhVar.k = yppVarA.a();
                                                objA = byhVar.a();
                                            } else {
                                                objA = byiVar;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            objA = byiVar;
                                            jB = j2;
                                            ((abzt) obj).a.f();
                                            throw th;
                                        }
                                    }
                                    try {
                                        ((abzt) obj).a.f();
                                    } catch (IOException unused5) {
                                    } catch (InterruptedException unused6) {
                                        z2 = false;
                                        jB = j2;
                                        abztVar.c = true;
                                    }
                                    z2 = false;
                                    jB = j2;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                break;
                            } catch (IOException unused7) {
                                ((abzt) obj).c = true;
                                try {
                                    ((abzt) obj).a.f();
                                } catch (IOException unused8) {
                                }
                            }
                        } catch (InterruptedException unused9) {
                            z2 = false;
                        }
                    }
                    abztVar.f.g(-10);
                    return;
                }
                break;
            case 8:
                ((acah) this.b).d.a(this.a);
                return;
            case 9:
                ?? r1 = this.b;
                ((acec) this.a).a.d(r1.af(), Optional.of(Boolean.valueOf(aaje.o(r1.t()))));
                return;
            case 10:
                ((fg) this.b).g((ez) ((aceo) this.a).b.io(), null);
                return;
            case 11:
                acfg acfgVar = (acfg) this.b;
                if (acfgVar.s != abob.a) {
                    acfgVar.aH((acfs) this.a);
                    return;
                }
                return;
            case 12:
                acfr acfrVar = (acfr) this.b;
                if (!acfrVar.e.ad()) {
                    Object objIo = this.a.io();
                    if (acfrVar.i || objIo == null) {
                        return;
                    }
                    acfs acfsVar = (acfs) objIo;
                    int iE = acfrVar.e(acfsVar);
                    if (acfrVar.i) {
                        return;
                    }
                    boolean zD = acfrVar.d(acfsVar.a);
                    if (iE == 4) {
                        long j3 = true != zD ? 1000L : 100L;
                        mbc mbcVar = acfrVar.c;
                        long jB2 = mbcVar.b();
                        long j4 = acfrVar.h;
                        if (jB2 - j4 > j3) {
                            acfrVar.h = mbcVar.b() + j3;
                        } else {
                            acfrVar.h = j4 + j3;
                        }
                    }
                    long j5 = (!abmt.bW(acfrVar.d) || zD) ? 100L : 1000L;
                    Handler handler = acfrVar.b;
                    Runnable runnable = acfrVar.a;
                    long j6 = acfrVar.g;
                    if (j6 > 0 && j6 <= j5) {
                        j5 = j6;
                    }
                    handler.postDelayed(runnable, j5);
                    acfrVar.g = Long.MAX_VALUE;
                    return;
                }
                if (acfrVar.i) {
                    return;
                }
                Set setKeySet = acfrVar.l.a.keySet();
                setKeySet.getClass();
                Iterator it = setKeySet.iterator();
                boolean z3 = false;
                boolean z4 = false;
                while (it.hasNext()) {
                    acfs acfsVar2 = (acfs) acfrVar.f.apply((String) it.next());
                    if (acfsVar2 != null) {
                        boolean zD2 = acfrVar.d(acfsVar2.a);
                        z4 |= zD2;
                        if (acfrVar.e(acfsVar2) == 4) {
                            if (zD2) {
                                z3 = true;
                                z = true;
                            } else {
                                z = true;
                            }
                        }
                    }
                }
                if (z) {
                    long j7 = true != z3 ? 1000L : 100L;
                    mbc mbcVar2 = acfrVar.c;
                    long jB3 = mbcVar2.b();
                    long j8 = acfrVar.h;
                    if (jB3 - j8 > j7) {
                        acfrVar.h = mbcVar2.b() + j7;
                    } else {
                        acfrVar.h = j8 + j7;
                    }
                }
                if (acfrVar.i) {
                    return;
                }
                long j9 = (!abmt.bW(acfrVar.d) || z4) ? 100L : 1000L;
                Handler handler2 = acfrVar.b;
                Runnable runnable2 = acfrVar.a;
                long j10 = acfrVar.g;
                if (j10 > 0 && j10 <= j9) {
                    j9 = j10;
                }
                handler2.postDelayed(runnable2, j9);
                acfrVar.g = Long.MAX_VALUE;
                return;
            case 13:
                acfs acfsVar3 = (acfs) this.a;
                aaxa aaxaVar = new aaxa((yvs) this.b, acfsVar3.E());
                for (acii aciiVar : acfsVar3.n.d) {
                }
                acfsVar3.a.aB().kk(aaxaVar);
                return;
            case 14:
                ((acfx) this.b).g((acgb) this.a);
                return;
            case 15:
                long j11 = achr.a;
                this.a.h((aboe) this.b);
                return;
            case 16:
                long j12 = achr.a;
                if (((achu) this.b).a()) {
                    return;
                }
                this.a.ap();
                return;
            case 17:
                long j13 = achr.a;
                if (((achu) this.b).a()) {
                    return;
                }
                acfg acfgVar2 = (acfg) this.a;
                acfgVar2.ax(7);
                acfgVar2.o.g();
                return;
            case 18:
                if (((achu) this.b).a()) {
                    return;
                }
                ((abvk) ((achw) this.a).b.io()).ak();
                return;
            case 19:
                if (((achu) this.b).a()) {
                    return;
                }
                ((abvk) ((achw) this.a).b.io()).ak();
                return;
            default:
                achu achuVar = (achu) this.b;
                if (achuVar.a()) {
                    return;
                }
                acia aciaVar2 = (acia) ((achx) this.a).a.io();
                abnk abnkVar2 = new abnk();
                abnkVar2.a = achuVar.b;
                aciaVar2.g(abnkVar2.a());
                return;
        }
    }

    public /* synthetic */ abwl(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
