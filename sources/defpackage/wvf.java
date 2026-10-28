package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wvf extends wlu {
    private final String D;
    private final String E;
    private final String F;
    private final String G;
    private final String H;
    public String a;
    public aigj b;
    public byte[] c;
    public String d;
    private String e;

    public wvf(abxv abxvVar, zwa zwaVar) {
        super("ypc/complete_transaction", abxvVar, zwaVar, 1, true, null, null);
        this.e = "";
        this.a = "";
        this.D = "";
        this.b = aigj.d;
        this.E = "";
        this.F = "";
        this.G = "";
        this.c = wvi.c;
        this.d = "";
        this.H = "";
        this.r = "";
    }

    @Override // defpackage.wlu
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final aihf a() {
        aihf aihfVarCreateBuilder = amaw.a.createBuilder();
        String str = this.D;
        if (!TextUtils.isEmpty(str)) {
            aihfVarCreateBuilder.copyOnWrite();
            amaw amawVar = (amaw) aihfVarCreateBuilder.instance;
            amawVar.b |= 2;
            amawVar.d = str;
        }
        aigj aigjVar = this.b;
        if (aigjVar != null && !aigjVar.E()) {
            aihfVarCreateBuilder.copyOnWrite();
            amaw amawVar2 = (amaw) aihfVarCreateBuilder.instance;
            amawVar2.b |= 4;
            amawVar2.e = aigjVar;
        }
        if (!TextUtils.isEmpty(this.e)) {
            String str2 = this.e;
            aihfVarCreateBuilder.copyOnWrite();
            amaw amawVar3 = (amaw) aihfVarCreateBuilder.instance;
            str2.getClass();
            amawVar3.b |= 8;
            amawVar3.f = str2;
        } else if (!TextUtils.isEmpty(this.a)) {
            String str3 = this.a;
            aihfVarCreateBuilder.copyOnWrite();
            amaw amawVar4 = (amaw) aihfVarCreateBuilder.instance;
            str3.getClass();
            amawVar4.b |= 16;
            amawVar4.g = str3;
        }
        if (!TextUtils.isEmpty(this.d)) {
            String str4 = this.d;
            aihfVarCreateBuilder.copyOnWrite();
            amaw amawVar5 = (amaw) aihfVarCreateBuilder.instance;
            str4.getClass();
            amawVar5.b |= 32;
            amawVar5.h = str4;
        }
        String str5 = this.E;
        if (!TextUtils.isEmpty(str5)) {
            String str6 = this.F;
            if (!TextUtils.isEmpty(str6)) {
                aihf aihfVarCreateBuilder2 = alnt.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                alnt alntVar = (alnt) aihfVarCreateBuilder2.instance;
                alntVar.b |= 2;
                alntVar.f = str5;
                aihfVarCreateBuilder2.copyOnWrite();
                alnt alntVar2 = (alnt) aihfVarCreateBuilder2.instance;
                alntVar2.b |= 4;
                alntVar2.g = str6;
                aihfVarCreateBuilder.copyOnWrite();
                amaw amawVar6 = (amaw) aihfVarCreateBuilder.instance;
                alnt alntVar3 = (alnt) aihfVarCreateBuilder2.build();
                alntVar3.getClass();
                amawVar6.i = alntVar3;
                amawVar6.b |= 64;
            }
        }
        String str7 = this.G;
        aihfVarCreateBuilder.copyOnWrite();
        amaw amawVar7 = (amaw) aihfVarCreateBuilder.instance;
        amawVar7.b |= SemanticState.Hidden;
        amawVar7.k = str7;
        byte[] bArr = this.c;
        if (bArr != null) {
            aigj aigjVarV = aigj.v(bArr);
            aihfVarCreateBuilder.copyOnWrite();
            amaw amawVar8 = (amaw) aihfVarCreateBuilder.instance;
            aigjVarV.getClass();
            amawVar8.b |= SemanticState.Focused;
            amawVar8.j = aigjVarV;
        }
        String str8 = this.H;
        if (!TextUtils.isEmpty(str8)) {
            aihf aihfVarCreateBuilder3 = ajuh.a.createBuilder();
            aihfVarCreateBuilder3.copyOnWrite();
            ajuh ajuhVar = (ajuh) aihfVarCreateBuilder3.instance;
            ajuhVar.b |= 1;
            ajuhVar.c = str8;
            aihfVarCreateBuilder.copyOnWrite();
            amaw amawVar9 = (amaw) aihfVarCreateBuilder.instance;
            ajuh ajuhVar2 = (ajuh) aihfVarCreateBuilder3.build();
            ajuhVar2.getClass();
            amawVar9.l = ajuhVar2;
            amawVar9.b |= SemanticState.LiveRegion;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        amaw amawVar = (amaw) a().build();
        int i = amawVar.b;
        boolean z = false;
        int iM = afxw.M((i & 8) != 0, (i & 16) != 0);
        if (iM == 1 || (iM == 0 && !amawVar.h.isEmpty())) {
            z = true;
        }
        ahno.P(z, "More than one params field or none set. ");
    }

    public final void e(String str) {
        this.e = j(str);
    }
}
