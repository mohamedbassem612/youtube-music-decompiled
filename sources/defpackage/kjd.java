package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kjd extends kic {
    public kjd(kib kibVar, aigj aigjVar) {
        super(kibVar);
        aihh aihhVar = this.m;
        aihhVar.copyOnWrite();
        aulj auljVar = (aulj) aihhVar.instance;
        aulj auljVar2 = aulj.a;
        auljVar.b |= SemanticState.Modal;
        auljVar.f = aigjVar;
    }

    @Override // defpackage.kic
    public final kiw d() {
        aulj auljVar = (aulj) this.m.build();
        kib kibVar = this.a;
        kjw kjwVar = new kjw(kibVar.h, kib.a(kibVar.e), this.h, this.g, i(), kibVar.i);
        byte[] byteArray = auljVar.toByteArray();
        int[] iArrE = kib.e(null);
        ArrayList arrayList = this.c;
        String[] strArr = arrayList != null ? (String[]) arrayList.toArray(kib.b) : null;
        int[] iArrE2 = kib.e(this.d);
        ArrayList arrayList2 = this.e;
        lle[] lleVarArr = arrayList2 != null ? (lle[]) arrayList2.toArray(kib.a) : null;
        Set set = this.f;
        return new kiw(kjwVar, auljVar, byteArray, iArrE, strArr, iArrE2, lleVarArr, set != null ? (String[]) set.toArray(kib.b) : null, auljVar.e, null);
    }

    @Override // defpackage.kic
    public final lpa e() {
        throw null;
    }

    @Override // defpackage.kic
    public final ListenableFuture f(kid kidVar) {
        return ahng.n(kiz.c);
    }

    @Override // defpackage.kic
    public final /* bridge */ /* synthetic */ void h(double d) {
    }
}
