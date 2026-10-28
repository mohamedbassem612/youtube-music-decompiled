package defpackage;

import app.rive.semantics.SemanticState;
import java.security.Key;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ynu extends ygn {
    public boolean a;
    private final agfr b;
    private final Key c;
    private final zho d;
    private final vyo e;
    private final zjr f;

    public ynu(agfr agfrVar, Key key, zho zhoVar, vyo vyoVar, zjr zjrVar) {
        agfrVar.getClass();
        this.b = agfrVar;
        this.c = key;
        this.d = zhoVar;
        vyoVar.getClass();
        this.e = vyoVar;
        this.f = zjrVar;
    }

    @Override // defpackage.ygn
    public final bye a(bye byeVar, List list) {
        zjr zjrVar = this.f;
        jsk jskVar = (!zjrVar.aF() || list.isEmpty()) ? (jsk) this.b.io() : (jsk) list.get(0);
        if (jskVar == null) {
            return byeVar;
        }
        anew anewVar = this.e.b().j;
        if (anewVar == null) {
            anewVar = anew.a;
        }
        akwk akwkVar = anewVar.b;
        if (akwkVar == null) {
            akwkVar = akwk.a;
        }
        Key key = this.c;
        return new jsn(jskVar, byeVar, new bxs(key.getEncoded(), new jsx("Cache")), new bxr(key.getEncoded(), new jsm(jskVar, akwkVar.b, zjrVar), new byte[SemanticState.Obscured]), (true == this.a ? 8 : 0) | 6, this.d);
    }
}
