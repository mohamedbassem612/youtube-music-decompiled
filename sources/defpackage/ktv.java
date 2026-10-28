package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ktv {
    public final boolean a;
    public final Bundle b;

    public ktv(boolean z, Bundle bundle) {
        this.a = z;
        this.b = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ktv) {
            ktv ktvVar = (ktv) obj;
            if (this.a == ktvVar.a && this.b.equals(ktvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "DroidGuardClientOptions{reinitializeHandleOnGetSnapshot=" + this.a + ", extras=" + String.valueOf(this.b) + '}';
    }

    public ktv() {
        throw null;
    }
}
