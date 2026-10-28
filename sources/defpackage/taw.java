package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class taw extends tbi {
    private final agke a;
    private final boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public taw(Context context, String str, List list, boolean z) {
        super(context, str, list.size());
        context.getClass();
        list.getClass();
        this.a = agke.n(list);
        this.b = z;
    }

    @Override // defpackage.tbi
    protected final tbh a(int i) {
        return (tbh) this.a.get(i);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        if (!this.b) {
            sQLiteDatabase.disableWriteAheadLogging();
        } else if (sQLiteDatabase.enableWriteAheadLogging()) {
            sQLiteDatabase.execSQL("PRAGMA synchronous = NORMAL");
        }
    }
}
