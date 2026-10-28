package defpackage;

import android.database.Cursor;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaen {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/database/OfflineChannelCursorReader");

    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Object, java.util.List] */
    public static final aaok a(Cursor cursor, aalf aalfVar, int i, int i2) {
        String string = cursor.getString(i);
        aihf aihfVarCreateBuilder = aodw.a.createBuilder();
        try {
            aihfVarCreateBuilder.mergeFrom(cursor.getBlob(i2), ExtensionRegistryLite.getGeneratedRegistry());
            abuz abuzVar = new abuz();
            aodv aodvVar = ((aodw) aihfVarCreateBuilder.instance).c;
            if (aodvVar == null) {
                aodvVar = aodv.a;
            }
            if ((aodvVar.b & 2) != 0) {
                aodv aodvVar2 = ((aodw) aihfVarCreateBuilder.instance).c;
                if (aodvVar2 == null) {
                    aodvVar2 = aodv.a;
                }
                aqmh aqmhVar = aodvVar2.d;
                if (aqmhVar == null) {
                    aqmhVar = aqmh.a;
                }
                abuzVar = new abuz(aqmhVar);
                abuz abuzVarU = aalfVar.u(string, abuzVar);
                if (!abuzVarU.b.isEmpty()) {
                    abuzVar = abuzVarU;
                }
            }
            return aaok.c((aodw) aihfVarCreateBuilder.build(), abuzVar);
        } catch (aiik e) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineChannelCursorReader", "readChannelInPlace", '/', "OfflineChannelCursorReader.java")).w("Error loading proto for channelId=[%s]", string);
            return null;
        }
    }
}
