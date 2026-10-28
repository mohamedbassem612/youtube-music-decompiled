package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum atzl {
    BAD_URL(false),
    CANCELED(false),
    REQUEST_BODY_READ_ERROR(false),
    CONNECTION_ERROR(true),
    SERVER_ERROR(true),
    UNKNOWN(false);

    public final boolean g;

    atzl(boolean z) {
        this.g = z;
    }
}
