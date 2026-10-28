package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bac {
    public static final /* synthetic */ int a = 0;
    private static WeakHashMap b = null;
    private static Field c = null;
    private static boolean d = false;
    private static final int[] e = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    private static final azo f = new azo();

    public static int a(View view, CharSequence charSequence, bcl bclVar) {
        int iA;
        List listY = y(view);
        int i = 0;
        while (true) {
            if (i >= listY.size()) {
                int i2 = -1;
                for (int i3 = 0; i3 < 32 && i2 == -1; i3++) {
                    i2 = e[i3];
                    boolean z = true;
                    for (int i4 = 0; i4 < listY.size(); i4++) {
                        z &= ((bby) listY.get(i4)).a() != i2;
                    }
                    if (true != z) {
                        i2 = -1;
                    }
                }
                iA = i2;
                break;
            }
            if (TextUtils.equals(charSequence, ((bby) listY.get(i)).b())) {
                iA = ((bby) listY.get(i)).a();
                break;
            }
            i++;
        }
        if (iA != -1) {
            z(view, new bby(null, iA, charSequence, bclVar, null));
        }
        return iA;
    }

    public static View.AccessibilityDelegate b(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return azx.a(view);
        }
        if (d) {
            return null;
        }
        if (c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                d = true;
                return null;
            }
        }
        Object obj = c.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    public static axx c(View view) {
        View.AccessibilityDelegate accessibilityDelegateB = b(view);
        if (accessibilityDelegateB == null) {
            return null;
        }
        return accessibilityDelegateB instanceof axw ? ((axw) accessibilityDelegateB).a : new axx(accessibilityDelegateB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ayf d(View view, ayf ayfVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return azz.a(view, ayfVar);
        }
        if (((aco) view.getTag(R.id.tag_on_receive_content_listener)) == null) {
            return view.b(ayfVar);
        }
        ayf ayfVarG = aco.g(view, ayfVar);
        if (ayfVarG == null) {
            return null;
        }
        return view.b(ayfVarG);
    }

    public static bbn e(View view, bbn bbnVar) {
        WindowInsets windowInsetsE = bbnVar.e();
        if (windowInsetsE == null) {
            return bbnVar;
        }
        WindowInsets windowInsetsA = Build.VERSION.SDK_INT >= 30 ? azy.a(view, windowInsetsE) : azq.c(view, windowInsetsE);
        return !windowInsetsA.equals(windowInsetsE) ? bbn.o(windowInsetsA, view) : bbnVar;
    }

    public static bbn f(View view, bbn bbnVar) {
        WindowInsets windowInsetsE = bbnVar.e();
        if (windowInsetsE == null) {
            return bbnVar;
        }
        WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsE);
        return !windowInsetsOnApplyWindowInsets.equals(windowInsetsE) ? bbn.o(windowInsetsOnApplyWindowInsets, view) : bbnVar;
    }

    public static CharSequence g(View view) {
        return (CharSequence) new azm(CharSequence.class).d(view);
    }

    public static void h(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        view2.getClass();
        view2.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    static void i(View view) {
        axx axxVarC = c(view);
        if (axxVarC == null) {
            axxVarC = new axx();
        }
        s(view);
        view.setAccessibilityDelegate(axxVarC.getBridge());
    }

    public static void j(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = false;
            if (((CharSequence) new azl(CharSequence.class).d(view)) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            }
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                int i2 = true != z ? SemanticState.Modal : 32;
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(i2);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add((CharSequence) new azl(CharSequence.class).d(view));
                    s(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", String.valueOf(view.getParent().getClass().getSimpleName()).concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(32);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add((CharSequence) new azl(CharSequence.class).d(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    @Deprecated
    public static void k(View view, bbz bbzVar) {
        view.onInitializeAccessibilityNodeInfo(bbzVar.a);
    }

    public static void l(View view, int i) {
        m(i, view);
        j(view, 0);
    }

    public static void m(int i, View view) {
        List listY = y(view);
        for (int i2 = 0; i2 < listY.size(); i2++) {
            if (((bby) listY.get(i2)).a() == i) {
                listY.remove(i2);
                return;
            }
        }
    }

    public static void n(View view, bby bbyVar, CharSequence charSequence, bcl bclVar) {
        if (bclVar == null && charSequence == null) {
            l(view, bbyVar.a());
        } else {
            z(view, new bby(null, bbyVar.o, charSequence, bclVar, bbyVar.p));
        }
    }

    public static void o(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            azx.b(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void p(View view, axx axxVar) {
        if (axxVar == null && (b(view) instanceof axw)) {
            axxVar = new axx();
        }
        s(view);
        view.setAccessibilityDelegate(axxVar == null ? null : axxVar.getBridge());
    }

    public static void q(View view, boolean z) {
        new azn(Boolean.class).e(view, Boolean.valueOf(z));
    }

    public static void r(View view, CharSequence charSequence) {
        new azl(CharSequence.class).e(view, charSequence);
        azo azoVar = f;
        if (charSequence == null) {
            azoVar.a.remove(view);
            view.removeOnAttachStateChangeListener(azoVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(azoVar);
            return;
        }
        WeakHashMap weakHashMap = azoVar.a;
        boolean z = false;
        if (view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        }
        weakHashMap.put(view, Boolean.valueOf(z));
        view.addOnAttachStateChangeListener(azoVar);
        if (view.isAttachedToWindow()) {
            azoVar.a(view);
        }
    }

    public static void s(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static void t(View view, CharSequence charSequence) {
        new azm(CharSequence.class).e(view, charSequence);
    }

    static boolean u(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        bab babVarC = bab.c(view);
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = babVarC.b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = bab.a;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (babVarC.b == null) {
                        babVarC.b = new WeakHashMap();
                    }
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        View view2 = (View) ((WeakReference) arrayList.get(size)).get();
                        if (view2 == null) {
                            arrayList.remove(size);
                        } else {
                            babVarC.b.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                babVarC.b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View viewB = babVarC.b(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewB != null && !KeyEvent.isModifierKey(keyCode)) {
                babVarC.a().put(keyCode, new WeakReference(viewB));
            }
        }
        return viewB != null;
    }

    public static boolean v(View view, KeyEvent keyEvent) {
        int iIndexOfKey;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        bab babVarC = bab.c(view);
        WeakReference weakReference = babVarC.c;
        if (weakReference != null && weakReference.get() == keyEvent) {
            return false;
        }
        babVarC.c = new WeakReference(keyEvent);
        SparseArray sparseArrayA = babVarC.a();
        WeakReference weakReference2 = null;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArrayA.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference2 = (WeakReference) sparseArrayA.valueAt(iIndexOfKey);
            sparseArrayA.removeAt(iIndexOfKey);
        }
        if (weakReference2 == null) {
            weakReference2 = (WeakReference) sparseArrayA.get(keyEvent.getKeyCode());
        }
        if (weakReference2 == null) {
            return false;
        }
        View view2 = (View) weakReference2.get();
        if (view2 != null && view2.isAttachedToWindow()) {
            bab.d(view2);
        }
        return true;
    }

    public static String[] w(View view) {
        return Build.VERSION.SDK_INT >= 31 ? azz.b(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    @Deprecated
    public static ci x(View view) {
        WeakHashMap weakHashMap = b;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            b = weakHashMap;
        }
        ci ciVar = (ci) weakHashMap.get(view);
        if (ciVar != null) {
            return ciVar;
        }
        ci ciVar2 = new ci(view);
        b.put(view, ciVar2);
        return ciVar2;
    }

    private static List y(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    private static void z(View view, bby bbyVar) {
        i(view);
        m(bbyVar.a(), view);
        y(view).add(bbyVar);
        j(view, 0);
    }
}
