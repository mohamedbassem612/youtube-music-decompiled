package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class waz extends wbb {
    private final byte[] a;

    public waz(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.wbb, defpackage.wbl
    public final byte[] a() {
        return this.a;
    }

    @Override // defpackage.wbl
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wbl)) {
            return false;
        }
        wbl wblVar = (wbl) obj;
        if (wblVar.b() == 2) {
            return Arrays.equals(this.a, wblVar instanceof waz ? ((waz) wblVar).a : wblVar.a());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "Write{bytes=" + Arrays.toString(this.a) + '}';
    }
}
