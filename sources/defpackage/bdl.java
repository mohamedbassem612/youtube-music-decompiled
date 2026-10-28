package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class bdl extends axx {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private final View mHost;
    private final AccessibilityManager mManager;
    private bdk mNodeProvider;
    private static final Rect INVALID_BOUNDS = new Rect(Alert.DURATION_SHOW_INDEFINITELY, Alert.DURATION_SHOW_INDEFINITELY, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final bdm NODE_ADAPTER = new bdi();
    private static final bdn SPARSE_VALUES_ADAPTER = new bdj();
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();
    private final int[] mTempGlobalRect = new int[2];
    int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    private int mHoveredVirtualViewId = Integer.MIN_VALUE;

    public bdl(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.mHost = view;
        this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    private boolean clearAccessibilityFocus(int i) {
        if (this.mAccessibilityFocusedVirtualViewId != i) {
            return false;
        }
        this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.mHost.invalidate();
        sendEventForVirtualView(i, 65536);
        return true;
    }

    private boolean clickKeyboardFocusedVirtualView() {
        int i = this.mKeyboardFocusedVirtualViewId;
        return i != Integer.MIN_VALUE && onPerformActionForVirtualView(i, 16, null);
    }

    private AccessibilityEvent createEvent(int i, int i2) {
        return i != -1 ? createEventForChild(i, i2) : createEventForHost(i2);
    }

    private AccessibilityEvent createEventForChild(int i, int i2) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        bbz bbzVarObtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i);
        accessibilityEventObtain.getText().add(bbzVarObtainAccessibilityNodeInfo.g());
        accessibilityEventObtain.setContentDescription(bbzVarObtainAccessibilityNodeInfo.f());
        accessibilityEventObtain.setScrollable(bbzVarObtainAccessibilityNodeInfo.W());
        accessibilityEventObtain.setPassword(bbzVarObtainAccessibilityNodeInfo.V());
        accessibilityEventObtain.setEnabled(bbzVarObtainAccessibilityNodeInfo.T());
        accessibilityEventObtain.setChecked(bbzVarObtainAccessibilityNodeInfo.S());
        onPopulateEventForVirtualView(i, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(bbzVarObtainAccessibilityNodeInfo.e());
        accessibilityEventObtain.setSource(this.mHost, i);
        accessibilityEventObtain.setPackageName(this.mHost.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent createEventForHost(int i) {
        View view = this.mHost;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i);
        view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    private bbz createNodeForChild(int i) {
        bbz bbzVarB = bbz.b();
        bbzVarB.B(true);
        bbzVarB.C(true);
        bbzVarB.v(DEFAULT_CLASS_NAME);
        Rect rect = INVALID_BOUNDS;
        bbzVarB.q(rect);
        bbzVarB.r(rect);
        bbzVarB.b = -1;
        AccessibilityNodeInfo accessibilityNodeInfo = bbzVarB.a;
        accessibilityNodeInfo.setParent(this.mHost);
        onPopulateNodeForVirtualView(i, bbzVarB);
        if (bbzVarB.g() == null && bbzVarB.f() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        bbzVarB.m(this.mTempParentRect);
        bbzVarB.n(this.mTempScreenRect);
        if (this.mTempParentRect.equals(rect) && this.mTempScreenRect.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfo.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & SemanticState.Focused) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        bbzVarB.H(this.mHost.getContext().getPackageName());
        bbzVarB.M(this.mHost, i);
        if (this.mAccessibilityFocusedVirtualViewId == i) {
            bbzVarB.o(true);
            bbzVarB.j(SemanticState.Focused);
        } else {
            bbzVarB.o(false);
            bbzVarB.j(64);
        }
        boolean z = this.mKeyboardFocusedVirtualViewId == i;
        if (z) {
            bbzVarB.j(2);
        } else if (bbzVarB.U()) {
            bbzVarB.j(1);
        }
        bbzVarB.D(z);
        this.mHost.getLocationOnScreen(this.mTempGlobalRect);
        if (this.mTempScreenRect.equals(rect)) {
            setBoundsInScreenFromBoundsInParent(bbzVarB, this.mTempParentRect);
            bbzVarB.n(this.mTempScreenRect);
        }
        if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
            this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
            if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                bbzVarB.r(this.mTempScreenRect);
                if (isVisibleToUser(this.mTempScreenRect)) {
                    bbzVarB.R(true);
                }
            }
        }
        return bbzVarB;
    }

    private bbz createNodeForHost() {
        View view = this.mHost;
        bbz bbzVarC = bbz.c(view);
        bac.k(view, bbzVarC);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (bbzVarC.a.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bbzVarC.l(this.mHost, ((Integer) arrayList.get(i)).intValue());
        }
        return bbzVarC;
    }

    private ahb getAllNodes() {
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        ahb ahbVar = new ahb(10);
        for (int i = 0; i < arrayList.size(); i++) {
            ahbVar.f(((Integer) arrayList.get(i)).intValue(), createNodeForChild(((Integer) arrayList.get(i)).intValue()));
        }
        return ahbVar;
    }

    private void getBoundsInScreen(int i, Rect rect) {
        obtainAccessibilityNodeInfo(i).n(rect);
    }

    private static Rect guessPreviouslyFocusedRect(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private boolean isVisibleToUser(Rect rect) {
        if (rect == null || rect.isEmpty() || this.mHost.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.mHost.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int keyToDirection(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00db  */
    private boolean moveFocus(int i, Rect rect) {
        ahb allNodes = getAllNodes();
        int i2 = this.mKeyboardFocusedVirtualViewId;
        Object obj = null;
        bbz bbzVar = i2 == Integer.MIN_VALUE ? null : (bbz) ahc.a(allNodes, i2);
        int i3 = 0;
        if (i == 1 || i == 2) {
            boolean z = this.mHost.getLayoutDirection() == 1;
            bdn bdnVar = SPARSE_VALUES_ADAPTER;
            bdm bdmVar = NODE_ADAPTER;
            int iA = bdnVar.a(allNodes);
            ArrayList arrayList = new ArrayList(iA);
            while (i3 < iA) {
                arrayList.add(bdnVar.b(allNodes, i3));
                i3++;
            }
            Collections.sort(arrayList, new bdo(z, bdmVar));
            if (i == 1) {
                int size = arrayList.size();
                if (bbzVar != null) {
                    size = arrayList.indexOf(bbzVar);
                }
                int i4 = size - 1;
                if (i4 >= 0) {
                    obj = arrayList.get(i4);
                }
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList.size();
                int iLastIndexOf = (bbzVar != null ? arrayList.lastIndexOf(bbzVar) : -1) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList.get(iLastIndexOf);
                }
            }
            obj = (bbz) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i5 = this.mKeyboardFocusedVirtualViewId;
            if (i5 != Integer.MIN_VALUE) {
                getBoundsInScreen(i5, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                guessPreviouslyFocusedRect(this.mHost, i, rect2);
            }
            bdn bdnVar2 = SPARSE_VALUES_ADAPTER;
            bdm bdmVar2 = NODE_ADAPTER;
            Rect rect3 = new Rect(rect2);
            if (i == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i != 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            int iA2 = bdnVar2.a(allNodes);
            Rect rect4 = new Rect();
            while (i3 < iA2) {
                Object objB = bdnVar2.b(allNodes, i3);
                if (objB != bbzVar) {
                    bdmVar2.a(objB, rect4);
                    if (aco.f(rect2, rect4, i)) {
                        if (!aco.f(rect2, rect3, i) || aco.e(i, rect2, rect4, rect3)) {
                            rect3.set(rect4);
                            obj = objB;
                        } else if (!aco.e(i, rect2, rect3, rect4)) {
                            int iC = aco.c(i, rect2, rect4);
                            int iD = aco.d(i, rect2, rect4);
                            int iC2 = aco.c(i, rect2, rect3);
                            int iD2 = aco.d(i, rect2, rect3);
                            if ((iC * 13 * iC) + (iD * iD) < (iC2 * 13 * iC2) + (iD2 * iD2)) {
                                rect3.set(rect4);
                                obj = objB;
                            }
                        }
                    }
                }
                i3++;
            }
        }
        return requestKeyboardFocusForVirtualView(obj != null ? allNodes.b(allNodes.a(obj)) : Integer.MIN_VALUE);
    }

    private boolean performActionForChild(int i, int i2, Bundle bundle) {
        if (i2 == 1) {
            return requestKeyboardFocusForVirtualView(i);
        }
        if (i2 == 2) {
            return clearKeyboardFocusForVirtualView(i);
        }
        if (i2 != 64) {
            return i2 != 128 ? onPerformActionForVirtualView(i, i2, bundle) : clearAccessibilityFocus(i);
        }
        return requestAccessibilityFocus(i);
    }

    private boolean performActionForHost(int i, Bundle bundle) {
        return this.mHost.performAccessibilityAction(i, bundle);
    }

    private boolean requestAccessibilityFocus(int i) {
        int i2;
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled() || (i2 = this.mAccessibilityFocusedVirtualViewId) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            clearAccessibilityFocus(i2);
        }
        this.mAccessibilityFocusedVirtualViewId = i;
        this.mHost.invalidate();
        sendEventForVirtualView(i, 32768);
        return true;
    }

    private void updateHoveredVirtualView(int i) {
        int i2 = this.mHoveredVirtualViewId;
        if (i2 != i) {
            this.mHoveredVirtualViewId = i;
            sendEventForVirtualView(i, SemanticState.Focused);
            sendEventForVirtualView(i2, SemanticState.Hidden);
        }
    }

    public final boolean clearKeyboardFocusForVirtualView(int i) {
        if (this.mKeyboardFocusedVirtualViewId != i) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i, false);
        sendEventForVirtualView(i, 8);
        return true;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
            updateHoveredVirtualView(virtualViewAt);
            if (virtualViewAt == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || this.mHoveredVirtualViewId == Integer.MIN_VALUE) {
                return false;
            }
            updateHoveredVirtualView(Integer.MIN_VALUE);
        }
        return true;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return moveFocus(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return moveFocus(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int iKeyToDirection = keyToDirection(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z = false;
                    while (i < repeatCount && moveFocus(iKeyToDirection, null)) {
                        i++;
                        z = true;
                    }
                    return z;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        clickKeyboardFocusedVirtualView();
        return true;
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    @Override // defpackage.axx
    public bcc getAccessibilityNodeProvider(View view) {
        bdk bdkVar = this.mNodeProvider;
        if (bdkVar != null) {
            return bdkVar;
        }
        bdk bdkVar2 = new bdk(this);
        this.mNodeProvider = bdkVar2;
        return bdkVar2;
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    protected abstract int getVirtualViewAt(float f, float f2);

    protected abstract void getVisibleVirtualViews(List list);

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(i, SemanticState.Modal);
        accessibilityEventCreateEvent.setContentChangeTypes(i2);
        parent.requestSendAccessibilityEvent(this.mHost, accessibilityEventCreateEvent);
    }

    public bbz obtainAccessibilityNodeInfo(int i) {
        return i == -1 ? createNodeForHost() : createNodeForChild(i);
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int i2 = this.mKeyboardFocusedVirtualViewId;
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        if (z) {
            moveFocus(i, rect);
        }
    }

    @Override // defpackage.axx
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    @Override // defpackage.axx
    public void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        onPopulateNodeForHost(bbzVar);
    }

    protected abstract boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle);

    protected abstract void onPopulateNodeForVirtualView(int i, bbz bbzVar);

    public boolean performAction(int i, int i2, Bundle bundle) {
        return i != -1 ? performActionForChild(i, i2, bundle) : performActionForHost(i2, bundle);
    }

    public final boolean requestKeyboardFocusForVirtualView(int i) {
        int i2;
        if ((this.mHost.isFocused() || this.mHost.requestFocus()) && (i2 = this.mKeyboardFocusedVirtualViewId) != i) {
            if (i2 != Integer.MIN_VALUE) {
                clearKeyboardFocusForVirtualView(i2);
            }
            if (i != Integer.MIN_VALUE) {
                this.mKeyboardFocusedVirtualViewId = i;
                onVirtualViewKeyboardFocusChanged(i, true);
                sendEventForVirtualView(i, 8);
                return true;
            }
        }
        return false;
    }

    public final boolean sendEventForVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.mHost, createEvent(i, i2));
    }

    public final void setBoundsInScreenFromBoundsInParent(bbz bbzVar, Rect rect) {
        bbzVar.q(rect);
        Rect rect2 = new Rect();
        rect2.set(rect);
        if (bbzVar.b != -1) {
            bbz bbzVarB = bbz.b();
            Rect rect3 = new Rect();
            for (int i = bbzVar.b; i != -1; i = bbzVarB.b) {
                bbzVarB.J(this.mHost, -1);
                bbzVarB.q(INVALID_BOUNDS);
                onPopulateNodeForVirtualView(i, bbzVarB);
                bbzVarB.m(rect3);
                rect2.offset(rect3.left, rect3.top);
            }
        }
        this.mHost.getLocationOnScreen(this.mTempGlobalRect);
        rect2.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
        bbzVar.r(rect2);
    }

    protected void onPopulateEventForHost(AccessibilityEvent accessibilityEvent) {
    }

    protected void onPopulateNodeForHost(bbz bbzVar) {
    }

    public final void invalidateVirtualView(int i) {
        invalidateVirtualView(i, 0);
    }

    protected void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
    }

    protected void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
    }
}
