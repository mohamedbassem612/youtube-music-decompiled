package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dpy extends dqa {
    public int[] a;
    public long[] b;
    public double[] c;
    public String[] d;
    public byte[][] e;
    private Cursor i;

    public dpy(dpd dpdVar, String str) {
        super(dpdVar, str);
        this.a = new int[0];
        this.b = new long[0];
        this.c = new double[0];
        this.d = new String[0];
        this.e = new byte[0][];
    }

    private final Cursor q() {
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor;
        }
        wf.g(21, "no row");
        throw new awmh();
    }

    private final void r(int i, int i2) {
        int[] iArr = this.a;
        int i3 = i2 + 1;
        if (iArr.length < i3) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i3);
            iArrCopyOf.getClass();
            this.a = iArrCopyOf;
        }
        if (i == 1) {
            long[] jArr = this.b;
            if (jArr.length < i3) {
                long[] jArrCopyOf = Arrays.copyOf(jArr, i3);
                jArrCopyOf.getClass();
                this.b = jArrCopyOf;
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.c;
            if (dArr.length < i3) {
                double[] dArrCopyOf = Arrays.copyOf(dArr, i3);
                dArrCopyOf.getClass();
                this.c = dArrCopyOf;
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.d;
            if (strArr.length < i3) {
                Object[] objArrCopyOf = Arrays.copyOf(strArr, i3);
                objArrCopyOf.getClass();
                this.d = (String[]) objArrCopyOf;
                return;
            }
            return;
        }
        if (i == 4) {
            byte[][] bArr = this.e;
            if (bArr.length < i3) {
                Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i3);
                objArrCopyOf2.getClass();
                this.e = (byte[][]) objArrCopyOf2;
            }
        }
    }

    private final void s() {
        if (this.i == null) {
            dpd dpdVar = this.f;
            final dpx dpxVar = new dpx(this);
            final awqm awqmVar = new awqm() { // from class: dpj
                @Override // defpackage.awqm
                public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
                    SQLiteCursorDriver sQLiteCursorDriver = (SQLiteCursorDriver) obj2;
                    String str = (String) obj3;
                    SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                    String[] strArr = dpl.a;
                    sQLiteQuery.getClass();
                    dpr dprVar = new dpr(sQLiteQuery);
                    dpy dpyVar = ((dpx) dpxVar).a;
                    int length = dpyVar.a.length;
                    for (int i = 1; i < length; i++) {
                        int i2 = dpyVar.a[i];
                        if (i2 == 1) {
                            dprVar.c(i, dpyVar.b[i]);
                        } else if (i2 == 2) {
                            dprVar.b(i, dpyVar.c[i]);
                        } else if (i2 == 3) {
                            String str2 = dpyVar.d[i];
                            str2.getClass();
                            dprVar.e(i, str2);
                        } else if (i2 == 4) {
                            byte[] bArr = dpyVar.e[i];
                            bArr.getClass();
                            dprVar.a(i, bArr);
                        } else if (i2 == 5) {
                            dprVar.d(i);
                        }
                    }
                    return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
                }
            };
            Cursor cursorRawQueryWithFactory = ((dpl) dpdVar).e.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: dpk
                /* JADX WARN: Type inference failed for: r1v2, types: [android.database.Cursor, java.lang.Object] */
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    String[] strArr = dpl.a;
                    return awqmVar.a(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                }
            }, dpxVar.a.g, dpl.b, null);
            cursorRawQueryWithFactory.getClass();
            this.i = cursorRawQueryWithFactory;
        }
    }

    private static final void t(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            wf.g(25, "column index out of range");
            throw new awmh();
        }
    }

    @Override // defpackage.dpb
    public final int a() {
        o();
        s();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.dpb
    public final long b(int i) {
        o();
        Cursor cursorQ = q();
        t(cursorQ, i);
        return cursorQ.getLong(i);
    }

    @Override // defpackage.dpb
    public final String c(int i) {
        o();
        s();
        Cursor cursor = this.i;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        t(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // defpackage.dpb, java.lang.AutoCloseable
    public final void close() {
        if (!this.h) {
            o();
            this.a = new int[0];
            this.b = new long[0];
            this.c = new double[0];
            this.d = new String[0];
            this.e = new byte[0][];
            j();
        }
        p();
    }

    @Override // defpackage.dpb
    public final String d(int i) {
        o();
        Cursor cursorQ = q();
        t(cursorQ, i);
        String string = cursorQ.getString(i);
        string.getClass();
        return string;
    }

    @Override // defpackage.dpb
    public final void e(int i, byte[] bArr) {
        bArr.getClass();
        o();
        r(4, i);
        this.a[i] = 4;
        this.e[i] = bArr;
    }

    @Override // defpackage.dpb
    public final void f(int i, double d) {
        o();
        r(2, i);
        this.a[i] = 2;
        this.c[i] = d;
    }

    @Override // defpackage.dpb
    public final void g(int i, long j) {
        o();
        r(1, i);
        this.a[i] = 1;
        this.b[i] = j;
    }

    @Override // defpackage.dpb
    public final void h(int i) {
        o();
        r(5, i);
        this.a[i] = 5;
    }

    @Override // defpackage.dpb
    public final void i(int i, String str) {
        str.getClass();
        o();
        r(3, i);
        this.a[i] = 3;
        this.d[i] = str;
    }

    @Override // defpackage.dpb
    public final void j() {
        o();
        Cursor cursor = this.i;
        if (cursor != null) {
            cursor.close();
        }
        this.i = null;
    }

    @Override // defpackage.dpb
    public final boolean k(int i) {
        o();
        Cursor cursorQ = q();
        t(cursorQ, i);
        return cursorQ.isNull(i);
    }

    @Override // defpackage.dpb
    public final boolean l() {
        o();
        s();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // defpackage.dpb
    public final byte[] m(int i) {
        o();
        Cursor cursorQ = q();
        t(cursorQ, i);
        byte[] blob = cursorQ.getBlob(i);
        blob.getClass();
        return blob;
    }
}
