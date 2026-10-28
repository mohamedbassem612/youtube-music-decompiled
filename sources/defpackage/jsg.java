package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jsg implements jse {
    private final Context a;

    public jsg(Context context) {
        this.a = context;
    }

    @Override // defpackage.jse
    public final kyr a(String str, jsa jsaVar, jsd jsdVar) {
        if (new jsa().equals(jsaVar)) {
            return new kyr(this.a, str, jsdVar);
        }
        throw new IllegalArgumentException("Only \"proto\" encoding is supported by firelog1p. Got: ".concat(jsaVar.toString()));
    }
}
