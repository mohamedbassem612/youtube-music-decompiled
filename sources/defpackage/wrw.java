package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wrw extends wlu {
    private alap D;
    public boolean a;
    public ajgq b;
    public agkj c;
    private String d;
    private String e;

    public wrw(String str, abxv abxvVar, zwa zwaVar, boolean z, int i) {
        super(str, abxvVar, zwaVar, i, z, null, null);
        this.c = agpn.b;
    }

    public final void F(String str) {
        this.d = j(str);
    }

    public final void G(String str) {
        this.e = j(str);
    }

    @Override // defpackage.wlu
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final aihf a() {
        aihf aihfVarCreateBuilder = aolj.a.createBuilder();
        String str = this.d;
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aolj aoljVar = (aolj) aihfVarCreateBuilder.instance;
            aoljVar.b |= 2;
            aoljVar.d = str;
        }
        if (!TextUtils.isEmpty(this.i)) {
            String str2 = this.i;
            aihfVarCreateBuilder.copyOnWrite();
            aolj aoljVar2 = (aolj) aihfVarCreateBuilder.instance;
            str2.getClass();
            aoljVar2.b |= 32;
            aoljVar2.g = str2;
        }
        String str3 = this.e;
        if (str3 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aolj aoljVar3 = (aolj) aihfVarCreateBuilder.instance;
            aoljVar3.b |= 16;
            aoljVar3.f = str3;
        }
        alap alapVar = this.D;
        if (alapVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aolj aoljVar4 = (aolj) aihfVarCreateBuilder.instance;
            aoljVar4.e = alapVar;
            aoljVar4.b |= 8;
        }
        boolean z = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        aolj aoljVar5 = (aolj) aihfVarCreateBuilder.instance;
        aoljVar5.b |= 64;
        aoljVar5.h = z;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    public final String Y() {
        dov dovVarE = E();
        dovVarE.F("params", this.e);
        dovVarE.F("panelId", this.d);
        dovVarE.F("continuation", this.i);
        alap alapVar = this.D;
        if (alapVar != null) {
            dovVarE.H("formData", alapVar.toByteArray());
        } else {
            dovVarE.F("formData", "null");
        }
        dovVarE.F("query", null);
        dovVarE.F("isClientRouted", String.valueOf(this.a));
        ajgq ajgqVar = this.b;
        if (ajgqVar != null) {
            dovVarE.F("engagementType", ajgqVar.name());
        }
        return dovVarE.D();
    }

    @Override // defpackage.wkf
    protected final void b() {
        A(this.d, this.i);
    }

    public final void e(alap alapVar) {
        if (alapVar != null) {
            this.D = alapVar;
        }
    }
}
