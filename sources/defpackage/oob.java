package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oob {
    public final Uri a;
    public final String b;
    public final ojv c;
    public final agev d;
    public final int e;
    public final agke f;
    public final aifv g;
    private final String h;
    private final agev i;
    private final agev j;
    private final boolean k;
    private final boolean l;

    public oob(Uri uri, String str, ojv ojvVar, agev agevVar, int i, agke agkeVar, String str2, agev agevVar2, agev agevVar3, boolean z, boolean z2, aifv aifvVar) {
        this.a = uri;
        this.b = str;
        this.c = ojvVar;
        this.d = agevVar;
        this.e = i;
        this.f = agkeVar;
        this.h = str2;
        this.i = agevVar2;
        this.j = agevVar3;
        this.k = z;
        this.l = z2;
        this.g = aifvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oob) {
            oob oobVar = (oob) obj;
            if (this.a.equals(oobVar.a) && this.b.equals(oobVar.b) && this.c.equals(oobVar.c) && this.d.equals(oobVar.d) && this.e == oobVar.e && aguu.v(this.f, oobVar.f) && this.h.equals(oobVar.h) && this.i.equals(oobVar.i) && this.j.equals(oobVar.j) && this.k == oobVar.k && this.l == oobVar.l && this.g.equals(oobVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * (-721379959)) ^ this.h.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true == this.l ? 1231 : 1237)) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        aifv aifvVar = this.g;
        agev agevVar = this.j;
        agev agevVar2 = this.i;
        agke agkeVar = this.f;
        agev agevVar3 = this.d;
        ojv ojvVar = this.c;
        return "DownloadRequest{destinationFileUri=" + String.valueOf(this.a) + ", urlToDownload=" + this.b + ", downloadConstraints=" + String.valueOf(ojvVar) + ", listenerOptional=" + String.valueOf(agevVar3) + ", trafficTag=" + this.e + ", extraHttpHeaders=" + String.valueOf(agkeVar) + ", fileSizeBytes=0, notificationContentTitle=" + this.h + ", notificationContentTextOptional=" + String.valueOf(agevVar2) + ", notificationContentIntentOptional=" + String.valueOf(agevVar) + ", showDownloadedNotification=" + this.k + ", showFailureNotification=" + this.l + ", customDownloaderMetadata=" + String.valueOf(aifvVar) + '}';
    }

    public oob() {
        throw null;
    }
}
