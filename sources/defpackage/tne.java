package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tne {
    public final byte[] a;
    public final tmt b;
    public final String c;

    public tne(byte[] bArr, tmt tmtVar, String str) {
        this.a = bArr;
        this.b = tmtVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tne) {
            tne tneVar = (tne) obj;
            if (awrc.c(this.a, tneVar.a) && awrc.c(this.b, tneVar.b) && awrc.c(this.c, tneVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((Arrays.hashCode(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "InlinedResponse(payload=" + Arrays.toString(this.a) + ", cacheMetadata=" + this.b + ", requestKey=" + this.c + ')';
    }
}
