package defpackage;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class itx implements ahdf {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ itx(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v24, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v26, types: [awqk, java.lang.Object] */
    @Override // defpackage.ahdf
    public final Object a(ahud ahudVar, Object obj) {
        int i;
        int i2 = this.$cid;
        if (i2 == 0) {
            Cursor cursor = (Cursor) obj;
            if (cursor == null) {
                return agpi.a;
            }
            iuf iufVar = (iuf) this.a;
            jkm jkmVar = new jkm(cursor, new isn(iufVar.b, ((hcb) iufVar.j.io()).c(), iufVar.n.l(263, 45828915L, false)));
            try {
                return agke.o(jkmVar);
            } finally {
                jku.b(jkmVar);
            }
        }
        if (i2 == 1) {
            Cursor cursor2 = (Cursor) obj;
            ArrayList arrayList = new ArrayList();
            if (cursor2 != null) {
                while (cursor2.moveToNext()) {
                    String string = cursor2.getString(cursor2.getColumnIndexOrThrow("title"));
                    String string2 = cursor2.getString(cursor2.getColumnIndexOrThrow("artist"));
                    String string3 = cursor2.getString(cursor2.getColumnIndexOrThrow("duration"));
                    long j = TextUtils.isEmpty(string3) ? 0L : Long.parseLong(string3);
                    String string4 = cursor2.getString(cursor2.getColumnIndexOrThrow("_data"));
                    atvx atvxVar = new atvx();
                    atvxVar.l(string);
                    atvxVar.j(string2);
                    atvxVar.k(j / 1000);
                    atvxVar.i(string4);
                    arrayList.add(atvxVar.h());
                }
            }
            Object obj2 = this.a;
            isw iswVar = new isw();
            iswVar.b(((anuk) obj2).getTitle());
            iswVar.c(arrayList);
            return iswVar.a();
        }
        if (i2 == 2) {
            Cursor cursor3 = (Cursor) obj;
            Object obj3 = this.a;
            if (cursor3 == null) {
                ((iuf) obj3).m = 3;
                return Boolean.FALSE;
            }
            i = true == cursor3.moveToFirst() ? 2 : 3;
            ((iuf) obj3).m = i;
            return Boolean.valueOf(i == 2);
        }
        if (i2 == 3) {
            Cursor cursor4 = (Cursor) obj;
            Object obj4 = this.a;
            if (cursor4 == null) {
                ((iuf) obj4).l = 3;
                return Boolean.FALSE;
            }
            i = true == cursor4.moveToFirst() ? 2 : 3;
            ((iuf) obj4).l = i;
            return Boolean.valueOf(i == 2);
        }
        if (i2 == 4) {
            return web.f((Cursor) obj, (String) this.a, new wdw(0));
        }
        if (i2 != 5) {
            syn synVar = afnp.m;
            ahudVar.getClass();
            return this.a.invoke(ahudVar, obj);
        }
        syn synVar2 = afnp.m;
        ahudVar.getClass();
        return this.a.invoke(ahudVar, obj);
    }
}
