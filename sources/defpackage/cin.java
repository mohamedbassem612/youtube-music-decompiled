package defpackage;

import android.net.Uri;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cin {
    public final Uri a;
    public final agke b;
    public final boolean c;

    public cin(Uri uri, String[] strArr, boolean z) {
        this.a = uri;
        this.b = agke.p(strArr);
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cin) {
            cin cinVar = (cin) obj;
            if (Objects.equals(this.a, cinVar.a) && Objects.equals(this.b, cinVar.b) && this.c == cinVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Boolean.valueOf(this.c));
    }
}
