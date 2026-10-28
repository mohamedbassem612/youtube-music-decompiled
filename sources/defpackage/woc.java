package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class woc extends wlu {
    public String a;
    public String b;
    public String c;
    public aigj d;
    public aigj e;

    public woc(abxv abxvVar, zwa zwaVar) {
        super("assistant", abxvVar, zwaVar, 1, true, null, null);
    }

    @Override // defpackage.wkf
    public final String Y() {
        dov dovVarE = E();
        String str = this.a;
        if (str == null) {
            str = "";
        }
        dovVarE.F("query", str);
        dovVarE.G("isVideoCurrentlyPlaying", !TextUtils.isEmpty(this.b));
        dovVarE.G("isAdPlaying", false);
        return dovVarE.D();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = allj.a.createBuilder();
        String str = this.a;
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            allj alljVar = (allj) aihfVarCreateBuilder.instance;
            alljVar.b |= 16;
            alljVar.f = str;
        }
        aigj aigjVar = this.d;
        if (aigjVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            allj alljVar2 = (allj) aihfVarCreateBuilder.instance;
            alljVar2.b |= 16777216;
            alljVar2.m = aigjVar;
        }
        aigj aigjVar2 = this.e;
        if (aigjVar2 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            allj alljVar3 = (allj) aihfVarCreateBuilder.instance;
            alljVar3.b |= 4;
            alljVar3.e = aigjVar2;
        }
        if (v()) {
            String str2 = this.i;
            aihfVarCreateBuilder.copyOnWrite();
            allj alljVar4 = (allj) aihfVarCreateBuilder.instance;
            str2.getClass();
            alljVar4.b |= Integer.MIN_VALUE;
            alljVar4.n = str2;
        }
        aihf aihfVarCreateBuilder2 = apmk.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        apmk apmkVar = (apmk) aihfVarCreateBuilder2.instance;
        apmkVar.b |= 32;
        apmkVar.e = false;
        aihf aihfVarCreateBuilder3 = apml.a.createBuilder();
        if (!TextUtils.isEmpty(this.b)) {
            String str3 = this.b;
            aihfVarCreateBuilder3.copyOnWrite();
            apml apmlVar = (apml) aihfVarCreateBuilder3.instance;
            str3.getClass();
            apmlVar.b |= 2;
            apmlVar.d = str3;
            aihfVarCreateBuilder3.copyOnWrite();
            apml apmlVar2 = (apml) aihfVarCreateBuilder3.instance;
            apmlVar2.c = 1;
            apmlVar2.b |= 1;
            aihfVarCreateBuilder2.copyOnWrite();
            apmk apmkVar2 = (apmk) aihfVarCreateBuilder2.instance;
            apmkVar2.b |= 8;
            apmkVar2.c = true;
        }
        if (!TextUtils.isEmpty(this.c)) {
            String str4 = this.c;
            aihfVarCreateBuilder2.copyOnWrite();
            apmk apmkVar3 = (apmk) aihfVarCreateBuilder2.instance;
            str4.getClass();
            apmkVar3.b |= 16;
            apmkVar3.d = str4;
        }
        aihfVarCreateBuilder3.copyOnWrite();
        apml apmlVar3 = (apml) aihfVarCreateBuilder3.instance;
        apmk apmkVar4 = (apmk) aihfVarCreateBuilder2.build();
        apmkVar4.getClass();
        apmlVar3.e = apmkVar4;
        apmlVar3.b |= 32;
        aihf aihfVarCreateBuilder4 = apmm.a.createBuilder();
        aihfVarCreateBuilder4.copyOnWrite();
        apmm apmmVar = (apmm) aihfVarCreateBuilder4.instance;
        apml apmlVar4 = (apml) aihfVarCreateBuilder3.build();
        apmlVar4.getClass();
        apmmVar.c = apmlVar4;
        apmmVar.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        allj alljVar5 = (allj) aihfVarCreateBuilder.instance;
        apmm apmmVar2 = (apmm) aihfVarCreateBuilder4.build();
        apmmVar2.getClass();
        alljVar5.d = apmmVar2;
        alljVar5.b |= 2;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        ahno.F(this.a != null);
    }
}
