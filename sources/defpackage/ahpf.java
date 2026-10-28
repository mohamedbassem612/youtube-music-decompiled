package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahpf implements ahol {
    private final Set a;
    private final Set b;
    private final Set c;
    private final ahol d;

    public ahpf(ahok ahokVar, ahol aholVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (ahos ahosVar : ahokVar.c) {
            if (ahosVar.a()) {
                if (ahosVar.b()) {
                    hashSet4.add(ahosVar.a);
                } else {
                    hashSet.add(ahosVar.a);
                }
            } else if (ahosVar.b()) {
                hashSet5.add(ahosVar.a);
            } else {
                hashSet2.add(ahosVar.a);
            }
        }
        if (!ahokVar.g.isEmpty()) {
            hashSet.add(new ahpd(ahpc.class, ahqx.class));
        }
        this.a = DesugarCollections.unmodifiableSet(hashSet);
        this.b = DesugarCollections.unmodifiableSet(hashSet2);
        DesugarCollections.unmodifiableSet(hashSet3);
        this.c = DesugarCollections.unmodifiableSet(hashSet4);
        DesugarCollections.unmodifiableSet(hashSet5);
        Set set = ahokVar.g;
        this.d = aholVar;
    }

    @Override // defpackage.ahol
    public final ahrs a(ahpd ahpdVar) {
        if (this.b.contains(ahpdVar)) {
            return this.d.a(ahpdVar);
        }
        throw new ahou(String.format("Attempting to request an undeclared dependency Provider<%s>.", ahpdVar));
    }

    @Override // defpackage.ahol
    public final ahrs b(Class cls) {
        return a(new ahpd(ahpc.class, cls));
    }

    @Override // defpackage.ahol
    public final ahrs c(ahpd ahpdVar) {
        throw null;
    }

    @Override // defpackage.ahol
    public final Object d(ahpd ahpdVar) {
        if (this.a.contains(ahpdVar)) {
            return ahno.b(this.d, ahpdVar);
        }
        throw new ahou(String.format("Attempting to request an undeclared dependency %s.", ahpdVar));
    }

    @Override // defpackage.ahol
    public final Object e(Class cls) {
        if (!this.a.contains(new ahpd(ahpc.class, cls))) {
            throw new ahou(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object objB = ahno.b(this.d, new ahpd(ahpc.class, cls));
        if (!cls.equals(ahqx.class)) {
            return objB;
        }
        return new ahpe();
    }

    @Override // defpackage.ahol
    public final Set f(ahpd ahpdVar) {
        if (this.c.contains(ahpdVar)) {
            return (Set) this.d.c(ahpdVar).a();
        }
        throw new ahou(String.format("Attempting to request an undeclared dependency Set<%s>.", ahpdVar));
    }
}
