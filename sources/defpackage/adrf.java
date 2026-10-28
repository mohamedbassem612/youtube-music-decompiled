package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import app.rive.ImageAsset;
import app.rive.RiveCanvasSession;
import app.rive.RiveFile;
import app.rive.ViewModelInstance;
import app.rive.core.FrameTicker;
import app.rive.core.FrameTickerKt;
import internal.org.jni_zero.JniZero;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adrf {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/rendering/rive/RiveSession");
    public final awou b;
    public final awou c;
    public final adrl d;
    public final FrameTicker e;
    public volatile adqt f;
    public xir g;
    public final adqh h;
    public final adps i;
    public final adpi j;
    public adqm k;
    public final Rect l;
    public Function0 m;
    public awqg n;
    public Function0 o;
    public adqk p;
    public boolean q;
    public final aciz r;
    private final xit s;
    private final boolean t;
    private final adro u;
    private boolean v;
    private final awut w;
    private final awut x;
    private awwd y;

    public adrf(Context context) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ador adorVar = (ador) atqq.a(applicationContext, ador.class);
        mbc mbcVarT = adorVar.t();
        aciz acizVarGa = adorVar.ga();
        awou awouVarDK = adorVar.dK();
        awou awouVarDI = adorVar.dI();
        adrl adrlVarAW = adorVar.aW();
        xit xitVar = (xit) awrc.f(adorVar.ca());
        tqj tqjVarAa = adorVar.aa();
        int i = tqr.a;
        boolean zK = tqjVarAa.k(1073830966);
        adro adroVarAX = adorVar.aX();
        FrameTicker choreographerFrameTicker = FrameTickerKt.getChoreographerFrameTicker();
        mbcVarT.getClass();
        awouVarDK.getClass();
        awouVarDI.getClass();
        adrlVarAW.getClass();
        choreographerFrameTicker.getClass();
        adroVarAX.getClass();
        this.r = acizVarGa;
        this.b = awouVarDK;
        this.c = awouVarDI;
        this.d = adrlVarAW;
        this.s = xitVar;
        this.t = zK;
        this.e = choreographerFrameTicker;
        this.u = adroVarAX;
        awut awutVarK = awrc.K(JniZero.u(new awxf(null), awouVarDK));
        this.w = awutVarK;
        this.x = awrc.K(JniZero.u(new awxf(null), awouVarDI));
        this.f = adqo.a;
        adqh adqhVar = new adqh(awutVarK);
        adqhVar.a = new acoo(this, 8);
        this.h = adqhVar;
        adps adpsVar = new adps(adrlVarAW, awouVarDI, awouVarDK);
        adpsVar.i = new acfc(this, 4);
        adpsVar.j = new awqm() { // from class: adqi
            @Override // defpackage.awqm
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
                String str = (String) obj;
                ImageAsset imageAsset = (ImageAsset) obj4;
                str.getClass();
                imageAsset.getClass();
                adou adouVar = new adou(imageAsset);
                this.a.h.i(str, ((Integer) obj2).intValue(), (String) obj3, adouVar);
                return awmy.a;
            }
        };
        adpsVar.h = new acoo(this, 9);
        this.i = adpsVar;
        adpi adpiVar = new adpi(adrlVarAW, awouVarDI, awouVarDK);
        adpiVar.h = new acfc(this, 5);
        this.j = adpiVar;
        this.l = new Rect();
        this.q = true;
    }

    private final boc p(boc bocVar) {
        boh bohVar;
        boc bocVar2;
        adqm adqmVar = this.k;
        if (bocVar == null) {
            if (adqmVar != null) {
                bohVar = adqmVar.c;
            } else {
                bohVar = null;
                adqmVar = null;
            }
            if (bohVar != null) {
                return adqmVar.a;
            }
            q();
            adrc adrcVar = new adrc(this);
            boh bohVar2 = new boh(adrcVar);
            bohVar2.f(bob.e);
            this.k = new adqm(bohVar2, null, bohVar2, adrcVar);
            return bohVar2;
        }
        if (adqmVar != null) {
            bocVar2 = adqmVar.a;
        } else {
            adqmVar = null;
            bocVar2 = null;
        }
        if (bocVar2 == bocVar && adqmVar.b != null) {
            return bocVar;
        }
        q();
        awri awriVar = new awri();
        awriVar.a = true;
        ayp aypVar = new ayp(awriVar, this, 2);
        try {
            bocVar.b(aypVar);
            awriVar.a = false;
            this.k = new adqm(bocVar, aypVar, null, null);
            return bocVar;
        } catch (Throwable th) {
            awriVar.a = false;
            throw th;
        }
    }

    private final void q() {
        adqm adqmVar = this.k;
        if (adqmVar != null) {
            boe boeVar = adqmVar.b;
            if (boeVar != null) {
                adqmVar.a.c(boeVar);
            }
            boh bohVar = adqmVar.c;
            if (bohVar != null) {
                bohVar.f(bob.a);
            }
            this.k = null;
        }
    }

    public final boc a() {
        adqm adqmVar = this.k;
        if (adqmVar != null) {
            return adqmVar.a;
        }
        return null;
    }

    public final adqc b() {
        return this.f.a();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0069 -> B:27:0x006a). Please report as a decompilation issue!!! */
    public final Object c(awut awutVar, awqg awqgVar, awoq awoqVar) throws Throwable {
        adqu adquVar;
        boolean z;
        adqt adqtVar;
        adqp adqpVar;
        awqg awqgVar2;
        if (awoqVar instanceof adqu) {
            adquVar = (adqu) awoqVar;
            int i = adquVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                adquVar.c = i - Integer.MIN_VALUE;
            } else {
                adquVar = new adqu(this, awoqVar);
            }
        } else {
            adquVar = new adqu(this, awoqVar);
        }
        Object objP = adquVar.a;
        awox awoxVar = awox.a;
        int i2 = adquVar.c;
        if (i2 == 0) {
            atqp.j(objP);
            z = false;
            adqtVar = this.f;
            if (adqtVar instanceof adqp) {
                adqpVar = (adqp) adqtVar;
            } else {
                adqpVar = null;
            }
            if (adqpVar != null || adqpVar.c != awutVar || (awqgVar2 = adqpVar.e) == awqgVar) {
                return Boolean.valueOf(z);
            }
            awou awouVar = this.c;
            adqv adqvVar = new adqv(awqgVar2, (awoq) null, 0);
            adquVar.d = (axcw) awutVar;
            adquVar.e = (vlq) awqgVar2;
            adquVar.c = 1;
            objP = awro.p(awouVar, adqvVar, adquVar);
            if (objP == awoxVar) {
                return awoxVar;
            }
            awqgVar = awqgVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vlq vlqVar = adquVar.e;
            axcw axcwVar = adquVar.d;
            atqp.j(objP);
            awqgVar = vlqVar;
            awutVar = axcwVar;
        }
        acfz.ad((Map) objP, this.h, this.i, this.j);
        z = true;
        adqtVar = this.f;
        if (adqtVar instanceof adqp) {
            adqpVar = (adqp) adqtVar;
        } else {
            adqpVar = null;
        }
        if (adqpVar != null) {
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(ViewModelInstance viewModelInstance, RiveFile riveFile, awqg awqgVar, awoq awoqVar) throws Throwable {
        adrb adrbVar;
        RiveFile riveFile2;
        int i;
        int i2;
        ConcurrentHashMap concurrentHashMap;
        Object objF;
        Function0 function0;
        if (awoqVar instanceof adrb) {
            adrbVar = (adrb) awoqVar;
            int i3 = adrbVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                adrbVar.f = i3 - Integer.MIN_VALUE;
            } else {
                adrbVar = new adrb(this, awoqVar);
            }
        } else {
            adrbVar = new adrb(this, awoqVar);
        }
        Object objP = adrbVar.d;
        awox awoxVar = awox.a;
        int i4 = adrbVar.f;
        if (i4 != 0) {
            if (i4 == 1) {
                riveFile = adrbVar.g;
                viewModelInstance = (ViewModelInstance) adrbVar.a;
                atqp.j(objP);
            } else if (i4 == 2) {
                i2 = adrbVar.c;
                i = adrbVar.b;
                riveFile2 = (RiveFile) adrbVar.a;
                atqp.j(objP);
                this.i.c(riveFile2);
                adpi adpiVar = this.j;
                adpiVar.d(riveFile2);
                adrbVar.a = null;
                adrbVar.b = i;
                adrbVar.c = i2;
                adrbVar.f = 3;
                concurrentHashMap = adpiVar.d;
                synchronized (concurrentHashMap) {
                    Collection collectionValues = concurrentHashMap.values();
                    collectionValues.getClass();
                    List listAp = atqq.ap(collectionValues);
                }
                objF = avkz.f(listAp, adrbVar);
                if (objF != awox.a) {
                    objF = awmy.a;
                }
                if (objF == awoxVar) {
                    return awoxVar;
                }
            } else {
                if (i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = adrbVar.c;
                i = adrbVar.b;
                atqp.j(objP);
            }
            if ((i2 == 0 || i != 0) && (function0 = this.m) != null) {
                function0.invoke();
            }
            return awmy.a;
        }
        atqp.j(objP);
        awou awouVar = this.c;
        adqv adqvVar = new adqv(awqgVar, (awoq) null, 5, (char[]) null);
        adrbVar.a = viewModelInstance;
        adrbVar.g = riveFile;
        adrbVar.f = 1;
        objP = awro.p(awouVar, adqvVar, adrbVar);
        if (objP == awoxVar) {
            return awoxVar;
        }
        adqh adqhVar = this.h;
        adps adpsVar = this.i;
        adpi adpiVar2 = this.j;
        Map map = (Map) objP;
        boolean zK = adqhVar.k();
        acfz.ad(map, adqhVar, adpsVar, adpiVar2);
        int i5 = (!map.isEmpty() || zK) ? 1 : 0;
        int i6 = (adqhVar.l(viewModelInstance) || !adqhVar.k()) ? 0 : 1;
        adrbVar.a = riveFile;
        adrbVar.g = null;
        adrbVar.b = i5;
        adrbVar.c = i6;
        adrbVar.f = 2;
        if (adqh.a(adqhVar, viewModelInstance, riveFile, adrbVar) == awoxVar) {
            return awoxVar;
        }
        riveFile2 = riveFile;
        i = i5;
        i2 = i6;
        this.i.c(riveFile2);
        adpi adpiVar3 = this.j;
        adpiVar3.d(riveFile2);
        adrbVar.a = null;
        adrbVar.b = i;
        adrbVar.c = i2;
        adrbVar.f = 3;
        concurrentHashMap = adpiVar3.d;
        synchronized (concurrentHashMap) {
            Collection collectionValues2 = concurrentHashMap.values();
            collectionValues2.getClass();
            List listAp2 = atqq.ap(collectionValues2);
            objF = avkz.f(listAp2, adrbVar);
            if (objF != awox.a) {
                objF = awmy.a;
            }
            if (objF == awoxVar) {
                return awoxVar;
            }
            if (i2 == 0) {
                function0.invoke();
            } else {
                function0.invoke();
            }
            return awmy.a;
        }
    }

    public final Function0 e() {
        Function0 function0 = this.o;
        if (function0 != null) {
            return this.t ? new efi(this, function0, 13) : function0;
        }
        return null;
    }

    public final awwd f(adqc adqcVar, boc bocVar, awut awutVar) {
        return awro.t(awutVar, null, 0, new adre(adqcVar, this, bocVar, null), 3);
    }

    public final void g() {
        if (this.v) {
            return;
        }
        this.v = true;
        adro adroVar = this.u;
        int i = adroVar.e + 1;
        adroVar.e = i;
        if (i == 1) {
            boc lifecycle = ((bog) adroVar.b.a()).getLifecycle();
            adroVar.d = awro.t(adroVar.c, null, 0, new gme(adroVar.d, adroVar, lifecycle, (awoq) null, 18), 3);
        }
    }

    public final void h() {
        adqt adqtVar = this.f;
        adqr adqrVar = adqtVar instanceof adqr ? (adqr) adqtVar : null;
        if (adqrVar != null) {
            adqrVar.a.p(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if ((r3 instanceof defpackage.adqq) == false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(boolean r7) {
        /*
            r6 = this;
            r6.h()
            if (r7 != 0) goto L8
            r6.n()
        L8:
            adqt r0 = r6.f
            adqc r0 = r0.a()
            adqt r1 = r6.f
            awwd r1 = r1.e()
            r2 = 0
            if (r1 != 0) goto L27
            adqt r1 = r6.f
            boolean r3 = r1 instanceof defpackage.adqr
            if (r3 == 0) goto L20
            adqr r1 = (defpackage.adqr) r1
            goto L21
        L20:
            r1 = r2
        L21:
            if (r1 == 0) goto L26
            awwd r1 = r1.a
            goto L27
        L26:
            r1 = r2
        L27:
            adqt r3 = r6.f
            r4 = 0
            r5 = 6
            j$.util.Objects.checkIndex(r4, r5)
            if (r3 == 0) goto Lad
            boolean r4 = r3 instanceof defpackage.adqn
            if (r4 == 0) goto L41
            adqn r3 = (defpackage.adqn) r3
            awwd r4 = r3.c
            r4.p(r2)
            awut r3 = r3.b
            defpackage.awrc.O(r3)
            goto L61
        L41:
            boolean r4 = r3 instanceof defpackage.adqr
            if (r4 == 0) goto L4d
            adqr r3 = (defpackage.adqr) r3
            awwd r3 = r3.a
            r3.p(r2)
            goto L61
        L4d:
            boolean r4 = r3 instanceof defpackage.adqp
            if (r4 == 0) goto L59
            adqp r3 = (defpackage.adqp) r3
            awut r3 = r3.c
            defpackage.awrc.O(r3)
            goto L61
        L59:
            boolean r4 = r3 instanceof defpackage.adqo
            if (r4 != 0) goto L61
            boolean r3 = r3 instanceof defpackage.adqq
            if (r3 == 0) goto Lad
        L61:
            adqo r3 = defpackage.adqo.a
            r6.f = r3
            r6.q()
            awwd r3 = r6.y
            if (r3 == 0) goto L6f
            r3.p(r2)
        L6f:
            r6.y = r2
            xir r3 = r6.g
            if (r3 == 0) goto L7a
            tau r4 = defpackage.tau.ACTION_ABANDONED
            r3.f(r4)
        L7a:
            r6.g = r2
            adps r3 = r6.i
            java.util.Map r4 = r3.c
            r4.clear()
            java.util.Map r4 = r3.d
            r4.clear()
            adpi r4 = r6.j
            java.util.Map r5 = r4.c
            awwd r3 = r3.b()
            r5.clear()
            awwd r4 = r4.c()
            if (r7 != 0) goto L9f
            r6.p = r2
            r6.m = r2
            r6.n = r2
        L9f:
            adqh r7 = r6.h
            r7.e()
            if (r0 == 0) goto La9
            r0.b()
        La9:
            r6.j(r0, r1, r3, r4)
            return
        Lad:
            awmj r6 = new awmj
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adrf.i(boolean):void");
    }

    public final void j(adqc adqcVar, awwd awwdVar, awwd awwdVar2, awwd awwdVar3) {
        if (adqcVar != null) {
            awro.t(this.x, null, 0, new adqw(awwdVar, awwdVar2, awwdVar3, adqcVar, null), 3);
        }
    }

    public final void k(Function0 function0) {
        if (awrc.c(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            awro.t(this.w, null, 0, new hqx(function0, (awoq) null, 11), 3);
        }
    }

    public final void l() {
        adqt adqtVar = this.f;
        int iAc = acfz.ac(adqtVar);
        if (iAc == 0) {
            adqn adqnVar = (adqn) adqtVar;
            adqnVar.c.p(null);
            awrc.O(adqnVar.b);
            this.f = acfz.Z(adqnVar);
            return;
        }
        if (iAc != 1 && iAc != 2 && iAc != 3 && iAc != 4) {
            throw new awmj();
        }
    }

    public final void m() {
        if (this.f instanceof adqr) {
            return;
        }
        adqt adqtVar = this.f;
        adqs adqsVar = adqtVar instanceof adqs ? (adqs) adqtVar : null;
        if (adqsVar == null) {
            i(false);
            return;
        }
        if (adqsVar instanceof adqn) {
            adqn adqnVar = (adqn) adqsVar;
            adqnVar.c.p(null);
            awrc.O(adqnVar.b);
        }
        boc bocVarA = a();
        bob bobVarA = bocVarA != null ? bocVarA.a() : null;
        if (bobVarA == bob.c || bobVarA == bob.a) {
            i(false);
        } else {
            this.f = adqsVar.d(awro.t(this.w, null, 0, new adqv(this, (awoq) null, 4), 3));
        }
    }

    public final void n() {
        awwd awwdVar;
        if (this.v) {
            this.v = false;
            adro adroVar = this.u;
            int i = adroVar.e;
            if (i <= 0) {
                ((agrc) adro.a.c().k("com/google/android/libraries/youtube/rendering/rive/RiveWorkerPoller", "release", 73, "RiveWorkerPoller.kt")).u("release called with non positive refCount: %d", adroVar.e);
                return;
            }
            int i2 = i - 1;
            adroVar.e = i2;
            if (i2 != 0 || (awwdVar = adroVar.d) == null) {
                return;
            }
            awwdVar.p(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    public final void o(boc bocVar, String str, adrj adrjVar, int i, amiu amiuVar, boolean z, awqg awqgVar) {
        xir xirVarN;
        awwd awwdVar;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("componentKey must not be empty");
        }
        if (adrjVar.a().length() <= 0) {
            throw new IllegalArgumentException("source.cacheKey must not be empty");
        }
        if (!RiveCanvasSession.Companion.isSupported()) {
            ((agrc) a.c().k("com/google/android/libraries/youtube/rendering/rive/RiveSession", "mount", 232, "RiveSession.kt")).t("Device does not support RiveCanvasSession (Requires API 29+ & Hardware Bitmaps). Skipping mount.");
            return;
        }
        this.q = z;
        adql adqlVar = new adql(str, adrjVar.a());
        this.p = new adqk(str, adrjVar, awqgVar);
        g();
        adqt adqtVar = this.f;
        if (adqtVar instanceof adqp) {
            adqp adqpVar = (adqp) adqtVar;
            adql adqlVar2 = adqpVar.a;
            if (awrc.c(adqlVar2, adqlVar)) {
                this.f = new adqp(adqlVar2, adqpVar.b, adqpVar.c, adqpVar.d, awqgVar);
                return;
            }
        }
        adqt adqtVar2 = this.f;
        adqs adqsVar = adqtVar2 instanceof adqs ? (adqs) adqtVar2 : null;
        if (adqsVar == null || !awrc.c(adqsVar.c(), adqlVar)) {
            if (!(this.f instanceof adqo)) {
                i(true);
            }
            if (i != 0) {
                if (i == 1) {
                    i = 0;
                }
                if (i != 0) {
                    xir xirVar = this.g;
                    if (xirVar != null) {
                        xirVar.f(tau.ACTION_ABANDONED);
                    }
                    xit xitVar = this.s;
                    if (xitVar != null) {
                        xirVarN = xitVar.n(i);
                        if (amiuVar != null) {
                            xirVarN.h(amiuVar);
                        }
                    } else {
                        xirVarN = null;
                    }
                    this.g = xirVarN;
                }
            }
            boc bocVarP = p(bocVar);
            xir xirVar2 = this.g;
            awut awutVarK = awrc.K(JniZero.u(new awwf(null), this.b));
            this.f = new adqp(adqlVar, adrjVar, awutVarK, awro.t(awutVarK, this.c, 0, new adra(this, awutVarK, awqgVar, adrjVar, bocVarP, adqlVar, xirVar2, null), 2), awqgVar);
            return;
        }
        h();
        boolean z2 = adqsVar instanceof adqn;
        adqn adqnVar = z2 ? (adqn) adqsVar : null;
        if (adqnVar != null) {
            awwdVar = adqnVar.c;
            if (!awwdVar.q()) {
                awwdVar = null;
            }
        } else {
            awwdVar = null;
        }
        if (a() != bocVar || !z) {
            if (awwdVar != null) {
                awwdVar.p(null);
            }
            awwdVar = null;
        }
        boc bocVarP2 = p(bocVar);
        adqn adqnVar2 = z2 ? (adqn) adqsVar : null;
        awut awutVarK2 = adqnVar2 != null ? adqnVar2.b : awrc.K(JniZero.u(new awwf(null), this.b));
        this.f = awwdVar != null ? adqj.b(adqsVar.b(), awqgVar, null, 23).a(awutVarK2, awwdVar) : new adqq(adqj.b(adqsVar.b(), awqgVar, null, 23));
        awwd awwdVar2 = this.y;
        if (awwdVar2 != null) {
            awwdVar2.p(null);
        }
        this.y = awro.t(awutVarK2, null, 0, new pmu(this, adqsVar, awqgVar, bocVarP2, awutVarK2, (awoq) null, 4), 3);
    }
}
