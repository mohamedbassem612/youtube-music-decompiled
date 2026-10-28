package app.rive;

import defpackage.aja;
import defpackage.ana;
import defpackage.and;
import defpackage.ane;
import defpackage.anf;
import defpackage.ang;
import defpackage.ani;
import defpackage.anj;
import defpackage.atqq;
import defpackage.awmy;
import defpackage.awnp;
import defpackage.awqg;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class RiveKt$RiveSurfaceHost$6$1 implements ane {
    public static final RiveKt$RiveSurfaceHost$6$1 INSTANCE = new RiveKt$RiveSurfaceHost$6$1();

    static final awmy measure_3p2s80s$lambda$0(anj anjVar, ani aniVar) {
        aniVar.getClass();
        ani.a(anjVar, 0, 0);
        return awmy.a;
    }

    @Override // defpackage.ane
    public /* synthetic */ int maxIntrinsicHeight(ana anaVar, List list, int i) {
        return aja.c(this, anaVar, list, i);
    }

    @Override // defpackage.ane
    public /* synthetic */ int maxIntrinsicWidth(ana anaVar, List list, int i) {
        return aja.d(this, anaVar, list, i);
    }

    @Override // defpackage.ane
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final anf mo201measure3p2s80s(ang angVar, List list, long j) {
        angVar.getClass();
        list.getClass();
        final anj anjVarE = ((and) atqq.ad(list)).e(j);
        return angVar.r(anjVarE.a, anjVarE.b, awnp.a, new awqg() { // from class: app.rive.RiveKt$RiveSurfaceHost$6$1$$ExternalSyntheticLambda0
            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                return RiveKt$RiveSurfaceHost$6$1.measure_3p2s80s$lambda$0(anjVarE, (ani) obj);
            }
        });
    }

    @Override // defpackage.ane
    public /* synthetic */ int minIntrinsicHeight(ana anaVar, List list, int i) {
        return aja.e(this, anaVar, list, i);
    }

    @Override // defpackage.ane
    public /* synthetic */ int minIntrinsicWidth(ana anaVar, List list, int i) {
        return aja.f(this, anaVar, list, i);
    }
}
