package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bpj implements awmi {
    private final awsd a;
    private final Function0 b;
    private final Function0 c;
    private final Function0 d;
    private bpi e;

    public bpj(awsd awsdVar, Function0 function0, Function0 function1, Function0 function2) {
        this.a = awsdVar;
        this.b = function0;
        this.c = function1;
        this.d = function2;
    }

    @Override // defpackage.awmi
    public final /* bridge */ /* synthetic */ Object a() {
        bpi bpiVar = this.e;
        if (bpiVar != null) {
            return bpiVar;
        }
        bpo bpoVar = (bpo) this.b.invoke();
        bpl bplVar = (bpl) this.c.invoke();
        bpt bptVar = (bpt) this.d.invoke();
        bpoVar.getClass();
        bplVar.getClass();
        bptVar.getClass();
        bpi bpiVarB = new bpn(bpoVar, bplVar, bptVar).b(this.a);
        this.e = bpiVarB;
        return bpiVarB;
    }

    @Override // defpackage.awmi
    public final boolean b() {
        return this.e != null;
    }
}
