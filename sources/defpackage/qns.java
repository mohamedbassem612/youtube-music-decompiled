package defpackage;

import android.os.Looper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qns implements qno {
    private final awmd a;
    private final mbc b;

    public qns(awmd awmdVar, mbc mbcVar) {
        this.a = awmdVar;
        this.b = mbcVar;
    }

    @Override // defpackage.qno
    public final void a() {
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: qnr
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                this.a.b(defaultUncaughtExceptionHandler, thread, th);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b4 A[Catch: all -> 0x00c4, LOOP:3: B:33:0x00ae->B:35:0x00b4, LOOP_END, TRY_LEAVE, TryCatch #2 {all -> 0x00c4, blocks: (B:3:0x0006, B:5:0x0015, B:6:0x002a, B:8:0x0030, B:20:0x0078, B:21:0x007c, B:22:0x0085, B:24:0x008b, B:29:0x00a2, B:31:0x00a7, B:32:0x00aa, B:33:0x00ae, B:35:0x00b4, B:9:0x0036, B:10:0x004a, B:12:0x0050, B:13:0x0064, B:15:0x006e, B:17:0x0073, B:16:0x0071, B:26:0x0098), top: B:44:0x0006, inners: #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    public final /* synthetic */ void b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        Iterator it;
        long jB = this.b.b();
        try {
            ArrayList arrayList = new ArrayList();
            if (thread == Looper.getMainLooper().getThread()) {
                Set set = (Set) this.a.io();
                ArrayList arrayList2 = new ArrayList(set.size());
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    try {
                        Object obj = ((ahub) it2.next()).a;
                        agjz agjzVar = new agjz(4);
                        Iterator it3 = ((afwd) obj).d.entrySet().iterator();
                        while (it3.hasNext()) {
                            agjzVar.h(((afwz) ((Map.Entry) it3.next()).getValue()).b());
                        }
                        arrayList2.add(agjzVar.g().isEmpty() ? aher.a : aher.a);
                    } catch (Throwable th2) {
                        arrayList.add(th2);
                    }
                }
                agqs agqsVarListIterator = ahng.f(arrayList2).listIterator(0);
                while (agqsVarListIterator.hasNext()) {
                    try {
                        ahng.b((ListenableFuture) agqsVarListIterator.next(), 4000 - (this.b.b() - jB), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException e) {
                        arrayList.add(e);
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((Throwable) it.next()).printStackTrace();
                        }
                        if (uncaughtExceptionHandler != null) {
                            uncaughtExceptionHandler.uncaughtException(thread, th);
                        }
                    } catch (Throwable th3) {
                        arrayList.add(th3);
                    }
                }
            }
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((Throwable) it.next()).printStackTrace();
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th4) {
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
            throw th4;
        }
    }
}
