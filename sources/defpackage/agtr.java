package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class agtr {
    private static final agtr a = new agtl();

    public static agtr g(agta agtaVar, agta agtaVar2) {
        int iB = agtaVar2.b();
        if (iB == 0) {
            return a;
        }
        return iB <= 28 ? new agtp(agtaVar, agtaVar2) : new agtq(agtaVar, agtaVar2);
    }

    public abstract int a();

    public abstract Object b(agrx agrxVar);

    public abstract Set c();

    public abstract void d(agth agthVar, Object obj);
}
