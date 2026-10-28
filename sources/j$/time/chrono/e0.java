package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class e0 implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;
    public byte a;
    public Object b;

    public e0(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objA;
        byte b = objectInput.readByte();
        this.a = b;
        switch (b) {
            case 1:
                ConcurrentHashMap concurrentHashMap = a.a;
                objA = a.A(objectInput.readUTF());
                break;
            case 2:
                objA = ((b) objectInput.readObject()).D((LocalTime) objectInput.readObject());
                break;
            case 3:
                objA = ((e) objectInput.readObject()).z((ZoneOffset) objectInput.readObject()).v((ZoneId) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = x.d;
                int i = objectInput.readInt();
                byte b2 = objectInput.readByte();
                byte b3 = objectInput.readByte();
                v.c.getClass();
                objA = new x(LocalDate.of(i, b2, b3));
                break;
            case 5:
                y yVar = y.d;
                objA = y.i(objectInput.readByte());
                break;
            case 6:
                o oVar = (o) objectInput.readObject();
                int i2 = objectInput.readInt();
                byte b4 = objectInput.readByte();
                byte b5 = objectInput.readByte();
                oVar.getClass();
                objA = new q(oVar, i2, b4, b5);
                break;
            case 7:
                int i3 = objectInput.readInt();
                byte b6 = objectInput.readByte();
                byte b7 = objectInput.readByte();
                a0.c.getClass();
                objA = new c0(LocalDate.of(i3 + 1911, b6, b7));
                break;
            case 8:
                int i4 = objectInput.readInt();
                byte b8 = objectInput.readByte();
                byte b9 = objectInput.readByte();
                g0.c.getClass();
                objA = new i0(LocalDate.of(i4 - 543, b8, b9));
                break;
            case 9:
                int i5 = h.e;
                objA = new h(a.A(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.b = objA;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                objectOutput.writeUTF(((a) obj).getId());
                return;
            case 2:
                g gVar = (g) obj;
                objectOutput.writeObject(gVar.a);
                objectOutput.writeObject(gVar.b);
                return;
            case 3:
                l lVar = (l) obj;
                objectOutput.writeObject(lVar.a);
                objectOutput.writeObject(lVar.b);
                objectOutput.writeObject(lVar.c);
                return;
            case 4:
                x xVar = (x) obj;
                xVar.getClass();
                objectOutput.writeInt(j$.time.temporal.o.a(xVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(xVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(xVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((y) obj).a);
                return;
            case 6:
                q qVar = (q) obj;
                objectOutput.writeObject(qVar.a);
                objectOutput.writeInt(j$.time.temporal.o.a(qVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(qVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(qVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 7:
                c0 c0Var = (c0) obj;
                c0Var.getClass();
                objectOutput.writeInt(j$.time.temporal.o.a(c0Var, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(c0Var, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(c0Var, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                i0 i0Var = (i0) obj;
                i0Var.getClass();
                objectOutput.writeInt(j$.time.temporal.o.a(i0Var, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(i0Var, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(i0Var, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                h hVar = (h) obj;
                objectOutput.writeUTF(hVar.a.getId());
                objectOutput.writeInt(hVar.b);
                objectOutput.writeInt(hVar.c);
                objectOutput.writeInt(hVar.d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    public e0() {
    }
}
