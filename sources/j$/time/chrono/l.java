package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class l implements j, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    public final transient g a;
    public final transient ZoneOffset b;
    public final transient ZoneId c;

    public l(ZoneId zoneId, ZoneOffset zoneOffset, g gVar) {
        Objects.a(gVar, "dateTime");
        this.a = gVar;
        this.b = zoneOffset;
        Objects.a(zoneId, "zone");
        this.c = zoneId;
    }

    public static l p(a aVar, Temporal temporal) {
        l lVar = (l) temporal;
        if (aVar.equals(lVar.getChronology())) {
            return lVar;
        }
        throw new ClassCastException(j$.desugar.sun.nio.fs.i.b("Chronology mismatch, required: ", aVar.getId(), ", actual: ", lVar.getChronology().getId()));
    }

    public static l r(ZoneId zoneId, ZoneOffset zoneOffset, g gVar) {
        Objects.a(gVar, "localDateTime");
        Objects.a(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new l(zoneId, (ZoneOffset) zoneId, gVar);
        }
        ZoneRules rules = zoneId.getRules();
        LocalDateTime localDateTimeS = LocalDateTime.s(gVar);
        List listF = rules.f(localDateTimeS);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() == 0) {
            j$.time.zone.b bVarE = rules.e(localDateTimeS);
            gVar = gVar.A(gVar.a, 0L, 0L, Duration.ofSeconds(bVarE.d.getTotalSeconds() - bVarE.c.getTotalSeconds()).getSeconds(), 0L);
            zoneOffset = bVarE.d;
        } else {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
            }
            gVar = gVar;
        }
        Objects.a(zoneOffset, "offset");
        return new l(zoneId, zoneOffset, gVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static l s(a aVar, Instant instant, ZoneId zoneId) {
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        Objects.a(offset, "offset");
        return new l(zoneId, offset, (g) aVar.y(LocalDateTime.H(instant.getEpochSecond(), instant.getNano(), offset)));
    }

    private Object writeReplace() {
        return new e0((byte) 3, this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final l b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return p(getChronology(), temporalUnit.h(this, j));
        }
        return p(getChronology(), this.a.b(j, temporalUnit).p(this));
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        int i = i.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.C(nVar) : this.b.getTotalSeconds();
        }
        return j$.desugar.sun.nio.fs.g.t(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return p(getChronology(), nVar.r(this, j));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        int i = k.a[aVar.ordinal()];
        if (i == 1) {
            return b(j - j$.desugar.sun.nio.fs.g.t(this), ChronoUnit.SECONDS);
        }
        ZoneId zoneId = this.c;
        g gVar = this.a;
        if (i != 2) {
            return r(zoneId, this.b, gVar.a(j, nVar));
        }
        ZoneOffset zoneOffsetL = ZoneOffset.L(aVar.b.a(j, aVar));
        gVar.getClass();
        return s(getChronology(), Instant.ofEpochSecond(gVar.B(zoneOffsetL), gVar.toLocalTime().d), zoneId);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return j$.desugar.sun.nio.fs.g.f(this, (j) obj);
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        return (nVar instanceof j$.time.temporal.a) || (nVar != null && nVar.h(this));
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.a(temporal, "endExclusive");
        j jVarO = getChronology().O(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.a.e(jVarO.g(this.b).toLocalDateTime(), temporalUnit);
        }
        Objects.a(temporalUnit, "unit");
        return temporalUnit.between(this, jVarO);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof j) && j$.desugar.sun.nio.fs.g.f(this, (j) obj) == 0;
        }
        return true;
    }

    @Override // j$.time.chrono.j
    public final j g(ZoneId zoneId) {
        if (this.c.equals(zoneId)) {
            return this;
        }
        g gVar = this.a;
        gVar.getClass();
        return s(getChronology(), Instant.ofEpochSecond(gVar.B(this.b), gVar.toLocalTime().d), zoneId);
    }

    @Override // j$.time.chrono.j
    public final a getChronology() {
        return this.a.a.getChronology();
    }

    @Override // j$.time.chrono.j
    public final ZoneOffset getOffset() {
        return this.b;
    }

    @Override // j$.time.chrono.j
    public final ZoneId getZone() {
        return this.c;
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ int h(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.g.j(this, nVar);
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.b) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final Temporal x(LocalDate localDate) {
        return p(getChronology(), localDate.p(this));
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            return (nVar == j$.time.temporal.a.INSTANT_SECONDS || nVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) nVar).b : this.a.l(nVar);
        }
        return nVar.k(this);
    }

    @Override // j$.time.chrono.j
    public final /* synthetic */ long toEpochSecond() {
        return j$.desugar.sun.nio.fs.g.t(this);
    }

    @Override // j$.time.chrono.j
    public final b toLocalDate() {
        return this.a.a;
    }

    @Override // j$.time.chrono.j
    public final e toLocalDateTime() {
        return this.a;
    }

    @Override // j$.time.chrono.j
    public final LocalTime toLocalTime() {
        return ((g) toLocalDateTime()).toLocalTime();
    }

    public final String toString() {
        String string = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = string + zoneOffset.c;
        ZoneId zoneId = this.c;
        return zoneOffset != zoneId ? j$.desugar.sun.nio.fs.i.b(str, "[", zoneId.toString(), "]") : str;
    }

    @Override // j$.time.chrono.j
    public final j v(ZoneId zoneId) {
        return r(zoneId, this.b, this.a);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ Object w(j$.desugar.sun.nio.fs.o oVar) {
        return j$.desugar.sun.nio.fs.g.q(this, oVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal y(long j, ChronoUnit chronoUnit) {
        return p(getChronology(), j$.time.temporal.o.b(this, j, chronoUnit));
    }
}
