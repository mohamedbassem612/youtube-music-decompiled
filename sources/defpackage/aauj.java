package defpackage;

import android.database.sqlite.SQLiteAbortException;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteBindOrColumnIndexOutOfRangeException;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDatatypeMismatchException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteMisuseException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.database.sqlite.SQLiteReadOnlyDatabaseException;
import android.database.sqlite.SQLiteTableLockedException;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aauj {
    private static final HashMap a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put(SQLiteAbortException.class, aoel.DB_EXCEPTION_TYPE_SQLITE_ABORT_EXCEPTION);
        map.put(SQLiteAccessPermException.class, aoel.DB_EXCEPTION_TYPE_SQLITE_ACCESS_PERM_EXCEPTION);
        map.put(SQLiteBindOrColumnIndexOutOfRangeException.class, aoel.DB_EXCEPTION_TYPE_SQLITE_BIND_OR_COLUMN_INDEX_OUT_OF_RANGE_EXCEPTION);
        map.put(SQLiteBlobTooBigException.class, aoel.DB_EXCEPTION_TYPE_SQLITE_BLOB_TOO_BIG_EXCEPTION);
        map.put(SQLiteCantOpenDatabaseException.class, aoel.DB_EXCEPTION_TYPE_SQLITE_CANT_OPEN_DATABASE_EXCEPTION);
        map.put(SQLiteConstraintException.class, aoel.DB_EXCEPTION_TYPE_SQLITE_CONSTRAINT_EXCEPTION);
        map.put(SQLiteDatabaseCorruptException.class, aoel.DB_EXCEPTION_TYPE_SQLITE_DATABASE_CORRUPT_EXCEPTION);
        map.put(SQLiteDatabaseLockedException.class, aoel.DB_EXCEPTION_TYPE_SQLITE_DATABASE_LOCKED_EXCEPTION);
        map.put(SQLiteDatatypeMismatchException.class, aoel.DB_EXCEPTION_TYPE_SQLITE_DATATYPE_MISMATCH_EXCEPTION);
        map.put(SQLiteDiskIOException.class, aoel.DB_EXCEPTION_TYPE_SQLITE_DISK_IO_EXCEPTION);
        map.put(SQLiteDoneException.class, aoel.DB_EXCEPTION_TYPE_SQLITE_DONE_EXCEPTION);
        map.put(SQLiteFullException.class, aoel.DB_EXCEPTION_TYPE_SQLITE_FULL_EXCEPTION);
        map.put(SQLiteMisuseException.class, aoel.DB_EXCEPTION_TYPE_SQLITE_MISUSE_EXCEPTION);
        map.put(SQLiteOutOfMemoryException.class, aoel.DB_EXCEPTION_TYPE_SQLITE_OUT_OF_MEMORY_EXCEPTION);
        map.put(SQLiteReadOnlyDatabaseException.class, aoel.DB_EXCEPTION_TYPE_SQLITE_READ_ONLY_DATABASE_EXCEPTION);
        map.put(SQLiteTableLockedException.class, aoel.DB_EXCEPTION_TYPE_SQLITE_TABLE_LOCKED_EXCEPTION);
    }

    public static aoel a(Exception exc) {
        HashMap map = a;
        Class<?> cls = exc.getClass();
        return map.containsKey(cls) ? (aoel) map.get(cls) : aoel.DB_EXCEPTION_TYPE_UNKNOWN;
    }
}
