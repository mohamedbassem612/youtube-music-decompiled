package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class zvc {
    final String a;
    public final akkn b;
    long c;
    long d;

    public zvc(long j, String str, akkn akknVar) {
        this.a = str;
        this.c = akknVar != null ? j - TimeUnit.SECONDS.toMillis(akknVar.c) : 0L;
        this.b = akknVar;
        this.d = 0L;
    }
}
