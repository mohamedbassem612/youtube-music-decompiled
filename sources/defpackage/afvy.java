package defpackage;

import android.text.TextUtils;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afvy {
    public final agke a;
    public final agke b;
    public final UUID c;
    public final long d;

    public afvy(agke agkeVar, agke agkeVar2, UUID uuid, long j) {
        this.a = agkeVar;
        this.b = agkeVar2;
        this.c = uuid;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afvy) {
            afvy afvyVar = (afvy) obj;
            if (aguu.v(this.a, afvyVar.a) && aguu.v(this.b, afvyVar.b) && this.c.equals(afvyVar.c) && this.d == afvyVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return (iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return TextUtils.join(" -> ", this.a);
    }

    public afvy() {
        throw null;
    }
}
