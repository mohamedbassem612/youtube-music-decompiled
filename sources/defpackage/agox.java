package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agox {
    public final Object a;
    int b;
    final /* synthetic */ agpc c;

    public agox(agpc agpcVar, int i) {
        this.c = agpcVar;
        this.a = agpcVar.a[i];
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final int a() {
        int i = this.b;
        if (i != -1) {
            agpc agpcVar = this.c;
            if (i >= agpcVar.c || !Objects.equals(this.a, agpcVar.a[i])) {
                this.b = this.c.d(this.a);
            }
        } else {
            this.b = this.c.d(this.a);
        }
        int i2 = this.b;
        if (i2 == -1) {
            return 0;
        }
        return this.c.b[i2];
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof agox)) {
            return false;
        }
        agox agoxVar = (agox) obj;
        return a() == agoxVar.a() && Objects.equals(this.a, agoxVar.a);
    }

    public final int hashCode() {
        Object obj = this.a;
        return (obj == null ? 0 : obj.hashCode()) ^ a();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        int iA = a();
        if (iA == 1) {
            return strValueOf;
        }
        return strValueOf + " x " + iA;
    }

    public agox() {
        throw null;
    }
}
