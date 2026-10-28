package defpackage;

import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class qvu implements Cloneable, Serializable, rjq {
    public final UUID m;
    public final List n;
    public boolean o;
    public Duration p;
    public Duration q;

    static {
        rbm.c(qvu.class);
    }

    protected qvu(qvu qvuVar) {
        this.n = new ArrayList();
        this.o = true;
        this.p = Duration.ZERO;
        this.q = Duration.ZERO;
        this.m = qvuVar.m;
        Iterable$EL.forEach(qvuVar.n, new kjk(this, 13));
        this.o = qvuVar.o;
        this.p = qvuVar.p;
        this.q = qvuVar.q;
    }

    @Override // 
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract qvu clone();

    @Override // defpackage.rjq
    public final Duration ir() {
        return this.p;
    }

    @Override // defpackage.rjq
    public final List is() {
        return DesugarCollections.unmodifiableList(this.n);
    }

    @Override // defpackage.rjq
    public final boolean it() {
        return this.o;
    }

    public Duration iu() {
        return this.q;
    }

    public final Duration p() {
        return this.p.plus(this.q);
    }

    public final void q(qvc qvcVar) {
        this.n.add(qvcVar);
    }

    public final void r() {
        this.n.clear();
    }

    public final void s(qvc qvcVar) {
        this.n.remove(qvcVar);
    }

    public final void t(Duration duration) {
        this.q = nrb.e(duration);
    }

    public String toString() {
        Locale locale = Locale.US;
        UUID uuid = this.m;
        Boolean boolValueOf = Boolean.valueOf(this.o);
        Duration duration = this.p;
        Duration duration2 = this.q;
        Optional optionalOfNullable = Optional.ofNullable(null);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(Integer.valueOf(((ailb) optionalOfNullable.get()).hashCode()));
        }
        return String.format(locale, "Segment{id: %s, enabled: %s, startTime: %s, duration: %s, c2paIngredientValidationResultHash: %s, effects: %s}", uuid, boolValueOf, duration, duration2, optionalOfNullable.orElse(-1), this.n);
    }

    public final void u(Duration duration) {
        this.p = nrb.e(duration);
    }

    protected qvu() {
        this.n = new ArrayList();
        this.o = true;
        this.p = Duration.ZERO;
        this.q = Duration.ZERO;
        this.m = UUID.randomUUID();
    }

    protected qvu(UUID uuid) {
        this.n = new ArrayList();
        this.o = true;
        this.p = Duration.ZERO;
        this.q = Duration.ZERO;
        this.m = uuid;
    }
}
