package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mkq extends fkx {

    @fmt(a = 5)
    @fmu(a = fmv.a)
    List A;

    @fmt(a = 5)
    @fmu(a = fmv.a)
    List B;

    @fmt(a = 5)
    @fmu(a = fmv.a)
    List C;

    @fmt(a = 5)
    @fmu(a = fmv.a)
    List D;

    @fmt(a = 5)
    @fmu(a = fmv.a)
    List E;

    @fmt(a = 5)
    @fmu(a = fmv.a)
    List F;

    @fmt(a = 5)
    @fmu(a = fmv.a)
    List G;

    @fmt(a = 5)
    @fmu(a = fmv.a)
    List H;

    @fmt(a = 5)
    @fmu(a = fmv.a)
    List I;

    @fmt(a = 5)
    @fmu(a = fmv.a)
    List J;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nxq K;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    ntf a;

    @fmt(a = 10)
    @fmu(a = fmv.a)
    fgy b;

    @fmt(a = 5)
    @fmu(a = fmv.a)
    List c;

    @fmt(a = 5)
    @fmu(a = fmv.a)
    List d;

    @fmt(a = 5)
    @fmu(a = fmv.a)
    List e;

    @fmt(a = 5)
    @fmu(a = fmv.a)
    List f;

    @fmt(a = 5)
    @fmu(a = fmv.a)
    List g;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean q;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean r;

    @fmt(a = 5)
    @fmu(a = fmv.a)
    List s;

    @fmt(a = 5)
    @fmu(a = fmv.a)
    List t;

    @fmt(a = 5)
    @fmu(a = fmv.a)
    List u;

    @fmt(a = 5)
    @fmu(a = fmv.a)
    List v;

    @fmt(a = 5)
    @fmu(a = fmv.a)
    List w;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean x;

    @fmt(a = 5)
    @fmu(a = fmv.a)
    List y;

    @fmt(a = 5)
    @fmu(a = fmv.a)
    List z;

    public mkq() {
        super("ElementEventWithGesture");
    }

    private static final mkp aE(fhd fhdVar) {
        return (mkp) fhdVar.i().c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0316  */
    /* JADX WARN: Code duplicated, block: B:161:0x0544  */
    /* JADX WARN: Code duplicated, block: B:163:0x0550  */
    /* JADX WARN: Code duplicated, block: B:165:0x055a  */
    /* JADX WARN: Code duplicated, block: B:168:0x0564 A[LOOP:14: B:166:0x055e->B:168:0x0564, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:202:0x061f  */
    /* JADX WARN: Code duplicated, block: B:203:0x062c  */
    /* JADX WARN: Code duplicated, block: B:205:0x0633 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:206:0x0635  */
    /* JADX WARN: Code duplicated, block: B:208:0x063f  */
    /* JADX WARN: Code duplicated, block: B:210:0x0643  */
    /* JADX WARN: Code duplicated, block: B:218:0x0662 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:222:0x0669  */
    /* JADX WARN: Code duplicated, block: B:224:0x066c  */
    /* JADX WARN: Code duplicated, block: B:225:0x066e  */
    /* JADX WARN: Code duplicated, block: B:227:0x0671  */
    /* JADX WARN: Code duplicated, block: B:228:0x0678  */
    /* JADX WARN: Code duplicated, block: B:231:0x0681  */
    /* JADX WARN: Code duplicated, block: B:233:0x068f  */
    /* JADX WARN: Code duplicated, block: B:234:0x0692  */
    /* JADX WARN: Code duplicated, block: B:235:0x0696  */
    /* JADX WARN: Code duplicated, block: B:237:0x069c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:238:0x069e  */
    /* JADX WARN: Code duplicated, block: B:243:0x06b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:244:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:248:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:251:0x06f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:258:0x070e  */
    /* JADX WARN: Code duplicated, block: B:260:0x0711  */
    /* JADX WARN: Code duplicated, block: B:263:0x071b  */
    /* JADX WARN: Code duplicated, block: B:264:0x071e  */
    /* JADX WARN: Code duplicated, block: B:266:0x0722  */
    /* JADX WARN: Code duplicated, block: B:269:0x0729  */
    /* JADX WARN: Code duplicated, block: B:271:0x0738  */
    /* JADX WARN: Code duplicated, block: B:273:0x073e  */
    /* JADX WARN: Code duplicated, block: B:275:0x0742  */
    /* JADX WARN: Code duplicated, block: B:277:0x074e  */
    /* JADX WARN: Code duplicated, block: B:279:0x0752  */
    /* JADX WARN: Code duplicated, block: B:282:0x0759  */
    /* JADX WARN: Code duplicated, block: B:288:0x0777 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:289:0x0779  */
    /* JADX WARN: Code duplicated, block: B:290:0x077b  */
    /* JADX WARN: Code duplicated, block: B:291:0x077d  */
    /* JADX WARN: Code duplicated, block: B:293:0x0783  */
    /* JADX WARN: Code duplicated, block: B:296:0x0798 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:300:0x07a4 A[LOOP:16: B:298:0x079e->B:300:0x07a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:301:0x0823  */
    /* JADX WARN: Code duplicated, block: B:316:0x0851  */
    /* JADX WARN: Code duplicated, block: B:318:0x0854  */
    /* JADX WARN: Code duplicated, block: B:324:0x0874 A[LOOP:18: B:322:0x086e->B:324:0x0874, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:327:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:329:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:331:0x08cb  */
    /* JADX WARN: Code duplicated, block: B:333:0x08d1  */
    /* JADX WARN: Code duplicated, block: B:334:0x08e1  */
    /* JADX WARN: Code duplicated, block: B:336:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:338:0x08eb  */
    /* JADX WARN: Code duplicated, block: B:340:0x0901  */
    /* JADX WARN: Code duplicated, block: B:342:0x0907  */
    /* JADX WARN: Code duplicated, block: B:344:0x0912  */
    /* JADX WARN: Code duplicated, block: B:346:0x091a  */
    /* JADX WARN: Code duplicated, block: B:355:0x0973  */
    /* JADX WARN: Code duplicated, block: B:415:0x06d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x06aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:94:0x02e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:98:0x02fb A[LOOP:8: B:96:0x02f5->B:98:0x02fb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x030a  */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, ntq] */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object, nru] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, nru] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, ntq] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, ntq] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object, ntq] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, ntq] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object, ntq] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, nru] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, nru] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, nru] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object, nru] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, nru] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object, ntq] */
    @Override // defpackage.fgy
    protected final Object A(fip fipVar, Object obj) {
        Object obj2;
        boolean z;
        int i;
        boolean z2;
        View view;
        List<aclc> list;
        float fC;
        Float f;
        boolean z3;
        boolean z4;
        int actionIndex;
        int i2;
        float f2;
        float f3;
        float y;
        int i3;
        float f4;
        float f5;
        float fAbs;
        float fAbs2;
        int i4;
        float f6;
        float fHypot;
        boolean z5;
        boolean z6;
        int i5;
        float f7;
        float f8;
        float f9;
        View view2;
        List<aclc> list2;
        boolean z7;
        float fAbs3;
        int pointerId;
        List list3;
        Iterator it;
        Integer num;
        nxg nxgVar;
        Iterator it2;
        int i6 = 32;
        boolean zPerformAccessibilityAction = true;
        boolean zA = false;
        switch (fipVar.c) {
            case -1974694341:
                fsz fszVar = (fsz) obj;
                fiu fiuVar = fipVar.b;
                Object obj3 = fszVar.b;
                boolean z8 = fszVar.a;
                List list4 = ((mkq) fiuVar).t;
                return null;
            case -1932591986:
                obj2 = null;
                fiu fiuVar2 = fipVar.b;
                Object obj4 = ((yy) obj).a;
                List list5 = ((mkq) fiuVar2).u;
                if (list5 != null) {
                    Iterator it3 = list5.iterator();
                    while (it3.hasNext()) {
                        ((nti) it3.next()).a((View) obj4);
                    }
                }
                return obj2;
            case -1351902487:
                fiu fiuVar3 = fipVar.b;
                fhd fhdVar = (fhd) fipVar.d[0];
                Object obj5 = ((yw) obj).a;
                mkp mkpVar = (mkp) fhdVar.i().c;
                List list6 = ((mkq) fiuVar3).E;
                AtomicReference atomicReference = mkpVar.h;
                AtomicReference atomicReference2 = mkpVar.f;
                if (list6 != null) {
                    Iterator it4 = list6.iterator();
                    while (it4.hasNext()) {
                        ((ntl) it4.next()).a((View) obj5, (nxg) atomicReference.get(), (MotionEvent) atomicReference2.get());
                    }
                }
                obj2 = null;
                atomicReference2.set(null);
                return obj2;
            case -1336101728:
                isw iswVar = (isw) obj;
                fiu fiuVar4 = fipVar.b;
                fhd fhdVar2 = (fhd) fipVar.d[0];
                Object obj6 = iswVar.b;
                Object obj7 = iswVar.a;
                mkp mkpVar2 = (mkp) fhdVar2.i().c;
                nxq nxqVar = ((mkq) fiuVar4).K;
                AtomicReference atomicReference3 = mkpVar2.d;
                AtomicReference atomicReference4 = mkpVar2.a;
                AtomicReference atomicReference5 = mkpVar2.g;
                mkr mkrVar = mkpVar2.b;
                AtomicReference atomicReference6 = mkpVar2.h;
                AtomicReference atomicReference7 = mkpVar2.f;
                MotionEvent motionEvent = (MotionEvent) obj7;
                if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 0) {
                    atomicReference6.set(new nxg(motionEvent.getX(), motionEvent.getY()));
                    atomicReference7.set(obj7);
                }
                mkrVar.a = new WeakReference(obj6);
                hbf hbfVar = (hbf) atomicReference3.get();
                if (hbfVar != null) {
                    hbfVar.f(motionEvent);
                }
                mle mleVar = (mle) atomicReference4.get();
                if (mleVar != null) {
                    motionEvent.getEventTime();
                    int actionMasked = motionEvent.getActionMasked();
                    if (mleVar.b) {
                        mleVar.m.onTouchEvent(motionEvent);
                    }
                    int pointerCount = motionEvent.getPointerCount();
                    boolean z9 = (motionEvent.getButtonState() & 32) != 0;
                    boolean z10 = actionMasked == 1 || actionMasked == 3 || (mleVar.l == 2 && !z9);
                    float x = 0.0f;
                    if (actionMasked == 0) {
                        if (mleVar.f) {
                            mleVar.o.a();
                            mleVar.f = false;
                            mleVar.e = 0.0f;
                            mleVar.l = 0;
                        } else if (mleVar.a()) {
                            if (z10) {
                                mleVar.f = false;
                                mleVar.e = 0.0f;
                                mleVar.l = 0;
                            } else {
                                if (!mleVar.f && mleVar.c && !mleVar.a() && z9) {
                                    mleVar.j = motionEvent.getX();
                                    mleVar.k = motionEvent.getY();
                                    mleVar.l = 2;
                                    mleVar.e = 0.0f;
                                }
                                if (actionMasked != 0 || actionMasked == 6 || actionMasked == 5) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (actionMasked == 6) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    actionIndex = motionEvent.getActionIndex();
                                    i2 = pointerCount - 1;
                                } else {
                                    actionIndex = -1;
                                    i2 = pointerCount;
                                }
                                f2 = i2;
                                if (mleVar.a()) {
                                    f5 = mleVar.j;
                                    f3 = 0.0f;
                                    f4 = mleVar.k;
                                    if (motionEvent.getY() < f4) {
                                        mleVar.n = true;
                                    } else {
                                        mleVar.n = false;
                                    }
                                } else {
                                    f3 = 0.0f;
                                    y = 0.0f;
                                    for (i3 = 0; i3 < pointerCount; i3++) {
                                        if (actionIndex != i3) {
                                            x += motionEvent.getX(i3);
                                            y += motionEvent.getY(i3);
                                        }
                                    }
                                    float f10 = x / f2;
                                    f4 = y / f2;
                                    f5 = f10;
                                }
                                fAbs = f3;
                                fAbs2 = fAbs;
                                for (i4 = 0; i4 < pointerCount; i4++) {
                                    if (actionIndex != i4) {
                                        fAbs += Math.abs(motionEvent.getX(i4) - f5);
                                        fAbs2 += Math.abs(motionEvent.getY(i4) - f4);
                                    }
                                }
                                f6 = fAbs / f2;
                                float f11 = fAbs2 / f2;
                                fHypot = f11 + f11;
                                if (!mleVar.a()) {
                                    fHypot = (float) Math.hypot(f6 + f6, fHypot);
                                }
                                z5 = mleVar.f;
                                if (mleVar.a() && z5) {
                                    if (fHypot >= mleVar.h) {
                                        if (z3) {
                                            z3 = true;
                                        } else {
                                            z6 = z5;
                                        }
                                        if (mleVar.a()) {
                                            i5 = mleVar.g;
                                        } else {
                                            i5 = mleVar.h;
                                        }
                                        if (!z6 && fHypot >= i5) {
                                            if (!z5) {
                                                mleVar.d = fHypot;
                                                mleVar.f = true;
                                            } else if (Math.abs(fHypot - mleVar.e) > mleVar.g) {
                                                mleVar.d = fHypot;
                                                mleVar.f = true;
                                            }
                                        }
                                        if (actionMasked == 2) {
                                            if (mleVar.f) {
                                                mku mkuVar = mleVar.o;
                                                float f12 = mkuVar.b;
                                                f7 = 1.0f;
                                                if (mleVar.a()) {
                                                    z7 = mleVar.n ? fHypot > mleVar.d : fHypot < mleVar.d;
                                                    fAbs3 = Math.abs(1.0f - (fHypot / mleVar.d)) * 0.5f;
                                                    if (mleVar.d > mleVar.g) {
                                                        if (z7) {
                                                            f7 = 1.0f + fAbs3;
                                                        } else {
                                                            f7 = 1.0f - fAbs3;
                                                        }
                                                    }
                                                } else {
                                                    f8 = mleVar.d;
                                                    if (f8 > f3) {
                                                        f7 = fHypot / f8;
                                                    }
                                                }
                                                f9 = f12 * f7;
                                                mkuVar.b = f9;
                                                mkr mkrVar2 = mkuVar.a;
                                                view2 = (View) mkrVar2.a.get();
                                                list2 = mkrVar2.l;
                                                if (list2 != null && view2 != null) {
                                                    for (aclc aclcVar : list2) {
                                                        aslp aslpVarG = mpo.g(view2);
                                                        aihf aihfVarCreateBuilder = aslr.a.createBuilder();
                                                        aihfVarCreateBuilder.copyOnWrite();
                                                        aslr aslrVar = (aslr) aihfVarCreateBuilder.instance;
                                                        aslrVar.c |= 1;
                                                        aslrVar.d = f9;
                                                        aslr aslrVar2 = (aslr) aihfVarCreateBuilder.build();
                                                        aihh aihhVar = (aihh) SenderStateOuterClass$SenderState.a.createBuilder();
                                                        aihhVar.e(aslr.b, aslrVar2);
                                                        aihhVar.e(aslp.b, aslpVarG);
                                                        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = (SenderStateOuterClass$SenderState) aihhVar.build();
                                                        mpo mpoVar = (mpo) aclcVar.e;
                                                        nry nryVar = mpoVar.b;
                                                        CommandOuterClass$Command commandOuterClass$CommandX = ((omj) aclcVar.c).x();
                                                        ?? r9 = aclcVar.a;
                                                        ?? r12 = aclcVar.b;
                                                        nsl nslVar = (nsl) aclcVar.d;
                                                        mpoVar.i(nryVar.a(commandOuterClass$CommandX, mpo.j(view2, null, 8, null, senderStateOuterClass$SenderState, r9, r12, nslVar, null)).f(mpoVar.d.a(nslVar)).D(), nslVar);
                                                    }
                                                }
                                            } else {
                                                mleVar.d = fHypot;
                                            }
                                        }
                                    }
                                    mleVar.o.a();
                                    mleVar.f = false;
                                    mleVar.e = fHypot;
                                    z6 = false;
                                } else {
                                    z6 = z5;
                                }
                                if (z3) {
                                    mleVar.d = fHypot;
                                    mleVar.e = fHypot;
                                }
                                if (mleVar.a()) {
                                    i5 = mleVar.g;
                                } else {
                                    i5 = mleVar.h;
                                }
                                if (!z6) {
                                    if (!z5) {
                                        mleVar.d = fHypot;
                                        mleVar.f = true;
                                    } else if (Math.abs(fHypot - mleVar.e) > mleVar.g) {
                                        mleVar.d = fHypot;
                                        mleVar.f = true;
                                    }
                                }
                                if (actionMasked == 2) {
                                    if (mleVar.f) {
                                        mku mkuVar2 = mleVar.o;
                                        float f13 = mkuVar2.b;
                                        f7 = 1.0f;
                                        if (mleVar.a()) {
                                            if (mleVar.n) {
                                            }
                                            fAbs3 = Math.abs(1.0f - (fHypot / mleVar.d)) * 0.5f;
                                            if (mleVar.d > mleVar.g) {
                                                if (z7) {
                                                    f7 = 1.0f + fAbs3;
                                                } else {
                                                    f7 = 1.0f - fAbs3;
                                                }
                                            }
                                        } else {
                                            f8 = mleVar.d;
                                            if (f8 > f3) {
                                                f7 = fHypot / f8;
                                            }
                                        }
                                        f9 = f13 * f7;
                                        mkuVar2.b = f9;
                                        mkr mkrVar3 = mkuVar2.a;
                                        view2 = (View) mkrVar3.a.get();
                                        list2 = mkrVar3.l;
                                        if (list2 != null) {
                                            while (r0.hasNext()) {
                                                aslp aslpVarG2 = mpo.g(view2);
                                                aihf aihfVarCreateBuilder2 = aslr.a.createBuilder();
                                                aihfVarCreateBuilder2.copyOnWrite();
                                                aslr aslrVar3 = (aslr) aihfVarCreateBuilder2.instance;
                                                aslrVar3.c |= 1;
                                                aslrVar3.d = f9;
                                                aslr aslrVar4 = (aslr) aihfVarCreateBuilder2.build();
                                                aihh aihhVar2 = (aihh) SenderStateOuterClass$SenderState.a.createBuilder();
                                                aihhVar2.e(aslr.b, aslrVar4);
                                                aihhVar2.e(aslp.b, aslpVarG2);
                                                SenderStateOuterClass$SenderState senderStateOuterClass$SenderState2 = (SenderStateOuterClass$SenderState) aihhVar2.build();
                                                mpo mpoVar2 = (mpo) aclcVar.e;
                                                nry nryVar2 = mpoVar2.b;
                                                CommandOuterClass$Command commandOuterClass$CommandX2 = ((omj) aclcVar.c).x();
                                                ?? r10 = aclcVar.a;
                                                ?? r13 = aclcVar.b;
                                                nsl nslVar2 = (nsl) aclcVar.d;
                                                mpoVar2.i(nryVar2.a(commandOuterClass$CommandX2, mpo.j(view2, null, 8, null, senderStateOuterClass$SenderState2, r10, r13, nslVar2, null)).f(mpoVar2.d.a(nslVar2)).D(), nslVar2);
                                            }
                                        }
                                    } else {
                                        mleVar.d = fHypot;
                                    }
                                }
                            }
                        }
                        if (!z10) {
                            if (!mleVar.f) {
                                mleVar.j = motionEvent.getX();
                                mleVar.k = motionEvent.getY();
                                mleVar.l = 2;
                                mleVar.e = 0.0f;
                            }
                            if (actionMasked != 0) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            if (actionMasked == 6) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                actionIndex = motionEvent.getActionIndex();
                                i2 = pointerCount - 1;
                            } else {
                                actionIndex = -1;
                                i2 = pointerCount;
                            }
                            f2 = i2;
                            if (mleVar.a()) {
                                f5 = mleVar.j;
                                f3 = 0.0f;
                                f4 = mleVar.k;
                                if (motionEvent.getY() < f4) {
                                    mleVar.n = true;
                                } else {
                                    mleVar.n = false;
                                }
                            } else {
                                f3 = 0.0f;
                                y = 0.0f;
                                while (i3 < pointerCount) {
                                    if (actionIndex != i3) {
                                        x += motionEvent.getX(i3);
                                        y += motionEvent.getY(i3);
                                    }
                                }
                                float f14 = x / f2;
                                f4 = y / f2;
                                f5 = f14;
                            }
                            fAbs = f3;
                            fAbs2 = fAbs;
                            while (i4 < pointerCount) {
                                if (actionIndex != i4) {
                                    fAbs += Math.abs(motionEvent.getX(i4) - f5);
                                    fAbs2 += Math.abs(motionEvent.getY(i4) - f4);
                                }
                            }
                            f6 = fAbs / f2;
                            float f15 = fAbs2 / f2;
                            fHypot = f15 + f15;
                            if (!mleVar.a()) {
                                fHypot = (float) Math.hypot(f6 + f6, fHypot);
                            }
                            z5 = mleVar.f;
                            if (mleVar.a()) {
                                z6 = z5;
                                if (z3) {
                                    mleVar.d = fHypot;
                                    mleVar.e = fHypot;
                                }
                            } else {
                                z6 = z5;
                                if (z3) {
                                    mleVar.d = fHypot;
                                    mleVar.e = fHypot;
                                }
                            }
                            if (mleVar.a()) {
                                i5 = mleVar.g;
                            } else {
                                i5 = mleVar.h;
                            }
                            if (!z6) {
                                if (!z5) {
                                    mleVar.d = fHypot;
                                    mleVar.f = true;
                                } else if (Math.abs(fHypot - mleVar.e) > mleVar.g) {
                                    mleVar.d = fHypot;
                                    mleVar.f = true;
                                }
                            }
                            if (actionMasked == 2) {
                                if (mleVar.f) {
                                    mku mkuVar3 = mleVar.o;
                                    float f16 = mkuVar3.b;
                                    f7 = 1.0f;
                                    if (mleVar.a()) {
                                        if (mleVar.n) {
                                        }
                                        fAbs3 = Math.abs(1.0f - (fHypot / mleVar.d)) * 0.5f;
                                        if (mleVar.d > mleVar.g) {
                                            if (z7) {
                                                f7 = 1.0f + fAbs3;
                                            } else {
                                                f7 = 1.0f - fAbs3;
                                            }
                                        }
                                    } else {
                                        f8 = mleVar.d;
                                        if (f8 > f3) {
                                            f7 = fHypot / f8;
                                        }
                                    }
                                    f9 = f16 * f7;
                                    mkuVar3.b = f9;
                                    mkr mkrVar4 = mkuVar3.a;
                                    view2 = (View) mkrVar4.a.get();
                                    list2 = mkrVar4.l;
                                    if (list2 != null) {
                                        while (r0.hasNext()) {
                                            aslp aslpVarG3 = mpo.g(view2);
                                            aihf aihfVarCreateBuilder3 = aslr.a.createBuilder();
                                            aihfVarCreateBuilder3.copyOnWrite();
                                            aslr aslrVar5 = (aslr) aihfVarCreateBuilder3.instance;
                                            aslrVar5.c |= 1;
                                            aslrVar5.d = f9;
                                            aslr aslrVar6 = (aslr) aihfVarCreateBuilder3.build();
                                            aihh aihhVar3 = (aihh) SenderStateOuterClass$SenderState.a.createBuilder();
                                            aihhVar3.e(aslr.b, aslrVar6);
                                            aihhVar3.e(aslp.b, aslpVarG3);
                                            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState3 = (SenderStateOuterClass$SenderState) aihhVar3.build();
                                            mpo mpoVar3 = (mpo) aclcVar.e;
                                            nry nryVar3 = mpoVar3.b;
                                            CommandOuterClass$Command commandOuterClass$CommandX3 = ((omj) aclcVar.c).x();
                                            ?? r11 = aclcVar.a;
                                            ?? r14 = aclcVar.b;
                                            nsl nslVar3 = (nsl) aclcVar.d;
                                            mpoVar3.i(nryVar3.a(commandOuterClass$CommandX3, mpo.j(view2, null, 8, null, senderStateOuterClass$SenderState3, r11, r14, nslVar3, null)).f(mpoVar3.d.a(nslVar3)).D(), nslVar3);
                                        }
                                    }
                                } else {
                                    mleVar.d = fHypot;
                                }
                            }
                        }
                    } else if (z10) {
                        z10 = true;
                        if (mleVar.f) {
                            mleVar.o.a();
                            mleVar.f = false;
                            mleVar.e = 0.0f;
                            mleVar.l = 0;
                        } else if (mleVar.a()) {
                            if (z10) {
                                mleVar.f = false;
                                mleVar.e = 0.0f;
                                mleVar.l = 0;
                            } else {
                                if (!mleVar.f) {
                                    mleVar.j = motionEvent.getX();
                                    mleVar.k = motionEvent.getY();
                                    mleVar.l = 2;
                                    mleVar.e = 0.0f;
                                }
                                if (actionMasked != 0) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                if (actionMasked == 6) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    actionIndex = motionEvent.getActionIndex();
                                    i2 = pointerCount - 1;
                                } else {
                                    actionIndex = -1;
                                    i2 = pointerCount;
                                }
                                f2 = i2;
                                if (mleVar.a()) {
                                    f5 = mleVar.j;
                                    f3 = 0.0f;
                                    f4 = mleVar.k;
                                    if (motionEvent.getY() < f4) {
                                        mleVar.n = true;
                                    } else {
                                        mleVar.n = false;
                                    }
                                } else {
                                    f3 = 0.0f;
                                    y = 0.0f;
                                    while (i3 < pointerCount) {
                                        if (actionIndex != i3) {
                                            x += motionEvent.getX(i3);
                                            y += motionEvent.getY(i3);
                                        }
                                    }
                                    float f17 = x / f2;
                                    f4 = y / f2;
                                    f5 = f17;
                                }
                                fAbs = f3;
                                fAbs2 = fAbs;
                                while (i4 < pointerCount) {
                                    if (actionIndex != i4) {
                                        fAbs += Math.abs(motionEvent.getX(i4) - f5);
                                        fAbs2 += Math.abs(motionEvent.getY(i4) - f4);
                                    }
                                }
                                f6 = fAbs / f2;
                                float f18 = fAbs2 / f2;
                                fHypot = f18 + f18;
                                if (!mleVar.a()) {
                                    fHypot = (float) Math.hypot(f6 + f6, fHypot);
                                }
                                z5 = mleVar.f;
                                if (mleVar.a()) {
                                    z6 = z5;
                                    if (z3) {
                                        mleVar.d = fHypot;
                                        mleVar.e = fHypot;
                                    }
                                } else {
                                    z6 = z5;
                                    if (z3) {
                                        mleVar.d = fHypot;
                                        mleVar.e = fHypot;
                                    }
                                }
                                if (mleVar.a()) {
                                    i5 = mleVar.g;
                                } else {
                                    i5 = mleVar.h;
                                }
                                if (!z6) {
                                    if (!z5) {
                                        mleVar.d = fHypot;
                                        mleVar.f = true;
                                    } else if (Math.abs(fHypot - mleVar.e) > mleVar.g) {
                                        mleVar.d = fHypot;
                                        mleVar.f = true;
                                    }
                                }
                                if (actionMasked == 2) {
                                    if (mleVar.f) {
                                        mku mkuVar4 = mleVar.o;
                                        float f19 = mkuVar4.b;
                                        f7 = 1.0f;
                                        if (mleVar.a()) {
                                            if (mleVar.n) {
                                            }
                                            fAbs3 = Math.abs(1.0f - (fHypot / mleVar.d)) * 0.5f;
                                            if (mleVar.d > mleVar.g) {
                                                if (z7) {
                                                    f7 = 1.0f + fAbs3;
                                                } else {
                                                    f7 = 1.0f - fAbs3;
                                                }
                                            }
                                        } else {
                                            f8 = mleVar.d;
                                            if (f8 > f3) {
                                                f7 = fHypot / f8;
                                            }
                                        }
                                        f9 = f19 * f7;
                                        mkuVar4.b = f9;
                                        mkr mkrVar5 = mkuVar4.a;
                                        view2 = (View) mkrVar5.a.get();
                                        list2 = mkrVar5.l;
                                        if (list2 != null) {
                                            while (r0.hasNext()) {
                                                aslp aslpVarG4 = mpo.g(view2);
                                                aihf aihfVarCreateBuilder4 = aslr.a.createBuilder();
                                                aihfVarCreateBuilder4.copyOnWrite();
                                                aslr aslrVar7 = (aslr) aihfVarCreateBuilder4.instance;
                                                aslrVar7.c |= 1;
                                                aslrVar7.d = f9;
                                                aslr aslrVar8 = (aslr) aihfVarCreateBuilder4.build();
                                                aihh aihhVar4 = (aihh) SenderStateOuterClass$SenderState.a.createBuilder();
                                                aihhVar4.e(aslr.b, aslrVar8);
                                                aihhVar4.e(aslp.b, aslpVarG4);
                                                SenderStateOuterClass$SenderState senderStateOuterClass$SenderState4 = (SenderStateOuterClass$SenderState) aihhVar4.build();
                                                mpo mpoVar4 = (mpo) aclcVar.e;
                                                nry nryVar4 = mpoVar4.b;
                                                CommandOuterClass$Command commandOuterClass$CommandX4 = ((omj) aclcVar.c).x();
                                                ?? r15 = aclcVar.a;
                                                ?? r16 = aclcVar.b;
                                                nsl nslVar4 = (nsl) aclcVar.d;
                                                mpoVar4.i(nryVar4.a(commandOuterClass$CommandX4, mpo.j(view2, null, 8, null, senderStateOuterClass$SenderState4, r15, r16, nslVar4, null)).f(mpoVar4.d.a(nslVar4)).D(), nslVar4);
                                            }
                                        }
                                    } else {
                                        mleVar.d = fHypot;
                                    }
                                }
                            }
                        }
                        if (!z10) {
                            if (!mleVar.f) {
                                mleVar.j = motionEvent.getX();
                                mleVar.k = motionEvent.getY();
                                mleVar.l = 2;
                                mleVar.e = 0.0f;
                            }
                            if (actionMasked != 0) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            if (actionMasked == 6) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                actionIndex = motionEvent.getActionIndex();
                                i2 = pointerCount - 1;
                            } else {
                                actionIndex = -1;
                                i2 = pointerCount;
                            }
                            f2 = i2;
                            if (mleVar.a()) {
                                f5 = mleVar.j;
                                f3 = 0.0f;
                                f4 = mleVar.k;
                                if (motionEvent.getY() < f4) {
                                    mleVar.n = true;
                                } else {
                                    mleVar.n = false;
                                }
                            } else {
                                f3 = 0.0f;
                                y = 0.0f;
                                while (i3 < pointerCount) {
                                    if (actionIndex != i3) {
                                        x += motionEvent.getX(i3);
                                        y += motionEvent.getY(i3);
                                    }
                                }
                                float f110 = x / f2;
                                f4 = y / f2;
                                f5 = f110;
                            }
                            fAbs = f3;
                            fAbs2 = fAbs;
                            while (i4 < pointerCount) {
                                if (actionIndex != i4) {
                                    fAbs += Math.abs(motionEvent.getX(i4) - f5);
                                    fAbs2 += Math.abs(motionEvent.getY(i4) - f4);
                                }
                            }
                            f6 = fAbs / f2;
                            float f111 = fAbs2 / f2;
                            fHypot = f111 + f111;
                            if (!mleVar.a()) {
                                fHypot = (float) Math.hypot(f6 + f6, fHypot);
                            }
                            z5 = mleVar.f;
                            if (mleVar.a()) {
                                z6 = z5;
                                if (z3) {
                                    mleVar.d = fHypot;
                                    mleVar.e = fHypot;
                                }
                            } else {
                                z6 = z5;
                                if (z3) {
                                    mleVar.d = fHypot;
                                    mleVar.e = fHypot;
                                }
                            }
                            if (mleVar.a()) {
                                i5 = mleVar.g;
                            } else {
                                i5 = mleVar.h;
                            }
                            if (!z6) {
                                if (!z5) {
                                    mleVar.d = fHypot;
                                    mleVar.f = true;
                                } else if (Math.abs(fHypot - mleVar.e) > mleVar.g) {
                                    mleVar.d = fHypot;
                                    mleVar.f = true;
                                }
                            }
                            if (actionMasked == 2) {
                                if (mleVar.f) {
                                    mku mkuVar5 = mleVar.o;
                                    float f112 = mkuVar5.b;
                                    f7 = 1.0f;
                                    if (mleVar.a()) {
                                        if (mleVar.n) {
                                        }
                                        fAbs3 = Math.abs(1.0f - (fHypot / mleVar.d)) * 0.5f;
                                        if (mleVar.d > mleVar.g) {
                                            if (z7) {
                                                f7 = 1.0f + fAbs3;
                                            } else {
                                                f7 = 1.0f - fAbs3;
                                            }
                                        }
                                    } else {
                                        f8 = mleVar.d;
                                        if (f8 > f3) {
                                            f7 = fHypot / f8;
                                        }
                                    }
                                    f9 = f112 * f7;
                                    mkuVar5.b = f9;
                                    mkr mkrVar6 = mkuVar5.a;
                                    view2 = (View) mkrVar6.a.get();
                                    list2 = mkrVar6.l;
                                    if (list2 != null) {
                                        while (r0.hasNext()) {
                                            aslp aslpVarG5 = mpo.g(view2);
                                            aihf aihfVarCreateBuilder5 = aslr.a.createBuilder();
                                            aihfVarCreateBuilder5.copyOnWrite();
                                            aslr aslrVar9 = (aslr) aihfVarCreateBuilder5.instance;
                                            aslrVar9.c |= 1;
                                            aslrVar9.d = f9;
                                            aslr aslrVar10 = (aslr) aihfVarCreateBuilder5.build();
                                            aihh aihhVar5 = (aihh) SenderStateOuterClass$SenderState.a.createBuilder();
                                            aihhVar5.e(aslr.b, aslrVar10);
                                            aihhVar5.e(aslp.b, aslpVarG5);
                                            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState5 = (SenderStateOuterClass$SenderState) aihhVar5.build();
                                            mpo mpoVar5 = (mpo) aclcVar.e;
                                            nry nryVar5 = mpoVar5.b;
                                            CommandOuterClass$Command commandOuterClass$CommandX5 = ((omj) aclcVar.c).x();
                                            ?? r17 = aclcVar.a;
                                            ?? r18 = aclcVar.b;
                                            nsl nslVar5 = (nsl) aclcVar.d;
                                            mpoVar5.i(nryVar5.a(commandOuterClass$CommandX5, mpo.j(view2, null, 8, null, senderStateOuterClass$SenderState5, r17, r18, nslVar5, null)).f(mpoVar5.d.a(nslVar5)).D(), nslVar5);
                                        }
                                    }
                                } else {
                                    mleVar.d = fHypot;
                                }
                            }
                        }
                    } else {
                        if (!mleVar.f) {
                            mleVar.j = motionEvent.getX();
                            mleVar.k = motionEvent.getY();
                            mleVar.l = 2;
                            mleVar.e = 0.0f;
                        }
                        if (actionMasked != 0) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (actionMasked == 6) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            actionIndex = motionEvent.getActionIndex();
                            i2 = pointerCount - 1;
                        } else {
                            actionIndex = -1;
                            i2 = pointerCount;
                        }
                        f2 = i2;
                        if (mleVar.a()) {
                            f5 = mleVar.j;
                            f3 = 0.0f;
                            f4 = mleVar.k;
                            if (motionEvent.getY() < f4) {
                                mleVar.n = true;
                            } else {
                                mleVar.n = false;
                            }
                        } else {
                            f3 = 0.0f;
                            y = 0.0f;
                            while (i3 < pointerCount) {
                                if (actionIndex != i3) {
                                    x += motionEvent.getX(i3);
                                    y += motionEvent.getY(i3);
                                }
                            }
                            float f113 = x / f2;
                            f4 = y / f2;
                            f5 = f113;
                        }
                        fAbs = f3;
                        fAbs2 = fAbs;
                        while (i4 < pointerCount) {
                            if (actionIndex != i4) {
                                fAbs += Math.abs(motionEvent.getX(i4) - f5);
                                fAbs2 += Math.abs(motionEvent.getY(i4) - f4);
                            }
                        }
                        f6 = fAbs / f2;
                        float f114 = fAbs2 / f2;
                        fHypot = f114 + f114;
                        if (!mleVar.a()) {
                            fHypot = (float) Math.hypot(f6 + f6, fHypot);
                        }
                        z5 = mleVar.f;
                        if (mleVar.a()) {
                            z6 = z5;
                            if (z3) {
                                mleVar.d = fHypot;
                                mleVar.e = fHypot;
                            }
                        } else {
                            z6 = z5;
                            if (z3) {
                                mleVar.d = fHypot;
                                mleVar.e = fHypot;
                            }
                        }
                        if (mleVar.a()) {
                            i5 = mleVar.g;
                        } else {
                            i5 = mleVar.h;
                        }
                        if (!z6) {
                            if (!z5) {
                                mleVar.d = fHypot;
                                mleVar.f = true;
                            } else if (Math.abs(fHypot - mleVar.e) > mleVar.g) {
                                mleVar.d = fHypot;
                                mleVar.f = true;
                            }
                        }
                        if (actionMasked == 2) {
                            if (mleVar.f) {
                                mku mkuVar6 = mleVar.o;
                                float f115 = mkuVar6.b;
                                f7 = 1.0f;
                                if (mleVar.a()) {
                                    if (mleVar.n) {
                                    }
                                    fAbs3 = Math.abs(1.0f - (fHypot / mleVar.d)) * 0.5f;
                                    if (mleVar.d > mleVar.g) {
                                        if (z7) {
                                            f7 = 1.0f + fAbs3;
                                        } else {
                                            f7 = 1.0f - fAbs3;
                                        }
                                    }
                                } else {
                                    f8 = mleVar.d;
                                    if (f8 > f3) {
                                        f7 = fHypot / f8;
                                    }
                                }
                                f9 = f115 * f7;
                                mkuVar6.b = f9;
                                mkr mkrVar7 = mkuVar6.a;
                                view2 = (View) mkrVar7.a.get();
                                list2 = mkrVar7.l;
                                if (list2 != null) {
                                    while (r0.hasNext()) {
                                        aslp aslpVarG6 = mpo.g(view2);
                                        aihf aihfVarCreateBuilder6 = aslr.a.createBuilder();
                                        aihfVarCreateBuilder6.copyOnWrite();
                                        aslr aslrVar11 = (aslr) aihfVarCreateBuilder6.instance;
                                        aslrVar11.c |= 1;
                                        aslrVar11.d = f9;
                                        aslr aslrVar12 = (aslr) aihfVarCreateBuilder6.build();
                                        aihh aihhVar6 = (aihh) SenderStateOuterClass$SenderState.a.createBuilder();
                                        aihhVar6.e(aslr.b, aslrVar12);
                                        aihhVar6.e(aslp.b, aslpVarG6);
                                        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState6 = (SenderStateOuterClass$SenderState) aihhVar6.build();
                                        mpo mpoVar6 = (mpo) aclcVar.e;
                                        nry nryVar6 = mpoVar6.b;
                                        CommandOuterClass$Command commandOuterClass$CommandX6 = ((omj) aclcVar.c).x();
                                        ?? r19 = aclcVar.a;
                                        ?? r110 = aclcVar.b;
                                        nsl nslVar6 = (nsl) aclcVar.d;
                                        mpoVar6.i(nryVar6.a(commandOuterClass$CommandX6, mpo.j(view2, null, 8, null, senderStateOuterClass$SenderState6, r19, r110, nslVar6, null)).f(mpoVar6.d.a(nslVar6)).D(), nslVar6);
                                    }
                                }
                            } else {
                                mleVar.d = fHypot;
                            }
                        }
                    }
                }
                mmb mmbVar = (mmb) atomicReference5.get();
                if (mmbVar != null) {
                    mmbVar.f = (View) obj6;
                    int actionMasked2 = motionEvent.getActionMasked();
                    if (actionMasked2 == 1) {
                        i = actionMasked2;
                        z2 = true;
                    } else if (actionMasked2 == 3) {
                        z2 = true;
                        i = 3;
                    } else {
                        i = actionMasked2;
                        z2 = false;
                    }
                    if (z2) {
                        mmbVar.b = null;
                        mmbVar.c = null;
                        if (mmbVar.a) {
                            if (i != 3) {
                                mkr mkrVar8 = (mkr) mmbVar.h.a;
                                view = (View) mkrVar8.a.get();
                                list = mkrVar8.o;
                                if (list != null && view != null) {
                                    for (aclc aclcVar2 : list) {
                                        mpo mpoVar7 = (mpo) aclcVar2.e;
                                        nry nryVar7 = mpoVar7.b;
                                        CommandOuterClass$Command commandOuterClass$CommandX7 = ((omj) aclcVar2.c).x();
                                        ?? r111 = aclcVar2.b;
                                        ?? r112 = aclcVar2.d;
                                        nsl nslVar7 = (nsl) aclcVar2.a;
                                        mpoVar7.i(nryVar7.a(commandOuterClass$CommandX7, mpo.j(view, null, 11, null, null, r111, r112, nslVar7, null)).f(mpoVar7.d.a(nslVar7)).D(), nslVar7);
                                    }
                                }
                            }
                            mmbVar.a = false;
                        }
                        if (!z2) {
                            if (mmbVar.a) {
                                if (motionEvent.getActionMasked() == 2) {
                                    if (motionEvent.getPointerCount() > 1) {
                                        mmbVar.c = Float.valueOf(mmbVar.b(motionEvent));
                                        mmbVar.h.p(mmbVar);
                                    } else if (motionEvent.getPointerCount() != 2) {
                                        if (mmbVar.b == null) {
                                            mmbVar.b = Float.valueOf(mmbVar.b(motionEvent));
                                            mmbVar.c = mmbVar.b;
                                            mmbVar.d = mmbVar.c(motionEvent);
                                        } else if (motionEvent.getActionMasked() == 2) {
                                            fC = mmbVar.c(motionEvent);
                                            if (fC >= mmbVar.e) {
                                                float fB = mmbVar.b(motionEvent);
                                                f = mmbVar.b;
                                                if (f == null) {
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (motionEvent.getPointerCount() != 2) {
                                if (mmbVar.b == null) {
                                    mmbVar.b = Float.valueOf(mmbVar.b(motionEvent));
                                    mmbVar.c = mmbVar.b;
                                    mmbVar.d = mmbVar.c(motionEvent);
                                } else if (motionEvent.getActionMasked() == 2) {
                                    fC = mmbVar.c(motionEvent);
                                    if (fC >= mmbVar.e) {
                                        float fB2 = mmbVar.b(motionEvent);
                                        f = mmbVar.b;
                                        if (f == null && !Float.isNaN(f.floatValue()) && !Float.isNaN(fB2)) {
                                            float fAbs4 = Math.abs(mmbVar.a(mmbVar.b.floatValue(), fB2));
                                            float f20 = mmbVar.d;
                                            if (((float) Math.sqrt(((double) ((fC * fC) + (f20 * f20))) - (((double) ((fC + fC) * f20)) * Math.cos(fAbs4)))) < mmbVar.g) {
                                                z = true;
                                            } else if (fAbs4 * Math.max(fC, mmbVar.d) >= Math.abs(fC - mmbVar.d)) {
                                                mmbVar.h.p(mmbVar);
                                                z = true;
                                                mmbVar.a = true;
                                            } else {
                                                z = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (i == 0) {
                        i = 0;
                        mmbVar.b = null;
                        mmbVar.c = null;
                        if (mmbVar.a) {
                            if (i != 3) {
                                mkr mkrVar9 = (mkr) mmbVar.h.a;
                                view = (View) mkrVar9.a.get();
                                list = mkrVar9.o;
                                if (list != null) {
                                    while (r2.hasNext()) {
                                        mpo mpoVar8 = (mpo) aclcVar2.e;
                                        nry nryVar8 = mpoVar8.b;
                                        CommandOuterClass$Command commandOuterClass$CommandX8 = ((omj) aclcVar2.c).x();
                                        ?? r113 = aclcVar2.b;
                                        ?? r114 = aclcVar2.d;
                                        nsl nslVar8 = (nsl) aclcVar2.a;
                                        mpoVar8.i(nryVar8.a(commandOuterClass$CommandX8, mpo.j(view, null, 11, null, null, r113, r114, nslVar8, null)).f(mpoVar8.d.a(nslVar8)).D(), nslVar8);
                                    }
                                }
                            }
                            mmbVar.a = false;
                        }
                        if (!z2) {
                            if (mmbVar.a) {
                                if (motionEvent.getPointerCount() != 2) {
                                    if (mmbVar.b == null) {
                                        mmbVar.b = Float.valueOf(mmbVar.b(motionEvent));
                                        mmbVar.c = mmbVar.b;
                                        mmbVar.d = mmbVar.c(motionEvent);
                                    } else if (motionEvent.getActionMasked() == 2) {
                                        fC = mmbVar.c(motionEvent);
                                        if (fC >= mmbVar.e) {
                                            float fB3 = mmbVar.b(motionEvent);
                                            f = mmbVar.b;
                                            if (f == null) {
                                            }
                                        }
                                    }
                                }
                            } else if (motionEvent.getActionMasked() == 2) {
                                if (motionEvent.getPointerCount() > 1) {
                                    mmbVar.c = Float.valueOf(mmbVar.b(motionEvent));
                                    mmbVar.h.p(mmbVar);
                                } else if (motionEvent.getPointerCount() != 2) {
                                    if (mmbVar.b == null) {
                                        mmbVar.b = Float.valueOf(mmbVar.b(motionEvent));
                                        mmbVar.c = mmbVar.b;
                                        mmbVar.d = mmbVar.c(motionEvent);
                                    } else if (motionEvent.getActionMasked() == 2) {
                                        fC = mmbVar.c(motionEvent);
                                        if (fC >= mmbVar.e) {
                                            float fB4 = mmbVar.b(motionEvent);
                                            f = mmbVar.b;
                                            if (f == null) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (mmbVar.a) {
                        if (motionEvent.getPointerCount() != 2) {
                            if (mmbVar.b == null) {
                                mmbVar.b = Float.valueOf(mmbVar.b(motionEvent));
                                mmbVar.c = mmbVar.b;
                                mmbVar.d = mmbVar.c(motionEvent);
                            } else if (motionEvent.getActionMasked() == 2) {
                                fC = mmbVar.c(motionEvent);
                                if (fC >= mmbVar.e) {
                                    float fB5 = mmbVar.b(motionEvent);
                                    f = mmbVar.b;
                                    if (f == null) {
                                    }
                                }
                            }
                        }
                    } else if (motionEvent.getActionMasked() == 2) {
                        if (motionEvent.getPointerCount() > 1) {
                            mmbVar.c = Float.valueOf(mmbVar.b(motionEvent));
                            mmbVar.h.p(mmbVar);
                        } else if (motionEvent.getPointerCount() != 2) {
                            if (mmbVar.b == null) {
                                mmbVar.b = Float.valueOf(mmbVar.b(motionEvent));
                                mmbVar.c = mmbVar.b;
                                mmbVar.d = mmbVar.c(motionEvent);
                            } else if (motionEvent.getActionMasked() == 2) {
                                fC = mmbVar.c(motionEvent);
                                if (fC >= mmbVar.e) {
                                    float fB6 = mmbVar.b(motionEvent);
                                    f = mmbVar.b;
                                    if (f == null) {
                                    }
                                }
                            }
                        }
                    }
                    z = true;
                } else {
                    z = true;
                }
                if (nxqVar != null) {
                    nxqVar.a((View) obj6, motionEvent);
                }
                return Boolean.valueOf((motionEvent.getActionMasked() != 0 || mkrVar.f() || mkrVar.j() || mkrVar.c() || mkrVar.i() || mkrVar.d() || mkrVar.h() || mkrVar.g() || !mkrVar.k()) ? false : z);
            case -1270658234:
                isw iswVar2 = (isw) obj;
                fiu fiuVar5 = fipVar.b;
                fhd fhdVar3 = (fhd) fipVar.d[0];
                Object obj8 = iswVar2.b;
                Object obj9 = iswVar2.a;
                mkr mkrVar10 = ((mkp) fhdVar3.i().c).b;
                mkrVar10.a = new WeakReference(obj8);
                MotionEvent motionEvent2 = (MotionEvent) obj9;
                int actionMasked3 = motionEvent2.getActionMasked();
                if (actionMasked3 == 0) {
                    pointerId = motionEvent2.getPointerId(motionEvent2.getActionIndex());
                    if (mkrVar10.p == null) {
                        mkrVar10.p = Integer.valueOf(pointerId);
                        list3 = mkrVar10.b;
                        if (list3 != null) {
                            it = list3.iterator();
                            while (it.hasNext()) {
                                ((ntn) it.next()).a((View) obj8, new nxg(motionEvent2.getX(), motionEvent2.getY()));
                            }
                        }
                    }
                } else {
                    if (actionMasked3 == 1) {
                        List<aclc> list7 = mkrVar10.j;
                        if (list7 != null && mkrVar10.q != null) {
                            for (aclc aclcVar3 : list7) {
                                nxg nxgVar2 = new nxg(motionEvent2.getX(), motionEvent2.getY());
                                View view3 = (View) obj8;
                                aslp aslpVarG7 = mpo.g(view3);
                                aihh aihhVar7 = (aihh) SenderStateOuterClass$SenderState.a.createBuilder();
                                aihhVar7.e(aslp.b, aslpVarG7);
                                SenderStateOuterClass$SenderState senderStateOuterClass$SenderState7 = (SenderStateOuterClass$SenderState) aihhVar7.build();
                                mpo mpoVar9 = (mpo) aclcVar3.e;
                                nry nryVar9 = mpoVar9.b;
                                CommandOuterClass$Command commandOuterClass$CommandX9 = ((omj) aclcVar3.c).x();
                                ?? r115 = aclcVar3.a;
                                ?? r8 = aclcVar3.b;
                                nsl nslVar9 = (nsl) aclcVar3.d;
                                mpoVar9.i(nryVar9.a(commandOuterClass$CommandX9, mpo.j(view3, null, 6, nxgVar2, senderStateOuterClass$SenderState7, r115, r8, nslVar9, null)).f(mpoVar9.d.a(nslVar9)).D(), nslVar9);
                            }
                        }
                        mkrVar10.q = null;
                    } else if (actionMasked3 == 2) {
                        int pointerId2 = motionEvent2.getPointerId(motionEvent2.getActionIndex());
                        if (mkrVar10.d != null && (num = mkrVar10.p) != null && num.equals(Integer.valueOf(pointerId2))) {
                            for (aclc aclcVar4 : mkrVar10.d) {
                                nxg nxgVar3 = new nxg(motionEvent2.getX(), motionEvent2.getY());
                                mpo mpoVar10 = (mpo) aclcVar4.e;
                                nry nryVar10 = mpoVar10.b;
                                CommandOuterClass$Command commandOuterClass$CommandX10 = ((omj) aclcVar4.c).x();
                                View view4 = (View) obj8;
                                SenderStateOuterClass$SenderState senderStateOuterClass$SenderStateH = mpo.h(nxgVar3, view4.getContext().getResources().getDisplayMetrics(), mpoVar10.c ? mpo.g(view4) : null);
                                ?? r116 = aclcVar4.b;
                                ?? r6 = aclcVar4.d;
                                nsl nslVar10 = (nsl) aclcVar4.a;
                                mpoVar10.i(nryVar10.a(commandOuterClass$CommandX10, mpo.j(view4, null, 17, nxgVar3, senderStateOuterClass$SenderStateH, r116, r6, nslVar10, null)).f(mpoVar10.d.a(nslVar10)).D(), nslVar10);
                            }
                        }
                    } else if (actionMasked3 == 3) {
                        mkrVar10.p = null;
                        List list8 = mkrVar10.g;
                        if (list8 != null) {
                            Iterator it5 = list8.iterator();
                            while (it5.hasNext()) {
                                ((ntm) it5.next()).a((View) obj8);
                            }
                        }
                    } else if (actionMasked3 == 5) {
                        pointerId = motionEvent2.getPointerId(motionEvent2.getActionIndex());
                        if (mkrVar10.p == null) {
                            mkrVar10.p = Integer.valueOf(pointerId);
                            list3 = mkrVar10.b;
                            if (list3 != null) {
                                it = list3.iterator();
                                while (it.hasNext()) {
                                    ((ntn) it.next()).a((View) obj8, new nxg(motionEvent2.getX(), motionEvent2.getY()));
                                }
                            }
                        }
                    } else if (actionMasked3 == 6) {
                    }
                    int pointerId3 = motionEvent2.getPointerId(motionEvent2.getActionIndex());
                    Integer num2 = mkrVar10.p;
                    if (num2 != null && num2.equals(Integer.valueOf(pointerId3))) {
                        mkrVar10.p = null;
                        List list9 = mkrVar10.c;
                        if (list9 != null) {
                            Iterator it6 = list9.iterator();
                            while (it6.hasNext()) {
                                ((nto) it6.next()).a((View) obj8, new nxg(motionEvent2.getX(), motionEvent2.getY()));
                            }
                        }
                    }
                }
                obj2 = null;
                return obj2;
            case -1236836200:
                fiu fiuVar6 = fipVar.b;
                fhd fhdVar4 = (fhd) fipVar.d[0];
                Object obj10 = ((yx) obj).a;
                mkp mkpVar3 = (mkp) fhdVar4.i().c;
                List<aclc> list10 = ((mkq) fiuVar6).c;
                AtomicReference atomicReference8 = mkpVar3.h;
                if (list10 != null) {
                    nxg nxgVar4 = (nxg) atomicReference8.get();
                    for (aclc aclcVar5 : list10) {
                        mpo mpoVar11 = (mpo) aclcVar5.e;
                        nry nryVar11 = mpoVar11.b;
                        CommandOuterClass$Command commandOuterClass$CommandX11 = ((omj) aclcVar5.c).x();
                        ?? r117 = aclcVar5.b;
                        ?? r7 = aclcVar5.d;
                        nsl nslVar11 = (nsl) aclcVar5.a;
                        mpoVar11.i(nryVar11.a(commandOuterClass$CommandX11, mpo.j((View) obj10, null, 4, nxgVar4, null, r117, r7, nslVar11, null)).f(mpoVar11.d.a(nslVar11)).D(), nslVar11);
                        zA = true;
                    }
                }
                return Boolean.valueOf(zA);
            case -1048037474:
                gzj.bO((fhd) fipVar.d[0], (isw) obj);
                return null;
            case -843172861:
                acb acbVar = (acb) obj;
                fiu fiuVar7 = fipVar.b;
                fhd fhdVar5 = (fhd) fipVar.d[0];
                Object obj11 = acbVar.b;
                int i7 = acbVar.a;
                Object obj12 = acbVar.d;
                Object obj13 = acbVar.c;
                mkq mkqVar = (mkq) fiuVar7;
                mkp mkpVar4 = (mkp) fhdVar5.i().c;
                mkr mkrVar11 = mkpVar4.b;
                boolean z11 = mkqVar.r;
                List list11 = mkqVar.E;
                List list12 = mkqVar.y;
                AtomicReference atomicReference9 = mkpVar4.h;
                AtomicReference atomicReference10 = mkpVar4.f;
                if (mkrVar11.c() || !mkrVar11.l(z11) || !mkrVar11.e()) {
                    zPerformAccessibilityAction = false;
                } else if (i7 != 16) {
                    if (i7 == 32) {
                        i6 = i7;
                    } else if (mkrVar11.f()) {
                        if (list12 != null) {
                            nxgVar = (nxg) atomicReference9.get();
                            it2 = list12.iterator();
                            zPerformAccessibilityAction = false;
                            while (it2.hasNext()) {
                                zPerformAccessibilityAction |= ((ntj) it2.next()).a((View) obj11, nxgVar);
                            }
                        } else {
                            zPerformAccessibilityAction = false;
                        }
                    }
                    zPerformAccessibilityAction = ((axx) obj13).performAccessibilityAction((View) obj11, i6, (Bundle) obj12);
                } else if (!mkrVar11.j()) {
                    i7 = 16;
                    if (i7 == 32) {
                        i6 = i7;
                    } else if (mkrVar11.f()) {
                        if (list12 != null) {
                            nxgVar = (nxg) atomicReference9.get();
                            it2 = list12.iterator();
                            zPerformAccessibilityAction = false;
                            while (it2.hasNext()) {
                                zPerformAccessibilityAction |= ((ntj) it2.next()).a((View) obj11, nxgVar);
                            }
                        } else {
                            zPerformAccessibilityAction = false;
                        }
                    }
                    zPerformAccessibilityAction = ((axx) obj13).performAccessibilityAction((View) obj11, i6, (Bundle) obj12);
                } else if (list11 != null) {
                    Iterator it7 = list11.iterator();
                    while (it7.hasNext()) {
                        ((ntl) it7.next()).a((View) obj11, (nxg) atomicReference9.get(), (MotionEvent) atomicReference10.get());
                    }
                } else {
                    zPerformAccessibilityAction = false;
                }
                return Boolean.valueOf(zPerformAccessibilityAction);
            case -708308421:
                fiu fiuVar8 = fipVar.b;
                fhd fhdVar6 = (fhd) fipVar.d[0];
                Object obj14 = ((isw) obj).a;
                mkp mkpVar5 = (mkp) fhdVar6.i().c;
                List<aclc> list13 = ((mkq) fiuVar8).v;
                AtomicReference atomicReference11 = mkpVar5.h;
                if (list13 != null) {
                    nxg nxgVar5 = (nxg) atomicReference11.get();
                    for (aclc aclcVar6 : list13) {
                        mpo mpoVar12 = (mpo) aclcVar6.e;
                        nry nryVar12 = mpoVar12.b;
                        CommandOuterClass$Command commandOuterClass$CommandX12 = ((omj) aclcVar6.c).x();
                        ?? r118 = aclcVar6.a;
                        ?? r20 = aclcVar6.b;
                        nsl nslVar12 = (nsl) aclcVar6.d;
                        mpoVar12.i(nryVar12.a(commandOuterClass$CommandX12, mpo.j((View) obj14, null, 22, nxgVar5, null, r118, r20, nslVar12, null)).f(mpoVar12.d.a(nslVar12)).D(), nslVar12);
                        zA = true;
                    }
                }
                return Boolean.valueOf(zA);
            case 71235917:
                fiu fiuVar9 = fipVar.b;
                fhd fhdVar7 = (fhd) fipVar.d[0];
                Object obj15 = ((abk) obj).a;
                mkp mkpVar6 = (mkp) fhdVar7.i().c;
                List list14 = ((mkq) fiuVar9).y;
                AtomicReference atomicReference12 = mkpVar6.h;
                if (list14 != null) {
                    nxg nxgVar6 = (nxg) atomicReference12.get();
                    Iterator it8 = list14.iterator();
                    while (it8.hasNext()) {
                        zA |= ((ntj) it8.next()).a((View) obj15, nxgVar6);
                    }
                }
                return Boolean.valueOf(zA);
            case 466811311:
                acv acvVar = (acv) obj;
                fiu fiuVar10 = fipVar.b;
                fhd fhdVar8 = (fhd) fipVar.d[0];
                Object obj16 = acvVar.c;
                Object obj17 = acvVar.b;
                Object obj18 = acvVar.a;
                mkq mkqVar2 = (mkq) fiuVar10;
                mkr mkrVar12 = ((mkp) fhdVar8.i().c).b;
                ntf ntfVar = mkqVar2.a;
                boolean z12 = mkqVar2.r;
                bbz bbzVar = (bbz) obj18;
                View view5 = (View) obj17;
                ((axx) obj16).onInitializeAccessibilityNodeInfo(view5, bbzVar);
                if (ntfVar != null) {
                    bbzVar.s(true);
                    bbzVar.u(ntfVar.a);
                    String str = ntfVar.b;
                    if (str != null) {
                        bac.t(view5, str);
                    }
                }
                if (!mkrVar12.c() && mkrVar12.l(z12) && mkrVar12.e()) {
                    if (mkrVar12.j()) {
                        bbzVar.k(bby.a);
                    }
                    if (mkrVar12.f()) {
                        bbzVar.k(bby.b);
                    }
                }
                obj2 = null;
                return obj2;
            case 1110660298:
                isw iswVar3 = (isw) obj;
                fiu fiuVar11 = fipVar.b;
                fhd fhdVar9 = (fhd) fipVar.d[0];
                Object obj19 = iswVar3.b;
                Object obj20 = iswVar3.a;
                mkq mkqVar3 = (mkq) fiuVar11;
                mkp mkpVar7 = (mkp) fhdVar9.i().c;
                List list15 = mkqVar3.J;
                List list16 = mkqVar3.s;
                AtomicBoolean atomicBoolean = mkpVar7.c;
                if (list16 != null && atomicBoolean.getAndSet(false)) {
                    Iterator it9 = list16.iterator();
                    while (it9.hasNext()) {
                        ((ntp) it9.next()).d(null, null);
                    }
                }
                if (list15 != null) {
                    Iterator it10 = list15.iterator();
                    while (it10.hasNext()) {
                        ((ntp) it10.next()).d(null, null);
                    }
                }
                obj2 = null;
                return obj2;
            case 1501181275:
                fiu fiuVar12 = fipVar.b;
                fhd fhdVar10 = (fhd) fipVar.d[0];
                Object obj21 = ((isw) obj).a;
                mkp mkpVar8 = (mkp) fhdVar10.i().c;
                List<aclc> list17 = ((mkq) fiuVar12).w;
                AtomicReference atomicReference13 = mkpVar8.h;
                if (list17 != null) {
                    nxg nxgVar7 = (nxg) atomicReference13.get();
                    for (aclc aclcVar7 : list17) {
                        mpo mpoVar13 = (mpo) aclcVar7.e;
                        nry nryVar13 = mpoVar13.b;
                        CommandOuterClass$Command commandOuterClass$CommandX13 = ((omj) aclcVar7.c).x();
                        ?? r119 = aclcVar7.a;
                        ?? r21 = aclcVar7.b;
                        nsl nslVar13 = (nsl) aclcVar7.d;
                        mpoVar13.i(nryVar13.a(commandOuterClass$CommandX13, mpo.j((View) obj21, null, 23, nxgVar7, null, r119, r21, nslVar13, null)).f(mpoVar13.d.a(nslVar13)).D(), nslVar13);
                        zA = true;
                    }
                }
                return Boolean.valueOf(zA);
            case 1803022739:
                ahfi ahfiVar = (ahfi) obj;
                fiu fiuVar13 = fipVar.b;
                fhd fhdVar11 = (fhd) fipVar.d[0];
                Object obj22 = ahfiVar.c;
                Object obj23 = ahfiVar.b;
                mkq mkqVar4 = (mkq) fiuVar13;
                mkp mkpVar9 = (mkp) fhdVar11.i().c;
                List list18 = mkqVar4.J;
                List list19 = mkqVar4.s;
                AtomicBoolean atomicBoolean2 = mkpVar9.c;
                if (mkqVar4.q) {
                    View view6 = (View) obj22;
                    view6.post(new brc(list19, atomicBoolean2, view6, (View) obj23, list18, 5));
                } else {
                    if (list19 != null && atomicBoolean2.getAndSet(false)) {
                        Iterator it11 = list19.iterator();
                        while (it11.hasNext()) {
                            ((ntp) it11.next()).d((View) obj22, (View) obj23);
                        }
                    }
                    if (list18 != null) {
                        Iterator it12 = list18.iterator();
                        while (it12.hasNext()) {
                            ((ntp) it12.next()).d((View) obj22, (View) obj23);
                        }
                    }
                }
                obj2 = null;
                return obj2;
            default:
                obj2 = null;
                return obj2;
        }
    }

    @Override // defpackage.fgy
    public final void G(fhd fhdVar) {
        AtomicBoolean atomicBoolean;
        mkp mkpVarAE = aE(fhdVar);
        boolean z = this.r;
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
        mkr mkrVar = new mkr();
        AtomicReference atomicReference = new AtomicReference(null);
        AtomicReference atomicReference2 = new AtomicReference(null);
        AtomicReference atomicReference3 = new AtomicReference(null);
        AtomicReference atomicReference4 = new AtomicReference(null);
        AtomicReference atomicReference5 = new AtomicReference(null);
        if (z) {
            atomicBoolean = new AtomicBoolean(fhdVar.b().getSystemService("accessibility") != null);
        } else {
            atomicBoolean = new AtomicBoolean(false);
        }
        mkpVarAE.c = atomicBoolean2;
        mkpVarAE.d = atomicReference;
        mkpVarAE.a = atomicReference2;
        mkpVarAE.g = atomicReference3;
        mkpVarAE.b = mkrVar;
        mkpVarAE.h = atomicReference4;
        mkpVarAE.f = atomicReference5;
        mkpVarAE.e = atomicBoolean;
    }

    @Override // defpackage.fgy
    public final void I(fhd fhdVar) {
        mkp mkpVar = (mkp) fhdVar.i().c;
        mkr mkrVar = mkpVar.b;
        AtomicReference atomicReference = mkpVar.d;
        AtomicReference atomicReference2 = mkpVar.a;
        AtomicReference atomicReference3 = mkpVar.g;
        boolean z = this.r;
        hbf hbfVar = (hbf) atomicReference.get();
        if (hbfVar == null) {
            hbf hbfVar2 = new hbf(fhdVar.a, new mkt(mkrVar, z), new Handler(Looper.getMainLooper()));
            atomicReference.set(hbfVar2);
            hbfVar = hbfVar2;
        }
        hbfVar.e(mkrVar.c() ? new mks(mkrVar) : null);
        Context context = fhdVar.a;
        if (((mle) atomicReference2.get()) == null) {
            mle mleVar = new mle(context, new mku(mkrVar), new Handler(Looper.getMainLooper()));
            atomicReference2.set(mleVar);
            int i = context.getApplicationInfo().targetSdkVersion;
            if (i > 18) {
                mleVar.b = true;
                if (mleVar.m == null) {
                    mleVar.m = new GestureDetector(mleVar.a, new mld(mleVar), mleVar.i);
                }
            }
            if (i > 22) {
                mleVar.c = true;
            }
        }
        if (((mmb) atomicReference3.get()) == null) {
            atomicReference3.set(new mmb(new kjc(mkrVar), (int) (40.0f / context.getResources().getDisplayMetrics().density), ViewConfiguration.get(context).getScaledTouchSlop()));
        }
    }

    @Override // defpackage.fgy
    public final void K(fhd fhdVar) {
        mkr mkrVar = aE(fhdVar).b;
        List<mpt> list = this.d;
        if (list != null) {
            for (mpt mptVar : list) {
                if (mptVar.a) {
                    WeakReference weakReference = mptVar.b;
                    View view = weakReference != null ? (View) weakReference.get() : null;
                    if (view != null) {
                        WeakReference weakReference2 = mptVar.c;
                        ket.K(view, weakReference2 != null ? (View) weakReference2.get() : null);
                    }
                }
                mptVar.b();
            }
        }
        mkrVar.b = null;
        mkrVar.c = null;
        mkrVar.d = null;
        mkrVar.e = null;
        mkrVar.f = null;
        mkrVar.g = null;
        mkrVar.h = null;
        mkrVar.i = null;
        mkrVar.j = null;
        mkrVar.k = null;
        mkrVar.l = null;
        mkrVar.m = null;
        mkrVar.n = null;
        mkrVar.o = null;
        mkrVar.a = new WeakReference(null);
    }

    @Override // defpackage.fgy
    public final void N(fky fkyVar, fky fkyVar2) {
        mkp mkpVar = (mkp) fkyVar;
        mkp mkpVar2 = (mkp) fkyVar2;
        mkpVar2.a = mkpVar.a;
        mkpVar2.b = mkpVar.b;
        mkpVar2.c = mkpVar.c;
        mkpVar2.d = mkpVar.d;
        mkpVar2.e = mkpVar.e;
        mkpVar2.f = mkpVar.f;
        mkpVar2.g = mkpVar.g;
        mkpVar2.h = mkpVar.h;
    }

    @Override // defpackage.fgy
    public final boolean P() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean S() {
        return true;
    }

    @Override // defpackage.fkx
    protected final fgy aC(fhd fhdVar) {
        mkp mkpVar = (mkp) fhdVar.i().c;
        fgy fgyVar = this.b;
        List list = this.s;
        List list2 = this.J;
        boolean z = this.x;
        List list3 = this.u;
        mkr mkrVar = mkpVar.b;
        List list4 = this.E;
        List list5 = this.G;
        List list6 = this.I;
        List list7 = this.H;
        List list8 = this.e;
        List list9 = this.g;
        List list10 = this.f;
        List list11 = this.D;
        List list12 = this.C;
        List list13 = this.B;
        List list14 = this.A;
        List list15 = this.z;
        List list16 = this.F;
        List list17 = this.y;
        List list18 = this.c;
        List list19 = this.v;
        List list20 = this.w;
        ntf ntfVar = this.a;
        boolean z2 = this.r;
        AtomicBoolean atomicBoolean = mkpVar.e;
        int i = fmd.b;
        fmc fmcVar = new fmc(fhdVar, new fmd());
        fmcVar.c(fgyVar);
        mkrVar.b = list5;
        mkrVar.c = list6;
        mkrVar.d = list7;
        mkrVar.e = list4;
        mkrVar.f = list8;
        mkrVar.g = list16;
        mkrVar.h = list17;
        mkrVar.i = list9;
        mkrVar.j = list10;
        mkrVar.k = list11;
        mkrVar.l = list12;
        mkrVar.m = list13;
        mkrVar.n = list14;
        mkrVar.o = list15;
        if (mkrVar.k() || mkrVar.e()) {
            fmcVar.V(o(mkq.class, "ElementEventWithGesture", fhdVar, -1336101728, new Object[]{fhdVar}));
        }
        if (mkrVar.k() || mkrVar.d()) {
            fmcVar.b.k().F().n(o(mkq.class, "ElementEventWithGesture", fhdVar, -1270658234, new Object[]{fhdVar}));
        }
        if (mkrVar.e()) {
            fmcVar.b.k().F().i(true);
        }
        if (mkrVar.l(z2)) {
            fmcVar.b.k().F().v(true);
        }
        if (!mkrVar.l(z2) && !mkrVar.c()) {
            if (mkrVar.j()) {
                fmcVar.q(o(mkq.class, "ElementEventWithGesture", fhdVar, -1351902487, new Object[]{fhdVar}));
            }
            if (mkrVar.f()) {
                fmcVar.b.k().F().u(o(mkq.class, "ElementEventWithGesture", fhdVar, 71235917, new Object[]{fhdVar}));
            }
        }
        if (list18 != null) {
            fmcVar.b.k().F().m(o(mkq.class, "ElementEventWithGesture", fhdVar, -1236836200, new Object[]{fhdVar}));
        }
        if (list19 != null) {
            fmcVar.b.k().F().r(o(mkq.class, "ElementEventWithGesture", fhdVar, -708308421, new Object[]{fhdVar}));
        }
        if (list20 != null) {
            fmcVar.b.k().F().s(o(mkq.class, "ElementEventWithGesture", fhdVar, 1501181275, new Object[]{fhdVar}));
        }
        if (list2 != null || list != null) {
            if (z) {
                o(mkq.class, "ElementEventWithGesture", fhdVar, 1110660298, new Object[]{fhdVar});
                fmcVar.b.k().D().a |= 1073741824;
            } else {
                fmcVar.I(o(mkq.class, "ElementEventWithGesture", fhdVar, 1803022739, new Object[]{fhdVar}));
            }
        }
        if (list3 != null) {
            fip fipVarO = o(mkq.class, "ElementEventWithGesture", fhdVar, -1932591986, new Object[]{fhdVar});
            fgt fgtVarD = fmcVar.b.k().D();
            fgtVarD.a |= 64;
            fgtVarD.c = fipVarO;
        }
        boolean z3 = atomicBoolean.get() && mkrVar.l(z2) && mkrVar.e();
        if (z3 || ntfVar != null) {
            fmcVar.S(o(mkq.class, "ElementEventWithGesture", fhdVar, 466811311, new Object[]{fhdVar}));
            if (z3) {
                fmcVar.b.k().F().y(o(mkq.class, "ElementEventWithGesture", fhdVar, -843172861, new Object[]{fhdVar}));
            }
        }
        return fmcVar.a();
    }

    @Override // defpackage.fgy
    public final /* bridge */ /* synthetic */ fgy l() {
        mkq mkqVar = (mkq) super.l();
        fgy fgyVar = mkqVar.b;
        mkqVar.b = fgyVar != null ? fgyVar.l() : null;
        return mkqVar;
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fky u() {
        return new mkp();
    }
}
