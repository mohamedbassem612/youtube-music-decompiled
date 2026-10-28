package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aijd implements Iterator {
    private final ArrayDeque a;
    private aigg b;

    public aijd(aigj aigjVar) {
        if (!(aigjVar instanceof aijf)) {
            this.a = null;
            this.b = (aigg) aigjVar;
            return;
        }
        aijf aijfVar = (aijf) aigjVar;
        ArrayDeque arrayDeque = new ArrayDeque(aijfVar.f);
        this.a = arrayDeque;
        arrayDeque.push(aijfVar);
        this.b = b(aijfVar.c);
    }

    private final aigg b(aigj aigjVar) {
        while (aigjVar instanceof aijf) {
            aijf aijfVar = (aijf) aigjVar;
            this.a.push(aijfVar);
            int[] iArr = aijf.a;
            aigjVar = aijfVar.c;
        }
        return (aigg) aigjVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aigg next() {
        aigg aiggVarB;
        aigg aiggVar = this.b;
        if (aiggVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.a;
            aiggVarB = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            aijf aijfVar = (aijf) arrayDeque.pop();
            int[] iArr = aijf.a;
            aiggVarB = b(aijfVar.e);
        } while (aiggVarB.E());
        this.b = aiggVarB;
        return aiggVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
