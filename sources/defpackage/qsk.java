package defpackage;

import android.database.sqlite.SQLiteException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qsk extends SQLiteException {
    public qsk(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
