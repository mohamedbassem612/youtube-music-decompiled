package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class v4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v4(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                Runnable runnable = (Runnable) obj2;
                try {
                    ((Runnable) obj).run();
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    try {
                        runnable.run();
                        break;
                    } catch (Throwable th2) {
                        try {
                            th.addSuppressed(th2);
                            break;
                        } catch (Throwable unused) {
                        }
                    }
                    throw th;
                }
            default:
                Stream stream = (Stream) obj2;
                try {
                    ((Stream) obj).close();
                    stream.close();
                    return;
                } catch (Throwable th3) {
                    try {
                        stream.close();
                        break;
                    } catch (Throwable th4) {
                        try {
                            th3.addSuppressed(th4);
                            break;
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th3;
                }
        }
    }
}
