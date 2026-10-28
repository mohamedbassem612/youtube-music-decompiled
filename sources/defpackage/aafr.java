package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aafr implements tbh {
    private final aalf a;

    public aafr(aalf aalfVar) {
        this.a = aalfVar;
    }

    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.tbh
    public final void a(SQLiteDatabase sQLiteDatabase) throws Throwable {
        aqmh aqmhVar;
        aalf aalfVar = this.a;
        if (aalfVar != null) {
            aalg aalgVar = new aalg(aalfVar.a, aalfVar.b);
            try {
                Cursor cursorQuery = sQLiteDatabase.query("videosV2", aagi.a, null, null, null, null, null, null);
                try {
                    cursorQuery.getClass();
                    List<aamo> listB = aafz.b(cursorQuery, aalfVar, null, cursorQuery.getColumnIndexOrThrow("id"), cursorQuery.getColumnIndexOrThrow("offline_video_data_proto"), cursorQuery.getColumnIndexOrThrow("deleted"), cursorQuery.getColumnIndexOrThrow("channel_id"), cursorQuery.getColumnIndex("video_id"));
                    cursorQuery.close();
                    List listAsList = Arrays.asList(240, 480);
                    for (aamo aamoVar : listB) {
                        File file = new File(aalgVar.a(aamoVar.d()), "thumb_small.jpg");
                        File file2 = new File(aalgVar.a(aamoVar.d()), "thumb_large.jpg");
                        aqmh aqmhVar2 = ((aohb) aamoVar.e).d;
                        if (aqmhVar2 == null) {
                            aqmhVar2 = aqmh.a;
                        }
                        abuz abuzVar = new abuz(aajg.f(aqmhVar2, listAsList));
                        if (file.exists()) {
                            ?? r11 = abuzVar.b;
                            if (!r11.isEmpty()) {
                                File fileH = aalfVar.h(aamoVar.d(), abuzVar.k().a());
                                agyo.b(fileH);
                                agyo.a(file, fileH);
                                if (file2.exists() && r11.size() > 1) {
                                    File fileH2 = aalfVar.h(aamoVar.d(), abuzVar.h().a());
                                    agyo.b(fileH2);
                                    agyo.a(file2, fileH2);
                                }
                            }
                        }
                        file.delete();
                        file2.delete();
                    }
                    Cursor cursorQuery2 = sQLiteDatabase.query("playlistsV2", aafa.a, null, null, null, null, null, null);
                    try {
                        List<aamh> listB2 = aaff.b(cursorQuery2, aalfVar, null, cursorQuery2.getColumnIndexOrThrow("id"), cursorQuery2.getColumnIndexOrThrow("offline_playlist_data_proto"), cursorQuery2.getColumnIndexOrThrow("placeholder"), cursorQuery2.getColumnIndexOrThrow("size"), cursorQuery2.getColumnIndexOrThrow("channel_id"));
                        cursorQuery2.close();
                        for (aamh aamhVar : listB2) {
                            String str = aamhVar.a;
                            if (aalgVar.c == null) {
                                aalgVar.c = new File(aalgVar.a, "playlists");
                            }
                            File file3 = new File(new File(aalgVar.c, str), "thumb.jpg");
                            aofu aofuVar = aamhVar.h;
                            if (aofuVar != null) {
                                aqmhVar = aofuVar.d;
                                if (aqmhVar == null) {
                                    aqmhVar = aqmh.a;
                                }
                            } else {
                                aqmhVar = null;
                            }
                            abuz abuzVar2 = new abuz(aajg.f(aqmhVar, Collections.singletonList(480)));
                            if (file3.exists() && !abuzVar2.b.isEmpty()) {
                                File fileD = aalfVar.d(str, abuzVar2.k().a());
                                agyo.b(fileD);
                                agyo.a(file3, fileD);
                            }
                            file3.delete();
                        }
                        Cursor cursorQuery3 = sQLiteDatabase.query("channels", aaey.a, null, null, null, null, null, null);
                        try {
                            int columnIndexOrThrow = cursorQuery3.getColumnIndexOrThrow("id");
                            int columnIndexOrThrow2 = cursorQuery3.getColumnIndexOrThrow("offline_channel_data_proto");
                            ArrayList<aaok> arrayList = new ArrayList(cursorQuery3.getCount());
                            while (cursorQuery3.moveToNext()) {
                                aaok aaokVarA = aaen.a(cursorQuery3, aalfVar, columnIndexOrThrow, columnIndexOrThrow2);
                                if (aaokVarA != null) {
                                    arrayList.add(aaokVarA);
                                }
                            }
                            cursorQuery3.close();
                            for (aaok aaokVar : arrayList) {
                                Object obj = aaokVar.b;
                                if (aalgVar.b == null) {
                                    aalgVar.b = new File(aalgVar.a, "channels");
                                }
                                File file4 = new File(aalgVar.b, ((String) obj).concat(".jpg"));
                                aodv aodvVar = ((aodw) aaokVar.a).c;
                                if (aodvVar == null) {
                                    aodvVar = aodv.a;
                                }
                                aqmh aqmhVar3 = aodvVar.d;
                                if (aqmhVar3 == null) {
                                    aqmhVar3 = aqmh.a;
                                }
                                abuz abuzVar3 = new abuz(aajg.f(aqmhVar3, Collections.singletonList(240)));
                                if (file4.exists() && !abuzVar3.b.isEmpty()) {
                                    File fileB = aalfVar.b((String) obj, abuzVar3.k().a());
                                    agyo.b(fileB);
                                    agyo.a(file4, fileB);
                                }
                                file4.delete();
                            }
                        } catch (Throwable th) {
                            cursorQuery3.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        cursorQuery2.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    cursorQuery.close();
                    throw th3;
                }
            } catch (IOException e) {
                ((agrc) ((agrc) ((agrc) aafs.a.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineSQLiteOpenHelper$OfflineSchemaMigrationV7", "apply", (char) 853, "OfflineSQLiteOpenHelper.java")).t("FileStore migration failed.");
            }
        }
    }
}
