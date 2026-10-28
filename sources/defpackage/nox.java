package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nox extends mew implements nfl {
    public nox() {
        super(now.a);
    }

    @Override // defpackage.nfl
    public final float g() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    @Override // defpackage.nfl
    public final float h() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 16, false));
    }
}
