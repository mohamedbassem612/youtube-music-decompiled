package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atzi implements atzk {
    public String a;
    private final atzc b;
    private final String c;
    private final atzb e;
    private final long f;
    private final MessageDigest g;
    private atzk l;
    private int i = 1;
    private final String d = "POST";
    private double h = 0.0d;
    private long j = 1;
    private final Random k = new Random();
    private int m = 1;

    public atzi(String str, atzc atzcVar, atzb atzbVar, atzo atzoVar) {
        this.c = str;
        this.b = atzcVar;
        this.e = atzbVar;
        this.f = atzoVar.a;
        this.g = atzoVar.b;
    }

    private final synchronized void e() {
        int i;
        while (true) {
            i = this.m;
            if (i != 2) {
                break;
            } else {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        if (i == 3) {
            throw new atzm(atzl.CANCELED, "", null);
        }
        aguu.ah(i == 1);
    }

    private final void f(atzm atzmVar) throws atzm {
        if (this.h >= this.f) {
            throw atzmVar;
        }
        double dNextDouble = this.k.nextDouble();
        try {
            double d = this.h;
            long j = this.j;
            this.h = d + (j * dNextDouble);
            Thread.sleep((long) (j * 1000 * dNextDouble));
        } catch (InterruptedException unused) {
        }
        this.j <<= 1;
    }

    private final void g() {
        atzb atzbVar = this.e;
        if (atzbVar.d() > atzbVar.b()) {
            atzbVar.g();
            h();
        }
    }

    private final void h() {
        this.j = 1L;
        this.h = 0.0d;
    }

    private final boolean i() throws atzm {
        try {
            return this.e.i();
        } catch (IOException e) {
            throw new atzm(atzl.REQUEST_BODY_READ_ERROR, "Could not call hasMoreData() on upload stream.", e);
        }
    }

    private final twp j(atzc atzcVar, String str, atzb atzbVar) throws Throwable {
        ListenableFuture listenableFutureA;
        e();
        atzc atzcVar2 = new atzc();
        atzcVar2.d("X-Goog-Upload-Protocol", "resumable");
        atzcVar2.d("X-Goog-Upload-Command", str);
        for (String str2 : atzcVar.c()) {
            Iterator it = atzcVar.b(str2).iterator();
            while (it.hasNext()) {
                atzcVar2.d(str2, (String) it.next());
            }
        }
        if (!atzcVar2.a.containsKey("X-Goog-Hash".toLowerCase(Locale.US))) {
            agev agevVarE = atqo.e(this.g);
            if (agevVarE.g()) {
                atzcVar2.d("X-Goog-Hash", (String) agevVarE.c());
            }
        }
        atzk atzkVarA = atxy.a(str.equals("start") ? this.c : this.a, str.contains("start") ? this.d : "PUT", atzcVar2, atzbVar);
        synchronized (this) {
            this.l = atzkVarA;
            listenableFutureA = atzkVarA.a();
        }
        try {
            axoz axozVar = (axoz) listenableFutureA.get();
            if (!axozVar.d()) {
                return (twp) axozVar.a;
            }
            Object obj = axozVar.b;
            if (((atzm) obj).a != atzl.CANCELED) {
                throw ((Throwable) obj);
            }
            e();
            throw new atzm(atzl.CONNECTION_ERROR, "", null);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException("Unexpected error occurred: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    private static final boolean k(twp twpVar) {
        return twpVar.a / 100 == 4;
    }

    private static final boolean l(twp twpVar) {
        String strA;
        Object obj = twpVar.c;
        return (obj == null || (strA = ((atzc) obj).a("X-Goog-Upload-Status")) == null || !ahno.ag("final", strA)) ? false : true;
    }

    private static final boolean m(twp twpVar) {
        String strA;
        Object obj = twpVar.c;
        return obj != null && (strA = ((atzc) obj).a("X-Goog-Upload-Status")) != null && ahno.ag("active", strA) && twpVar.a == 200;
    }

    @Override // defpackage.atzk
    public final ListenableFuture a() {
        ahev ahevVar = new ahev(new aegt(this, 14));
        ahfi ahfiVar = new ahfi();
        ahfiVar.c("Scotty-Uploader-ResumableTransfer-%d");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(ahfi.a(ahfiVar));
        executorServiceNewSingleThreadExecutor.submit(ahevVar);
        executorServiceNewSingleThreadExecutor.shutdown();
        return ahevVar;
    }

    @Override // defpackage.atzk
    public final void b() {
        synchronized (this) {
            atzk atzkVar = this.l;
            if (atzkVar != null) {
                atzkVar.b();
                this.l = null;
            }
            this.m = 3;
            notifyAll();
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:16:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code duplicated, block: B:26:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0079 A[LOOP:2: B:4:0x0003->B:27:0x0079, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:6:0x000b  */
    /* JADX WARN: Code duplicated, block: B:99:0x000e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x018b -> B:4:0x0003). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final defpackage.twp c(boolean r10) {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atzi.c(boolean):twp");
    }

    public final twp d() throws Throwable {
        synchronized (this) {
        }
        h();
        while (true) {
            try {
                twp twpVarJ = j(this.b, "start", new atzj(ahno.Z(null)));
                if (l(twpVarJ)) {
                    return twpVarJ;
                }
                if (m(twpVarJ)) {
                    atzc atzcVar = (atzc) twpVarJ.c;
                    String strA = atzcVar.a("X-Goog-Upload-URL");
                    try {
                        new URL(strA);
                        this.a = strA;
                        synchronized (this) {
                        }
                        String strA2 = atzcVar.a("X-Goog-Upload-Chunk-Granularity");
                        if (strA2 != null) {
                            try {
                                this.i = Integer.parseInt(strA2);
                            } catch (NumberFormatException e) {
                                throw new atzm(atzl.SERVER_ERROR, "Server returned an invalid chunk granularity.", e);
                            }
                        }
                        return c(false);
                    } catch (MalformedURLException e2) {
                        throw new atzm(atzl.SERVER_ERROR, "Server returned an invalid upload url.", e2);
                    }
                }
                if (k(twpVarJ)) {
                    return twpVarJ;
                }
                f(new atzm(atzl.SERVER_ERROR, twpVarJ.c(), null));
            } catch (atzm e3) {
                if (!e3.a()) {
                    throw e3;
                }
                f(e3);
            }
        }
    }
}
