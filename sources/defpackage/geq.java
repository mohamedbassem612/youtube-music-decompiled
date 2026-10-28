package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class geq implements ViewGroup.OnHierarchyChangeListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public geq(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        int i = this.$cid;
        if (i != 0) {
            Object obj = this.a;
            if (i == 1) {
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = ((CoordinatorLayout) obj).g;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewAdded(view, view2);
                    return;
                }
                return;
            }
            AccessibilityLayerLayout accessibilityLayerLayout = (AccessibilityLayerLayout) obj;
            if (accessibilityLayerLayout.d == null) {
                accessibilityLayerLayout.d = accessibilityLayerLayout.findViewById(accessibilityLayerLayout.a);
            }
            if (accessibilityLayerLayout.e == null) {
                accessibilityLayerLayout.e = accessibilityLayerLayout.findViewById(accessibilityLayerLayout.b);
            }
            accessibilityLayerLayout.a();
            if (accessibilityLayerLayout.c) {
                view.setVisibility(0);
            }
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        int i = this.$cid;
        if (i == 0) {
            gni gniVar = (gni) ((get) this.a).F.io();
            HashSet hashSet = new HashSet();
            int i2 = 0;
            while (true) {
                dd ddVar = gniVar.c;
                if (i2 >= ddVar.b()) {
                    break;
                }
                String str = ddVar.ag(i2).m;
                if (str != null) {
                    hashSet.add(str);
                }
                i2++;
            }
            HashSet hashSet2 = new HashSet();
            HashMap map = gniVar.f;
            for (String str2 : map.keySet()) {
                if (!hashSet.contains(str2) && !gniVar.g.d(str2)) {
                    hashSet2.add(str2);
                }
            }
            map.keySet().removeAll(hashSet2);
            return;
        }
        Object obj = this.a;
        if (i == 1) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
            coordinatorLayout.i(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.g;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
                return;
            }
            return;
        }
        AccessibilityLayerLayout accessibilityLayerLayout = (AccessibilityLayerLayout) obj;
        View view3 = accessibilityLayerLayout.d;
        if (view3 != null && accessibilityLayerLayout.indexOfChild(view3) == -1) {
            accessibilityLayerLayout.d = null;
        }
        View view4 = accessibilityLayerLayout.e;
        if (view4 != null && accessibilityLayerLayout.indexOfChild(view4) == -1) {
            accessibilityLayerLayout.e = null;
        }
        accessibilityLayerLayout.a();
        if (accessibilityLayerLayout.c && accessibilityLayerLayout.getChildCount() == 0) {
            view.setVisibility(8);
        }
    }
}
