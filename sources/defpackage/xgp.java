package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xgp {
    private static final agrf d = agrf.h("com/google/android/libraries/youtube/logging/interaction/InteractionLoggingLayerController");
    final Map a = new HashMap();
    final Map c = new HashMap();
    final Map b = new HashMap();

    final synchronized xgt a(xgu xguVar) {
        Deque deque = (Deque) this.a.get(xguVar);
        if (deque == null) {
            return null;
        }
        return (xgt) deque.peekFirst();
    }

    final synchronized void b(xgt xgtVar, xhp xhpVar) {
        String str = xgtVar.a;
        if (TextUtils.isEmpty(str)) {
            ((agrc) ((agrc) d.b()).k("com/google/android/libraries/youtube/logging/interaction/InteractionLoggingLayerController", "addVisibilityControllerToScreen", 84, "InteractionLoggingLayerController.java")).t("Empty CSN found when addVisibilityControllerToScreen");
            return;
        }
        Map map = this.c;
        if (!map.containsKey(str)) {
            map.put(str, new ArrayList());
        }
        ((List) map.get(str)).add(new WeakReference(xhpVar));
    }

    final synchronized void c(xgt xgtVar) {
        try {
            if (xgtVar == null) {
                ((agrc) ((agrc) d.b()).k("com/google/android/libraries/youtube/logging/interaction/InteractionLoggingLayerController", "removeInteractionLoggingScreen", 105, "InteractionLoggingLayerController.java")).t("Null interactionLoggingScreen found when removeInteractionLoggingScreen.");
                return;
            }
            for (Deque deque : this.a.values()) {
                if (deque.contains(xgtVar)) {
                    deque.remove(xgtVar);
                }
            }
            String str = xgtVar.a;
            if (!TextUtils.isEmpty(str)) {
                Map map = this.c;
                if (map.containsKey(str)) {
                    map.remove(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized void d(xgu xguVar, xgt xgtVar) {
        Map map = this.a;
        Deque arrayDeque = (Deque) map.get(xguVar);
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque();
            map.put(xguVar, arrayDeque);
        }
        if (arrayDeque.contains(xgtVar)) {
            arrayDeque.remove(xgtVar);
        }
        arrayDeque.addFirst(xgtVar);
        Deque deque = (Deque) map.get(xguVar);
        if (deque != null && deque.size() > 3) {
            while (deque.size() > 3) {
                c((xgt) deque.removeLast());
            }
        }
    }

    final synchronized void e(xgu xguVar, xgt xgtVar) {
        try {
            if (xgtVar == null) {
                ((agrc) ((agrc) d.b()).k("com/google/android/libraries/youtube/logging/interaction/InteractionLoggingLayerController", "setParentScreen", 48, "InteractionLoggingLayerController.java")).t("Null screen or null layer found when setParentScreen");
            } else {
                this.b.put(xguVar, xgtVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Map map = this.a;
        String str = "";
        for (xgu xguVar : map.keySet()) {
            sb.append(str);
            sb.append(xguVar);
            sb.append(" = {");
            String str2 = "";
            for (xgt xgtVar : (Deque) map.get(xguVar)) {
                sb.append(str2);
                sb.append(xgtVar.a);
                str2 = ", ";
            }
            sb.append('}');
            str = ", ";
        }
        return sb.toString();
    }
}
