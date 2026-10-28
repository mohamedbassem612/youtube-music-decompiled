package com.google.android.libraries.multiplatform.elements.uibuilder;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.elements.adl.UpbArena;
import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;
import com.google.android.libraries.multiplatform.elements.NodeViewInternalInterface;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitLayer;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner;
import com.google.android.libraries.multiplatform.elements.paintunit.ShaderUniformReader;
import defpackage.a;
import defpackage.aga;
import defpackage.aslh;
import defpackage.atkx;
import defpackage.atlb;
import defpackage.atoe;
import defpackage.cmw;
import defpackage.kjc;
import defpackage.mep;
import defpackage.met;
import defpackage.mew;
import defpackage.nvc;
import defpackage.oot;
import defpackage.ooy;
import defpackage.opj;
import defpackage.opm;
import defpackage.opn;
import defpackage.opo;
import defpackage.osk;
import defpackage.oui;
import defpackage.oul;
import defpackage.ous;
import defpackage.ouv;
import defpackage.ovd;
import defpackage.ovg;
import defpackage.oyi;
import defpackage.oyk;
import defpackage.oyn;
import defpackage.rrw;
import java.util.concurrent.atomic.AtomicBoolean;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class UiBuilderCallbackImpl implements opn {
    private static final int[] d = {316055719, 525000004};
    public aga a;
    public opo c;
    private final oui f;
    private final kjc g;
    private final AtomicBoolean e = new AtomicBoolean(false);
    public final long b = jniCreateUiBuilderCallback(this);

    public UiBuilderCallbackImpl(ElementsServices elementsServices) {
        this.f = elementsServices.n();
        this.g = elementsServices.D();
    }

    private void addPaintUnit(PaintUnitOwner paintUnitOwner, PaintUnit paintUnit) {
        paintUnitOwner.l(paintUnit);
    }

    private boolean applyPaintUnitProperties(long j, long j2, long j3, long j4, int i, PaintUnit paintUnit, NodeTreeProcessor nodeTreeProcessor) {
        k(j, j2, paintUnit, nodeTreeProcessor);
        new mew(g(j3, j4, atkx.a), (float[]) null);
        if (((opj) nodeTreeProcessor.k().g().a(i)) != null) {
            return true;
        }
        h(i);
        return false;
    }

    private boolean applyPaintUnitPropertiesWithExtensions(long j, long j2, long j3, long j4, int[] iArr, PaintUnit paintUnit, NodeTreeProcessor nodeTreeProcessor) {
        k(j, j2, paintUnit, nodeTreeProcessor);
        new mew(g(j3, j4, atkx.a), (float[]) null);
        for (int i : iArr) {
            if (((opj) nodeTreeProcessor.k().g().a(i)) == null) {
                h(i);
            }
        }
        return true;
    }

    private boolean applyPropertiesWithMultipleExtensions(long j, long j2, long j3, long j4, long j5, int[] iArr, NodeViewInterface nodeViewInterface, NodeTreeProcessor nodeTreeProcessor) {
        NodeViewInterface nodeViewInterface2;
        NodeTreeProcessor nodeTreeProcessor2;
        mew mewVar = new mew(f(j, j2, atlb.a));
        mew mewVar2 = new mew(f(j4, j5, atkx.a), (float[]) null);
        nodeViewInterface.getClass();
        int iA = nvc.a(nodeViewInterface);
        if (iA == 0) {
            nodeViewInterface2 = nodeViewInterface;
            nodeTreeProcessor2 = nodeTreeProcessor;
            d(mewVar, j3, (oyn) nodeViewInterface2, nodeTreeProcessor2);
        } else if (iA != 1) {
            nodeTreeProcessor2 = nodeTreeProcessor;
            b(mewVar, j3, nodeViewInterface, nodeTreeProcessor2);
            nodeViewInterface2 = nodeViewInterface;
        } else {
            nodeViewInterface2 = nodeViewInterface;
            nodeTreeProcessor2 = nodeTreeProcessor;
            c(mewVar, j3, (oyk) nodeViewInterface2, nodeTreeProcessor2);
        }
        int i = -1;
        for (int i2 : iArr) {
            opj opjVar = (opj) nodeTreeProcessor2.k().g().a(i2);
            if (opjVar == null) {
                h(i2);
                i = i2;
            } else if (!n(mewVar2, opjVar, nodeViewInterface2, nodeTreeProcessor2)) {
                return false;
            }
        }
        if (i == -1) {
            return true;
        }
        if (!j(i)) {
            osk.a(aslh.LOG_TYPE_UNKNOWN_EXTENSION, new oot(a.bR(i, "Encountered 1 or more unknown Properties extensions without registered handlers. For example: ")), this.f);
        }
        return false;
    }

    private boolean applyPropertiesWithOneExtension(long j, long j2, long j3, long j4, long j5, int i, NodeViewInterface nodeViewInterface, NodeTreeProcessor nodeTreeProcessor) {
        NodeViewInterface nodeViewInterface2;
        NodeTreeProcessor nodeTreeProcessor2;
        mew mewVar = new mew(f(j, j2, atlb.a));
        mew mewVar2 = new mew(f(j4, j5, atkx.a), (float[]) null);
        ElementsServices elementsServicesK = nodeTreeProcessor.k();
        nodeViewInterface.getClass();
        int iA = nvc.a(nodeViewInterface);
        if (iA == 0) {
            nodeViewInterface2 = nodeViewInterface;
            nodeTreeProcessor2 = nodeTreeProcessor;
            d(mewVar, j3, (oyn) nodeViewInterface2, nodeTreeProcessor2);
        } else if (iA != 1) {
            nodeTreeProcessor2 = nodeTreeProcessor;
            b(mewVar, j3, nodeViewInterface, nodeTreeProcessor2);
            nodeViewInterface2 = nodeViewInterface;
        } else {
            nodeViewInterface2 = nodeViewInterface;
            nodeTreeProcessor2 = nodeTreeProcessor;
            c(mewVar, j3, (oyk) nodeViewInterface2, nodeTreeProcessor2);
        }
        opj opjVar = (opj) elementsServicesK.g().a(i);
        if (opjVar != null) {
            return n(mewVar2, opjVar, nodeViewInterface2, nodeTreeProcessor2);
        }
        h(i);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    static final void e(NodeViewInterface nodeViewInterface, mew mewVar) {
        boolean z;
        oyk oykVar = null;
        oyk oykVar2 = nodeViewInterface instanceof oyk ? (oyk) nodeViewInterface : null;
        long j = mewVar.c;
        float fA = 0.0f;
        boolean zH = false;
        if ((Memory.peekByte(13 + j) & 4) != 0) {
            long j2 = j + 152;
            if (Memory.peekInt(j2, false) != 0) {
                int iPeekInt = Memory.peekInt(j2, false);
                boolean z2 = false;
                z = false;
                for (int i = 0; i < iPeekInt; i++) {
                    ShaderUniformReader shaderUniformReader = new ShaderUniformReader(i);
                    try {
                        if (shaderUniformReader.e()) {
                            if (shaderUniformReader.b() == 3) {
                                fA = shaderUniformReader.a(0);
                                z = false;
                            } else if (shaderUniformReader.b() == 4) {
                                fA = shaderUniformReader.a(0);
                                z = true;
                            }
                        } else if (oykVar2 != null && shaderUniformReader.b() != 0) {
                            z2 = true;
                        }
                        shaderUniformReader.d();
                    } catch (Throwable th) {
                        shaderUniformReader.d();
                        throw th;
                    }
                }
                if (!z2) {
                    oykVar = oykVar2;
                } else if (oykVar2 != null) {
                    ouv ouvVar = oykVar2.C;
                    if (ouvVar == null) {
                        oykVar2.C = new ouv();
                        oykVar2.C.c(oykVar2.x);
                        ouvVar = oykVar2.C;
                        ouvVar.a = oykVar2;
                    }
                    ouvVar.e(oykVar2.getLayoutDirection() == 1);
                    zH = ouvVar.h(mewVar);
                    oykVar = oykVar2;
                }
                zH = z2;
            } else {
                oykVar = oykVar2;
                z = false;
            }
        } else {
            oykVar = oykVar2;
            z = false;
        }
        if (oykVar != null) {
            if (!zH) {
                oykVar.au();
            }
            oyi oyiVar = oykVar.B;
            if (fA > 0.01f || (oyiVar != null && oyiVar.a > 0.01f)) {
                oykVar.ar().f(oykVar, fA, z);
                return;
            }
            return;
        }
        if (nodeViewInterface instanceof oyn) {
            oyn oynVar = (oyn) nodeViewInterface;
            oyi oyiVar2 = oynVar.g;
            if (fA > 0.01f || (oyiVar2 != null && oyiVar2.a > 0.01f)) {
                if (oyiVar2 == null) {
                    oynVar.g = new oyi();
                    oynVar.g.b = oynVar.getAlpha();
                    oynVar.g.g(oynVar, oynVar.c);
                }
                oynVar.g.f(oynVar, fA, z);
            }
        }
    }

    private static UpbMessage f(long j, long j2, UpbMiniTable upbMiniTable) {
        return new UpbMessage(j, upbMiniTable, UpbArena.a(j2));
    }

    private static UpbMessage g(long j, long j2, UpbMiniTable upbMiniTable) {
        UpbArena upbArenaB = UpbArena.b(j2);
        if (upbArenaB != null) {
            return new UpbMessage(j, upbMiniTable, upbArenaB);
        }
        throw new IllegalStateException("Failed to wrap arena");
    }

    private final void h(int i) {
        i(i, this.f);
    }

    private static void i(int i, oui ouiVar) {
        if (j(i)) {
            return;
        }
        osk.a(aslh.LOG_TYPE_UNKNOWN_EXTENSION, new oot(a.bR(i, "Unknown extension: ")), ouiVar);
    }

    private void invalidateLayer(PaintUnitLayer paintUnitLayer) {
        paintUnitLayer.a();
    }

    private void invalidateView(View view) {
        view.invalidate();
    }

    private static boolean j(int i) {
        int[] iArr = d;
        for (int i2 = 0; i2 < 2; i2++) {
            if (i == iArr[i2]) {
                return true;
            }
        }
        return false;
    }

    private static native long jniCreateUiBuilderCallback(UiBuilderCallbackImpl uiBuilderCallbackImpl);

    private static native void jniDeleteUiBuilderCallback(long j);

    private static native int jniGetInstanceCount();

    private final void k(long j, long j2, PaintUnit paintUnit, NodeTreeProcessor nodeTreeProcessor) {
        kjc kjcVar;
        PaintUnit paintUnit2;
        ElementsServices elementsServices;
        mew mewVar = new mew(g(j, j2, atlb.a));
        paintUnit.B(mewVar);
        long j3 = mewVar.c + 10;
        if (((Memory.peekByte(j3) & 2) == 0 && (Memory.peekByte(j3) & 32) == 0) || (kjcVar = this.g) == null) {
            return;
        }
        ElementsServices elementsServicesK = nodeTreeProcessor.k();
        long j4 = mewVar.c;
        if (Memory.peekByte(j4 + 14) == 0 && Memory.peekByte(j4 + 16) == 0) {
            return;
        }
        ovd ovdVarA = ovd.a(mewVar);
        if (Memory.peekByte(mewVar.c + 14) == 0 || !ovdVarA.a) {
            paintUnit2 = paintUnit;
            elementsServices = elementsServicesK;
        } else {
            paintUnit2 = paintUnit;
            elementsServices = elementsServicesK;
            paintUnit2.v(new rrw((ovg) kjcVar.a, paintUnit2, ovdVarA, elementsServices, 1), ovdVarA);
        }
        if (Memory.peekByte(mewVar.c + 16) != 0) {
            paintUnit2.v(new cmw(ovdVarA, elementsServices, 13), ovdVarA);
        }
    }

    private static final void l(mew mewVar, View view) {
        view.setTranslationX(Float.intBitsToFloat(Memory.peekInt(mewVar.c + 52, false)));
        view.setTranslationY(Float.intBitsToFloat(Memory.peekInt(mewVar.c + 56, false)));
        view.setRotation(Float.intBitsToFloat(Memory.peekInt(mewVar.c + 48, false)));
        long j = mewVar.c;
        view.setScaleX((Memory.peekByte(j + 11) & 8) != 0 ? Float.intBitsToFloat(Memory.peekInt(j + 112, false)) : 1.0f);
        long j2 = mewVar.c;
        view.setScaleY((Memory.peekByte(11 + j2) & 16) != 0 ? Float.intBitsToFloat(Memory.peekInt(j2 + 116, false)) : 1.0f);
        long j3 = mewVar.c;
        float fIntBitsToFloat = (Memory.peekByte(8 + j3) & 4) != 0 ? Float.intBitsToFloat(Memory.peekInt(j3 + 36, false)) : 1.0f;
        PaintUnit paintUnitF = view instanceof oyn ? ((oyn) view).f() : null;
        if (Memory.peekByte(mewVar.c + 25) != 0 && paintUnitF != null && paintUnitF.o(fIntBitsToFloat)) {
            view.setAlpha(1.0f);
            return;
        }
        view.setAlpha(fIntBitsToFloat);
        if (paintUnitF != null) {
            paintUnitF.o(1.0f);
        }
    }

    private static PaintUnit m(mew mewVar, opm opmVar, ElementsServices elementsServices, float f, float f2, Object obj) {
        return obj != null ? opmVar.e(mewVar.d(opmVar.b()), elementsServices, f, f2, obj) : opmVar.d(mewVar.d(opmVar.b()), elementsServices);
    }

    private static boolean n(mew mewVar, opj opjVar, NodeViewInterface nodeViewInterface, NodeTreeProcessor nodeTreeProcessor) {
        mep mepVarA = opjVar.a();
        met metVarD = null;
        if (Memory.peekByte(FlagServices.b().c + 69) != 0) {
            UpbMessage upbMessageC = mewVar.b.c(mepVarA.a(), mepVarA.d());
            if (upbMessageC != null) {
                metVarD = mepVarA.c(upbMessageC);
            }
        } else if (mewVar.e(mepVarA)) {
            metVarD = mewVar.d(mepVarA);
        }
        if (metVarD == null) {
            i(mepVarA.a, nodeTreeProcessor.k().n());
            return false;
        }
        opjVar.b(metVarD, nodeViewInterface, nodeTreeProcessor.k(), nodeTreeProcessor.l());
        return true;
    }

    private static boolean o(mew mewVar, opm opmVar, NodeViewInterface nodeViewInterface) {
        return opmVar.g(mewVar.d(opmVar.b()), nodeViewInterface);
    }

    private PaintUnitLayer openLayer(PaintUnitOwner paintUnitOwner, int i) {
        return (PaintUnitLayer) paintUnitOwner.j(i);
    }

    private PaintUnit openPaintUnit(PaintUnitOwner paintUnitOwner, int i) {
        return paintUnitOwner.j(i);
    }

    private NodeViewInterface openView(Object obj, int i) {
        if (obj instanceof ooy) {
            return (NodeViewInterface) ((ooy) obj).getChildAt(i);
        }
        oyk oykVar = (oyk) obj;
        return oykVar.ao() ? (NodeViewInterface) oykVar.ie(i) : (NodeViewInterface) oykVar.getChildAt(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    private void removeChildView(ViewGroup viewGroup, NodeViewInterface nodeViewInterface) {
        View view = (View) nodeViewInterface;
        if (viewGroup instanceof oyk) {
            oyk oykVar = (oyk) viewGroup;
            if (oykVar.ao()) {
                oykVar.am(view);
            } else {
                viewGroup.removeView(view);
            }
        } else {
            viewGroup.removeView(view);
        }
        a(view);
    }

    private void removeChildViewAt(ViewGroup viewGroup, int i) {
        if (viewGroup instanceof oyk) {
            oyk oykVar = (oyk) viewGroup;
            if (oykVar.ao()) {
                View viewIe = oykVar.ie(i);
                if (viewIe != null) {
                    oykVar.am(viewIe);
                    a(viewIe);
                    return;
                }
                return;
            }
        }
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            viewGroup.removeView(childAt);
            a(childAt);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void removeChildViewForMove(ViewGroup viewGroup, NodeViewInterface nodeViewInterface) {
        View view = (View) nodeViewInterface;
        if (viewGroup instanceof oyk) {
            oyk oykVar = (oyk) viewGroup;
            if (oykVar.ao()) {
                oykVar.am(view);
                return;
            }
        }
        viewGroup.removeView(view);
    }

    private void removePaintUnit(PaintUnitOwner paintUnitOwner, int i) {
        paintUnitOwner.ij(i);
    }

    private void removePaintUnitForMove(PaintUnitOwner paintUnitOwner, int i) {
        paintUnitOwner.ik(i);
    }

    private boolean updateBounds(NodeViewInterface nodeViewInterface, int i, int i2, int i3, int i4, boolean z) {
        nodeViewInterface.t(i, i2, i3 + i, i4 + i2);
        nodeViewInterface.M(z);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void a(View view) {
        opo opoVar = this.c;
        if (opoVar == null || !(view instanceof NodeViewInterface)) {
            return;
        }
        opoVar.b((NodeViewInterface) view);
    }

    boolean applyPaintTypeExtension(long j, long j2, int i, PaintUnit paintUnit, int i2, NodeTreeProcessor nodeTreeProcessor) {
        ElementsServices elementsServicesK = nodeTreeProcessor.k();
        mew mewVar = new mew(f(j, j2, atoe.a), (byte[][]) null);
        opm opmVarI = elementsServicesK.I(i);
        if (opmVarI == null) {
            h(i);
            return false;
        }
        return opmVarI.h(mewVar.d(opmVarI.b()), paintUnit, nodeTreeProcessor.n(i2));
    }

    boolean applyProperties(long j, long j2, long j3, NodeViewInterface nodeViewInterface, NodeTreeProcessor nodeTreeProcessor) {
        mew mewVar = new mew(f(j, j2, atlb.a));
        nodeViewInterface.getClass();
        int iA = nvc.a(nodeViewInterface);
        if (iA == 0) {
            d(mewVar, j3, (oyn) nodeViewInterface, nodeTreeProcessor);
        } else if (iA != 1) {
            b(mewVar, j3, nodeViewInterface, nodeTreeProcessor);
        } else {
            c(mewVar, j3, (oyk) nodeViewInterface, nodeTreeProcessor);
        }
        return true;
    }

    boolean applyTypeExtension(long j, long j2, int i, NodeViewInterface nodeViewInterface, int i2, NodeTreeProcessor nodeTreeProcessor) {
        opm opmVarI = nodeTreeProcessor.k().I(i);
        if (opmVarI == null) {
            h(i);
            return false;
        }
        Object objN = nodeTreeProcessor.n(i2);
        return objN != null ? opmVarI.i(nodeViewInterface, objN) : o(new mew(g(j, j2, atoe.a), (byte[][]) null), opmVarI, nodeViewInterface);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(mew mewVar, long j, NodeViewInterface nodeViewInterface, NodeTreeProcessor nodeTreeProcessor) {
        kjc kjcVar;
        View view = (View) nodeViewInterface;
        l(mewVar, view);
        long j2 = mewVar.c;
        if ((Memory.peekByte(j2 + 8) & 8) != 0) {
            nodeViewInterface.F(Float.intBitsToFloat(Memory.peekInt(j2 + 40, false)));
        }
        long j3 = mewVar.c;
        if ((Memory.peekByte(j3 + 8) & 2) != 0) {
            nodeViewInterface.C(Memory.peekInt(j3 + 32, false));
        }
        nodeViewInterface.E(Float.intBitsToFloat(Memory.peekInt(mewVar.c + 44, false)));
        long j4 = mewVar.c;
        long j5 = j4 + 9;
        if ((Memory.peekByte(j5) & 16) != 0) {
            int iIntBitsToFloat = (int) Float.intBitsToFloat(Memory.peekInt(j4 + 76, false));
            view.setPadding(iIntBitsToFloat, iIntBitsToFloat, iIntBitsToFloat, iIntBitsToFloat);
        } else if ((Memory.peekByte(j5) & 1) != 0 || (Memory.peekByte(j5) & 2) != 0 || (Memory.peekByte(j5) & 4) != 0 || (Memory.peekByte(j5) & 8) != 0) {
            view.setPadding((int) Float.intBitsToFloat(Memory.peekInt(j4 + 60, false)), (int) Float.intBitsToFloat(Memory.peekInt(mewVar.c + 64, false)), (int) Float.intBitsToFloat(Memory.peekInt(mewVar.c + 68, false)), (int) Float.intBitsToFloat(Memory.peekInt(mewVar.c + 72, false)));
        }
        long j6 = mewVar.c;
        if ((Memory.peekByte(9 + j6) & 32) != 0) {
            float fIntBitsToFloat = Float.intBitsToFloat(Memory.peekInt(j6 + 80, false));
            long j7 = mewVar.c;
            nodeViewInterface.O(fIntBitsToFloat, Memory.peekInt(84 + j7, false), Float.intBitsToFloat(Memory.peekInt(j7 + 88, false)), Float.intBitsToFloat(Memory.peekInt(mewVar.c + 92, false)));
        }
        if (view instanceof NodeViewInternalInterface) {
            ((NodeViewInternalInterface) view).Y(Memory.peekByte(mewVar.c + 18) != 0);
        } else {
            long j8 = mewVar.c;
            if (Memory.peekByte(18 + j8) != 0) {
                view.setLayerType((Float.intBitsToFloat(Memory.peekInt(j8 + 44, false)) > 0.0f || Float.intBitsToFloat(Memory.peekInt(mewVar.c + 48, false)) % 90.0f != 0.0f || Memory.peekByte(FlagServices.b().c + 93) == 0) ? 2 : 0, null);
                view.setClipToOutline(true);
            } else {
                view.setLayerType(0, null);
                view.setClipToOutline(false);
            }
        }
        if ((Memory.peekByte(mewVar.c + 8) & 1) != 0) {
            oul oulVarO = nodeViewInterface.o();
            long j9 = mewVar.c;
            oulVarO.g = Memory.peekInt(28 + j9, false);
            if ((Memory.peekByte(j9 + 8) & 16) != 0) {
                oulVarO.h = Float.intBitsToFloat(Memory.peekInt(j9 + 44, false));
            }
        } else {
            nodeViewInterface.x();
        }
        long j10 = mewVar.c + 10;
        if (((Memory.peekByte(j10) & 2) != 0 || (Memory.peekByte(j10) & 32) != 0) && (kjcVar = this.g) != null) {
            kjcVar.L(mewVar, nodeViewInterface, nodeTreeProcessor.k());
        }
        e(nodeViewInterface, mewVar);
        nodeViewInterface.L(j);
        nodeViewInterface.P(Memory.peekByte(mewVar.c + 17) != 0);
    }

    public final void c(mew mewVar, long j, oyk oykVar, NodeTreeProcessor nodeTreeProcessor) {
        kjc kjcVar;
        l(mewVar, oykVar);
        long j2 = mewVar.c;
        if ((Memory.peekByte(j2 + 8) & 8) != 0) {
            oykVar.F(Float.intBitsToFloat(Memory.peekInt(j2 + 40, false)));
        }
        long j3 = mewVar.c;
        if ((Memory.peekByte(j3 + 8) & 2) != 0) {
            oykVar.C(Memory.peekInt(j3 + 32, false));
        }
        oykVar.E(Float.intBitsToFloat(Memory.peekInt(mewVar.c + 44, false)));
        long j4 = mewVar.c;
        long j5 = j4 + 9;
        if ((Memory.peekByte(j5) & 16) != 0) {
            int iIntBitsToFloat = (int) Float.intBitsToFloat(Memory.peekInt(j4 + 76, false));
            oykVar.setPadding(iIntBitsToFloat, iIntBitsToFloat, iIntBitsToFloat, iIntBitsToFloat);
        } else if ((Memory.peekByte(j5) & 1) != 0 || (Memory.peekByte(j5) & 2) != 0 || (Memory.peekByte(j5) & 4) != 0 || (Memory.peekByte(j5) & 8) != 0) {
            oykVar.setPadding((int) Float.intBitsToFloat(Memory.peekInt(j4 + 60, false)), (int) Float.intBitsToFloat(Memory.peekInt(mewVar.c + 64, false)), (int) Float.intBitsToFloat(Memory.peekInt(mewVar.c + 68, false)), (int) Float.intBitsToFloat(Memory.peekInt(mewVar.c + 72, false)));
        }
        long j6 = mewVar.c;
        if ((Memory.peekByte(9 + j6) & 32) != 0) {
            float fIntBitsToFloat = Float.intBitsToFloat(Memory.peekInt(j6 + 80, false));
            long j7 = mewVar.c;
            oykVar.O(fIntBitsToFloat, Memory.peekInt(84 + j7, false), Float.intBitsToFloat(Memory.peekInt(j7 + 88, false)), Float.intBitsToFloat(Memory.peekInt(mewVar.c + 92, false)));
        }
        oykVar.Y(Memory.peekByte(mewVar.c + 18) != 0);
        if ((Memory.peekByte(mewVar.c + 8) & 1) != 0) {
            oul oulVarO = oykVar.o();
            long j8 = mewVar.c;
            oulVarO.g = Memory.peekInt(28 + j8, false);
            if ((Memory.peekByte(8 + j8) & 16) != 0) {
                oulVarO.h = Float.intBitsToFloat(Memory.peekInt(j8 + 44, false));
            }
        } else {
            oykVar.x();
        }
        e(oykVar, mewVar);
        long j9 = mewVar.c + 10;
        if (((Memory.peekByte(j9) & 2) != 0 || (Memory.peekByte(j9) & 32) != 0) && (kjcVar = this.g) != null) {
            kjcVar.L(mewVar, oykVar, nodeTreeProcessor.k());
        }
        oykVar.y = j;
        oykVar.P(Memory.peekByte(mewVar.c + 17) != 0);
    }

    @Override // defpackage.opn, java.lang.AutoCloseable
    public final void close() {
        if (this.e.getAndSet(true)) {
            return;
        }
        jniDeleteUiBuilderCallback(this.b);
    }

    PaintUnitLayer createAndAddLayer(long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, long j3, long j4, PaintUnitOwner paintUnitOwner, NodeTreeProcessor nodeTreeProcessor) {
        PaintUnitLayer paintUnitLayerCreateLayer = createLayer(j, j2, i, i2, i3, i4, i5, i6, j3, j4, nodeTreeProcessor);
        addPaintUnit(paintUnitOwner, paintUnitLayerCreateLayer);
        return paintUnitLayerCreateLayer;
    }

    PaintUnit createAndAddPaintUnit(long j, long j2, int i, float f, float f2, float f3, float f4, boolean z, long j3, int i2, boolean z2, PaintUnitOwner paintUnitOwner, NodeTreeProcessor nodeTreeProcessor) {
        PaintUnit paintUnitCreatePaintUnit = createPaintUnit(j, j2, i, f, f2, f3, f4, z, j3, i2, z2, nodeTreeProcessor);
        if (paintUnitCreatePaintUnit != null) {
            addPaintUnit(paintUnitOwner, paintUnitCreatePaintUnit);
        }
        return paintUnitCreatePaintUnit;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    public PaintUnitLayer createLayer(long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, long j3, long j4, NodeTreeProcessor nodeTreeProcessor) {
        int i7;
        PaintUnitLayer paintUnitLayer;
        NodeTreeProcessor nodeTreeProcessor2;
        PaintUnitLayer ousVar;
        ElementsServices elementsServicesK;
        opm opmVarI;
        aga agaVar = this.a;
        Object objA = agaVar != null ? agaVar.a(i6) : null;
        if (i == 0) {
            i7 = 0;
            if (objA instanceof PaintUnitLayer) {
                paintUnitLayer = (PaintUnitLayer) objA;
            }
            if (paintUnitLayer != null && i7 != 0 && (opmVarI = (elementsServicesK = nodeTreeProcessor.k()).I(i7)) != null) {
                nodeTreeProcessor2 = nodeTreeProcessor;
                Object objN = nodeTreeProcessor2.n(i6);
                PaintUnit paintUnitM = objN instanceof PaintUnit ? (PaintUnit) objN : null;
                if (paintUnitM == null) {
                    paintUnitM = m(new mew(g(j, j2, atoe.a), (byte[][]) null), opmVarI, elementsServicesK, i4, i5, objN);
                }
                if (paintUnitM instanceof PaintUnitLayer) {
                    ousVar = (PaintUnitLayer) paintUnitM;
                }
                if (ousVar == null) {
                    ousVar = new ous();
                }
                ousVar.w(i6);
                ousVar.t(i2, i3, i4 + i2, i5 + i3);
                k(j3, j4, ousVar, nodeTreeProcessor2);
                return ousVar;
            }
            nodeTreeProcessor2 = nodeTreeProcessor;
            paintUnitLayer = paintUnitLayer;
            ousVar = paintUnitLayer;
            if (ousVar == null) {
                ousVar = new ous();
            }
            ousVar.w(i6);
            ousVar.t(i2, i3, i4 + i2, i5 + i3);
            k(j3, j4, ousVar, nodeTreeProcessor2);
            return ousVar;
        }
        i7 = i;
        paintUnitLayer = null;
        if (paintUnitLayer != null) {
            nodeTreeProcessor2 = nodeTreeProcessor;
            paintUnitLayer = paintUnitLayer;
            ousVar = paintUnitLayer;
        } else {
            nodeTreeProcessor2 = nodeTreeProcessor;
            paintUnitLayer = paintUnitLayer;
            ousVar = paintUnitLayer;
        }
        if (ousVar == null) {
            ousVar = new ous();
        }
        ousVar.w(i6);
        ousVar.t(i2, i3, i4 + i2, i5 + i3);
        k(j3, j4, ousVar, nodeTreeProcessor2);
        return ousVar;
    }

    public PaintUnit createPaintUnit(long j, long j2, int i, float f, float f2, float f3, float f4, boolean z, long j3, int i2, boolean z2, NodeTreeProcessor nodeTreeProcessor) {
        PaintUnit paintUnitM;
        ElementsServices elementsServicesK = nodeTreeProcessor.k();
        opm opmVarI = elementsServicesK.I(i);
        if (opmVarI == null) {
            osk.a(aslh.LOG_TYPE_UNKNOWN_EXTENSION, new oot(a.bR(i, "Unknown Type extension: ")), elementsServicesK.n());
            return null;
        }
        Object objN = nodeTreeProcessor.n(i2);
        if (z2) {
            paintUnitM = opmVarI.f(elementsServicesK);
        } else {
            paintUnitM = objN instanceof PaintUnit ? (PaintUnit) objN : null;
        }
        if (paintUnitM == null) {
            paintUnitM = m(new mew(g(j, j2, atoe.a), (byte[][]) null), opmVarI, elementsServicesK, f3, f4, objN);
        }
        if (paintUnitM == null) {
            this.f.a(aslh.LOG_TYPE_INTERNAL_ERROR, "Failed to create PaintUnit");
            return null;
        }
        paintUnitM.t((int) f, (int) f2, (int) (f + f3), (int) (f2 + f4));
        paintUnitM.e(z);
        paintUnitM.w(i2);
        return paintUnitM;
    }

    NodeViewInterface createView(long j, long j2, int i, int i2, int i3, int i4, int i5, boolean z, int i6, NodeTreeProcessor nodeTreeProcessor) {
        NodeViewInterface nodeViewInterfaceC;
        opm opmVarI = nodeTreeProcessor.k().I(i);
        if (opmVarI == null) {
            h(i);
            nodeViewInterfaceC = null;
        } else {
            opo opoVar = this.c;
            if (opoVar != null) {
                nodeViewInterfaceC = opoVar.a(opmVarI, nodeTreeProcessor);
            } else {
                nodeViewInterfaceC = opmVarI.c(nodeTreeProcessor);
                nodeViewInterfaceC.R(opmVarI.b().a);
            }
        }
        if (nodeViewInterfaceC == null) {
            nodeViewInterfaceC = new oyk(nodeTreeProcessor);
        }
        nodeViewInterfaceC.S(i6);
        nodeViewInterfaceC.t(i2, i3, i4 + i2, i5 + i3);
        return nodeViewInterfaceC;
    }

    NodeViewInterface createViewWithTypeExtension(long j, long j2, int i, int i2, int i3, int i4, int i5, boolean z, int i6, NodeTreeProcessor nodeTreeProcessor) {
        NodeViewInterface nodeViewInterfaceC;
        opm opmVarI = nodeTreeProcessor.k().I(i);
        if (opmVarI == null) {
            osk.a(aslh.LOG_TYPE_UNKNOWN_EXTENSION, new oot(a.bR(i, "Unknown Type extension: ")), nodeTreeProcessor.k().n());
            return new oyk(nodeTreeProcessor);
        }
        int i7 = i5 + i3;
        int i8 = i4 + i2;
        opo opoVar = this.c;
        if (opoVar != null) {
            nodeViewInterfaceC = opoVar.a(opmVarI, nodeTreeProcessor);
        } else {
            nodeViewInterfaceC = opmVarI.c(nodeTreeProcessor);
            nodeViewInterfaceC.R(opmVarI.b().a);
        }
        nodeViewInterfaceC.S(i6);
        nodeViewInterfaceC.t(i2, i3, i8, i7);
        nodeViewInterfaceC.M(z);
        Object objN = nodeTreeProcessor.n(i6);
        if (!(objN != null ? opmVarI.i(nodeViewInterfaceC, objN) : o(new mew(g(j, j2, atoe.a), (byte[][]) null), opmVarI, nodeViewInterfaceC))) {
            this.f.a(aslh.LOG_TYPE_INTERNAL_ERROR, a.bR(i, "Failed to create View and apply type extension:"));
        }
        return nodeViewInterfaceC;
    }

    public final void d(mew mewVar, long j, oyn oynVar, NodeTreeProcessor nodeTreeProcessor) {
        kjc kjcVar;
        l(mewVar, oynVar);
        long j2 = mewVar.c;
        if ((Memory.peekByte(j2 + 8) & 8) != 0) {
            oynVar.F(Float.intBitsToFloat(Memory.peekInt(j2 + 40, false)));
        }
        long j3 = mewVar.c;
        if ((Memory.peekByte(j3 + 8) & 2) != 0) {
            oynVar.C(Memory.peekInt(j3 + 32, false));
        }
        oynVar.E(Float.intBitsToFloat(Memory.peekInt(mewVar.c + 44, false)));
        long j4 = mewVar.c;
        long j5 = j4 + 9;
        if ((Memory.peekByte(j5) & 16) != 0) {
            int iIntBitsToFloat = (int) Float.intBitsToFloat(Memory.peekInt(j4 + 76, false));
            oynVar.setPadding(iIntBitsToFloat, iIntBitsToFloat, iIntBitsToFloat, iIntBitsToFloat);
        } else if ((Memory.peekByte(j5) & 1) != 0 || (Memory.peekByte(j5) & 2) != 0 || (Memory.peekByte(j5) & 4) != 0 || (Memory.peekByte(j5) & 8) != 0) {
            oynVar.setPadding((int) Float.intBitsToFloat(Memory.peekInt(j4 + 60, false)), (int) Float.intBitsToFloat(Memory.peekInt(mewVar.c + 64, false)), (int) Float.intBitsToFloat(Memory.peekInt(mewVar.c + 68, false)), (int) Float.intBitsToFloat(Memory.peekInt(mewVar.c + 72, false)));
        }
        long j6 = mewVar.c;
        if ((Memory.peekByte(9 + j6) & 32) != 0) {
            float fIntBitsToFloat = Float.intBitsToFloat(Memory.peekInt(j6 + 80, false));
            long j7 = mewVar.c;
            oynVar.O(fIntBitsToFloat, Memory.peekInt(84 + j7, false), Float.intBitsToFloat(Memory.peekInt(j7 + 88, false)), Float.intBitsToFloat(Memory.peekInt(mewVar.c + 92, false)));
        }
        oynVar.Y(Memory.peekByte(mewVar.c + 18) != 0);
        if ((Memory.peekByte(mewVar.c + 8) & 1) != 0) {
            oul oulVarO = oynVar.o();
            long j8 = mewVar.c;
            oulVarO.g = Memory.peekInt(28 + j8, false);
            if ((Memory.peekByte(8 + j8) & 16) != 0) {
                oulVarO.h = Float.intBitsToFloat(Memory.peekInt(j8 + 44, false));
            }
        } else {
            oynVar.x();
        }
        e(oynVar, mewVar);
        long j9 = mewVar.c + 10;
        if (((Memory.peekByte(j9) & 2) != 0 || (Memory.peekByte(j9) & 32) != 0) && (kjcVar = this.g) != null) {
            kjcVar.L(mewVar, oynVar, nodeTreeProcessor.k());
        }
        oynVar.d = j;
        oynVar.e = Memory.peekByte(mewVar.c + 17) != 0;
    }

    void handleEvents(PaintUnit paintUnit, long j) {
        paintUnit.A();
    }

    void handleViewEvents(NodeViewInterface nodeViewInterface, long j) {
        nodeViewInterface.U();
    }

    /* JADX WARN: Multi-variable type inference failed */
    void insertChildView(ViewGroup viewGroup, NodeViewInterface nodeViewInterface, int i) {
        if (viewGroup instanceof oyk) {
            oyk oykVar = (oyk) viewGroup;
            if (oykVar.ao()) {
                oykVar.mo912if((View) nodeViewInterface, i);
                return;
            }
        }
        viewGroup.addView((View) nodeViewInterface, i);
    }

    void insertPaintUnit(PaintUnitOwner paintUnitOwner, PaintUnit paintUnit, int i) {
        paintUnitOwner.ii(paintUnit, i);
    }

    void removeAllChildren(PaintUnitOwner paintUnitOwner, boolean z) {
        paintUnitOwner.s(z);
    }

    boolean updatePaintUnitBounds(PaintUnit paintUnit, int i, int i2, int i3, int i4, boolean z) {
        paintUnit.t(i, i2, i3 + i, i4 + i2);
        paintUnit.e(z);
        return true;
    }

    private boolean applyPaintUnitProperties(long j, long j2, PaintUnit paintUnit, NodeTreeProcessor nodeTreeProcessor) {
        k(j, j2, paintUnit, nodeTreeProcessor);
        return true;
    }
}
