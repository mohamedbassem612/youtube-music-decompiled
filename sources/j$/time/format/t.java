package j$.time.format;

import j$.time.ZoneId;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class t {
    public final j$.time.temporal.k a;
    public final DateTimeFormatter b;
    public int c;

    public t(j$.time.temporal.k kVar, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.s sVar = dateTimeFormatter.d;
        if (sVar != null) {
            j$.time.chrono.a aVar = (j$.time.chrono.a) kVar.w(j$.time.temporal.o.b);
            ZoneId zoneId = (ZoneId) kVar.w(j$.time.temporal.o.a);
            j$.time.chrono.b bVarL = null;
            sVar = Objects.equals(sVar, aVar) ? null : sVar;
            Objects.equals(null, zoneId);
            if (sVar != null) {
                if (sVar != null) {
                    if (kVar.d(j$.time.temporal.a.EPOCH_DAY)) {
                        bVarL = sVar.l(kVar);
                    } else if (sVar != j$.time.chrono.s.c || aVar != null) {
                        for (j$.time.temporal.a aVar2 : j$.time.temporal.a.values()) {
                            if (aVar2.isDateBased() && kVar.d(aVar2)) {
                                j$.time.g.g(j$.desugar.sun.nio.fs.i.b("Unable to apply override chronology '", String.valueOf(sVar), "' because the temporal object being formatted contains date fields but does not represent a whole date: ", String.valueOf(kVar)));
                                throw null;
                            }
                        }
                    }
                }
                kVar = new s(bVarL, kVar, sVar, zoneId);
            }
        }
        this.a = kVar;
        this.b = dateTimeFormatter;
    }

    public final Long a(j$.time.temporal.n nVar) {
        int i = this.c;
        j$.time.temporal.k kVar = this.a;
        if (i <= 0 || kVar.d(nVar)) {
            return Long.valueOf(kVar.C(nVar));
        }
        return null;
    }

    public final Object b(j$.desugar.sun.nio.fs.o oVar) {
        j$.time.temporal.k kVar = this.a;
        Object objW = kVar.w(oVar);
        if (objW != null || this.c != 0) {
            return objW;
        }
        j$.time.g.g(j$.desugar.sun.nio.fs.i.b("Unable to extract ", String.valueOf(oVar), " from temporal ", String.valueOf(kVar)));
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
