package defpackage;

import j$.util.Collection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class icm implements aheh {
    final /* synthetic */ ico a;
    private final apcc b;
    private final String c;

    public icm(ico icoVar, apcc apccVar) {
        this.a = icoVar;
        this.b = apccVar;
        this.c = apccVar == apcc.INSERT_AFTER_CURRENT_VIDEO ? "PLAY_NEXT" : "ADD_TO_QUEUE";
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        abkh abkhVar;
        ((agrc) ((agrc) ((agrc) ico.a.c().i(agso.a, "PlaybackQueueOpsManager")).j(th)).k("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueueOperationsManager$MusicQueueCallback", "onFailure", (char) 764, "MusicPlaybackQueueOperationsManager.java")).t("MusicQueueCallback onFailure");
        ico icoVar = this.a;
        String str = this.c;
        icoVar.d(str, true);
        if (str.equals("ADD_TO_QUEUE")) {
            abkhVar = abkh.e;
        } else {
            abkhVar = str.equals("PLAY_NEXT") ? abkh.d : abkh.a;
        }
        icoVar.m.g(abkhVar);
    }

    @Override // defpackage.aheh
    public final /* synthetic */ void b(Object obj) {
        int iA;
        iex iexVar = (iex) obj;
        alss alssVar = iexVar.b;
        if (alssVar != null && (alssVar.b & 2) != 0 && !alssVar.e.isEmpty()) {
            String str = alssVar.e;
            agrx agrxVar = agso.a;
            abjp abjpVar = this.a.c;
            List listO = abjpVar.o(0);
            int i = 0;
            while (true) {
                if (i >= listO.size()) {
                    iA = abjpVar.d(0).size();
                    break;
                }
                iA = i + 1;
                abnl abnlVarN = ((hyz) listO.get(i)).n();
                if (abnlVarN != null && abnlVarN.v().equals(str)) {
                    break;
                } else {
                    i = iA;
                }
            }
        } else {
            int iOrdinal = this.b.ordinal();
            if (iOrdinal != 1) {
                iA = iOrdinal != 2 ? -1 : this.a.c.d(0).size();
            } else {
                iA = this.a.c.a() + 1;
            }
        }
        List list = iexVar.a;
        agrf agrfVar = ico.a;
        agru agruVarC = agrfVar.c();
        agrx agrxVar2 = agso.a;
        ((agrc) ((agrc) agruVarC.i(agrxVar2, "PlaybackQueueOpsManager")).k("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueueOperationsManager$MusicQueueCallback", "onSuccess", 737, "MusicPlaybackQueueOperationsManager.java")).x("MusicQueueCallback onSuccess, numItems: %d, insertIndex: %d", list.size(), iA);
        if (iA >= 0) {
            ArrayList arrayList = new ArrayList(list);
            if (Collection.EL.removeIf(arrayList, new hud(10))) {
                ((agrc) ((agrc) agrfVar.b().i(agrxVar2, "PlaybackQueueOpsManager")).k("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueueOperationsManager$MusicQueueCallback", "onSuccess", 746, "MusicPlaybackQueueOperationsManager.java")).t("Encountered nulls in server response from MusicQueueCallback");
            }
            ico icoVar = this.a;
            jnm jnmVar = icoVar.q;
            if (jnmVar.i() && Collection.EL.removeIf(arrayList, new hud(8))) {
                ((hzl) jnmVar.c).a();
            }
            icoVar.c.d(0).addAll(iA, arrayList);
            icoVar.d(this.c, false);
            icoVar.m.k();
        }
    }
}
