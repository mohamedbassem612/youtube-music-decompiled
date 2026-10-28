package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wuh extends wlu {
    public String a;
    public String b;
    public byte[] c;
    public aqzz d;

    public wuh(abxv abxvVar, zwa zwaVar) {
        super("updated_metadata", abxvVar, zwaVar, 1, true, null, null);
        o(vzh.b);
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alzb.a.createBuilder();
        String strJ = j(this.a);
        aihfVarCreateBuilder.copyOnWrite();
        alzb alzbVar = (alzb) aihfVarCreateBuilder.instance;
        alzbVar.b |= 4;
        alzbVar.e = strJ;
        aigj aigjVarV = aigj.v(y(this.c));
        aihfVarCreateBuilder.copyOnWrite();
        alzb alzbVar2 = (alzb) aihfVarCreateBuilder.instance;
        aigjVarV.getClass();
        alzbVar2.b |= SemanticState.LiveRegion;
        alzbVar2.g = aigjVarV;
        String strJ2 = j(this.b);
        aihfVarCreateBuilder.copyOnWrite();
        alzb alzbVar3 = (alzb) aihfVarCreateBuilder.instance;
        alzbVar3.b |= 2;
        alzbVar3.d = strJ2;
        aqzz aqzzVar = this.d;
        if (aqzzVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alzb alzbVar4 = (alzb) aihfVarCreateBuilder.instance;
            alzbVar4.f = aqzzVar;
            alzbVar4.b |= 8;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        if (!TextUtils.isEmpty(this.b)) {
            ahno.O(TextUtils.isEmpty(this.a));
        }
        if (TextUtils.isEmpty(this.a)) {
            return;
        }
        ahno.O(TextUtils.isEmpty(this.b));
    }
}
