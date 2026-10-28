package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abjr extends abja {
    private final abjq a = new abjq(this);
    private final int[] b;
    private abjl c;

    public abjr() {
        int[] iArr = abjl.F;
        this.b = new int[3];
    }

    public final synchronized int a(int i, int i2) {
        return this.b[i] + i2;
    }

    @Override // defpackage.tbk
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.tbk
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.tbk
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized abke get(int i) {
        int[] iArr;
        if (this.c != null) {
            int[] iArr2 = abjl.F;
            int i2 = iArr2[0];
            char c = 1;
            while (true) {
                iArr = this.b;
                if (c <= 0) {
                    break;
                }
                if (i >= iArr[1]) {
                    i2 = iArr2[1];
                }
                c = 0;
            }
            int i3 = i - iArr[i2];
            if (i3 < this.c.hc(i2)) {
                return this.c.O(i2, i3);
            }
        }
        return null;
    }

    public final synchronized void c(abjl abjlVar) {
        abjl abjlVar2 = this.c;
        if (abjlVar2 != abjlVar) {
            if (abjlVar2 != null) {
                abjq abjqVar = this.a;
                abjlVar2.hj(abjqVar);
                int size = size();
                if (size > 0) {
                    abjqVar.e(0, size);
                }
            }
            this.c = abjlVar;
            d();
            if (this.c != null) {
                int size2 = size();
                if (size2 > 0) {
                    this.a.d(0, size2);
                }
                this.c.he(this.a);
            }
        }
    }

    @Override // defpackage.tbk
    public final void clear() {
        throw null;
    }

    public final synchronized void d() {
        int[] iArr = abjl.F;
        int iHc = 0;
        for (int i = 0; i < 2; i++) {
            int i2 = iArr[i];
            abjl abjlVar = this.c;
            iHc += abjlVar != null ? abjlVar.hc(i2) : 0;
            this.b[i2 + 1] = iHc;
        }
    }

    @Override // defpackage.tbk
    public final void hK(tbj tbjVar) {
        this.a.a.add(tbjVar);
    }

    @Override // defpackage.tbk
    public final synchronized int indexOf(Object obj) {
        throw null;
    }

    @Override // defpackage.tbk
    public final void j(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.tbk
    public final void n(tbj tbjVar) {
        this.a.a.remove(tbjVar);
    }

    @Override // defpackage.tbk
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.tbk
    public final synchronized int size() {
        int[] iArr = abjl.F;
        return this.b[2];
    }

    @Override // defpackage.tbk
    public final synchronized List subList(int i, int i2) {
        List listUnmodifiableList;
        int size = size();
        if (this.c == null || i >= i2 || !tym.C(i, size) || !tym.B(i2, 0, size)) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(i2 - i);
            while (i < i2) {
                arrayList.add(get(i));
                i++;
            }
            listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        return listUnmodifiableList;
    }
}
