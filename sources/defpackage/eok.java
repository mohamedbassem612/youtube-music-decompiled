package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class eok implements eod {
    public aiof b;
    public final fsz c;

    public eok(Context context, aiof aiofVar) {
        this.c = new fsz(context);
        this.b = aiofVar;
    }

    private final aiof h(eoe eoeVar) {
        Integer num = eoeVar.a;
        if (num != null && num.intValue() > 0) {
            aihf builder = this.b.toBuilder();
            int iIntValue = num.intValue();
            builder.copyOnWrite();
            aiof aiofVar = (aiof) builder.instance;
            aiofVar.b |= 8;
            aiofVar.f = iIntValue;
            this.b = (aiof) builder.build();
        }
        aiof aiofVar2 = this.b;
        Long l = eoeVar.b;
        if (l == null || l.longValue() == 0) {
            return aiofVar2;
        }
        aihf builder2 = aiofVar2.toBuilder();
        long jLongValue = l.longValue();
        builder2.copyOnWrite();
        aiof aiofVar3 = (aiof) builder2.instance;
        aiofVar3.b |= 32;
        aiofVar3.h = jLongValue;
        return (aiof) builder2.build();
    }

    private final void i(ainy ainyVar, aiof aiofVar) {
        if (ainyVar != null) {
            try {
                aihf aihfVarCreateBuilder = aioi.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aioi aioiVar = (aioi) aihfVarCreateBuilder.instance;
                aiofVar.getClass();
                aioiVar.e = aiofVar;
                aioiVar.b |= 1;
                aihfVarCreateBuilder.copyOnWrite();
                aioi aioiVar2 = (aioi) aihfVarCreateBuilder.instance;
                aioiVar2.d = ainyVar;
                aioiVar2.c = 2;
                this.c.a((aioi) aihfVarCreateBuilder.build());
            } catch (Throwable th) {
                eov.f("BillingLogger", "Unable to log.", th);
            }
        }
    }

    @Override // defpackage.eod
    public final void a(ainy ainyVar) {
        try {
            i(ainyVar, this.b);
        } catch (Throwable th) {
            eov.f("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // defpackage.eod
    public final void b(ainy ainyVar, eoe eoeVar) {
        try {
            aiof aiofVarH = h(eoeVar);
            Boolean bool = eoeVar.c;
            if (bool != null && ainyVar != null) {
                aihf builder = ainyVar.toBuilder();
                aihf builder2 = (ainyVar.c == 7 ? (aioh) ainyVar.d : aioh.a).toBuilder();
                boolean zBooleanValue = bool.booleanValue();
                builder2.copyOnWrite();
                aioh aiohVar = (aioh) builder2.instance;
                aiohVar.b |= 2;
                aiohVar.c = zBooleanValue;
                builder.copyOnWrite();
                ainy ainyVar2 = (ainy) builder.instance;
                aioh aiohVar2 = (aioh) builder2.build();
                aiohVar2.getClass();
                ainyVar2.d = aiohVar2;
                ainyVar2.c = 7;
                ainyVar = (ainy) builder.build();
            }
            i(ainyVar, aiofVarH);
        } catch (Throwable th) {
            eov.f("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // defpackage.eod
    public final void c(ainz ainzVar, eoe eoeVar) {
        try {
            aiof aiofVarH = h(eoeVar);
            Boolean bool = eoeVar.c;
            if (bool != null && ainzVar != null) {
                aihf builder = ainzVar.toBuilder();
                aihf builder2 = (ainzVar.c == 4 ? (aioh) ainzVar.d : aioh.a).toBuilder();
                boolean zBooleanValue = bool.booleanValue();
                builder2.copyOnWrite();
                aioh aiohVar = (aioh) builder2.instance;
                aiohVar.b |= 2;
                aiohVar.c = zBooleanValue;
                builder.copyOnWrite();
                ainz ainzVar2 = (ainz) builder.instance;
                aioh aiohVar2 = (aioh) builder2.build();
                aiohVar2.getClass();
                ainzVar2.d = aiohVar2;
                ainzVar2.c = 4;
                ainzVar = (ainz) builder.build();
            }
            g(ainzVar, aiofVarH);
        } catch (Throwable th) {
            eov.f("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // defpackage.eod
    public final void d(eoh eohVar, long j) {
        try {
            aihf aihfVarCreateBuilder = aioe.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aioe aioeVar = (aioe) aihfVarCreateBuilder.instance;
            aioeVar.d = 3;
            aioeVar.b |= 2;
            aihfVarCreateBuilder.aE(aioc.IN_APP_BILLING_RESULT_UPDATE_ACTION);
            if (eohVar != null) {
                aihf aihfVarCreateBuilder2 = aioa.a.createBuilder();
                int i = eohVar.a;
                aihfVarCreateBuilder2.copyOnWrite();
                aioa aioaVar = (aioa) aihfVarCreateBuilder2.instance;
                aioaVar.b |= 1;
                aioaVar.c = i;
                String str = eohVar.c;
                aihfVarCreateBuilder2.copyOnWrite();
                aioa aioaVar2 = (aioa) aihfVarCreateBuilder2.instance;
                str.getClass();
                aioaVar2.b |= 2;
                aioaVar2.d = str;
                aihfVarCreateBuilder.copyOnWrite();
                aioe aioeVar2 = (aioe) aihfVarCreateBuilder.instance;
                aioa aioaVar3 = (aioa) aihfVarCreateBuilder2.build();
                aioaVar3.getClass();
                aioeVar2.f = aioaVar3;
                aioeVar2.b |= 4;
            }
            aihf aihfVarCreateBuilder3 = aioi.a.createBuilder();
            aiof aiofVar = this.b;
            if (j != 0) {
                aihf builder = aiofVar.toBuilder();
                builder.copyOnWrite();
                aiof aiofVar2 = (aiof) builder.instance;
                aiofVar2.b |= 32;
                aiofVar2.h = j;
                aiofVar = (aiof) builder.build();
            }
            aihfVarCreateBuilder3.copyOnWrite();
            aioi aioiVar = (aioi) aihfVarCreateBuilder3.instance;
            aiofVar.getClass();
            aioiVar.e = aiofVar;
            aioiVar.b |= 1;
            aihfVarCreateBuilder3.copyOnWrite();
            aioi aioiVar2 = (aioi) aihfVarCreateBuilder3.instance;
            aioe aioeVar3 = (aioe) aihfVarCreateBuilder.build();
            aioeVar3.getClass();
            aioiVar2.d = aioeVar3;
            aioiVar2.c = 5;
            this.c.a((aioi) aihfVarCreateBuilder3.build());
        } catch (Throwable th) {
            eov.f("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // defpackage.eod
    public final void e(aioj aiojVar) {
        try {
            aihf aihfVarCreateBuilder = aioi.a.createBuilder();
            aiof aiofVar = this.b;
            aihfVarCreateBuilder.copyOnWrite();
            aioi aioiVar = (aioi) aihfVarCreateBuilder.instance;
            aiofVar.getClass();
            aioiVar.e = aiofVar;
            aioiVar.b |= 1;
            aihf aihfVarCreateBuilder2 = aioe.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            aioe aioeVar = (aioe) aihfVarCreateBuilder2.instance;
            aioeVar.b |= 1;
            aioeVar.c = "ProxyBillingBroadcastReceiver";
            aihfVarCreateBuilder2.copyOnWrite();
            aioe aioeVar2 = (aioe) aihfVarCreateBuilder2.instance;
            aioeVar2.d = 1;
            aioeVar2.b |= 2;
            aihfVarCreateBuilder2.copyOnWrite();
            aioe aioeVar3 = (aioe) aihfVarCreateBuilder2.instance;
            aiojVar.getClass();
            aioeVar3.g = aiojVar;
            aioeVar3.b |= 32;
            aihfVarCreateBuilder.copyOnWrite();
            aioi aioiVar2 = (aioi) aihfVarCreateBuilder.instance;
            aioe aioeVar4 = (aioe) aihfVarCreateBuilder2.build();
            aioeVar4.getClass();
            aioiVar2.d = aioeVar4;
            aioiVar2.c = 5;
            this.c.a((aioi) aihfVarCreateBuilder.build());
        } catch (Throwable th) {
            eov.f("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // defpackage.eod
    public final void f(aiok aiokVar) {
        try {
            fsz fszVar = this.c;
            aihf aihfVarCreateBuilder = aioi.a.createBuilder();
            aiof aiofVar = this.b;
            aihfVarCreateBuilder.copyOnWrite();
            aioi aioiVar = (aioi) aihfVarCreateBuilder.instance;
            aiofVar.getClass();
            aioiVar.e = aiofVar;
            aioiVar.b |= 1;
            aihfVarCreateBuilder.copyOnWrite();
            aioi aioiVar2 = (aioi) aihfVarCreateBuilder.instance;
            aiokVar.getClass();
            aioiVar2.d = aiokVar;
            aioiVar2.c = 8;
            fszVar.a((aioi) aihfVarCreateBuilder.build());
        } catch (Throwable th) {
            eov.f("BillingLogger", "Unable to log.", th);
        }
    }

    public final void g(ainz ainzVar, aiof aiofVar) {
        if (ainzVar != null) {
            try {
                aihf aihfVarCreateBuilder = aioi.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aioi aioiVar = (aioi) aihfVarCreateBuilder.instance;
                aiofVar.getClass();
                aioiVar.e = aiofVar;
                aioiVar.b |= 1;
                aihfVarCreateBuilder.copyOnWrite();
                aioi aioiVar2 = (aioi) aihfVarCreateBuilder.instance;
                aioiVar2.d = ainzVar;
                aioiVar2.c = 3;
                this.c.a((aioi) aihfVarCreateBuilder.build());
            } catch (Throwable th) {
                eov.f("BillingLogger", "Unable to log.", th);
            }
        }
    }
}
