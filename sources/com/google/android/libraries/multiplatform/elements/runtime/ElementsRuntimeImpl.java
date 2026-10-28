package com.google.android.libraries.multiplatform.elements.runtime;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.elements.adl.UpbArena;
import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.interfaces.ClientDataObservable;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner;
import com.google.net.util.proto2api.Status$StatusProto;
import com.google.protobuf.ExtensionRegistryLite;
import defpackage.a;
import defpackage.adfs;
import defpackage.aga;
import defpackage.agfr;
import defpackage.agfu;
import defpackage.agp;
import defpackage.aguu;
import defpackage.aihn;
import defpackage.aiik;
import defpackage.ainb;
import defpackage.aslh;
import defpackage.atcd;
import defpackage.atcm;
import defpackage.atkx;
import defpackage.atmd;
import defpackage.atmk;
import defpackage.atoc;
import defpackage.hol;
import defpackage.ksy;
import defpackage.mew;
import defpackage.mhb;
import defpackage.oos;
import defpackage.oov;
import defpackage.ooy;
import defpackage.ooz;
import defpackage.oph;
import defpackage.opi;
import defpackage.opq;
import defpackage.orp;
import defpackage.oui;
import defpackage.ovf;
import defpackage.ovs;
import defpackage.oyk;
import defpackage.qcb;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ElementsRuntimeImpl implements Choreographer.FrameCallback, oov, opi {
    public static final /* synthetic */ int m = 0;
    private static final oph n = oph.a;
    private static final long[] o = new long[0];
    private static int p = 0;
    public final long a;
    public final ElementsServices c;
    public oos i;
    public final RuntimeSharedBuffer j;
    public qcb l;
    private final AtomicBoolean q = new AtomicBoolean();
    private final AtomicBoolean r = new AtomicBoolean();
    private final Set s = new HashSet();
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final agp d = new agp(5);
    public final agp e = new agp(6);
    public final agp f = new agp(6);
    public final agp g = new agp(6);
    public final agp h = new agp(6);
    public final ovs k = new ovs();

    public ElementsRuntimeImpl(ElementsServices elementsServices) {
        this.c = elementsServices;
        this.i = elementsServices.k();
        long jJniCreateRuntime = jniCreateRuntime();
        this.a = jJniCreateRuntime;
        this.j = new RuntimeSharedBuffer(jniGetSharedBuffer(jJniCreateRuntime));
    }

    public static synchronized int e() {
        int iGenerateViewId;
        iGenerateViewId = p;
        if (iGenerateViewId == 0) {
            iGenerateViewId = View.generateViewId();
            p = iGenerateViewId;
        }
        return iGenerateViewId;
    }

    private void handleEvents(long j, int[] iArr, int i, long j2) {
        Object objF = f(j, iArr, i);
        if (objF instanceof NodeViewInterface) {
            ((NodeViewInterface) objF).U();
        } else if (objF instanceof PaintUnit) {
            ((PaintUnit) objF).A();
        }
    }

    public static boolean i(mew mewVar) {
        return (mewVar.e(atcd.d) || mewVar.e(atmd.d)) ? false : true;
    }

    private static native boolean jniAddAnimatingProcessor(long j, long j2);

    public static native void jniAttachNodeTreeProcessor(long j, long j2, boolean z, int i, int i2, int i3, int i4, int i5, int i6);

    private native long jniCreateRuntime();

    private static native void jniDeleteRuntime(long j);

    public static native void jniDetachNodeTreeProcessor(long j, long j2);

    private static native long[] jniGetAndClearAnimatingProcessors(long j);

    private static native long[] jniGetDirtyNodeTreeHandles(long j);

    private static native long jniGetInstanceCount();

    private static native long jniGetSharedBuffer(long j);

    public static native void jniInitializeDesignSystem(long j, int i);

    private static native void jniSetEnableProminenceForGroup(long j, String str, boolean z);

    private static native void jniSetOcclusionEdge(long j, int i, int i2, String str);

    private static native void jniWaitForAllProcessorsToClose(long j);

    private void logInteractionEvents(long j, long j2, long[] jArr, long[] jArr2, long[] jArr3) throws Throwable {
        NodeTreeProcessor nodeTreeProcessor;
        agp agpVar = this.e;
        synchronized (agpVar) {
            nodeTreeProcessor = (NodeTreeProcessor) agpVar.a(j);
        }
        final ArrayList arrayList = new ArrayList();
        if (nodeTreeProcessor != null) {
            UpbArena upbArena = null;
            try {
                agfr agfrVar = nodeTreeProcessor.l().e;
                if (agfrVar != null) {
                    UpbArena upbArenaA = UpbArena.a(j2);
                    for (int i = 0; i < jArr.length; i++) {
                        try {
                            arrayList.add(Pair.create(new mew(new UpbMessage(jArr[i], ainb.a, upbArenaA)), new mew(ksy.aB(jArr3[i], atkx.a, jArr2[i]), (float[]) null)));
                        } catch (Throwable th) {
                            th = th;
                            upbArena = upbArenaA;
                        }
                    }
                    final adfs adfsVar = (adfs) agfrVar.io();
                    final SparseArray sparseArrayI = nodeTreeProcessor.i();
                    if (!arrayList.isEmpty()) {
                        adfsVar.a.z(new Consumer() { // from class: adfr
                            /* JADX WARN: Code duplicated, block: B:106:0x01a8 A[PHI: r2
                              0x01a8: PHI (r2v8 com.google.android.libraries.elements.adl.UpbArena) = 
                              (r2v3 com.google.android.libraries.elements.adl.UpbArena)
                              (r2v11 com.google.android.libraries.elements.adl.UpbArena)
                              (r2v11 com.google.android.libraries.elements.adl.UpbArena)
                             binds: [B:94:0x0171, B:99:0x0186, B:101:0x0194] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Code duplicated, block: B:163:0x02af  */
                            /* JADX WARN: Code duplicated, block: B:165:0x02b5  */
                            /* JADX WARN: Code duplicated, block: B:168:0x02d0  */
                            /* JADX WARN: Code duplicated, block: B:170:0x02da  */
                            /* JADX WARN: Code duplicated, block: B:171:0x02e5  */
                            /* JADX WARN: Code duplicated, block: B:173:0x02f3  */
                            /* JADX WARN: Code duplicated, block: B:178:0x0300  */
                            /* JADX WARN: Code duplicated, block: B:183:0x031c  */
                            /* JADX WARN: Code duplicated, block: B:185:0x0320  */
                            /* JADX WARN: Code duplicated, block: B:186:0x0324  */
                            /* JADX WARN: Code duplicated, block: B:218:0x0382 A[SYNTHETIC] */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.function.Consumer
                            /* JADX INFO: renamed from: accept */
                            public final void r(Object obj) {
                                int i2;
                                Iterator it;
                                boolean z;
                                xgz xgzVarB;
                                boolean z2;
                                int iPeekInt;
                                long j3;
                                xgz xgzVar;
                                xgz xgzVarD;
                                aryh aryhVar;
                                amdd amddVarH;
                                xgz xgzVarC;
                                xgz xgzVarB2;
                                xgz xgzVarD2;
                                int i3;
                                mew mewVar;
                                adfs adfsVar2 = adfsVar;
                                aaok aaokVar = (aaok) obj;
                                UpbArena upbArena2 = (!adfsVar2.c || adfsVar2.d) ? null : new UpbArena();
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    Pair pair = (Pair) it2.next();
                                    int iPeekInt2 = Memory.peekInt(((mew) pair.first).c + 20, false);
                                    int i4 = 3;
                                    if (iPeekInt2 == 0) {
                                        i2 = 1;
                                    } else if (iPeekInt2 == 1) {
                                        i2 = 2;
                                    } else if (iPeekInt2 != 2) {
                                        i2 = iPeekInt2 != 3 ? 0 : 4;
                                    } else {
                                        i2 = 3;
                                    }
                                    if (i2 == 0) {
                                        i2 = 5;
                                    }
                                    SparseArray sparseArray = sparseArrayI;
                                    int i5 = i2 - 1;
                                    if (i5 == 1) {
                                        it = it2;
                                        mew mewVar2 = (mew) pair.first;
                                        mew mewVar3 = (mew) pair.second;
                                        int iPeekInt3 = Memory.peekInt(mewVar2.c + 12, false);
                                        if (adfsVar2.d(iPeekInt3, sparseArray) == null) {
                                            mep mepVar = aryv.d;
                                            if (mewVar3.e(mepVar)) {
                                                upbArena2 = adfsVar2.a(upbArena2);
                                                aryv aryvVar = upbArena2 != null ? (aryv) ksy.aE(mewVar3, mepVar, upbArena2) : (aryv) mewVar3.d(mepVar);
                                                if (aryvVar != null) {
                                                    xgzVarB = adfsVar2.b(iPeekInt3, aryvVar, sparseArray);
                                                    mep mepVar2 = aryr.a;
                                                    if (aryvVar.e(mepVar2) && (aryhVar = (aryh) aryvVar.d(mepVar2)) != null && aryhVar.aR()) {
                                                        z = 1;
                                                        if (xgzVarB != null) {
                                                            j3 = mewVar2.c;
                                                            if ((Memory.peekByte(8 + j3) & 2) != 0 || (xgzVarD = adfsVar2.d(Memory.peekInt(j3 + 16, false), sparseArray)) == null) {
                                                                xgzVar = adfsVar2.e;
                                                                if (xgzVar != null) {
                                                                    aaokVar.i(xgzVarB, xgzVar);
                                                                } else {
                                                                    ((xgo) aaokVar.a).g((xgt) aaokVar.c, xgzVarB.c(), (xie) aaokVar.b);
                                                                }
                                                                aihf aihfVarCreateBuilder = amdd.a.createBuilder();
                                                                aihf aihfVarCreateBuilder2 = amda.a.createBuilder();
                                                                aihfVarCreateBuilder2.copyOnWrite();
                                                                amda amdaVar = (amda) aihfVarCreateBuilder2.instance;
                                                                amdaVar.b = amdaVar.b | z ? 1 : 0;
                                                                amdaVar.c = z;
                                                                aihfVarCreateBuilder.copyOnWrite();
                                                                amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
                                                                amda amdaVar2 = (amda) aihfVarCreateBuilder2.build();
                                                                amdaVar2.getClass();
                                                                amddVar.x = amdaVar2;
                                                                amddVar.d |= 8;
                                                                ((xgo) aaokVar.a).o((xgt) aaokVar.c, xgzVarB.c(), (amdd) aihfVarCreateBuilder.build(), (xie) aaokVar.b);
                                                            } else {
                                                                aaokVar.i(xgzVarB, xgzVarD);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                mep mepVar3 = atkf.d;
                                                if (mewVar3.e(mepVar3)) {
                                                    upbArena2 = adfsVar2.a(upbArena2);
                                                    atkf atkfVar = upbArena2 != null ? (atkf) ksy.aE(mewVar3, mepVar3, upbArena2) : (atkf) mewVar3.d(mepVar3);
                                                    if (atkfVar != null) {
                                                        xgz xgzVarC2 = adfsVar2.c(iPeekInt3, atkfVar, sparseArray);
                                                        if (adfs.g(atkfVar) && xgzVarC2 != null) {
                                                            if ((Memory.peekByte(atkfVar.c + 8) & 1) != 0) {
                                                                aryh aryhVarAR = adfs.e(atkfVar).aR();
                                                                if (aryhVarAR != null && aryhVarAR.aR()) {
                                                                    if ((Memory.peekByte(aryhVarAR.aS().c + 8) & 1) != 0) {
                                                                        iPeekInt = Memory.peekInt(aryhVarAR.aS().c + 12, false);
                                                                    }
                                                                    if (iPeekInt != -1) {
                                                                        if (adfs.f(atkfVar)) {
                                                                            iPeekInt3 = Memory.peekInt(adfs.e(atkfVar).aR().aS().c + 16, false);
                                                                        }
                                                                        xgn xgnVar = adfsVar2.a;
                                                                        z2 = true;
                                                                        if (atkfVar.f == null) {
                                                                            if ((Memory.peekByte(atkfVar.c + 8) & 1) != 0) {
                                                                                atkfVar.f = atkfVar.cq(atkh.e.b);
                                                                            } else {
                                                                                atkfVar.f = "";
                                                                            }
                                                                        }
                                                                        xgnVar.j(atkfVar.f, xhb.b(iPeekInt), iPeekInt3);
                                                                    } else {
                                                                        z2 = true;
                                                                    }
                                                                }
                                                                iPeekInt = -1;
                                                                if (iPeekInt != -1) {
                                                                    if (adfs.f(atkfVar)) {
                                                                        iPeekInt3 = Memory.peekInt(adfs.e(atkfVar).aR().aS().c + 16, false);
                                                                    }
                                                                    xgn xgnVar2 = adfsVar2.a;
                                                                    z2 = true;
                                                                    if (atkfVar.f == null) {
                                                                        if ((Memory.peekByte(atkfVar.c + 8) & 1) != 0) {
                                                                            atkfVar.f = atkfVar.cq(atkh.e.b);
                                                                        } else {
                                                                            atkfVar.f = "";
                                                                        }
                                                                    }
                                                                    xgnVar2.j(atkfVar.f, xhb.b(iPeekInt), iPeekInt3);
                                                                } else {
                                                                    z2 = true;
                                                                }
                                                            } else {
                                                                z2 = true;
                                                            }
                                                            xgzVarB = xgzVarC2;
                                                            z = z2;
                                                        }
                                                    }
                                                } else {
                                                    z = 1;
                                                    xgzVarB = null;
                                                }
                                                if (xgzVarB != null) {
                                                    j3 = mewVar2.c;
                                                    if ((Memory.peekByte(8 + j3) & 2) != 0) {
                                                        xgzVar = adfsVar2.e;
                                                        if (xgzVar != null) {
                                                            aaokVar.i(xgzVarB, xgzVar);
                                                        } else {
                                                            ((xgo) aaokVar.a).g((xgt) aaokVar.c, xgzVarB.c(), (xie) aaokVar.b);
                                                        }
                                                        aihf aihfVarCreateBuilder3 = amdd.a.createBuilder();
                                                        aihf aihfVarCreateBuilder4 = amda.a.createBuilder();
                                                        aihfVarCreateBuilder4.copyOnWrite();
                                                        amda amdaVar3 = (amda) aihfVarCreateBuilder4.instance;
                                                        amdaVar3.b = amdaVar3.b | z ? 1 : 0;
                                                        amdaVar3.c = z;
                                                        aihfVarCreateBuilder3.copyOnWrite();
                                                        amdd amddVar2 = (amdd) aihfVarCreateBuilder3.instance;
                                                        amda amdaVar4 = (amda) aihfVarCreateBuilder4.build();
                                                        amdaVar4.getClass();
                                                        amddVar2.x = amdaVar4;
                                                        amddVar2.d |= 8;
                                                        ((xgo) aaokVar.a).o((xgt) aaokVar.c, xgzVarB.c(), (amdd) aihfVarCreateBuilder3.build(), (xie) aaokVar.b);
                                                    } else {
                                                        xgzVar = adfsVar2.e;
                                                        if (xgzVar != null) {
                                                            aaokVar.i(xgzVarB, xgzVar);
                                                        } else {
                                                            ((xgo) aaokVar.a).g((xgt) aaokVar.c, xgzVarB.c(), (xie) aaokVar.b);
                                                        }
                                                        aihf aihfVarCreateBuilder5 = amdd.a.createBuilder();
                                                        aihf aihfVarCreateBuilder6 = amda.a.createBuilder();
                                                        aihfVarCreateBuilder6.copyOnWrite();
                                                        amda amdaVar5 = (amda) aihfVarCreateBuilder6.instance;
                                                        amdaVar5.b = amdaVar5.b | z ? 1 : 0;
                                                        amdaVar5.c = z;
                                                        aihfVarCreateBuilder5.copyOnWrite();
                                                        amdd amddVar3 = (amdd) aihfVarCreateBuilder5.instance;
                                                        amda amdaVar6 = (amda) aihfVarCreateBuilder6.build();
                                                        amdaVar6.getClass();
                                                        amddVar3.x = amdaVar6;
                                                        amddVar3.d |= 8;
                                                        ((xgo) aaokVar.a).o((xgt) aaokVar.c, xgzVarB.c(), (amdd) aihfVarCreateBuilder5.build(), (xie) aaokVar.b);
                                                    }
                                                }
                                            }
                                        }
                                    } else if (i5 == 2) {
                                        it = it2;
                                        mew mewVar4 = (mew) pair.first;
                                        mew mewVar5 = (mew) pair.second;
                                        if (!adfsVar2.d || (xgzVarD2 = adfsVar2.d(Memory.peekInt(mewVar4.c + 12, false), sparseArray)) == null) {
                                            mep mepVar4 = aryv.d;
                                            if (mewVar5.e(mepVar4)) {
                                                upbArena2 = adfsVar2.a(upbArena2);
                                                aryv aryvVar2 = upbArena2 != null ? (aryv) ksy.aE(mewVar5, mepVar4, upbArena2) : (aryv) mewVar5.d(mepVar4);
                                                if (aryvVar2 == null || (xgzVarB2 = adfsVar2.b(Memory.peekInt(mewVar4.c + 12, false), aryvVar2, sparseArray)) == null) {
                                                    amddVarH = null;
                                                } else {
                                                    amddVarH = adfsVar2.h(mewVar4);
                                                    if (mewVar4.aL() == 2) {
                                                        aaokVar.k(xgzVarB2, amddVarH);
                                                    } else {
                                                        aaokVar.j(xgzVarB2, amddVarH);
                                                    }
                                                }
                                            } else {
                                                amddVarH = null;
                                            }
                                            mep mepVar5 = atkf.d;
                                            if (mewVar5.e(mepVar5)) {
                                                upbArena2 = adfsVar2.a(upbArena2);
                                                atkf atkfVar2 = upbArena2 != null ? (atkf) ksy.aE(mewVar5, mepVar5, upbArena2) : (atkf) mewVar5.d(mepVar5);
                                                if (atkfVar2 != null && (xgzVarC = adfsVar2.c(Memory.peekInt(mewVar4.c + 12, false), atkfVar2, sparseArray)) != null) {
                                                    if (amddVarH == null) {
                                                        amddVarH = adfsVar2.h(mewVar4);
                                                    }
                                                    if (mewVar4.aL() == 2) {
                                                        aaokVar.k(xgzVarC, amddVarH);
                                                    }
                                                    if (mewVar4.aL() == 3) {
                                                        aaokVar.j(xgzVarC, amddVarH);
                                                    }
                                                }
                                            }
                                        } else {
                                            amdd amddVarH2 = adfsVar2.h(mewVar4);
                                            if (mewVar4.aL() == 2) {
                                                aaokVar.k(xgzVarD2, amddVarH2);
                                            } else if (mewVar4.aL() == 3) {
                                                aaokVar.j(xgzVarD2, amddVarH2);
                                            }
                                        }
                                    } else if (i5 != 3) {
                                        it = it2;
                                    } else {
                                        mew mewVar6 = (mew) pair.first;
                                        mew mewVar7 = (mew) pair.second;
                                        it = it2;
                                        int iPeekInt4 = Memory.peekInt(mewVar6.c + 44, false);
                                        if (iPeekInt4 == 0) {
                                            i3 = 1;
                                        } else if (iPeekInt4 == 1) {
                                            i3 = 2;
                                        } else if (iPeekInt4 != 2) {
                                            i3 = iPeekInt4 != 3 ? 0 : 4;
                                        } else {
                                            i3 = 3;
                                        }
                                        if (i3 == 0) {
                                            i3 = 1;
                                        }
                                        if (i3 == 2 || i3 == 4) {
                                            i4 = i3;
                                        } else if (i3 == 3) {
                                        }
                                        mep mepVar6 = atkf.d;
                                        if (mewVar7.e(mepVar6)) {
                                            upbArena2 = adfsVar2.a(upbArena2);
                                            atkf atkfVar3 = upbArena2 != null ? (atkf) ksy.aE(mewVar7, mepVar6, upbArena2) : (atkf) mewVar7.d(mepVar6);
                                            if (atkfVar3 != null) {
                                                xgz xgzVarC3 = adfsVar2.c(Memory.peekInt(mewVar6.c + 12, false), atkfVar3, sparseArray);
                                                asbk asbkVarE = adfs.e(atkfVar3);
                                                if (asbkVarE.aS()) {
                                                    aryh aryhVarAR2 = asbkVarE.aR();
                                                    if (aryhVarAR2.e == null && (Memory.peekByte(aryhVarAR2.c + 8) & 4) != 0) {
                                                        aryhVarAR2.e = new mew(aryhVarAR2.cp(true != aryj.a ? 20 : 48, arxm.a));
                                                    }
                                                    mewVar = aryhVarAR2.e == null ? arxl.a : aryhVarAR2.e;
                                                } else {
                                                    mewVar = null;
                                                }
                                                if (xgzVarC3 != null) {
                                                    int i6 = i4 - 1;
                                                    if (i6 != 1) {
                                                        if (i6 != 2) {
                                                            if (adfsVar2.i(mewVar, SemanticState.ReadOnly)) {
                                                                aaokVar.l(ameb.INTERACTION_LOGGING_GESTURE_TYPE_LONG_PRESS, xgzVarC3);
                                                            }
                                                        } else if (adfsVar2.i(mewVar, 64)) {
                                                            aaokVar.l(ameb.INTERACTION_LOGGING_GESTURE_TYPE_SWIPE, xgzVarC3);
                                                        }
                                                    } else if (adfsVar2.i(mewVar, 2) || Memory.peekByte(asbkVarE.c + 9) != 0) {
                                                        aaokVar.l(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgzVarC3);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    it2 = it;
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                    for (int size = arrayList.size(); size < jArr.length; size++) {
                        UpbArena.c(jArr2[size]);
                    }
                    return;
                }
                for (int size2 = arrayList.size(); size2 < jArr.length; size2++) {
                    UpbArena.c(jArr2[size2]);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            for (int size3 = arrayList.size(); size3 < jArr.length; size3++) {
                UpbArena.c(jArr2[size3]);
            }
            if (upbArena == null) {
                UpbArena.c(j2);
            }
            throw th;
        }
        for (int size4 = arrayList.size(); size4 < jArr.length; size4++) {
            UpbArena.c(jArr2[size4]);
        }
        UpbArena.c(j2);
    }

    private void onLayoutEnd(long j) {
        NodeTreeProcessorImpl nodeTreeProcessorImpl;
        aga agaVar;
        aga agaVar2;
        aga agaVar3;
        aga agaVar4;
        NodeTreeProcessorImpl nodeTreeProcessorImpl2;
        if (Memory.peekByte(FlagServices.b().c + 65) == 0) {
            agp agpVar = this.e;
            synchronized (agpVar) {
                nodeTreeProcessorImpl = (NodeTreeProcessorImpl) agpVar.a(j);
            }
            if (nodeTreeProcessorImpl != null) {
                agp agpVar2 = this.f;
                synchronized (agpVar2) {
                    agaVar = (aga) agpVar2.e(j);
                }
                agp agpVar3 = this.g;
                synchronized (agpVar3) {
                    agaVar2 = (aga) agpVar3.e(j);
                }
                nodeTreeProcessorImpl.P(agaVar);
                nodeTreeProcessorImpl.Q(agaVar2);
                return;
            }
            return;
        }
        agp agpVar4 = this.f;
        synchronized (agpVar4) {
            agaVar3 = (aga) agpVar4.e(j);
        }
        agp agpVar5 = this.g;
        synchronized (agpVar5) {
            agaVar4 = (aga) agpVar5.e(j);
        }
        agp agpVar6 = this.e;
        synchronized (agpVar6) {
            nodeTreeProcessorImpl2 = (NodeTreeProcessorImpl) agpVar6.a(j);
        }
        if (nodeTreeProcessorImpl2 == null) {
            h(agaVar3);
        } else {
            nodeTreeProcessorImpl2.P(agaVar3);
            nodeTreeProcessorImpl2.Q(agaVar4);
        }
    }

    private void onNodesRemoved(long j, int[] iArr) {
        NodeTreeProcessorImpl nodeTreeProcessorImpl;
        int i;
        SparseArray sparseArray;
        agp agpVar = this.e;
        synchronized (agpVar) {
            nodeTreeProcessorImpl = (NodeTreeProcessorImpl) agpVar.a(j);
        }
        if (nodeTreeProcessorImpl != null) {
            ArrayList arrayList = new ArrayList();
            synchronized (nodeTreeProcessorImpl.h) {
                aga agaVar = nodeTreeProcessorImpl.n;
                if (agaVar != null) {
                    for (int i2 : iArr) {
                        Object objE = agaVar.e(i2);
                        if (objE instanceof PaintUnit) {
                            PaintUnit paintUnit = (PaintUnit) objE;
                            if (paintUnit.i()) {
                                arrayList.add(paintUnit);
                            }
                        }
                    }
                }
            }
            nodeTreeProcessorImpl.J(arrayList, "NodeTreeProcessorImpl.onNodesRemoved()");
            if (Memory.peekByte(FlagServices.b().c + 103) != 0) {
                synchronized (nodeTreeProcessorImpl.l) {
                    sparseArray = nodeTreeProcessorImpl.m;
                }
                if (sparseArray != null) {
                    int length = iArr.length;
                    int[] iArr2 = new int[length];
                    for (int i3 = 0; i3 < iArr.length; i3++) {
                        iArr2[i3] = nodeTreeProcessorImpl.a(iArr[i3]);
                    }
                    synchronized (sparseArray) {
                        for (i = 0; i < length; i++) {
                            sparseArray.remove(iArr2[i]);
                        }
                    }
                }
            }
        }
    }

    private void reportError(int i, byte[] bArr) {
        aslh aslhVarA = aslh.a(i);
        if (aslhVarA == null) {
            aslhVarA = aslh.LOG_TYPE_INTERNAL_ERROR;
        }
        try {
            this.c.n().c(aslhVarA, "Error reported from the runtime", mhb.a((Status$StatusProto) aihn.parseFrom(Status$StatusProto.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())));
        } catch (aiik unused) {
            this.c.n().a(aslh.LOG_TYPE_WIRE_FORMAT_ERROR, "Error reporting error from the runtime");
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [agfr] */
    private void resolveCommand(long j, long j2, long j3, long j4, long j5, int i) throws Throwable {
        NodeTreeProcessor nodeTreeProcessor;
        long j6;
        mew mewVar;
        agp agpVar = this.e;
        synchronized (agpVar) {
            nodeTreeProcessor = (NodeTreeProcessor) agpVar.a(j);
        }
        if (nodeTreeProcessor == null) {
            if (j3 != 0) {
                UpbArena.c(j3);
            }
            if (j5 == 0) {
                return;
            }
        } else {
            Object agfuVar = null;
            try {
                j6 = 0;
                try {
                    mew mewVar2 = new mew(ksy.aB(j2, atcm.a, j3));
                    if (j4 != 0) {
                        try {
                            mewVar = new mew(ksy.aB(j4, atmk.a, j5), (char[][]) null);
                        } catch (Throwable th) {
                            th = th;
                            mewVar = null;
                            agfuVar = mewVar2;
                            if (agfuVar == null) {
                                UpbArena.c(j3);
                            }
                            if (mewVar == null) {
                                UpbArena.c(j5);
                            }
                            throw th;
                        }
                    } else {
                        mewVar = null;
                    }
                    try {
                        View view = (View) this.d.a(j);
                        if (view != null) {
                            if (mewVar == null || !i(mewVar2)) {
                                agfuVar = new agfu(view);
                            } else {
                                mew mewVar3 = mewVar;
                                try {
                                    agfuVar = aguu.al(new ovf((Object) this, (Object) view, (Object) mewVar3, 3, (byte[]) null));
                                } catch (Throwable th2) {
                                    th = th2;
                                    mewVar = mewVar3;
                                    agfuVar = mewVar2;
                                    if (agfuVar == null) {
                                        UpbArena.c(j3);
                                    }
                                    if (mewVar == null) {
                                        UpbArena.c(j5);
                                    }
                                    throw th;
                                }
                            }
                        }
                        int iA = nodeTreeProcessor.a(i);
                        ElementsServices elementsServices = this.c;
                        elementsServices.l().d(mewVar2, orp.e(agfuVar, mewVar, i, iA, elementsServices, nodeTreeProcessor.l(), nodeTreeProcessor.i()));
                        if (mewVar != null || j5 == 0) {
                            return;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    mewVar = null;
                    if (agfuVar == null && j3 != j6) {
                        UpbArena.c(j3);
                    }
                    if (mewVar == null && j5 != j6) {
                        UpbArena.c(j5);
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                j6 = 0;
            }
        }
        UpbArena.c(j5);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0074 */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void resolveCommandAsync(long r22, long r24, long r26, long r28, long r30, int r32) throws java.lang.Throwable {
        /*
            r21 = this;
            r1 = r26
            r3 = r28
            r5 = r30
            r7 = 0
            r8 = 0
            r11 = r21
            agp r10 = r11.e     // Catch: java.lang.Throwable -> L76
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L76
            r12 = r22
            java.lang.Object r0 = r10.a(r12)     // Catch: java.lang.Throwable -> L6d
            r16 = r0
            com.google.android.libraries.multiplatform.elements.NodeTreeProcessor r16 = (com.google.android.libraries.multiplatform.elements.NodeTreeProcessor) r16     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L6d
            if (r16 != 0) goto L27
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L22
            com.google.android.libraries.elements.adl.UpbArena.c(r1)
        L22:
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 == 0) goto L6a
            goto L67
        L27:
            mew r15 = new mew     // Catch: java.lang.Throwable -> L76
            com.google.android.libraries.elements.adl.UpbMiniTable r0 = defpackage.atcm.a     // Catch: java.lang.Throwable -> L76
            r19 = r8
            r8 = r24
            com.google.android.libraries.elements.adl.UpbMessage r0 = defpackage.ksy.aB(r8, r0, r1)     // Catch: java.lang.Throwable -> L72
            r15.<init>(r0)     // Catch: java.lang.Throwable -> L72
            int r0 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r0 == 0) goto L4b
            mew r0 = new mew     // Catch: java.lang.Throwable -> L47
            com.google.android.libraries.elements.adl.UpbMiniTable r8 = defpackage.atmk.a     // Catch: java.lang.Throwable -> L47
            com.google.android.libraries.elements.adl.UpbMessage r3 = defpackage.ksy.aB(r3, r8, r5)     // Catch: java.lang.Throwable -> L47
            r0.<init>(r3, r7)     // Catch: java.lang.Throwable -> L47
            r14 = r0
            goto L4c
        L47:
            r0 = move-exception
            r14 = r7
        L49:
            r7 = r15
            goto L7a
        L4b:
            r14 = r7
        L4c:
            android.os.Handler r0 = new android.os.Handler     // Catch: java.lang.Throwable -> L6b
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L6b
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L6b
            adiq r10 = new adiq     // Catch: java.lang.Throwable -> L6b
            r18 = 1
            r17 = r32
            r10.<init>(r11, r12, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L6b
            r0.post(r10)     // Catch: java.lang.Throwable -> L6b
            if (r14 != 0) goto L6a
            int r0 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r0 == 0) goto L6a
        L67:
            com.google.android.libraries.elements.adl.UpbArena.c(r5)
        L6a:
            return
        L6b:
            r0 = move-exception
            goto L49
        L6d:
            r0 = move-exception
            r19 = r8
        L70:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L74
            throw r0     // Catch: java.lang.Throwable -> L72
        L72:
            r0 = move-exception
            goto L79
        L74:
            r0 = move-exception
            goto L70
        L76:
            r0 = move-exception
            r19 = r8
        L79:
            r14 = r7
        L7a:
            if (r7 != 0) goto L83
            int r3 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r3 == 0) goto L83
            com.google.android.libraries.elements.adl.UpbArena.c(r1)
        L83:
            if (r14 != 0) goto L8c
            int r1 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r1 == 0) goto L8c
            com.google.android.libraries.elements.adl.UpbArena.c(r5)
        L8c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.multiplatform.elements.runtime.ElementsRuntimeImpl.resolveCommandAsync(long, long, long, long, long, int):void");
    }

    private void scheduleUpdate() {
        if (this.b.get() || this.q.get()) {
            return;
        }
        oos oosVar = this.i;
        if (oosVar == null) {
            throw new IllegalStateException("scheduleUpdate() called before any processors were attached to a View.");
        }
        if (this.r.compareAndSet(false, true)) {
            oosVar.a(this);
        }
    }

    @Override // defpackage.oov
    public final NodeTreeProcessor a() {
        return b(n);
    }

    @Override // defpackage.oov
    public final NodeTreeProcessor b(oph ophVar) {
        AtomicBoolean atomicBoolean = this.q;
        if (atomicBoolean.get()) {
            throw new IllegalStateException("Cannot create NodeTreeProcessor post closing ElementsRuntime");
        }
        NodeTreeProcessorImpl nodeTreeProcessorImpl = new NodeTreeProcessorImpl(this, this.c, ophVar);
        agp agpVar = this.e;
        synchronized (agpVar) {
            if (atomicBoolean.get()) {
                nodeTreeProcessorImpl.close();
                throw new IllegalStateException("Cannot create NodeTreeProcessor post closing ElementsRuntime");
            }
            agpVar.d(nodeTreeProcessorImpl.c, nodeTreeProcessorImpl);
        }
        return nodeTreeProcessorImpl;
    }

    @Override // defpackage.oov
    public final oui c() {
        return this.c.n();
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        synchronized (this.e) {
            if (this.q.getAndSet(true)) {
                return;
            }
            oos oosVar = this.i;
            if (oosVar != null) {
                oosVar.b(this);
            }
            agfr agfrVarO = this.c.o();
            if (agfrVarO != null) {
                opq opqVar = (opq) agfrVarO.io();
                opqVar.e.remove(this.l);
            }
            for (AutoCloseable autoCloseable : new HashSet(this.s)) {
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    a.ar((ExecutorService) autoCloseable);
                } else if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                } else if (autoCloseable instanceof DrmManagerClient) {
                    ((DrmManagerClient) autoCloseable).release();
                } else {
                    if (!(autoCloseable instanceof ContentProviderClient)) {
                        throw new IllegalArgumentException();
                    }
                    ((ContentProviderClient) autoCloseable).release();
                }
            }
            ArrayList arrayList = new ArrayList();
            agp agpVar = this.e;
            synchronized (agpVar) {
                agpVar.b(new hol(arrayList, 17));
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((NodeTreeProcessorImpl) arrayList.get(i)).close();
            }
            long j = this.a;
            jniWaitForAllProcessorsToClose(j);
            jniDeleteRuntime(j);
            agp agpVar2 = this.f;
            synchronized (agpVar2) {
                agpVar2.f();
            }
            if (Memory.peekByte(FlagServices.b().c + 65) != 0) {
                agp agpVar3 = this.g;
                synchronized (agpVar3) {
                    agpVar3.f();
                }
            }
        }
    }

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
    @Override // defpackage.opi
    public final void d(long j, int i, Object obj) {
        agp agpVar = this.f;
        synchronized (agpVar) {
            aga agaVar = (aga) agpVar.a(j);
            if (agaVar == null) {
                agaVar = new aga(6);
                agpVar.d(j, agaVar);
            }
            agaVar.d(i, obj);
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) throws Throwable {
        NodeTreeProcessorImpl nodeTreeProcessorImpl;
        long j2;
        if (this.q.get()) {
            return;
        }
        this.r.set(false);
        long j3 = this.a;
        long[] jArrJniGetDirtyNodeTreeHandles = jniGetDirtyNodeTreeHandles(j3);
        if (jArrJniGetDirtyNodeTreeHandles == null) {
            jArrJniGetDirtyNodeTreeHandles = o;
        }
        if (jArrJniGetDirtyNodeTreeHandles != null && (jArrJniGetDirtyNodeTreeHandles.length) > 0) {
            for (long j4 : jArrJniGetDirtyNodeTreeHandles) {
                ooy ooyVar = (ooy) this.d.a(j4);
                if (ooyVar != null) {
                    ooyVar.F();
                }
            }
        }
        long[] jArrJniGetAndClearAnimatingProcessors = jniGetAndClearAnimatingProcessors(j3);
        if (jArrJniGetAndClearAnimatingProcessors != null) {
            boolean z = false;
            for (long j5 : jArrJniGetAndClearAnimatingProcessors) {
                agp agpVar = this.e;
                synchronized (agpVar) {
                    nodeTreeProcessorImpl = (NodeTreeProcessorImpl) agpVar.a(j5);
                }
                if (nodeTreeProcessorImpl != null) {
                    AtomicLong atomicLong = nodeTreeProcessorImpl.d;
                    for (long j6 = atomicLong.get(); (j6 & 4611686018427387904L) == 0 && j6 > 0; j6 = atomicLong.get()) {
                        if (atomicLong.compareAndSet(j6, 1 + j6)) {
                            try {
                                j2 = 4611686018427387904L;
                                try {
                                    boolean zJniAnimationTick = NodeTreeProcessorImpl.jniAnimationTick(nodeTreeProcessorImpl.c, j);
                                    if (atomicLong.decrementAndGet() == 4611686018427387904L) {
                                        nodeTreeProcessorImpl.a.z().execute(new ooz(nodeTreeProcessorImpl, 14));
                                    }
                                    if (!zJniAnimationTick || !jniAddAnimatingProcessor(j3, j5)) {
                                        break;
                                    }
                                    z = true;
                                    break;
                                } catch (Throwable th) {
                                    th = th;
                                    if (nodeTreeProcessorImpl.d.decrementAndGet() == j2) {
                                        nodeTreeProcessorImpl.a.z().execute(new ooz(nodeTreeProcessorImpl, 14));
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                j2 = 4611686018427387904L;
                            }
                        }
                    }
                }
            }
            if (z) {
                scheduleUpdate();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022  */
    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:47:0x0031 A[SYNTHETIC] */
    final Object f(long j, int[] iArr, int i) {
        Object childAt = (ooy) this.d.a(j);
        if (childAt == null) {
            return null;
        }
        int i2 = 0;
        while (i2 < i) {
            if (childAt instanceof oyk) {
                oyk oykVar = (oyk) childAt;
                if (oykVar.ao()) {
                    childAt = oykVar.ie(iArr[i2]);
                } else {
                    if (childAt instanceof ViewGroup) {
                        this.c.n().c(aslh.LOG_TYPE_INTERNAL_ERROR, "parentViewGroup cast is null inside resolvePathTarget.", new RuntimeException());
                        return null;
                    }
                    childAt = ((ViewGroup) childAt).getChildAt(iArr[i2]);
                }
            } else {
                if (childAt instanceof ViewGroup) {
                    this.c.n().c(aslh.LOG_TYPE_INTERNAL_ERROR, "parentViewGroup cast is null inside resolvePathTarget.", new RuntimeException());
                    return null;
                }
                childAt = ((ViewGroup) childAt).getChildAt(iArr[i2]);
            }
            i2++;
        }
        if (i2 == iArr.length) {
            if (childAt instanceof NodeViewInterface) {
                return childAt;
            }
            this.c.n().c(aslh.LOG_TYPE_INTERNAL_ERROR, "nodeView cast is null inside resolvePathTarget.", new RuntimeException());
            return null;
        }
        PaintUnitOwner paintUnitOwner = (PaintUnitOwner) childAt;
        if (paintUnitOwner == null) {
            this.c.n().c(aslh.LOG_TYPE_INTERNAL_ERROR, "paintUnitOwner cast is null inside resolvePathTarget.", new RuntimeException());
            return null;
        }
        while (true) {
            int length = iArr.length - 1;
            if (i2 >= length) {
                int i3 = iArr[length];
                if (i3 < 0 || i3 >= paintUnitOwner.ig()) {
                    return null;
                }
                try {
                    return paintUnitOwner.j(i3);
                } catch (NullPointerException e) {
                    this.c.n().c(aslh.LOG_TYPE_INTERNAL_ERROR, "paintUnitOwner.getPaintUnitAt() failed.", e);
                    return null;
                }
            }
            int i4 = iArr[i2];
            if (i4 < 0 || i4 >= paintUnitOwner.ig()) {
                return null;
            }
            paintUnitOwner = (PaintUnitOwner) paintUnitOwner.j(i4);
            if (paintUnitOwner == null) {
                this.c.n().c(aslh.LOG_TYPE_INTERNAL_ERROR, "paintUnitOwner cast is null inside resolvePathTarget.", new RuntimeException());
                return null;
            }
            i2++;
        }
    }

    public final void g(long j) {
        this.d.e(j);
    }

    public String getBlockRegistryRef(long j) {
        NodeTreeProcessorImpl nodeTreeProcessorImpl;
        agfr agfrVar;
        agp agpVar = this.e;
        synchronized (agpVar) {
            nodeTreeProcessorImpl = (NodeTreeProcessorImpl) agpVar.a(j);
        }
        if (nodeTreeProcessorImpl == null || (agfrVar = nodeTreeProcessorImpl.b.h) == null) {
            return null;
        }
        return (String) agfrVar.io();
    }

    public ClientDataObservable getClientDataObservable(long j) {
        agp agpVar = this.e;
        synchronized (agpVar) {
        }
        return null;
    }

    long[] getCommandAtPlatformHitTest(long j, int[] iArr, int i, float f, float f2, int i2) {
        mew mewVarZ;
        Object objF = f(j, iArr, i);
        if (!(objF instanceof PaintUnit) || (mewVarZ = ((PaintUnit) objF).z(f, f2, i2)) == null) {
            return null;
        }
        return ksy.aC(mewVarZ);
    }

    long[] getCustomSenderState(long j, int[] iArr, int i) {
        atoc atocVarM;
        Object objF = f(j, iArr, i);
        if (objF instanceof NodeViewInterface) {
            atocVarM = ((NodeViewInterface) objF).V();
        } else {
            atocVarM = objF instanceof PaintUnit ? ((PaintUnit) objF).m() : null;
        }
        if (atocVarM != null) {
            return ksy.aC(atocVarM.aT());
        }
        return null;
    }

    public long getHandle() {
        return this.a;
    }

    public final void h(aga agaVar) {
        if (Memory.peekByte(FlagServices.b().c + 103) != 0) {
            Iterator it = NodeTreeProcessorImpl.I(agaVar, true).iterator();
            while (it.hasNext()) {
                try {
                    ((PaintUnit) it.next()).close();
                } catch (IOException e) {
                    this.c.n().c(aslh.LOG_TYPE_INTERNAL_ERROR, "ElementsRuntimeImpl orphaned paintUnit threw IOException", e);
                }
            }
        }
    }

    void scheduleAnimation(long j) {
        if (this.b.get() || this.q.get() || !jniAddAnimatingProcessor(this.a, j)) {
            return;
        }
        scheduleUpdate();
    }
}
