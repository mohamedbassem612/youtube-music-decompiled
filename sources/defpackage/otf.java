package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class otf {
    public ote a;
    public final orq b;
    public final mew c;
    public final mew d;

    public otf(mew mewVar, mew mewVar2, orq orqVar) {
        this.c = mewVar;
        this.d = mewVar2;
        this.b = orqVar;
    }

    public final void a() {
        ote oteVar = this.a;
        if (oteVar != null) {
            oteVar.a(null);
        }
        this.a = null;
    }

    public final void b() {
        ote oteVar = this.a;
        if (oteVar != null) {
            oteVar.c();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof otf)) {
            return false;
        }
        otf otfVar = (otf) obj;
        return Objects.equals(otfVar.a, this.a) && Objects.equals(otfVar.d, this.d) && Objects.equals(otfVar.c, this.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.d, this.c);
    }
}
