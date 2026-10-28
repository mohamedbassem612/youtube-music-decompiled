package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public interface cam {
    Object dequeueInputBuffer();

    Object dequeueOutputBuffer();

    void flush();

    String getName();

    void queueInputBuffer(Object obj);

    void release();

    void setCallback(cal calVar, Executor executor);

    void setOutputStartTimeUs(long j);
}
