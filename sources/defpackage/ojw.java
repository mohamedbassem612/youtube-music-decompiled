package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ojw {
    private Uri a;
    private String b;
    private ojv c;
    private int d;
    private agke e;
    private final agev f = agdf.a;
    private aifv g;
    private byte h;

    public final ojx a() {
        Uri uri;
        String str;
        ojv ojvVar;
        agke agkeVar;
        aifv aifvVar;
        String str2 = this.b;
        if (str2 == null) {
            throw new IllegalStateException("Property \"urlToDownload\" has not been set");
        }
        if (str2.startsWith("inlinefile")) {
            ahno.G(false, "InlineDownloadParams must be set when using inlinefile: scheme");
            c(ojv.a);
        }
        if (this.h == 1 && (uri = this.a) != null && (str = this.b) != null && (ojvVar = this.c) != null && (agkeVar = this.e) != null && (aifvVar = this.g) != null) {
            return new ojx(uri, str, ojvVar, this.d, agkeVar, this.f, aifvVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" fileUri");
        }
        if (this.b == null) {
            sb.append(" urlToDownload");
        }
        if (this.c == null) {
            sb.append(" downloadConstraints");
        }
        if (this.h == 0) {
            sb.append(" trafficTag");
        }
        if (this.e == null) {
            sb.append(" extraHttpHeaders");
        }
        if (this.g == null) {
            sb.append(" customDownloaderMetadata");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(aifv aifvVar) {
        if (aifvVar == null) {
            throw new NullPointerException("Null customDownloaderMetadata");
        }
        this.g = aifvVar;
    }

    public final void c(ojv ojvVar) {
        if (ojvVar == null) {
            throw new NullPointerException("Null downloadConstraints");
        }
        this.c = ojvVar;
    }

    public final void d(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null extraHttpHeaders");
        }
        this.e = agkeVar;
    }

    public final void e(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null fileUri");
        }
        this.a = uri;
    }

    public final void f(int i) {
        this.d = i;
        this.h = (byte) 1;
    }

    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null urlToDownload");
        }
        this.b = str;
    }
}
