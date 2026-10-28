package org.chromium.base;

import defpackage.aeia;
import defpackage.axjc;
import defpackage.axjj;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import org.chromium.base.task.PostTask;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ApplicationStatus {
    public static final Map a = new HashMap();
    public static axjc b;
    public static axjj c;
    public static axjj d;

    static {
        DesugarCollections.synchronizedMap(new HashMap());
    }

    private ApplicationStatus() {
    }

    public static void a(axjc axjcVar) {
        axjj axjjVar = c;
        if (axjjVar == null) {
            axjjVar = new axjj();
            c = axjjVar;
        }
        axjjVar.d(axjcVar);
    }

    public static void b() {
        synchronized (a) {
        }
    }

    public static int getStateForApplication() {
        synchronized (a) {
        }
        return 0;
    }

    public static boolean hasVisibleActivities() {
        getStateForApplication();
        return false;
    }

    private static void registerThreadSafeNativeApplicationStateListener() {
        PostTask.b(new aeia(12));
    }
}
