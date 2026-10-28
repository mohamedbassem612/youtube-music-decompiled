package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acmy {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/reel/internal/fragment/ReelPlayerOrganicAdOverlayVisibilityMonitor");
    public final awli b = new awli(Boolean.FALSE);

    /* JADX WARN: Type inference failed for: r4v1, types: [acnm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [acnn, java.lang.Object] */
    public acmy(wbz wbzVar, adif adifVar, hno hnoVar, avmb avmbVar) {
        if (hnoVar.E()) {
            Optional optionalA = adifVar.a.a();
            optionalA = true == optionalA.isPresent() ? Optional.ofNullable(optionalA.get().hw()) : optionalA;
            if (optionalA.isPresent()) {
                wbzVar.e((zwa) optionalA.get()).k(wfs.g(542, "kReelPlayerOrganicAdOverlayVisibilityEntityKey")).B(new yqz(14)).K(new ablh(12)).h(apet.class).O(avmbVar).ag(new acmv(this, 2), new abxq(11));
            }
        }
    }
}
