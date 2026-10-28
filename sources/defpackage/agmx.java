package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agmx extends agml implements Map {
    private static final long serialVersionUID = 3;

    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        ConcurrentMap agnwVar;
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        agmj agmjVar = new agmj();
        int iMin = Math.min(i, SemanticState.Hidden);
        int i2 = agmjVar.b;
        ahno.Q(i2 == -1, "initial capacity was already set to %s", i2);
        ahno.F((iMin ^ (-1)) >>> 31);
        agmjVar.b = iMin;
        agmjVar.f(this.a);
        agmy agmyVar = agmjVar.e;
        ahno.R(agmyVar == null, "Value strength was already set to %s", agmyVar);
        agmy agmyVar2 = this.b;
        agmjVar.e = agmyVar2;
        agmy agmyVar3 = agmy.a;
        if (agmyVar2 != agmyVar3) {
            agmjVar.a = true;
        }
        agmjVar.e(this.c);
        int iMin2 = Math.min(this.d, SemanticState.ReadOnly);
        int i3 = agmjVar.c;
        ahno.Q(i3 == -1, "concurrency level was already set to %s", i3);
        ahno.F(iMin2 > 0);
        agmjVar.c = iMin2;
        if (agmjVar.a) {
            int i4 = agnw.h;
            if (agmjVar.c() == agmyVar3 && agmjVar.d() == agmyVar3) {
                agnwVar = new agnw(agmjVar, agnb.a);
            } else if (agmjVar.c() == agmyVar3 && agmjVar.d() == agmy.b) {
                agnwVar = new agnw(agmjVar, agnb.c);
            } else {
                agmy agmyVarC = agmjVar.c();
                agmy agmyVar4 = agmy.b;
                if (agmyVarC == agmyVar4 && agmjVar.d() == agmyVar3) {
                    agnwVar = new agnw(agmjVar, agnb.e);
                } else {
                    if (agmjVar.c() != agmyVar4 || agmjVar.d() != agmyVar4) {
                        throw new AssertionError();
                    }
                    agnwVar = new agnw(agmjVar, agnb.f);
                }
            }
        } else {
            agnwVar = new ConcurrentHashMap(agmjVar.b(), 0.75f, agmjVar.a());
        }
        this.e = agnwVar;
        while (true) {
            Object object = objectInputStream.readObject();
            if (object == null) {
                return;
            } else {
                this.e.put(object, objectInputStream.readObject());
            }
        }
    }

    private Object readResolve() {
        return this.e;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.e.size());
        for (java.util.Map.Entry entry : this.e.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
        objectOutputStream.writeObject(null);
    }
}
