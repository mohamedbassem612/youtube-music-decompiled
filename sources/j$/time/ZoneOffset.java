package j$.time;

import j$.time.temporal.Temporal;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class ZoneOffset extends ZoneId implements j$.time.temporal.k, j$.time.temporal.l, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;
    public final int b;
    public final transient String c;
    public static final ConcurrentHashMap d = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ConcurrentHashMap e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = L(0);
    public static final ZoneOffset f = L(-64800);
    public static final ZoneOffset g = L(64800);

    public ZoneOffset(int i) {
        String string;
        this.b = i;
        if (i == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i);
            int i2 = iAbs / 3600;
            int i3 = (iAbs / 60) % 60;
            StringBuilder sb = new StringBuilder(i < 0 ? "-" : "+");
            sb.append(i2 < 10 ? "0" : "");
            sb.append(i2);
            sb.append(i3 < 10 ? ":0" : ":");
            sb.append(i3);
            int i4 = iAbs % 60;
            if (i4 != 0) {
                sb.append(i4 < 10 ? ":0" : ":");
                sb.append(i4);
            }
            string = sb.toString();
        }
        this.c = string;
    }

    public static ZoneOffset I(Temporal temporal) {
        Objects.a(temporal, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) temporal.w(j$.time.temporal.o.d);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        g.g(j$.desugar.sun.nio.fs.i.b("Unable to obtain ZoneOffset from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    /* JADX WARN: Multi-variable type inference failed */
    public static ZoneOffset J(String str) {
        int iM;
        int iM2;
        int iM3;
        char cCharAt;
        Objects.a(str, "offsetId");
        ZoneOffset zoneOffset = (ZoneOffset) e.get(str);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        int length = str.length();
        if (length != 2) {
            if (length != 3) {
                if (length != 5) {
                    if (length == 6) {
                        iM = M(str, 1, false);
                        iM2 = M(str, 4, true);
                    } else if (length == 7) {
                        iM = M(str, 1, false);
                        iM2 = M(str, 3, false);
                        iM3 = M(str, 5, false);
                    } else if (length == 9) {
                        iM = M(str, 1, false);
                        iM2 = M(str, 4, true);
                        iM3 = M(str, 7, true);
                    } else {
                        g.g("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                    }
                    return null;
                }
                iM = M(str, 1, false);
                iM2 = M(str, 3, false);
                iM3 = 0;
            }
            cCharAt = str.charAt(0);
            if (cCharAt != '+' || cCharAt == '-') {
                return cCharAt == '-' ? K(-iM, -iM2, -iM3) : K(iM, iM2, iM3);
            }
            g.g("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
            return null;
        }
        str = str.charAt(0) + "0" + str.charAt(1);
        iM = M(str, 1, false);
        iM2 = 0;
        iM3 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt != '+') {
        }
        if (cCharAt == '-') {
        }
    }

    public static ZoneOffset K(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            g.c("Zone offset hours not in valid range: value ", i, " is not in the range -18 to 18");
            return null;
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                g.g("Zone offset minutes and seconds must be positive because hours is positive");
                return null;
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                g.g("Zone offset minutes and seconds must be negative because hours is negative");
                return null;
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            g.g("Zone offset minutes and seconds must have the same sign");
            return null;
        }
        if (i2 < -59 || i2 > 59) {
            g.c("Zone offset minutes not in valid range: value ", i2, " is not in the range -59 to 59");
            return null;
        }
        if (i3 < -59 || i3 > 59) {
            g.c("Zone offset seconds not in valid range: value ", i3, " is not in the range -59 to 59");
            return null;
        }
        if (Math.abs(i) != 18 || (i2 | i3) == 0) {
            return L((i2 * 60) + (i * 3600) + i3);
        }
        g.g("Zone offset not in valid range: -18:00 to +18:00");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ZoneOffset L(int i) {
        if (i < -64800 || i > 64800) {
            g.g("Zone offset not in valid range: -18:00 to +18:00");
            return null;
        }
        if (i % 900 != 0) {
            return new ZoneOffset(i);
        }
        Integer numValueOf = Integer.valueOf(i);
        ConcurrentHashMap concurrentHashMap = d;
        ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(numValueOf);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        concurrentHashMap.putIfAbsent(numValueOf, new ZoneOffset(i));
        ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(numValueOf);
        e.putIfAbsent(zoneOffset2.c, zoneOffset2);
        return zoneOffset2;
    }

    public static int M(CharSequence charSequence, int i, boolean z) {
        if (z && charSequence.charAt(i - 1) != ':') {
            g.g("Invalid ID for ZoneOffset, colon not found when expected: ".concat(String.valueOf(charSequence)));
            return 0;
        }
        char cCharAt = charSequence.charAt(i);
        char cCharAt2 = charSequence.charAt(i + 1);
        if (cCharAt < '0' || cCharAt > '9' || cCharAt2 < '0' || cCharAt2 > '9') {
            g.g("Invalid ID for ZoneOffset, non numeric characters found: ".concat(String.valueOf(charSequence)));
            return 0;
        }
        return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
    }

    public static ZoneOffset N(DataInput dataInput) throws IOException {
        byte b = dataInput.readByte();
        return b == 127 ? L(dataInput.readInt()) : L(b * 900);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 8, this);
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.b;
        }
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        g.e("Unsupported field: ".concat(String.valueOf(nVar)));
        return 0L;
    }

    @Override // j$.time.ZoneId
    public final void H(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(8);
        O(objectOutput);
    }

    public final void O(DataOutput dataOutput) throws IOException {
        int i = this.b;
        int i2 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.b - this.b;
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            if (nVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return false;
            }
        } else if (nVar == null || !nVar.h(this)) {
            return false;
        }
        return true;
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOffset) {
            if (this.b == ((ZoneOffset) obj).b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.ZoneId
    public final String getId() {
        return this.c;
    }

    @Override // j$.time.ZoneId
    public final ZoneRules getRules() {
        return new ZoneRules(this);
    }

    public int getTotalSeconds() {
        return this.b;
    }

    @Override // j$.time.temporal.k
    public final int h(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.b;
        }
        if (!j$.desugar.sun.nio.fs.i.c(nVar)) {
            return j$.time.temporal.o.d(this, nVar).a(C(nVar), nVar);
        }
        g.e("Unsupported field: ".concat(String.valueOf(nVar)));
        return 0;
    }

    @Override // j$.time.ZoneId
    public final int hashCode() {
        return this.b;
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.d(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal p(Temporal temporal) {
        return temporal.a(this.b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.ZoneId
    public final String toString() {
        return this.c;
    }

    @Override // j$.time.temporal.k
    public final Object w(j$.desugar.sun.nio.fs.o oVar) {
        return (oVar == j$.time.temporal.o.d || oVar == j$.time.temporal.o.e) ? this : j$.time.temporal.o.c(this, oVar);
    }
}
