package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class yvs {
    public final String a;
    public final int b;
    public final long c;
    public final long d;
    public final String e;
    public final boolean f;
    public final long g;
    public final String h;
    public final aigj i;

    public yvs(String str, int i, long j, long j2, String str2, boolean z, long j3, String str3, aigj aigjVar) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = str2;
        this.f = z;
        this.g = j3;
        this.h = str3;
        this.i = aigjVar;
    }

    public abstract long a();

    public final boolean b(yvs yvsVar) {
        String str = this.a;
        return str != null && str.equals(yvsVar.a);
    }
}
