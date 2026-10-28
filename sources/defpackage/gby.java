package defpackage;

import app.rive.semantics.SemanticState;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gby extends gcr {
    private final gbh h;

    public gby(gbg gbgVar, fxg fxgVar, int i, gbh gbhVar) {
        super(gbgVar, "Gb3W2hoiG3tKJxNU/09qcc++TL7rePH8jkE20Q4q8tbXyJ2F4pSz0I8NYImfztCQ", "xj7z5QjT4e10J5XA07ZLu+7EoHfaFrLik/EDM4lZxFE=", fxgVar, i, 85);
        this.h = gbhVar;
    }

    @Override // defpackage.gcr
    protected final void a() {
        Method method = this.e;
        gbh gbhVar = this.h;
        long[] jArr = (long[]) method.invoke(null, Long.valueOf(gbhVar.c), Long.valueOf(gbhVar.d), Long.valueOf(gbhVar.e), Long.valueOf(gbhVar.f));
        fxg fxgVar = this.d;
        synchronized (fxgVar) {
            long j = jArr[0];
            fxgVar.copyOnWrite();
            fxl fxlVar = (fxl) fxgVar.instance;
            fxl fxlVar2 = fxl.a;
            fxlVar.d |= SemanticState.Multiline;
            fxlVar.ag = j;
            long j2 = jArr[1];
            fxgVar.copyOnWrite();
            fxl fxlVar3 = (fxl) fxgVar.instance;
            fxlVar3.d |= 16384;
            fxlVar3.ah = j2;
        }
    }
}
