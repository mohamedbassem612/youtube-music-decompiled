package defpackage;

import android.accounts.Account;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lrn implements kms {
    public final int a;
    public final int b;
    public final Account c;
    public final String d;
    final boolean e;

    public lrn(avju avjuVar) {
        this.a = avjuVar.b;
        this.b = 1;
        this.e = true;
        this.c = (Account) avjuVar.c;
        this.d = (String) avjuVar.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lrn)) {
            return false;
        }
        lrn lrnVar = (lrn) obj;
        if (!Objects.equals(Integer.valueOf(this.a), Integer.valueOf(lrnVar.a))) {
            return false;
        }
        int i = lrnVar.b;
        if (!Objects.equals(1, 1) || !Objects.equals(this.c, lrnVar.c)) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        boolean z = lrnVar.e;
        return Objects.equals(bool, bool);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), 1, this.c, Boolean.TRUE);
    }

    private lrn() {
        this(new avju((byte[]) null));
    }
}
