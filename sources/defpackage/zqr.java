package defpackage;

import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zqr {
    public final UUID a;

    public /* synthetic */ zqr(UUID uuid) {
        this.a = uuid;
    }

    public static String a(UUID uuid) {
        return "ContextHandle(uuid=" + uuid + ')';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zqr) && awrc.c(this.a, ((zqr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a(this.a);
    }
}
