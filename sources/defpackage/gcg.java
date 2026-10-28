package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gcg extends gcr {
    public gcg(gbg gbgVar, fxg fxgVar, int i) {
        super(gbgVar, "dyWP/GotGQ50CtnuUccpMloulQGKCs5xVHjd33wdC8zZadAnyFM4isgzL1zVO0RY", "q9NroT+VB8UNCM638RFtokd2xAaNlSDTXsPFtklSztg=", fxgVar, i, 3);
    }

    @Override // defpackage.gcr
    protected final void a() {
        Boolean bool = (Boolean) jwp.q.d();
        bool.booleanValue();
        gaw gawVar = new gaw((String) this.e.invoke(null, this.a.a, bool));
        fxg fxgVar = this.d;
        synchronized (fxgVar) {
            long j = gawVar.a;
            fxgVar.copyOnWrite();
            fxl fxlVar = (fxl) fxgVar.instance;
            fxl fxlVar2 = fxl.a;
            fxlVar.b |= 4;
            fxlVar.h = j;
            long j2 = gawVar.b;
            fxgVar.copyOnWrite();
            fxl fxlVar3 = (fxl) fxgVar.instance;
            fxlVar3.c |= 4194304;
            fxlVar3.V = j2;
        }
    }
}
