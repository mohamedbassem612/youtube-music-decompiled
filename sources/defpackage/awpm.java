package defpackage;

import j$.util.List;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awpm extends awne implements RandomAccess, Serializable, List, awpl {
    private final Enum[] a;

    public awpm(Enum[] enumArr) {
        this.a = enumArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new awpn(this.a);
    }

    @Override // defpackage.awna
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.awna, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        r3.getClass();
        return atqq.aP(this.a, r3.ordinal()) == r3;
    }

    @Override // defpackage.awne, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        Enum[] enumArr = this.a;
        atqp.e(i, enumArr.length);
        return enumArr[i];
    }

    @Override // defpackage.awne, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        r3.getClass();
        Enum[] enumArr = this.a;
        int iOrdinal = r3.ordinal();
        if (atqq.aP(enumArr, iOrdinal) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.awne, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r2 = (Enum) obj;
        r2.getClass();
        return indexOf(r2);
    }
}
