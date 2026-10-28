package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nlh extends mew implements nbv {
    public nlh() {
        super(nlg.a);
    }

    @Override // defpackage.nbv
    public final int g() {
        return Memory.peekInt(this.c + 12, false);
    }
}
