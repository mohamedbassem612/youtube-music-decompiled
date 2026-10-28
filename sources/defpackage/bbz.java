package defpackage;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import app.rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bbz {
    public final AccessibilityNodeInfo a;
    public int b = -1;
    private int c = -1;

    public bbz(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    private final List Y(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private final boolean Z(int i) {
        Bundle bundleA = a();
        return bundleA != null && (bundleA.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public static bbz b() {
        return new bbz(AccessibilityNodeInfo.obtain());
    }

    public static bbz c(View view) {
        return new bbz(AccessibilityNodeInfo.obtain(view));
    }

    public static bbz d(bbz bbzVar) {
        return new bbz(AccessibilityNodeInfo.obtain(bbzVar.a));
    }

    static String h(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case SemanticState.Focused /* 128 */:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case SemanticState.Hidden /* 256 */:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case SemanticState.LiveRegion /* 512 */:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case SemanticState.ReadOnly /* 1024 */:
                return "ACTION_NEXT_HTML_ELEMENT";
            case SemanticState.Modal /* 2048 */:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case SemanticState.Obscured /* 4096 */:
                return "ACTION_SCROLL_FORWARD";
            case SemanticState.Multiline /* 8192 */:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        switch (i) {
                                            case R.id.accessibilityActionScrollInDirection:
                                                return "ACTION_SCROLL_IN_DIRECTION";
                                            case R.id.ALT:
                                                return "ACTION_SET_EXTENDED_SELECTION";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
        }
    }

    public final void A(boolean z) {
        this.a.setDismissable(z);
    }

    public final void B(boolean z) {
        this.a.setEnabled(z);
    }

    public final void C(boolean z) {
        this.a.setFocusable(z);
    }

    public final void D(boolean z) {
        this.a.setFocused(z);
    }

    public final void E(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setHeading(z);
        } else {
            p(2, z);
        }
    }

    public final void F(CharSequence charSequence) {
        this.a.setHintText(charSequence);
    }

    public final void G(boolean z) {
        this.a.setMultiLine(z);
    }

    public final void H(CharSequence charSequence) {
        this.a.setPackageName(charSequence);
    }

    public final void I(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (i >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public final void J(View view, int i) {
        this.b = i;
        this.a.setParent(view, i);
    }

    public final void K(CharSequence charSequence) {
        this.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public final void L(boolean z) {
        this.a.setScrollable(z);
    }

    public final void M(View view, int i) {
        this.c = i;
        this.a.setSource(view, i);
    }

    public final void N(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (i >= 30) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public final void O(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final void P(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (i >= 28) {
            accessibilityNodeInfo.setTooltipText(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", charSequence);
        }
    }

    public final void Q(View view) {
        this.a.setTraversalAfter(view);
    }

    public final void R(boolean z) {
        this.a.setVisibleToUser(z);
    }

    @Deprecated
    public final boolean S() {
        return this.a.isChecked();
    }

    public final boolean T() {
        return this.a.isEnabled();
    }

    public final boolean U() {
        return this.a.isFocusable();
    }

    public final boolean V() {
        return this.a.isPassword();
    }

    public final boolean W() {
        return this.a.isScrollable();
    }

    public final void X(bby bbyVar) {
        this.a.removeAction((AccessibilityNodeInfo.AccessibilityAction) bbyVar.n);
    }

    public final Bundle a() {
        return this.a.getExtras();
    }

    public final CharSequence e() {
        return this.a.getClassName();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof bbz)) {
            bbz bbzVar = (bbz) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = this.a;
            if (accessibilityNodeInfo != null ? accessibilityNodeInfo.equals(bbzVar.a) : bbzVar.a == null) {
                if (this.c == bbzVar.c && this.b == bbzVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final CharSequence f() {
        return this.a.getContentDescription();
    }

    public final CharSequence g() {
        if (Y("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            return this.a.getText();
        }
        List listY = Y("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List listY2 = Y("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List listY3 = Y("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List listY4 = Y("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < listY.size(); i++) {
            spannableString.setSpan(new bbu(((Integer) listY4.get(i)).intValue(), this, a().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) listY.get(i)).intValue(), ((Integer) listY2.get(i)).intValue(), ((Integer) listY3.get(i)).intValue());
        }
        return spannableString;
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final List i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new bby(actionList.get(i), 0, null, null, null));
        }
        return arrayList;
    }

    public final void j(int i) {
        this.a.addAction(i);
    }

    public final void k(bby bbyVar) {
        this.a.addAction((AccessibilityNodeInfo.AccessibilityAction) bbyVar.n);
    }

    public final void l(View view, int i) {
        this.a.addChild(view, i);
    }

    @Deprecated
    public final void m(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public final void n(Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public final void o(boolean z) {
        this.a.setAccessibilityFocused(z);
    }

    public final void p(int i, boolean z) {
        Bundle bundleA = a();
        if (bundleA != null) {
            int i2 = bundleA.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (true != z) {
                i = 0;
            }
            bundleA.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i2 | i);
        }
    }

    @Deprecated
    public final void q(Rect rect) {
        this.a.setBoundsInParent(rect);
    }

    public final void r(Rect rect) {
        this.a.setBoundsInScreen(rect);
    }

    public final void s(boolean z) {
        this.a.setCheckable(z);
    }

    public final void t(int i) {
        if (Build.VERSION.SDK_INT >= 36) {
            this.a.setChecked(i);
            return;
        }
        if (i != 1 && i != 2 && i != 0) {
            throw new IllegalArgumentException("Unknown checked argument: 1");
        }
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        accessibilityNodeInfo.setChecked(i == 1);
        accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m(rect);
        rect.toString();
        sb.append("; boundsInParent: ".concat(rect.toString()));
        n(rect);
        rect.toString();
        sb.append("; boundsInScreen: ".concat(rect.toString()));
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (i >= 34) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        rect.toString();
        sb.append("; boundsInWindow: ".concat(rect.toString()));
        sb.append("; packageName: ");
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.a;
        sb.append(accessibilityNodeInfo2.getPackageName());
        sb.append("; className: ");
        sb.append(e());
        sb.append("; text: ");
        sb.append(g());
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo2.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo2.getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(Build.VERSION.SDK_INT >= 30 ? accessibilityNodeInfo2.getStateDescription() : accessibilityNodeInfo2.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb.append("; contentDescription: ");
        sb.append(f());
        sb.append("; supplementalDescription: ");
        sb.append(Build.VERSION.SDK_INT >= 36 ? accessibilityNodeInfo2.getSupplementalDescription() : accessibilityNodeInfo2.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY"));
        sb.append("; tooltipText: ");
        sb.append(Build.VERSION.SDK_INT >= 28 ? accessibilityNodeInfo2.getTooltipText() : accessibilityNodeInfo2.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"));
        sb.append("; viewIdResName: ");
        sb.append(accessibilityNodeInfo2.getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(Build.VERSION.SDK_INT >= 33 ? accessibilityNodeInfo2.getUniqueId() : accessibilityNodeInfo2.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo2.isCheckable());
        sb.append("; checked: ");
        int checked = Build.VERSION.SDK_INT >= 36 ? accessibilityNodeInfo2.getChecked() : accessibilityNodeInfo2.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", accessibilityNodeInfo2.isChecked() ? 1 : 0);
        String str = "PARTIAL";
        sb.append(checked == 1 ? "TRUE" : checked == 2 ? "PARTIAL" : "FALSE");
        sb.append("; fieldRequired: ");
        sb.append(Build.VERSION.SDK_INT >= 36 ? accessibilityNodeInfo2.isFieldRequired() : accessibilityNodeInfo2.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"));
        sb.append("; focusable: ");
        sb.append(U());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo2.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo2.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo2.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo2.isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(accessibilityNodeInfo2.isContextClickable());
        sb.append("; expandedState: ");
        int expandedState = Build.VERSION.SDK_INT >= 36 ? accessibilityNodeInfo2.getExpandedState() : accessibilityNodeInfo2.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
        if (expandedState == 0) {
            str = "UNDEFINED";
        } else if (expandedState == 1) {
            str = "COLLAPSED";
        } else if (expandedState != 2) {
            str = expandedState != 3 ? "UNKNOWN" : "FULL";
        }
        sb.append(str);
        sb.append("; enabled: ");
        sb.append(T());
        sb.append("; password: ");
        sb.append(V());
        sb.append("; scrollable: " + W());
        sb.append("; containerTitle: ");
        sb.append(Build.VERSION.SDK_INT >= 34 ? accessibilityNodeInfo2.getContainerTitle() : accessibilityNodeInfo2.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb.append("; granularScrollingSupported: ");
        sb.append(Z(67108864));
        sb.append("; importantForAccessibility: ");
        sb.append(accessibilityNodeInfo2.isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo2.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(Build.VERSION.SDK_INT >= 33 ? accessibilityNodeInfo2.isTextSelectable() : Z(8388608));
        sb.append("; accessibilityDataSensitive: ");
        sb.append(Build.VERSION.SDK_INT >= 34 ? accessibilityNodeInfo2.isAccessibilityDataSensitive() : Z(64));
        sb.append("; [");
        List listI = i();
        for (int i2 = 0; i2 < listI.size(); i2++) {
            bby bbyVar = (bby) listI.get(i2);
            String strH = h(bbyVar.a());
            if (strH.equals("ACTION_UNKNOWN") && bbyVar.b() != null) {
                strH = bbyVar.b().toString();
            }
            sb.append(strH);
            if (i2 != listI.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    @Deprecated
    public final void u(boolean z) {
        this.a.setChecked(z);
    }

    public final void v(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public final void w(boolean z) {
        this.a.setClickable(z);
    }

    public final void x(Object obj) {
        this.a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) ((zs) obj).a);
    }

    public final void y(Object obj) {
        this.a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((zs) obj).a);
    }

    public final void z(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }
}
