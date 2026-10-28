package defpackage;

import android.os.Looper;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kus {
    private static ClassLoader a;
    private static Thread b;

    /* JADX WARN: Code duplicated, block: B:47:0x00a2 A[Catch: all -> 0x00d2, PHI: r1
      0x00a2: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v16 java.lang.Thread) binds: [B:7:0x000a, B:41:0x009b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:40:0x0099, B:54:0x00c7, B:12:0x001f, B:44:0x009f, B:47:0x00a2, B:57:0x00cb, B:13:0x0020, B:15:0x002d, B:17:0x003b, B:20:0x0041, B:21:0x0048, B:23:0x0053, B:28:0x0067, B:29:0x006c, B:37:0x007d, B:38:0x0097, B:48:0x00a3, B:52:0x00c5, B:51:0x00ab), top: B:68:0x0003, inners: #0, #6 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static synchronized ClassLoader a() {
        ClassLoader classLoader;
        SecurityException e;
        Thread thread;
        ThreadGroup threadGroup;
        classLoader = a;
        if (classLoader == null) {
            Thread thread2 = b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = b.getContextClassLoader();
                    } catch (SecurityException e2) {
                        Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e2.getMessage());
                    }
                }
                classLoader = contextClassLoader;
                a = classLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i = 0;
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i2];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i2++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i++;
                                }
                                if (thread == null) {
                                    try {
                                        kur kurVar = new kur(threadGroup);
                                        try {
                                            kurVar.setContextClassLoader(null);
                                            kurVar.start();
                                            thread = kurVar;
                                        } catch (SecurityException e3) {
                                            e = e3;
                                            thread = kurVar;
                                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e.getMessage());
                                        }
                                    } catch (SecurityException e4) {
                                        e = e4;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (SecurityException e5) {
                            e = e5;
                            thread = null;
                        }
                    }
                    thread2 = thread;
                }
                b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = b.getContextClassLoader();
                    }
                }
                classLoader = contextClassLoader;
                a = classLoader;
            }
        }
        return classLoader;
    }
}
