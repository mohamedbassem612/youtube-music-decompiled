package j$.time;

import j$.util.Objects;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class q implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    public byte a;
    public Object b;

    public q(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    public static Serializable a(byte b, ObjectInput objectInput) throws IOException {
        Serializable oVar;
        switch (b) {
            case 1:
                Duration duration = Duration.ZERO;
                return Duration.ofSeconds(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.EPOCH;
                return Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.d;
                return LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return LocalTime.N(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.c;
                LocalDate localDate2 = LocalDate.d;
                return LocalDateTime.B(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.N(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.c;
                LocalDate localDate3 = LocalDate.d;
                LocalDateTime localDateTimeB = LocalDateTime.B(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.N(objectInput));
                ZoneOffset zoneOffsetN = ZoneOffset.N(objectInput);
                ZoneId zoneId = (ZoneId) a(objectInput.readByte(), objectInput);
                Objects.a(zoneId, "zone");
                if (!(zoneId instanceof ZoneOffset) || zoneOffsetN.equals(zoneId)) {
                    return new ZonedDateTime(localDateTimeB, zoneId, zoneOffsetN);
                }
                g.a("ZoneId must match ZoneOffset");
                return null;
            case 7:
                int i = v.d;
                return ZoneId.s(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.N(objectInput);
            case 9:
                int i2 = o.c;
                oVar = new o(LocalTime.N(objectInput), ZoneOffset.N(objectInput));
                break;
            case 10:
                int i3 = OffsetDateTime.c;
                LocalDate localDate4 = LocalDate.d;
                oVar = new OffsetDateTime(LocalDateTime.B(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.N(objectInput)), ZoneOffset.N(objectInput));
                break;
            case 11:
                int i4 = s.b;
                return s.r(objectInput.readInt());
            case 12:
                int i5 = u.c;
                int i6 = objectInput.readInt();
                byte b2 = objectInput.readByte();
                j$.time.temporal.a.YEAR.s(i6);
                j$.time.temporal.a.MONTH_OF_YEAR.s(b2);
                oVar = new u(i6, b2);
                break;
            case 13:
                int i7 = l.c;
                byte b3 = objectInput.readByte();
                byte b4 = objectInput.readByte();
                j jVarB = j.B(b3);
                Objects.a(jVarB, "month");
                j$.time.temporal.a.DAY_OF_MONTH.s(b4);
                if (b4 > jVarB.A()) {
                    throw new b("Illegal value for DayOfMonth field, value " + ((int) b4) + " is not valid for month " + jVarB.name());
                }
                oVar = new l(jVarB.getValue(), b4);
                break;
                break;
            case 14:
                p pVar = p.d;
                return p.a(objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        return oVar;
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b = objectInput.readByte();
        this.a = b;
        this.b = a(b, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.a);
                objectOutput.writeInt(duration.b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.a);
                objectOutput.writeInt(instant.b);
                return;
            case 3:
                LocalDate localDate = (LocalDate) obj;
                objectOutput.writeInt(localDate.a);
                objectOutput.writeByte(localDate.b);
                objectOutput.writeByte(localDate.c);
                return;
            case 4:
                ((LocalTime) obj).R(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                LocalDate localDate2 = localDateTime.a;
                objectOutput.writeInt(localDate2.a);
                objectOutput.writeByte(localDate2.b);
                objectOutput.writeByte(localDate2.c);
                localDateTime.b.R(objectOutput);
                return;
            case 6:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                LocalDateTime localDateTime2 = zonedDateTime.a;
                LocalDate localDate3 = localDateTime2.a;
                objectOutput.writeInt(localDate3.a);
                objectOutput.writeByte(localDate3.b);
                objectOutput.writeByte(localDate3.c);
                localDateTime2.b.R(objectOutput);
                zonedDateTime.b.O(objectOutput);
                zonedDateTime.c.H(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((v) obj).b);
                return;
            case 8:
                ((ZoneOffset) obj).O(objectOutput);
                return;
            case 9:
                o oVar = (o) obj;
                oVar.a.R(objectOutput);
                oVar.b.O(objectOutput);
                return;
            case 10:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                LocalDateTime localDateTime3 = offsetDateTime.a;
                LocalDate localDate4 = localDateTime3.a;
                objectOutput.writeInt(localDate4.a);
                objectOutput.writeByte(localDate4.b);
                objectOutput.writeByte(localDate4.c);
                localDateTime3.b.R(objectOutput);
                offsetDateTime.b.O(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((s) obj).a);
                return;
            case 12:
                u uVar = (u) obj;
                objectOutput.writeInt(uVar.a);
                objectOutput.writeByte(uVar.b);
                return;
            case 13:
                l lVar = (l) obj;
                objectOutput.writeByte(lVar.a);
                objectOutput.writeByte(lVar.b);
                return;
            case 14:
                p pVar = (p) obj;
                objectOutput.writeInt(pVar.a);
                objectOutput.writeInt(pVar.b);
                objectOutput.writeInt(pVar.c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    public q() {
    }
}
