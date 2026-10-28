package defpackage;

import com.youtube.android.libraries.elements.StatusOr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class addv extends mhp {
    private final vyo a;

    public addv(vyo vyoVar) {
        this.a = vyoVar;
    }

    @Override // defpackage.mhp
    public final aigw a() {
        return aldq.b;
    }

    @Override // com.google.android.libraries.elements.interfaces.JSFunctionBinding
    public final StatusOr execute(byte[] bArr) {
        aihf aihfVarCreateBuilder = aldr.a.createBuilder();
        apmr apmrVar = this.a.b().w;
        if (apmrVar == null) {
            apmrVar = apmr.a;
        }
        aihfVarCreateBuilder.copyOnWrite();
        aldr aldrVar = (aldr) aihfVarCreateBuilder.instance;
        apmrVar.getClass();
        aldrVar.c = apmrVar;
        aldrVar.b |= 1;
        return StatusOr.fromValue(((aldr) aihfVarCreateBuilder.build()).toByteArray());
    }
}
