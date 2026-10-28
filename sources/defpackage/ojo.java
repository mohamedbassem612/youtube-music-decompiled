package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ojo {
    public final Uri a;
    public final String b;
    public final ojv c;
    public final int d;
    public final agke e;
    public final String f;
    public final agev g;
    public final agev h;
    public final boolean i;
    public final boolean j;
    public final aifv k;
    private final agev l;

    public ojo(Uri uri, String str, ojv ojvVar, agev agevVar, int i, agke agkeVar, String str2, agev agevVar2, agev agevVar3, boolean z, boolean z2, aifv aifvVar) {
        this.a = uri;
        this.b = str;
        this.c = ojvVar;
        this.l = agevVar;
        this.d = i;
        this.e = agkeVar;
        this.f = str2;
        this.g = agevVar2;
        this.h = agevVar3;
        this.i = z;
        this.j = z2;
        this.k = aifvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ojo) {
            ojo ojoVar = (ojo) obj;
            if (this.a.equals(ojoVar.a) && this.b.equals(ojoVar.b) && this.c.equals(ojoVar.c) && this.l.equals(ojoVar.l) && this.d == ojoVar.d && aguu.v(this.e, ojoVar.e) && this.f.equals(ojoVar.f) && this.g.equals(ojoVar.g) && this.h.equals(ojoVar.h) && this.i == ojoVar.i && this.j == ojoVar.j && this.k.equals(ojoVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * (-721379959)) ^ this.f.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true == this.j ? 1231 : 1237)) * 1000003) ^ this.k.hashCode();
    }

    public final String toString() {
        aifv aifvVar = this.k;
        agev agevVar = this.h;
        agev agevVar2 = this.g;
        agke agkeVar = this.e;
        agev agevVar3 = this.l;
        ojv ojvVar = this.c;
        return "SingleFileDownloadRequest{destinationFileUri=" + String.valueOf(this.a) + ", urlToDownload=" + this.b + ", downloadConstraints=" + String.valueOf(ojvVar) + ", listenerOptional=" + String.valueOf(agevVar3) + ", trafficTag=" + this.d + ", extraHttpHeaders=" + String.valueOf(agkeVar) + ", fileSizeBytes=0, notificationContentTitle=" + this.f + ", notificationContentTextOptional=" + String.valueOf(agevVar2) + ", notificationContentIntentOptional=" + String.valueOf(agevVar) + ", showDownloadedNotification=" + this.i + ", showFailureNotification=" + this.j + ", customDownloaderMetadata=" + String.valueOf(aifvVar) + '}';
    }

    public ojo() {
        throw null;
    }
}
