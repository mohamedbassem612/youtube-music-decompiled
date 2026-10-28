package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ojx {
    public final Uri a;
    public final String b;
    public final ojv c;
    public final int d;
    public final agke e;
    private final agev f;
    private final aifv g;

    public ojx(Uri uri, String str, ojv ojvVar, int i, agke agkeVar, agev agevVar, aifv aifvVar) {
        this.a = uri;
        this.b = str;
        this.c = ojvVar;
        this.d = i;
        this.e = agkeVar;
        this.f = agevVar;
        this.g = aifvVar;
    }

    public static ojw a() {
        ojw ojwVar = new ojw();
        ojwVar.f(-1);
        ojwVar.d(agpi.a);
        ojwVar.b(aifv.a);
        return ojwVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ojx) {
            ojx ojxVar = (ojx) obj;
            if (this.a.equals(ojxVar.a) && this.b.equals(ojxVar.b) && this.c.equals(ojxVar.c) && this.d == ojxVar.d && aguu.v(this.e, ojxVar.e) && this.f.equals(ojxVar.f) && this.g.equals(ojxVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        aifv aifvVar = this.g;
        agev agevVar = this.f;
        agke agkeVar = this.e;
        ojv ojvVar = this.c;
        return "DownloadRequest{fileUri=" + String.valueOf(this.a) + ", urlToDownload=" + this.b + ", downloadConstraints=" + String.valueOf(ojvVar) + ", trafficTag=" + this.d + ", extraHttpHeaders=" + String.valueOf(agkeVar) + ", inlineDownloadParamsOptional=" + String.valueOf(agevVar) + ", customDownloaderMetadata=" + String.valueOf(aifvVar) + '}';
    }

    public ojx() {
        throw null;
    }
}
