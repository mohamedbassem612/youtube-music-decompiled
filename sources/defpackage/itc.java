package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class itc implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ itc(iuo iuoVar, Object obj, int i) {
        this.$cid = i;
        this.b = iuoVar;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r9v23, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v26, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r9v39, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r9v60, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean zBooleanValue = true;
        switch (this.$cid) {
            case 0:
                Iterator it = this.b.iterator();
                int i = 0;
                while (it.hasNext()) {
                    try {
                        zBooleanValue &= ((Boolean) ahng.v((ListenableFuture) it.next())).booleanValue();
                        i++;
                    } catch (Exception unused) {
                        zBooleanValue = false;
                    }
                }
                ((itd) this.a).f.aj(5, zBooleanValue ? 2 : 3, i);
                return Boolean.valueOf(zBooleanValue);
            case 1:
                Object obj = this.b;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream((File) this.a);
                    try {
                        fileOutputStream.write(((StringBuilder) obj).toString().getBytes(StandardCharsets.UTF_8));
                        fileOutputStream.close();
                        return Boolean.TRUE;
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException e) {
                    ((agrc) ((agrc) ((agrc) isz.a.b()).j(e)).k("com/google/android/apps/youtube/music/sideloaded/playlistwriter/PlaylistFileWriter", "writePlaylist", '^', "PlaylistFileWriter.java")).t("Failed to write playlist");
                    return Boolean.FALSE;
                }
            case 2:
                this.a.b(null, this.b);
                return null;
            case 3:
                return iuf.Q((agkz) ahng.v(this.b), (agkz) ahng.v(this.a));
            case 4:
                Cursor cursor = (Cursor) ahng.v(this.b);
                iuf iufVar = (iuf) this.a;
                jkm jkmVar = new jkm(cursor, new ism(iufVar.b, ((hcb) iufVar.j.io()).c(), iufVar.n.l(263, 45828915L, false)));
                try {
                    return agke.o(jkmVar);
                } finally {
                    jku.b(jkmVar);
                }
            case 5:
                List list = (List) ahng.v(this.a);
                if (list.isEmpty()) {
                    return null;
                }
                return hcg.c((anjx) list.get(0), agke.n((Collection) ahng.v(this.b)));
            case 6:
                return hmy.U(this.a, this.b);
            case 7:
                return ((iuo) this.b).e.query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, ish.f, "is_music=1 AND title IS NOT NULL AND album_id = ?", new String[]{((Uri) this.a).getLastPathSegment()}, "track");
            case 8:
                return hcg.c((anjx) ((List) ahng.v(this.a)).get(0), agke.n((Collection) ahng.v(this.b)));
            case 9:
                return Integer.valueOf(((iuo) this.b).e.delete(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, "_id=?", new String[]{((Uri) this.a).getLastPathSegment()}));
            case 10:
                Cursor cursor2 = (Cursor) ahng.v(this.b);
                if (cursor2 == null) {
                    return agpi.a;
                }
                iuo iuoVar = (iuo) this.a;
                jkm jkmVar2 = new jkm(cursor2, new isn(iuoVar.b, ((wbz) iuoVar.f.io()).c(), iuoVar.i.l(263, 45828915L, false)));
                try {
                    return agke.o(jkmVar2);
                } finally {
                    jku.b(jkmVar2);
                }
            case 11:
                return ((iuo) this.b).e.query((Uri) this.a, ish.f, "is_music=1 AND title IS NOT NULL", null, null);
            case 12:
                return iuo.R((agkz) ahng.v(this.b), (agkz) ahng.v(this.a));
            case 13:
                return ((iuo) this.b).e.query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "is_music=1 AND title IS NOT NULL AND album_id = ?", new String[]{((Uri) this.a).getLastPathSegment()}, "track");
            case 14:
                return ((iuo) this.b).e.query(ixt.o((Uri) this.a), ish.g, "is_music=1 AND title IS NOT NULL", null, "play_order");
            case 15:
                return ((iuo) this.b).e.insert(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, (ContentValues) this.a);
            case 16:
                return Integer.valueOf(((iuo) this.b).e.delete(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, "_id=?", new String[]{((Uri) this.a).getLastPathSegment()}));
            case 17:
                return ((iuo) this.b).e.query(ixt.o((Uri) this.a), new String[]{"audio_id"}, "is_music=1 AND title IS NOT NULL", null, "play_order");
            case 18:
                Cursor cursor3 = (Cursor) ahng.v(this.b);
                iuo iuoVar2 = (iuo) this.a;
                jkm jkmVar3 = new jkm(cursor3, new ism(iuoVar2.b, ((wbz) iuoVar2.f.io()).c(), iuoVar2.i.l(263, 45828915L, false)));
                try {
                    return agke.o(jkmVar3);
                } finally {
                    jku.b(jkmVar3);
                }
            case 19:
                return ((iuo) this.b).e.query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, ish.f, "is_music=1 AND title IS NOT NULL AND artist_id = ?", new String[]{((Uri) this.a).getLastPathSegment()}, String.format("LOWER(%s)", "title"));
            default:
                agke agkeVar = (agke) ahng.v(this.a);
                Stream stream = j$.util.Collection.EL.stream((agke) ahng.v(this.b));
                itm itmVar = new itm(18);
                ieu ieuVar = new ieu(2);
                Function functionIdentity = Function$CC.identity();
                Collector collector = aghu.a;
                return (agke) j$.util.Collection.EL.stream(agkeVar).map(new iuk((Map) stream.collect(Collectors.groupingBy(itmVar, ieuVar, Collectors.mapping(functionIdentity, collector))), 2)).collect(collector);
        }
    }

    public /* synthetic */ itc(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
