package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wnx {
    public String a;
    public String b;
    public String c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public String i;
    private appe j;
    private ajue k;
    private String l;
    private aisc m;

    public wnx(ajue ajueVar) {
        this.k = ajueVar;
    }

    public final String a() {
        if (this.l == null) {
            b();
        }
        return this.l;
    }

    public final void b() {
        appe appeVar = this.j;
        if (appeVar == null) {
            ajue ajueVar = this.k;
            if (ajueVar != null) {
                this.l = ajueVar.h;
                aihv aihvVar = ajueVar.g;
                aihw aihwVar = ajue.a;
                if (new aihx(aihvVar, aihwVar).contains(aisb.REGISTERED_GAIA_SERVICES_IS_MADISON_ACCOUNT)) {
                    this.b = this.k.d;
                }
                if (new aihx(this.k.g, aihwVar).contains(aisb.REGISTERED_GAIA_SERVICES_IS_YOUTUBE_PERSONA)) {
                    this.e = Boolean.TRUE;
                    ajue ajueVar2 = this.k;
                    String str = ajueVar2.d;
                    this.i = str;
                    this.l = str;
                    String str2 = ajueVar2.e;
                }
                if (new aihx(this.k.g, aihwVar).contains(aisb.REGISTERED_GAIA_SERVICES_IS_UNICORN_CHILD_ACCOUNT)) {
                    Boolean bool = Boolean.TRUE;
                    this.f = bool;
                    ajue ajueVar3 = this.k;
                    int iAV = a.aV(ajueVar3.f);
                    if (iAV != 0 && iAV == 3) {
                        this.l = ajueVar3.d;
                        this.h = bool;
                    }
                }
                if (new aihx(this.k.g, aihwVar).contains(aisb.REGISTERED_GAIA_SERVICES_HAS_GRIFFIN_POLICY)) {
                    Boolean bool2 = Boolean.TRUE;
                    this.g = bool2;
                    ajue ajueVar4 = this.k;
                    int iAV2 = a.aV(ajueVar4.f);
                    if (iAV2 != 0 && iAV2 == 3) {
                        this.l = ajueVar4.d;
                        this.h = bool2;
                    }
                }
                ajue ajueVar5 = this.k;
                this.a = ajueVar5.i;
                akkd akkdVar = ajueVar5.j;
                if (akkdVar == null) {
                    akkdVar = akkd.a;
                }
                this.c = akkdVar.b;
                return;
            }
            return;
        }
        if (appeVar.c.size() != 0) {
            for (aisd aisdVar : this.j.c) {
                if ((aisdVar.b & 2) != 0) {
                    aisf aisfVar = aisdVar.d;
                    if (aisfVar == null) {
                        aisfVar = aisf.a;
                    }
                    this.l = aisfVar.c;
                }
                if ((aisdVar.b & 4) != 0) {
                    aisg aisgVar = aisdVar.e;
                    if (aisgVar == null) {
                        aisgVar = aisg.a;
                    }
                    if (!aisgVar.b.isEmpty()) {
                        aisg aisgVar2 = aisdVar.e;
                        if (aisgVar2 == null) {
                            aisgVar2 = aisg.a;
                        }
                        this.b = aisgVar2.b;
                    }
                }
                if ((aisdVar.b & 1) != 0) {
                    aise aiseVar = aisdVar.c;
                    if (aiseVar == null) {
                        aiseVar = aise.a;
                    }
                    if (!aiseVar.c.isEmpty()) {
                        aise aiseVar2 = aisdVar.c;
                        if (aiseVar2 == null) {
                            aiseVar2 = aise.a;
                        }
                        this.a = aiseVar2.c;
                    }
                }
                if ((aisdVar.b & SemanticState.LiveRegion) != 0) {
                    aisi aisiVar = aisdVar.h;
                    if (aisiVar == null) {
                        aisiVar = aisi.a;
                    }
                    this.d = Boolean.valueOf(aisiVar.b);
                }
                if ((aisdVar.b & SemanticState.ReadOnly) != 0) {
                    akkd akkdVar2 = aisdVar.i;
                    if (akkdVar2 == null) {
                        akkdVar2 = akkd.a;
                    }
                    this.c = akkdVar2.b;
                }
                if ((aisdVar.b & 64) != 0 && this.m == null) {
                    aisc aiscVar = aisdVar.g;
                    if (aiscVar == null) {
                        aiscVar = aisc.b;
                    }
                    this.m = aiscVar;
                    aihv aihvVar2 = aiscVar.d;
                    aihw aihwVar2 = aisc.a;
                    if (new aihx(aihvVar2, aihwVar2).contains(aisb.REGISTERED_GAIA_SERVICES_IS_UNICORN_CHILD_ACCOUNT)) {
                        this.f = Boolean.TRUE;
                    }
                    if (new aihx(this.m.d, aihwVar2).contains(aisb.REGISTERED_GAIA_SERVICES_HAS_GRIFFIN_POLICY)) {
                        this.g = Boolean.TRUE;
                    }
                }
                if ((aisdVar.b & 8) != 0) {
                    this.e = Boolean.TRUE;
                    aish aishVar = aisdVar.f;
                    if (aishVar == null) {
                        aishVar = aish.a;
                    }
                    this.i = aishVar.b;
                    aish aishVar2 = aisdVar.f;
                    this.l = (aishVar2 == null ? aish.a : aishVar2).b;
                    if (aishVar2 == null) {
                        aishVar2 = aish.a;
                    }
                    String str3 = aishVar2.c;
                }
            }
        }
    }

    public wnx() {
    }

    public wnx(appe appeVar) {
        this.j = appeVar;
    }
}
