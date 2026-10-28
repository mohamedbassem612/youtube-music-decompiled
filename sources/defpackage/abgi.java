package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abgi {
    public final abgh a;
    public final boolean b;

    public abgi(abgh abghVar, boolean z) {
        if (abghVar != abgh.b && abghVar != abgh.c && z) {
            throw new IllegalArgumentException("controls can be in the buffering state only if in PLAYING or PAUSED video state");
        }
        this.a = abghVar;
        this.b = z;
    }

    public final boolean a() {
        abgh abghVar = this.a;
        return abghVar == abgh.d || abghVar == abgh.e;
    }

    public final boolean b() {
        abgh abghVar = this.a;
        return abghVar == abgh.b || abghVar == abgh.c || abghVar == abgh.f;
    }

    public final boolean c() {
        return b() && !this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof abgi) {
            abgi abgiVar = (abgi) obj;
            if (this.a == abgiVar.a && this.b == abgiVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.b));
    }

    public final String toString() {
        ageu ageuVarAb = ahno.ab(abgi.class);
        ageuVarAb.b("videoState", this.a);
        ageuVarAb.g("isBuffering", this.b);
        return ageuVarAb.toString();
    }
}
