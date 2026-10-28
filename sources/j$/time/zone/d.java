package j$.time.zone;

import app.rive.semantics.SemanticState;
import j$.time.LocalTime;
import j$.time.ZoneOffset;
import j$.time.g;
import j$.time.j;
import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class d implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    public final j a;
    public final byte b;
    public final j$.time.c c;
    public final LocalTime d;
    public final boolean e;
    public final c f;
    public final ZoneOffset g;
    public final ZoneOffset h;
    public final ZoneOffset i;

    public d(j jVar, int i, j$.time.c cVar, LocalTime localTime, boolean z, c cVar2, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.a = jVar;
        this.b = (byte) i;
        this.c = cVar;
        this.d = localTime;
        this.e = z;
        this.f = cVar2;
        this.g = zoneOffset;
        this.h = zoneOffset2;
        this.i = zoneOffset3;
    }

    public static d a(ObjectInput objectInput) throws IOException {
        LocalTime localTimeOfSecondOfDay;
        int totalSeconds;
        ZoneOffset zoneOffsetL;
        d dVar;
        int i = objectInput.readInt();
        j jVarB = j.B(i >>> 28);
        int i2 = ((264241152 & i) >>> 22) - 32;
        int i3 = (3670016 & i) >>> 19;
        j$.time.c cVarR = i3 == 0 ? null : j$.time.c.r(i3);
        int i4 = (507904 & i) >>> 14;
        c cVar = c.values()[(i & 12288) >>> 12];
        int i5 = (i & 4080) >>> 4;
        int i6 = (i & 12) >>> 2;
        int i7 = i & 3;
        if (i4 == 31) {
            localTimeOfSecondOfDay = LocalTime.ofSecondOfDay(objectInput.readInt());
        } else {
            int i8 = i4 % 24;
            LocalTime localTime = LocalTime.e;
            j$.time.temporal.a.HOUR_OF_DAY.s(i8);
            localTimeOfSecondOfDay = LocalTime.h[i8];
        }
        ZoneOffset zoneOffsetL2 = ZoneOffset.L(i5 == 255 ? objectInput.readInt() : (i5 - 128) * 900);
        if (i6 == 3) {
            totalSeconds = objectInput.readInt();
        } else {
            totalSeconds = (i6 * 1800) + zoneOffsetL2.getTotalSeconds();
        }
        ZoneOffset zoneOffsetL3 = ZoneOffset.L(totalSeconds);
        if (i7 == 3) {
            zoneOffsetL = ZoneOffset.L(objectInput.readInt());
        } else {
            zoneOffsetL = ZoneOffset.L((i7 * 1800) + zoneOffsetL2.getTotalSeconds());
        }
        boolean z = i4 == 24;
        Objects.a(jVarB, "month");
        Objects.a(localTimeOfSecondOfDay, "time");
        Objects.a(cVar, "timeDefnition");
        if (i2 < -28 || i2 > 31 || i2 == 0) {
            dVar = null;
            g.a("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        } else {
            if (z && !localTimeOfSecondOfDay.equals(LocalTime.g)) {
                g.a("Time must be midnight when end of day flag is true");
                return null;
            }
            if (localTimeOfSecondOfDay.d != 0) {
                g.a("Time's nano-of-second must be zero");
                return null;
            }
            dVar = new d(jVarB, i2, cVarR, localTimeOfSecondOfDay, z, cVar, zoneOffsetL2, zoneOffsetL3, zoneOffsetL);
        }
        return dVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && this.f == dVar.f && this.d.equals(dVar.d) && this.e == dVar.e && this.g.equals(dVar.g) && this.h.equals(dVar.h) && this.i.equals(dVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int secondOfDay = ((this.d.toSecondOfDay() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        j$.time.c cVar = this.c;
        return (((this.f.ordinal() + (secondOfDay + ((cVar == null ? 7 : cVar.ordinal()) << 2))) ^ this.g.b) ^ this.h.b) ^ this.i.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.i;
        int i = zoneOffset.b;
        ZoneOffset zoneOffset2 = this.h;
        sb.append(i - zoneOffset2.b > 0 ? "Gap " : "Overlap ");
        sb.append(zoneOffset2);
        sb.append(" to ");
        sb.append(zoneOffset);
        sb.append(", ");
        j jVar = this.a;
        byte b = this.b;
        j$.time.c cVar = this.c;
        if (cVar == null) {
            sb.append(jVar.name());
            sb.append(' ');
            sb.append((int) b);
        } else if (b == -1) {
            sb.append(cVar.name());
            sb.append(" on or before last day of ");
            sb.append(jVar.name());
        } else if (b < 0) {
            sb.append(cVar.name());
            sb.append(" on or before last day minus ");
            sb.append((-b) - 1);
            sb.append(" of ");
            sb.append(jVar.name());
        } else {
            sb.append(cVar.name());
            sb.append(" on or after ");
            sb.append(jVar.name());
            sb.append(' ');
            sb.append((int) b);
        }
        sb.append(" at ");
        sb.append(this.e ? "24:00" : this.d.toString());
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }

    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b;
        LocalTime localTime = this.d;
        boolean z = this.e;
        int secondOfDay = z ? 86400 : localTime.toSecondOfDay();
        int totalSeconds = this.g.getTotalSeconds();
        ZoneOffset zoneOffset = this.h;
        int totalSeconds2 = zoneOffset.getTotalSeconds() - totalSeconds;
        ZoneOffset zoneOffset2 = this.i;
        int totalSeconds3 = zoneOffset2.getTotalSeconds() - totalSeconds;
        if (secondOfDay % 3600 == 0) {
            b = z ? (byte) 24 : localTime.a;
        } else {
            b = 31;
        }
        int i = totalSeconds % 900 == 0 ? (totalSeconds / 900) + SemanticState.Focused : 255;
        int i2 = (totalSeconds2 == 0 || totalSeconds2 == 1800 || totalSeconds2 == 3600) ? totalSeconds2 / 1800 : 3;
        int i3 = (totalSeconds3 == 0 || totalSeconds3 == 1800 || totalSeconds3 == 3600) ? totalSeconds3 / 1800 : 3;
        j$.time.c cVar = this.c;
        objectOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + ((cVar == null ? 0 : cVar.getValue()) << 19) + (b << 14) + (this.f.ordinal() << 12) + (i << 4) + (i2 << 2) + i3);
        if (b == 31) {
            objectOutput.writeInt(secondOfDay);
        }
        if (i == 255) {
            objectOutput.writeInt(totalSeconds);
        }
        if (i2 == 3) {
            objectOutput.writeInt(zoneOffset.getTotalSeconds());
        }
        if (i3 == 3) {
            objectOutput.writeInt(zoneOffset2.getTotalSeconds());
        }
    }
}
