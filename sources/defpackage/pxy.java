package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pxy implements pxs {
    private pxy() {
    }

    @Override // defpackage.pxs
    public final /* synthetic */ Map a() {
        return qnl.X(this);
    }

    @Override // defpackage.pxs
    public final void b(agkh agkhVar) {
        agkhVar.e(pyd.a, new pxj(atqq.o(pya.IN_APP), null));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxy)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -14934830;
    }

    public final String toString() {
        return "GnpZwiebackInAppRegistrationData";
    }
}
