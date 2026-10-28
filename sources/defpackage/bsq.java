package defpackage;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsq {
    public static final bsq a = new bsq();
    public final Uri b = null;
    public final String c = null;
    public final Bundle d = null;

    static {
        int i = bwp.a;
    }

    private bsq() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bsq) {
            bsq bsqVar = (bsq) obj;
            Uri uri = bsqVar.b;
            if (Objects.equals(null, null)) {
                String str = bsqVar.c;
                if (Objects.equals(null, null)) {
                    Bundle bundle = bsqVar.d;
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }
}
