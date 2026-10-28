package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class afkd implements Runnable {
    Runnable a;
    final /* synthetic */ afkf b;

    public afkd(afkf afkfVar) {
        this.b = afkfVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002b A[Catch: all -> 0x0056, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0056, blocks: (B:3:0x0001, B:18:0x002b, B:34:0x004e, B:35:0x0055, B:5:0x0007, B:6:0x000b, B:21:0x0034, B:24:0x003f, B:26:0x0044, B:27:0x0046, B:29:0x0048), top: B:50:0x0001, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0026 A[EDGE_INSN: B:54:0x0026->B:15:0x0026 BREAK  A[LOOP:0: B:53:0x0007->B:24:0x003f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        r3 = r3 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        r7.a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        r7.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        throw r1;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            r0 = 1
            defpackage.qpj.c()     // Catch: java.lang.Throwable -> L56
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            afkf r4 = r7.b     // Catch: java.lang.Throwable -> L4b
            java.util.Deque r5 = r4.a     // Catch: java.lang.Throwable -> L4b
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L4b
            if (r2 != 0) goto L1c
            int r2 = r4.f     // Catch: java.lang.Throwable -> L49
            r6 = 2
            if (r2 != r6) goto L15
            r2 = r0
            goto L16
        L15:
            r2 = r1
        L16:
            defpackage.ahno.O(r2)     // Catch: java.lang.Throwable -> L49
            r2 = 3
            r4.f = r2     // Catch: java.lang.Throwable -> L49
        L1c:
            java.lang.Object r2 = r5.poll()     // Catch: java.lang.Throwable -> L49
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch: java.lang.Throwable -> L49
            r7.a = r2     // Catch: java.lang.Throwable -> L49
            if (r2 != 0) goto L33
            r4.f = r0     // Catch: java.lang.Throwable -> L49
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L32
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L56
            r1.interrupt()     // Catch: java.lang.Throwable -> L56
        L32:
            return
        L33:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L49
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L4b
            r3 = r3 | r2
            r2 = 0
            java.lang.Runnable r4 = r7.a     // Catch: java.lang.Throwable -> L43
            r4.run()     // Catch: java.lang.Throwable -> L43
            r7.a = r2     // Catch: java.lang.Throwable -> L4b
            r2 = r0
            goto L7
        L43:
            r1 = move-exception
            r7.a = r2     // Catch: java.lang.Throwable -> L4b
            throw r1     // Catch: java.lang.Throwable -> L4b
        L47:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L49
            throw r1     // Catch: java.lang.Throwable -> L4b
        L49:
            r1 = move-exception
            goto L47
        L4b:
            r1 = move-exception
            if (r3 == 0) goto L55
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L56
            r2.interrupt()     // Catch: java.lang.Throwable -> L56
        L55:
            throw r1     // Catch: java.lang.Throwable -> L56
        L56:
            r1 = move-exception
            afkf r7 = r7.b
            java.util.Deque r2 = r7.a
            monitor-enter(r2)
            r7.f = r0     // Catch: java.lang.Throwable -> L62
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L62
            throw r1
        L60:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L62
            throw r7
        L62:
            r7 = move-exception
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afkd.run():void");
    }

    public final String toString() {
        String str;
        Runnable runnable = this.a;
        if (runnable != null) {
            return a.cn((byte) 125, runnable, "SequentialExecutorWorker{running=");
        }
        int i = this.b.f;
        if (i == 1) {
            str = "IDLE";
        } else if (i != 2) {
            str = i != 3 ? "null" : "RUNNING";
        } else {
            str = "QUEUED";
        }
        return a.bU((byte) 125, str, "SequentialExecutorWorker{state=");
    }
}
