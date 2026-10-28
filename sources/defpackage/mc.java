package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.car.app.CarAppBinder;
import com.google.android.apps.youtube.music.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mc implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public mc(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [char[]] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        ts tsVar;
        Throwable th;
        ?? r5;
        ut utVar;
        ts tsVar2;
        Throwable th2;
        ut utVar2;
        Object obj;
        ?? r6 = 0;
        utVar = null;
        utVar = null;
        ut utVar3 = null;
        r6 = 0;
        ut utVar4 = null;
        switch (this.$cid) {
            case 0:
                mf mfVar = (mf) this.a;
                int i = mfVar.q;
                if (i == 1) {
                    mfVar.p.cancel();
                } else if (i != 2) {
                    return;
                }
                mfVar.q = 3;
                ValueAnimator valueAnimator = mfVar.p;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case 1:
                mb mbVar = (mb) this.a;
                mbVar.b = null;
                mbVar.drawableStateChanged();
                return;
            case 2:
                ViewParent parent = ((mg) this.a).c.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            case 3:
                mg mgVar = (mg) this.a;
                mgVar.d();
                View view = mgVar.c;
                if (view.isEnabled() && !view.isLongClickable() && mgVar.b()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    mgVar.d = true;
                    return;
                }
                return;
            case 4:
                ((mx) this.a).q();
                return;
            case 5:
                mx mxVar = (mx) this.a;
                mb mbVar2 = mxVar.e;
                if (mbVar2 == null || !mbVar2.isAttachedToWindow() || mxVar.e.getCount() <= mxVar.e.getChildCount()) {
                    return;
                }
                mxVar.e.getChildCount();
                mxVar.p.setInputMethodMode(2);
                mxVar.s();
                return;
            case 6:
                ((StaggeredGridLayoutManager) this.a).j();
                return;
            case 7:
                ((Toolbar) this.a).j();
                return;
            case 8:
                qc qcVar = (qc) this.a;
                Runnable runnable = qcVar.a;
                if (runnable != null) {
                    runnable.run();
                    qcVar.a = null;
                    return;
                }
                return;
            case 9:
                qg.g((qg) this.a);
                return;
            case 10:
                SystemClock.elapsedRealtime();
                Object obj2 = this.a;
                try {
                    try {
                        ut utVar5 = new ut();
                        try {
                            ((tz) obj2).b.s(utVar5);
                            utVar = utVar5;
                        } catch (ts e) {
                            tsVar = e;
                            utVar4 = utVar5;
                            Log.w("AppSearchLocalStorage", "Error occurred when check for optimize", tsVar);
                            utVar = utVar4;
                            r6 = utVar4;
                        } catch (Throwable th3) {
                            th = th3;
                            r5 = utVar5;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r5 = r6;
                    }
                    break;
                } catch (ts e2) {
                    tsVar = e2;
                }
                if (utVar != null) {
                    SystemClock.elapsedRealtime();
                    return;
                }
                return;
                if (r5 == 0) {
                    throw th;
                }
                SystemClock.elapsedRealtime();
                throw th;
            case 11:
                SystemClock.elapsedRealtime();
                Object obj3 = this.a;
                try {
                    try {
                        utVar2 = new ut();
                        try {
                            ((ug) obj3).a.s(utVar2);
                        } catch (ts e3) {
                            tsVar2 = e3;
                            utVar3 = utVar2;
                            Log.w("AppSearchSessionImpl", "Error occurred when check for optimize", tsVar2);
                            utVar2 = utVar3;
                        } catch (Throwable th5) {
                            th2 = th5;
                            utVar3 = utVar2;
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                    }
                    break;
                } catch (ts e4) {
                    tsVar2 = e4;
                }
                if (utVar2 != null) {
                    SystemClock.elapsedRealtime();
                    return;
                }
                return;
                if (utVar3 == null) {
                    throw th2;
                }
                SystemClock.elapsedRealtime();
                throw th2;
            case 12:
                ((wj) this.a).a.p().e();
                return;
            case 13:
                ((wj) this.a).a.p().f();
                return;
            case 14:
                ((wj) this.a).a.u = false;
                return;
            case 15:
                Object obj4 = this.a;
                Context context = ((cc) obj4).getContext();
                if (context == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                }
                wo woVar = (wo) obj4;
                woVar.m.k(1);
                woVar.m.j(context.getString(R.string.fingerprint_dialog_touch_sensor));
                return;
            case 16:
                Map map = ((xk) this.a).a;
                synchronized (map) {
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        ((CarAppBinder) it.next()).onAutoDriveEnabled();
                    }
                    break;
                }
                return;
            case 17:
                yb ybVar = (yb) ((xr) this.a).a(yb.class);
                afi.a();
                boh bohVar = (boh) ybVar.c;
                if (bohVar.d.equals(bob.a)) {
                    return;
                }
                Deque deque = ybVar.a;
                if (deque.size() > 1) {
                    List listSingletonList = Collections.singletonList((ya) deque.pop());
                    ya yaVarA = ybVar.a();
                    yaVarA.d = true;
                    ((ww) ybVar.b.a(ww.class)).a();
                    if (bohVar.d.a(bob.d)) {
                        yaVarA.a(boa.ON_START);
                    }
                    Iterator it2 = listSingletonList.iterator();
                    while (it2.hasNext()) {
                        yb.c((ya) it2.next(), true);
                    }
                    if (bohVar.d.a(bob.e) && deque.contains(yaVarA)) {
                        yaVarA.a(boa.ON_RESUME);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                Object obj5 = this.a;
                Activity activity = (Activity) obj5;
                if (activity.isFinishing()) {
                    return;
                }
                Field field = ate.b;
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.recreate();
                    return;
                }
                if ((!ate.a() || ate.f != null) && (ate.e != null || ate.d != null)) {
                    try {
                        Object obj6 = ate.c.get(obj5);
                        if (obj6 != null && (obj = ate.b.get(obj5)) != null) {
                            Application application = ((Activity) obj5).getApplication();
                            atd atdVar = new atd((Activity) obj5);
                            application.registerActivityLifecycleCallbacks(atdVar);
                            ate.g.post(new bg(atdVar, obj6, 16, (char[]) null));
                            try {
                                if (ate.a()) {
                                    Method method = ate.f;
                                    Boolean bool = Boolean.FALSE;
                                    method.invoke(obj, obj6, null, null, 0, bool, null, null, bool, bool);
                                } else {
                                    ((Activity) obj5).recreate();
                                }
                                return;
                            } finally {
                                ate.g.post(new bg(application, atdVar, 17, (char[]) null));
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 19:
                View view2 = (View) this.a;
                ((InputMethodManager) view2.getContext().getSystemService("input_method")).showSoftInput(view2, 0);
                return;
            default:
                View view3 = ((bcv) this.a).a;
                ViewParent parent2 = view3.getParent();
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(view3);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ mc(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
