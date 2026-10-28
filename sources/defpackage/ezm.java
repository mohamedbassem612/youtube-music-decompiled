package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ezm implements euh {
    private static final String[] a = {"_data"};
    private final Context b;
    private final eyv c;
    private final eyv d;
    private final Uri e;
    private final int f;
    private final int g;
    private final ety h;
    private final Class i;
    private volatile boolean j;
    private volatile euh k;

    public ezm(Context context, eyv eyvVar, eyv eyvVar2, Uri uri, int i, int i2, ety etyVar, Class cls) {
        this.b = context.getApplicationContext();
        this.c = eyvVar;
        this.d = eyvVar2;
        this.e = uri;
        this.f = i;
        this.g = i2;
        this.h = etyVar;
        this.i = cls;
    }

    @Override // defpackage.euh
    public final Class a() {
        return this.i;
    }

    @Override // defpackage.euh
    public final void d() {
        euh euhVar = this.k;
        if (euhVar != null) {
            euhVar.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [euh] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    @Override // defpackage.euh
    public final void f(esf esfVar, eug eugVar) throws Throwable {
        hed hedVarB;
        Throwable th;
        try {
            Cursor cursor = null;
            if (Environment.isExternalStorageLegacy()) {
                eyv eyvVar = this.c;
                Uri uri = this.e;
                try {
                    Cursor cursorQuery = this.b.getContentResolver().query(uri, a, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException(a.cp(uri, "File path was empty in media store for: "));
                                }
                                File file = new File(string);
                                cursorQuery.close();
                                hedVarB = eyvVar.b(file, this.f, this.g, this.h);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                            if (cursor == null) {
                                throw th;
                            }
                            cursor.close();
                            throw th;
                        }
                    }
                    throw new FileNotFoundException(a.cp(uri, "Failed to media store entry for: "));
                } catch (Throwable th3) {
                    th = th3;
                }
            } else if (Build.VERSION.SDK_INT < 30) {
                Uri requireOriginal = this.e;
                if (ept.q(requireOriginal)) {
                    Iterator<String> it = requireOriginal.getPathSegments().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String next = it.next();
                            if (next != null && next.startsWith("picker")) {
                                hedVarB = this.d.b(this.e, this.f, this.g, this.h);
                            }
                        }
                    }
                }
                if (this.b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                hedVarB = this.d.b(requireOriginal, this.f, this.g, this.h);
            } else {
                hedVarB = this.d.b(this.e, this.f, this.g, this.h);
            }
            ?? r1 = hedVarB != null ? hedVarB.a : 0;
            if (r1 == 0) {
                eugVar.e(new IllegalArgumentException("Failed to build fetcher for: " + String.valueOf(this.e)));
                return;
            }
            this.k = r1;
            if (this.j) {
                gI();
            } else {
                r1.f(esfVar, eugVar);
            }
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
        this.j = true;
        euh euhVar = this.k;
        if (euhVar != null) {
            euhVar.gI();
        }
    }
}
