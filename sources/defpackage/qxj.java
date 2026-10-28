package defpackage;

import j$.time.Duration;
import j$.util.Optional;
import java.io.Serializable;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class qxj implements Cloneable, Serializable {
    public final UUID b;
    public Duration c;
    public boolean d;
    public qvu e;
    public qvu f;

    protected qxj(qxj qxjVar) {
        this.c = Duration.ZERO;
        this.d = true;
        this.b = qxjVar.b;
        this.c = qxjVar.c;
        this.d = qxjVar.d;
        qvu qvuVar = qxjVar.e;
        if (qvuVar != null) {
            this.e = qvuVar.clone();
        }
        qvu qvuVar2 = qxjVar.f;
        if (qvuVar2 != null) {
            this.f = qvuVar2.clone();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract qxj clone();

    public final Duration b() {
        boolean z = true;
        if (this.e == null && this.f == null) {
            z = false;
        }
        ahno.F(z);
        qvu qvuVar = this.e;
        qvu qvuVar2 = this.f;
        if (qvuVar == null) {
            qvuVar2.getClass();
            return qvuVar2.p;
        }
        if (qvuVar2 == null) {
            return qvuVar.p.plus(qvuVar.iu()).minus(this.c);
        }
        Duration durationPlus = qvuVar.p.plus(qvuVar.iu());
        qvu qvuVar3 = this.f;
        qvuVar3.getClass();
        Duration durationMinus = durationPlus.minus(qvuVar3.p);
        if (durationMinus.compareTo(this.c) > 0) {
            Duration durationMinus2 = durationMinus.minus(this.c);
            qvu qvuVar4 = this.f;
            qvuVar4.getClass();
            return qvuVar4.p.minus(durationMinus2.dividedBy(2L));
        }
        boolean zIsZero = durationMinus.isZero();
        qvu qvuVar5 = this.f;
        if (zIsZero) {
            qvuVar5.getClass();
            return qvuVar5.p.minus(this.c.dividedBy(2L));
        }
        qvuVar5.getClass();
        return qvuVar5.p;
    }

    public final boolean c() {
        return (this.e instanceof qvq) || (this.f instanceof qvq);
    }

    public String toString() {
        Locale locale = Locale.US;
        Duration duration = this.c;
        Boolean boolValueOf = Boolean.valueOf(this.d);
        Optional optionalOfNullable = Optional.ofNullable(this.e);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((qvu) optionalOfNullable.get()).m);
        }
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((UUID) optionalOfNullable.get()).toString());
        }
        Object objOrElse = optionalOfNullable.orElse("null");
        Optional optionalOfNullable2 = Optional.ofNullable(this.f);
        if (true == optionalOfNullable2.isPresent()) {
            optionalOfNullable2 = Optional.ofNullable(((qvu) optionalOfNullable2.get()).m);
        }
        if (true == optionalOfNullable2.isPresent()) {
            optionalOfNullable2 = Optional.ofNullable(((UUID) optionalOfNullable2.get()).toString());
        }
        return String.format(locale, "Transition{duration=%s, enabled=%b, incomingSegment=%s, outgoingSegment=%s}", duration, boolValueOf, objOrElse, optionalOfNullable2.orElse("null"));
    }

    protected qxj() {
        this.c = Duration.ZERO;
        this.d = true;
        this.b = UUID.randomUUID();
    }
}
