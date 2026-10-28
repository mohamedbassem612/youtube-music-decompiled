package defpackage;

import java.io.IOException;
import java.net.SocketException;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abta implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    private final Object b;

    public abta(abtd abtdVar, int i) {
        this.$cid = i;
        this.a = abtdVar;
        this.b = Executors.newFixedThreadPool(2, new szw(10, "mediaConn"));
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.$cid != 0) {
            Object obj = this.b;
            synchronized (((fed) obj).a()) {
                Object obj2 = this.a;
                synchronized (obj2) {
                    try {
                        if (((evx) obj2).a.d((fed) obj)) {
                            ((evx) obj2).h.d();
                            try {
                                ((fed) obj).e(((evx) obj2).h, ((evx) obj2).j);
                                ((evx) this.a).h((fed) this.b);
                            } catch (Throwable th) {
                                throw new evf(th);
                            }
                        }
                        ((evx) this.a).b();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return;
        }
        while (!Thread.interrupted()) {
            try {
                try {
                    try {
                        try {
                            Object obj3 = this.a;
                            this.b.execute(new abtc((abtd) obj3, ((abtd) obj3).e.accept()));
                        } catch (Throwable th3) {
                            this.b.shutdownNow();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        ((agrc) ((agrc) ((agrc) abtd.a.b()).j(th4)).k("com/google/android/libraries/youtube/player/proxy/MediaServer$ConnectionAcceptor", "run", 236, "MediaServer.java")).t("Error when accepting a new connection");
                    }
                } catch (IOException e) {
                    ((agrc) ((agrc) ((agrc) abtd.a.b()).j(e)).k("com/google/android/libraries/youtube/player/proxy/MediaServer$ConnectionAcceptor", "run", 231, "MediaServer.java")).t("IOException when accepting a new connection");
                }
            } catch (NoSuchFieldError e2) {
                ((agrc) ((agrc) ((agrc) abtd.a.b()).j(e2)).k("com/google/android/libraries/youtube/player/proxy/MediaServer$ConnectionAcceptor", "run", 233, "MediaServer.java")).t("NoSuchFieldError when accepting a new connection");
            } catch (SocketException e3) {
                String message = e3.getMessage();
                if (message == null || !message.equals("Socket closed")) {
                    ((agrc) ((agrc) ((agrc) abtd.a.b()).j(e3)).k("com/google/android/libraries/youtube/player/proxy/MediaServer$ConnectionAcceptor", "run", 227, "MediaServer.java")).t("SocketException when accepting a new connection");
                }
            }
        }
        this.b.shutdownNow();
    }

    public abta(evx evxVar, fed fedVar, int i) {
        this.$cid = i;
        this.a = evxVar;
        this.b = fedVar;
    }
}
