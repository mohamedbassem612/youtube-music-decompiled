package defpackage;

import android.database.Cursor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ius implements qsx {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ius(int i) {
        this.$cid = i;
    }

    @Override // defpackage.qsx
    public final Object a(omr omrVar) {
        int i = this.$cid;
        if (i == 0) {
            omr omrVar2 = new omr();
            omrVar2.i("SELECT COUNT(*) FROM ");
            omrVar2.i("music_sideloaded_playlist");
            Cursor cursorN = omrVar.n(omrVar2.p());
            try {
                if (!cursorN.moveToFirst()) {
                    if (cursorN != null) {
                        cursorN.close();
                    }
                    return Boolean.FALSE;
                }
                Boolean boolValueOf = Boolean.valueOf(cursorN.getLong(0) > 0);
                if (cursorN != null) {
                    cursorN.close();
                }
                return boolValueOf;
            } catch (Throwable th) {
                if (cursorN != null) {
                    try {
                        cursorN.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (i == 1) {
            agjz agjzVar = new agjz(4);
            omr omrVar3 = new omr();
            omrVar3.i("SELECT * FROM ");
            omrVar3.i("music_sideloaded_playlist");
            Cursor cursorN2 = omrVar.n(omrVar3.p());
            try {
                if (cursorN2.moveToFirst()) {
                    do {
                        agjzVar.h(hfn.O(cursorN2));
                    } while (cursorN2.moveToNext());
                }
                if (cursorN2 != null) {
                    cursorN2.close();
                }
                return agjzVar.g();
            } catch (Throwable th3) {
                if (cursorN2 != null) {
                    try {
                        cursorN2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
        if (i == 2) {
            agkx agkxVar = new agkx();
            omr omrVar4 = new omr();
            omrVar4.i("SELECT DISTINCT ");
            omrVar4.i("audio_media_id");
            omrVar4.i(" FROM ");
            omrVar4.i("music_sideloaded_playlist_track");
            Cursor cursorN3 = omrVar.n(omrVar4.p());
            try {
                if (cursorN3.moveToFirst()) {
                    do {
                        agkxVar.c(Long.valueOf(cursorN3.getLong(cursorN3.getColumnIndexOrThrow("audio_media_id"))));
                    } while (cursorN3.moveToNext());
                }
                if (cursorN3 != null) {
                    cursorN3.close();
                }
                return agkxVar.g();
            } catch (Throwable th5) {
                if (cursorN3 != null) {
                    try {
                        cursorN3.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
        }
        agjz agjzVar2 = new agjz(4);
        omr omrVar5 = new omr();
        omrVar5.i("SELECT * FROM ");
        omrVar5.i("music_sideloaded_playlist_track");
        omrVar5.i(" ORDER BY ");
        omrVar5.i("playlist_id");
        omrVar5.i(" ASC , ");
        omrVar5.i("position");
        omrVar5.i(" ASC");
        Cursor cursorN4 = omrVar.n(omrVar5.p());
        try {
            if (cursorN4.moveToFirst()) {
                do {
                    agjzVar2.h(hfn.P(cursorN4));
                } while (cursorN4.moveToNext());
            }
            if (cursorN4 != null) {
                cursorN4.close();
            }
            return agjzVar2.g();
        } catch (Throwable th7) {
            if (cursorN4 != null) {
                try {
                    cursorN4.close();
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                }
            }
            throw th7;
        }
    }
}
