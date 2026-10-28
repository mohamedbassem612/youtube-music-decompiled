package defpackage;

import com.google.android.libraries.elements.interfaces.PerformanceMonitorAdapter;
import com.google.android.libraries.elements.interfaces.PerformanceSpan;
import com.google.android.libraries.elements.interfaces.PerformanceSpanBlocklist;
import java.util.Collections;
import java.util.EnumSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nzl extends PerformanceMonitorAdapter {
    private final boolean a;
    private final nzm b;

    public nzl(boolean z, nzm nzmVar) {
        this.a = z;
        this.b = nzmVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.PerformanceMonitorAdapter
    public final boolean flushPerformanceSpan(PerformanceSpan performanceSpan) {
        this.b.a(Collections.singletonList(performanceSpan));
        return true;
    }

    @Override // com.google.android.libraries.elements.interfaces.PerformanceMonitorAdapter
    public final long getCurrentThread() {
        return nrd.a().b;
    }

    @Override // com.google.android.libraries.elements.interfaces.PerformanceMonitorAdapter
    public final EnumSet getPerformanceSpanBlocklist() {
        return EnumSet.noneOf(PerformanceSpanBlocklist.class);
    }

    @Override // com.google.android.libraries.elements.interfaces.PerformanceMonitorAdapter
    public final boolean isMainThread() {
        return nrd.a().a;
    }

    @Override // com.google.android.libraries.elements.interfaces.PerformanceMonitorAdapter
    public final boolean shouldRecordLogs() {
        return this.a;
    }
}
