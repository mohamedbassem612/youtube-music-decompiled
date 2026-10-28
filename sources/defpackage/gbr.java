package defpackage;

import android.content.Context;
import android.util.Base64;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gbr extends gcr {
    private static final dov i = new dov((byte[]) null, (char[]) null);
    private final Context h;

    public gbr(gbg gbgVar, fxg fxgVar, int i2, Context context) {
        super(gbgVar, "ovPc3T/5VNpmA+0oXh63zHYLo4ZMQbnpcqhblofkZgwJFS2pcgg2Bx2KuOvr4t4y", "WFNyUjQYUEiy0O1vWb+ZGO6heO91FiW7jakAv4LCbas=", fxgVar, i2, 29);
        this.h = context;
    }

    @Override // defpackage.gcr
    protected final void a() {
        fxg fxgVar = this.d;
        fxgVar.copyOnWrite();
        fxl fxlVar = (fxl) fxgVar.instance;
        fxl fxlVar2 = fxl.a;
        fxlVar.b |= 16777216;
        fxlVar.u = "E";
        dov dovVar = i;
        Context context = this.h;
        AtomicReference atomicReferenceW = dovVar.w(context.getPackageName());
        if (atomicReferenceW.get() == null) {
            synchronized (atomicReferenceW) {
                if (atomicReferenceW.get() == null) {
                    atomicReferenceW.set((String) this.e.invoke(null, context));
                }
            }
        }
        String str = (String) atomicReferenceW.get();
        fxg fxgVar2 = this.d;
        synchronized (fxgVar2) {
            String strEncodeToString = Base64.encodeToString(str.getBytes(), 11);
            fxgVar2.copyOnWrite();
            fxl fxlVar3 = (fxl) fxgVar2.instance;
            strEncodeToString.getClass();
            fxlVar3.b |= 16777216;
            fxlVar3.u = strEncodeToString;
        }
    }
}
