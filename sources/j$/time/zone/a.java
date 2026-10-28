package j$.time.zone;

import j$.time.ZoneOffset;
import j$.time.g;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;
    public byte a;
    public Serializable b;

    public a(byte b, Serializable serializable) {
        this.a = b;
        this.b = serializable;
    }

    public static long a(ObjectInput objectInput) {
        int i = objectInput.readByte() & 255;
        if (i == 255) {
            return objectInput.readLong();
        }
        return (((long) (((i << 16) + ((objectInput.readByte() & 255) << 8)) + (objectInput.readByte() & 255))) * 900) - 4575744000L;
    }

    public static ZoneOffset b(ObjectInput objectInput) throws IOException {
        byte b = objectInput.readByte();
        return b == 127 ? ZoneOffset.L(objectInput.readInt()) : ZoneOffset.L(b * 900);
    }

    public static void c(long j, ObjectOutput objectOutput) throws IOException {
        if (j < -4575744000L || j >= 10413792000L || j % 900 != 0) {
            objectOutput.writeByte(255);
            objectOutput.writeLong(j);
        } else {
            int i = (int) ((j + 4575744000L) / 900);
            objectOutput.writeByte((i >>> 16) & 255);
            objectOutput.writeByte((i >>> 8) & 255);
            objectOutput.writeByte(i & 255);
        }
    }

    public static void d(ZoneOffset zoneOffset, ObjectOutput objectOutput) throws IOException {
        int totalSeconds = zoneOffset.getTotalSeconds();
        int i = totalSeconds % 900 == 0 ? totalSeconds / 900 : 127;
        objectOutput.writeByte(i);
        if (i == 127) {
            objectOutput.writeInt(totalSeconds);
        }
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Serializable zoneRules;
        Serializable serializableA;
        byte b = objectInput.readByte();
        this.a = b;
        if (b != 1) {
            if (b == 2) {
                long jA = a(objectInput);
                ZoneOffset zoneOffsetB = b(objectInput);
                ZoneOffset zoneOffsetB2 = b(objectInput);
                if (zoneOffsetB.equals(zoneOffsetB2)) {
                    g.a("Offsets must not be equal");
                    return;
                }
                zoneRules = new b(jA, zoneOffsetB, zoneOffsetB2);
            } else if (b == 3) {
                serializableA = d.a(objectInput);
            } else {
                if (b != 100) {
                    throw new StreamCorruptedException("Unknown serialized type");
                }
                serializableA = new ZoneRules(TimeZone.getTimeZone(objectInput.readUTF()));
            }
            this.b = serializableA;
        }
        int i = objectInput.readInt();
        long[] jArr = ZoneRules.i;
        long[] jArr2 = i == 0 ? jArr : new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr2[i2] = a(objectInput);
        }
        int i3 = i + 1;
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            zoneOffsetArr[i4] = b(objectInput);
        }
        int i5 = objectInput.readInt();
        if (i5 != 0) {
            jArr = new long[i5];
        }
        long[] jArr3 = jArr;
        for (int i6 = 0; i6 < i5; i6++) {
            jArr3[i6] = a(objectInput);
        }
        int i7 = i5 + 1;
        ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            zoneOffsetArr2[i8] = b(objectInput);
        }
        int i9 = objectInput.readByte();
        d[] dVarArr = i9 == 0 ? ZoneRules.j : new d[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            dVarArr[i10] = d.a(objectInput);
        }
        zoneRules = new ZoneRules(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, dVarArr);
        serializableA = zoneRules;
        this.b = serializableA;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Serializable serializable = this.b;
        objectOutput.writeByte(b);
        if (b != 1) {
            if (b == 2) {
                b bVar = (b) serializable;
                c(bVar.a, objectOutput);
                d(bVar.c, objectOutput);
                d(bVar.d, objectOutput);
                return;
            }
            if (b == 3) {
                ((d) serializable).writeExternal(objectOutput);
                return;
            } else {
                if (b != 100) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                objectOutput.writeUTF(((ZoneRules) serializable).g.getID());
                return;
            }
        }
        ZoneRules zoneRules = (ZoneRules) serializable;
        d[] dVarArr = zoneRules.f;
        long[] jArr = zoneRules.c;
        long[] jArr2 = zoneRules.a;
        objectOutput.writeInt(jArr2.length);
        for (long j : jArr2) {
            c(j, objectOutput);
        }
        for (ZoneOffset zoneOffset : zoneRules.b) {
            d(zoneOffset, objectOutput);
        }
        objectOutput.writeInt(jArr.length);
        for (long j2 : jArr) {
            c(j2, objectOutput);
        }
        for (ZoneOffset zoneOffset2 : zoneRules.e) {
            d(zoneOffset2, objectOutput);
        }
        objectOutput.writeByte(dVarArr.length);
        for (d dVar : dVarArr) {
            dVar.writeExternal(objectOutput);
        }
    }

    public a() {
    }
}
