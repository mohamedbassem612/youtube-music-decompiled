package defpackage;

import android.text.TextUtils;
import j$.time.Duration;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sct extends scr implements rsp {
    public final awmd a;
    public final Map b;
    public final Map e;
    public String f;
    public abnr g;
    private final awmd h;
    private final vyo i;
    private final rsr j;

    public sct(awmd awmdVar, rmp rmpVar, awmd awmdVar2, rsr rsrVar, awmd awmdVar3, vyo vyoVar) {
        super(awmdVar);
        this.b = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.h = awmdVar2;
        this.a = awmdVar3;
        this.j = rsrVar;
        this.i = vyoVar;
        this.g = abnr.DEFAULT;
        this.f = "";
        rsrVar.e(new scs(this));
    }

    private final boolean b(anfh anfhVar) {
        aosq aosqVar;
        if (!taq.aO(this.i)) {
            return false;
        }
        aosr aosrVar = anfhVar.f;
        if (aosrVar == null) {
            aosrVar = aosr.b;
        }
        if (aosrVar.c.size() == 0) {
            return false;
        }
        int iOrdinal = this.g.ordinal();
        if (iOrdinal != 0) {
            aosqVar = iOrdinal != 2 ? null : aosq.FULLSCREEN;
        } else {
            aosqVar = aosq.STANDARD;
        }
        if (aosqVar != null) {
            aosr aosrVar2 = anfhVar.f;
            if (aosrVar2 == null) {
                aosrVar2 = aosr.b;
            }
            if (new aihx(aosrVar2.c, aosr.a).contains(aosqVar)) {
                return false;
            }
        }
        return true;
    }

    private static final long d(anfh anfhVar, smr smrVar, acfw acfwVar) {
        long j = anfhVar.c;
        if ((anfhVar.b & 2) != 0) {
            long j2 = anfhVar.d;
            if (j2 != -1 && j2 >= j) {
                return j2;
            }
        }
        if (smrVar.c() != aixo.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE) {
            return anfhVar.d;
        }
        wjf wjfVarC = acfwVar.c();
        if (wjfVarC == null) {
            rmp.j(null, "PlayerResponseModel is null when calculating CueRange end offset.");
            return j;
        }
        long millis = Duration.ofSeconds(wjfVarC.a()).toMillis();
        if (j <= millis) {
            return nre.b(nre.f(wjfVarC, j), millis);
        }
        rmp.j(null, "Start offset exceeds video length when calculating CueRange end offset.");
        return j;
    }

    @Override // defpackage.scr
    public final void a(aizs aizsVar, smr smrVar) throws sav {
        aixr aixrVarA = aixr.a(aizsVar.e);
        if (aixrVarA == null) {
            aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
        }
        if (aixrVarA != aixr.TRIGGER_TYPE_MEDIA_TIME_RANGE) {
            throw new sav("Invalid trigger type for v2 CueRangeTriggerAdapter.", 4);
        }
    }

    @Override // defpackage.scr
    protected final void ad(aizs aizsVar) {
        snl snlVar = (snl) this.d.as(aizsVar.d).orElse(null);
        acfw acfwVar = (acfw) this.e.remove(aizsVar.d);
        this.b.remove(aizsVar.d);
        if (snlVar == null || acfwVar == null) {
            return;
        }
        ((xsc) this.a.io()).ab(acfwVar, aizsVar.d);
    }

    @Override // defpackage.scr
    public final boolean ae(aizs aizsVar, smr smrVar, sgp sgpVar) {
        acfw acfwVar;
        if ((aizsVar.b == 17 ? (anfh) aizsVar.c : anfh.a).e) {
            return false;
        }
        String strD = (TextUtils.isEmpty(this.f) && smrVar.c() == aixo.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE) ? this.j.d() : this.f;
        String str = (String) this.b.get(aizsVar.d);
        if (str == null || !TextUtils.equals(strD, str) || (acfwVar = (acfw) this.e.get(aizsVar.d)) == null) {
            return false;
        }
        anfh anfhVar = aizsVar.b == 17 ? (anfh) aizsVar.c : anfh.a;
        return !b(anfhVar) && new snh(anfhVar.c, d(anfhVar, smrVar, acfwVar)).a(acfwVar.a());
    }

    @Override // defpackage.rsp
    public final void c(String str, boolean z, boolean z2, boolean z3) {
        snl snlVar = (snl) this.d.as(str).orElse(null);
        if (snlVar != null) {
            aizs aizsVar = snlVar.b;
            aixr aixrVarA = aixr.a(aizsVar.e);
            if (aixrVarA == null) {
                aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
            }
            if (aixrVarA == aixr.TRIGGER_TYPE_MEDIA_TIME_RANGE) {
                if (z3) {
                    return;
                } else {
                    z3 = false;
                }
            }
            if (snlVar.c.c() == aixo.SLOT_TYPE_PLAYER_BYTES && snlVar.a == 8) {
                if (z || z3) {
                    return;
                } else {
                    ((tbt) this.h.io()).e(new aboj());
                }
            }
            if (b(aizsVar.b == 17 ? (anfh) aizsVar.c : anfh.a)) {
                return;
            }
            t(Arrays.asList(aizsVar));
        }
    }

    @Override // defpackage.scr
    public final void v(int i, aizs aizsVar, smr smrVar, sgp sgpVar) throws sav {
        String str = (String) sgpVar.c.orElse(null);
        if (str == null) {
            throw new sav("Invalid ad opportunity context model for v2 CueRangeTriggerAdapter. Missing content CPN.", 151);
        }
        acfw acfwVarB = this.j.b(str);
        if (acfwVarB == null) {
            throw new sav("Missing content VideoPlayback in cache for CPN in v2 CueRangeTriggerAdapter.", 152);
        }
        try {
            ((xsc) this.a.io()).ac(this, acfwVarB, (aizsVar.b == 17 ? (anfh) aizsVar.c : anfh.a).c, d(aizsVar.b == 17 ? (anfh) aizsVar.c : anfh.a, smrVar, acfwVarB), 2, i == 8 ? 3 : 2, aizsVar.d);
            this.b.put(aizsVar.d, str);
            this.e.put(aizsVar.d, acfwVarB);
        } catch (rso e) {
            throw new sav(e.toString(), e, e.a);
        }
    }
}
