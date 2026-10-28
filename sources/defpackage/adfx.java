package defpackage;

import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseIntArray;
import app.rive.semantics.SemanticState;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adfx {
    private static final agrf f = agrf.h("com/google/android/libraries/youtube/rendering/elements/logging/YoutubeElementsInteractionLogger");
    public final xgn a;
    public final boolean c;
    public final boolean d;
    public final xgz e;
    private final tqj g;
    private final ReentrantReadWriteLock i;
    private final Lock j;
    private final Lock k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final SparseArray h = new SparseArray();
    final SparseIntArray b = new SparseIntArray();

    public adfx(vxz vxzVar, vxz vxzVar2, vxz vxzVar3, vxz vxzVar4, tqj tqjVar, xgn xgnVar, akrn akrnVar, xgz xgzVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.i = reentrantReadWriteLock;
        this.j = reentrantReadWriteLock.readLock();
        this.k = reentrantReadWriteLock.writeLock();
        this.a = xgnVar;
        this.g = tqjVar;
        this.c = vxzVar3.l(20, 45460727L, false);
        this.l = vxzVar.l(157, 45750803L, false);
        boolean z = true;
        this.m = vxzVar2.l(1, 45783677L, false);
        this.n = vxzVar2.l(3, 45818357L, false) || (vxzVar4 != null && vxzVar4.m(387, 45832978L));
        this.o = vxzVar2.l(5, 45824091L, false);
        if (!vxzVar2.l(6, 45824741L, false) && (vxzVar4 == null || !vxzVar4.m(387, 45832978L))) {
            z = false;
        }
        this.p = z;
        this.d = vxzVar.l(165, 45825748L, false);
        if (xgzVar != null) {
            this.e = xgzVar;
        } else if (akrnVar == null || (akrnVar.b & 8) == 0 || akrnVar.d.d() <= 0) {
            this.e = null;
        } else {
            this.e = new xgj(akrnVar.d, (amud) null);
        }
    }

    public static int a(asnu asnuVar) {
        amud amudVarA = xia.a(d(asnuVar));
        if (amudVarA != null && (amudVarA.c & 8) != 0) {
            ajuz ajuzVar = amudVarA.h;
            if (ajuzVar == null) {
                ajuzVar = ajuz.a;
            }
            if ((ajuzVar.b & 1) != 0) {
                ajuz ajuzVar2 = amudVarA.h;
                if (ajuzVar2 == null) {
                    ajuzVar2 = ajuz.a;
                }
                return ajuzVar2.c;
            }
        }
        return -1;
    }

    public static arns d(asnu asnuVar) {
        asnw asnwVar = asnuVar.c;
        if (asnwVar == null) {
            asnwVar = asnw.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arns.b);
        asnwVar.c(aihlVarCheckIsLite);
        Object objK = asnwVar.j.k(aihlVarCheckIsLite.d);
        return (arns) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
    }

    public static boolean f(asnu asnuVar) {
        asnw asnwVar = asnuVar.c;
        if (asnwVar == null) {
            asnwVar = asnw.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arns.b);
        asnwVar.c(aihlVarCheckIsLite);
        Object objK = asnwVar.j.k(aihlVarCheckIsLite.d);
        amud amudVarA = xia.a((arns) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
        return (amudVarA == null || (amudVarA.c & 8) == 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    private final xgz k(asnu asnuVar) {
        int i;
        xgj xgjVarA;
        xgz xgzVarC = c(asnuVar.d);
        if (xgzVarC != null) {
            return xgzVarC;
        }
        asnw asnwVar = asnuVar.c;
        if (asnwVar == null) {
            asnwVar = asnw.a;
        }
        aihl aihlVar = arns.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        asnwVar.c(aihlVarCheckIsLite);
        Object objK = asnwVar.j.k(aihlVarCheckIsLite.d);
        arns arnsVar = (arns) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        if (f(asnuVar)) {
            asnw asnwVar2 = asnuVar.c;
            if (asnwVar2 == null) {
                asnwVar2 = asnw.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            asnwVar2.c(aihlVarCheckIsLite2);
            Object objK2 = asnwVar2.j.k(aihlVarCheckIsLite2.d);
            amud amudVar = ((arns) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2))).e;
            if (amudVar == null) {
                amudVar = amud.b;
            }
            ajuz ajuzVar = amudVar.h;
            if (ajuzVar == null) {
                ajuzVar = ajuz.a;
            }
            if ((ajuzVar.b & 2) != 0) {
                amud amudVar2 = arnsVar.e;
                if (amudVar2 == null) {
                    amudVar2 = amud.b;
                }
                ajuz ajuzVar2 = amudVar2.h;
                if (ajuzVar2 == null) {
                    ajuzVar2 = ajuz.a;
                }
                i = ajuzVar2.d;
            } else {
                i = asnuVar.d;
            }
        } else {
            i = asnuVar.d;
        }
        tqj tqjVar = this.g;
        int i2 = tqr.a;
        boolean zK = tqjVar.k(1073828948);
        if ((arnsVar.c & 2) != 0) {
            amud amudVar3 = arnsVar.e;
            if (amudVar3 == null) {
                amudVar3 = amud.b;
            }
            xgjVarA = xgj.a(amudVar3, i, zK);
        } else {
            xgjVarA = null;
        }
        if (xgjVarA == null) {
            return null;
        }
        this.h.put(asnuVar.d, xgjVarA);
        return xgjVarA;
    }

    private final adfw l() {
        if (!this.p) {
            return new adfv();
        }
        Lock lock = this.j;
        lock.lock();
        lock.getClass();
        return new adft(lock);
    }

    private final adfw m() {
        if (!this.p) {
            return new adfu();
        }
        Lock lock = this.k;
        lock.lock();
        lock.getClass();
        return new adft(lock);
    }

    private final void n(asnu asnuVar) {
        SparseIntArray sparseIntArray;
        adfw adfwVarM = m();
        try {
            if (this.o) {
                int i = asnuVar.e;
                if (i != asnuVar.d) {
                    boolean z = false;
                    int i2 = i;
                    while (true) {
                        SparseIntArray sparseIntArray2 = this.b;
                        int i3 = sparseIntArray2.get(i, -1);
                        if (i3 == -1) {
                            if (i != asnuVar.d && this.h.get(i) != null) {
                                sparseIntArray2.put(asnuVar.d, i);
                                break;
                            } else {
                                break;
                                break;
                            }
                        }
                        if (i3 == asnuVar.d || i3 == i2) {
                            ((agrc) ((agrc) f.c()).k("com/google/android/libraries/youtube/rendering/elements/logging/YoutubeElementsInteractionLogger", "updateClosestParentMapWithCycleDetection", 697, "YoutubeElementsInteractionLogger.java")).u("Detected cycle in closest parent map for node id: %s", asnuVar.d);
                            break;
                        }
                        if (z) {
                            i2 = sparseIntArray2.get(i2, -1);
                        }
                        z = !z;
                        i = i3;
                    }
                }
            } else {
                int i4 = asnuVar.e;
                while (true) {
                    sparseIntArray = this.b;
                    int i5 = sparseIntArray.get(i4, -1);
                    if (i5 == -1) {
                        break;
                    } else {
                        i4 = i5;
                    }
                }
                if (this.h.get(i4) != null) {
                    sparseIntArray.put(asnuVar.d, i4);
                }
            }
            adfwVarM.close();
        } catch (Throwable th) {
            try {
                adfwVarM.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static final boolean o(aldf aldfVar, int i) {
        long j = aldfVar.b;
        long j2 = i;
        return (j & j2) == j2;
    }

    public final xgz b(asnu asnuVar) {
        xgz xgzVarK;
        if (!this.p) {
            synchronized (this) {
                xgzVarK = k(asnuVar);
            }
            return xgzVarK;
        }
        adfw adfwVarM = m();
        try {
            xgz xgzVarK2 = k(asnuVar);
            adfwVarM.close();
            return xgzVarK2;
        } catch (Throwable th) {
            try {
                adfwVarM.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    final xgz c(int i) {
        xgz xgzVar;
        if (!this.p) {
            synchronized (this) {
                xgzVar = (xgz) this.h.get(i);
            }
            return xgzVar;
        }
        adfw adfwVarL = l();
        try {
            xgz xgzVar2 = (xgz) this.h.get(i);
            adfwVarL.close();
            return xgzVar2;
        } catch (Throwable th) {
            try {
                adfwVarL.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fa  */
    public final void e(agke agkeVar) {
        xgz xgzVar;
        xgn xgnVar;
        int iA;
        int i;
        int size = agkeVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            asnu asnuVar = (asnu) agkeVar.get(i2);
            if (g(asnuVar, false) && c(asnuVar.d) == null) {
                xgz xgzVarB = b(asnuVar);
                if (f(asnuVar) && xgzVarB != null) {
                    asnw asnwVar = asnuVar.c;
                    if (asnwVar == null) {
                        asnwVar = asnw.a;
                    }
                    if ((asnwVar.c & 1) != 0 && (iA = a(asnuVar)) != -1) {
                        asnw asnwVar2 = asnuVar.c;
                        if (asnwVar2 == null) {
                            asnwVar2 = asnw.a;
                        }
                        aihl aihlVar = arns.b;
                        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                        asnwVar2.c(aihlVarCheckIsLite);
                        Object objK = asnwVar2.j.k(aihlVarCheckIsLite.d);
                        amud amudVar = ((arns) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).e;
                        if (amudVar == null) {
                            amudVar = amud.b;
                        }
                        ajuz ajuzVar = amudVar.h;
                        if (ajuzVar == null) {
                            ajuzVar = ajuz.a;
                        }
                        if ((ajuzVar.b & 2) != 0) {
                            asnw asnwVar3 = asnuVar.c;
                            if (asnwVar3 == null) {
                                asnwVar3 = asnw.a;
                            }
                            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                            asnwVar3.c(aihlVarCheckIsLite2);
                            Object objK2 = asnwVar3.j.k(aihlVarCheckIsLite2.d);
                            amud amudVar2 = ((arns) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2))).e;
                            if (amudVar2 == null) {
                                amudVar2 = amud.b;
                            }
                            ajuz ajuzVar2 = amudVar2.h;
                            if (ajuzVar2 == null) {
                                ajuzVar2 = ajuz.a;
                            }
                            i = ajuzVar2.d;
                        } else {
                            i = asnuVar.d;
                        }
                        xgn xgnVar2 = this.a;
                        asnw asnwVar4 = asnuVar.c;
                        if (asnwVar4 == null) {
                            asnwVar4 = asnw.a;
                        }
                        xgnVar2.j(asnwVar4.d, xhb.b(iA), i);
                    }
                    xgz xgzVarC = c(asnuVar.e);
                    if (xgzVarC != null) {
                        this.a.e(xgzVarB, xgzVarC);
                    } else {
                        adfw adfwVarL = l();
                        try {
                            int i3 = this.b.get(asnuVar.e, -1);
                            xgz xgzVar2 = i3 != -1 ? (xgz) this.h.get(i3) : null;
                            adfwVarL.close();
                            if (i3 == -1) {
                                xgzVar = this.e;
                                xgnVar = this.a;
                                if (xgzVar != null) {
                                    xgnVar.e(xgzVarB, xgzVar);
                                } else {
                                    xgnVar.d(xgzVarB);
                                }
                                aihf aihfVarCreateBuilder = amdd.a.createBuilder();
                                aihf aihfVarCreateBuilder2 = amda.a.createBuilder();
                                aihfVarCreateBuilder2.copyOnWrite();
                                amda amdaVar = (amda) aihfVarCreateBuilder2.instance;
                                amdaVar.b |= 1;
                                amdaVar.c = true;
                                aihfVarCreateBuilder.copyOnWrite();
                                amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
                                amda amdaVar2 = (amda) aihfVarCreateBuilder2.build();
                                amdaVar2.getClass();
                                amddVar.x = amdaVar2;
                                amddVar.d |= 8;
                                this.a.A(xgzVarB, (amdd) aihfVarCreateBuilder.build());
                            } else if (xgzVar2 != null) {
                                this.a.e(xgzVarB, xgzVar2);
                            } else if (this.p) {
                                xgzVar = this.e;
                                xgnVar = this.a;
                                if (xgzVar != null) {
                                    xgnVar.e(xgzVarB, xgzVar);
                                } else {
                                    xgnVar.d(xgzVarB);
                                }
                                aihf aihfVarCreateBuilder3 = amdd.a.createBuilder();
                                aihf aihfVarCreateBuilder4 = amda.a.createBuilder();
                                aihfVarCreateBuilder4.copyOnWrite();
                                amda amdaVar3 = (amda) aihfVarCreateBuilder4.instance;
                                amdaVar3.b |= 1;
                                amdaVar3.c = true;
                                aihfVarCreateBuilder3.copyOnWrite();
                                amdd amddVar2 = (amdd) aihfVarCreateBuilder3.instance;
                                amda amdaVar4 = (amda) aihfVarCreateBuilder4.build();
                                amdaVar4.getClass();
                                amddVar2.x = amdaVar4;
                                amddVar2.d |= 8;
                                this.a.A(xgzVarB, (amdd) aihfVarCreateBuilder3.build());
                            } else {
                                this.a.e(xgzVarB, null);
                            }
                        } catch (Throwable th) {
                            try {
                                adfwVarL.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }
            }
        }
    }

    final boolean g(asnu asnuVar, boolean z) {
        asnw asnwVar = asnuVar.c;
        if (asnwVar == null) {
            asnwVar = asnw.a;
        }
        aihl aihlVar = arns.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        asnwVar.c(aihlVarCheckIsLite);
        if (!asnwVar.j.n(aihlVarCheckIsLite.d)) {
            ((agrc) ((agrc) f.c()).k("com/google/android/libraries/youtube/rendering/elements/logging/YoutubeElementsInteractionLogger", "isValidYoutubeLoggingNode", 627, "YoutubeElementsInteractionLogger.java")).A("%sLoggingNode with node id: %s has node id set without YouTubeLoggingProperties", "LITHO_INTERACTIONLOGGINGBUG->", asnuVar.d);
            if (z) {
                return false;
            }
            n(asnuVar);
            return false;
        }
        asnw asnwVar2 = asnuVar.c;
        if (asnwVar2 == null) {
            asnwVar2 = asnw.a;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        asnwVar2.c(aihlVarCheckIsLite2);
        Object objK = asnwVar2.j.k(aihlVarCheckIsLite2.d);
        arns arnsVar = (arns) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        if (!arnsVar.equals(arns.a) && (arnsVar.c & 2) != 0) {
            return true;
        }
        if (z || !this.m) {
            return false;
        }
        n(asnuVar);
        ((agrc) ((agrc) f.c()).k("com/google/android/libraries/youtube/rendering/elements/logging/YoutubeElementsInteractionLogger", "isValidYoutubeLoggingNode", 642, "YoutubeElementsInteractionLogger.java")).A("%sLoggingNode with node id: %s has node id set and has empty YouTubeLoggingProperties set without loggingDirectives", "LITHO_INTERACTIONLOGGINGBUG->", asnuVar.d);
        return false;
    }

    public final void h(asnu asnuVar, int i) {
        if (i != 2 && i != 4) {
            i = 3;
        }
        if (g(asnuVar, this.n)) {
            xgz xgzVarB = b(asnuVar);
            arns arnsVarD = d(asnuVar);
            asnw asnwVar = asnuVar.c;
            if (asnwVar == null) {
                asnwVar = asnw.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(arns.b);
            asnwVar.c(aihlVarCheckIsLite);
            Object objK = asnwVar.j.k(aihlVarCheckIsLite.d);
            amud amudVar = ((arns) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).e;
            if (amudVar == null) {
                amudVar = amud.b;
            }
            aldf aldfVar = amudVar.f;
            if (aldfVar == null) {
                aldfVar = aldf.a;
            }
            if (xgzVarB != null) {
                int i2 = i - 1;
                if (i2 == 1) {
                    if (o(aldfVar, 2) || arnsVarD.d) {
                        this.a.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgzVarB, null);
                        return;
                    }
                    return;
                }
                if (i2 != 2) {
                    if (o(aldfVar, SemanticState.ReadOnly)) {
                        this.a.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_LONG_PRESS, xgzVarB, null);
                    }
                } else if (o(aldfVar, 64)) {
                    this.a.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_SWIPE, xgzVarB, null);
                }
            }
        }
    }

    public final void i(agke agkeVar, int i, agfr agfrVar) {
        for (int i2 = 0; i2 < ((agpi) agkeVar).d; i2++) {
            asnu asnuVar = (asnu) agkeVar.get(i2);
            if (g(asnuVar, this.n)) {
                aihf aihfVarCreateBuilder = amdd.a.createBuilder();
                aihf aihfVarCreateBuilder2 = amda.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                amda amdaVar = (amda) aihfVarCreateBuilder2.instance;
                amdaVar.b |= 1;
                amdaVar.c = true;
                aihfVarCreateBuilder.copyOnWrite();
                amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
                amda amdaVar2 = (amda) aihfVarCreateBuilder2.build();
                amdaVar2.getClass();
                amddVar.x = amdaVar2;
                amddVar.d |= 8;
                xgz xgzVarB = b(asnuVar);
                if (xgzVarB != null) {
                    if (i == 2) {
                        Rect rect = (Rect) agfrVar.io();
                        aihf aihfVarCreateBuilder3 = amdw.a.createBuilder();
                        int iWidth = rect.width();
                        aihfVarCreateBuilder3.copyOnWrite();
                        amdw amdwVar = (amdw) aihfVarCreateBuilder3.instance;
                        amdwVar.b |= 4;
                        amdwVar.e = iWidth;
                        int iHeight = rect.height();
                        aihfVarCreateBuilder3.copyOnWrite();
                        amdw amdwVar2 = (amdw) aihfVarCreateBuilder3.instance;
                        amdwVar2.b |= 8;
                        amdwVar2.f = iHeight;
                        int i3 = rect.left;
                        aihfVarCreateBuilder3.copyOnWrite();
                        amdw amdwVar3 = (amdw) aihfVarCreateBuilder3.instance;
                        amdwVar3.b |= 1;
                        amdwVar3.c = i3;
                        int i4 = rect.top;
                        aihfVarCreateBuilder3.copyOnWrite();
                        amdw amdwVar4 = (amdw) aihfVarCreateBuilder3.instance;
                        amdwVar4.b |= 2;
                        amdwVar4.d = i4;
                        aihfVarCreateBuilder.copyOnWrite();
                        amdd amddVar2 = (amdd) aihfVarCreateBuilder.instance;
                        amdw amdwVar5 = (amdw) aihfVarCreateBuilder3.build();
                        amdwVar5.getClass();
                        amddVar2.y = amdwVar5;
                        amddVar2.d |= SemanticState.Focused;
                        this.a.w(xgzVarB, (amdd) aihfVarCreateBuilder.build());
                    } else {
                        this.a.p(xgzVarB, null);
                    }
                }
            }
        }
    }

    public final boolean j(asnu asnuVar, int i) {
        if (!this.l) {
            return false;
        }
        asnw asnwVar = asnuVar.c;
        if (asnwVar == null) {
            asnwVar = asnw.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arns.b);
        asnwVar.c(aihlVarCheckIsLite);
        Object objK = asnwVar.j.k(aihlVarCheckIsLite.d);
        amud amudVar = ((arns) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).e;
        if (amudVar == null) {
            amudVar = amud.b;
        }
        aldf aldfVar = amudVar.f;
        if (aldfVar == null) {
            aldfVar = aldf.a;
        }
        int i2 = i - 1;
        int i3 = 2;
        if (i2 != 1) {
            i3 = i2 != 2 ? SemanticState.ReadOnly : 64;
        }
        long j = aldfVar.b;
        long j2 = i3;
        return (j & j2) == j2;
    }
}
