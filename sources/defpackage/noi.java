package defpackage;

import java.util.ArrayList;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class noi extends mew implements Cnew {
    ArrayList d;

    final void aR() {
        if (this.d == null) {
            this.d = bC(true != a ? 20 : 24);
        }
    }

    @Override // defpackage.Cnew
    public final float g() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    @Override // defpackage.Cnew
    public final float h(int i) {
        aR();
        return ((Float) this.d.get(i)).floatValue();
    }

    @Override // defpackage.Cnew
    public final int i() {
        aR();
        return this.d.size();
    }

    @Override // defpackage.Cnew
    public final int j() {
        int iAX = a.aX(Memory.peekInt(this.c + 16, false));
        if (iAX == 0) {
            return 1;
        }
        return iAX;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
