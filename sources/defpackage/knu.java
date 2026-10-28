package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class knu {
    private final int a;
    private final kms b;
    private final String c;
    private final khn d;

    public knu(khn khnVar, kms kmsVar, String str) {
        this.d = khnVar;
        this.b = kmsVar;
        this.c = str;
        this.a = Objects.hash(khnVar, kmsVar, str, null);
    }

    public final String a() {
        return (String) this.d.a;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj != this) {
            if (!(obj instanceof knu)) {
                return false;
            }
            knu knuVar = (knu) obj;
            if (!Objects.equals(this.d, knuVar.d) || !Objects.equals(this.b, knuVar.b) || !Objects.equals(this.c, knuVar.c) || !Objects.equals(null, null)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }
}
