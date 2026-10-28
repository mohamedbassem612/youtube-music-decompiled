package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class axas implements axap {
    private final long a = 5000;
    private final long b = Long.MAX_VALUE;

    public final boolean equals(Object obj) {
        if (!(obj instanceof axas)) {
            return false;
        }
        axas axasVar = (axas) obj;
        long j = axasVar.a;
        long j2 = axasVar.b;
        return true;
    }

    public final int hashCode() {
        return (avkz.o(5000L) * 31) + avkz.o(Long.MAX_VALUE);
    }

    public final String toString() {
        awoa awoaVar = new awoa(2);
        awoaVar.add("stopTimeout=5000ms");
        return "SharingStarted.WhileSubscribed(" + atqq.aD(awoaVar.f(), null, null, null, null, 63) + ')';
    }
}
