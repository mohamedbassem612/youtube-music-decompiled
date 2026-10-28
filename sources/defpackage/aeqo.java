package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aeqo {
    public final byte[] a;
    public final String b;
    public final String c;

    public aeqo(byte[] bArr, String str, String str2) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeqo) {
            aeqo aeqoVar = (aeqo) obj;
            if (Arrays.equals(this.a, aeqoVar instanceof aeqo ? aeqoVar.a : aeqoVar.a) && this.b.equals(aeqoVar.b) && this.c.equals(aeqoVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "ProductSpecificBinaryDataModel{data=" + Arrays.toString(this.a) + ", mimeType=" + this.b + ", fileName=" + this.c + '}';
    }

    public aeqo() {
        throw null;
    }
}
