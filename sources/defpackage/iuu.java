package defpackage;

import android.database.Cursor;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iuu implements qsx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;

    public /* synthetic */ iuu(long j, int i) {
        this.$cid = i;
        this.a = j;
    }

    @Override // defpackage.qsx
    public final Object a(omr omrVar) {
        int i = this.$cid;
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            sb.append("id = ?");
            arrayList.add(Long.toString(this.a));
            return Boolean.valueOf(omrVar.q(nqw.g("music_sideloaded_playlist", sb, arrayList)) > 0);
        }
        if (i == 1) {
            agjz agjzVar = new agjz(4);
            omr omrVar2 = new omr();
            omrVar2.i("SELECT * FROM ");
            omrVar2.i("music_sideloaded_playlist_track");
            omrVar2.i(" WHERE ");
            omrVar2.i("playlist_id");
            omrVar2.i(" = ?");
            omrVar2.j(Long.valueOf(this.a));
            omrVar2.i(" ORDER BY ");
            omrVar2.i("position");
            omrVar2.i(" ASC");
            Cursor cursorN = omrVar.n(omrVar2.p());
            try {
                if (cursorN.moveToFirst()) {
                    do {
                        agjzVar.h(hfn.P(cursorN));
                    } while (cursorN.moveToNext());
                }
                if (cursorN != null) {
                    cursorN.close();
                }
                return agjzVar.g();
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
        if (i == 2) {
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            sb2.append("playlist_track_pair_id = ?");
            arrayList2.add(Long.toString(this.a));
            return Boolean.valueOf(omrVar.q(nqw.g("music_sideloaded_playlist_track", sb2, arrayList2)) > 0);
        }
        omr omrVar3 = new omr();
        omrVar3.i("SELECT * FROM ");
        omrVar3.i("music_sideloaded_playlist");
        omrVar3.i(" WHERE ");
        omrVar3.i("id");
        omrVar3.i(" = ?");
        omrVar3.j(Long.valueOf(this.a));
        Cursor cursorN2 = omrVar.n(omrVar3.p());
        try {
            iux iuxVarO = cursorN2.moveToFirst() ? hfn.O(cursorN2) : null;
            if (cursorN2 == null) {
                return iuxVarO;
            }
            cursorN2.close();
            return iuxVarO;
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
}
