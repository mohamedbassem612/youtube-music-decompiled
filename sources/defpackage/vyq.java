package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum vyq {
    PRODUCTION("https://youtubei.googleapis.com", null),
    AUTOPUSH("https://green-youtubei.sandbox.googleapis.com", "rr12---sn-5uaezney.googlevideo.com"),
    STAGING("https://release-youtubei.sandbox.googleapis.com", "rr11---sn-5uaezney.googlevideo.com"),
    TEST("https://test-youtubei.sandbox.googleapis.com", null),
    uYTFE("https://uytfe.sandbox.google.com", null),
    PPG("http://127.0.0.1:8787", null),
    UBERDEMO("No default address as the demo is dynamically created when needed.", null);

    public final Uri h;
    public final String i;

    vyq(String str, String str2) {
        this.h = Uri.parse(str);
        this.i = str2;
    }
}
