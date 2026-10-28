package defpackage;

import android.database.Cursor;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aafz {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/database/OfflineVideoCursorReader");

    public static final aamo a(Cursor cursor, aalf aalfVar, axfd axfdVar, int i, int i2, int i3, int i4, int i5) {
        abuz abuzVar;
        aaok aaokVarB = null;
        if (cursor.isNull(i) && i5 >= 0) {
            String string = cursor.getString(i5);
            aihf aihfVarCreateBuilder = aohb.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aohb aohbVar = (aohb) aihfVarCreateBuilder.instance;
            string.getClass();
            aohbVar.b |= 1;
            aohbVar.c = string;
            return new aamo((aohb) aihfVarCreateBuilder.build(), true, (abuz) null, (aaok) null);
        }
        String string2 = cursor.getString(i);
        aihf aihfVarCreateBuilder2 = aohb.a.createBuilder();
        try {
            aihfVarCreateBuilder2.mergeFrom(cursor.getBlob(i2), ExtensionRegistryLite.getGeneratedRegistry());
        } catch (aiik e) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineVideoCursorReader", "readVideoInPlace", 'R', "OfflineVideoCursorReader.java")).w("Error loading proto for videoId=[%s]", string2);
            aihfVarCreateBuilder2 = aohb.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            aohb aohbVar2 = (aohb) aihfVarCreateBuilder2.instance;
            string2.getClass();
            aohbVar2.b |= 1;
            aohbVar2.c = string2;
        }
        boolean zE = tbd.e(cursor, i3, false);
        aohb aohbVar3 = (aohb) aihfVarCreateBuilder2.instance;
        if ((aohbVar3.b & 2) != 0) {
            aqmh aqmhVar = aohbVar3.d;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
            abuzVar = aalfVar.w(string2, new abuz(aajg.f(aqmhVar, agke.r(240, 480))));
        } else {
            abuzVar = new abuz();
        }
        String string3 = cursor.getString(i4);
        if (string3 != null && axfdVar != null) {
            aaokVarB = axfdVar.v(string3);
        }
        if (aaokVarB == null) {
            aodw aodwVar = ((aohb) aihfVarCreateBuilder2.instance).e;
            if (aodwVar == null) {
                aodwVar = aodw.a;
            }
            aaokVarB = aaok.b(aodwVar);
        }
        return new aamo((aohb) aihfVarCreateBuilder2.build(), zE, abuzVar, aaokVarB);
    }

    public static final List b(Cursor cursor, aalf aalfVar, axfd axfdVar, int i, int i2, int i3, int i4, int i5) {
        ArrayList arrayList = new ArrayList(cursor.getCount());
        while (cursor.moveToNext()) {
            arrayList.add(a(cursor, aalfVar, axfdVar, i, i2, i3, i4, i5));
        }
        return arrayList;
    }
}
