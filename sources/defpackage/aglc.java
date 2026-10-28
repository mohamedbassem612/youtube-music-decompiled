package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aglc extends agkp implements agpv {
    private static final long serialVersionUID = 0;
    private transient aglc a;
    private final transient agkz emptySet;

    public aglc(agkj agkjVar, int i, Comparator comparator) {
        super(agkjVar, i);
        this.emptySet = comparator == null ? agpr.a : aglk.E(comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(a.bR(i, "Invalid key count "));
        }
        agkh agkhVar = new agkh(4);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object object = objectInputStream.readObject();
            object.getClass();
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                throw new InvalidObjectException(a.bR(i4, "Invalid value count "));
            }
            agkx agkxVar = comparator == null ? new agkx() : new agli(comparator);
            for (int i5 = 0; i5 < i4; i5++) {
                Object object2 = objectInputStream.readObject();
                object2.getClass();
                agkxVar.c(object2);
            }
            agkz agkzVarG = agkxVar.g();
            if (agkzVarG.size() != i4) {
                throw new InvalidObjectException("Duplicate key-value pairs exist for key ".concat(object.toString()));
            }
            agkhVar.e(object, agkzVarG);
            i2 += i4;
        }
        try {
            this.a = new aglc(agkhVar.d(true), i2, comparator);
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private Object readResolve() {
        aglc aglcVar = this.a;
        aglcVar.getClass();
        return aglcVar;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        agkz agkzVar = this.emptySet;
        objectOutputStream.writeObject(agkzVar instanceof aglk ? ((aglk) agkzVar).a : null);
        agvp.i(this, objectOutputStream);
    }

    @Override // defpackage.agpv
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final agkz c(Object obj) {
        return (agkz) ahno.ad((agkz) this.map.get(obj), this.emptySet);
    }

    @Override // defpackage.agkp
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ agjw j() {
        return new aglb(this);
    }

    @Override // defpackage.agkp, defpackage.agom
    public final /* synthetic */ Collection j() {
        return new aglb(this);
    }
}
