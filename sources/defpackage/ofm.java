package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ofm extends ofv {
    private boolean d;
    private boolean e;

    @Override // defpackage.ofv
    protected final Map a(ogj ogjVar) {
        Map mapA = super.a(ogjVar);
        mapA.put("avas", new ofy(ofh.aI, 0));
        mapA.put("vs", new ofy(ofh.aH, 0));
        mapA.put("avid", new ofy("audio", 1));
        return mapA;
    }

    @Override // defpackage.ofv
    public final void b(ofo ofoVar, ogh oghVar) {
        ogj ogjVar = ogj.START;
        if (!this.d && ofoVar == ogjVar && oghVar.q) {
            oghVar.w(4);
            oghVar.x(4);
            ogi ogiVar = this.c;
            ogj ogjVar2 = ogj.AUDIO_MEASURABLE;
            ogiVar.d(d(ogjVar2, oghVar));
            this.b.add(ogjVar2);
            this.d = true;
        }
    }

    @Override // defpackage.ofv
    public final void c(ogh oghVar) {
        if (this.e || !this.d || ((ogl) oghVar.e).m.b(3) < 2000) {
            return;
        }
        oghVar.w(5);
        ogi ogiVar = this.c;
        ogj ogjVar = ogj.AUDIO_AUDIBLE;
        ogiVar.c(d(ogjVar, oghVar));
        this.b.add(ogjVar);
        this.e = true;
    }
}
