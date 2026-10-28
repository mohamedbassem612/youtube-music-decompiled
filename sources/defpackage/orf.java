package defpackage;

import com.google.android.libraries.elements.interfaces.DataSourceDelegate;
import com.youtube.android.libraries.elements.StatusOr;
import io.grpc.Status;
import java.util.ArrayList;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class orf extends DataSourceDelegate implements avmn {
    public final org a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final mew e;
    public final mew f;
    public final mew g;
    private final DataSourceDelegate h;
    private boolean i;

    /* JADX WARN: Code duplicated, block: B:21:0x0073  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f9  */
    public orf(DataSourceDelegate dataSourceDelegate, org orgVar, agev agevVar, agev agevVar2, agev agevVar3) {
        mew mewVar;
        mew mewVar2;
        this.h = dataSourceDelegate;
        this.a = orgVar;
        this.b = agevVar.g() ? Memory.peekInt(((atkv) agevVar.c()).c + 12, false) : -1;
        mew mewVar3 = null;
        if (agevVar.g()) {
            Object objC = agevVar.c();
            if (((atkv) objC).d == null && (Memory.peekByte(((mew) objC).c + 8) & 2) == 0) {
                mewVar = null;
            } else {
                Object objC2 = agevVar.c();
                atkv atkvVar = (atkv) objC2;
                if (atkvVar.d == null) {
                    mew mewVar4 = (mew) objC2;
                    if ((Memory.peekByte(mewVar4.c + 8) & 2) != 0) {
                        atkvVar.d = new mew(mewVar4.cp(16, atcm.a));
                    }
                }
                mewVar = atkvVar.d == null ? atcl.a : atkvVar.d;
            }
        } else {
            mewVar = null;
        }
        this.g = mewVar;
        this.c = (!agevVar2.g() || (Memory.peekByte(((mew) agevVar2.c()).c + 8) & 1) == 0 || Memory.peekByte(((atfc) agevVar2.c()).c + 9) == 0) ? false : true;
        if (agevVar2.g()) {
            Object objC3 = agevVar2.c();
            if (((atfc) objC3).d == null && (Memory.peekByte(((mew) objC3).c + 8) & 2) == 0) {
                mewVar2 = null;
            } else {
                Object objC4 = agevVar2.c();
                atfc atfcVar = (atfc) objC4;
                if (atfcVar.d == null) {
                    mew mewVar5 = (mew) objC4;
                    if ((Memory.peekByte(mewVar5.c + 8) & 2) != 0) {
                        atfcVar.d = new mew(mewVar5.cp(true != atfc.a ? 12 : 16, atcm.a));
                    }
                }
                mewVar2 = atfcVar.d == null ? atcl.a : atfcVar.d;
            }
        } else {
            mewVar2 = null;
        }
        this.e = mewVar2;
        this.d = agevVar3.g() && Memory.peekByte(((atla) agevVar3.c()).c + 9) != 0;
        if (agevVar3.g()) {
            Object objC5 = agevVar3.c();
            if (((atla) objC5).d != null || (Memory.peekByte(((mew) objC5).c + 8) & 2) != 0) {
                Object objC6 = agevVar3.c();
                atla atlaVar = (atla) objC6;
                if (atlaVar.d == null) {
                    mew mewVar6 = (mew) objC6;
                    if ((Memory.peekByte(mewVar6.c + 8) & 2) != 0) {
                        atlaVar.d = new mew(mewVar6.cp(true != atla.a ? 12 : 16, atcm.a));
                    }
                }
                mewVar3 = atlaVar.d == null ? atcl.a : atlaVar.d;
            }
        }
        this.f = mewVar3;
        this.i = false;
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public final void dispose() {
        this.i = true;
        this.a.a.clear();
        this.h.dispose();
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    @Deprecated
    public final StatusOr elementAtIndex(int i) {
        throw new UnsupportedOperationException("Use elementBytesByKey instead.");
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public final StatusOr elementBytesAtIndex(int i) {
        throw new UnsupportedOperationException("Use elementBytesByKey instead.");
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public final StatusOr elementBytesByKey(String str) {
        return this.h.elementBytesByKey(str);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.i;
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public final ArrayList identifiers() {
        return this.h.identifiers();
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public final Status loadMore() {
        return this.h.loadMore();
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public final Status moveItem(int i, int i2) {
        return this.h.moveItem(i, i2);
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public final Status reload() {
        return this.h.reload();
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public final Status removeItem(int i) {
        return this.h.removeItem(i);
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public final int size() {
        return this.h.size();
    }
}
