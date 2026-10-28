package com.google.android.libraries.elements.interfaces;

import java.util.EnumSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class PerformanceMonitorAdapter {
    public abstract boolean flushPerformanceSpan(PerformanceSpan performanceSpan);

    public abstract long getCurrentThread();

    public abstract EnumSet getPerformanceSpanBlocklist();

    public abstract boolean isMainThread();

    public abstract boolean shouldRecordLogs();
}
