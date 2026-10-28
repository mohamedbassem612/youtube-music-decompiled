package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awtf implements Iterator, awrp {
    private final CharSequence a;
    private int b;
    private int c;
    private int d;
    private int e;

    public awtf(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.b;
        if (i3 == 0) {
            if (this.e < 0) {
                this.b = 2;
                return false;
            }
            CharSequence charSequence = this.a;
            int length = charSequence.length();
            int i4 = this.c;
            int length2 = charSequence.length();
            while (true) {
                if (i4 >= length2) {
                    i = -1;
                    break;
                }
                char cCharAt = charSequence.charAt(i4);
                if (cCharAt == '\n' || cCharAt == '\r') {
                    i = (cCharAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                    length = i4;
                    break;
                }
                i4++;
            }
            this.b = 1;
            this.e = i;
            this.d = length;
        } else if (i3 != 1) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = 0;
        int i = this.d;
        int i2 = this.c;
        this.c = this.e + i;
        return this.a.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.aw();
    }
}
