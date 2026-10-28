package org.chromium.base.task;

import android.os.Looper;
import defpackage.axjw;
import defpackage.axjy;
import defpackage.axkb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.base.ThreadUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class PostTask {
    public static volatile Executor d;
    private static volatile boolean e;
    private static volatile boolean f;
    private static volatile boolean g;
    public static final Object a = new Object();
    public static List b = new ArrayList();
    public static axjw c = new axjw();
    private static final axjy[] h = new axjy[10];

    static {
        for (int i = 0; i <= 5; i++) {
            h[i] = new TaskRunnerImpl(i);
        }
        for (int i2 = 6; i2 <= 9; i2++) {
            h[i2] = new axkb(i2);
        }
    }

    public static void a(int i, Runnable runnable) {
        h[i].b(runnable);
    }

    public static void b(Runnable runnable) {
        if (ThreadUtils.a().getLooper() != Looper.myLooper()) {
            a(7, runnable);
        } else {
            c(7);
            runnable.run();
        }
    }

    public static void c(int i) {
        if (i != 9) {
            boolean z = g;
        }
    }

    private static void onNativeSchedulerReady() {
        List list;
        if (e) {
            return;
        }
        e = true;
        synchronized (a) {
            list = b;
            b = null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((TaskRunnerImpl) it.next()).c();
        }
        boolean z = f;
    }

    private static void resetTaskRunner() {
        for (int i = 0; i <= 5; i++) {
            h[i] = new TaskRunnerImpl(i);
        }
        for (int i2 = 6; i2 <= 9; i2++) {
            h[i2] = new axkb(i2);
        }
    }
}
