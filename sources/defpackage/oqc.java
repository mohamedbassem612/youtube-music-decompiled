package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oqc {
    static final Bitmap a;
    static final LruCache b;
    public final opz c;
    public final oui d;
    public final Set e = ConcurrentHashMap.newKeySet();

    static {
        new Handler(Looper.getMainLooper());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(0);
        a = bitmapCreateBitmap;
        b = new oqa();
    }

    public oqc(opz opzVar, oui ouiVar) {
        this.c = opzVar;
        this.d = ouiVar;
    }
}
