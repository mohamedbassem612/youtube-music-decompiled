package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class odc extends odl {
    private final oaq a;

    public odc(fxg fxgVar, ocu ocuVar, oaq oaqVar, omj omjVar) {
        super("1M4+hxwujOoOvrpbv36I0eEIxunNoofYm52entdtD2srJEuq03lWB21y7tOqma6M", "Gzh3mJDMDDQeA5KLWRGOz648iXOQVbAe3h9do204Oto=", fxgVar, ocuVar, omjVar.h(116));
        this.a = oaqVar;
    }

    @Override // defpackage.odl
    protected final void a(Method method, fxg fxgVar) {
        Object[] objArr = (Object[]) method.invoke("", this.a.g);
        objArr.getClass();
        synchronized (fxgVar) {
            String str = (String) objArr[0];
            fxgVar.copyOnWrite();
            fxl fxlVar = (fxl) fxgVar.instance;
            fxl fxlVar2 = fxl.a;
            str.getClass();
            fxlVar.b |= 2;
            fxlVar.g = str;
            String str2 = (String) objArr[1];
            fxgVar.copyOnWrite();
            fxl fxlVar3 = (fxl) fxgVar.instance;
            str2.getClass();
            fxlVar3.d |= 262144;
            fxlVar3.ai = str2;
        }
    }
}
