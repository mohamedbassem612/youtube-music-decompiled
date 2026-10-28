package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uft {
    public static final uft a = new uft(awno.a);
    public final List b;

    public uft(List list) {
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof uft) && awrc.c(this.b, ((uft) obj).b);
        }
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return "CameraProjectData(segments=" + this.b + ')';
    }
}
