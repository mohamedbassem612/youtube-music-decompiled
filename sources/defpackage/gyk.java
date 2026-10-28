package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gyk extends gut {
    private static final agrf b = agrf.h("com/google/android/apps/youtube/music/command/TimedCommandResolver");
    public final awmd a;
    private final ahey c;

    public gyk(awmd awmdVar, ahey aheyVar) {
        this.a = awmdVar;
        this.c = aheyVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void a(ajwo ajwoVar) {
        aihl aihlVar = aqmw.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        aqmw aqmwVar = (aqmw) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        if ((aqmwVar.c & 1) != 0) {
            this.c.schedule(new fuc(this, aqmwVar, 9), aqmwVar.e, TimeUnit.MILLISECONDS);
        } else {
            ((agrc) ((agrc) b.c().i(agso.a, "TimedCommand")).k("com/google/android/apps/youtube/music/command/TimedCommandResolver", "resolve", 49, "TimedCommandResolver.java")).t("Timed command was missing a nested command");
        }
    }
}
