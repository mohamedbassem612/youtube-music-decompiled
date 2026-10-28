package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class crz {
    public final int a;
    public final long b;
    public final Uri c;
    public final agke d;
    public final agke e;

    public crz(int i, long j, Uri uri, List list, List list2) {
        this.a = i;
        this.b = j;
        this.c = uri;
        this.d = agke.n(list);
        this.e = agke.n(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof crz) {
            crz crzVar = (crz) obj;
            if (this.a == crzVar.a && this.b == crzVar.b && Objects.equals(this.c, crzVar.c) && Objects.equals(this.d, crzVar.d) && Objects.equals(this.e, crzVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, this.e);
    }
}
