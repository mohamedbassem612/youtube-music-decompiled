package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wsx extends wms {
    public wsx(abxv abxvVar, zwa zwaVar, String str, int i, Optional optional, String str2) {
        aihf aihfVarCreateBuilder = alwr.a.createBuilder();
        if (!ahno.aa(str)) {
            aihfVarCreateBuilder.copyOnWrite();
            alwr alwrVar = (alwr) aihfVarCreateBuilder.instance;
            str.getClass();
            alwrVar.b |= 2;
            alwrVar.d = str;
        }
        if (i != 0) {
            aihfVarCreateBuilder.copyOnWrite();
            alwr alwrVar2 = (alwr) aihfVarCreateBuilder.instance;
            alwrVar2.e = i - 1;
            alwrVar2.b |= 4;
        }
        aihfVarCreateBuilder.getClass();
        vrl vrlVar = new vrl(aihfVarCreateBuilder, 13);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            aihf aihfVar = (aihf) vrlVar.a;
            aihfVar.copyOnWrite();
            alwr alwrVar3 = (alwr) aihfVar.instance;
            alwrVar3.b |= 8;
            alwrVar3.f = (aigj) obj;
        }
        if (!ahno.aa(str2)) {
            aihfVarCreateBuilder.copyOnWrite();
            alwr alwrVar4 = (alwr) aihfVarCreateBuilder.instance;
            str2.getClass();
            alwrVar4.b |= 16;
            alwrVar4.g = str2;
        }
        super(abxvVar, zwaVar, "playlist/poll_playlist_freshness", aihfVarCreateBuilder, false);
    }

    @Override // defpackage.wkf
    protected final void b() {
        if (((alwr) ((aihf) a()).instance).d.isEmpty() && ((alwr) ((aihf) a()).instance).g.isEmpty()) {
            ((agrc) ((agrc) wsy.c.b().i(agso.a, "PollPlaylistFreshness")).k("com/google/android/libraries/youtube/innertube/services/pollplaylistfreshness/PollPlaylistFreshnessService$PollPlaylistFreshnessServiceRequest", "validateRequest", 157, "PollPlaylistFreshnessService.java")).t("PollPlaylistFreshnessService request must have a non-empty playlist id or a continuation.");
        }
    }
}
