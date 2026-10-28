package com.google.android.libraries.multiplatform.elements.runtime;

import defpackage.agrc;
import defpackage.agrf;
import defpackage.oye;
import defpackage.qdq;
import defpackage.qdv;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RenderNextCrashReporter {
    private static final agrf a = agrf.h("com/google/android/libraries/multiplatform/elements/runtime/RenderNextCrashReporter");
    private static final AtomicBoolean b = new AtomicBoolean(false);

    private RenderNextCrashReporter() {
    }

    public static void interceptFatalCrash(Throwable th) {
        if (b.getAndSet(true)) {
            return;
        }
        try {
            long[] jArrJniGetCrashMetadata = NodeTreeProcessorImpl.jniGetCrashMetadata();
            if (jArrJniGetCrashMetadata == null || jArrJniGetCrashMetadata.length < 6) {
                return;
            }
            long j = jArrJniGetCrashMetadata[0];
            oye oyeVar = null;
            if (j >= 0) {
                int i = (int) j;
                if (i != 128) {
                    switch (i) {
                        case 1:
                            oyeVar = oye.a;
                            break;
                        case 2:
                            oyeVar = oye.c;
                            break;
                        case 3:
                            oyeVar = oye.d;
                            break;
                        case 4:
                            oyeVar = oye.e;
                            break;
                        case 5:
                            oyeVar = oye.f;
                            break;
                        case 6:
                            oyeVar = oye.h;
                            break;
                        case 7:
                            oyeVar = oye.i;
                            break;
                        case 8:
                            oyeVar = oye.j;
                            break;
                        case 9:
                            oyeVar = oye.k;
                            break;
                        case 10:
                            oyeVar = oye.l;
                            break;
                        case 11:
                            oyeVar = oye.m;
                            break;
                        case 12:
                            oyeVar = oye.n;
                            break;
                        case 13:
                            oyeVar = oye.o;
                            break;
                        case 14:
                            oyeVar = oye.b;
                            break;
                        case 15:
                            oyeVar = oye.g;
                            break;
                        case 16:
                            oyeVar = oye.p;
                            break;
                    }
                } else {
                    oyeVar = oye.q;
                }
            }
            agrc agrcVar = (agrc) ((agrc) a.b()).k("com/google/android/libraries/multiplatform/elements/runtime/RenderNextCrashReporter", "interceptFatalCrash", 51, "RenderNextCrashReporter.java");
            qdv qdvVar = oyeVar != null ? new qdv(oyeVar) : new qdv("N/A");
            long j2 = jArrJniGetCrashMetadata[1];
            Object qdqVar = j2 >= 0 ? new qdq(j2) : new qdv("N/A");
            long j3 = jArrJniGetCrashMetadata[2];
            Object qdqVar2 = j3 >= 0 ? new qdq(j3) : new qdv("N/A");
            long j4 = jArrJniGetCrashMetadata[3];
            Object qdqVar3 = j4 >= 0 ? new qdq(j4) : new qdv("N/A");
            long j5 = jArrJniGetCrashMetadata[4];
            Object qdqVar4 = j5 >= 0 ? new qdq(j5) : new qdv("N/A");
            long j6 = jArrJniGetCrashMetadata[5];
            agrcVar.H("RenderNext Crash Metadata | Op: %s | Snap: %s | Nodes: %s | Slots: %s | Globals: %s | ChildIdx: %s", qdvVar, qdqVar, qdqVar2, qdqVar3, qdqVar4, j6 >= 0 ? new qdq(j6) : new qdv("N/A"));
        } catch (Throwable th2) {
            th.addSuppressed(th2);
            ((agrc) ((agrc) ((agrc) a.b()).j(th)).k("com/google/android/libraries/multiplatform/elements/runtime/RenderNextCrashReporter", "interceptFatalCrash", 'K', "RenderNextCrashReporter.java")).t("RenderNext Production Crash Metadata Scraping Failed!");
        }
    }
}
