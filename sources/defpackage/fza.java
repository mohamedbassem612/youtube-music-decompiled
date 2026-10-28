package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fza implements Iterator {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    private int b = 0;

    public fza(fzb fzbVar, int i) {
        this.$cid = i;
        this.a = fzbVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.$cid;
        if (i == 0) {
            if (this.b >= ((fzb) this.a).a.length()) {
                return false;
            }
        } else if (i == 1) {
            bjv bjvVar = (bjv) this.a;
            bjvVar.c();
            if (this.b + 1 >= bjvVar.b) {
                return false;
            }
        } else if (i != 2) {
            Object obj = this.a;
            if (i != 3) {
                axri axriVar = (axri) obj;
                axriVar.c();
                if (this.b + 1 >= axriVar.b) {
                    return false;
                }
            } else {
                lzd lzdVar = (lzd) obj;
                lzdVar.c();
                if (this.b + 1 >= lzdVar.b) {
                    return false;
                }
            }
        } else {
            if (this.b >= ((fzb) this.a).a.length()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i = this.$cid;
        if (i == 0) {
            String str = ((fzb) this.a).a;
            int i2 = this.b;
            if (i2 >= str.length()) {
                throw new NoSuchElementException();
            }
            this.b = i2 + 1;
            return new fzb(String.valueOf(i2));
        }
        if (i == 1) {
            bjv bjvVar = (bjv) this.a;
            bjvVar.c();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object[] objArr = bjvVar.a;
            int i3 = this.b + 1;
            this.b = i3;
            return (lzb) objArr[i3];
        }
        if (i == 2) {
            String str2 = ((fzb) this.a).a;
            int i4 = this.b;
            if (i4 >= str2.length()) {
                throw new NoSuchElementException();
            }
            this.b = i4 + 1;
            return new fzb(String.valueOf(str2.charAt(i4)));
        }
        Object obj = this.a;
        if (i != 3) {
            axri axriVar = (axri) obj;
            axriVar.c();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object[] objArr2 = axriVar.a;
            int i5 = this.b + 1;
            this.b = i5;
            return (axrg) objArr2[i5];
        }
        lzd lzdVar = (lzd) obj;
        lzdVar.c();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr3 = lzdVar.a;
        int i6 = this.b + 1;
        this.b = i6;
        return (lzb) objArr3[i6];
    }

    public fza(AbstractMap abstractMap, int i) {
        this.$cid = i;
        this.a = abstractMap;
    }
}
