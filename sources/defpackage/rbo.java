package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rbo {
    private Instant A;
    private Instant B;
    private boolean C;
    private boolean D;
    private aihf E;
    public Duration c;
    public Duration d;
    private final List i;
    private final Duration j;
    private final Optional k;
    private final qyt l;
    private Duration n;
    private Duration o;
    private Duration p;
    private Duration q;
    private Duration r;
    private Duration s;
    private Instant t;
    private Duration u;
    private Duration v;
    private long w;
    private long x;
    private int y;
    private int z;
    private static final rbm F = new rbm("rbo");
    private static final Duration e = Duration.ofSeconds(1);
    public static final Duration a = Duration.ofSeconds(5);
    private static final Duration f = Duration.ofSeconds(1);
    private static final Duration g = Duration.ofMillis(-1);
    private static final Instant h = Instant.MIN;
    public final List b = new ArrayList();
    private Instant m = Instant.now();

    public rbo(Optional optional, qyt qytVar, Duration duration) {
        Duration duration2 = g;
        this.n = duration2;
        this.o = duration2;
        this.p = duration2;
        this.q = duration2;
        this.r = duration2;
        this.s = duration2;
        this.t = Instant.MIN;
        this.u = duration2;
        this.v = duration2;
        this.w = 0L;
        this.x = 0L;
        this.y = 0;
        this.z = 0;
        this.c = duration2;
        this.d = duration2;
        Instant instant = h;
        this.A = instant;
        this.B = instant;
        this.C = false;
        this.D = false;
        this.E = andu.a.createBuilder();
        this.k = optional;
        this.l = qytVar;
        this.i = new ArrayList();
        this.j = duration;
    }

    private final void i() {
        if (Duration.between(this.m, Instant.now()).compareTo(this.j) >= 0) {
            new rbc(F, rbd.a).b((andu) this.E.build());
            this.E = andu.a.createBuilder();
            this.m = Instant.now();
        }
    }

    private static final void j(agjz agjzVar, agjz agjzVar2, quc qucVar, Duration duration, Duration duration2) {
        agqr it = qucVar.b().iterator();
        while (it.hasNext()) {
            qup qupVar = (qup) it.next();
            Duration durationPlus = qupVar.c.plus(qupVar.d);
            durationPlus.getClass();
            if (!aext.j(duration, durationPlus)) {
                Duration duration3 = qupVar.c;
                duration3.getClass();
                if (!aext.k(duration2, duration3)) {
                    for (qvc qvcVar : qupVar.is()) {
                        aihf aihfVarCreateBuilder = anec.a.createBuilder();
                        String strC = qvcVar.c();
                        aihfVarCreateBuilder.copyOnWrite();
                        anec anecVar = (anec) aihfVarCreateBuilder.instance;
                        strC.getClass();
                        anecVar.b |= 1;
                        anecVar.c = strC;
                        agjzVar2.h((anec) aihfVarCreateBuilder.build());
                    }
                    qus qusVar = qupVar.b;
                    if (qusVar instanceof quv) {
                        agjzVar.h(ancj.MEDIA_ENGINE_SEGMENT_TYPE_IMAGE);
                    } else if (qusVar instanceof quy) {
                        agjzVar.h(ancj.MEDIA_ENGINE_SEGMENT_TYPE_TEXT);
                    } else if (qusVar instanceof quz) {
                        agjzVar.h(ancj.MEDIA_ENGINE_SEGMENT_TYPE_VIDEO);
                    } else if (qusVar instanceof qur) {
                        agjzVar.h(ancj.MEDIA_ENGINE_SEGMENT_TYPE_AUDIO);
                    } else if (qusVar instanceof quw) {
                        agjzVar.h(ancj.MEDIA_ENGINE_SEGMENT_TYPE_SHAPE);
                    } else if (qusVar instanceof qux) {
                        agjzVar.h(ancj.MEDIA_ENGINE_SEGMENT_TYPE_SKOTTIE);
                    } else if (qusVar instanceof qut) {
                        agjzVar.h(ancj.MEDIA_ENGINE_SEGMENT_TYPE_EMPTY);
                    } else {
                        agjzVar.h(ancj.MEDIA_ENGINE_SEGMENT_TYPE_UNKNOWN);
                    }
                }
            }
        }
        agqr it2 = qucVar.d().iterator();
        while (it2.hasNext()) {
            qxj qxjVar = (qxj) it2.next();
            if (!qxjVar.c() && qxjVar.d && (qxjVar.e != null || qxjVar.f != null)) {
                Duration durationB = qxjVar.b();
                durationB.getClass();
                if (aext.j(duration2, durationB)) {
                    Duration durationPlus2 = qxjVar.b().plus(qxjVar.c);
                    durationPlus2.getClass();
                    if (aext.i(duration, durationPlus2)) {
                        aihf aihfVarCreateBuilder2 = anec.a.createBuilder();
                        aihfVarCreateBuilder2.copyOnWrite();
                        anec anecVar2 = (anec) aihfVarCreateBuilder2.instance;
                        anecVar2.b |= 1;
                        anecVar2.c = "TransitionEffect";
                        agjzVar2.h((anec) aihfVarCreateBuilder2.build());
                    }
                }
            }
        }
    }

    public final synchronized void a(Duration duration, Duration duration2, Duration duration3) {
        if (this.D) {
            Duration duration4 = this.p;
            Duration duration5 = g;
            if (duration4.equals(duration5)) {
                this.p = duration;
            }
            if (this.r.equals(duration5)) {
                this.r = duration2;
            }
            this.s = duration2;
            this.q = duration;
            aihf aihfVarCreateBuilder = apsi.a.createBuilder();
            aigu aiguVarAu = ahng.au(duration3);
            aihfVarCreateBuilder.copyOnWrite();
            apsi apsiVar = (apsi) aihfVarCreateBuilder.instance;
            aiguVarAu.getClass();
            apsiVar.c = aiguVarAu;
            apsiVar.b |= 1;
            this.b.add((apsi) aihfVarCreateBuilder.build());
        }
    }

    public final synchronized void b(Duration duration, Duration duration2, Duration duration3) {
        if (this.D) {
            Duration duration4 = this.p;
            Duration duration5 = g;
            if (duration4.equals(duration5)) {
                this.p = duration;
            }
            if (this.r.equals(duration5)) {
                this.r = duration2;
            }
            this.s = duration2;
            this.q = duration;
            if (!this.n.equals(duration5)) {
                this.z++;
                Duration durationMinus = duration.minus(this.n);
                aihf aihfVarCreateBuilder = apsi.a.createBuilder();
                aigu aiguVarAu = ahng.au(durationMinus);
                aihfVarCreateBuilder.copyOnWrite();
                apsi apsiVar = (apsi) aihfVarCreateBuilder.instance;
                aiguVarAu.getClass();
                apsiVar.d = aiguVarAu;
                apsiVar.b |= 2;
                if (this.C) {
                    aigu aiguVarAu2 = ahng.au(durationMinus);
                    aihfVarCreateBuilder.copyOnWrite();
                    apsi apsiVar2 = (apsi) aihfVarCreateBuilder.instance;
                    aiguVarAu2.getClass();
                    apsiVar2.c = aiguVarAu2;
                    apsiVar2.b |= 1;
                }
                this.b.add((apsi) aihfVarCreateBuilder.build());
                this.i.add(durationMinus);
                this.y++;
            }
            if (!duration3.equals(this.o)) {
                this.w++;
                this.o = duration3;
            }
            this.x++;
            this.n = duration5;
        }
    }

    public final synchronized void c(Duration duration, Duration duration2, boolean z) {
        if (this.D) {
            Duration duration3 = this.p;
            Duration duration4 = g;
            if (duration3.equals(duration4)) {
                this.p = duration;
            }
            this.C = z;
            if (this.r.equals(duration4)) {
                this.r = duration2;
            }
            this.s = duration2;
            this.q = duration;
            if (this.n.equals(duration4)) {
                this.n = duration;
            }
        }
    }

    public final synchronized void d(Duration duration, quc qucVar) {
        if (this.t.equals(Instant.MIN)) {
            return;
        }
        this.u = Duration.between(this.t, Instant.now());
        this.v = duration;
        this.t = Instant.MIN;
        agjz agjzVar = new agjz(4);
        agjz agjzVar2 = new agjz(4);
        Duration duration2 = this.v;
        j(agjzVar, agjzVar2, qucVar, duration2, duration2);
        aihf aihfVarCreateBuilder = anee.a.createBuilder();
        long millis = this.u.toMillis();
        aihfVarCreateBuilder.copyOnWrite();
        anee aneeVar = (anee) aihfVarCreateBuilder.instance;
        aneeVar.b |= 1;
        aneeVar.c = millis;
        anee aneeVar2 = (anee) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder2 = andt.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        andt andtVar = (andt) aihfVarCreateBuilder2.instance;
        aneeVar2.getClass();
        andtVar.d = aneeVar2;
        andtVar.c = 5;
        aihfVarCreateBuilder2.bF(agjzVar.g());
        aihfVarCreateBuilder2.bE(agjzVar2.g());
        andt andtVar2 = (andt) aihfVarCreateBuilder2.build();
        new rbc(F, rbd.b).a("HawkeyeMetrics::LastSeekDurationMs: %d", Long.valueOf(this.u.toMillis()));
        this.E.bG(andtVar2);
        i();
        Duration duration3 = g;
        this.u = duration3;
        this.v = duration3;
    }

    public final synchronized void e(Duration duration) {
        duration.getClass();
        this.t = aext.i(f, duration) ? Instant.now() : Instant.MIN;
    }

    public final synchronized void f(Duration duration, Duration duration2) {
        this.D = true;
        this.q = duration;
        this.A = Instant.now();
        this.c = duration2;
    }

    public final synchronized void g(quc qucVar, Duration duration) {
        this.D = false;
        this.d = duration;
        this.B = Instant.now();
        if (this.q.minus(this.p).compareTo(e) >= 0) {
            agjz agjzVar = new agjz(4);
            agjz agjzVar2 = new agjz(4);
            j(agjzVar, agjzVar2, qucVar, this.r, this.s);
            aihf aihfVarCreateBuilder = anef.a.createBuilder();
            long j = this.x;
            aihfVarCreateBuilder.copyOnWrite();
            anef anefVar = (anef) aihfVarCreateBuilder.instance;
            anefVar.b |= 2;
            anefVar.d = j;
            long j2 = this.w;
            aihfVarCreateBuilder.copyOnWrite();
            anef anefVar2 = (anef) aihfVarCreateBuilder.instance;
            anefVar2.b |= 1;
            anefVar2.c = j2;
            int i = this.y;
            aihfVarCreateBuilder.copyOnWrite();
            anef anefVar3 = (anef) aihfVarCreateBuilder.instance;
            anefVar3.b |= 4;
            anefVar3.e = i;
            int iOrElse = (int) Collection.EL.stream(this.i).mapToLong(new cpt(8)).average().orElse(0.0d);
            aihfVarCreateBuilder.copyOnWrite();
            anef anefVar4 = (anef) aihfVarCreateBuilder.instance;
            anefVar4.b |= 8;
            anefVar4.f = iOrElse;
            anef anefVar5 = (anef) aihfVarCreateBuilder.build();
            aihf aihfVarCreateBuilder2 = andt.a.createBuilder();
            long millis = this.q.minus(this.p).toMillis();
            aihfVarCreateBuilder2.copyOnWrite();
            andt andtVar = (andt) aihfVarCreateBuilder2.instance;
            andtVar.b |= 1;
            andtVar.e = millis;
            aihfVarCreateBuilder2.copyOnWrite();
            andt andtVar2 = (andt) aihfVarCreateBuilder2.instance;
            anefVar5.getClass();
            andtVar2.d = anefVar5;
            andtVar2.c = 2;
            aihfVarCreateBuilder2.bF(agjzVar.g());
            aihfVarCreateBuilder2.bE(agjzVar2.g());
            andt andtVar3 = (andt) aihfVarCreateBuilder2.build();
            rbm rbmVar = F;
            rbd rbdVar = rbd.b;
            new rbc(rbmVar, rbdVar).a("HawkeyeMetrics::PlayerUniqueFramePerSecond: %d", Long.valueOf(anefVar5.c / (andtVar3.e / 1000)));
            new rbc(rbmVar, rbdVar).a("HawkeyeMetrics::PlayerStutterFrameCount: %d", Integer.valueOf(anefVar5.e));
            new rbc(rbmVar, rbdVar).a("HawkeyeMetrics::PlayerBufferingFrameCount: %d", Integer.valueOf(this.z));
            new rbc(rbmVar, rbdVar).a("HawkeyeMetrics::RealPlayerDurationMs: %d", Long.valueOf(andtVar3.e));
            new rbc(rbmVar, rbdVar).a("HawkeyeMetrics::MediaCompositionDurationMs: %d", Long.valueOf(qucVar.iu().toMillis()));
            this.E.bG(andtVar3);
            i();
            if (this.l.a.H) {
                Duration durationBetween = Duration.between(this.A, this.B);
                Optional optional = this.k;
                hqc hqcVar = new hqc(this, durationBetween, 17);
                if (true == optional.isPresent()) {
                    Object obj = optional.get();
                    Object obj2 = hqcVar.a;
                    Object obj3 = hqcVar.b;
                    rbs rbsVar = (rbs) obj;
                    aihf aihfVarCreateBuilder3 = apsh.a.createBuilder();
                    aigu aiguVarAu = ahng.au((Duration) obj3);
                    aihfVarCreateBuilder3.copyOnWrite();
                    apsh apshVar = (apsh) aihfVarCreateBuilder3.instance;
                    aiguVarAu.getClass();
                    apshVar.e = aiguVarAu;
                    apshVar.b |= 4;
                    aigu aiguVarAu2 = ahng.au(((rbo) obj2).c);
                    aihfVarCreateBuilder3.copyOnWrite();
                    apsh apshVar2 = (apsh) aihfVarCreateBuilder3.instance;
                    aiguVarAu2.getClass();
                    apshVar2.c = aiguVarAu2;
                    apshVar2.b |= 1;
                    aigu aiguVarAu3 = ahng.au(((rbo) obj2).d);
                    aihfVarCreateBuilder3.copyOnWrite();
                    apsh apshVar3 = (apsh) aihfVarCreateBuilder3.instance;
                    aiguVarAu3.getClass();
                    apshVar3.d = aiguVarAu3;
                    apshVar3.b |= 2;
                    aihfVarCreateBuilder3.copyOnWrite();
                    apsh apshVar4 = (apsh) aihfVarCreateBuilder3.instance;
                    aiie aiieVar = apshVar4.f;
                    if (!aiieVar.c()) {
                        apshVar4.f = aihn.mutableCopy(aiieVar);
                    }
                    aifs.addAll(((rbo) obj2).b, apshVar4.f);
                    rbsVar.j((apsh) aihfVarCreateBuilder3.build());
                }
            }
        }
        this.i.clear();
        Duration duration2 = g;
        this.p = duration2;
        this.q = duration2;
        this.r = duration2;
        this.s = duration2;
        this.t = Instant.MIN;
        this.n = duration2;
        this.o = duration2;
        this.w = 0L;
        this.x = 0L;
        this.y = 0;
        this.z = 0;
        this.C = false;
        Instant instant = h;
        this.A = instant;
        this.B = instant;
        this.c = duration2;
        this.d = duration2;
        this.b.clear();
    }

    public final synchronized boolean h() {
        return this.D;
    }
}
