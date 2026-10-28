package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wgg {
    public final int a;
    public final int b;
    private final twv c;

    public wgg(aqmg aqmgVar) {
        aqmgVar.getClass();
        this.c = new wge(aqmgVar.c);
        this.a = aqmgVar.d;
        this.b = aqmgVar.e;
    }

    public final Uri a() {
        return (Uri) this.c.io();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wgg) {
            wgg wggVar = (wgg) obj;
            twv twvVar = this.c;
            if (twvVar.io() == null) {
                if (wggVar.c.io() == null) {
                    return true;
                }
            } else if (((Uri) twvVar.io()).equals(wggVar.c.io()) && this.a == wggVar.a && this.b == wggVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        twv twvVar = this.c;
        return (((((twvVar.io() == null ? 0 : ((Uri) twvVar.io()).hashCode()) + 31) * 31) + this.a) * 31) + this.b;
    }

    public wgg(Uri uri, int i, int i2) {
        uri.getClass();
        this.c = new wgf(uri);
        this.a = i;
        this.b = i2;
    }
}
