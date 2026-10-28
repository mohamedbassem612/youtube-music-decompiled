package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iac {
    static final iac a = a(null, null);
    public final aamh b;
    public final agke c;

    public iac(aamh aamhVar, agke agkeVar) {
        this.b = aamhVar;
        if (agkeVar == null) {
            throw new NullPointerException("Null tracks");
        }
        this.c = agkeVar;
    }

    public static iac a(aamh aamhVar, List list) {
        return new iac(aamhVar, list != null ? agke.n(list) : agpi.a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iac) {
            iac iacVar = (iac) obj;
            aamh aamhVar = this.b;
            if (aamhVar != null ? aamhVar.equals(iacVar.b) : iacVar.b == null) {
                if (aguu.v(this.c, iacVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        aamh aamhVar = this.b;
        return (((aamhVar == null ? 0 : aamhVar.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        agke agkeVar = this.c;
        return "ContainerTracksPair{offlinePlaylist=" + String.valueOf(this.b) + ", tracks=" + agkeVar.toString() + '}';
    }

    public iac() {
        throw null;
    }
}
