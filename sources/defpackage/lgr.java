package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lgr extends lbc {
    public static final String[] a = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    private final lgq b;
    private boolean c;

    public lgr(ldr ldrVar) {
        super(ldrVar);
        this.b = new lgq(this, aS());
    }

    @Override // defpackage.lbc
    protected final boolean f() {
        return false;
    }

    public final SQLiteDatabase s() {
        if (this.c) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.c = true;
        return null;
    }

    public final void t() {
        int iDelete;
        o();
        try {
            SQLiteDatabase sQLiteDatabaseS = s();
            if (sQLiteDatabaseS == null || (iDelete = sQLiteDatabaseS.delete("messages", null, null)) <= 0) {
                return;
            }
            aT().k.b("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e) {
            aT().c.b("Error resetting local analytics data. error", e);
        }
    }

    final boolean u() {
        return aS().getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0131 A[PHI: r7 r9
      0x0131: PHI (r7v5 int) = (r7v3 int), (r7v3 int), (r7v6 int) binds: [B:57:0x0103, B:74:0x012f, B:65:0x0113] A[DONT_GENERATE, DONT_INLINE]
      0x0131: PHI (r9v8 android.database.sqlite.SQLiteDatabase) = 
      (r9v6 android.database.sqlite.SQLiteDatabase)
      (r9v7 android.database.sqlite.SQLiteDatabase)
      (r9v9 android.database.sqlite.SQLiteDatabase)
     binds: [B:57:0x0103, B:74:0x012f, B:65:0x0113] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x013c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0141  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    public final boolean v(int i, byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseS;
        ?? RawQuery;
        o();
        ?? r2 = 0;
        if (this.c) {
            return false;
        }
        lbt lbtVarG = G();
        adam adamVar = lcl.aO;
        ?? r4 = 0;
        r4 = 0;
        lbg lbgVarU = lbtVarG.F(null, adamVar) ? h().u(null) : null;
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("entry", bArr);
        if (G().F(null, adamVar) && lbgVarU != null) {
            contentValues.put("app_version", lbgVarU.c);
            contentValues.put("app_version_int", Long.valueOf(lbgVarU.j));
        }
        int i2 = 0;
        int i3 = 5;
        for (int i4 = 5; i2 < i4; i4 = 5) {
            try {
                sQLiteDatabaseS = s();
                if (sQLiteDatabaseS == null) {
                    this.c = true;
                    return r2;
                }
                try {
                    sQLiteDatabaseS.beginTransaction();
                    RawQuery = sQLiteDatabaseS.rawQuery("select count(1) from messages", null);
                    long j = 0;
                    if (RawQuery != 0) {
                        try {
                            if (RawQuery.moveToFirst()) {
                                j = RawQuery.getLong(r2);
                            }
                        } catch (SQLiteDatabaseLockedException unused) {
                            SystemClock.sleep(i3);
                            i3 += 20;
                            if (RawQuery != 0) {
                                RawQuery.close();
                            }
                            if (sQLiteDatabaseS != null) {
                                sQLiteDatabaseS.close();
                            }
                            i2++;
                            r2 = 0;
                        } catch (SQLiteFullException e) {
                            e = e;
                            aT().c.b("Error writing entry; local database full", e);
                            this.c = true;
                            if (RawQuery != 0) {
                                RawQuery.close();
                            }
                            if (sQLiteDatabaseS != null) {
                                sQLiteDatabaseS.close();
                            }
                            i2++;
                            r2 = 0;
                        } catch (SQLiteException e2) {
                            e = e2;
                            if (sQLiteDatabaseS != null) {
                                try {
                                    if (sQLiteDatabaseS.inTransaction()) {
                                        sQLiteDatabaseS.endTransaction();
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    r4 = RawQuery;
                                    if (r4 != 0) {
                                        r4.close();
                                    }
                                    if (sQLiteDatabaseS != null) {
                                        sQLiteDatabaseS.close();
                                    }
                                    throw th;
                                }
                            }
                            aT().c.b("Error writing entry to local database", e);
                            this.c = true;
                            if (RawQuery != 0) {
                                RawQuery.close();
                            }
                            if (sQLiteDatabaseS != null) {
                                sQLiteDatabaseS.close();
                            }
                            i2++;
                            r2 = 0;
                        }
                    }
                    if (j >= 100000) {
                        aT().c.a("Data loss, local db full");
                        long j2 = 100001 - j;
                        long jDelete = sQLiteDatabaseS.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                        if (jDelete != j2) {
                            aT().c.d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                        }
                    }
                    sQLiteDatabaseS.insertOrThrow("messages", null, contentValues);
                    sQLiteDatabaseS.setTransactionSuccessful();
                    sQLiteDatabaseS.endTransaction();
                    if (RawQuery != 0) {
                        RawQuery.close();
                    }
                    sQLiteDatabaseS.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused2) {
                    RawQuery = 0;
                } catch (SQLiteFullException e3) {
                    e = e3;
                    RawQuery = 0;
                } catch (SQLiteException e4) {
                    e = e4;
                    RawQuery = 0;
                } catch (Throwable th2) {
                    th = th2;
                    if (r4 != 0) {
                        r4.close();
                    }
                    if (sQLiteDatabaseS != null) {
                        sQLiteDatabaseS.close();
                    }
                    throw th;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                sQLiteDatabaseS = null;
                RawQuery = 0;
            } catch (SQLiteFullException e5) {
                e = e5;
                sQLiteDatabaseS = null;
                RawQuery = 0;
            } catch (SQLiteException e6) {
                e = e6;
                sQLiteDatabaseS = null;
                RawQuery = 0;
            } catch (Throwable th3) {
                th = th3;
                sQLiteDatabaseS = null;
            }
        }
        aT().k.a("Failed to write entry to local database");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:187:0x02e1 A[Catch: all -> 0x030b, TryCatch #30 {all -> 0x030b, blocks: (B:31:0x00b2, B:33:0x00b8, B:35:0x00cf, B:185:0x02db, B:187:0x02e1, B:188:0x02e4, B:207:0x0314, B:196:0x02fe, B:137:0x0261, B:139:0x026b, B:140:0x0276), top: B:239:0x02db }] */
    /* JADX WARN: Code duplicated, block: B:190:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:199:0x0305  */
    /* JADX WARN: Code duplicated, block: B:209:0x0322  */
    /* JADX WARN: Code duplicated, block: B:211:0x0327 A[PHI: r2 r11 r13 r17
      0x0327: PHI (r2v11 int) = (r2v5 int), (r2v7 int), (r2v12 int) binds: [B:191:0x02f5, B:210:0x0325, B:200:0x0308] A[DONT_GENERATE, DONT_INLINE]
      0x0327: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v4 int) binds: [B:191:0x02f5, B:210:0x0325, B:200:0x0308] A[DONT_GENERATE, DONT_INLINE]
      0x0327: PHI (r13v11 ??) = (r13v7 ??), (r13v9 ??), (r13v12 ??) binds: [B:191:0x02f5, B:210:0x0325, B:200:0x0308] A[DONT_GENERATE, DONT_INLINE]
      0x0327: PHI (r17v8 java.lang.String) = (r17v3 java.lang.String), (r17v5 java.lang.String), (r17v9 java.lang.String) binds: [B:191:0x02f5, B:210:0x0325, B:200:0x0308] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:214:0x0335  */
    /* JADX WARN: Code duplicated, block: B:216:0x033a  */
    /* JADX WARN: Code duplicated, block: B:239:0x02db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x032a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x032a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x032a A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v12, types: [lbt] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v16, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r17v48 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String, java.util.List] */
    public final List w() {
        Cursor cursor;
        ?? r13;
        ?? S;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        long j;
        ?? r17;
        ?? r16;
        long j2;
        String str;
        adam adamVar;
        int i;
        int i2;
        lfy lfyVar;
        lcc lccVar;
        lbq lbqVar;
        String str2 = "entry";
        o();
        ?? r6 = 0;
        if (this.c) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (u()) {
            int i3 = 0;
            int i4 = 5;
            int i5 = 0;
            for (int i6 = 5; i5 < i6; i6 = 5) {
                int i7 = 1;
                try {
                    S = s();
                    try {
                        if (S == 0) {
                            this.c = true;
                            return r6;
                        }
                        try {
                            S.beginTransaction();
                            try {
                                cursorQuery2 = S.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                try {
                                    long j3 = -1;
                                    if (cursorQuery2.moveToFirst()) {
                                        j = cursorQuery2.getLong(i3);
                                        if (cursorQuery2 != null) {
                                            cursorQuery2.close();
                                        }
                                    } else {
                                        if (cursorQuery2 != null) {
                                            cursorQuery2.close();
                                        }
                                        j = -1;
                                    }
                                    if (j != -1) {
                                        String[] strArr = new String[1];
                                        strArr[i3] = String.valueOf(j);
                                        r16 = "rowid<?";
                                        r17 = strArr;
                                    } else {
                                        ?? r18 = r6;
                                        r17 = r18;
                                        r16 = r18;
                                    }
                                    String[] strArr2 = {"rowid", "type", str2};
                                    ?? G = G();
                                    adam adamVar2 = lcl.aO;
                                    boolean zF = G.F(r6, adamVar2);
                                    int i8 = 4;
                                    int i9 = 3;
                                    int i10 = 2;
                                    if (zF) {
                                        strArr2 = new String[i6];
                                        strArr2[i3] = "rowid";
                                        strArr2[1] = "type";
                                        strArr2[2] = str2;
                                        strArr2[3] = "app_version";
                                        strArr2[4] = "app_version_int";
                                    }
                                    String[] strArr3 = strArr2;
                                    adam adamVar3 = adamVar2;
                                    cursorQuery = S.query("messages", strArr3, r16, r17, null, null, "rowid asc", "100");
                                    S = S;
                                    while (cursorQuery.moveToNext()) {
                                        try {
                                            j3 = cursorQuery.getLong(i3);
                                            int i11 = cursorQuery.getInt(i7);
                                            byte[] blob = cursorQuery.getBlob(i10);
                                            if (G().F(null, adamVar3)) {
                                                String string = cursorQuery.getString(i9);
                                                j2 = cursorQuery.getLong(i8);
                                                str = string;
                                            } else {
                                                j2 = 0;
                                                str = null;
                                            }
                                            ?? r19 = S;
                                            long j4 = j2;
                                            if (i11 == 0) {
                                                try {
                                                    try {
                                                        Parcel parcelObtain = Parcel.obtain();
                                                        adamVar = adamVar3;
                                                        try {
                                                            try {
                                                                parcelObtain.unmarshall(blob, i3, blob.length);
                                                                parcelObtain.setDataPosition(i3);
                                                                lcd lcdVar = (lcd) lcd.CREATOR.createFromParcel(parcelObtain);
                                                                parcelObtain.recycle();
                                                                if (lcdVar != null) {
                                                                    arrayList.add(new axnp(lcdVar, str, j4));
                                                                }
                                                            } catch (krz unused) {
                                                                aT().c.a("Failed to load event from local database");
                                                                parcelObtain.recycle();
                                                            }
                                                            str2 = str2;
                                                            i3 = i3;
                                                            i = 2;
                                                            i2 = 3;
                                                        } catch (Throwable th) {
                                                            parcelObtain.recycle();
                                                            throw th;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        S = r19;
                                                        cursor = cursorQuery;
                                                        r13 = S;
                                                        if (cursor != null) {
                                                            cursor.close();
                                                        }
                                                        if (r13 != 0) {
                                                            r13.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused2) {
                                                    str2 = str2;
                                                    i3 = i3;
                                                    S = r19;
                                                    SystemClock.sleep(i4);
                                                    i4 += 20;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (S != 0) {
                                                        S.close();
                                                    }
                                                    i5++;
                                                    i3 = i3;
                                                    str2 = str2;
                                                    r6 = 0;
                                                } catch (SQLiteFullException e) {
                                                    e = e;
                                                    str2 = str2;
                                                    i3 = i3;
                                                    S = r19;
                                                    aT().c.b("Error reading entries from local database", e);
                                                    this.c = true;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (S != 0) {
                                                        S.close();
                                                    }
                                                    i5++;
                                                    i3 = i3;
                                                    str2 = str2;
                                                    r6 = 0;
                                                } catch (SQLiteException e2) {
                                                    e = e2;
                                                    str2 = str2;
                                                    i3 = i3;
                                                    S = r19;
                                                    if (S != 0) {
                                                        try {
                                                            if (S.inTransaction()) {
                                                                S.endTransaction();
                                                            }
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            cursor = cursorQuery;
                                                            r13 = S;
                                                            if (cursor != null) {
                                                                cursor.close();
                                                            }
                                                            if (r13 != 0) {
                                                                r13.close();
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    aT().c.b("Error reading entries from local database", e);
                                                    this.c = true;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (S != 0) {
                                                        S.close();
                                                    }
                                                    i5++;
                                                    i3 = i3;
                                                    str2 = str2;
                                                    r6 = 0;
                                                }
                                            } else {
                                                adamVar = adamVar3;
                                                if (i11 == 1) {
                                                    try {
                                                        Parcel parcelObtain2 = Parcel.obtain();
                                                        try {
                                                            try {
                                                                parcelObtain2.unmarshall(blob, 0, blob.length);
                                                                parcelObtain2.setDataPosition(0);
                                                                lfyVar = (lfy) lfy.CREATOR.createFromParcel(parcelObtain2);
                                                                parcelObtain2.recycle();
                                                            } catch (Throwable th4) {
                                                                parcelObtain2.recycle();
                                                                throw th4;
                                                            }
                                                        } catch (krz unused3) {
                                                            aT().c.a("Failed to load user property from local database");
                                                            parcelObtain2.recycle();
                                                            lfyVar = null;
                                                        }
                                                        if (lfyVar != null) {
                                                            arrayList.add(new axnp(lfyVar, str, j4));
                                                        }
                                                        str2 = str2;
                                                        i = 2;
                                                        i3 = 0;
                                                        i2 = 3;
                                                    } catch (SQLiteDatabaseLockedException unused4) {
                                                        str2 = str2;
                                                        S = r19;
                                                        i3 = 0;
                                                        SystemClock.sleep(i4);
                                                        i4 += 20;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (S != 0) {
                                                            S.close();
                                                        }
                                                        i5++;
                                                        i3 = i3;
                                                        str2 = str2;
                                                        r6 = 0;
                                                    } catch (SQLiteFullException e3) {
                                                        e = e3;
                                                        str2 = str2;
                                                        S = r19;
                                                        i3 = 0;
                                                        aT().c.b("Error reading entries from local database", e);
                                                        this.c = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (S != 0) {
                                                            S.close();
                                                        }
                                                        i5++;
                                                        i3 = i3;
                                                        str2 = str2;
                                                        r6 = 0;
                                                    } catch (SQLiteException e4) {
                                                        e = e4;
                                                        str2 = str2;
                                                        S = r19;
                                                        i3 = 0;
                                                        if (S != 0) {
                                                            if (S.inTransaction()) {
                                                                S.endTransaction();
                                                            }
                                                        }
                                                        aT().c.b("Error reading entries from local database", e);
                                                        this.c = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (S != 0) {
                                                            S.close();
                                                        }
                                                        i5++;
                                                        i3 = i3;
                                                        str2 = str2;
                                                        r6 = 0;
                                                    }
                                                } else {
                                                    i = 2;
                                                    if (i11 == 2) {
                                                        Parcel parcelObtain3 = Parcel.obtain();
                                                        try {
                                                            str2 = str2;
                                                            try {
                                                                try {
                                                                    parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                    parcelObtain3.setDataPosition(0);
                                                                    lbqVar = (lbq) lbq.CREATOR.createFromParcel(parcelObtain3);
                                                                    try {
                                                                        parcelObtain3.recycle();
                                                                    } catch (SQLiteDatabaseLockedException unused5) {
                                                                        S = r19;
                                                                        i3 = 0;
                                                                        SystemClock.sleep(i4);
                                                                        i4 += 20;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (S != 0) {
                                                                            S.close();
                                                                        }
                                                                        i5++;
                                                                        i3 = i3;
                                                                        str2 = str2;
                                                                        r6 = 0;
                                                                    } catch (SQLiteFullException e5) {
                                                                        e = e5;
                                                                        S = r19;
                                                                        i3 = 0;
                                                                        aT().c.b("Error reading entries from local database", e);
                                                                        this.c = true;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (S != 0) {
                                                                            S.close();
                                                                        }
                                                                        i5++;
                                                                        i3 = i3;
                                                                        str2 = str2;
                                                                        r6 = 0;
                                                                    } catch (SQLiteException e6) {
                                                                        e = e6;
                                                                        S = r19;
                                                                        i3 = 0;
                                                                        if (S != 0) {
                                                                            if (S.inTransaction()) {
                                                                                S.endTransaction();
                                                                            }
                                                                        }
                                                                        aT().c.b("Error reading entries from local database", e);
                                                                        this.c = true;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (S != 0) {
                                                                            S.close();
                                                                        }
                                                                        i5++;
                                                                        i3 = i3;
                                                                        str2 = str2;
                                                                        r6 = 0;
                                                                    }
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                    parcelObtain3.recycle();
                                                                    throw th;
                                                                }
                                                            } catch (krz unused6) {
                                                                aT().c.a("Failed to load conditional user property from local database");
                                                                parcelObtain3.recycle();
                                                                lbqVar = null;
                                                            }
                                                        } catch (krz unused7) {
                                                            str2 = str2;
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            str2 = str2;
                                                        }
                                                        if (lbqVar != null) {
                                                            arrayList.add(new axnp(lbqVar, str, j4));
                                                        }
                                                        i3 = 0;
                                                        i2 = 3;
                                                    } else {
                                                        str2 = str2;
                                                        if (i11 == 4) {
                                                            try {
                                                                Parcel parcelObtain4 = Parcel.obtain();
                                                                try {
                                                                    i3 = 0;
                                                                    try {
                                                                        try {
                                                                            parcelObtain4.unmarshall(blob, 0, blob.length);
                                                                            parcelObtain4.setDataPosition(0);
                                                                            lccVar = (lcc) lcc.CREATOR.createFromParcel(parcelObtain4);
                                                                            try {
                                                                                parcelObtain4.recycle();
                                                                                if (lccVar != null) {
                                                                                    arrayList.add(new axnp(lccVar, str, j4));
                                                                                }
                                                                                i2 = 3;
                                                                            } catch (SQLiteDatabaseLockedException unused8) {
                                                                                S = r19;
                                                                                SystemClock.sleep(i4);
                                                                                i4 += 20;
                                                                                if (cursorQuery != null) {
                                                                                    cursorQuery.close();
                                                                                }
                                                                                if (S != 0) {
                                                                                    S.close();
                                                                                }
                                                                                i5++;
                                                                                i3 = i3;
                                                                                str2 = str2;
                                                                                r6 = 0;
                                                                            } catch (SQLiteFullException e7) {
                                                                                e = e7;
                                                                                S = r19;
                                                                                aT().c.b("Error reading entries from local database", e);
                                                                                this.c = true;
                                                                                if (cursorQuery != null) {
                                                                                    cursorQuery.close();
                                                                                }
                                                                                if (S != 0) {
                                                                                    S.close();
                                                                                }
                                                                                i5++;
                                                                                i3 = i3;
                                                                                str2 = str2;
                                                                                r6 = 0;
                                                                            } catch (SQLiteException e8) {
                                                                                e = e8;
                                                                                S = r19;
                                                                                if (S != 0) {
                                                                                    if (S.inTransaction()) {
                                                                                        S.endTransaction();
                                                                                    }
                                                                                }
                                                                                aT().c.b("Error reading entries from local database", e);
                                                                                this.c = true;
                                                                                if (cursorQuery != null) {
                                                                                    cursorQuery.close();
                                                                                }
                                                                                if (S != 0) {
                                                                                    S.close();
                                                                                }
                                                                                i5++;
                                                                                i3 = i3;
                                                                                str2 = str2;
                                                                                r6 = 0;
                                                                            }
                                                                        } catch (krz unused9) {
                                                                            aT().c.a("Failed to load default event parameters from local database");
                                                                            parcelObtain4.recycle();
                                                                            lccVar = null;
                                                                        }
                                                                    } catch (Throwable th7) {
                                                                        th = th7;
                                                                        parcelObtain4.recycle();
                                                                        throw th;
                                                                    }
                                                                } catch (krz unused10) {
                                                                    i3 = 0;
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    i3 = 0;
                                                                }
                                                            } catch (SQLiteDatabaseLockedException unused11) {
                                                                i3 = 0;
                                                            } catch (SQLiteFullException e9) {
                                                                e = e9;
                                                                i3 = 0;
                                                            } catch (SQLiteException e10) {
                                                                e = e10;
                                                                i3 = 0;
                                                            }
                                                        } else {
                                                            i3 = 0;
                                                            i2 = 3;
                                                            if (i11 == 3) {
                                                                aT().k.a("Skipping app launch break");
                                                            } else {
                                                                aT().c.a("Unknown record type in local database");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i3 = i3;
                                            i9 = i2;
                                            str2 = str2;
                                            S = r19;
                                            i7 = 1;
                                            i8 = 4;
                                            i10 = i;
                                            adamVar3 = adamVar;
                                        } catch (SQLiteDatabaseLockedException unused12) {
                                            str2 = str2;
                                            i3 = i3;
                                        } catch (SQLiteFullException e11) {
                                            e = e11;
                                            str2 = str2;
                                            i3 = i3;
                                        } catch (SQLiteException e12) {
                                            e = e12;
                                            str2 = str2;
                                            i3 = i3;
                                        }
                                    }
                                    str2 = str2;
                                    i3 = i3;
                                    S = S;
                                    try {
                                        if (S.delete("messages", "rowid <= ?", new String[]{Long.toString(j3)}) < arrayList.size()) {
                                            aT().c.a("Fewer entries removed from local database than expected");
                                        }
                                        S.setTransactionSuccessful();
                                        S.endTransaction();
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        S.close();
                                    } catch (SQLiteDatabaseLockedException unused13) {
                                        SystemClock.sleep(i4);
                                        i4 += 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (S != 0) {
                                            S.close();
                                        }
                                        i5++;
                                        i3 = i3;
                                        str2 = str2;
                                        r6 = 0;
                                    } catch (SQLiteFullException e13) {
                                        e = e13;
                                        aT().c.b("Error reading entries from local database", e);
                                        this.c = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (S != 0) {
                                            S.close();
                                        }
                                        i5++;
                                        i3 = i3;
                                        str2 = str2;
                                        r6 = 0;
                                    } catch (SQLiteException e14) {
                                        e = e14;
                                        if (S != 0) {
                                            if (S.inTransaction()) {
                                                S.endTransaction();
                                            }
                                        }
                                        aT().c.b("Error reading entries from local database", e);
                                        this.c = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (S != 0) {
                                            S.close();
                                        }
                                        i5++;
                                        i3 = i3;
                                        str2 = str2;
                                        r6 = 0;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    if (cursorQuery2 != null) {
                                        try {
                                            cursorQuery2.close();
                                        } catch (SQLiteDatabaseLockedException unused14) {
                                            cursorQuery = null;
                                            SystemClock.sleep(i4);
                                            i4 += 20;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (S != 0) {
                                                S.close();
                                            }
                                            i5++;
                                            i3 = i3;
                                            str2 = str2;
                                            r6 = 0;
                                        } catch (SQLiteFullException e15) {
                                            e = e15;
                                            cursorQuery = null;
                                            aT().c.b("Error reading entries from local database", e);
                                            this.c = true;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (S != 0) {
                                                S.close();
                                            }
                                            i5++;
                                            i3 = i3;
                                            str2 = str2;
                                            r6 = 0;
                                        } catch (SQLiteException e16) {
                                            e = e16;
                                            cursorQuery = null;
                                            if (S != 0) {
                                                if (S.inTransaction()) {
                                                    S.endTransaction();
                                                }
                                            }
                                            aT().c.b("Error reading entries from local database", e);
                                            this.c = true;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (S != 0) {
                                                S.close();
                                            }
                                            i5++;
                                            i3 = i3;
                                            str2 = str2;
                                            r6 = 0;
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                cursorQuery2 = null;
                            }
                        } catch (SQLiteDatabaseLockedException unused15) {
                            str2 = str2;
                            i3 = i3;
                        } catch (SQLiteFullException e17) {
                            e = e17;
                            str2 = str2;
                            i3 = i3;
                        } catch (SQLiteException e18) {
                            e = e18;
                            str2 = str2;
                            i3 = i3;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        cursor = null;
                        r13 = S;
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (r13 != 0) {
                            r13.close();
                        }
                        throw th;
                    }
                } catch (SQLiteDatabaseLockedException unused16) {
                    str2 = str2;
                    i3 = i3;
                    S = 0;
                } catch (SQLiteFullException e19) {
                    e = e19;
                    str2 = str2;
                    i3 = i3;
                    S = 0;
                } catch (SQLiteException e20) {
                    e = e20;
                    str2 = str2;
                    i3 = i3;
                    S = 0;
                } catch (Throwable th12) {
                    th = th12;
                    cursor = null;
                    r13 = 0;
                }
            }
            aT().f.a("Failed to read events from database in reasonable time");
            return null;
        }
        return arrayList;
    }

    /* JADX INFO: Removed unreachable split cross block B:37:0x0082 */
    /* JADX INFO: Removed unreachable split cross block B:40:0x0082 */
    /* JADX INFO: Removed unreachable split cross block B:42:0x0082 */
    public final void x() {
        o();
        if (this.c || !u()) {
            return;
        }
        int i = 5;
        for (int i2 = 0; i2 < 5; i2++) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseS = s();
                        if (sQLiteDatabaseS == null) {
                            this.c = true;
                            return;
                        }
                        sQLiteDatabaseS.beginTransaction();
                        sQLiteDatabaseS.delete("messages", "type == ?", new String[]{"3"});
                        sQLiteDatabaseS.setTransactionSuccessful();
                        sQLiteDatabaseS.endTransaction();
                        sQLiteDatabaseS.close();
                        return;
                    } catch (SQLiteException e) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        aT().c.b("Error deleting app launch break from local database", e);
                        this.c = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteFullException e2) {
                    aT().c.b("Error deleting app launch break from local database", e2);
                    this.c = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (SQLiteDatabaseLockedException unused) {
                SystemClock.sleep(i);
                i += 20;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        aT().f.a("Error deleting app launch break from local database in reasonable time");
    }
}
