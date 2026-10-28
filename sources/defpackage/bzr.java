package defpackage;

import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class bzr implements Comparable {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final File e;
    public final long f;

    public bzr(String str, long j, long j2, long j3, File file) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = file != null;
        this.e = file;
        this.f = j3;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(bzr bzrVar) {
        String str = this.a;
        String str2 = bzrVar.a;
        if (!str.equals(str2)) {
            return str.compareTo(str2);
        }
        long j = this.b - bzrVar.b;
        if (j == 0) {
            return 0;
        }
        return j >= 0 ? 1 : -1;
    }

    public final boolean b() {
        return !this.d;
    }

    public final String toString() {
        return "[" + this.b + ", " + this.c + ']';
    }
}
