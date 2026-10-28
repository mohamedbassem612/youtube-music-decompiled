package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oal {
    public final Uri a;

    public oal(Uri uri) {
        this.a = uri;
    }

    public final String a() {
        return this.a.getPath();
    }

    public final oal b(String str) {
        return new oal(this.a.buildUpon().encodedPath(str).build());
    }

    public final String toString() {
        return this.a.toString();
    }
}
