package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class itw implements ahdf {
    private final /* synthetic */ int $cid;

    public /* synthetic */ itw(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ahdf
    public final Object a(ahud ahudVar, Object obj) {
        z = false;
        z = false;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                return null;
            case 1:
                return hmy.R((Cursor) obj);
            case 2:
                Cursor cursor = (Cursor) obj;
                HashMap map = new HashMap();
                if (cursor == null) {
                    return agkj.h(map);
                }
                while (cursor.moveToNext()) {
                    map.put(String.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow("_id"))), cursor.getString(cursor.getColumnIndexOrThrow("name")));
                }
                return agkj.h(map);
            case 3:
                Cursor cursor2 = (Cursor) obj;
                if (cursor2 == null) {
                    return 0;
                }
                return Integer.valueOf(cursor2.moveToFirst() ? cursor2.getInt(0) : 0);
            case 4:
                return null;
            case 5:
                Cursor cursor3 = (Cursor) obj;
                if (cursor3 != null && cursor3.moveToFirst() && cursor3.getCount() > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                return null;
            case 7:
                Cursor cursor4 = (Cursor) obj;
                if (cursor4 == null) {
                    return agpi.a;
                }
                ArrayList arrayList = new ArrayList(cursor4.getCount());
                int columnIndex = cursor4.getColumnIndex("_id");
                while (cursor4.moveToNext()) {
                    arrayList.add(Long.valueOf(cursor4.getLong(columnIndex)));
                }
                return agke.n(arrayList);
            case 8:
                return null;
            case 9:
                return null;
            case 10:
                Cursor cursor5 = (Cursor) obj;
                HashMap map2 = new HashMap();
                if (cursor5 == null) {
                    return map2;
                }
                while (cursor5.moveToNext()) {
                    String strValueOf = String.valueOf(cursor5.getInt(cursor5.getColumnIndexOrThrow("_id")));
                    String string = cursor5.getString(cursor5.getColumnIndexOrThrow("album_art"));
                    if (string != null) {
                        map2.put(strValueOf, string);
                    }
                }
                return map2;
            default:
                return hmy.R((Cursor) obj);
        }
    }
}
