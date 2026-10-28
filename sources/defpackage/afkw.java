package defpackage;

import android.content.ContentProviderClient;
import android.database.Cursor;
import android.database.CursorWrapper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afkw extends CursorWrapper {
    private final ContentProviderClient a;
    private int b;

    public afkw(Cursor cursor, ContentProviderClient contentProviderClient) {
        super(cursor);
        this.b = -1;
        this.a = contentProviderClient;
    }

    private final int a() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        int count = getCount();
        this.b = count;
        return count;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Exception {
        try {
            getWrappedCursor().close();
        } finally {
            aewp.c(this.a);
        }
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getCount() {
        int count = super.getCount();
        this.b = count;
        return count;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean move(int i) {
        int position = getPosition() + i;
        if (super.move(i)) {
            return true;
        }
        if (position < -1 || position > a()) {
            return false;
        }
        throw new afkz();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToFirst() {
        if (super.moveToFirst()) {
            return true;
        }
        if (a() == 0) {
            return false;
        }
        throw new afkz();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToLast() {
        if (super.moveToLast()) {
            return true;
        }
        if (a() == 0) {
            return false;
        }
        throw new afkz();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToNext() {
        if (super.moveToNext()) {
            return true;
        }
        if (isAfterLast()) {
            return false;
        }
        throw new afkz();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPosition(int i) {
        if (super.moveToPosition(i)) {
            return true;
        }
        if (i < 0 || i >= a()) {
            return false;
        }
        throw new afkz();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPrevious() {
        if (super.moveToPrevious()) {
            return true;
        }
        if (isBeforeFirst()) {
            return false;
        }
        throw new afkz();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean requery() {
        boolean zRequery = super.requery();
        if (zRequery) {
            getCount();
        }
        return zRequery;
    }

    public final String toString() {
        return getWrappedCursor().toString();
    }
}
