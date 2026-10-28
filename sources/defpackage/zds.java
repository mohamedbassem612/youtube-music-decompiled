package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zds implements zgg {
    public final long a;
    public final boolean b;
    public final int c;
    public boolean d;
    public final String e;
    public final String f;

    public zds(long j, boolean z, int i, String str, String str2) {
        zkf.c(str != null);
        this.a = j;
        this.b = z;
        this.c = i;
        this.e = str;
        this.f = str2;
        this.d = false;
    }

    @Override // defpackage.zgg
    public final String a(long j) {
        return String.format(Locale.US, "t.%.3f;m.%.3f;g.%d;tt.%d;np.%d;c.%s;ad.%s", Float.valueOf(j / 1000.0f), Float.valueOf(this.a / 1000.0f), Integer.valueOf(this.b ? 1 : 0), Integer.valueOf(this.c), Integer.valueOf(this.d ? 1 : 0), this.e, this.f);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zds) {
            return a(0L).equals(((zds) obj).a(0L));
        }
        return false;
    }

    public final int hashCode() {
        return a(0L).hashCode();
    }

    public final String toString() {
        return a(0L);
    }
}
