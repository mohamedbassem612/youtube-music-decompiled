package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahok {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final ahom f;
    public final Set g;

    public ahok(String str, Set set, Set set2, int i, int i2, ahom ahomVar, Set set3) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableSet(set);
        this.c = DesugarCollections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = ahomVar;
        this.g = DesugarCollections.unmodifiableSet(set3);
    }

    public static ahoj a(ahpd ahpdVar) {
        return new ahoj(ahpdVar, new ahpd[0]);
    }

    public final boolean b() {
        return this.e == 0;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + '}';
    }
}
