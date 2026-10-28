package defpackage;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.util.ArrayMap;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.litho.ComponentHost;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class flh extends TouchDelegate {
    public static final Rect a = new Rect();
    public final ComponentHost b;
    public final ahb c;
    public ahb d;
    public AccessibilityNodeInfo.TouchDelegateInfo e;
    public View f;

    public flh(ComponentHost componentHost) {
        super(a, Build.VERSION.SDK_INT >= 29 ? new View(componentHost.getContext()) : componentHost);
        this.c = new ahb(10);
        this.b = componentHost;
    }

    public static void a(TouchDelegate touchDelegate, MotionEvent motionEvent, int i) {
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        try {
            motionEventObtainNoHistory.setAction(i);
            touchDelegate.onTouchExplorationHoverEvent(motionEventObtainNoHistory);
        } finally {
            motionEventObtainNoHistory.recycle();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:46:0x005e A[EDGE_INSN: B:46:0x005e->B:25:0x005e BREAK  A[LOOP:1: B:16:0x0036->B:48:0x0036], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0036 A[SYNTHETIC] */
    @Override // android.view.TouchDelegate
    public final AccessibilityNodeInfo.TouchDelegateInfo getTouchDelegateInfo() {
        ArrayMap arrayMap;
        ahb ahbVar;
        int iC;
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo;
        flg flgVar;
        Rect rectA;
        if (Build.VERSION.SDK_INT < 29) {
            return super.getTouchDelegateInfo();
        }
        if (this.e != null) {
            ahb ahbVar2 = this.c;
            int iC2 = ahbVar2.c();
            while (true) {
                iC2--;
                if (iC2 >= 0) {
                    flg flgVar2 = (flg) ahbVar2.d(iC2);
                    if (flgVar2 != null && flgVar2.b.d != flgVar2.c) {
                        arrayMap = new ArrayMap();
                        ahbVar = this.c;
                        iC = ahbVar.c();
                        while (true) {
                            iC--;
                            if (iC >= 0) {
                                break;
                            }
                            flgVar = (flg) ahbVar.d(iC);
                            if (flgVar != null) {
                                flgVar.c = flgVar.b.d;
                                rectA = flgVar.a();
                                if (rectA == null) {
                                    rectA = new Rect();
                                }
                                arrayMap.put(new Region(rectA), flgVar.a);
                            }
                        }
                        if (arrayMap.isEmpty()) {
                            touchDelegateInfo = null;
                        } else {
                            touchDelegateInfo = new AccessibilityNodeInfo.TouchDelegateInfo(arrayMap);
                        }
                        this.e = touchDelegateInfo;
                    }
                }
            }
        } else {
            arrayMap = new ArrayMap();
            ahbVar = this.c;
            iC = ahbVar.c();
            while (true) {
                iC--;
                if (iC >= 0) {
                    break;
                    break;
                }
                flgVar = (flg) ahbVar.d(iC);
                if (flgVar != null) {
                    flgVar.c = flgVar.b.d;
                    rectA = flgVar.a();
                    if (rectA == null) {
                        rectA = new Rect();
                    }
                    arrayMap.put(new Region(rectA), flgVar.a);
                }
            }
            if (arrayMap.isEmpty()) {
                touchDelegateInfo = null;
            } else {
                touchDelegateInfo = new AccessibilityNodeInfo.TouchDelegateInfo(arrayMap);
            }
            this.e = touchDelegateInfo;
        }
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo2 = this.e;
        if (touchDelegateInfo2 != null) {
            return touchDelegateInfo2;
        }
        if (fna.M || fna.L) {
            return super.getTouchDelegateInfo();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0006 A[SYNTHETIC] */
    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        ahb ahbVar = this.c;
        int iC = ahbVar.c();
        while (true) {
            iC--;
            boolean zContains = false;
            if (iC < 0) {
                return false;
            }
            flg flgVar = (flg) ahbVar.d(iC);
            if (flgVar != null) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                Rect rectA = flgVar.a();
                if (rectA != null) {
                    View view = flgVar.a;
                    int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
                    Rect rect = new Rect();
                    rect.set(rectA);
                    int i = -scaledTouchSlop;
                    rect.inset(i, i);
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action == 1 || action == 2) {
                            boolean z2 = flgVar.d;
                            z = !z2 || rect.contains(x, y);
                            if (motionEvent.getAction() == 1) {
                                flgVar.d = false;
                            }
                            zContains = z2;
                        } else if (action == 3) {
                            boolean z3 = flgVar.d;
                            flgVar.d = false;
                            zContains = z3;
                        }
                        if (zContains) {
                            if (z) {
                                motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
                            } else {
                                float f = -(scaledTouchSlop << 1);
                                motionEvent.setLocation(f, f);
                            }
                            if (view.dispatchTouchEvent(motionEvent)) {
                                return true;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        zContains = rectA.contains(x, y);
                        flgVar.d = zContains;
                    }
                    z = true;
                    if (zContains) {
                        continue;
                    } else {
                        if (z) {
                            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
                        } else {
                            float f2 = -(scaledTouchSlop << 1);
                            motionEvent.setLocation(f2, f2);
                        }
                        if (view.dispatchTouchEvent(motionEvent)) {
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchExplorationHoverEvent(MotionEvent motionEvent) {
        if (fna.M || fna.L) {
            return false;
        }
        return super.onTouchExplorationHoverEvent(motionEvent);
    }
}
