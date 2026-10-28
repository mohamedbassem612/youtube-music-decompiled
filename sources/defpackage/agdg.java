package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class agdg implements Iterator {
    final CharSequence b;
    final agdw c;
    final boolean d;
    int f;
    private Object g;
    public int a = 2;
    int e = 0;

    public agdg(agfm agfmVar, CharSequence charSequence) {
        this.c = (agdw) agfmVar.c;
        this.d = agfmVar.a;
        this.f = agfmVar.b;
        this.b = charSequence;
    }

    public abstract int a(int i);

    public abstract int b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int iA;
        int i = this.a;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int i2 = i - 1;
        String string = null;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.a = 4;
            int i3 = this.e;
            while (true) {
                int i4 = this.e;
                if (i4 == -1) {
                    this.a = 3;
                    break;
                }
                int iB = b(i4);
                if (iB == -1) {
                    iB = this.b.length();
                    this.e = -1;
                    iA = -1;
                } else {
                    iA = a(iB);
                    this.e = iA;
                }
                if (iA == i3) {
                    int i5 = iA + 1;
                    this.e = i5;
                    if (i5 > this.b.length()) {
                        this.e = -1;
                    }
                } else {
                    while (i3 < iB && this.c.b(this.b.charAt(i3))) {
                        i3++;
                    }
                    while (iB > i3) {
                        int i6 = iB - 1;
                        if (!this.c.b(this.b.charAt(i6))) {
                            break;
                        }
                        iB = i6;
                    }
                    if (!this.d || i3 != iB) {
                        int i7 = this.f;
                        if (i7 == 1) {
                            CharSequence charSequence = this.b;
                            int length = charSequence.length();
                            this.e = -1;
                            while (length > i3) {
                                int i8 = length - 1;
                                if (!this.c.b(charSequence.charAt(i8))) {
                                    break;
                                }
                                length = i8;
                            }
                            iB = length;
                        } else {
                            this.f = i7 - 1;
                        }
                        string = this.b.subSequence(i3, iB).toString();
                        break;
                    }
                    i3 = this.e;
                }
            }
            this.g = string;
            if (this.a != 3) {
                this.a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = 2;
        Object obj = this.g;
        this.g = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
