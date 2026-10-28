package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agkw extends aghj implements Serializable {
    public static final agkw a = new agkw(agpi.a);
    public static final agkw b = new agkw(agke.q(agpf.a));
    private final transient agke c;

    public agkw(agke agkeVar) {
        this.c = agkeVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.agpg
    public final /* bridge */ /* synthetic */ Set a() {
        agke agkeVar = this.c;
        if (agkeVar.isEmpty()) {
            return agpr.a;
        }
        agpf agpfVar = agpf.a;
        return new agps(agkeVar, agpe.a);
    }

    Object writeReplace() {
        return new agkv(this.c);
    }
}
