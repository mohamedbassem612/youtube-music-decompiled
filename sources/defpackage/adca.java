package defpackage;

import app.rive.semantics.SemanticState;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adca {
    public boolean a;
    public float b;
    public String c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public float k;
    public boolean l;
    public boolean m;
    public boolean n;
    public float o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    private agkj v;

    public final adce a() {
        if (this.u == 524287 && this.v != null && this.c != null) {
            return new adbt(this.v, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t);
        }
        StringBuilder sb = new StringBuilder();
        if (this.v == null) {
            sb.append(" surfaceConfigMap");
        }
        if ((this.u & 1) == 0) {
            sb.append(" enableElementsPerformanceMetric");
        }
        if ((this.u & 2) == 0) {
            sb.append(" elementsPerformanceMetricSampleRate");
        }
        if (this.c == null) {
            sb.append(" elementsPerformanceMetricSubSampleRate");
        }
        if ((this.u & 4) == 0) {
            sb.append(" elementsPerformanceMetricPipeline");
        }
        if ((this.u & 8) == 0) {
            sb.append(" ekoProcessorMaxLruCacheSize");
        }
        if ((this.u & 16) == 0) {
            sb.append(" defaultProperties");
        }
        if ((this.u & 32) == 0) {
            sb.append(" thumbnailResolutionType");
        }
        if ((this.u & 64) == 0) {
            sb.append(" androidUseClipBounds");
        }
        if ((this.u & SemanticState.Focused) == 0) {
            sb.append(" reportMissingImageSources");
        }
        if ((this.u & SemanticState.Hidden) == 0) {
            sb.append(" sectionsConfigurationUseBackgroundChangeSets");
        }
        if ((this.u & SemanticState.LiveRegion) == 0) {
            sb.append(" collectionRangeRatio");
        }
        if ((this.u & SemanticState.ReadOnly) == 0) {
            sb.append(" useExecutorLithoHandler");
        }
        if ((this.u & SemanticState.Modal) == 0) {
            sb.append(" useCompositeDisposableForCommands");
        }
        if ((this.u & SemanticState.Obscured) == 0) {
            sb.append(" enableElementsPbToFbMetric");
        }
        if ((this.u & SemanticState.Multiline) == 0) {
            sb.append(" imagePrefetchRangeRatio");
        }
        if ((this.u & 16384) == 0) {
            sb.append(" enableHorizontalSwipeProtectorForShorts");
        }
        if ((this.u & 32768) == 0) {
            sb.append(" enableHorizontalFadedScrim");
        }
        if ((this.u & 65536) == 0) {
            sb.append(" enableVerticalFadedScrim");
        }
        if ((this.u & 131072) == 0) {
            sb.append(" useNoScheduledPerfFlush");
        }
        if ((this.u & 262144) == 0) {
            sb.append(" elementPresenterRetainsLithoState");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(Map map) {
        this.v = agkj.h(map);
    }
}
