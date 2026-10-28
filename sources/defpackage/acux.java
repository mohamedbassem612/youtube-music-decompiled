package defpackage;

import app.rive.semantics.SemanticState;
import j$.time.Instant;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acux extends wlu {
    public acrt D;
    public aooi E;
    public String a;
    public String b;
    public Optional c;
    public alqg d;
    public apfu e;

    /* JADX WARN: Illegal instructions before constructor call */
    public acux(abxv abxvVar, zwa zwaVar, boolean z, boolean z2) {
        Optional optionalEmpty;
        if (z2) {
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
        super("reel/reel_watch_sequence", abxvVar, zwaVar, 1, z, optionalEmpty);
        this.c = Optional.empty();
        o(vzh.b);
    }

    @Override // defpackage.wkf
    public final String Y() {
        dov dovVar = new dov((int[]) null);
        dovVar.F("serviceName", this.t);
        dovVar.F("identity", this.u.k());
        dovVar.F("continuation", j(this.a));
        dovVar.F("sequenceParams", j(this.b));
        if (this.c.isPresent()) {
            ((Boolean) this.c.get()).booleanValue();
            dovVar.G("enableRotation", false);
        }
        return dovVar.D();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alqk.a.createBuilder();
        String str = this.b;
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alqk alqkVar = (alqk) aihfVarCreateBuilder.instance;
            alqkVar.c = 4;
            alqkVar.d = str;
        }
        String str2 = this.a;
        if (str2 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alqk alqkVar2 = (alqk) aihfVarCreateBuilder.instance;
            alqkVar2.c = 3;
            alqkVar2.d = str2;
        }
        if (this.c.isPresent()) {
            ((Boolean) this.c.get()).booleanValue();
            aihfVarCreateBuilder.copyOnWrite();
            alqk alqkVar3 = (alqk) aihfVarCreateBuilder.instance;
            alqkVar3.b |= 64;
            alqkVar3.g = false;
        }
        alqg alqgVar = this.d;
        if (alqgVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alqk alqkVar4 = (alqk) aihfVarCreateBuilder.instance;
            alqkVar4.i = alqgVar;
            alqkVar4.b |= SemanticState.Hidden;
        }
        acrt acrtVar = this.D;
        if (acrtVar != null) {
            int iOrdinal = acrtVar.ordinal();
            if (iOrdinal == 0) {
                aihfVarCreateBuilder.copyOnWrite();
                alqk alqkVar5 = (alqk) aihfVarCreateBuilder.instance;
                alqkVar5.h = 1;
                alqkVar5.b |= SemanticState.Focused;
            } else if (iOrdinal == 1) {
                aihfVarCreateBuilder.copyOnWrite();
                alqk alqkVar6 = (alqk) aihfVarCreateBuilder.instance;
                alqkVar6.h = 2;
                alqkVar6.b |= SemanticState.Focused;
            }
        }
        aooi aooiVar = this.E;
        if (aooiVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alqk alqkVar7 = (alqk) aihfVarCreateBuilder.instance;
            alqkVar7.f = aooiVar;
            alqkVar7.b |= 16;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        String str = this.b;
        ahno.O((str == null) ^ ahno.aa(this.a));
    }
}
