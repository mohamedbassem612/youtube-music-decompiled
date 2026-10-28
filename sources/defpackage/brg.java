package defpackage;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class brg {
    public String a;
    private int b;
    private int c;

    public brg(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof brg) {
            brg brgVar = (brg) obj;
            if (this.b < 0 || brgVar.b < 0) {
                if (TextUtils.equals(this.a, brgVar.a) && this.c == brgVar.c) {
                    return true;
                }
            } else if (TextUtils.equals(this.a, brgVar.a) && this.b == brgVar.b && this.c == brgVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c));
    }

    public brg(String str, int i, int i2, byte[] bArr) {
        this(str, i, i2);
        new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }
}
