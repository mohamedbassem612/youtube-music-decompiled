package defpackage;

import android.database.Cursor;
import java.io.Closeable;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jkm implements Closeable, Iterator, awrp {
    private final Cursor a;
    private final jkt b;

    public jkm(Cursor cursor, jkt jktVar) {
        this.a = cursor;
        this.b = jktVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Cursor cursor = this.a;
        return (cursor.isLast() || cursor.isAfterLast()) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Cursor cursor = this.a;
        if (cursor.moveToNext()) {
            return this.b.a(cursor);
        }
        throw new NoSuchElementException("next() called on exhausted Cursor");
    }
}
