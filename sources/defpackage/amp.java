package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class amp {
    public final int a;

    public amp(kax kaxVar) {
        this.a = kaxVar.e;
    }

    public final boolean a(int i) {
        return (this.a & i) == i;
    }

    public final boolean b() {
        return !(!a(32) || a(64) || a(SemanticState.Focused)) || a(64);
    }

    public amp(int i, byte[] bArr, short[] sArr) {
        this.a = i;
    }

    public amp(int i) {
        this.a = i;
    }
}
