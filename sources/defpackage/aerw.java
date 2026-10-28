package defpackage;

import com.google.cardboard.sdk.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aerw implements qtj {
    private final xeu a;
    private final agfr b;

    public aerw(xeu xeuVar, awmd awmdVar) {
        this.a = xeuVar;
        this.b = aguu.al(new aeru(awmdVar, 2));
    }

    @Override // defpackage.qtj
    public final void a(qti qtiVar) {
        agda agdaVarE = qtiVar.e();
        if (agdaVarE.b.size() != 0) {
            aiie<ahwn> aiieVar = agdaVarE.b;
            if (aiieVar.isEmpty()) {
                return;
            }
            for (ahwn ahwnVar : aiieVar) {
                aihf aihfVarCreateBuilder = aqds.a.createBuilder();
                aigj byteString = ahwnVar.toByteString();
                aihfVarCreateBuilder.copyOnWrite();
                aqds aqdsVar = (aqds) aihfVarCreateBuilder.instance;
                aqdsVar.b |= 1;
                aqdsVar.c = byteString;
                boolean zContains = ((agkz) this.b.io()).contains(Long.valueOf(ahwnVar.c));
                xeu xeuVar = this.a;
                if (zContains) {
                    if (xeuVar.b) {
                        xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.STREAMZ_INCREMENTED);
                        xffVarA.n = "";
                        ztf ztfVar = xffVarA.k.e;
                        xffVarA.l = ztfVar.a();
                        ztfVar.l(xffVarA);
                    } else {
                        alos alosVar = (alos) alou.a.createBuilder();
                        alosVar.copyOnWrite();
                        alou alouVar = (alou) alosVar.instance;
                        aqds aqdsVar2 = (aqds) aihfVarCreateBuilder.build();
                        aqdsVar2.getClass();
                        alouVar.d = aqdsVar2;
                        alouVar.c = R.styleable.AppCompatTheme_windowNoTitle;
                        xeuVar.j((alou) alosVar.build(), zvz.a, -1L, null);
                    }
                } else if (xeuVar.b) {
                    xff xffVarA2 = xeuVar.a(aihfVarCreateBuilder, alot.STREAMZ_INCREMENTED);
                    ztf ztfVar2 = xffVarA2.k.e;
                    xffVarA2.l = ztfVar2.a();
                    ztfVar2.l(xffVarA2);
                } else {
                    alos alosVar2 = (alos) alou.a.createBuilder();
                    alosVar2.copyOnWrite();
                    alou alouVar2 = (alou) alosVar2.instance;
                    aqds aqdsVar3 = (aqds) aihfVarCreateBuilder.build();
                    aqdsVar3.getClass();
                    alouVar2.d = aqdsVar3;
                    alouVar2.c = R.styleable.AppCompatTheme_windowNoTitle;
                    xeuVar.e((alou) alosVar2.build());
                }
            }
        }
    }
}
