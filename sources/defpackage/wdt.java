package defpackage;

import android.database.Cursor;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wdt implements ahdf {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wdt(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [afvl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12, types: [ahdf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ahdf
    public final Object a(ahud ahudVar, Object obj) {
        int i = this.$cid;
        int i2 = 0;
        if (i == 0) {
            return (wff) web.f((Cursor) obj, (String) this.b, new wdx((web) this.a, i2)).orElse(wff.a);
        }
        if (i == 1) {
            Cursor cursor = (Cursor) obj;
            if (cursor == null) {
                return agpi.a;
            }
            ?? r8 = this.b;
            iuf iufVar = (iuf) this.a;
            ((hcb) iufVar.j.io()).c();
            jkm jkmVar = new jkm(cursor, new isn(iufVar.b, (Map) r8, iufVar.n.l(263, 45828915L, false)));
            try {
                return agke.o(jkmVar);
            } finally {
                jku.b(jkmVar);
            }
        }
        ?? r0 = this.a;
        long j = afwl.a;
        ahudVar.getClass();
        afvh afvhVarA = afty.a();
        afvl afvlVarE = afty.e(afvhVarA, r0);
        try {
            Object objA = this.b.a(ahudVar, obj);
            afty.e(afvhVarA, afvlVarE);
            return objA;
        } catch (Throwable th) {
            try {
                aftt.a(th);
                throw th;
            } catch (Throwable th2) {
                afty.e(afvhVarA, afvlVarE);
                throw th2;
            }
        }
    }
}
