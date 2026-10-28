package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import android.os.ProfilingTrigger;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.libraries.elements.interfaces.ClientTemplateProvider;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Consumer$CC;
import java.io.File;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aemk implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public aemk(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, mbc] */
    @Override // java.lang.Runnable
    public final void run() {
        Boolean bool;
        afbe afbeVarA;
        Context context;
        Rect rect;
        int i = 8;
        int i2 = 9;
        int i3 = 3;
        byte[] bArr = null;
        int iC = 0;
        switch (this.$cid) {
            case 0:
                aekz aekzVar = ((aemm) this.a).a;
                aekzVar.p = true;
                aekzVar.c();
                return;
            case 1:
                Object obj = this.a;
                ((aemn) obj).s.E.t(new avgj(obj, bArr));
                return;
            case 2:
                ((Snackbar) this.a).a();
                return;
            case 3:
                ((Future) ((AtomicReference) this.a).get()).cancel(false);
                return;
            case 4:
                ((aera) this.a).f();
                return;
            case 5:
                Object obj2 = this.a;
                synchronized (obj2) {
                    mbc mbcVar = ((aerd) obj2).d;
                    long jB = mbcVar.b() - ((aerd) obj2).i;
                    aihf aihfVarCreateBuilder = axgj.a.createBuilder();
                    long jB2 = mbcVar.b() - ((aerd) obj2).j;
                    aihfVarCreateBuilder.copyOnWrite();
                    axgj axgjVar = (axgj) aihfVarCreateBuilder.instance;
                    axgjVar.b |= 1;
                    axgjVar.c = jB2;
                    aihfVarCreateBuilder.copyOnWrite();
                    axgj axgjVar2 = (axgj) aihfVarCreateBuilder.instance;
                    axgjVar2.b |= 2;
                    axgjVar2.d = jB;
                    long transformStoreSize = ((ClientTemplateProvider) ((aerd) obj2).c.io()).getTransformStoreSize();
                    aihfVarCreateBuilder.copyOnWrite();
                    axgj axgjVar3 = (axgj) aihfVarCreateBuilder.instance;
                    axgjVar3.b |= 16;
                    axgjVar3.g = transformStoreSize;
                    wby wbyVarB = ((wbz) ((aerd) obj2).a.io()).b(((zwb) ((aerd) obj2).b.io()).e());
                    ListenableFuture listenableFutureB = tzk.b(wbyVarB.l());
                    ListenableFuture listenableFutureB2 = tzk.b(wbyVarB.c());
                    ahno.av(listenableFutureB, listenableFutureB2).k(new vtq(aihfVarCreateBuilder, listenableFutureB, listenableFutureB2, 16), ((aerd) obj2).e);
                    break;
                }
                return;
            case 6:
                Object obj3 = this.a;
                try {
                    ProfilingManager profilingManagerM939m = qe$$ExternalSyntheticApiModelOutline1.m939m(((aerq) obj3).a.getSystemService(qe$$ExternalSyntheticApiModelOutline1.m()));
                    if (profilingManagerM939m == null) {
                        twu.d("ProfilingMgrTelemetry", 5, "ProfilingManager system service is null", null);
                        return;
                    }
                    ?? r11 = ((aerq) obj3).d;
                    final aerq aerqVar = (aerq) obj3;
                    profilingManagerM939m.registerForAllProfilingResults(r11, new Consumer() { // from class: aerp
                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void r(Object obj4) {
                            String str;
                            ProfilingResult profilingResultM940m = qe$$ExternalSyntheticApiModelOutline1.m940m(obj4);
                            profilingResultM940m.getClass();
                            int triggerType = profilingResultM940m.getTriggerType();
                            int errorCode = profilingResultM940m.getErrorCode();
                            String resultFilePath = profilingResultM940m.getResultFilePath();
                            String str2 = Build.MANUFACTURER;
                            str2.getClass();
                            Locale locale = Locale.US;
                            locale.getClass();
                            String upperCase = str2.toUpperCase(locale);
                            upperCase.getClass();
                            String str3 = "GOOGLE";
                            boolean zU = awrc.u(upperCase, "GOOGLE", false);
                            aerq aerqVar2 = aerqVar;
                            if (!zU) {
                                str3 = "SAMSUNG";
                                if (!awrc.u(upperCase, "SAMSUNG", false)) {
                                    str3 = "XIAOMI";
                                    if (!awrc.u(upperCase, "XIAOMI", false)) {
                                        str3 = "OPPO";
                                        if (!awrc.u(upperCase, "OPPO", false)) {
                                            str3 = "VIVO";
                                            if (!awrc.u(upperCase, "VIVO", false)) {
                                                str3 = "MOTOROLA";
                                                if (!awrc.u(upperCase, "MOTOROLA", false)) {
                                                    str3 = "OTHER";
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            String str4 = "UNKNOWN";
                            switch (triggerType) {
                                case 0:
                                    str = "NONE";
                                    break;
                                case 1:
                                    str = "APP_FULLY_DRAWN";
                                    break;
                                case 2:
                                    str = "ANR";
                                    break;
                                case 3:
                                    str = "APP_REQUEST_RUNNING_TRACE";
                                    break;
                                case 4:
                                    str = "KILL_FORCE_STOP";
                                    break;
                                case 5:
                                    str = "KILL_RECENTS";
                                    break;
                                case 6:
                                    str = "KILL_TASK_MANAGER";
                                    break;
                                case 7:
                                    str = "OOM";
                                    break;
                                case 8:
                                    str = "ANOMALY";
                                    break;
                                case 9:
                                    str = "KILL_EXCESSIVE_CPU_USAGE";
                                    break;
                                case 10:
                                    str = "COLD_START";
                                    break;
                                case 11:
                                    str = "APP_COMPAT";
                                    break;
                                default:
                                    str = "UNKNOWN";
                                    break;
                            }
                            try {
                                switch (errorCode) {
                                    case 0:
                                        str4 = "ERROR_NONE";
                                        break;
                                    case 1:
                                        str4 = "ERROR_FAILED_RATE_LIMIT_SYSTEM";
                                        break;
                                    case 2:
                                        str4 = "ERROR_FAILED_RATE_LIMIT_PROCESS";
                                        break;
                                    case 3:
                                        str4 = "ERROR_FAILED_PROFILING_IN_PROGRESS";
                                        break;
                                    case 4:
                                        str4 = "ERROR_FAILED_EXECUTING";
                                        break;
                                    case 5:
                                        str4 = "ERROR_FAILED_POST_PROCESSING";
                                        break;
                                    case 6:
                                        str4 = "ERROR_FAILED_NO_DISK_SPACE";
                                        break;
                                    case 7:
                                        str4 = "ERROR_FAILED_INVALID_REQUEST";
                                        break;
                                    case 8:
                                        str4 = "ERROR_UNKNOWN";
                                        break;
                                }
                                twu.d("ProfilingMgrTelemetry", 4, "Received profiling result: trigger=" + str + ", status=" + str4 + ", brand=" + str3 + ", path=" + resultFilePath, null);
                                Object obj5 = aerqVar2.e;
                                ((qtf) ((aerv) obj5).A.io()).b(1L, str, str4, str3);
                                if (resultFilePath != null) {
                                    File file = new File(resultFilePath);
                                    if (errorCode == 0) {
                                        try {
                                            if (file.exists()) {
                                                double length = file.length() / 1024.0d;
                                                ((qtc) ((aerv) obj5).z.io()).b(length, str);
                                                twu.d("ProfilingMgrTelemetry", 4, "Recorded profile size=" + length + "KB and deleting trace file", null);
                                            }
                                        } finally {
                                            if (file.exists()) {
                                                file.delete();
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                twu.d("ProfilingMgrTelemetry", 5, "Failed to handle profiling result", th);
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    Iterator it = atqq.aL(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}).iterator();
                    while (it.hasNext()) {
                        ProfilingTrigger profilingTriggerBuild = new ProfilingTrigger.Builder(((Number) it.next()).intValue()).build();
                        profilingTriggerBuild.getClass();
                        profilingManagerM939m.addProfilingTriggers(atqq.H(profilingTriggerBuild));
                        iC++;
                    }
                    twu.d("ProfilingMgrTelemetry", 4, a.bP(iC, "Registered ", " profiling triggers with ProfilingManager"), null);
                    return;
                } catch (Throwable th) {
                    twu.d("ProfilingMgrTelemetry", 5, "Failed to initialize ProfilingManager telemetry", th);
                    return;
                }
            case 7:
                ((aesg) this.a).a = false;
                return;
            case 8:
                Object obj4 = this.a;
                aesk aeskVar = (aesk) obj4;
                long millis = aeskVar.h.d.e().toMillis();
                aesj aesjVar = (aesj) aeskVar.f.get();
                aeskVar.g.set(new yvt(millis, true == ((aesjVar == null || (bool = aesjVar.a) == null) ? true : bool.booleanValue()) ? 2 : 3, null));
                aeskVar.e.postDelayed(new aemk(obj4, i, bArr), aeskVar.b);
                return;
            case 9:
                Object obj5 = this.a;
                aesn aesnVar = (aesn) obj5;
                aess aessVar = aesnVar.e;
                long millis2 = aessVar.d.e().toMillis();
                int iC2 = ((tqv) aessVar.f).c();
                if (iC2 == 2) {
                    i3 = 1;
                } else if (iC2 == 1) {
                    i3 = 2;
                }
                aesnVar.i = new yvt(millis2, i3, null);
                aesc aescVar = aesnVar.c;
                aescVar.e = millis2 + aesnVar.a;
                if (aescVar.j != null) {
                    Thread thread = aesnVar.f;
                    synchronized (thread) {
                        thread.notify();
                        break;
                    }
                }
                aesnVar.d.postDelayed(new aemk(obj5, i2, bArr), aesnVar.b);
                return;
            case 10:
                ((aety) this.a).a();
                return;
            case 11:
                MaterialButton materialButton = (MaterialButton) this.a;
                if (materialButton.g && materialButton.i && (afbeVarA = materialButton.b.a(false)) != null) {
                    iC = (int) (afbeVarA.c() * 0.11f);
                }
                materialButton.h = iC;
                materialButton.i();
                materialButton.invalidate();
                return;
            case 12:
                ((aezb) this.a).e();
                return;
            case 13:
                aezb aezbVar = (aezb) this.a;
                ((aezu) aezbVar.getCurrentDrawable()).l(false, false, true);
                if (aezbVar.getProgressDrawable() == null || !aezbVar.getProgressDrawable().isVisible()) {
                    if (aezbVar.getIndeterminateDrawable() == null || !aezbVar.getIndeterminateDrawable().isVisible()) {
                        aezbVar.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                afcd afcdVar = (afcd) this.a;
                afcdVar.j = -1;
                afcdVar.invalidate();
                return;
            case 15:
                afcr afcrVar = (afcr) this.a;
                afcq afcqVar = afcrVar.k;
                if (afcqVar == null || (context = afcrVar.j) == null) {
                    return;
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (Build.VERSION.SDK_INT >= 30) {
                    rect = windowManager.getCurrentWindowMetrics().getBounds();
                } else {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    rect = new Rect();
                    rect.right = point.x;
                    rect.bottom = point.y;
                }
                int iHeight = rect.height();
                int[] iArr = new int[2];
                afcqVar.getLocationInWindow(iArr);
                int height = iHeight - (iArr[1] + afcqVar.getHeight());
                int translationY = (int) afcqVar.getTranslationY();
                int i4 = afcrVar.t;
                int i5 = height + translationY;
                if (i5 >= i4) {
                    afcrVar.u = i4;
                    return;
                }
                ViewGroup.LayoutParams layoutParams = afcqVar.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(afcr.c, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                afcrVar.u = afcrVar.t;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += afcrVar.t - i5;
                afcqVar.requestLayout();
                return;
            case 16:
                ((afcr) this.a).f(3);
                return;
            case 17:
                Object obj6 = this.a;
                afcr afcrVar2 = (afcr) obj6;
                afcq afcqVar2 = afcrVar2.k;
                if (afcqVar2 != null) {
                    if (afcqVar2.getParent() != null) {
                        afcqVar2.setVisibility(0);
                    }
                    if (afcqVar2.c == 1) {
                        ValueAnimator valueAnimatorC = afcrVar2.c(0.0f, 1.0f);
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
                        valueAnimatorOfFloat.setInterpolator(afcrVar2.h);
                        valueAnimatorOfFloat.addUpdateListener(new afcg(obj6, 2));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(valueAnimatorC, valueAnimatorOfFloat);
                        animatorSet.setDuration(afcrVar2.d);
                        animatorSet.addListener(new afcn(afcrVar2));
                        animatorSet.start();
                        return;
                    }
                    int iB = afcrVar2.b();
                    afcqVar2.setTranslationY(iB);
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(iB, 0);
                    valueAnimator.setInterpolator(afcrVar2.g);
                    valueAnimator.setDuration(afcrVar2.f);
                    valueAnimator.addListener(new afch(afcrVar2));
                    valueAnimator.addUpdateListener(new afcg(obj6, 3));
                    valueAnimator.start();
                    return;
                }
                return;
            case 18:
                ((afdt) this.a).f(true);
                return;
            case 19:
                afeb afebVar = (afeb) this.a;
                boolean zIsPopupShowing = afebVar.a.isPopupShowing();
                afebVar.k(zIsPopupShowing);
                afebVar.c = zIsPopupShowing;
                return;
            default:
                ((TextInputLayout) this.a).c.requestLayout();
                return;
        }
    }

    public /* synthetic */ aemk(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
