package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum axmx {
    DISABLED(0, false),
    DISK(1, true),
    DISK_NO_HTTP(1, false),
    MEMORY(2, true);

    public final int e;
    public final boolean f;

    axmx(int i, boolean z) {
        this.f = z;
        this.e = i;
    }
}
