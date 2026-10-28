package defpackage;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bby {
    public static final bby a;
    public static final bby b;
    public static final bby c;
    public static final bby d;
    public static final bby e;
    public static final bby f;
    public static final bby g;
    public static final bby h;
    public static final bby i;
    public static final bby j;
    public static final bby k;
    public static final bby l;
    public static final bby m;
    final Object n;
    public final int o;
    public final Class p;
    public final bcl q;

    static {
        new bby(null, 1, null, null, null);
        new bby(null, 2, null, null, null);
        new bby(null, 4, null, null, null);
        new bby(null, 8, null, null, null);
        a = new bby(null, 16, null, null, null);
        b = new bby(null, 32, null, null, null);
        c = new bby(null, 64, null, null, null);
        d = new bby(null, SemanticState.Focused, null, null, null);
        new bby(null, SemanticState.Hidden, null, null, bce.class);
        new bby(null, SemanticState.LiveRegion, null, null, bce.class);
        new bby(null, SemanticState.ReadOnly, null, null, bcf.class);
        new bby(null, SemanticState.Modal, null, null, bcf.class);
        e = new bby(null, SemanticState.Obscured, null, null, null);
        f = new bby(null, SemanticState.Multiline, null, null, null);
        new bby(null, 16384, null, null, null);
        new bby(null, 32768, null, null, null);
        new bby(null, 65536, null, null, null);
        new bby(null, 131072, null, null, bcj.class);
        new bby(null, 262144, null, null, null);
        new bby(null, 524288, null, null, null);
        g = new bby(null, 1048576, null, null, null);
        new bby(null, 2097152, null, null, bck.class);
        h = new bby(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        i = new bby(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, bch.class);
        j = new bby(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new bby(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        k = new bby(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new bby(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
        new bby(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new bby(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new bby(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new bby(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new bby(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        l = new bby(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, bci.class);
        new bby(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, bcg.class);
        new bby(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new bby(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new bby(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new bby(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new bby(Build.VERSION.SDK_INT >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new bby(Build.VERSION.SDK_INT >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new bby(Build.VERSION.SDK_INT >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new bby(Build.VERSION.SDK_INT >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        m = new bby(Build.VERSION.SDK_INT >= 34 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        int i2 = awk.a;
        if (Build.VERSION.SDK_INT >= 36 && a.at() >= 3600001) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_EXTENDED_SELECTION;
        }
        new bby(accessibilityAction, R.id.ALT, null, null, null);
    }

    public bby(Object obj, int i2, CharSequence charSequence, bcl bclVar, Class cls) {
        this.o = i2;
        this.q = bclVar;
        this.n = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence) : obj;
        this.p = cls;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.n).getId();
    }

    public final CharSequence b() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.n).getLabel();
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof bby) && this.n.equals(((bby) obj).n);
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strH = bbz.h(this.o);
        if (strH.equals("ACTION_UNKNOWN") && b() != null) {
            strH = b().toString();
        }
        sb.append(strH);
        return sb.toString();
    }
}
