package defpackage;

import android.R;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;
import com.google.android.libraries.multiplatform.elements.NodeViewInternalInterface;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner;
import j$.util.Map;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class osy {
    public static final /* synthetic */ int a = 0;
    private static final Set b = Collections.newSetFromMap(new WeakHashMap());
    private static final int[] c = {R.attr.state_pressed, R.attr.state_enabled};
    private static final int[] d = new int[0];
    private static final WeakHashMap e = new WeakHashMap();

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, oou] */
    public static oou a(ElementsServices elementsServices) {
        agfr agfrVarT;
        rbm rbmVar;
        if (elementsServices == null || (agfrVarT = elementsServices.t()) == null || (rbmVar = (rbm) agfrVarT.io()) == null) {
            return null;
        }
        return rbmVar.b;
    }

    public static boolean b(ElementsServices elementsServices, View view, Rect rect) {
        View viewA;
        oou oouVarA = a(elementsServices);
        if (oouVarA == null || !oouVarA.d() || (viewA = oouVarA.a()) == null) {
            return false;
        }
        if (!viewA.equals(view)) {
            if ((viewA.isAttachedToWindow() && view.isAttachedToWindow() && !Objects.equals(viewA.getRootView(), view.getRootView())) || !f(view, viewA)) {
                return false;
            }
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            viewA.getLocationOnScreen(iArr);
            view.getLocationOnScreen(iArr2);
            rect.offset(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0233  */
    /* JADX WARN: Code duplicated, block: B:126:0x023b  */
    /* JADX WARN: Code duplicated, block: B:128:0x023f  */
    /* JADX WARN: Code duplicated, block: B:130:0x025d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0279  */
    /* JADX WARN: Code duplicated, block: B:134:0x0293  */
    /* JADX WARN: Code duplicated, block: B:137:0x0298  */
    /* JADX WARN: Code duplicated, block: B:140:0x02a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:142:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:149:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:151:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:152:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:154:0x02c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:156:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:159:0x02e4 A[DONT_INVERT, PHI: r1 r2
      0x02e4: PHI (r1v1 com.google.android.libraries.multiplatform.elements.NodeTreeProcessor) = 
      (r1v4 com.google.android.libraries.multiplatform.elements.NodeTreeProcessor)
      (r1v7 com.google.android.libraries.multiplatform.elements.NodeTreeProcessor)
     binds: [B:156:0x02cb, B:158:0x02e2] A[DONT_GENERATE, DONT_INLINE]
      0x02e4: PHI (r2v1 int) = (r2v2 int), (r2v3 int) binds: [B:156:0x02cb, B:158:0x02e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:160:0x02e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:173:0x0337  */
    /* JADX WARN: Code duplicated, block: B:176:0x033f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x034b  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [oou] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r25v0, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16 */
    public static boolean c(View view, int i, NodeTreeProcessor nodeTreeProcessor, boolean z, MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        ElementsServices elementsServicesH;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i2;
        NodeTreeProcessor nodeTreeProcessor2;
        boolean zE;
        osx osxVar;
        int iD;
        PaintUnit paintUnitIh;
        long j;
        boolean z8;
        int iC;
        Rect rectF;
        MotionEvent motionEventObtain;
        boolean zY;
        int i3;
        agfr agfrVarT;
        osv osvVar;
        boolean z9 = view instanceof NodeViewInterface;
        if (z9) {
            NodeViewInterface nodeViewInterface = (NodeViewInterface) view;
            if (nodeViewInterface.T() && (osvVar = nodeViewInterface.n().c) != null) {
                osvVar.a(view, motionEvent);
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z2 = true;
        } else if (actionMasked == 3) {
            actionMasked = 3;
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z10 = Memory.peekByte(FlagServices.b().c + 81) != 0;
        if (z2) {
            z3 = true;
        } else if (z10 && actionMasked == 6) {
            actionMasked = 6;
            z3 = true;
        } else {
            z3 = false;
        }
        boolean zRemove = z2 ? b.remove(view) : false;
        if (nodeTreeProcessor != null) {
            elementsServicesH = nodeTreeProcessor.k();
        } else if (z9) {
            NodeViewInterface nodeViewInterface2 = (NodeViewInterface) view;
            try {
                if (nodeViewInterface2.h() != null) {
                    elementsServicesH = nodeViewInterface2.h();
                } else if (view instanceof ooy) {
                    elementsServicesH = ((ooy) view).a;
                } else {
                    elementsServicesH = null;
                }
            } catch (NullPointerException unused) {
            }
        } else if (view instanceof ooy) {
            elementsServicesH = ((ooy) view).a;
        } else {
            elementsServicesH = null;
        }
        rbm rbmVar = (elementsServicesH == null || (agfrVarT = elementsServicesH.t()) == null) ? null : (rbm) agfrVarT.io();
        ?? r15 = rbmVar != null ? rbmVar.b : 0;
        if (!z || r15 == 0) {
            z4 = z2;
            z5 = z10;
            z6 = zRemove;
        } else {
            osx osxVar2 = (osx) Map.EL.computeIfAbsent(e, view, new ixa(20));
            int scaledTouchSlop = osxVar2.d;
            if (scaledTouchSlop < 0) {
                if (elementsServicesH.N() != null) {
                    scaledTouchSlop = elementsServicesH.N().b;
                }
                if (scaledTouchSlop < 0) {
                    scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
                    if (elementsServicesH.N() != null) {
                        elementsServicesH.N().b = scaledTouchSlop;
                    }
                }
                osxVar2.d = scaledTouchSlop;
            }
            if (actionMasked == 0 || !osxVar2.f) {
                view.getLocationOnScreen(osxVar2.e);
                osxVar2.f = true;
            }
            int[] iArr = osxVar2.e;
            MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
            boolean z11 = true;
            motionEventObtain2.offsetLocation(iArr[0], iArr[1]);
            boolean zC = r15.c(motionEventObtain2);
            motionEventObtain2.recycle();
            if (zC || (i3 = ((oxe) r15).A) == 2 || i3 == 5) {
                ViewParent parent = view.getParent();
                while (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(z11);
                    parent = parent.getParent();
                    z11 = true;
                }
                if (zC) {
                    return true;
                }
            }
            if (actionMasked == 0) {
                osxVar2.a = motionEvent.getX();
                float y = motionEvent.getY();
                osxVar2.b = y;
                osxVar2.c = false;
                if (r15.f() && !r15.e(iArr[0] + osxVar2.a, iArr[1] + y)) {
                    r15.b();
                }
            } else if (actionMasked != 2) {
                z4 = z2;
                z5 = z10;
                z6 = zRemove;
                if (actionMasked == 1) {
                    if (!osxVar2.c && r15.f() && !r15.e(iArr[0] + motionEvent.getX(), iArr[1] + motionEvent.getY())) {
                        r15.b();
                    }
                    osxVar2.f = false;
                } else if (actionMasked == 3) {
                    osxVar2.f = false;
                }
            } else if (!osxVar2.c) {
                z4 = z2;
                z5 = z10;
                z6 = zRemove;
                if (Math.hypot(motionEvent.getX() - osxVar2.a, motionEvent.getY() - osxVar2.b) > osxVar2.d) {
                    osxVar2.c = true;
                }
            }
            z4 = z2;
            z5 = z10;
            z6 = zRemove;
        }
        if (nodeTreeProcessor == null) {
            return e(view, motionEvent);
        }
        int iB = nodeTreeProcessor.b();
        int actionIndex = motionEvent.getActionIndex();
        float x = motionEvent.getX(actionIndex);
        float[] fArr = {x, motionEvent.getY(actionIndex)};
        if (i == iB) {
            fArr[0] = x - view.getPaddingLeft();
            fArr[1] = fArr[1] - view.getPaddingTop();
        } else {
            Rect rectF2 = nodeTreeProcessor.f(i);
            fArr[0] = fArr[0] + rectF2.left;
            fArr[1] = fArr[1] + rectF2.top;
        }
        if (rbmVar != null && ((nsx) ((WeakHashMap) rbmVar.a).get(view)) != null) {
            throw null;
        }
        long jE = nodeTreeProcessor.e(fArr[0], fArr[1]);
        if ((!z3 || z6) && jE != i) {
            if (jE == -2 && z) {
                jE = -2;
                iD = nodeTreeProcessor.d(fArr[0], fArr[1]);
                if (view instanceof PaintUnitOwner) {
                    paintUnitIh = ((PaintUnitOwner) view).ih(iD);
                } else {
                    paintUnitIh = null;
                }
                if (paintUnitIh != null) {
                    rectF = nodeTreeProcessor.f(iD);
                    motionEventObtain = MotionEvent.obtain(motionEvent);
                    if (Memory.peekByte(FlagServices.b().c + 58) != 0) {
                        motionEventObtain.offsetLocation((fArr[0] - rectF.left) - motionEvent.getX(actionIndex), (fArr[1] - rectF.top) - motionEvent.getY(actionIndex));
                    } else {
                        motionEventObtain.setLocation(fArr[0] - rectF.left, fArr[1] - rectF.top);
                    }
                    zY = paintUnitIh.y(motionEventObtain, view);
                    motionEventObtain.recycle();
                    if (zY) {
                        g(view, iD, motionEvent, nodeTreeProcessor, fArr);
                        return true;
                    }
                }
                if (jE == r11) {
                    if (!z) {
                        j = -2;
                    } else if (iD != -1) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (paintUnitIh == null || z8 || z3) {
                        i2 = actionMasked;
                        nodeTreeProcessor2 = nodeTreeProcessor;
                        iC = nodeTreeProcessor2.c(i2, fArr[0], fArr[1], motionEvent.getEventTime());
                        if (iC == -1) {
                            z7 = true;
                            g(view, iC, motionEvent, nodeTreeProcessor2, fArr);
                        }
                    } else {
                        nodeTreeProcessor2 = nodeTreeProcessor;
                        i2 = actionMasked;
                    }
                } else {
                    j = jE;
                }
                if (!z || j != i || iD == i || Memory.peekByte(FlagServices.b().c + 100) == 0) {
                    z8 = false;
                } else if (iD != -1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (paintUnitIh == null) {
                }
                i2 = actionMasked;
                nodeTreeProcessor2 = nodeTreeProcessor;
                iC = nodeTreeProcessor2.c(i2, fArr[0], fArr[1], motionEvent.getEventTime());
                if (iC == -1) {
                    z7 = true;
                    g(view, iC, motionEvent, nodeTreeProcessor2, fArr);
                }
            } else {
                nodeTreeProcessor2 = nodeTreeProcessor;
                i2 = actionMasked;
            }
            if (z4 || !z5 || (osxVar = (osx) e.get(view)) == null) {
                z7 = true;
            } else {
                SparseArray sparseArray = osxVar.g;
                if (sparseArray.size() > 0) {
                    for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                        aami aamiVar = (aami) sparseArray.valueAt(i4);
                        PaintUnit paintUnit = (PaintUnit) ((WeakReference) aamiVar.b).get();
                        if (paintUnit != null) {
                            float f = fArr[0];
                            float f2 = fArr[1];
                            Rect rectF3 = nodeTreeProcessor2.f(aamiVar.a);
                            paintUnit.u(d, f - rectF3.left, f2 - rectF3.top);
                        }
                    }
                    z7 = true;
                    sparseArray.clear();
                } else {
                    z7 = true;
                }
            }
            zE = e(view, motionEvent);
            if (zE || i2 != 0) {
                return zE;
            }
            b.add(view);
        } else {
            iD = nodeTreeProcessor.d(fArr[0], fArr[1]);
            if (view instanceof PaintUnitOwner) {
                paintUnitIh = ((PaintUnitOwner) view).ih(iD);
            } else {
                paintUnitIh = null;
            }
            if (paintUnitIh != null) {
                rectF = nodeTreeProcessor.f(iD);
                motionEventObtain = MotionEvent.obtain(motionEvent);
                if (Memory.peekByte(FlagServices.b().c + 58) != 0) {
                    motionEventObtain.offsetLocation((fArr[0] - rectF.left) - motionEvent.getX(actionIndex), (fArr[1] - rectF.top) - motionEvent.getY(actionIndex));
                } else {
                    motionEventObtain.setLocation(fArr[0] - rectF.left, fArr[1] - rectF.top);
                }
                zY = paintUnitIh.y(motionEventObtain, view);
                motionEventObtain.recycle();
                if (zY) {
                    g(view, iD, motionEvent, nodeTreeProcessor, fArr);
                    return true;
                }
            }
            if (jE == r11) {
                if (!z) {
                    j = -2;
                } else if (iD != -1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (paintUnitIh == null) {
                }
                i2 = actionMasked;
                nodeTreeProcessor2 = nodeTreeProcessor;
                iC = nodeTreeProcessor2.c(i2, fArr[0], fArr[1], motionEvent.getEventTime());
                if (iC == -1) {
                    if (z4) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    zE = e(view, motionEvent);
                    if (zE) {
                    }
                    return zE;
                }
                z7 = true;
                g(view, iC, motionEvent, nodeTreeProcessor2, fArr);
            } else {
                j = jE;
            }
            if (z) {
            }
            z8 = false;
            if (paintUnitIh == null) {
            }
            i2 = actionMasked;
            nodeTreeProcessor2 = nodeTreeProcessor;
            iC = nodeTreeProcessor2.c(i2, fArr[0], fArr[1], motionEvent.getEventTime());
            if (iC == -1) {
                if (z4) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                zE = e(view, motionEvent);
                if (zE) {
                }
                return zE;
            }
            z7 = true;
            g(view, iC, motionEvent, nodeTreeProcessor2, fArr);
        }
        return z7;
    }

    public static boolean d(ElementsServices elementsServices, View view) {
        View viewA;
        oou oouVarA = a(elementsServices);
        if (oouVarA == null || !oouVarA.d()) {
            return false;
        }
        if (view != null && (viewA = oouVarA.a()) != null) {
            if (viewA.equals(view) || f(viewA, view) || f(view, viewA)) {
                return false;
            }
            if (view.getParent() != null && Objects.equals(viewA.getParent(), view.getParent())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean e(View view, MotionEvent motionEvent) {
        if (view instanceof NodeViewInternalInterface) {
            return ((NodeViewInternalInterface) view).ab(motionEvent);
        }
        if (view instanceof ooy) {
            return ((ooy) view).C(motionEvent);
        }
        return false;
    }

    private static boolean f(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.equals(view)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    /* JADX WARN: Multi-variable type inference failed */
    private static void g(View view, int i, MotionEvent motionEvent, NodeTreeProcessor nodeTreeProcessor, float[] fArr) {
        PaintUnit paintUnitO;
        osx osxVar;
        PaintUnit paintUnitIh;
        PaintUnit paintUnitIh2 = null;
        if (Memory.peekByte(FlagServices.b().c + 105) == 0 || !(view instanceof NodeViewInterface)) {
            paintUnitO = null;
        } else {
            NodeViewInterface nodeViewInterface = (NodeViewInterface) view;
            if (nodeViewInterface.d() == i) {
                paintUnitO = nodeViewInterface.o();
            } else {
                paintUnitO = null;
            }
        }
        if (paintUnitO == null && (view instanceof PaintUnitOwner)) {
            paintUnitO = ((PaintUnitOwner) view).ih(i);
        }
        if (paintUnitO == null && (view instanceof NodeViewInterface)) {
            NodeViewInterface nodeViewInterface2 = (NodeViewInterface) view;
            if (nodeViewInterface2.d() == i) {
                paintUnitO = nodeViewInterface2.o();
            }
        }
        if (paintUnitO == null) {
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                if (view2 instanceof NodeViewInterface) {
                    NodeViewInterface nodeViewInterface3 = (NodeViewInterface) view2;
                    if (nodeViewInterface3.d() != i) {
                        if (!(view2 instanceof ooy)) {
                            if (!(view2 instanceof PaintUnitOwner) && (paintUnitIh = ((PaintUnitOwner) view2).ih(i)) != null) {
                                paintUnitIh2 = paintUnitIh;
                                break;
                            }
                            parent = view2.getParent();
                        } else {
                            paintUnitIh2 = ((ooy) view2).ih(i);
                            break;
                        }
                    } else {
                        paintUnitIh2 = nodeViewInterface3.o();
                        break;
                    }
                } else if (!(view2 instanceof ooy)) {
                    paintUnitIh2 = ((ooy) view2).ih(i);
                    break;
                } else {
                    if (!(view2 instanceof PaintUnitOwner)) {
                    }
                    parent = view2.getParent();
                }
            }
        } else {
            paintUnitIh2 = paintUnitO;
        }
        if (paintUnitIh2 != null) {
            int actionMasked = motionEvent.getActionMasked();
            motionEvent.getX();
            motionEvent.getY();
            Rect rectF = nodeTreeProcessor.f(i);
            boolean z = false;
            float f = fArr[0] - rectF.left;
            float f2 = fArr[1] - rectF.top;
            boolean z2 = Memory.peekByte(FlagServices.b().c + 81) != 0;
            if (actionMasked == 1 || actionMasked == 3) {
                z = true;
            } else if (z2 && actionMasked == 6) {
                z = true;
                actionMasked = 6;
            }
            if (actionMasked == 0) {
                paintUnitIh2.u(c, f, f2);
                if (z2) {
                    ((osx) Map.EL.computeIfAbsent(e, view, new ixa(20))).g.put(motionEvent.getPointerId(motionEvent.getActionIndex()), new aami(paintUnitIh2, i));
                    return;
                }
                return;
            }
            if (z) {
                paintUnitIh2.u(d, f, f2);
                if (!z2 || (osxVar = (osx) e.get(view)) == null) {
                    return;
                }
                if (actionMasked == 6) {
                    osxVar.g.remove(motionEvent.getPointerId(motionEvent.getActionIndex()));
                } else {
                    osxVar.g.clear();
                }
            }
        }
    }
}
