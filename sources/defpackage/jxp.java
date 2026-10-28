package defpackage;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Objects;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jxp implements agfr {
    private final /* synthetic */ int $cid;

    public /* synthetic */ jxp(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agfr
    public final Object io() {
        boolean z;
        int i = 0;
        switch (this.$cid) {
            case 0:
                return Double.valueOf(aupz.a.io().a());
            case 1:
                int i2 = cgq.d;
                return Boolean.valueOf(Build.VERSION.SDK_INT > 37 && Objects.equals(bwp.O("persist.audio.compressed_offload_implicit_aac"), "false"));
            case 2:
                int i3 = ksu.a;
                return Pattern.compile("\\((?:eng-)?(\\d+)-(.+?)[-)$]");
            case 3:
                int i4 = mbt.a;
                return agrf.h("com/google/android/libraries/concurrent/ExceptionHandlingExecutorFactory$ExceptionHandlingOrLoggingRunnable");
            case 4:
                int i5 = mco.a;
                return agrf.h("com/google/android/libraries/concurrent/monitoring/ThreadMonitoring");
            case 5:
                return nxx.a().b();
            case 6:
                return nxx.a().b();
            case 7:
                agfr agfrVar = nqm.a;
                erf erfVar = new erf();
                erfVar.a = new fey();
                return erfVar;
            case 8:
                nsl nslVar = nsl.a;
                return new grj((char[]) null);
            case 9:
                agfr agfrVar2 = nyq.a;
                cck cckVar = new cck(new Handler(Looper.getMainLooper()), 12);
                avmb avmbVar = awlg.a;
                return new awir(cckVar);
            case 10:
                aga agaVar = ElementsServices.a;
                return new rbm();
            case 11:
                return qhw.a();
            case 12:
                AtomicReference atomicReference = qkh.a;
                return MoreExecutors.b(Executors.newSingleThreadScheduledExecutor(new qkf(i)));
            case 13:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                try {
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    int i6 = runningAppProcessInfo.importance;
                    z = runningAppProcessInfo.importance >= 400;
                } catch (RuntimeException e) {
                    Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e);
                }
                return Boolean.valueOf(z);
            case 14:
                return Boolean.FALSE;
            case 15:
                Executor executor = taf.a;
                return new vp(4);
            case 16:
                return agdf.a;
            case 17:
                axh axhVar = axg.a;
                return aie.g(TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1, axg.a);
            case 18:
                return NumberFormat.getIntegerInstance();
            case 19:
                int i7 = tyu.a;
                return Pattern.compile("^https?://(?:[a-z0-9-]+\\.)*(?:(?:google|youtube)\\.(?:[a-z]{2,3}|(?:com?|co)\\.[a-z]{2})|googleapis\\.com|googleusercontent\\.com)\\.?(?::[0-9]+)?/(?:url|redirect)(?:[?#/]|$)", 2);
            default:
                return tnr.d;
        }
    }
}
