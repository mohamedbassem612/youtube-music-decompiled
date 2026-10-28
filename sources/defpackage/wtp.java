package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wtp extends wlu {
    public agev D;
    public agev E;
    public String a;
    public String b;
    public String c;
    public boolean d;
    public String e;

    public wtp(String str, abxv abxvVar, zwa zwaVar) {
        super(str, abxvVar, zwaVar, 1, true, null, null);
        agdf agdfVar = agdf.a;
        this.D = agdfVar;
        this.E = agdfVar;
        m();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alxf.a.createBuilder();
        String str = this.a;
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alxf alxfVar = (alxf) aihfVarCreateBuilder.instance;
            alxfVar.b |= 2;
            alxfVar.d = str;
        }
        boolean z = this.d;
        aihfVarCreateBuilder.copyOnWrite();
        alxf alxfVar2 = (alxf) aihfVarCreateBuilder.instance;
        alxfVar2.b |= 16;
        alxfVar2.g = z;
        if (!TextUtils.isEmpty(this.b)) {
            String str2 = this.b;
            aihfVarCreateBuilder.copyOnWrite();
            alxf alxfVar3 = (alxf) aihfVarCreateBuilder.instance;
            str2.getClass();
            alxfVar3.b |= 4;
            alxfVar3.e = str2;
        }
        if (!TextUtils.isEmpty(this.c)) {
            String str3 = this.c;
            aihfVarCreateBuilder.copyOnWrite();
            alxf alxfVar4 = (alxf) aihfVarCreateBuilder.instance;
            str3.getClass();
            alxfVar4.b |= 8;
            alxfVar4.f = str3;
        }
        if (!TextUtils.isEmpty(this.e)) {
            String str4 = this.e;
            aihfVarCreateBuilder.copyOnWrite();
            alxf alxfVar5 = (alxf) aihfVarCreateBuilder.instance;
            str4.getClass();
            alxfVar5.b |= 32;
            alxfVar5.h = str4;
        }
        if (this.D.g()) {
            Object objC = this.D.c();
            aihfVarCreateBuilder.copyOnWrite();
            alxf alxfVar6 = (alxf) aihfVarCreateBuilder.instance;
            alxfVar6.i = ((alxr) objC).i;
            alxfVar6.b |= SemanticState.Multiline;
        }
        if (this.E.g()) {
            Object objC2 = this.E.c();
            aihfVarCreateBuilder.copyOnWrite();
            alxf alxfVar7 = (alxf) aihfVarCreateBuilder.instance;
            alxfVar7.j = ((alxq) objC2).h;
            alxfVar7.b |= 16384;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        String str = this.a;
        str.getClass();
        if (this.d && !TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
    }
}
