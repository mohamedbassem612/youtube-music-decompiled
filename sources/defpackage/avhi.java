package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avhi {
    static final auyp a = new auyp("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", null);
    final Long b;
    final Boolean c;
    final Integer d;
    final Integer e;
    final avji f;
    final avfq g;

    /* JADX WARN: Type inference failed for: r3v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean, int] */
    public avhi(Map map, boolean z, int i, int i2) {
        long j;
        boolean z2;
        avji avjiVar;
        avfq avfqVar;
        this.b = avjt.j(map, "timeout");
        this.c = avjt.g(map, "waitForReady");
        Integer numI = avjt.i(map, "maxResponseMessageBytes");
        this.d = numI;
        if (numI != null) {
            ahno.K((numI.intValue() ^ (-1)) >>> 31, "maxInboundMessageSize %s exceeds bounds", numI);
        }
        Integer numI2 = avjt.i(map, "maxRequestMessageBytes");
        this.e = numI2;
        if (numI2 != null) {
            ahno.K((numI2.intValue() ^ (-1)) >>> 31, "maxOutboundMessageSize %s exceeds bounds", numI2);
        }
        Map mapO = z ? avjt.o(map, "retryPolicy") : null;
        if (mapO == null) {
            j = 0;
            avjiVar = null;
            z2 = true;
        } else {
            Integer numI3 = avjt.i(mapO, "maxAttempts");
            numI3.getClass();
            int iIntValue = numI3.intValue();
            ahno.I(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, i);
            Long lJ = avjt.j(mapO, "initialBackoff");
            lJ.getClass();
            long jLongValue = lJ.longValue();
            ahno.J(jLongValue > 0, "initialBackoffNanos must be greater than 0: %s", jLongValue);
            Long lJ2 = avjt.j(mapO, "maxBackoff");
            lJ2.getClass();
            j = 0;
            long jLongValue2 = lJ2.longValue();
            ahno.J(jLongValue2 > 0, "maxBackoff must be greater than 0: %s", jLongValue2);
            Double dH = avjt.h(mapO, "backoffMultiplier");
            dH.getClass();
            double dDoubleValue = dH.doubleValue();
            ahno.K(dDoubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", dH);
            Long lJ3 = avjt.j(mapO, "perAttemptRecvTimeout");
            ahno.K(lJ3 == null || lJ3.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", lJ3);
            Set setD = avjt.d(mapO, "retryableStatusCodes");
            z2 = true;
            aguu.ai(setD != null, "%s is required in retry policy", "retryableStatusCodes");
            aguu.ai(!setD.contains(Status.Code.OK), "%s must not contain OK", "retryableStatusCodes");
            ahno.G((lJ3 == null && setD.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            avjiVar = new avji(iMin, jLongValue, jLongValue2, dDoubleValue, lJ3, setD);
        }
        this.f = avjiVar;
        Map mapO2 = z ? avjt.o(map, "hedgingPolicy") : null;
        if (mapO2 == null) {
            avfqVar = null;
        } else {
            Integer numI4 = avjt.i(mapO2, "maxAttempts");
            numI4.getClass();
            int iIntValue2 = numI4.intValue();
            ahno.I(iIntValue2 >= 2 ? z2 : false, "maxAttempts must be greater than 1: %s", iIntValue2);
            int iMin2 = Math.min(iIntValue2, i2);
            Long lJ4 = avjt.j(mapO2, "hedgingDelay");
            lJ4.getClass();
            long jLongValue3 = lJ4.longValue();
            ahno.J(((jLongValue3 > j ? 1 : (jLongValue3 == j ? 0 : -1)) ^ (-1)) >>> 31, "hedgingDelay must not be negative: %s", jLongValue3);
            Set setD2 = avjt.d(mapO2, "nonFatalStatusCodes");
            if (setD2 == null) {
                setD2 = DesugarCollections.unmodifiableSet(EnumSet.noneOf(Status.Code.class));
            } else {
                aguu.ai(!setD2.contains(Status.Code.OK), "%s must not contain OK", "nonFatalStatusCodes");
            }
            avfqVar = new avfq(iMin2, jLongValue3, setD2);
        }
        this.g = avfqVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof avhi)) {
            return false;
        }
        avhi avhiVar = (avhi) obj;
        return Objects.equals(this.b, avhiVar.b) && Objects.equals(this.c, avhiVar.c) && Objects.equals(this.d, avhiVar.d) && Objects.equals(this.e, avhiVar.e) && Objects.equals(this.f, avhiVar.f) && Objects.equals(this.g, avhiVar.g);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("timeoutNanos", this.b);
        ageuVarAc.b("waitForReady", this.c);
        ageuVarAc.b("maxInboundMessageSize", this.d);
        ageuVarAc.b("maxOutboundMessageSize", this.e);
        ageuVarAc.b("retryPolicy", this.f);
        ageuVarAc.b("hedgingPolicy", this.g);
        return ageuVarAc.toString();
    }
}
