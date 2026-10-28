package defpackage;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class du extends dv {
    private static boolean A(Transition transition) {
        return (x(transition.getTargetIds()) && x(transition.getTargetNames()) && x(transition.getTargetTypes())) ? false : true;
    }

    @Override // defpackage.dv
    public final Object a(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // defpackage.dv
    public final Object b(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering == null) {
            ordering = transition != null ? transition : null;
        } else if (transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // defpackage.dv
    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // defpackage.dv
    public final void d(Object obj, View view) {
        ((Transition) obj).addTarget(view);
    }

    @Override // defpackage.dv
    public final void e(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    e(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
                return;
            }
            if (A(transition) || !x(transition.getTargets())) {
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                transition.addTarget((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.dv
    public final void f(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public final void g(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                g(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (A(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget((View) arrayList2.get(i));
            i++;
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                transition.removeTarget((View) arrayList.get(size2));
            }
        }
    }

    @Override // defpackage.dv
    public final void h(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new dq(view, arrayList));
    }

    @Override // defpackage.dv
    public final void i(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new dt(rect));
    }

    @Override // defpackage.dv
    public final void j(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            y(view, rect);
            ((Transition) obj).setEpicenterCallback(new dp(rect));
        }
    }

    @Override // defpackage.dv
    public final void k(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v(targets, (View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        e(transitionSet, arrayList);
    }

    @Override // defpackage.dv
    public final void l(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            g(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // defpackage.dv
    public final boolean m(Object obj) {
        return obj instanceof Transition;
    }

    @Override // defpackage.dv
    public final boolean n() {
        return false;
    }

    @Override // defpackage.dv
    public final boolean o(Object obj) {
        if (!dd.aa(2)) {
            return false;
        }
        Objects.toString(obj);
        return false;
    }

    @Override // defpackage.dv
    public final Object p(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // defpackage.dv
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new dr(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.dv
    public final void r(Object obj, awl awlVar, Runnable runnable) {
        ((Transition) obj).addListener(new ds(runnable));
    }
}
