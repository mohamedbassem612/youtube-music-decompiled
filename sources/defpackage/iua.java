package defpackage;

import android.database.Cursor;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iua implements agek {
    private final /* synthetic */ int $cid;

    public /* synthetic */ iua(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        boolean z = false;
        switch (this.$cid) {
            case 0:
                Integer num = (Integer) obj;
                if (num.intValue() > 1) {
                    ((agrc) ((agrc) iuf.a.b().i(agso.a, "SideloadedStore")).k("com/google/android/apps/youtube/music/sideloaded/store/AsyncSideloadedStore", "updatePlaylistNameInMediaStore", 1928, "AsyncSideloadedStore.java")).w("renamePlaylist affected %d rows", num);
                }
                return Boolean.valueOf(num.intValue() > 0);
            case 1:
                return null;
            case 2:
                return agpi.a;
            case 3:
                return agpi.a;
            case 4:
                return Boolean.FALSE;
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                Long l = (Long) obj;
                if (l.longValue() > 0) {
                    return ixt.q(String.valueOf(l));
                }
                return null;
            case 8:
                return Boolean.FALSE;
            case 9:
                return null;
            case 10:
                return null;
            case 11:
                return agpi.a;
            case 12:
                return (agke) Collection.EL.stream((agke) obj).map(new itm(16)).collect(aghu.a);
            case 13:
                Integer num2 = (Integer) obj;
                if (num2.intValue() > 1) {
                    ((agrc) ((agrc) iuo.a.b().i(agso.a, "SideloadedStore")).k("com/google/android/apps/youtube/music/sideloaded/store/DefaultSideloadedStore", "updatePlaylistNameInMediaStore", 1792, "DefaultSideloadedStore.java")).w("renamePlaylist affected %d rows", num2);
                }
                return Boolean.valueOf(num2.intValue() > 0);
            case 14:
                Cursor cursor = (Cursor) obj;
                HashMap map = new HashMap();
                if (cursor == null) {
                    return agkj.h(map);
                }
                while (cursor.moveToNext()) {
                    map.put(String.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow("_id"))), cursor.getString(cursor.getColumnIndexOrThrow("name")));
                }
                return agkj.h(map);
            case 15:
                Long l2 = (Long) obj;
                if (l2.longValue() > 0) {
                    return ixt.q(String.valueOf(l2));
                }
                return null;
            case 16:
                Cursor cursor2 = (Cursor) obj;
                HashMap map2 = new HashMap();
                while (cursor2.moveToNext()) {
                    try {
                        map2.put(String.valueOf(cursor2.getInt(cursor2.getColumnIndex("_id"))), cursor2.getString(cursor2.getColumnIndex("album_art")));
                    } catch (Throwable th) {
                        jku.b(cursor2);
                        throw th;
                    }
                }
                jku.b(cursor2);
                return map2;
            case 17:
                Cursor cursor3 = (Cursor) obj;
                try {
                    if (cursor3.moveToFirst() && cursor3.getCount() > 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                } finally {
                    jku.b(cursor3);
                }
            case 18:
                Cursor cursor4 = (Cursor) obj;
                if (cursor4 == null) {
                    return agpi.a;
                }
                ArrayList arrayList = new ArrayList(cursor4.getCount());
                try {
                    int columnIndex = cursor4.getColumnIndex("_id");
                    while (cursor4.moveToNext()) {
                        arrayList.add(Long.valueOf(cursor4.getLong(columnIndex)));
                    }
                    jku.b(cursor4);
                    return agke.n(arrayList);
                } catch (Throwable th2) {
                    jku.b(cursor4);
                    throw th2;
                }
            case 19:
                Integer num3 = (Integer) obj;
                if (num3.intValue() > 1) {
                    ((agrc) ((agrc) iuo.a.b().i(agso.a, "SideloadedStore")).k("com/google/android/apps/youtube/music/sideloaded/store/DefaultSideloadedStore", "deletePlaylistFromMediaStore", 1318, "DefaultSideloadedStore.java")).w("deletePlaylist deleted %d rows", num3);
                }
                return Boolean.valueOf(num3.intValue() > 0);
            default:
                Optional optionalOfNullable = (Optional) obj;
                anqm anqmVar = jks.a;
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable(((anqk) optionalOfNullable.get()).getViewMode());
                }
                return (anqm) optionalOfNullable.orElse(jks.a);
        }
    }
}
