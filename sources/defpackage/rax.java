package defpackage;

import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rax extends rar {
    private final Function d;

    public rax(qup qupVar, int i, raq raqVar) {
        super(qupVar, i, raqVar);
        this.d = new raw(this);
    }

    @Override // defpackage.rar
    protected final atqv a(qup qupVar) {
        atrx atrxVar = (atrx) this.d.apply((quy) qupVar.b);
        aihf aihfVarCreateBuilder = atqv.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        atqv atqvVar = (atqv) aihfVarCreateBuilder.instance;
        atrxVar.getClass();
        atqvVar.c = atrxVar;
        atqvVar.b = 1;
        return (atqv) aihfVarCreateBuilder.build();
    }
}
