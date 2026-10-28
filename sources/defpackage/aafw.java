package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aafw {
    public static final String[] a = {"video_id", "itag", "format_stream_proto", "duration_millis", "audio_only", "bytes_transferred", "bytes_total", "stream_status", "stream_status_timestamp", "transfer_added_timestamp", "transfer_started_timestamp", "transfer_completed_timestamp", "storage_format", "wrapped_key", "disco_key_iv", "disco_key", "disco_nonce_text", "encryption_key_type", "external_yt_file_path", "storage_id", "expired_stream", "ytb_uri"};
    public final Key b;
    public final aafe c;
    private final aaev d;
    private final List e = new ArrayList();

    public aafw(Key key, aaev aaevVar, aafe aafeVar, aauk aaukVar) {
        this.b = key;
        this.d = aaevVar;
        this.c = aafeVar;
        aaml.a = aaukVar.b.l(231, 45842312L, false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x009e  */
    public final ContentValues a(aaml aamlVar) {
        byte[] bArrAk;
        ContentValues contentValues = new ContentValues();
        contentValues.put("video_id", aamlVar.g());
        contentValues.put("itag", Integer.valueOf(aamlVar.a()));
        wgs wgsVar = aamlVar.c;
        contentValues.put("format_stream_proto", wgsVar.b.toByteArray());
        contentValues.put("duration_millis", Long.valueOf(wgsVar.d));
        contentValues.put("audio_only", tbd.b(aamlVar.d));
        contentValues.put("bytes_total", Long.valueOf(aamlVar.b()));
        contentValues.put("bytes_transferred", Long.valueOf(aamlVar.e));
        contentValues.put("stream_status", Integer.valueOf(aamlVar.f));
        contentValues.put("stream_status_timestamp", Long.valueOf(aamlVar.g));
        int i = aamlVar.q;
        if (i == 0) {
            throw null;
        }
        contentValues.put("storage_format", Integer.valueOf(i - 1));
        contentValues.put("wrapped_key", aamlVar.h);
        byte[] bArr = aamlVar.i;
        contentValues.put("disco_key_iv", bArr);
        atxq atxqVar = aamlVar.j;
        if (atxqVar == null || bArr == null) {
            bArrAk = null;
        } else {
            byte[] byteArray = atxqVar.toByteArray();
            if (byteArray.length > 0) {
                bArrAk = dov.ak(bArr, byteArray, this.b);
            } else {
                bArrAk = null;
            }
        }
        String str = aamlVar.k;
        contentValues.put("disco_key", bArrAk);
        byte[] bytes = str == null ? null : str.getBytes(StandardCharsets.UTF_8);
        Uri uri = aamlVar.p;
        contentValues.put("disco_nonce_text", bytes);
        contentValues.put("encryption_key_type", Integer.valueOf(aamlVar.l));
        contentValues.put("ytb_uri", uri != null ? uri.toString() : null);
        contentValues.put("storage_id", aamlVar.m);
        contentValues.put("expired_stream", tbd.b(aamlVar.n));
        return contentValues;
    }

    public final void b(aafv aafvVar) {
        this.e.add(aafvVar);
    }

    public final void c(String str, aoen aoenVar) {
        try {
            d().delete("streams", "video_id = ?", new String[]{str});
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((aafv) it.next()).a(str, aoenVar);
            }
            aafe aafeVar = this.c;
            try {
                aafeVar.a().delete("hashes", "video_id = ?", new String[]{str});
            } finally {
                Iterator it2 = aafeVar.b.iterator();
                while (it2.hasNext()) {
                    ((aafd) it2.next()).a();
                }
            }
        } catch (Throwable th) {
            Iterator it3 = this.e.iterator();
            while (it3.hasNext()) {
                ((aafv) it3.next()).a(str, aoenVar);
            }
            throw th;
        }
    }

    public final SQLiteDatabase d() {
        return this.d.d();
    }
}
