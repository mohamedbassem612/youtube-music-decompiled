package defpackage;

import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abqu extends abqh {
    private final tbt d;
    private final wup e;
    private final wjz f;
    private final abnl g;
    private final abnp h;

    /* JADX WARN: Illegal instructions before constructor call */
    public abqu(tbt tbtVar, wup wupVar, wjz wjzVar, abnl abnlVar, abnp abnpVar) {
        tbtVar.getClass();
        wupVar.getClass();
        wjzVar.getClass();
        abnpVar.getClass();
        abqt abqtVar = abqt.a;
        agkz agkzVarR = agkz.r(aqdr.STREAMING_WATCH_RESPONSE_TYPE_WATCH_NEXT_RESPONSE, aqdr.STREAMING_WATCH_RESPONSE_TYPE_INCREMENTAL_WATCH_NEXT_RESPONSE, aqdr.STREAMING_WATCH_RESPONSE_TYPE_AD_WATCH_PAGE_RESPONSE);
        agkzVarR.getClass();
        super(abqtVar, agkzVarR, new wna(3));
        this.d = tbtVar;
        this.e = wupVar;
        this.f = wjzVar;
        this.g = abnlVar;
        this.h = abnpVar;
    }

    @Override // defpackage.abqh
    public final /* synthetic */ wlu a() {
        tbt tbtVar = this.d;
        wup wupVar = this.e;
        abnp abnpVar = this.h;
        abnl abnlVar = this.g;
        return axfd.m(tbtVar, wupVar, abnlVar.w(), abnlVar.u(), abnlVar.v(), abnlVar.a(), abnlVar.r(), abnlVar.Q(), abnlVar.m(), abnlVar.n(), abnlVar.k(), abnpVar.b);
    }

    @Override // defpackage.abqh
    public final alyi b(tmv tmvVar, MessageLite messageLite) {
        if (!awrc.c(tmvVar.Y(), Y()) || !(messageLite instanceof amae)) {
            return null;
        }
        aihh aihhVar = (aihh) alyi.a.createBuilder();
        aihhVar.getClass();
        aihhVar.copyOnWrite();
        alyi alyiVar = (alyi) aihhVar.instance;
        alyiVar.f = (amae) messageLite;
        alyiVar.e = 3;
        afyd.G(aqdr.STREAMING_WATCH_RESPONSE_TYPE_WATCH_NEXT_RESPONSE, aihhVar);
        afyd.H(aihhVar);
        return afyd.F(aihhVar);
    }

    @Override // defpackage.abqh
    public final /* synthetic */ Object e(tnw tnwVar) {
        Object obj = tnwVar.a;
        if (obj != null) {
            return f((amae) obj);
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.abqh
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final wgi f(amae amaeVar) {
        this.f.a(amaeVar);
        return new wgi(amaeVar);
    }
}
