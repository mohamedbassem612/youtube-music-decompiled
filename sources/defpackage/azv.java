package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class azv {
    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    public static void b(View view, int i) {
        view.setImportantForAutofill(8);
    }

    public static bhi c(String str) {
        str.getClass();
        return new bhi(str);
    }

    public static bhi d(String str) {
        str.getClass();
        return new bhi(str);
    }

    public static bhi e(String str) {
        str.getClass();
        return new bhi(str);
    }

    public static bhi f(String str) {
        str.getClass();
        return new bhi(str);
    }

    public static bhi g(String str) {
        str.getClass();
        return new bhi(str);
    }

    public static Method h() {
        return (Method) dpl.d.a();
    }

    public static Method i() {
        return (Method) dpl.c.a();
    }

    public static dpl j(heg hegVar, SQLiteDatabase sQLiteDatabase) {
        hegVar.getClass();
        Object obj = hegVar.a;
        if (obj != null) {
            dpl dplVar = (dpl) obj;
            if (awrc.c(dplVar.e, sQLiteDatabase)) {
                return dplVar;
            }
        }
        dpl dplVar2 = new dpl(sQLiteDatabase);
        hegVar.a = dplVar2;
        return dplVar2;
    }
}
