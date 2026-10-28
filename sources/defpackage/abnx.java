package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class abnx {
    public final long a;
    public final long b;
    public final long c;
    public final Object d;

    public abnx(List list, long j, long j2) {
        this.d = agke.n(list);
        this.a = j;
        this.b = j2;
        long j3 = -9223372036854775807L;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            j3 = j + j2;
        }
        this.c = j3;
    }

    public abnx(String str, long j, long j2, long j3) {
        this.d = str;
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public abnx(String str, long j, long j2) {
        this.d = str;
        this.a = j;
        this.b = j2;
        this.c = -1L;
    }
}
