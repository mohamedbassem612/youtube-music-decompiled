package defpackage;

import android.database.Cursor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wdw implements wdy {
    private final /* synthetic */ int $cid;

    @Override // defpackage.wdy
    public final Object a(Cursor cursor) {
        return this.$cid != 0 ? web.e(cursor) : web.b(cursor);
    }
}
