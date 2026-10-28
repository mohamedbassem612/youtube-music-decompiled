package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dhh {
    public final Bundle a;
    private final Boolean b;
    private did c;

    public dhh(did didVar, boolean z, boolean z2) {
        if (didVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (!z && z2) {
            throw new IllegalArgumentException("shouldScanWithScreenOff can not be true when activeScan is false");
        }
        Bundle bundle = new Bundle();
        this.a = bundle;
        this.c = didVar;
        this.b = Boolean.valueOf(z2);
        bundle.putBundle("selector", didVar.b);
        bundle.putBoolean("activeScan", z);
    }

    private final void e() {
        if (this.c == null) {
            Bundle bundle = this.a.getBundle("selector");
            did didVar = did.a;
            did didVar2 = bundle != null ? new did(bundle, null) : null;
            this.c = didVar2;
            if (didVar2 == null) {
                this.c = did.a;
            }
        }
    }

    public final did a() {
        e();
        return this.c;
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean c() {
        e();
        did didVar = this.c;
        didVar.c();
        return !didVar.c.contains(null);
    }

    public final boolean d() {
        return this.b.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dhh)) {
            return false;
        }
        dhh dhhVar = (dhh) obj;
        return a().equals(dhhVar.a()) && b() == dhhVar.b() && d() == dhhVar.d();
    }

    public final int hashCode() {
        return ((a().hashCode() ^ (b() ? 1 : 0)) == true ? 1 : 0) ^ (d() ? 1 : 0);
    }

    public final String toString() {
        return "DiscoveryRequest{ selector=" + a() + ", activeScan=" + b() + ", isValid=" + c() + ", shouldScanWithScreenOff= " + d() + " }";
    }

    public dhh(Bundle bundle) {
        this.a = bundle;
        this.b = Boolean.FALSE;
    }
}
