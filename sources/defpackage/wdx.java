package defpackage;

import android.database.Cursor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wdx implements wdy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ web a;

    public /* synthetic */ wdx(web webVar, int i) {
        this.$cid = i;
        this.a = webVar;
    }

    @Override // defpackage.wdy
    public final Object a(Cursor cursor) {
        int i = this.$cid;
        web webVar = this.a;
        if (i != 0) {
            return webVar.a(cursor);
        }
        ahfi ahfiVarB = wff.b();
        ahfiVarB.a = webVar.a(cursor);
        ahfiVarB.l(web.b(cursor));
        ahfiVarB.k(web.e(cursor));
        return ahfiVarB.j();
    }
}
