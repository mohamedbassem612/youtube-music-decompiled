package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class oze {
    public final long a;
    public final Map b;

    public oze(long j, Map map) {
        this.a = j;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oze) {
            oze ozeVar = (oze) obj;
            if (this.a == ozeVar.a && awrc.c(this.b, ozeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (a.ak(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "NotificationsCount(count=" + this.a + ", taggedNotificationsCounts=" + this.b + ')';
    }
}
