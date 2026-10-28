package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pfp implements pfk {
    private static final agsn a = agsn.h("GnpSdk");
    private final Context b;
    private final HashMap c = new HashMap();

    public pfp(Context context) {
        this.b = context;
    }

    private final synchronized pfo e(plx plxVar) {
        HashMap map;
        Long lValueOf;
        long j = plxVar != null ? plxVar.a : -1L;
        map = this.c;
        lValueOf = Long.valueOf(j);
        if (!map.containsKey(lValueOf)) {
            map.put(lValueOf, new pfo(this.b, j));
        }
        return (pfo) map.get(lValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006a A[Catch: all -> 0x0079, PHI: r1 r7
      0x006a: PHI (r1v5 pfj) = (r1v9 pfj), (r1v8 pfj) binds: [B:18:0x0068, B:9:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x006a: PHI (r7v8 android.database.sqlite.SQLiteDatabase) = (r7v7 android.database.sqlite.SQLiteDatabase), (r7v10 android.database.sqlite.SQLiteDatabase) binds: [B:18:0x0068, B:9:0x003e] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0079, blocks: (B:19:0x006a, B:25:0x0073, B:26:0x0076), top: B:33:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0073 A[Catch: all -> 0x0079, TRY_ENTER, TryCatch #3 {all -> 0x0079, blocks: (B:19:0x006a, B:25:0x0073, B:26:0x0076), top: B:33:0x0004 }] */
    @Override // defpackage.pfk
    public final synchronized pfj a(plx plxVar, int i, byte[] bArr) {
        Throwable th;
        RuntimeException e;
        SQLiteDatabase writableDatabase;
        pfj pfjVarG;
        SQLiteDatabase sQLiteDatabase = null;
        pfjVarG = null;
        pfjVarG = null;
        try {
            try {
                ContentValues contentValues = new ContentValues(2);
                contentValues.put("job_type", Integer.valueOf(i));
                contentValues.put("payload", bArr);
                writableDatabase = e(plxVar).getWritableDatabase();
                try {
                    try {
                        long jInsert = writableDatabase.insert("tasks", null, contentValues);
                        if (jInsert > 0) {
                            ahsk ahskVar = new ahsk();
                            ahskVar.h(jInsert);
                            ahskVar.i(i);
                            ahskVar.j(bArr);
                            pfjVarG = ahskVar.g();
                            if (writableDatabase != null) {
                                writableDatabase.close();
                            }
                        } else if (writableDatabase != null) {
                            writableDatabase.close();
                        }
                    } catch (RuntimeException e2) {
                        e = e2;
                        ((agsj) ((agsj) ((agsj) a.b()).j(e)).k("com/google/android/libraries/notifications/internal/storage/impl/ChimeTaskDataStorageImpl", "insertTaskData", 70, "ChimeTaskDataStorageImpl.java")).u("Error inserting ChimeTaskData %d for account", i);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = writableDatabase;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        } catch (RuntimeException e3) {
            e = e3;
            writableDatabase = null;
        } catch (Throwable th4) {
            th = th4;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
        return pfjVarG;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b8 A[Catch: all -> 0x00c3, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:19:0x00aa, B:21:0x00af, B:27:0x00b8, B:29:0x00bd, B:30:0x00c0), top: B:37:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00bd A[Catch: all -> 0x00c3, TryCatch #1 {, blocks: (B:3:0x0001, B:19:0x00aa, B:21:0x00af, B:27:0x00b8, B:29:0x00bd, B:30:0x00c0), top: B:37:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:43:? A[Catch: all -> 0x00c3, SYNTHETIC, TryCatch #1 {, blocks: (B:3:0x0001, B:19:0x00aa, B:21:0x00af, B:27:0x00b8, B:29:0x00bd, B:30:0x00c0), top: B:37:0x0001 }] */
    @Override // defpackage.pfk
    public final synchronized List b(plx plxVar, int i) {
        ArrayList arrayList;
        Throwable th;
        SQLiteDatabase readableDatabase;
        RuntimeException runtimeException;
        tld tldVar = new tld();
        tldVar.B("job_type=?", Integer.toString(i));
        qoe qoeVarZ = tldVar.z();
        arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            readableDatabase = e(plxVar).getReadableDatabase();
            try {
                try {
                    cursorQuery = readableDatabase.query("tasks", null, qoeVarZ.a, qoeVarZ.a(), null, null, "_id ASC", null);
                    while (cursorQuery.moveToNext()) {
                        ahsk ahskVar = new ahsk();
                        ahskVar.h(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id")));
                        ahskVar.i(cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("job_type")));
                        ahskVar.j(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("payload")));
                        arrayList.add(ahskVar.g());
                    }
                } catch (RuntimeException e) {
                    runtimeException = e;
                    ((agsj) ((agsj) ((agsj) a.b()).j(runtimeException)).k("com/google/android/libraries/notifications/internal/storage/impl/ChimeTaskDataStorageImpl", "executeQuery", 129, "ChimeTaskDataStorageImpl.java")).B("Error getting ChimeTaskData for account. Query: %s %s", qoeVarZ.a, Arrays.toString(qoeVarZ.a()));
                }
            } catch (Throwable th2) {
                th = th2;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (readableDatabase != null) {
                    throw th;
                }
                readableDatabase.close();
                throw th;
            }
        } catch (RuntimeException e2) {
            runtimeException = e2;
            readableDatabase = null;
        } catch (Throwable th3) {
            th = th3;
            readableDatabase = null;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (readableDatabase != null) {
                throw th;
            }
            readableDatabase.close();
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        if (readableDatabase != null) {
            readableDatabase.close();
        }
        return arrayList;
    }

    @Override // defpackage.pfk
    public final void c(plx plxVar) {
        try {
            this.b.deleteDatabase(e(plxVar).getDatabaseName());
        } catch (RuntimeException e) {
            ((agsj) ((agsj) ((agsj) a.b()).j(e)).k("com/google/android/libraries/notifications/internal/storage/impl/ChimeTaskDataStorageImpl", "deleteDatabase", 104, "ChimeTaskDataStorageImpl.java")).t("Error deleting database for account");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pfk
    public final synchronized void d(plx plxVar, List list) {
        if (!list.isEmpty()) {
            String[] strArr = new String[list.size()];
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                strArr[i] = Long.toString(((pfj) it.next()).a);
                i++;
            }
            SQLiteDatabase writableDatabase = null;
            agke agkeVarD = pfx.d(null, "_id", strArr);
            try {
                try {
                    writableDatabase = e(plxVar).getWritableDatabase();
                    writableDatabase.beginTransaction();
                    try {
                        agqs agqsVarListIterator = agkeVarD.listIterator(0);
                        while (agqsVarListIterator.hasNext()) {
                            qoe qoeVar = (qoe) agqsVarListIterator.next();
                            writableDatabase.delete("tasks", qoeVar.a, qoeVar.a());
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (0 != 0) {
                        writableDatabase.close();
                    }
                    throw th2;
                }
            } catch (RuntimeException e) {
                ((agsj) ((agsj) ((agsj) a.b()).j(e)).k("com/google/android/libraries/notifications/internal/storage/impl/ChimeTaskDataStorageImpl", "executeDelete", 159, "ChimeTaskDataStorageImpl.java")).t("Error deleting ChimeTaskData for account");
            }
            if (writableDatabase != null) {
                writableDatabase.close();
            }
        }
    }
}
