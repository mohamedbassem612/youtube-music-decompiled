package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class rqg {
    public final rqf a;
    public final ajwo b;
    private final boolean c;

    public rqg(rqf rqfVar, boolean z, ajwo ajwoVar) {
        this.a = rqfVar;
        this.c = z;
        this.b = ajwoVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rqg)) {
            return false;
        }
        rqg rqgVar = (rqg) obj;
        return this.c == rqgVar.c && this.a == rqgVar.a;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.c));
    }

    public rqg(rqf rqfVar, boolean z) {
        this(rqfVar, false, null);
    }
}
