package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pzd implements pzb {
    private static final agsn a = agsn.h("GnpSdk");
    private final Context b;

    public pzd(Context context) {
        this.b = context;
    }

    private final synchronized pzc c(plx plxVar) {
        return new pzc(this.b, plxVar != null ? plxVar.a : -1L);
    }

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x008b: MOVE (r6 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:140), block:B:29:0x008b */
    @Override // defpackage.pzb
    public final int a(plx plxVar, String str) throws Throwable {
        SQLiteDatabase writableDatabase;
        Cursor cursorQuery;
        Cursor cursor;
        int i = -2;
        Cursor cursor2 = null;
        cursor2 = null;
        try {
            try {
                writableDatabase = c(plxVar).getWritableDatabase();
                try {
                    tld tldVar = new tld();
                    tldVar.A("thread_id");
                    tldVar.B("=?", str);
                    qoe qoeVarZ = tldVar.z();
                    cursorQuery = writableDatabase.query("thread_surveys", null, qoeVarZ.a, qoeVarZ.a(), null, null, null, null);
                    try {
                        if (cursorQuery.moveToFirst()) {
                            i = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("view_index"));
                        }
                    } catch (RuntimeException e) {
                        e = e;
                        ((agsj) ((agsj) ((agsj) a.b()).j(e)).k("com/google/android/libraries/notifications/plugins/feedback/data/impl/ChimeThreadSurveyStorageImpl", "getSurveyState", 64, "ChimeThreadSurveyStorageImpl.java")).E("Error retrieving survey state for account ID %s, %s %s", plxVar != null ? String.valueOf(plxVar.a) : null, "thread_id", str);
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    cursorQuery = null;
                } catch (Throwable th) {
                    th = th;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
            }
        } catch (RuntimeException e3) {
            e = e3;
            writableDatabase = null;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            writableDatabase = null;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        if (writableDatabase != null) {
            writableDatabase.close();
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:29:? A[SYNTHETIC] */
    @Override // defpackage.pzb
    public final pfm b(plx plxVar, String str, int i) throws Throwable {
        Throwable th;
        SQLiteDatabase writableDatabase;
        pfm pfmVar;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            writableDatabase = c(plxVar).getWritableDatabase();
            try {
                try {
                    ContentValues contentValues = new ContentValues(2);
                    contentValues.put("thread_id", str);
                    contentValues.put("view_index", Integer.valueOf(i));
                    writableDatabase.insertWithOnConflict("thread_surveys", null, contentValues, 5);
                    pfmVar = pfm.a;
                } catch (RuntimeException e) {
                    e = e;
                    ((agsj) ((agsj) ((agsj) a.b()).j(e)).k("com/google/android/libraries/notifications/plugins/feedback/data/impl/ChimeThreadSurveyStorageImpl", "setSurveyState", 98, "ChimeThreadSurveyStorageImpl.java")).G("Error inserting survey state %s %s for account ID %s %s %s", "view_index", Integer.valueOf(i), plxVar != null ? String.valueOf(plxVar.a) : null, "thread_id", str);
                    pfmVar = pfm.d;
                }
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = writableDatabase;
                if (sQLiteDatabase != null) {
                    throw th;
                }
                sQLiteDatabase.close();
                throw th;
            }
        } catch (RuntimeException e2) {
            e = e2;
            writableDatabase = null;
        } catch (Throwable th3) {
            th = th3;
            if (sQLiteDatabase != null) {
                throw th;
            }
            sQLiteDatabase.close();
            throw th;
        }
        if (writableDatabase != null) {
            writableDatabase.close();
        }
        return pfmVar;
    }
}
