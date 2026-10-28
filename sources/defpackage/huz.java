package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class huz {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/offline/sync/implementation/MusicPlaylistSyncLogger");
    public final jkg b;
    public final twf c;
    public final abvk d;
    public final hnq e;
    public final tfq f;
    public final aanb g;
    public final aaqg h;
    public final abxv i;
    public final abfv j;

    public huz(jkg jkgVar, twf twfVar, abxv abxvVar, abvk abvkVar, tfq tfqVar, aaqg aaqgVar, hnq hnqVar, aanb aanbVar, abfv abfvVar) {
        this.b = jkgVar;
        this.c = twfVar;
        this.i = abxvVar;
        this.d = abvkVar;
        this.f = tfqVar;
        this.h = aaqgVar;
        this.e = hnqVar;
        this.j = abfvVar;
        this.g = aanbVar;
    }

    public static final void c(StringBuilder sb, String str, long j) {
        sb.append(str.concat(": "));
        sb.append(j);
        sb.append(", ");
    }

    public static final void d(StringBuilder sb, String str, boolean z) {
        sb.append(str.concat(": "));
        sb.append(z);
        sb.append(", ");
    }

    public static final void e(StringBuilder sb, String str, boolean z) {
        sb.append(str.concat(": "));
        sb.append(z);
    }

    public final void a(String str, Object... objArr) {
        String.format("PlaylistSync: ".concat(str), objArr);
    }

    public final void b(String str) {
        a("Unable to start playlist sync: %s", str);
    }
}
