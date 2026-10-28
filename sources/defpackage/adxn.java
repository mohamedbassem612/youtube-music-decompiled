package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adxn implements adud {
    final /* synthetic */ aqi a;
    final /* synthetic */ adxp b;

    public adxn(adxp adxpVar, aqi aqiVar) {
        this.a = aqiVar;
        this.b = adxpVar;
    }

    @Override // defpackage.adud
    public final /* bridge */ /* synthetic */ void a(Object obj, acjx acjxVar) {
        adxv adxvVar;
        wgd wgdVar = (wgd) obj;
        adxp adxpVar = this.b;
        synchronized (adxpVar) {
            if (adxpVar.e == this.a) {
                adxpVar.e = null;
            }
            adxpVar.f = null;
        }
        adxp adxpVar2 = this.b;
        adxpVar2.d(wgdVar);
        adxpVar2.a.set(false);
        if (wgdVar == null) {
            aqi aqiVar = this.a;
            aihf aihfVarCreateBuilder = asii.a.createBuilder();
            aihf aihfVarCreateBuilder2 = atxp.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            ((atxp) aihfVarCreateBuilder2.instance).b = 2;
            atxp atxpVar = (atxp) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            asii asiiVar = (asii) aihfVarCreateBuilder.instance;
            atxpVar.getClass();
            asiiVar.c = atxpVar;
            asiiVar.b |= 1;
            aqiVar.b((asii) aihfVarCreateBuilder.build());
            return;
        }
        apok apokVar = wgdVar.a.u;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        aqi aqiVar2 = this.a;
        synchronized (adxpVar2) {
            adxvVar = !adxpVar2.e() ? adxpVar2.d : null;
        }
        if (adxvVar != null) {
            adxvVar.a(apokVar, new adxo(aqiVar2, 0));
            return;
        }
        aihf aihfVarCreateBuilder3 = asii.a.createBuilder();
        aihf aihfVarCreateBuilder4 = atxp.a.createBuilder();
        aihfVarCreateBuilder4.copyOnWrite();
        ((atxp) aihfVarCreateBuilder4.instance).b = 9;
        aihfVarCreateBuilder4.copyOnWrite();
        ((atxp) aihfVarCreateBuilder4.instance).c = "Section list mutation operations processor is null.";
        atxp atxpVar2 = (atxp) aihfVarCreateBuilder4.build();
        aihfVarCreateBuilder3.copyOnWrite();
        asii asiiVar2 = (asii) aihfVarCreateBuilder3.instance;
        atxpVar2.getClass();
        asiiVar2.c = atxpVar2;
        asiiVar2.b |= 1;
        aqiVar2.b((asii) aihfVarCreateBuilder3.build());
    }

    @Override // defpackage.adud
    public final void b(toe toeVar, acjx acjxVar) {
        adxp adxpVar = this.b;
        synchronized (adxpVar) {
            if (adxpVar.e == this.a) {
                adxpVar.e = null;
            }
            adxpVar.f = null;
        }
        this.b.a.set(false);
        aqi aqiVar = this.a;
        aihf aihfVarCreateBuilder = asii.a.createBuilder();
        aihf aihfVarCreateBuilder2 = atxp.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        ((atxp) aihfVarCreateBuilder2.instance).b = 2;
        atxp atxpVar = (atxp) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        asii asiiVar = (asii) aihfVarCreateBuilder.instance;
        atxpVar.getClass();
        asiiVar.c = atxpVar;
        asiiVar.b |= 1;
        aqiVar.b((asii) aihfVarCreateBuilder.build());
    }
}
