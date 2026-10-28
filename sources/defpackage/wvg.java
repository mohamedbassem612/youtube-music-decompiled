package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wvg extends wlu {
    private String D;
    public String a;
    public String b;
    public long c;
    public aqoy d;
    public aihf e;

    public wvg(abxv abxvVar, zwa zwaVar) {
        super("ypc/get_cart", abxvVar, zwaVar, 1, false, null, null);
        this.a = "";
        this.b = "";
        this.D = "";
    }

    public final void F(String str) {
        this.D = j(str);
    }

    @Override // defpackage.wlu
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final aihf a() {
        aihf aihfVarCreateBuilder = amay.a.createBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            aihfVarCreateBuilder.copyOnWrite();
            amay amayVar = (amay) aihfVarCreateBuilder.instance;
            str.getClass();
            amayVar.b |= 2;
            amayVar.d = str;
        } else if (!TextUtils.isEmpty(this.b)) {
            long j = this.c;
            aihfVarCreateBuilder.copyOnWrite();
            amay amayVar2 = (amay) aihfVarCreateBuilder.instance;
            amayVar2.b |= 4;
            amayVar2.e = j;
            String str2 = this.b;
            aihfVarCreateBuilder.copyOnWrite();
            amay amayVar3 = (amay) aihfVarCreateBuilder.instance;
            str2.getClass();
            amayVar3.b |= 8;
            amayVar3.f = str2;
        }
        aihf aihfVar = this.e;
        if (aihfVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            amay amayVar4 = (amay) aihfVarCreateBuilder.instance;
            ajnr ajnrVar = (ajnr) aihfVar.build();
            ajnrVar.getClass();
            amayVar4.g = ajnrVar;
            amayVar4.b |= 32;
        }
        aqoy aqoyVar = this.d;
        if (aqoyVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            amay amayVar5 = (amay) aihfVarCreateBuilder.instance;
            amayVar5.h = aqoyVar;
            amayVar5.b |= 64;
        }
        if (!TextUtils.isEmpty(this.D)) {
            String str3 = this.D;
            aihfVarCreateBuilder.copyOnWrite();
            amay amayVar6 = (amay) aihfVarCreateBuilder.instance;
            str3.getClass();
            amayVar6.b |= SemanticState.Focused;
            amayVar6.i = str3;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        int i = ((amay) a().build()).b;
        int i2 = i & 16;
        int i3 = i & 8;
        int i4 = i & 2;
        if ((i & 32) != 0) {
            ahno.O(afxw.M(i4 != 0, i3 != 0, i2 != 0) == 0);
        } else {
            ahno.O(afxw.M(i4 != 0, i3 != 0, i2 != 0, (i & SemanticState.Focused) != 0) == 1);
        }
    }

    public final void e(byte[] bArr) {
        aihf aihfVarCreateBuilder = this.e;
        if (aihfVarCreateBuilder == null) {
            aihfVarCreateBuilder = ajnr.a.createBuilder();
            this.e = aihfVarCreateBuilder;
        }
        aigj aigjVarV = aigj.v(bArr);
        aihfVarCreateBuilder.copyOnWrite();
        ajnr ajnrVar = (ajnr) aihfVarCreateBuilder.instance;
        ajnr ajnrVar2 = ajnr.a;
        aigjVarV.getClass();
        ajnrVar.b |= 1;
        ajnrVar.e = aigjVarV;
    }
}
