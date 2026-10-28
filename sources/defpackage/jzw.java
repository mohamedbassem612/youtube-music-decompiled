package defpackage;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import j$.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jzw implements kms {
    final CastDevice a;
    final Bundle b;
    final int c = 0;
    final String d = UUID.randomUUID().toString();
    final hna e;

    public jzw(jzv jzvVar) {
        this.a = jzvVar.a;
        this.e = jzvVar.c;
        this.b = jzvVar.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jzw) {
            jzw jzwVar = (jzw) obj;
            if (Objects.equals(this.a, jzwVar.a) && kro.n(this.b, jzwVar.b)) {
                int i = jzwVar.c;
                if (Objects.equals(this.d, jzwVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, 0, this.d);
    }
}
