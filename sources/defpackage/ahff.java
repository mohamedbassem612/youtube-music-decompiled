package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahff implements Runnable {
    private final /* synthetic */ int $cid;
    Runnable a;
    final /* synthetic */ Object b;

    public ahff(Object obj, int i) {
        this.$cid = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x003b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x014d A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0154, code lost:
    
        if (r7 == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0163, code lost:
    
        r7 = r7 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0164, code lost:
    
        r14.a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0169, code lost:
    
        r14.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x016c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x016e, code lost:
    
        defpackage.ahfg.a.a().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.SequentialExecutor$QueueWorker", "workOnQueue", "Exception while executing runnable " + java.lang.String.valueOf(r14.a), (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0194, code lost:
    
        r14.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0198, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0199, code lost:
    
        r14.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x019b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r7 == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        r7 = r7 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        r14.a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        r14.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        defpackage.ahpo.a.logp(java.util.logging.Level.SEVERE, "com.google.firebase.concurrent.SequentialExecutor$QueueWorker", "workOnQueue", "Exception while executing runnable " + java.lang.String.valueOf(r14.a), (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        r14.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        r14.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00dd, code lost:
    
        if (r7 == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ec, code lost:
    
        r7 = r7 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ed, code lost:
    
        r14.a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f2, code lost:
    
        r14.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f7, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f9, code lost:
    
        r14.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00fb, code lost:
    
        throw r0;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahff.run():void");
    }

    public final String toString() {
        int i = this.$cid;
        if (i == 0) {
            Runnable runnable = this.a;
            if (runnable != null) {
                return a.cn((byte) 125, runnable, "SequentialExecutorWorker{running=");
            }
            return "SequentialExecutorWorker{state=" + a.aI(((ahfg) this.b).d) + '}';
        }
        Runnable runnable2 = this.a;
        if (i != 1) {
            if (runnable2 != null) {
                return a.cn((byte) 125, runnable2, "SequentialExecutorWorker{running=");
            }
            return "SequentialExecutorWorker{state=" + a.aI(((ahpo) this.b).d) + '}';
        }
        if (runnable2 != null) {
            return a.cn((byte) 125, runnable2, "SequentialLithoHandler{running=");
        }
        return "SequentialLithoHandler{state=" + a.aI(((fku) this.b).c) + '}';
    }
}
