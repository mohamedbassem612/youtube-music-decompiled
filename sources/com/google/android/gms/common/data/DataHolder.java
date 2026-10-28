package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import defpackage.kpm;
import defpackage.kry;
import defpackage.ksy;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class DataHolder extends kry implements Closeable {
    public static final Parcelable.Creator CREATOR = new kpm(2);
    final int a;
    public final String[] b;
    public Bundle c;
    public final CursorWindow[] d;
    public final int e;
    public final Bundle f;
    public int[] g;
    int h = 1;
    private final boolean i = true;

    static {
        new ArrayList();
        new HashMap();
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.a = i;
        this.b = strArr;
        this.d = cursorWindowArr;
        this.e = i2;
        this.f = bundle;
    }

    public final void a() {
        synchronized (this) {
            int i = this.h - 1;
            this.h = i;
            if (i == 0) {
                for (CursorWindow cursorWindow : this.d) {
                    cursorWindow.releaseReference();
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    protected final void finalize() throws Throwable {
        int i;
        try {
            if (this.i && this.d.length > 0) {
                synchronized (this) {
                    i = this.h;
                }
                if (i > 0) {
                    synchronized (this) {
                        if (this.h > 1) {
                            this.h = 1;
                        }
                        a();
                    }
                    Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ')');
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String[] strArr = this.b;
        int iG = ksy.g(parcel, 20293);
        ksy.C(parcel, 1, strArr);
        ksy.E(parcel, 2, this.d, i);
        ksy.l(parcel, 3, this.e);
        ksy.p(parcel, 4, this.f);
        ksy.l(parcel, 1000, this.a);
        ksy.h(parcel, iG);
        if ((i & 1) != 0) {
            a();
        }
    }
}
