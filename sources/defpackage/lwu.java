package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lwu implements Iterator {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    private int b = 0;
    private final int c;

    public lwu(axpo axpoVar, int i) {
        this.$cid = i;
        this.a = axpoVar;
        this.c = axpoVar.b();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.$cid;
        if (i != 0) {
            int i2 = this.b;
            int i3 = this.c;
            if (i != 1) {
                if (i2 >= i3) {
                    return false;
                }
            } else if (i2 >= i3) {
                return false;
            }
        } else if (this.b >= this.c) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i = this.$cid;
        if (i == 0) {
            int i2 = this.b;
            if (i2 >= this.c) {
                throw new NoSuchElementException();
            }
            this.b = i2 + 1;
            return Byte.valueOf(((lxa) this.a).a(i2));
        }
        int i3 = this.b;
        if (i != 1) {
            if (i3 >= this.c) {
                throw new NoSuchElementException();
            }
            this.b = i3 + 1;
            return Byte.valueOf(((axpo) this.a).a(i3));
        }
        if (i3 >= this.c) {
            throw new NoSuchElementException();
        }
        this.b = i3 + 1;
        return Byte.valueOf(((bhy) this.a).a(i3));
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.$cid;
        if (i == 0) {
            throw new UnsupportedOperationException();
        }
        if (i == 1) {
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }

    public lwu(bhy bhyVar, int i) {
        this.$cid = i;
        this.a = bhyVar;
        this.c = bhyVar.b();
    }

    public lwu(lxa lxaVar, int i) {
        this.$cid = i;
        this.a = lxaVar;
        this.c = lxaVar.b();
    }
}
