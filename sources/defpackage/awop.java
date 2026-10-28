package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awop implements Serializable, awou {
    private final awou a;
    private final awos b;

    public awop(awou awouVar, awos awosVar) {
        awouVar.getClass();
        this.a = awouVar;
        this.b = awosVar;
    }

    private final int a() {
        int i = 2;
        while (true) {
            awou awouVar = this.a;
            this = awouVar instanceof awop ? (awop) awouVar : null;
            if (this == null) {
                return i;
            }
            i++;
        }
    }

    private final boolean b(awos awosVar) {
        return awrc.c(get(awosVar.getKey()), awosVar);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int iA = a();
        awou[] awouVarArr = new awou[iA];
        awrk awrkVar = new awrk();
        fold(awmy.a, new vcj(awouVarArr, awrkVar, 3));
        if (awrkVar.a == iA) {
            return new awoo(awouVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof awop) {
            awop awopVar = (awop) obj;
            if (awopVar.a() == a()) {
                while (awopVar.b(this.b)) {
                    awou awouVar = this.a;
                    if (!(awouVar instanceof awop)) {
                        if (!awopVar.b((awos) awouVar)) {
                            break;
                        }
                        return true;
                    }
                    this = (awop) awouVar;
                }
            }
        }
        return false;
    }

    @Override // defpackage.awou
    public final Object fold(Object obj, awqk awqkVar) {
        return awqkVar.invoke(this.a.fold(obj, awqkVar), this.b);
    }

    @Override // defpackage.awou
    public final awos get(awot awotVar) {
        awotVar.getClass();
        while (true) {
            awos awosVar = this.b.get(awotVar);
            if (awosVar != null) {
                return awosVar;
            }
            awou awouVar = this.a;
            if (!(awouVar instanceof awop)) {
                return awouVar.get(awotVar);
            }
            this = (awop) awouVar;
        }
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    @Override // defpackage.awou
    public final awou minusKey(awot awotVar) {
        awotVar.getClass();
        awos awosVar = this.b;
        awos awosVar2 = awosVar.get(awotVar);
        awou awouVar = this.a;
        if (awosVar2 != null) {
            return awouVar;
        }
        awou awouVarMinusKey = awouVar.minusKey(awotVar);
        if (awouVarMinusKey != awouVar) {
            return awouVarMinusKey == awov.a ? awosVar : new awop(awouVarMinusKey, awosVar);
        }
        return this;
    }

    @Override // defpackage.awou
    public final /* bridge */ awou plus(awou awouVar) {
        return atqq.e(this, awouVar);
    }

    public final String toString() {
        return "[" + fold("", new akm(13)) + ']';
    }
}
