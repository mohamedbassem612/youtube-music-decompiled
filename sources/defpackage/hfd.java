package defpackage;

import java.util.Collections;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hfd extends hfa {
    private static final agrf h = agrf.h("com/google/android/apps/youtube/music/likes/DislikeButtonResponseServiceListener");

    public hfd(vxe vxeVar, ttm ttmVar, jin jinVar, huf hufVar, hpy hpyVar, hpb hpbVar, Executor executor, vxz vxzVar, amks amksVar, qcb qcbVar) {
        super(vxeVar, ttmVar, hpbVar, hpyVar, jinVar, hufVar, amksVar, qcbVar, executor, vxzVar);
    }

    @Override // defpackage.tnh
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void a(alri alriVar) {
        fhz.x(agpi.a, alriVar != null ? alriVar.c : Collections.EMPTY_LIST, null, this.a, this.f);
        this.g.s();
        d();
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        ((agrc) ((agrc) ((agrc) h.b().i(agso.a, "DislikeBtnRespSrvcLstnr")).j(toeVar)).k("com/google/android/apps/youtube/music/likes/DislikeButtonResponseServiceListener", "onErrorResponse", 'O', "DislikeButtonResponseServiceListener.java")).t("Error rating");
        jio jioVarE = jin.e();
        ((jik) jioVarE).k(this.b.b(toeVar));
        this.e.d(jioVarE.b());
        this.g.s();
    }
}
