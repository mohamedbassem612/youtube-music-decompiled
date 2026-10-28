package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cyp implements bsw {
    public final List a;

    public cyp(List list) {
        this.a = list;
        boolean z = false;
        if (!list.isEmpty()) {
            long j = ((cyo) list.get(0)).b;
            for (int i = 1; i < list.size(); i++) {
                if (((cyo) list.get(i)).a < j) {
                    z = true;
                    break;
                }
                j = ((cyo) list.get(i)).b;
            }
        }
        ahno.F(!z);
    }

    @Override // defpackage.bsw
    public final /* synthetic */ bse a() {
        return null;
    }

    @Override // defpackage.bsw
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((cyp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.a.toString());
    }

    @Override // defpackage.bsw
    public final /* synthetic */ void b(bsu bsuVar) {
    }
}
