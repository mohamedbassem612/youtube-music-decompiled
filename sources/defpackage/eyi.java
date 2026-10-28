package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class eyi implements euh {
    private final /* synthetic */ int $cid;
    private Object a;
    private final Object b;
    private final Object c;

    public eyi(Uri uri, kwq kwqVar, int i) {
        this.$cid = i;
        this.c = uri;
        this.b = kwqVar;
    }

    public static eyi b(Context context, Uri uri, eva evaVar) {
        return new eyi(uri, new kwq(erj.b(context).f().c(), evaVar, erj.b(context).h, context.getContentResolver()), 1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [eyj, java.lang.Object] */
    @Override // defpackage.euh
    public final Class a() {
        return this.$cid != 0 ? InputStream.class : this.c.a();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [eyj, java.lang.Object] */
    @Override // defpackage.euh
    public final void d() {
        int i = this.$cid;
        Object obj = this.a;
        try {
            if (i != 0) {
                if (obj == null) {
                } else {
                    ((InputStream) obj).close();
                }
            } else if (obj == null) {
            } else {
                this.c.c(obj);
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003d A[Catch: FileNotFoundException -> 0x00bb, TryCatch #11 {FileNotFoundException -> 0x00bb, blocks: (B:4:0x0004, B:11:0x0022, B:22:0x0037, B:24:0x003d, B:26:0x0048, B:28:0x0052, B:29:0x0056, B:37:0x007a, B:50:0x00af, B:51:0x00b5, B:45:0x00a6, B:32:0x0062, B:33:0x0075, B:20:0x0033, B:16:0x002c, B:17:0x002f, B:38:0x007e), top: B:74:0x0004, inners: #5, #12 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0076  */
    /* JADX WARN: Code duplicated, block: B:37:0x007a A[Catch: FileNotFoundException -> 0x00bb, TRY_LEAVE, TryCatch #11 {FileNotFoundException -> 0x00bb, blocks: (B:4:0x0004, B:11:0x0022, B:22:0x0037, B:24:0x003d, B:26:0x0048, B:28:0x0052, B:29:0x0056, B:37:0x007a, B:50:0x00af, B:51:0x00b5, B:45:0x00a6, B:32:0x0062, B:33:0x0075, B:20:0x0033, B:16:0x002c, B:17:0x002f, B:38:0x007e), top: B:74:0x0004, inners: #5, #12 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:50:0x00af A[Catch: FileNotFoundException -> 0x00bb, TRY_ENTER, TryCatch #11 {FileNotFoundException -> 0x00bb, blocks: (B:4:0x0004, B:11:0x0022, B:22:0x0037, B:24:0x003d, B:26:0x0048, B:28:0x0052, B:29:0x0056, B:37:0x007a, B:50:0x00af, B:51:0x00b5, B:45:0x00a6, B:32:0x0062, B:33:0x0075, B:20:0x0033, B:16:0x002c, B:17:0x002f, B:38:0x007e), top: B:74:0x0004, inners: #5, #12 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v15, types: [eva, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v12, types: [eyj, java.lang.Object] */
    @Override // defpackage.euh
    public final void f(esf esfVar, eug eugVar) throws Throwable {
        Cursor cursorA;
        String string;
        InputStream eunVar;
        int iE;
        File file;
        if (this.$cid == 0) {
            try {
                Object objB = this.c.b((File) this.b);
                this.a = objB;
                eugVar.b(objB);
                return;
            } catch (FileNotFoundException e) {
                eugVar.e(e);
                return;
            }
        }
        try {
            Object obj = this.b;
            Object obj2 = this.c;
            Cursor cursor = null;
            inputStreamOpenInputStream = null;
            InputStream inputStreamOpenInputStream = null;
            try {
                cursorA = ((kwq) obj).c.a((Uri) obj2);
                if (cursorA != null) {
                    try {
                        if (cursorA.moveToFirst()) {
                            string = cursorA.getString(0);
                            cursorA.close();
                        } else {
                            cursorA.close();
                            string = null;
                        }
                    } catch (SecurityException unused) {
                        if (cursorA != null) {
                        }
                        string = null;
                        if (TextUtils.isEmpty(string)) {
                            eunVar = null;
                        } else {
                            file = new File(string);
                            if (file.exists()) {
                                eunVar = null;
                            } else {
                                eunVar = null;
                            }
                        }
                        if (eunVar != null) {
                            Object obj3 = this.b;
                            try {
                                inputStreamOpenInputStream = ((ContentResolver) ((kwq) obj3).a).openInputStream((Uri) this.c);
                                iE = ept.e(((kwq) obj3).b, inputStreamOpenInputStream, (ewv) ((kwq) obj3).d);
                                if (inputStreamOpenInputStream != null) {
                                    try {
                                        inputStreamOpenInputStream.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                            } catch (IOException | NullPointerException unused3) {
                                if (inputStreamOpenInputStream != null) {
                                    try {
                                        inputStreamOpenInputStream.close();
                                    } catch (IOException unused4) {
                                    }
                                }
                                iE = -1;
                            } catch (Throwable th) {
                                if (inputStreamOpenInputStream != null) {
                                    try {
                                        inputStreamOpenInputStream.close();
                                    } catch (IOException unused5) {
                                    }
                                }
                                throw th;
                            }
                        } else {
                            iE = -1;
                        }
                        if (iE != -1) {
                            eunVar = new eun(eunVar, iE);
                        }
                        this.a = eunVar;
                        eugVar.b(eunVar);
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorA;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } else {
                    string = null;
                }
            } catch (SecurityException unused6) {
                cursorA = null;
            } catch (Throwable th3) {
                th = th3;
            }
            if (TextUtils.isEmpty(string)) {
                file = new File(string);
                if (file.exists() || file.length() <= 0) {
                    eunVar = null;
                } else {
                    Uri uriFromFile = Uri.fromFile(file);
                    try {
                        eunVar = ((ContentResolver) ((kwq) obj).a).openInputStream(uriFromFile);
                    } catch (NullPointerException e2) {
                        throw ((FileNotFoundException) new FileNotFoundException(a.bX(uriFromFile, obj2, "NPE opening uri: ", " -> ")).initCause(e2));
                    }
                }
            } else {
                eunVar = null;
            }
            if (eunVar != null) {
                Object obj4 = this.b;
                inputStreamOpenInputStream = ((ContentResolver) ((kwq) obj4).a).openInputStream((Uri) this.c);
                iE = ept.e(((kwq) obj4).b, inputStreamOpenInputStream, (ewv) ((kwq) obj4).d);
                if (inputStreamOpenInputStream != null) {
                    inputStreamOpenInputStream.close();
                }
            } else {
                iE = -1;
            }
            if (iE != -1) {
                eunVar = new eun(eunVar, iE);
            }
            this.a = eunVar;
            eugVar.b(eunVar);
        } catch (FileNotFoundException e3) {
            eugVar.e(e3);
        }
    }

    @Override // defpackage.euh
    public final int g() {
        return 1;
    }

    public eyi(File file, eyj eyjVar, int i) {
        this.$cid = i;
        this.b = file;
        this.c = eyjVar;
    }

    @Override // defpackage.euh
    public final void gI() {
    }
}
