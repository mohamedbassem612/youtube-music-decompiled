package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qjw {
    public static final ConcurrentMap a = new ConcurrentHashMap();
    public static final String[] b = {"key", "value"};
    public final ContentResolver c;
    public final Uri d;
    public volatile Map h;
    public ContentObserver e = null;
    public volatile boolean f = true;
    public final Object g = new Object();
    public final List i = new ArrayList();

    public qjw(ContentResolver contentResolver, Uri uri) {
        contentResolver.getClass();
        this.c = contentResolver;
        this.d = uri;
    }
}
