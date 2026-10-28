package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kfo {
    public kfp a;
    public Bitmap b;
    public kfn c;
    private final Context d;
    private final kem e;
    private Uri f;

    public kfo(Context context) {
        this(context, new kem(-1, 0, 0));
    }

    private final void c() {
        kfp kfpVar = this.a;
        if (kfpVar != null) {
            kfpVar.cancel(true);
            this.a = null;
        }
        this.f = null;
        this.b = null;
    }

    public final void a() {
        c();
        this.c = null;
    }

    public final void b(Uri uri) {
        kfp kfpVar;
        int i;
        if (uri == null) {
            c();
            return;
        }
        if (uri.equals(this.f)) {
            return;
        }
        c();
        this.f = uri;
        kem kemVar = this.e;
        int i2 = kemVar.b;
        if (i2 == 0 || (i = kemVar.c) == 0) {
            kfpVar = new kfp(this.d, 0, 0, this);
            this.a = kfpVar;
        } else {
            kfpVar = new kfp(this.d, i2, i, this);
            this.a = kfpVar;
        }
        kro.l(kfpVar);
        Uri uri2 = this.f;
        kro.l(uri2);
        kfpVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
    }

    public kfo(Context context, kem kemVar) {
        this.d = context;
        this.e = kemVar;
        c();
    }
}
