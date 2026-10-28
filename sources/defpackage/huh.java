package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class huh extends zik {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/offline/orchestration/MusicTrackDownloadController");
    public final aany b;
    public final Integer c;
    private final vxz d;

    public huh(aany aanyVar, Integer num, vxz vxzVar) {
        super((byte[]) null);
        this.b = aanyVar;
        this.c = num;
        this.d = vxzVar;
    }

    public final avlr a(String str, String str2) {
        final String strAH = kro.aH(str);
        final String strAy = kro.ay(str2);
        aihf aihfVarCreateBuilder = aofh.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aofh aofhVar = (aofh) aihfVarCreateBuilder.instance;
        aofhVar.c = 4;
        aofhVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        aofh aofhVar2 = (aofh) aihfVarCreateBuilder.instance;
        strAy.getClass();
        aofhVar2.b |= 2;
        aofhVar2.d = strAy;
        aihh aihhVar = (aihh) aofg.b.createBuilder();
        int iK = hmy.k(5, this.c.intValue(), aogf.OFFLINE_REQUEST_SOURCE_MANUAL_OFFLINE);
        aihhVar.copyOnWrite();
        aofg aofgVar = (aofg) aihhVar.instance;
        aofgVar.c |= 1;
        aofgVar.d = iK;
        aihl aihlVar = anue.b;
        aihf aihfVarCreateBuilder2 = anue.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        anue anueVar = (anue) aihfVarCreateBuilder2.instance;
        str.getClass();
        anueVar.d = 7;
        anueVar.e = str;
        aihhVar.e(aihlVar, (anue) aihfVarCreateBuilder2.build());
        aofg aofgVar2 = (aofg) aihhVar.build();
        aihfVarCreateBuilder.copyOnWrite();
        aofh aofhVar3 = (aofh) aihfVarCreateBuilder.instance;
        aofgVar2.getClass();
        aofhVar3.e = aofgVar2;
        aofhVar3.b |= 4;
        aofh aofhVar4 = (aofh) aihfVarCreateBuilder.build();
        try {
            if (this.d.l(183, 45716163L, false)) {
                this.b.f(new aaoa() { // from class: hug
                    @Override // defpackage.aaoa
                    public final aanz a(aanq aanqVar) {
                        if (aanqVar.a().g()) {
                            return aanqVar.d().equals(strAH) ? aanz.b : aanz.a;
                        }
                        return aanqVar.d().equals(strAy) ? aanz.c : aanz.a;
                    }
                });
            }
            return this.b.a(aofhVar4);
        } catch (aaob e) {
            ((agrc) ((agrc) ((agrc) a.b().i(agso.a, "Offline")).j(e)).k("com/google/android/apps/youtube/music/offline/orchestration/MusicTrackDownloadController", "removeSingleTrack", 'o', "MusicTrackDownloadController.java")).w("Couldn't delete single track through orchestration: %s", str);
            return avlr.J(new aanv(aofhVar4, aanu.f));
        }
    }
}
