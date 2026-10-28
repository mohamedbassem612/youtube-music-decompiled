package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class icc implements aheh {
    final Optional b;
    final /* synthetic */ icj c;

    public icc(icj icjVar, Optional optional) {
        this.c = icjVar;
        this.b = optional;
    }

    @Override // defpackage.aheh
    public void a(Throwable th) {
        this.c.h.kk(Boolean.FALSE);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.aheh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        wgi wgiVar = (wgi) obj;
        if (wgiVar != null) {
            amae amaeVar = wgiVar.a;
            aouj aoujVarAb = fhz.ab(amaeVar);
            icj icjVar = this.c;
            if (aoujVarAb == null) {
                icjVar.h.kk(Boolean.FALSE);
                return;
            }
            ((awku) icjVar.g.io()).kk(new icw(amaeVar, null));
            icf icfVar = icjVar.o;
            if (icfVar != null) {
                icfVar.a(wgiVar.d());
            }
            icjVar.c.d(wgiVar.d());
            aae aaeVarJ = icjVar.J(aoujVarAb);
            for (abke abkeVar : aaeVarJ.c) {
                if (abkeVar instanceof hzf) {
                    hzf hzfVar = (hzf) abkeVar;
                    aihh aihhVar = (aihh) hzfVar.a.toBuilder();
                    aihhVar.copyOnWrite();
                    aoun aounVar = (aoun) aihhVar.instance;
                    aounVar.b |= SemanticState.Focused;
                    aounVar.k = false;
                    hzfVar.u((aoun) aihhVar.build());
                }
            }
            icjVar.h.kk(Boolean.TRUE);
            c(wgiVar, aoujVarAb, aaeVarJ);
        }
    }

    public abstract void c(wgi wgiVar, aouj aoujVar, aae aaeVar);
}
