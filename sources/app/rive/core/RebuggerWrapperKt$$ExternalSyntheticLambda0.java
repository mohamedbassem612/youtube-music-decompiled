package app.rive.core;

import defpackage.ahk;
import defpackage.awqk;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RebuggerWrapperKt$$ExternalSyntheticLambda0 implements awqk {
    public /* synthetic */ Map f$0;
    public /* synthetic */ int f$1;

    public /* synthetic */ RebuggerWrapperKt$$ExternalSyntheticLambda0(Map map, int i) {
        this.f$0 = map;
        this.f$1 = i;
    }

    @Override // defpackage.awqk
    public final Object invoke(Object obj, Object obj2) {
        return RebuggerWrapperKt.RebuggerWrapper$lambda$0(this.f$0, this.f$1, (ahk) obj, ((Integer) obj2).intValue());
    }
}
