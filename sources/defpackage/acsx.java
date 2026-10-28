package defpackage;

import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acsx extends abqh {
    private final acuw d;
    private final awmd e;
    private final awmd f;
    private final aunn g;
    private final abnl h;
    private final hno i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acsx(acuw acuwVar, hno hnoVar, awmd awmdVar, awmd awmdVar2, aunn aunnVar, abnl abnlVar, abnp abnpVar) {
        super(acsw.a, new agqj(aqdr.STREAMING_WATCH_RESPONSE_TYPE_REEL_WATCH_PAGE_RESPONSE), new wna(0));
        acuwVar.getClass();
        hnoVar.getClass();
        awmdVar.getClass();
        aunnVar.getClass();
        abnlVar.getClass();
        abnpVar.getClass();
        this.d = acuwVar;
        this.i = hnoVar;
        this.e = awmdVar;
        this.f = awmdVar2;
        this.g = aunnVar;
        this.h = abnlVar;
    }

    @Override // defpackage.abqh
    public final /* bridge */ /* synthetic */ wlu a() {
        acuv acuvVarN = acrz.n(this.h.b, this.d, this.i, this.e, this.f, this.g);
        acuvVarN.b = true;
        return acuvVarN;
    }

    @Override // defpackage.abqh
    public final alyi b(tmv tmvVar, MessageLite messageLite) {
        if (!awrc.c(tmvVar.Y(), Y()) || !(messageLite instanceof alqc)) {
            return null;
        }
        aihh aihhVar = (aihh) alyi.a.createBuilder();
        aihhVar.getClass();
        aihhVar.copyOnWrite();
        alyi alyiVar = (alyi) aihhVar.instance;
        alyiVar.f = (alqc) messageLite;
        alyiVar.e = 9;
        afyd.G(aqdr.STREAMING_WATCH_RESPONSE_TYPE_REEL_WATCH_PAGE_RESPONSE, aihhVar);
        afyd.H(aihhVar);
        return afyd.F(aihhVar);
    }

    @Override // defpackage.abqh
    public final /* synthetic */ Object e(tnw tnwVar) {
        Object obj = tnwVar.a;
        if (obj == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return new acrx((alqc) obj, (wja) null, tnwVar.d);
    }

    @Override // defpackage.abqh
    public final /* bridge */ /* synthetic */ Object f(MessageLite messageLite) {
        return new acrx((alqc) messageLite, (wja) null, false);
    }
}
