package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aart implements aary {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/transfer/base/SQLiteTransfersDbHelper");
    private static final String[] c = {"file_path", "status", "status_reason", "bytes_transferred", "bytes_total", "extras", "output_extras", "accountname", "priority", "failure_count"};
    SQLiteDatabase b;
    private final Context d;
    private final Object e;

    public aart(Context context) {
        Object obj = new Object();
        this.d = context;
        this.e = obj;
    }

    private static aaro a(Cursor cursor) {
        aqpc aqpcVar;
        int columnIndex = cursor.getColumnIndex("file_path");
        int columnIndex2 = cursor.getColumnIndex("status");
        int columnIndex3 = cursor.getColumnIndex("status_reason");
        int columnIndex4 = cursor.getColumnIndex("bytes_transferred");
        int columnIndex5 = cursor.getColumnIndex("bytes_total");
        int columnIndex6 = cursor.getColumnIndex("extras");
        int columnIndex7 = cursor.getColumnIndex("output_extras");
        int columnIndex8 = cursor.getColumnIndex("accountname");
        int columnIndex9 = cursor.getColumnIndex("priority");
        int columnIndex10 = cursor.getColumnIndex("failure_count");
        String string = cursor.getString(columnIndex);
        int i = afxw.f()[cursor.getInt(columnIndex2)];
        int i2 = cursor.getInt(columnIndex3);
        long j = cursor.getLong(columnIndex4);
        long j2 = cursor.getLong(columnIndex5);
        aamv aamvVar = new aamv(cursor.getBlob(columnIndex6));
        aamv aamvVar2 = new aamv(cursor.getBlob(columnIndex7));
        String string2 = cursor.getString(columnIndex8);
        int i3 = cursor.getInt(columnIndex9);
        int i4 = cursor.getInt(columnIndex10);
        long j3 = aarq.a;
        aamvVar.p();
        aaro aaroVar = new aaro(string2, string, i3, aamvVar, i4);
        int i5 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i5 == 0) {
            aqpcVar = aqpc.TRANSFER_STATE_TRANSFER_IN_QUEUE;
        } else if (i5 == 1) {
            aqpcVar = aqpc.TRANSFER_STATE_TRANSFERRING;
        } else if (i5 == 2) {
            aqpcVar = aqpc.TRANSFER_STATE_COMPLETE;
        } else if (i5 == 3) {
            aqpcVar = aqpc.TRANSFER_STATE_FAILED;
        } else if (i5 == 4) {
            aqpcVar = aqpc.TRANSFER_STATE_PAUSED_BY_USER;
        } else {
            if (i5 != 5) {
                throw new RuntimeException(null, null);
            }
            aqpcVar = aqpc.TRANSFER_STATE_WAITING_FOR_PLAYER_RESPONSE_REFRESH;
        }
        aaroVar.j = aqpcVar;
        aaroVar.b = i2;
        aaroVar.d = j2;
        aaroVar.c = j;
        aaroVar.f = aamvVar2;
        return aaroVar;
    }

    private static void k() {
        ((agrc) ((agrc) ((agrc) a.b()).j(new NullPointerException())).k("com/google/android/libraries/youtube/offline/transfer/base/SQLiteTransfersDbHelper", "logClosedDatabaseError", (char) 555, "SQLiteTransfersDbHelper.java")).t("[Offline] Attempting to access closed or null database.");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025 A[PHI: r3
      0x0025: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:5:0x0017, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    private static final ContentValues l(aaro aaroVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("file_path", aaroVar.a);
        int iOrdinal = aaroVar.j.ordinal();
        int i = 3;
        if (iOrdinal != 3) {
            int i2 = 5;
            if (iOrdinal == 4) {
                i = i2;
            } else if (iOrdinal != 5) {
                i2 = 6;
                if (iOrdinal != 6) {
                    if (iOrdinal != 7) {
                        i = 1;
                    } else {
                        i = i2;
                    }
                }
            } else {
                i = 4;
            }
        } else {
            i = 2;
        }
        contentValues.put("status", Integer.valueOf(i - 1));
        contentValues.put("status_reason", Integer.valueOf(aaroVar.b));
        contentValues.put("bytes_transferred", Long.valueOf(aaroVar.c));
        contentValues.put("bytes_total", Long.valueOf(aaroVar.d));
        aamb aambVar = aaroVar.e;
        if (aambVar instanceof aamv) {
            contentValues.put("extras", ((aamv) aambVar).g());
        }
        aamb aambVar2 = aaroVar.f;
        if (aambVar2 instanceof aamv) {
            contentValues.put("output_extras", ((aamv) aambVar2).g());
        }
        contentValues.put("accountname", aaroVar.g);
        contentValues.put("priority", Integer.valueOf(aaroVar.h));
        contentValues.put("failure_count", Integer.valueOf(aaroVar.i));
        return contentValues;
    }

    @Override // defpackage.aary
    public final agev b(String str) {
        aaro aaroVarA;
        if (this.b == null) {
            k();
            return agdf.a;
        }
        synchronized (this.e) {
            Cursor cursorQuery = this.b.query("transfers", c, "file_path=?", new String[]{str}, null, null, null);
            try {
                aaroVarA = cursorQuery.moveToNext() ? a(cursorQuery) : null;
                cursorQuery.close();
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        return agev.h(aaroVarA);
    }

    @Override // defpackage.aary
    public final String c() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = c;
        sb.append("Table: transfers\n");
        if (this.b == null) {
            k();
        } else {
            synchronized (this.e) {
                Cursor cursorQuery = this.b.query("transfers", strArr, null, null, null, null, null);
                try {
                    DatabaseUtils.dumpCursor(cursorQuery, sb);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable th) {
                    if (cursorQuery == null) {
                        throw th;
                    }
                    try {
                        cursorQuery.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    @Override // defpackage.aary
    public final List d(zwa zwaVar) {
        String strK = zwaVar.k();
        ArrayList arrayList = new ArrayList();
        if (this.b == null) {
            k();
        } else {
            synchronized (this.e) {
                Cursor cursorQuery = this.b.query("transfers", c, "accountname=?", new String[]{strK}, null, null, null);
                while (cursorQuery.moveToNext()) {
                    try {
                        arrayList.add(a(cursorQuery));
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                }
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    @Override // defpackage.aary
    public final void e(aaro aaroVar) {
        h(aaroVar);
    }

    @Override // defpackage.aary
    public final void f(aaro aaroVar) {
        synchronized (this.e) {
            SQLiteDatabase sQLiteDatabase = this.b;
            if (sQLiteDatabase == null) {
                k();
            } else {
                sQLiteDatabase.insert("transfers", null, l(aaroVar));
            }
        }
    }

    @Override // defpackage.aary
    public final void g() {
        boolean z;
        Object obj = this.e;
        synchronized (obj) {
            synchronized (obj) {
                try {
                    SQLiteDatabase sQLiteDatabase = this.b;
                    z = false;
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (!z) {
            this.b = new aars(this.d).getWritableDatabase();
        }
    }

    @Override // defpackage.aary
    public final void h(aaro aaroVar) {
        i(aaroVar.a);
    }

    @Override // defpackage.aary
    public final void i(String str) {
        synchronized (this.e) {
            SQLiteDatabase sQLiteDatabase = this.b;
            if (sQLiteDatabase == null) {
                k();
            } else {
                sQLiteDatabase.delete("transfers", "file_path = ?", new String[]{str});
            }
        }
    }

    @Override // defpackage.aary
    public final void j(aaro aaroVar) {
        synchronized (this.e) {
            SQLiteDatabase sQLiteDatabase = this.b;
            if (sQLiteDatabase == null) {
                k();
            } else {
                sQLiteDatabase.update("transfers", l(aaroVar), "file_path = ?", new String[]{aaroVar.a});
            }
        }
    }
}
