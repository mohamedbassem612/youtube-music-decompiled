package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import app.rive.semantics.SemanticState;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sgt extends slc {
    public final boolean b;
    public final smc c;
    private final aiwa d;
    private final int e;
    private final int f;
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/ads/model/AdVideoEnd");
    public static final Parcelable.Creator CREATOR = new pyc(8);

    public sgt(smc smcVar, String str, boolean z) {
        super(smcVar.i, smcVar.j, smcVar.k, smcVar.l, smcVar.m, smcVar.n, str, smcVar.q);
        aiwa aiwaVarD = smcVar.d();
        aiwaVarD.getClass();
        this.d = aiwaVarD;
        this.c = smcVar;
        this.e = smcVar instanceof skz ? z ? ((skz) smcVar).d + 1 : ((skz) smcVar).iJ() : 0;
        this.f = 0;
        smcVar.a();
        this.b = false;
    }

    @Override // defpackage.smc
    public final int a() {
        return 0;
    }

    @Override // defpackage.smc
    public final aiwa d() {
        return this.d;
    }

    @Override // defpackage.smc
    public final boolean equals(Object obj) {
        if (!(obj instanceof sgt)) {
            return false;
        }
        sgt sgtVar = (sgt) obj;
        return super.equals(sgtVar) && Objects.equals(this.d, sgtVar.d) && this.e == sgtVar.e;
    }

    @Override // defpackage.smc
    public final int iI() {
        int i = this.f;
        if (i == 0) {
            return 0;
        }
        return i;
    }

    @Override // defpackage.smc
    public final int iJ() {
        return this.e;
    }

    @Override // defpackage.smc
    public final aiua iL() {
        aiuc aiucVar;
        aiwa aiwaVar = this.d;
        if ((aiwaVar.b & SemanticState.Hidden) != 0) {
            aiucVar = aiwaVar.c;
            if (aiucVar == null) {
                aiucVar = aiuc.a;
            }
        } else {
            aiucVar = null;
        }
        if (aiucVar == null || (aiucVar.b & 4) == 0) {
            return null;
        }
        aiua aiuaVar = aiucVar.e;
        return aiuaVar == null ? aiua.a : aiuaVar;
    }

    @Override // defpackage.smc
    public final String j() {
        return "adVideoEnd";
    }

    @Override // defpackage.smc
    public final boolean l() {
        return this.d != null;
    }

    @Override // defpackage.smc, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        tym.u(this.d, parcel);
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.e);
    }

    public sgt(smc smcVar, String str, int i) {
        super(smcVar.i, smcVar.j, smcVar.k, smcVar.l, smcVar.m, smcVar.n, str, smcVar.q);
        aiwa aiwaVarD = smcVar.d();
        aiwaVarD.getClass();
        this.d = aiwaVarD;
        this.c = smcVar;
        this.f = i;
        this.e = 0;
        smcVar.a();
        this.b = false;
    }

    public sgt(aiwa aiwaVar, wjf wjfVar, String str, String str2, int i, smc smcVar, boolean z) {
        super(wjfVar.G(), wjfVar.ab(), null, str, wjfVar.R(), wjfVar.f(), str2, smcVar.q);
        this.c = smcVar;
        this.e = z ? ((skz) smcVar).d + 1 : smcVar.iJ();
        this.f = i;
        smcVar.a();
        this.d = aiwaVar;
        this.b = true;
    }

    public sgt(String str, byte[] bArr, String str2, String str3, boolean z, wiu wiuVar, String str4, aiwa aiwaVar, smc smcVar, int i) {
        super(str, bArr, str2, str3, z, wiuVar, str4, new sno(aivn.a));
        smcVar.getClass();
        this.c = smcVar;
        this.e = i;
        this.f = 0;
        smcVar.a();
        this.d = aiwaVar;
        this.b = false;
    }
}
