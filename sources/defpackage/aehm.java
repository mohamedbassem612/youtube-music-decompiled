package defpackage;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aehm {
    public final Uri a;
    public final Intent b;
    public final String c;
    private final Intent d;

    public aehm(Uri uri, Intent intent, Intent intent2, String str) {
        this.a = uri;
        this.d = intent;
        this.b = intent2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aehm) {
            aehm aehmVar = (aehm) obj;
            Uri uri = this.a;
            if (uri != null ? uri.equals(aehmVar.a) : aehmVar.a == null) {
                Intent intent = this.d;
                if (intent != null ? intent.equals(aehmVar.d) : aehmVar.d == null) {
                    Intent intent2 = this.b;
                    if (intent2 != null ? intent2.equals(aehmVar.b) : aehmVar.b == null) {
                        String str = this.c;
                        if (str == null) {
                            if (aehmVar.c == null) {
                                return true;
                            }
                        } else if (str.equals(aehmVar.c)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iHashCode = uri == null ? 0 : uri.hashCode();
        Intent intent = this.d;
        int iHashCode2 = intent == null ? 0 : intent.hashCode();
        int i = iHashCode ^ 1000003;
        Intent intent2 = this.b;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (intent2 == null ? 0 : intent2.hashCode())) * 1000003;
        String str = this.c;
        return iHashCode3 ^ (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        Intent intent = this.b;
        Intent intent2 = this.d;
        return "WebViewIntentHolder{targetUri=" + String.valueOf(this.a) + ", originalIntent=" + String.valueOf(intent2) + ", sanitizedIntent=" + String.valueOf(intent) + ", targetHost=" + this.c + '}';
    }

    public aehm() {
        throw null;
    }
}
