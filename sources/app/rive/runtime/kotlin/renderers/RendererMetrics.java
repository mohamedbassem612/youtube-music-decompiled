package app.rive.runtime.kotlin.renderers;

import android.app.Activity;
import android.os.Build;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import app.rive.RiveLog;
import defpackage.awqx;
import defpackage.awrj;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RendererMetrics implements Window$OnFrameMetricsAvailableListener {
    private static final double ONE_MS_IN_NS = 1000000.0d;
    public static final int SAMPLES = 30;
    private static final String TAG = "RiveL/RendererMetrics";
    private int allFrames;
    private int jankyFrames;
    private final float refreshRateMs;
    private int sampleCount;
    private BigDecimal totalTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public RendererMetrics(Activity activity) {
        activity.getClass();
        this.totalTime = new BigDecimal(0.0d);
        Window window = activity.getWindow();
        final awrj awrjVar = new awrj();
        awrjVar.a = Build.VERSION.SDK_INT >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
        RiveLog.INSTANCE.getLogger().i(TAG, new Function0() { // from class: app.rive.runtime.kotlin.renderers.RendererMetrics$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RendererMetrics._init_$lambda$0(awrjVar);
            }
        });
        this.refreshRateMs = 1000.0f / awrjVar.a;
    }

    static final String _init_$lambda$0(awrj awrjVar) {
        String str = String.format(Locale.US, "Refresh rate: %.1f Hz", Arrays.copyOf(new Object[]{Float.valueOf(awrjVar.a)}, 1));
        str.getClass();
        return str;
    }

    static final String onFrameMetricsAvailable$lambda$0() {
        return "Invalid Window reference.";
    }

    static final String onFrameMetricsAvailable$lambda$1() {
        return "Invalid FrameMetrics reference.";
    }

    public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        if (window == null) {
            RiveLog.INSTANCE.getLogger().w(TAG, new Function0() { // from class: app.rive.runtime.kotlin.renderers.RendererMetrics$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RendererMetrics.onFrameMetricsAvailable$lambda$0();
                }
            });
            return;
        }
        if (frameMetrics == null) {
            RiveLog.INSTANCE.getLogger().w(TAG, new Function0() { // from class: app.rive.runtime.kotlin.renderers.RendererMetrics$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RendererMetrics.onFrameMetricsAvailable$lambda$1();
                }
            });
            return;
        }
        FrameMetrics frameMetrics2 = new FrameMetrics(frameMetrics);
        this.allFrames++;
        this.sampleCount++;
        double metric = frameMetrics2.getMetric(8);
        BigDecimal bigDecimal = this.totalTime;
        double d = metric / ONE_MS_IN_NS;
        BigDecimal bigDecimalAdd = bigDecimal.add(new BigDecimal(String.valueOf(d)));
        bigDecimalAdd.getClass();
        this.totalTime = bigDecimalAdd;
        if (bigDecimalAdd.compareTo(new BigDecimal(String.valueOf(this.refreshRateMs))) > 0) {
            this.jankyFrames++;
        }
        if (this.sampleCount == 30) {
            this.sampleCount = 0;
            double metric2 = frameMetrics2.getMetric(4) / ONE_MS_IN_NS;
            double metric3 = frameMetrics2.getMetric(7) / ONE_MS_IN_NS;
            double metric4 = frameMetrics2.getMetric(6) / ONE_MS_IN_NS;
            Locale locale = Locale.US;
            Double dValueOf = Double.valueOf(d);
            Double dValueOf2 = Double.valueOf(metric2);
            Double dValueOf3 = Double.valueOf(metric3);
            Double dValueOf4 = Double.valueOf(metric4);
            BigDecimal bigDecimal2 = this.totalTime;
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.allFrames);
            bigDecimalValueOf.getClass();
            final String str = String.format(locale, "\\n\n============ FrameMetrics ============\n=== Frame issued in:        %.2fms ===\n=== Draw Time:              %.2fms ===\n=== Swap Buffers Duration:  %.2fms ===\n=== GPU commands sent in:   %.2fms ===\n======================================\n=== Overall average:        %.2fms ===", dValueOf, dValueOf2, dValueOf3, dValueOf4, bigDecimal2.divide(bigDecimalValueOf, 2, RoundingMode.HALF_UP));
            str.getClass();
            RiveLog.INSTANCE.getLogger().i(TAG, new Function0() { // from class: app.rive.runtime.kotlin.renderers.RendererMetrics$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String str2 = str;
                    RendererMetrics.Companion companion = RendererMetrics.Companion;
                    return str2;
                }
            });
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }

    static final String onFrameMetricsAvailable$lambda$2(String str) {
        return str;
    }
}
