package defpackage;

import com.google.common.util.concurrent.MoreExecutors;
import io.grpc.Status;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avdt extends auyt {
    public static final Logger a = Logger.getLogger(avdt.class.getName());
    public static final double b;
    public final avbh c;
    public final Executor d;
    public final avdk e;
    public final auzh f;
    public avdn g;
    public auyq h;
    public avdu i;
    public final ScheduledExecutorService j;
    public auzl k = auzl.b;
    private final boolean l;
    private final boolean m;
    private boolean n;
    private boolean o;
    private final avgm p;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        b = 1.0E9d;
    }

    public avdt(avbh avbhVar, Executor executor, auyq auyqVar, avgm avgmVar, ScheduledExecutorService scheduledExecutorService, avdk avdkVar) {
        auza auzaVar = auza.a;
        this.c = avbhVar;
        String str = avbhVar.b;
        System.identityHashCode(this);
        int i = avky.a;
        if (executor == MoreExecutors.directExecutor()) {
            this.d = new avjm();
            this.l = true;
        } else {
            this.d = new avjq(executor);
            this.l = false;
        }
        this.e = avdkVar;
        this.f = auzh.b();
        avbg avbgVar = avbhVar.a;
        this.m = avbgVar == avbg.a || avbgVar == avbg.c;
        this.h = auyqVar;
        this.p = avgmVar;
        this.j = scheduledExecutorService;
    }

    private final void g(Object obj) {
        ahno.P(this.i != null, "Not started");
        ahno.P(!this.n, "call was cancelled");
        ahno.P(!this.o, "call was half-closed");
        try {
            avdu avduVar = this.i;
            if (avduVar instanceof avjh) {
                avjh avjhVar = (avjh) avduVar;
                avjd avjdVar = avjhVar.r;
                if (avjdVar.a) {
                    avjdVar.f.a.u(avjhVar.f.a(obj));
                } else {
                    avjhVar.e(new avix(avjhVar, obj));
                }
            } else {
                avduVar.u(this.c.a(obj));
            }
            if (this.m) {
                return;
            }
            this.i.r();
        } catch (Error e) {
            this.i.h(Status.b.withDescription("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.i.h(Status.b.c(e2).withDescription("Failed to stream message"));
        }
    }

    @Override // defpackage.auyt
    public final void a(atxy atxyVar, avbe avbeVar) {
        avdu avjhVar;
        ScheduledExecutorService scheduledExecutorService;
        auyq auyqVar;
        int i = avky.a;
        ahno.P(this.i == null, "Already started");
        ahno.P(!this.n, "call was cancelled");
        atxyVar.getClass();
        avbeVar.getClass();
        auzh auzhVar = this.f;
        avhi avhiVar = (avhi) this.h.d(avhi.a);
        if (avhiVar != null) {
            Long l = avhiVar.b;
            if (l != null) {
                long jLongValue = l.longValue();
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                atxy atxyVar2 = auzi.c;
                timeUnit.getClass();
                auzi auziVar = new auzi(atxyVar2, System.nanoTime(), jLongValue);
                auzi auziVar2 = this.h.b;
                if (auziVar2 == null || auziVar.compareTo(auziVar2) < 0) {
                    avcl avclVarF = auyq.f(this.h);
                    avclVarF.b = auziVar;
                    this.h = new auyq(avclVarF);
                }
            }
            Boolean bool = avhiVar.c;
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                auyq auyqVar2 = this.h;
                if (zBooleanValue) {
                    avcl avclVarF2 = auyq.f(auyqVar2);
                    avclVarF2.e = Boolean.TRUE;
                    auyqVar = new auyq(avclVarF2);
                } else {
                    avcl avclVarF3 = auyq.f(auyqVar2);
                    avclVarF3.e = Boolean.FALSE;
                    auyqVar = new auyq(avclVarF3);
                }
                this.h = auyqVar;
            }
            Integer num = avhiVar.d;
            if (num != null) {
                auyq auyqVar3 = this.h;
                Integer num2 = auyqVar3.f;
                if (num2 != null) {
                    this.h = auyqVar3.a(Math.min(num2.intValue(), num.intValue()));
                } else {
                    this.h = auyqVar3.a(num.intValue());
                }
            }
            Integer num3 = avhiVar.e;
            if (num3 != null) {
                auyq auyqVar4 = this.h;
                Integer num4 = auyqVar4.g;
                if (num4 != null) {
                    this.h = auyqVar4.b(Math.min(num4.intValue(), num3.intValue()));
                } else {
                    this.h = auyqVar4.b(num3.intValue());
                }
            }
        }
        auyy auyyVar = auyx.a;
        auzl auzlVar = this.k;
        avbeVar.c(avfp.f);
        avbeVar.c(avfp.b);
        avbb avbbVar = avfp.c;
        avbeVar.c(avbbVar);
        byte[] bArr = auzlVar.d;
        if (bArr.length != 0) {
            avbeVar.e(avbbVar, bArr);
        }
        avbeVar.c(avfp.d);
        avbeVar.c(avfp.e);
        auzi auziVarF = f();
        boolean z = auziVarF != null && auziVarF.equals(null);
        avdn avdnVar = new avdn(this, auziVarF, z);
        this.g = avdnVar;
        if (auziVarF == null || avdnVar.c > 0) {
            avgm avgmVar = this.p;
            avbh avbhVar = this.c;
            auyq auyqVar5 = this.h;
            avhb avhbVar = avgmVar.b;
            if (avhbVar.Q) {
                avhi avhiVar2 = (avhi) auyqVar5.d(avhi.a);
                avjhVar = new avjh(avgmVar, avbhVar, avbeVar, auyqVar5, avhiVar2 == null ? null : avhiVar2.f, avhiVar2 != null ? avhiVar2.g : null, auzhVar);
            } else {
                auyw[] auywVarArrG = avfp.g(auyqVar5, 0, false, false);
                auzh auzhVarA = auzhVar.a();
                try {
                    avjhVar = avhbVar.A.a(avbhVar, avbeVar, auyqVar5, auywVarArrG);
                    auzhVar.c(auzhVarA);
                } catch (Throwable th) {
                    auzhVar.c(auzhVarA);
                    throw th;
                }
            }
            this.i = avjhVar;
        } else {
            auyw[] auywVarArrG2 = avfp.g(this.h, 0, false, false);
            String str = true != z ? "CallOptions" : "Context";
            Long l2 = (Long) this.h.d(auyw.a);
            double d = this.g.c;
            double d2 = b;
            this.i = new avfb(Status.e.withDescription(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(d / d2), Double.valueOf(l2 == null ? 0.0d : l2.longValue() / d2))), auywVarArrG2);
        }
        if (this.l) {
            this.i.s();
        }
        auyq auyqVar6 = this.h;
        String str2 = auyqVar6.d;
        Integer num5 = auyqVar6.f;
        if (num5 != null) {
            this.i.l(num5.intValue());
        }
        Integer num6 = this.h.g;
        if (num6 != null) {
            this.i.m(num6.intValue());
        }
        if (auziVarF != null) {
            this.i.j(auziVarF);
        }
        this.i.t(auyyVar);
        this.i.k(this.k);
        this.e.b();
        this.i.n(new avds(this, atxyVar));
        avdn avdnVar2 = this.g;
        if (avdnVar2.e) {
            return;
        }
        if (avdnVar2.b && !avdnVar2.a && (scheduledExecutorService = avdnVar2.f.j) != null) {
            avdnVar2.d = scheduledExecutorService.schedule(new avgg(avdnVar2), avdnVar2.c, TimeUnit.NANOSECONDS);
        }
        avdt avdtVar = avdnVar2.f;
        if (avdnVar2.e) {
            avdnVar2.b();
        }
    }

    @Override // defpackage.auyt
    public final void b(String str, Throwable th) {
        int i = avky.a;
        if (str == null && th == null) {
            CancellationException cancellationException = new CancellationException("Cancelled without a message or cause");
            a.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", (Throwable) cancellationException);
            th = cancellationException;
        }
        if (this.n) {
            return;
        }
        this.n = true;
        try {
            if (this.i != null) {
                Status status = Status.b;
                Status statusWithDescription = str != null ? status.withDescription(str) : status.withDescription("Call cancelled without message");
                if (th != null) {
                    statusWithDescription = statusWithDescription.c(th);
                }
                this.i.h(statusWithDescription);
            }
        } finally {
            avdn avdnVar = this.g;
            if (avdnVar != null) {
                avdnVar.b();
            }
        }
    }

    @Override // defpackage.auyt
    public final void c() {
        int i = avky.a;
        ahno.P(this.i != null, "Not started");
        ahno.P(!this.n, "call was cancelled");
        ahno.P(!this.o, "call already half-closed");
        this.o = true;
        this.i.i();
    }

    @Override // defpackage.auyt
    public final void d(Object obj) {
        int i = avky.a;
        g(obj);
    }

    @Override // defpackage.auyt
    public final void e() {
        int i = avky.a;
        ahno.P(this.i != null, "Not started");
        this.i.v();
    }

    public final auzi f() {
        auzi auziVar = this.h.b;
        if (auziVar == null) {
            return null;
        }
        return auziVar;
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("method", this.c);
        return ageuVarAc.toString();
    }
}
