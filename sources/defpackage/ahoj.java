package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahoj {
    public String a = null;
    public ahom b;
    private final Set c;
    private final Set d;
    private int e;
    private int f;
    private final Set g;

    @SafeVarargs
    public ahoj(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.c = hashSet;
        this.d = new HashSet();
        this.e = 0;
        this.f = 0;
        this.g = new HashSet();
        hashSet.add(new ahpd(ahpc.class, cls));
        for (Class cls2 : clsArr) {
            if (cls2 == null) {
                throw new NullPointerException("Null interface");
            }
            this.c.add(new ahpd(ahpc.class, cls2));
        }
    }

    public final ahok a() {
        if (this.b != null) {
            return new ahok(this.a, new HashSet(this.c), new HashSet(this.d), this.e, this.f, this.b, this.g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public final void b(ahos ahosVar) {
        if (this.c.contains(ahosVar.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.d.add(ahosVar);
    }

    public final void c() {
        this.f = 1;
    }

    public final void d(int i) {
        if (this.e != 0) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.e = i;
    }

    @SafeVarargs
    public ahoj(ahpd ahpdVar, ahpd... ahpdVarArr) {
        HashSet hashSet = new HashSet();
        this.c = hashSet;
        this.d = new HashSet();
        this.e = 0;
        this.f = 0;
        this.g = new HashSet();
        hashSet.add(ahpdVar);
        for (ahpd ahpdVar2 : ahpdVarArr) {
            if (ahpdVar2 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(this.c, ahpdVarArr);
    }
}
