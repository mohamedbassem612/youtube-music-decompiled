package defpackage;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bzt implements bzv {
    public static final String[] a = {"id", "key", "metadata"};
    public final bxo b;
    public final SparseArray c = new SparseArray();
    public String d;
    public String e;

    public bzt(bxo bxoVar) {
        this.b = bxoVar;
    }

    public static String a(String str) {
        return "ExoPlayerCacheIndex".concat(String.valueOf(str));
    }

    public static void b(bxo bxoVar, String str) throws bxn {
        try {
            String strA = a(str);
            SQLiteDatabase writableDatabase = bxoVar.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                bxq.b(writableDatabase, 1, str);
                i(writableDatabase, strA);
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new bxn(e);
        }
    }

    private final void h(SQLiteDatabase sQLiteDatabase, bzs bzsVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bzy bzyVar = bzsVar.e;
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        Set<Map.Entry> setEntrySet = bzyVar.b.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(bzsVar.a));
        contentValues.put("key", bzsVar.b);
        contentValues.put("metadata", byteArray);
        String str = this.e;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }

    private static void i(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str));
    }

    public final void c(SQLiteDatabase sQLiteDatabase) throws bxn {
        String str = this.d;
        str.getClass();
        bxq.c(sQLiteDatabase, 1, str);
        String str2 = this.e;
        str2.getClass();
        i(sQLiteDatabase, str2);
        sQLiteDatabase.execSQL("CREATE TABLE " + this.e + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    @Override // defpackage.bzv
    public final void d(bzs bzsVar) {
        this.c.put(bzsVar.a, bzsVar);
    }

    @Override // defpackage.bzv
    public final void e(HashMap map) throws bxn {
        try {
            SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                c(writableDatabase);
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    h(writableDatabase, (bzs) it.next());
                }
                writableDatabase.setTransactionSuccessful();
                this.c.clear();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new bxn(e);
        }
    }

    @Override // defpackage.bzv
    public final boolean f() throws bxn {
        try {
            SQLiteDatabase readableDatabase = this.b.getReadableDatabase();
            String str = this.d;
            str.getClass();
            return bxq.a(readableDatabase, 1, str) != -1;
        } catch (SQLException e) {
            throw new bxn(e);
        }
    }

    @Override // defpackage.bzv
    public final void g() throws bxn {
        SparseArray sparseArray = this.c;
        if (sparseArray.size() != 0) {
            try {
                SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i = 0; i < sparseArray.size(); i++) {
                    try {
                        bzs bzsVar = (bzs) sparseArray.valueAt(i);
                        if (bzsVar == null) {
                            int iKeyAt = sparseArray.keyAt(i);
                            String str = this.e;
                            str.getClass();
                            writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                        } else {
                            h(writableDatabase, bzsVar);
                        }
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                sparseArray.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e) {
                throw new bxn(e);
            }
        }
    }
}
