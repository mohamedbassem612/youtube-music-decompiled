package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class tbb implements tbg {
    public final tbc b;
    public final String c;
    private static final agrf d = agrf.h("com/google/android/libraries/youtube/common/database/BasicKeyValueStore");
    public static final tbh a = new rmq(11);

    public tbb(tbc tbcVar, String str) {
        tbcVar.getClass();
        this.b = tbcVar;
        this.c = str;
    }

    private final Cursor p(int i) {
        String databaseName;
        String str;
        Cursor cursorQuery = this.b.getReadableDatabase().query(this.c, new String[]{"value", "key"}, null, null, null, null, "sortingValue ASC, insertionOrder ASC", i > 0 ? String.valueOf(i) : null);
        try {
            cursorQuery.getCount();
            return cursorQuery;
        } catch (SQLException e) {
            tbc tbcVar = this.b;
            if (tbcVar instanceof tbi) {
                tbi tbiVar = (tbi) tbcVar;
                databaseName = tbiVar.getDatabaseName();
                File fileB = tbiVar.b();
                if (fileB == null) {
                    str = " is null";
                } else if (fileB.exists()) {
                    str = !fileB.canRead() ? String.format("%s is not readable", fileB.getAbsolutePath()) : String.format("%s is readable", fileB.getAbsolutePath());
                } else {
                    str = String.format("%s doesn't exist", fileB.getAbsolutePath());
                }
            } else {
                databaseName = "";
                str = "";
            }
            throw new tay(String.format(Locale.US, "%s trying to access db %s: %s", e.toString(), databaseName, str));
        }
    }

    protected abstract long a(Object obj);

    protected abstract Object b(byte[] bArr);

    public final void c(boolean z) {
        if (z) {
            taq.c();
        }
        this.b.getWritableDatabase().beginTransaction();
    }

    public final void d(boolean z) {
        if (z) {
            taq.c();
        }
        this.b.getWritableDatabase().endTransaction();
    }

    public final void e(ContentValues contentValues) {
        this.b.getWritableDatabase().insert(this.c, null, contentValues);
    }

    public final void f(boolean z) {
        if (z) {
            taq.c();
        }
        this.b.getWritableDatabase().setTransactionSuccessful();
    }

    public final void g(String str, Object obj) {
        o(new tld(str, obj), true);
    }

    public final void h(String str, ContentValues contentValues) {
        this.b.getWritableDatabase().update(this.c, contentValues, "key = ?", new String[]{str});
    }

    protected abstract byte[] i(Object obj);

    public final void j(String str) {
        taq.c();
        this.b.getWritableDatabase().delete(this.c, "key = ?", new String[]{str});
    }

    public final void k(Collection collection) {
        taq.c();
        if (collection.isEmpty()) {
            return;
        }
        int size = collection.size();
        Iterator it = collection.iterator();
        int i = 0;
        do {
            int iMin = Math.min(500, size - i);
            c(false);
            StringBuilder sb = new StringBuilder("(");
            String[] strArr = new String[iMin];
            for (int i2 = 0; i2 < iMin; i2++) {
                strArr[i2] = (String) it.next();
                sb.append('?');
                if (i2 == iMin - 1) {
                    sb.append(')');
                } else {
                    sb.append(", ");
                }
            }
            try {
                this.b.getWritableDatabase().delete(this.c, a.co(sb, "key IN "), strArr);
                f(false);
                d(false);
                i += iMin;
            } catch (Throwable th) {
                d(false);
                throw th;
            }
        } while (i < size);
    }

    public final tbf l(int i) {
        Cursor cursorP;
        taq.c();
        try {
            cursorP = p(i);
        } catch (IllegalStateException e) {
            ((agrc) ((agrc) ((agrc) d.b()).j(e)).k("com/google/android/libraries/youtube/common/database/BasicKeyValueStore", "loadAll", (char) 415, "BasicKeyValueStore.java")).t("Failed to read values from database.");
            cursorP = null;
        }
        return new tax(this, cursorP);
    }

    @Override // defpackage.tbg
    public final tbf m() {
        return l(0);
    }

    public final ContentValues n(tld tldVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", (String) tldVar.a);
        Object obj = tldVar.b;
        contentValues.put("value", i(obj));
        contentValues.put("sortingValue", Long.valueOf(a(obj)));
        return contentValues;
    }

    public final void o(tld tldVar, boolean z) {
        Object objB;
        if (z) {
            taq.c();
        }
        c(z);
        try {
            ContentValues contentValuesN = n(tldVar);
            Object obj = tldVar.a;
            if (z) {
                taq.c();
            }
            Cursor cursorQuery = this.b.getReadableDatabase().query(this.c, new String[]{"value"}, "key=?", new String[]{(String) obj}, null, null, null, null);
            if (cursorQuery.moveToNext()) {
                objB = b(cursorQuery.getBlob(0));
                cursorQuery.close();
            } else {
                cursorQuery.close();
                objB = null;
            }
            if (objB == null) {
                e(contentValuesN);
            } else {
                h((String) obj, contentValuesN);
            }
            f(z);
        } finally {
            d(z);
        }
    }
}
