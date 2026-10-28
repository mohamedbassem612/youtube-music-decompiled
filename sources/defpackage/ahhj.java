package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahhj {
    public static final ahhj a = (ahhj) ahid.a(new ahkl(1));
    public final AtomicReference b = new AtomicReference(new ahia(new acqf()));

    public final ahfv a(ahgb ahgbVar, ahgj ahgjVar) {
        return ((ahia) this.b.get()).a(ahgbVar, ahgjVar);
    }

    public final ahgb b(ahfv ahfvVar, ahgj ahgjVar) {
        return ((ahia) this.b.get()).c(ahfvVar, ahgjVar);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public final synchronized void c(ahha ahhaVar) {
        AtomicReference atomicReference = this.b;
        acqf acqfVar = new acqf((ahia) atomicReference.get());
        ?? r2 = acqfVar.c;
        Object obj = ahhaVar.a;
        if (r2.containsKey(obj)) {
            ahha ahhaVar2 = (ahha) r2.get(obj);
            if (!ahhaVar2.equals(ahhaVar) || !ahhaVar.equals(ahhaVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(obj.toString()));
            }
        } else {
            r2.put(obj, ahhaVar);
        }
        atomicReference.set(new ahia(acqfVar));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public final synchronized void d(ahha ahhaVar) {
        AtomicReference atomicReference = this.b;
        acqf acqfVar = new acqf((ahia) atomicReference.get());
        ?? r2 = acqfVar.d;
        Object obj = ahhaVar.a;
        if (r2.containsKey(obj)) {
            ahha ahhaVar2 = (ahha) r2.get(obj);
            if (!ahhaVar2.equals(ahhaVar) || !ahhaVar.equals(ahhaVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat((String) obj));
            }
        } else {
            r2.put(obj, ahhaVar);
        }
        atomicReference.set(new ahia(acqfVar));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public final synchronized void e(ahub ahubVar) {
        AtomicReference atomicReference = this.b;
        acqf acqfVar = new acqf((ahia) atomicReference.get());
        ?? r2 = acqfVar.a;
        Object obj = ahubVar.a;
        if (r2.containsKey(obj)) {
            ahub ahubVar2 = (ahub) r2.get(obj);
            if (!ahubVar2.equals(ahubVar) || !ahubVar.equals(ahubVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(obj.toString()));
            }
        } else {
            r2.put(obj, ahubVar);
        }
        atomicReference.set(new ahia(acqfVar));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public final synchronized void f(ahub ahubVar) {
        AtomicReference atomicReference = this.b;
        acqf acqfVar = new acqf((ahia) atomicReference.get());
        ?? r2 = acqfVar.b;
        Object obj = ahubVar.a;
        if (r2.containsKey(obj)) {
            ahub ahubVar2 = (ahub) r2.get(obj);
            if (!ahubVar2.equals(ahubVar) || !ahubVar.equals(ahubVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat((String) obj));
            }
        } else {
            r2.put(obj, ahubVar);
        }
        atomicReference.set(new ahia(acqfVar));
    }
}
