package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abjt extends abja {
    private final int a;
    private final abjs b;
    private abjl c;

    public abjt(int i) {
        this.a = i;
        this.b = new abjs(i);
    }

    @Override // defpackage.tbk
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized abke get(int i) {
        abjl abjlVar = this.c;
        if (abjlVar == null) {
            return null;
        }
        return abjlVar.O(this.a, i);
    }

    @Override // defpackage.tbk
    public final synchronized boolean addAll(int i, Collection collection) {
        if (this.c == null) {
            return false;
        }
        int size = size();
        this.c.ha(this.a, i, collection);
        return size != size();
    }

    @Override // defpackage.tbk
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized abke remove(int i) {
        abjl abjlVar = this.c;
        if (abjlVar == null) {
            return null;
        }
        int i2 = this.a;
        abke abkeVarO = abjlVar.O(i2, i);
        this.c.hi(i2, i, 1);
        return abkeVarO;
    }

    @Override // defpackage.tbk
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized void add(int i, abke abkeVar) {
        abjl abjlVar = this.c;
        if (abjlVar != null) {
            abjlVar.ha(this.a, i, Collections.singletonList(abkeVar));
        }
    }

    @Override // defpackage.tbk
    public final synchronized void clear() {
        throw null;
    }

    public final synchronized void d(abjl abjlVar) {
        abjl abjlVar2 = this.c;
        if (abjlVar2 != abjlVar) {
            if (abjlVar2 != null) {
                abjs abjsVar = this.b;
                abjlVar2.hj(abjsVar);
                int size = size();
                if (size > 0) {
                    abjsVar.c(this.a, 0, size);
                }
            }
            this.c = abjlVar;
            if (abjlVar != null) {
                if (size() > 0) {
                    this.b.a(this.a, 0, size());
                }
                this.c.he(this.b);
            }
        }
    }

    @Override // defpackage.tbk
    public final void hK(tbj tbjVar) {
        this.b.a.add(tbjVar);
    }

    @Override // defpackage.tbk
    public final synchronized int indexOf(Object obj) {
        throw null;
    }

    @Override // defpackage.tbk
    public final synchronized void j(int i, int i2) {
        abjl abjlVar = this.c;
        if (abjlVar != null) {
            int i3 = this.a;
            abjlVar.hh(i3, i, i3, i2);
        }
    }

    @Override // defpackage.tbk
    public final void n(tbj tbjVar) {
        this.b.a.remove(tbjVar);
    }

    @Override // defpackage.tbk
    public final synchronized int size() {
        abjl abjlVar = this.c;
        if (abjlVar == null) {
            return 0;
        }
        return abjlVar.hc(this.a);
    }

    @Override // defpackage.tbk
    public final synchronized List subList(int i, int i2) {
        List listUnmodifiableList;
        int size = size();
        if (this.c == null || i >= i2 || i < 0 || i >= size || i2 < 0 || i2 > size) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(i2 - i);
            while (i < i2) {
                arrayList.add(this.c.O(this.a, i));
                i++;
            }
            listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        return listUnmodifiableList;
    }
}
