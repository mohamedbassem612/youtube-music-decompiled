package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fbh implements fao {
    private final fbg a;
    private final ffi b;

    public fbh(fbg fbgVar, ffi ffiVar) {
        this.a = fbgVar;
        this.b = ffiVar;
    }

    @Override // defpackage.fao
    public final void a(ewn ewnVar, Bitmap bitmap) throws IOException {
        IOException iOException = this.b.c;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            ewnVar.d(bitmap);
            throw iOException;
        }
    }

    @Override // defpackage.fao
    public final void b() {
        this.a.a();
    }
}
