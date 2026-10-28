package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sbd implements sbf {
    private final awmd a;
    private final awmd b;
    private final awmd c;
    private final awmd d;
    private final Executor e;
    private final awmd f;
    private final awmd g;
    private final mbc h;
    private final awmd i;
    private final awmd j;
    private final awmd k;
    private final Context l;
    private final abvn m;
    private final rmp n;

    public sbd(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, Executor executor, awmd awmdVar5, awmd awmdVar6, mbc mbcVar, awmd awmdVar7, rmp rmpVar, awmd awmdVar8, awmd awmdVar9, Context context, abvn abvnVar) {
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = awmdVar3;
        this.d = awmdVar4;
        this.e = executor;
        this.f = awmdVar5;
        this.g = awmdVar6;
        this.h = mbcVar;
        this.i = awmdVar7;
        this.n = rmpVar;
        this.j = awmdVar8;
        this.k = awmdVar9;
        this.l = context;
        this.m = abvnVar;
    }

    @Override // defpackage.sbf
    public final sba a(rsk rskVar, smr smrVar) throws sbe {
        sba sayVar;
        wjf wjfVarC;
        aixo aixoVar = aixo.SLOT_TYPE_PLAYER_BYTES;
        if (!smrVar.g(aixoVar, sih.class, siv.class) || !((Boolean) smrVar.d(siv.class)).booleanValue()) {
            if (nrj.d(saz.class, smrVar) && smrVar.e(sjy.class) && (wjfVarC = ((acfw) smrVar.d(sjy.class)).c()) != null && wjfVarC.V()) {
                vyo vyoVar = (vyo) this.d.io();
                acm acmVar = (acm) this.a.io();
                sbr sbrVar = (sbr) this.c.io();
                tbt tbtVar = (tbt) this.b.io();
                Executor executor = this.e;
                sbj sbjVar = (sbj) this.f.io();
                tld tldVar = (tld) this.g.io();
                mbc mbcVar = this.h;
                sayVar = new saz(rskVar, vyoVar, acmVar, sbrVar, smrVar, tbtVar, executor, sbjVar, tldVar, mbcVar, this.n, (rsr) this.j.io(), this.k, this.l, this.m);
            } else if (nrj.d(say.class, smrVar)) {
                vyo vyoVar2 = (vyo) this.d.io();
                acm acmVar2 = (acm) this.a.io();
                sbr sbrVar2 = (sbr) this.c.io();
                tbt tbtVar2 = (tbt) this.b.io();
                Executor executor2 = this.e;
                sbj sbjVar2 = (sbj) this.f.io();
                sayVar = new say(rskVar, vyoVar2, acmVar2, sbrVar2, smrVar, tbtVar2, executor2, sbjVar2, this.k, this.l, this.m);
            } else if (!smrVar.g(aixoVar, sih.class)) {
                throw new sbe("PlayerBytesSlotAdapterFactory received unsupported metadata");
            }
            return sayVar;
        }
        return new sax(rskVar, smrVar);
    }
}
