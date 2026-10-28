package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avfp {
    public static final avbb a;
    public static final avbb b;
    public static final avbb c;
    public static final avbb d;
    public static final avbb e;
    static final avbb f;
    public static final avbb g;
    public static final avbb h;
    public static final avbb i;
    public static final avca j;
    public static final auyp k;
    public static final auyw l;
    public static final avjv m;
    public static final avjv n;
    public static final agfr o;
    private static final Logger p = Logger.getLogger(avfp.class.getName());
    private static final Set q = DesugarCollections.unmodifiableSet(EnumSet.of(Status.Code.OK, Status.Code.INVALID_ARGUMENT, Status.Code.NOT_FOUND, Status.Code.ALREADY_EXISTS, Status.Code.FAILED_PRECONDITION, Status.Code.ABORTED, Status.Code.OUT_OF_RANGE, Status.Code.DATA_LOSS));

    static {
        Charset.forName("US-ASCII");
        avfo avfoVar = new avfo(0);
        int i2 = avbb.c;
        a = new avaz("grpc-timeout", avfoVar);
        b = new avaz("grpc-encoding", avbe.b);
        c = avac.a("grpc-accept-encoding", new avfr(1));
        d = new avaz("content-encoding", avbe.b);
        e = avac.a("accept-encoding", new avfr(1));
        f = new avaz("content-length", avbe.b);
        g = new avaz("content-type", avbe.b);
        h = new avaz("te", avbe.b);
        i = new avaz("user-agent", avbe.b);
        agfm.b(',').e();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        TimeUnit timeUnit3 = TimeUnit.SECONDS;
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        j = new avik();
        k = new auyp("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", null);
        l = new auyw();
        m = new avfl();
        n = new avfm();
        o = new avfn(0);
    }

    private avfp() {
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0029  */
    /* JADX WARN: Code duplicated, block: B:25:0x0035  */
    public static Status a(int i2) {
        Status.Code code;
        if ((i2 >= 100 && i2 < 200) || i2 == 400) {
            code = Status.Code.INTERNAL;
        } else if (i2 == 401) {
            code = Status.Code.UNAUTHENTICATED;
        } else if (i2 == 403) {
            code = Status.Code.PERMISSION_DENIED;
        } else if (i2 == 404) {
            code = Status.Code.UNIMPLEMENTED;
        } else if (i2 == 429) {
            code = Status.Code.UNAVAILABLE;
        } else if (i2 != 431) {
            switch (i2) {
                case 502:
                case 503:
                case 504:
                    code = Status.Code.UNAVAILABLE;
                    break;
                default:
                    code = Status.Code.UNKNOWN;
                    break;
            }
        } else {
            code = Status.Code.INTERNAL;
        }
        return code.a().withDescription(a.bR(i2, "HTTP status code "));
    }

    public static Status b(Status status) {
        if (!q.contains(status.getCode())) {
            return status;
        }
        return Status.l.withDescription("Inappropriate status code from control plane: " + status.getCode().toString() + ' ' + status.getDescription()).c(status.p);
    }

    static avdx c(avan avanVar, boolean z) {
        avdx avdxVarA;
        avaq avaqVar = avanVar.b;
        if (avaqVar != null) {
            avdd avddVar = (avdd) avaqVar;
            ahno.P(avddVar.g, "Subchannel is not started");
            avdxVarA = avddVar.f.a();
        } else {
            avdxVarA = null;
        }
        if (avdxVarA != null) {
            return avdxVarA;
        }
        Status status = avanVar.c;
        if (status.e()) {
            return null;
        }
        if (avanVar.d) {
            return new avfc(b(status), avdv.c);
        }
        if (z) {
            return null;
        }
        return new avfc(b(status), avdv.a);
    }

    public static String d(String str, int i2) {
        String str2;
        int i3;
        try {
            str2 = str;
            i3 = i2;
            try {
                return new URI(null, null, str2, i3, null, null, null).getAuthority();
            } catch (URISyntaxException e2) {
                e = e2;
                throw new IllegalArgumentException("Invalid host or port: " + str2 + ' ' + i3, e);
            }
        } catch (URISyntaxException e3) {
            e = e3;
            str2 = str;
            i3 = i2;
        }
    }

    public static void e(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            p.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (Throwable) e2);
        }
    }

    public static ThreadFactory f(String str) {
        ahfi ahfiVar = new ahfi();
        ahfiVar.b();
        ahfiVar.c(str);
        return ahfi.a(ahfiVar);
    }

    public static auyw[] g(auyq auyqVar, int i2, boolean z, boolean z2) {
        List list = auyqVar.e;
        int size = list.size();
        auyw[] auywVarArr = new auyw[size + 1];
        auyqVar.getClass();
        for (int i3 = 0; i3 < list.size(); i3++) {
            auywVarArr[i3] = ((atxy) list.get(i3)).n();
        }
        auywVarArr[size] = l;
        return auywVarArr;
    }

    static void h(auym auymVar) {
        while (true) {
            InputStream inputStreamB = auymVar.b();
            if (inputStreamB == null) {
                return;
            } else {
                e(inputStreamB);
            }
        }
    }
}
