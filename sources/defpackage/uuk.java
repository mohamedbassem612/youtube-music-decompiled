package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uuk extends uuf {
    private final Duration a;
    private final Duration c;

    public uuk(long j, Duration duration, Duration duration2) {
        super(j);
        this.a = duration;
        this.c = duration2;
        if (duration != null && duration2 != null && duration.compareTo(duration2) > 0) {
            throw new IllegalArgumentException("Start time must be less than or equal to end time.");
        }
    }

    @Override // defpackage.uuf
    public final aufa d(aufa aufaVar) {
        aihf builder = aufaVar.toBuilder();
        builder.getClass();
        aigu aiguVar = ((aufa) builder.instance).f;
        if (aiguVar == null) {
            aiguVar = aigu.a;
        }
        aiguVar.getClass();
        Duration durationV = aext.v(aiguVar);
        aigu aiguVar2 = ((aufa) builder.instance).g;
        if (aiguVar2 == null) {
            aiguVar2 = aigu.a;
        }
        aiguVar2.getClass();
        Duration durationV2 = aext.v(aiguVar2);
        atqo.l(aext.u(g(durationV)), builder);
        atqo.i(aext.u(e(durationV, durationV2)), builder);
        return atqo.h(builder);
    }

    public final Duration e(Duration duration, Duration duration2) throws utw {
        Duration durationG = g(duration);
        Duration duration3 = this.c;
        if (duration3 != null) {
            if (durationG.compareTo(duration3) > 0) {
                throw new utw("Start time must be less than or equal to end time.", this);
            }
            Duration durationMinus = duration3.minus(durationG);
            durationMinus.getClass();
            return durationMinus;
        }
        Duration durationMinus2 = duration2.minus(durationG.minus(duration));
        durationMinus2.getClass();
        if (durationMinus2.isNegative()) {
            throw new utw("Duration must be non-negative.", this);
        }
        return durationMinus2;
    }

    @Override // defpackage.uuf
    public final augy f(augy augyVar) {
        jrr jrrVar = (jrr) augyVar.toBuilder();
        jrrVar.getClass();
        aigu aiguVar = ((augy) jrrVar.instance).i;
        if (aiguVar == null) {
            aiguVar = aigu.a;
        }
        aiguVar.getClass();
        Duration durationV = aext.v(aiguVar);
        aigu aiguVar2 = ((augy) jrrVar.instance).j;
        if (aiguVar2 == null) {
            aiguVar2 = aigu.a;
        }
        aiguVar2.getClass();
        Duration durationV2 = aext.v(aiguVar2);
        atxy.j(aext.u(g(durationV)), jrrVar);
        atxy.i(aext.u(e(durationV, durationV2)), jrrVar);
        return atxy.h(jrrVar);
    }

    public final Duration g(Duration duration) {
        Duration duration2 = this.a;
        return duration2 != null ? duration2 : duration;
    }
}
