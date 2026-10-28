package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aijc extends aigd {
    final aijd a;
    aigf b = b();
    final /* synthetic */ aijf c;

    public aijc(aijf aijfVar) {
        this.c = aijfVar;
        this.a = new aijd(aijfVar);
    }

    private final aigf b() {
        aijd aijdVar = this.a;
        if (aijdVar.hasNext()) {
            return aijdVar.next().iterator();
        }
        return null;
    }

    @Override // defpackage.aigf
    public final byte a() {
        aigf aigfVar = this.b;
        if (aigfVar == null) {
            throw new NoSuchElementException();
        }
        byte bA = aigfVar.a();
        if (!this.b.hasNext()) {
            this.b = b();
        }
        return bA;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }
}
