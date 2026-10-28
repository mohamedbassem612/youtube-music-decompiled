package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class agkg extends agkp implements aglz {
    private static final long serialVersionUID = 0;
    private transient agkg a;

    public agkg(agkj agkjVar, int i) {
        super(agkjVar, i);
    }

    public static agkg b(agom agomVar) {
        if (agomVar.w()) {
            return agir.a;
        }
        aggh<Map.Entry> agghVar = new aggh((aggj) agomVar.n());
        if (agghVar.isEmpty()) {
            return agir.a;
        }
        agkh agkhVar = new agkh(agghVar.size());
        int size = 0;
        for (Map.Entry entry : agghVar) {
            Object key = entry.getKey();
            agke agkeVarN = agke.n((Collection) entry.getValue());
            if (!agkeVarN.isEmpty()) {
                agkhVar.e(key, agkeVarN);
                size += agkeVarN.size();
            }
        }
        return new agkg(agkhVar.d(true), size);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
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
            agjz agjzVar = new agjz(4);
            for (int i5 = 0; i5 < i4; i5++) {
                Object object2 = objectInputStream.readObject();
                object2.getClass();
                agjzVar.h(object2);
            }
            agkhVar.e(object, agjzVar.g());
            i2 += i4;
        }
        try {
            this.a = new agkg(agkhVar.d(true), i2);
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private Object readResolve() {
        agkg agkgVar = this.a;
        agkgVar.getClass();
        return agkgVar;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        agvp.i(this, objectOutputStream);
    }

    @Override // defpackage.agkp, defpackage.agom
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final agke c(Object obj) {
        agke agkeVar = (agke) this.map.get(obj);
        return agkeVar == null ? agpi.a : agkeVar;
    }

    @Override // defpackage.aglz
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ List c(Object obj) {
        throw null;
    }

    @Override // defpackage.aglz
    @Deprecated
    public final /* bridge */ /* synthetic */ List g(Object obj) {
        throw null;
    }
}
