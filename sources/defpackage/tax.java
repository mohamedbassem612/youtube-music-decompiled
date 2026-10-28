package defpackage;

import android.database.Cursor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class tax implements tbf {
    final /* synthetic */ Cursor a;
    final /* synthetic */ tbb b;

    public tax(tbb tbbVar, Cursor cursor) {
        this.a = cursor;
        this.b = tbbVar;
    }

    @Override // defpackage.tbf
    public final void a() {
        Cursor cursor = this.a;
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Cursor cursor = this.a;
        if (cursor != null && !cursor.isClosed() && cursor.getCount() > 0 && !cursor.isLast()) {
            return true;
        }
        a();
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Cursor cursor = this.a;
        cursor.moveToNext();
        return this.b.b(cursor.getBlob(0));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
