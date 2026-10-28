package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bqe extends bqd {
    private final bqf k;
    private Uri l;
    private String[] m;
    private String n;
    private Cursor o;
    private CancellationSignal p;

    public bqe(Context context, Uri uri, String[] strArr) {
        super(context);
        this.k = new bqf(this);
        this.l = uri;
        this.m = strArr;
        this.n = "title != ''";
    }

    @Override // defpackage.bqd
    public final /* bridge */ /* synthetic */ Object a() {
        synchronized (this) {
            if (this.b != null) {
                throw new aws();
            }
            this.p = new CancellationSignal();
        }
        try {
            try {
                Cursor cursorQuery = this.d.getContentResolver().query(this.l, this.m, this.n, null, null, this.p);
                if (cursorQuery != null) {
                    try {
                        cursorQuery.getCount();
                        cursorQuery.registerContentObserver(this.k);
                    } catch (RuntimeException e) {
                        cursorQuery.close();
                        throw e;
                    }
                }
                synchronized (this) {
                    this.p = null;
                }
                return cursorQuery;
            } catch (Exception e2) {
                if (e2 instanceof OperationCanceledException) {
                    throw new aws();
                }
                throw e2;
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.p = null;
                throw th;
            }
        }
    }

    @Override // defpackage.bqd
    public final void b() {
        synchronized (this) {
            CancellationSignal cancellationSignal = this.p;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
        }
    }

    @Override // defpackage.bqd, defpackage.bqg
    @Deprecated
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.d(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.l);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.m));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.n);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString((Object[]) null));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println((String) null);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.o);
    }

    @Override // defpackage.bqd
    public final /* bridge */ /* synthetic */ void f(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    @Override // defpackage.bqg
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void j(Cursor cursor) {
        if (this.g) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.o;
        this.o = cursor;
        if (this.e) {
            super.j(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // defpackage.bqg
    public final void k() {
        h();
        Cursor cursor = this.o;
        if (cursor != null && !cursor.isClosed()) {
            this.o.close();
        }
        this.o = null;
    }

    @Override // defpackage.bqg
    public final void l() {
        Cursor cursor = this.o;
        if (cursor != null) {
            j(cursor);
        }
        boolean z = this.h;
        this.h = false;
        this.i |= z;
        if (z || this.o == null) {
            g();
        }
    }

    @Override // defpackage.bqg
    public final void m() {
        h();
    }

    public bqe(Context context) {
        super(context);
        this.k = new bqf(this);
    }
}
