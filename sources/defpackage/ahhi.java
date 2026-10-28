package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahhi {
    public static final ahhi a = new ahhi();
    public final AtomicReference b = new AtomicReference(new ahtv(new ahtv(), (byte[]) null));

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    public final synchronized void a(ahho ahhoVar) {
        AtomicReference atomicReference = this.b;
        ahtv ahtvVar = new ahtv((ahtv) atomicReference.get());
        ?? r1 = ahtvVar.b;
        Class clsA = ahhoVar.a();
        if (r1.containsKey(clsA)) {
            ahho ahhoVar2 = (ahho) r1.get(clsA);
            if (!ahhoVar2.equals(ahhoVar) || !ahhoVar.equals(ahhoVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsA.toString()));
            }
        } else {
            r1.put(clsA, ahhoVar);
        }
        atomicReference.set(new ahtv(ahtvVar, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
    public final synchronized void b(awgg awggVar) {
        AtomicReference atomicReference = this.b;
        ahtv ahtvVar = new ahtv((ahtv) atomicReference.get());
        ahhn ahhnVar = new ahhn((Class) awggVar.b, (Class) awggVar.a);
        ?? r1 = ahtvVar.a;
        if (r1.containsKey(ahhnVar)) {
            awgg awggVar2 = (awgg) r1.get(ahhnVar);
            if (!awggVar2.equals(awggVar) || !awggVar.equals(awggVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(ahhnVar.toString()));
            }
        } else {
            r1.put(ahhnVar, awggVar);
        }
        atomicReference.set(new ahtv(ahtvVar, (byte[]) null));
    }
}
