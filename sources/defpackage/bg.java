package defpackage;

import android.app.Application;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.car.app.CarAppBinder;
import j$.util.DesugarCollections;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bg implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bg(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r0v44, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        View view = null;
        int i = 0;
        switch (this.$cid) {
            case 0:
                dv.y((View) this.a, (Rect) this.b);
                return;
            case 1:
                ((eb) this.a).c((ea) this.b);
                return;
            case 2:
                f.b((ea) this.a, (bj) this.b);
                return;
            case 3:
                f.b((ea) this.a, (bj) this.b);
                return;
            case 4:
                Iterator it = ((bj) this.b).a.iterator();
                while (it.hasNext()) {
                    ea eaVar = ((bk) it.next()).a;
                    View view2 = eaVar.a.getView();
                    if (view2 != null) {
                        dl.g(eaVar.h, view2, (ViewGroup) this.a);
                    }
                }
                return;
            case 5:
                ((cc) this.a).m668x22bc4f96((Bundle) this.b);
                return;
            case 6:
                ?? r1 = this.a;
                Object obj = this.b;
                try {
                    r1.run();
                    return;
                } finally {
                    ((fz) obj).a();
                }
            case 7:
                ikm ikmVar = (ikm) this.b;
                hj hjVar = (hj) ikmVar.b;
                if (hjVar.f == ikmVar.a) {
                    Object obj2 = this.a;
                    ?? r2 = ikmVar.d;
                    hjVar.d = r2;
                    hjVar.e = DesugarCollections.unmodifiableList(r2);
                    ((hp) obj2).a(hjVar.a);
                    hjVar.a();
                    return;
                }
                return;
            case 8:
                ?? r3 = this.a;
                int size = r3.size();
                while (i < size) {
                    jhf jhfVar = (jhf) r3.get(i);
                    Object obj3 = this.b;
                    Object obj4 = jhfVar.e;
                    int i2 = jhfVar.a;
                    int i3 = jhfVar.b;
                    int i4 = jhfVar.c;
                    int i5 = jhfVar.d;
                    oh ohVar = (oh) obj4;
                    View view3 = ohVar.a;
                    int i6 = i4 - i2;
                    int i7 = i5 - i3;
                    if (i6 != 0) {
                        view3.animate().translationX(0.0f);
                    }
                    if (i7 != 0) {
                        view3.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view3.animate();
                    lu luVar = (lu) obj3;
                    luVar.e.add(obj4);
                    viewPropertyAnimatorAnimate.setDuration(250L).setListener(new lq(luVar, ohVar, i6, view3, i7, viewPropertyAnimatorAnimate)).start();
                    i++;
                }
                ((ArrayList) r3).clear();
                ((lu) this.b).b.remove((Object) r3);
                return;
            case 9:
                ?? r4 = this.a;
                int size2 = r4.size();
                while (i < size2) {
                    lt ltVar = (lt) r4.get(i);
                    Object obj5 = this.b;
                    oh ohVar2 = ltVar.a;
                    View view4 = ohVar2 == null ? view : ohVar2.a;
                    oh ohVar3 = ltVar.b;
                    View view5 = ohVar3 != null ? ohVar3.a : view;
                    if (view4 != null) {
                        ViewPropertyAnimator duration = view4.animate().setDuration(250L);
                        lu luVar2 = (lu) obj5;
                        luVar2.g.add(ltVar.a);
                        duration.translationX(ltVar.e - ltVar.c);
                        duration.translationY(ltVar.f - ltVar.d);
                        duration.alpha(0.0f).setListener(new lr(luVar2, ltVar, duration, view4)).start();
                    }
                    if (view5 != null) {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view5.animate();
                        lu luVar3 = (lu) obj5;
                        luVar3.g.add(ltVar.b);
                        viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new ls(luVar3, ltVar, viewPropertyAnimatorAnimate2, view5)).start();
                    }
                    i++;
                    view = null;
                }
                ((ArrayList) r4).clear();
                ((lu) this.b).c.remove((Object) r4);
                return;
            case 10:
                ?? r5 = this.a;
                int size3 = r5.size();
                while (i < size3) {
                    oh ohVar4 = (oh) r5.get(i);
                    Object obj6 = this.b;
                    View view6 = ohVar4.a;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view6.animate();
                    lu luVar4 = (lu) obj6;
                    luVar4.d.add(ohVar4);
                    viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(((nl) obj6).h).setListener(new lp(luVar4, ohVar4, view6, viewPropertyAnimatorAnimate3)).start();
                    i++;
                }
                ((ArrayList) r5).clear();
                ((lu) this.b).a.remove((Object) r5);
                return;
            case 11:
                pv pvVar = (pv) this.a;
                RecyclerView recyclerView = pvVar.m;
                if (recyclerView == null || !recyclerView.q) {
                    return;
                }
                ps psVar = (ps) this.b;
                if (psVar.n) {
                    return;
                }
                oh ohVar5 = psVar.h;
                if (ohVar5.a() != -1) {
                    nl nlVar = pvVar.m.E;
                    if (nlVar == null || !nlVar.t(null)) {
                        List list = pvVar.l;
                        int size4 = list.size();
                        while (i < size4) {
                            if (((ps) list.get(i)).o) {
                                i++;
                            }
                        }
                        pvVar.j.o(ohVar5);
                        return;
                    }
                    pvVar.m.post(this);
                    return;
                }
                return;
            case 12:
                ((qe) this.b).addObserverForBackInvoker((qv) this.a);
                return;
            case 13:
                Object obj7 = this.b;
                aqh aqhVar = (aqh) obj7;
                boolean zIsCancelled = aqhVar.isCancelled();
                ?? r0 = this.a;
                if (zIsCancelled) {
                    return;
                }
                try {
                    ((aqh) obj7).e(r0.call());
                    return;
                } catch (Throwable th) {
                    aqhVar.f(th);
                    return;
                }
            case 14:
                Object obj8 = this.a;
                Map map = ((xk) this.b).a;
                synchronized (map) {
                    CarAppBinder carAppBinder = (CarAppBinder) map.get(obj8);
                    if (carAppBinder != null) {
                        carAppBinder.onDestroyLifecycle();
                    }
                    break;
                }
                return;
            case 15:
                boh bohVar = ((ya) this.b).b;
                if (bohVar.d.a(bob.b)) {
                    Object obj9 = this.a;
                    bnz bnzVar = boa.Companion;
                    bohVar.e((boa) obj9);
                    return;
                }
                return;
            case 16:
                ((atd) this.b).a = this.a;
                return;
            case 17:
                ((Application) this.b).unregisterActivityLifecycleCallbacks(this.a);
                return;
            case 18:
                try {
                    Method method = ate.d;
                    if (method != null) {
                        method.invoke(this.b, this.a, Boolean.FALSE, "AppCompat recreation");
                        return;
                    } else {
                        ate.e.invoke(this.b, this.a, Boolean.FALSE);
                        return;
                    }
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th2) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
                    return;
                }
            case 19:
                ((avr) this.a).b((Typeface) this.b);
                return;
            default:
                Object obj10 = ((zf) this.a).a;
                if (obj10 != null) {
                    ((avr) obj10).b((Typeface) this.b);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ bg(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public bg(Object obj, Object obj2, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public bg(Object obj, Object obj2, int i, short[] sArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
