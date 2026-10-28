package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class eut implements euh {
    protected final boolean a;
    private final Uri b;
    private final ContentResolver c;
    private Object d;

    public eut(ContentResolver contentResolver, Uri uri, boolean z) {
        this.c = contentResolver;
        this.b = uri;
        this.a = z;
    }

    protected abstract Object b(Uri uri, ContentResolver contentResolver);

    protected abstract void c(Object obj);

    @Override // defpackage.euh
    public final void d() {
        Object obj = this.d;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
        }
    }

    protected final AssetFileDescriptor e(Uri uri) {
        return (this.a && ept.q(uri) && ept.p()) ? ept.o(uri, this.c) : this.c.openAssetFileDescriptor(uri, "r");
    }

    @Override // defpackage.euh
    public final void f(esf esfVar, eug eugVar) {
        try {
            Object objB = b(this.b, this.c);
            this.d = objB;
            eugVar.b(objB);
        } catch (FileNotFoundException e) {
            eugVar.e(e);
        }
    }

    @Override // defpackage.euh
    public final int g() {
        return 1;
    }

    @Override // defpackage.euh
    public final void gI() {
    }
}
