package defpackage;

import java.text.CharacterIterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class owh implements CharacterIterator {
    public CharSequence a;
    public int b;
    public int c;

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.c;
        if (i < 0 || i >= this.b) {
            return (char) 65535;
        }
        return this.a.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.c = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.b;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.c;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.b;
        if (i == 0) {
            this.c = 0;
            return (char) 65535;
        }
        this.c = i - 1;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.c;
        if (i < this.b) {
            this.c = i + 1;
        }
        return current();
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.c;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.c = i2;
        return this.a.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i < 0 || i > this.b) {
            throw new IllegalArgumentException(a.bR(i, "Invalid position: "));
        }
        this.c = i;
        return current();
    }
}
