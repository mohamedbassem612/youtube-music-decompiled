package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tmh extends tmj {
    private final byte[] a;

    public tmh(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.tmj, defpackage.tmp
    public final byte[] a() {
        return this.a;
    }

    @Override // defpackage.tmp
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tmp)) {
            return false;
        }
        tmp tmpVar = (tmp) obj;
        if (tmpVar.b() == 1) {
            return Arrays.equals(this.a, tmpVar instanceof tmh ? ((tmh) tmpVar).a : tmpVar.a());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "DataOrParsed{data=" + Arrays.toString(this.a) + '}';
    }
}
