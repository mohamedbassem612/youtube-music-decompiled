package defpackage;

import com.youtube.android.libraries.elements.StatusOr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class addu extends mhp {
    private final vxu a;

    public addu(vxu vxuVar) {
        this.a = vxuVar;
    }

    @Override // defpackage.mhp
    public final aigw a() {
        return aldj.b;
    }

    @Override // com.google.android.libraries.elements.interfaces.JSFunctionBinding
    public final StatusOr execute(byte[] bArr) {
        aihf aihfVarCreateBuilder = aldk.a.createBuilder();
        apmq apmqVar = this.a.c().v;
        if (apmqVar == null) {
            apmqVar = apmq.a;
        }
        aihfVarCreateBuilder.copyOnWrite();
        aldk aldkVar = (aldk) aihfVarCreateBuilder.instance;
        apmqVar.getClass();
        aldkVar.c = apmqVar;
        aldkVar.b |= 1;
        return StatusOr.fromValue(((aldk) aihfVarCreateBuilder.build()).toByteArray());
    }
}
