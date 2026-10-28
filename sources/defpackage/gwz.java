package defpackage;

import app.rive.semantics.SemanticState;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class gwz implements jkv {
    final /* synthetic */ apmb a;
    final /* synthetic */ Map b;
    final /* synthetic */ gxa c;

    public gwz(gxa gxaVar, apmb apmbVar, Map map) {
        this.a = apmbVar;
        this.b = map;
        this.c = gxaVar;
    }

    @Override // defpackage.jkv
    public final void a(String str, int i) {
        apmb apmbVar = this.a;
        int i2 = apmbVar.b & SemanticState.Focused;
        ajwo ajwoVar = apmbVar.l;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        this.c.d(i2 != 0, ajwoVar, this.b);
    }

    @Override // defpackage.jkv
    public final void b(String str, int i) {
        this.c.e(this.a, this.b);
    }
}
