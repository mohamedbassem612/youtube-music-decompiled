package defpackage;

import android.database.Cursor;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aaff {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/database/OfflinePlaylistCursorReader");

    static final aamh a(Cursor cursor, aalf aalfVar, axfd axfdVar, int i, int i2, int i3, int i4, int i5) {
        aofu aofuVar;
        String string = cursor.getString(i);
        try {
            aofuVar = (aofu) aihn.parseFrom(aofu.a, cursor.getBlob(i2), ExtensionRegistryLite.getGeneratedRegistry());
        } catch (aiik e) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflinePlaylistCursorReader", "readPlaylistInPlace", 'D', "OfflinePlaylistCursorReader.java")).w("Error loading proto for playlistId=[%s]", string);
            aihf aihfVarCreateBuilder = aofu.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aofu aofuVar2 = (aofu) aihfVarCreateBuilder.instance;
            string.getClass();
            aofuVar2.b |= 1;
            aofuVar2.c = string;
            aofuVar = (aofu) aihfVarCreateBuilder.build();
        }
        boolean zE = tbd.e(cursor, i3, false);
        int i6 = cursor.getInt(i4);
        String string2 = cursor.getString(i5);
        aodw aodwVar = null;
        aaok aaokVarV = (string2 == null || axfdVar == null) ? null : axfdVar.v(string2);
        if (aaokVarV == null) {
            if ((aofuVar.b & 16) != 0 && (aodwVar = aofuVar.e) == null) {
                aodwVar = aodw.a;
            }
            aaokVarV = aaok.b(aodwVar);
        }
        aqmh aqmhVar = aofuVar.d;
        if (aqmhVar == null) {
            aqmhVar = aqmh.a;
        }
        return aamh.c(aofuVar, zE, i6, aalfVar.v(string, new abuz(aajg.f(aqmhVar, agke.q(480)))), aaokVarV);
    }

    static final List b(Cursor cursor, aalf aalfVar, axfd axfdVar, int i, int i2, int i3, int i4, int i5) {
        ArrayList arrayList = new ArrayList(cursor.getCount());
        while (cursor.moveToNext()) {
            arrayList.add(a(cursor, aalfVar, axfdVar, i, i2, i3, i4, i5));
        }
        return arrayList;
    }
}
