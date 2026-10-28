package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class eyq implements euh {
    private static final String[] a = {"_data"};
    private final Context b;
    private final Uri c;

    public eyq(Context context, Uri uri) {
        this.b = context;
        this.c = uri;
    }

    @Override // defpackage.euh
    public final Class a() {
        return File.class;
    }

    @Override // defpackage.euh
    public final void f(esf esfVar, eug eugVar) {
        Cursor cursorQuery = this.b.getContentResolver().query(this.c, a, null, null, null);
        String string = null;
        if (cursorQuery != null) {
            try {
                string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                cursorQuery.close();
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        if (TextUtils.isEmpty(string)) {
            eugVar.e(new FileNotFoundException("Failed to find file path for: ".concat(String.valueOf(String.valueOf(this.c)))));
        } else {
            eugVar.b(new File(string));
        }
    }

    @Override // defpackage.euh
    public final int g() {
        return 1;
    }

    @Override // defpackage.euh
    public final void d() {
    }

    @Override // defpackage.euh
    public final void gI() {
    }
}
