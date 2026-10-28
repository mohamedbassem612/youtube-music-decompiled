package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awtv extends awwg {
    public awvk a;
    public final awtr b = new awtr(null, awts.a);
    final /* synthetic */ axoz c;
    private final awuc g;

    public awtv(axoz axozVar, awuc awucVar) {
        this.c = axozVar;
        this.g = awucVar;
    }

    @Override // defpackage.awwg
    public final void a(Throwable th) {
        if (th != null) {
            awuc awucVar = this.g;
            axdy axdyVarD = ((awud) awucVar).D(new awum(th, false), null);
            if (axdyVarD != null) {
                awucVar.a(axdyVarD);
                awtw awtwVar = (awtw) this.b.a;
                if (awtwVar != null) {
                    awtwVar.a();
                    return;
                }
                return;
            }
            return;
        }
        axoz axozVar = this.c;
        if (((awtp) axozVar.a).a() == 0) {
            awuc awucVar2 = this.g;
            awuz[] awuzVarArr = (awuz[]) axozVar.b;
            ArrayList arrayList = new ArrayList(awuzVarArr.length);
            for (awuz awuzVar : awuzVarArr) {
                arrayList.add(awuzVar.f());
            }
            awucVar2.resumeWith(arrayList);
        }
    }

    @Override // defpackage.awwg
    public final boolean b() {
        return false;
    }
}
