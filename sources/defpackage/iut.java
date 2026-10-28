package defpackage;

import android.database.Cursor;
import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iut implements qsx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ iut(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.qsx
    public final Object a(omr omrVar) throws wcm, InterruptedException {
        int i = this.$cid;
        int i2 = 0;
        if (i == 0) {
            ?? r8 = this.a;
            int size = r8.size();
            int iQ = 0;
            while (i2 < size) {
                long jLongValue = ((Long) r8.get(i2)).longValue();
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                sb.append("audio_media_id");
                sb.append(" = ?");
                arrayList.add(Long.toString(jLongValue));
                iQ += omrVar.q(nqw.g("music_sideloaded_playlist_track", sb, arrayList));
                i2++;
            }
            return Integer.valueOf(iQ);
        }
        if (i == 1) {
            omrVar.h("DELETE FROM music_sideloaded_playlist");
            omrVar.h("DELETE FROM music_sideloaded_playlist_track");
            ?? r9 = this.a;
            int size2 = r9.size();
            while (i2 < size2) {
                Pair pair = (Pair) r9.get(i2);
                String str = (String) pair.first;
                agke agkeVar = (agke) pair.second;
                long jAr = hfn.ar(omrVar, str);
                if (agkeVar != null && !agkeVar.isEmpty() && hfn.ax(omrVar, jAr, agkeVar) != agkeVar.size()) {
                    return Boolean.FALSE;
                }
                i2++;
            }
            return Boolean.TRUE;
        }
        if (i == 2) {
            return Long.valueOf(hfn.ar(omrVar, (String) this.a));
        }
        if (i == 3) {
            syn synVar = afnp.m;
            omr omrVar2 = new omr();
            omrVar2.i("DELETE FROM ListenerSuccessfulRuns WHERE version_code != ?");
            Long lValueOf = Long.valueOf(((afnn) this.a).a);
            omrVar2.j(lValueOf);
            omrVar.o(omrVar2.p());
            omr omrVar3 = new omr();
            omrVar3.i("DELETE FROM AllListenersSucceededVersionTable WHERE version_code != ?");
            omrVar3.j(lValueOf);
            omrVar.o(omrVar3.p());
            return null;
        }
        if (i == 4) {
            try {
                Cursor cursorN = omrVar.n((omr) this.a);
                try {
                    boolean zMoveToFirst = cursorN.moveToFirst();
                    if (cursorN != null) {
                        cursorN.close();
                    }
                    return Boolean.valueOf(zMoveToFirst);
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
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw wcm.a(e, -1, 3, 5);
            }
        }
        if (i != 5) {
            return (agkz) web.m(omrVar, (omr) this.a, new wdv()).collect(aghu.b);
        }
        agkx agkxVar = new agkx();
        Cursor cursorE = omrVar.e("SELECT DISTINCT parent_entity_key FROM entity_associations WHERE child_entity_key=?", (String) this.a);
        while (cursorE.moveToNext()) {
            try {
                agkxVar.c(cursorE.getString(0));
            } catch (Throwable th3) {
                if (cursorE != null) {
                    try {
                        cursorE.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
        if (cursorE != null) {
            cursorE.close();
        }
        return agkxVar.g();
    }
}
