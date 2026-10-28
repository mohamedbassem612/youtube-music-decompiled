package defpackage;

import app.rive.semantics.SemanticState;
import j$.time.Instant;
import j$.util.Optional;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acuv extends wlu {
    public boolean D;
    public int E;
    public int F;
    public aihf G;
    public String a;
    public boolean b;
    public Optional c;
    public String d;
    public alqg e;

    /* JADX WARN: Illegal instructions before constructor call */
    public acuv(abxv abxvVar, zwa zwaVar, boolean z, boolean z2, boolean z3) {
        Optional optionalEmpty;
        if (z3) {
            aihf aihfVarCreateBuilder = ascs.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            ascs ascsVar = (ascs) aihfVarCreateBuilder.instance;
            ascsVar.b |= 1;
            ascsVar.c = true;
            aijp aijpVarAv = ahng.av(Instant.now().plusMillis(120000L));
            aihfVarCreateBuilder.copyOnWrite();
            ascs ascsVar2 = (ascs) aihfVarCreateBuilder.instance;
            aijpVarAv.getClass();
            ascsVar2.d = aijpVarAv;
            ascsVar2.b |= 2;
            optionalEmpty = Optional.of((ascs) aihfVarCreateBuilder.build());
        } else {
            optionalEmpty = Optional.empty();
        }
        super("reel/reel_item_watch", abxvVar, zwaVar, 1, true, optionalEmpty, z, z2);
        this.E = 1;
        this.b = false;
        this.c = Optional.empty();
        this.d = "";
        this.F = 1;
    }

    private static final String F(String str) {
        int i = agxm.b;
        return agxl.a.c(j(str), StandardCharsets.UTF_8).toString();
    }

    @Override // defpackage.wkf
    public final String Y() {
        dov dovVarE = e();
        dovVarE.F("identity", this.u.k());
        if (this.c.isPresent()) {
            ((Boolean) this.c.get()).booleanValue();
            dovVarE.G("shouldEnableRotation", false);
        }
        if (!this.d.isEmpty() && this.F == 2) {
            dovVarE.F("reelWatchEndpointIdentifier", this.d);
        }
        return dovVarE.D();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alqb.a.createBuilder();
        alvr alvrVar = (alvr) this.G.build();
        aihfVarCreateBuilder.copyOnWrite();
        alqb alqbVar = (alqb) aihfVarCreateBuilder.instance;
        alvrVar.getClass();
        alqbVar.e = alvrVar;
        alqbVar.b |= 4;
        int i = this.E;
        aihfVarCreateBuilder.copyOnWrite();
        alqb alqbVar2 = (alqb) aihfVarCreateBuilder.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        alqbVar2.d = i2;
        alqbVar2.b |= 2;
        String str = this.a;
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alqb alqbVar3 = (alqb) aihfVarCreateBuilder.instance;
            alqbVar3.b |= 8;
            alqbVar3.f = str;
        }
        boolean z = this.b;
        aihfVarCreateBuilder.copyOnWrite();
        alqb alqbVar4 = (alqb) aihfVarCreateBuilder.instance;
        alqbVar4.b |= 16;
        alqbVar4.g = z;
        if (this.c.isPresent()) {
            ((Boolean) this.c.get()).booleanValue();
            aihfVarCreateBuilder.copyOnWrite();
            alqb alqbVar5 = (alqb) aihfVarCreateBuilder.instance;
            alqbVar5.b |= 64;
            alqbVar5.h = false;
        }
        if (!this.d.isEmpty()) {
            String str2 = this.d;
            aihfVarCreateBuilder.copyOnWrite();
            alqb alqbVar6 = (alqb) aihfVarCreateBuilder.instance;
            str2.getClass();
            alqbVar6.b |= SemanticState.Focused;
            alqbVar6.i = str2;
        }
        alqg alqgVar = this.e;
        if (alqgVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alqb alqbVar7 = (alqb) aihfVarCreateBuilder.instance;
            alqbVar7.j = alqgVar;
            alqbVar7.b |= SemanticState.Hidden;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        if (this.d.isEmpty() || this.F != 2) {
            aihf aihfVar = this.G;
            aihfVar.getClass();
            if (this.E != 3) {
                boolean zIsEmpty = ((alvr) aihfVar.instance).i.isEmpty();
                aihf aihfVar2 = this.G;
                boolean z = true;
                if (zIsEmpty) {
                    ahno.O(!((alvr) aihfVar2.instance).d.isEmpty());
                    return;
                }
                if (((alvr) aihfVar2.instance).d.isEmpty() && ((alvr) this.G.instance).j <= 0) {
                    z = false;
                }
                ahno.O(z);
            }
        }
    }

    public final dov e() {
        alqg alqgVar;
        dov dovVar = new dov((int[]) null);
        dovVar.F("serviceName", this.t);
        int i = this.E;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        dovVar.E("inputType", i2);
        dovVar.F("videoId", ((alvr) this.G.instance).d);
        dovVar.F("playlistId", j(((alvr) this.G.instance).i));
        dovVar.E("playlistIndex", f(((alvr) this.G.instance).j));
        dovVar.F("playerParams", F(((alvr) this.G.instance).l));
        dovVar.F("reelWatchEndpointParams", F(this.a));
        if (this.D && (alqgVar = this.e) != null) {
            dovVar.H("clientHistoryContext", alqgVar.toByteArray());
        }
        return dovVar;
    }
}
