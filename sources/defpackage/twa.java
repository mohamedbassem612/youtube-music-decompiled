package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class twa extends TouchDelegate {
    public final Map a;
    private TouchDelegate b;

    public twa(View view, TouchDelegate touchDelegate) {
        super(new Rect(), view);
        IdentityHashMap identityHashMap = new IdentityHashMap();
        this.a = identityHashMap;
        if (!(touchDelegate instanceof twa)) {
            this.b = touchDelegate;
            return;
        }
        twa twaVar = (twa) touchDelegate;
        this.b = twaVar.b;
        identityHashMap.putAll(twaVar.a);
    }

    public static void a(View view, View view2, TouchDelegate touchDelegate) {
        view.getClass();
        view2.getClass();
        TouchDelegate touchDelegate2 = view.getTouchDelegate();
        twa twaVar = touchDelegate2 instanceof twa ? (twa) touchDelegate2 : new twa(view, touchDelegate2);
        ahno.O(!(touchDelegate instanceof twa));
        twaVar.a.put(view2, touchDelegate);
        if (touchDelegate == twaVar.b) {
            twaVar.b = null;
        }
        if (touchDelegate2 != twaVar) {
            view.setTouchDelegate(twaVar);
        }
    }

    private static boolean b(MotionEvent motionEvent, TouchDelegate touchDelegate) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        boolean zOnTouchEvent = touchDelegate.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        return zOnTouchEvent;
    }

    private static boolean c(MotionEvent motionEvent, TouchDelegate touchDelegate) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        boolean zOnTouchExplorationHoverEvent = touchDelegate.onTouchExplorationHoverEvent(motionEventObtain);
        motionEventObtain.recycle();
        return zOnTouchExplorationHoverEvent;
    }

    @Override // android.view.TouchDelegate
    public final AccessibilityNodeInfo.TouchDelegateInfo getTouchDelegateInfo() {
        Map map = this.a;
        if (map.isEmpty()) {
            return super.getTouchDelegateInfo();
        }
        afv afvVar = new afv(map.size());
        for (View view : map.keySet()) {
            TouchDelegate touchDelegate = (TouchDelegate) map.get(view);
            AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo = touchDelegate.getTouchDelegateInfo();
            boolean z = true;
            ahno.O(!(touchDelegate instanceof twa));
            if (touchDelegateInfo.getRegionCount() != 1) {
                z = false;
            }
            ahno.O(z);
            afvVar.put(touchDelegateInfo.getRegionAt(0), view);
        }
        return new AccessibilityNodeInfo.TouchDelegateInfo(afvVar);
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TouchDelegate touchDelegate = this.b;
        boolean zB = touchDelegate != null ? b(motionEvent, touchDelegate) : false;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            zB |= b(motionEvent, (TouchDelegate) it.next());
        }
        return zB;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchExplorationHoverEvent(MotionEvent motionEvent) {
        TouchDelegate touchDelegate = this.b;
        boolean zC = touchDelegate != null ? c(motionEvent, touchDelegate) : false;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            zC |= c(motionEvent, (TouchDelegate) it.next());
        }
        return zC;
    }
}
