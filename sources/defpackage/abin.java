package defpackage;

import app.rive.semantics.SemanticState;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abin implements abij {
    public static final Duration a;
    public final abwg b;
    public final mbc c;
    public final boolean d;
    private final abmt e;
    private final avmb f;
    private final avmm g;
    private final awku h;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        durationOfSeconds.getClass();
        a = durationOfSeconds;
    }

    public abin(abwg abwgVar, abmt abmtVar, avmb avmbVar, mbc mbcVar) {
        Object obj;
        abwgVar.getClass();
        abmtVar.getClass();
        avmbVar.getClass();
        mbcVar.getClass();
        this.b = abwgVar;
        this.e = abmtVar;
        this.f = avmbVar;
        this.c = mbcVar;
        avmm avmmVar = new avmm();
        this.g = avmmVar;
        awku awkuVar = new awku();
        this.h = awkuVar;
        boolean zCg = abmtVar.cg();
        this.d = zCg;
        if (abmtVar.g.l(SemanticState.Hidden, 45717424L, false)) {
            if (zCg) {
                obj = abwgVar.u;
                obj.getClass();
            } else {
                obj = abwgVar.n;
                obj.getClass();
            }
            avmmVar.c(((avlh) obj).W(new yrb(new yrc(this, 18), 17)).L(avmbVar).R(new awml(new abim("", false, 0L), 0L), new vnc(new akm(6), 4)).x(new wsh(new yta(7), 8)).H(new yrb(new yta(8), 18)).p().al(new abid(new hho((Object) awkuVar, 13, (short[]) null), 9), new abid(abil.a, 10)));
        }
    }

    @Override // defpackage.abij
    public final avlh a() {
        return this.h;
    }
}
