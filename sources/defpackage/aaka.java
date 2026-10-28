package defpackage;

import android.content.UriMatcher;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aaka {
    public static final UriMatcher a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        a = uriMatcher;
        uriMatcher.addURI("appsearch", "video/*", 1);
        uriMatcher.addURI("appsearch", "playlist/*", 2);
    }

    public static String a(String str) {
        return new Uri.Builder().scheme("ytoffline").authority("appsearch").appendPath("playlist").appendPath(str).build().toString();
    }

    public static String b(String str) {
        return new Uri.Builder().scheme("ytoffline").authority("appsearch").appendPath("video").appendPath(str).build().toString();
    }

    public static String c(String str) {
        return typ.c(Uri.parse(str).getLastPathSegment());
    }
}
